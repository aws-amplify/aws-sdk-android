/**
 * Copyright 2015-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.s3.transferutility;

import android.util.Log;
import com.amazonaws.AmazonClientException;
import com.amazonaws.mobileconnectors.s3.receiver.NetworkInfoReceiver;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.services.s3.util.Mimetypes;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

class UploadTask implements Callable<Boolean> {

    private final static String TAG = "UploadTask";

    private final AmazonS3 s3;
    private final TransferRecord upload;
    private final TransferDBUtil dbUtil;
    private final TransferStatusUpdater updater;
    private final NetworkInfoReceiver networkInfo;

    public UploadTask(TransferRecord uploadInfo, AmazonS3 s3, TransferDBUtil dbUtil,
            TransferStatusUpdater updater, NetworkInfoReceiver networkInfo) {
        this.upload = uploadInfo;
        this.s3 = s3;
        this.dbUtil = dbUtil;
        this.updater = updater;
        this.networkInfo = networkInfo;
    }

    /*
     * Runs upload task and returns whether successfully uploaded.
     */
    @Override
    public Boolean call() throws Exception {
        if (!networkInfo.isNetworkConnected()) {
            updater.updateState(upload.id, TransferState.WAITING_FOR_NETWORK);
            return false;
        }
        updater.updateState(upload.id, TransferState.IN_PROGRESS);
        if (upload.isMultipart == 1 && upload.partNumber == 0) {
            /*
             * If part number = 0, this multipart upload record is not a real
             * part upload task, it's a summary for all the parts with part
             * numbers from 1 to N. We now need to create records for all its
             * upload parts.
             */
            return uploadMultipartAndWaitForCompletion();
        } else if (upload.isMultipart == 0) {
            /*
             * uploads in one Chunk, doesn't support pause and resume.
             */
            return uploadSinglePartAndWaitForCompletion();
        }
        return false;
    }

    private Boolean uploadMultipartAndWaitForCompletion() throws ExecutionException {
        /*
         * For a new multipart upload, upload.mMultipartId should be null. If
         * it's a resumed upload, upload.mMultipartId would not be null.
         */
        long bytesAlreadyTransferrd = 0;
        if (upload.multipartId == null || upload.multipartId.isEmpty()) {
            final PutObjectRequest putObjectRequest = createPutObjectRequest(upload);
            TransferUtility.appendMultipartTransferServiceUserAgentString(putObjectRequest);
            try {
                upload.multipartId = initiateMultipartUpload(putObjectRequest);
            } catch (final AmazonClientException ace) {
                Log.e(TAG, "Error initiating multipart upload: " + upload.id
                        + " due to " + ace.getMessage());
                updater.throwError(upload.id, ace);
                updater.updateState(upload.id, TransferState.FAILED);
                return false;
            }
            dbUtil.updateMultipartId(upload.id, upload.multipartId);
        } else {
            /*
             * For a resumed upload, we should calculate the bytes already
             * transferred.
             */
            bytesAlreadyTransferrd = dbUtil.queryBytesTransferredByMainUploadId(upload.id);
            if (bytesAlreadyTransferrd > 0) {
                Log.d(TAG, String.format("Resume transfer %d from %d bytes",
                        upload.id, bytesAlreadyTransferrd));
            }
        }
        updater.updateProgress(upload.id, bytesAlreadyTransferrd, upload.bytesTotal);

        final List<UploadPartRequest> requestList = dbUtil.getNonCompletedPartRequestsFromDB(upload.id,
                upload.multipartId);
        Log.d(TAG, "multipart upload " + upload.id + " in " + requestList.size() + " parts.");
        final ArrayList<Future<Boolean>> futures = new ArrayList<Future<Boolean>>();
        for (final UploadPartRequest request : requestList) {
            TransferUtility.appendMultipartTransferServiceUserAgentString(request);
            request.setGeneralProgressListener(updater.newProgressListener(upload.id));
            futures.add(TransferThreadPool.submitTask(new UploadPartTask(request, s3, dbUtil)));
        }
        try {
            boolean isSuccess = true;
            /*
             * Future.get() will block the current thread until the method
             * returns.
             */
            for (final Future<Boolean> f : futures) {
                // UploadPartTask returns false when it's interrupted by user
                // and the state is set by caller
                final boolean b = f.get();
                isSuccess &= b;
            }
            if (!isSuccess) {
                return false;
            }
        } catch (final InterruptedException e) {
            /*
             * Future.get() will catch InterruptedException, but it's not a
             * failure, it may be caused by a pause operation from applications.
             */
            for (final Future<?> f : futures) {
                f.cancel(true);
            }
            // abort by user
            Log.d(TAG, "Transfer " + upload.id + " is interrupted by user");
            return false;
        } catch (final ExecutionException ee) {
            // handle pause, cancel, etc
            if (ee.getCause() != null && ee.getCause() instanceof Exception) {
                final Exception e = (Exception) ee.getCause();
                if (RetryUtils.isInterrupted(e)) {
                    /*
                     * thread is interrupted by user. don't update the state as
                     * it's set by caller who interrupted
                     */
                    Log.d(TAG, "Transfer " + upload.id + " is interrupted by user");
                    return false;
                } else if (e.getCause() != null && e.getCause() instanceof IOException
                        && !networkInfo.isNetworkConnected()) {
                    Log.d(TAG, "Transfer " + upload.id + " waits for network");
                    updater.updateState(upload.id, TransferState.WAITING_FOR_NETWORK);
                }
                updater.throwError(upload.id, e);
            }
            updater.updateState(upload.id, TransferState.FAILED);
            return false;
        }

        try {
            completeMultiPartUpload(upload.id, upload.bucketName, upload.key,
                    upload.multipartId);
            updater.updateProgress(upload.id, upload.bytesTotal, upload.bytesTotal);
            updater.updateState(upload.id, TransferState.COMPLETED);
            return true;
        } catch (final AmazonClientException ace) {
            Log.e(TAG, "Failed to complete multipart: " + upload.id
                    + " due to " + ace.getMessage());
            updater.throwError(upload.id, ace);
            updater.updateState(upload.id, TransferState.FAILED);
            return false;
        }
    }

    private Boolean uploadSinglePartAndWaitForCompletion() {
        final PutObjectRequest putObjectRequest = createPutObjectRequest(upload);

        final long length = putObjectRequest.getFile().length();
        TransferUtility.appendTransferServiceUserAgentString(putObjectRequest);
        updater.updateProgress(upload.id, 0, length);
        putObjectRequest.setGeneralProgressListener(updater.newProgressListener(upload.id));

        try {
            s3.putObject(putObjectRequest);
            updater.updateProgress(upload.id, length, length);
            updater.updateState(upload.id, TransferState.COMPLETED);
            return true;
        } catch (final Exception e) {
            if (RetryUtils.isInterrupted(e)) {
                /*
                 * thread is interrupted by user. don't update the state as it's
                 * set by caller who interrupted
                 */
                Log.d(TAG, "Transfer " + upload.id + " is interrupted by user");
                return false;
            } else if (e.getCause() != null && e.getCause() instanceof IOException
                    && !networkInfo.isNetworkConnected()) {
                Log.d(TAG, "Transfer " + upload.id + " waits for network");
                updater.updateState(upload.id, TransferState.WAITING_FOR_NETWORK);
            }
            // all other exceptions
            Log.e(TAG, "Failed to upload: " + upload.id + " due to " + e.getMessage());
            updater.throwError(upload.id, e);
            updater.updateState(upload.id, TransferState.FAILED);
            return false;
        }
    }

    private void completeMultiPartUpload(int mainUploadId, String bucket,
            String key, String multipartId) throws AmazonClientException {
        final List<PartETag> partETags = dbUtil.queryPartETagsOfUpload(mainUploadId);
        final CompleteMultipartUploadRequest completeRequest = new CompleteMultipartUploadRequest(bucket,
                key, multipartId, partETags);
        TransferUtility.appendMultipartTransferServiceUserAgentString(completeRequest);
        s3.completeMultipartUpload(completeRequest);
    }

    /**
     * Creates a multipart upload id for the upload request.
     *
     * @param putObjectRequest An PutObjectRequest object for the whole upload
     * @return A multipart upload id
     */
    private String initiateMultipartUpload(PutObjectRequest putObjectRequest)
            throws AmazonClientException {
        InitiateMultipartUploadRequest initiateMultipartUploadRequest = null;
        initiateMultipartUploadRequest = new InitiateMultipartUploadRequest(
                putObjectRequest.getBucketName(), putObjectRequest.getKey())
                .withCannedACL(putObjectRequest.getCannedAcl())
                .withObjectMetadata(putObjectRequest.getMetadata())
                .withSSEAwsKeyManagementParams(
                                putObjectRequest.getSSEAwsKeyManagementParams());
        TransferUtility
                .appendMultipartTransferServiceUserAgentString(initiateMultipartUploadRequest);
        final String uploadId = s3.initiateMultipartUpload(initiateMultipartUploadRequest).getUploadId();
        return uploadId;
    }

    /**
     * Creates a PutObjectRequest from the data in the TransferRecord
     *
     * @param upload The data for the Object Metadata
     * @return Returns a PutObjectRequest with filled in metadata and parameters
     */
    private PutObjectRequest createPutObjectRequest(TransferRecord upload) {
        final File file = new File(upload.file);
        final PutObjectRequest putObjectRequest = new PutObjectRequest(upload.bucketName,
                upload.key, file);

        final ObjectMetadata om = new ObjectMetadata();
        om.setContentLength(file.length());

        if (upload.headerCacheControl != null) {
            om.setCacheControl(upload.headerCacheControl);
        }
        if (upload.headerContentDisposition != null) {
            om.setContentDisposition(upload.headerContentDisposition);
        }
        if (upload.headerContentEncoding != null) {
            om.setContentEncoding(upload.headerContentEncoding);
        }
        if (upload.headerContentType != null) {
            om.setContentType(upload.headerContentType);
        } else {
            om.setContentType(Mimetypes.getInstance().getMimetype(file));
        }
        if (upload.expirationTimeRuleId != null) {
            om.setExpirationTimeRuleId(upload.expirationTimeRuleId);
        }
        if (upload.httpExpires != null) {
            om.setHttpExpiresDate(new Date(Long.valueOf(upload.httpExpires)));
        }
        if (upload.sseAlgorithm != null) {
            om.setSSEAlgorithm(upload.sseAlgorithm);
        }
        if (upload.userMetadata != null) {
            om.setUserMetadata(upload.userMetadata);
        }
        if (upload.md5 != null) {
            om.setContentMD5(upload.md5);
        }
        if (upload.sseKMSKey != null) {
            putObjectRequest
                    .setSSEAwsKeyManagementParams(new SSEAwsKeyManagementParams(upload.sseKMSKey));
        }

        putObjectRequest.setMetadata(om);
        putObjectRequest.setCannedAcl(getCannedAclFromString(upload.cannedAcl));

        return putObjectRequest;
    }

    private static final Map<String, CannedAccessControlList> cannedAclMap;
    static {
        cannedAclMap = new HashMap<String, CannedAccessControlList>();
        for (final CannedAccessControlList cannedAcl : CannedAccessControlList.values()) {
            cannedAclMap.put(cannedAcl.toString(), cannedAcl);
        }
    }

    private static CannedAccessControlList getCannedAclFromString(String cannedAcl) {
        return cannedAcl == null ? null : cannedAclMap.get(cannedAcl);
    }
}
