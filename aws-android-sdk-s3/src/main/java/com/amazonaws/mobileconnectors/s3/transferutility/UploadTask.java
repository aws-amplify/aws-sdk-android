/**
 * Copyright 2015-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService.NetworkInfoReceiver;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.util.Mimetypes;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
            PutObjectRequest putObjectRequest = createPutObjectRequest(upload);
            TransferUtility.appendMultipartTransferServiceUserAgentString(putObjectRequest);
            try {
                upload.multipartId = initiateMultipartUpload(putObjectRequest);
            } catch (AmazonClientException ace) {
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

        List<UploadPartRequest> requestList = dbUtil.getNonCompletedPartRequestsFromDB(upload.id,
                upload.multipartId);
        Log.d(TAG, "multipart upload " + upload.id + " in " + requestList.size() + " parts.");
        ArrayList<Future<Boolean>> futures = new ArrayList<Future<Boolean>>();
        for (UploadPartRequest request : requestList) {
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
            for (Future<Boolean> f : futures) {
                // UploadPartTask returns false when it's interrupted by user
                // and the state is set by caller
                boolean b = f.get();
                isSuccess &= b;
            }
            if (!isSuccess) {
                return false;
            }
        } catch (InterruptedException e) {
            /*
             * Future.get() will catch InterruptedException, but it's not a
             * failure, it may be caused by a pause operation from applications.
             */
            for (Future<?> f : futures) {
                f.cancel(true);
            }
            // abort by user
            Log.d(TAG, "Transfer " + upload.id + " is interrupted by user");
            return false;
        } catch (ExecutionException ee) {
            // handle pause, cancel, etc
            if (ee.getCause() != null && ee.getCause() instanceof Exception) {
                Exception e = (Exception) ee.getCause();
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
        } catch (AmazonClientException ace) {
            Log.e(TAG, "Failed to complete multipart: " + upload.id
                    + " due to " + ace.getMessage());
            updater.throwError(upload.id, ace);
            updater.updateState(upload.id, TransferState.FAILED);
            return false;
        }
    }

    private Boolean uploadSinglePartAndWaitForCompletion() {
        PutObjectRequest putObjectRequest = createPutObjectRequest(upload);

        long length = putObjectRequest.getFile().length();
        TransferUtility.appendTransferServiceUserAgentString(putObjectRequest);
        updater.updateProgress(upload.id, 0, length);
        putObjectRequest.setGeneralProgressListener(updater.newProgressListener(upload.id));

        try {
            s3.putObject(putObjectRequest);
            updater.updateProgress(upload.id, length, length);
            updater.updateState(upload.id, TransferState.COMPLETED);
            return true;
        } catch (Exception e) {
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
        List<PartETag> partETags = dbUtil.queryPartETagsOfUpload(mainUploadId);
        CompleteMultipartUploadRequest completeRequest = new CompleteMultipartUploadRequest(bucket,
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
                .withObjectMetadata(putObjectRequest.getMetadata());
        TransferUtility
                .appendMultipartTransferServiceUserAgentString(initiateMultipartUploadRequest);
        String uploadId = s3.initiateMultipartUpload(initiateMultipartUploadRequest).getUploadId();
        return uploadId;
    }

    /**
     * Creates a PutObjectRequest from the data in the TransferRecord
     *
     * @param por The request to fill
     * @param upload The data for the Object Metadata
     * @return Returns a PutObjectRequest with filled in metadata and parameters
     */
    private PutObjectRequest createPutObjectRequest(TransferRecord upload) {
        File file = new File(upload.file);
        PutObjectRequest putObjectRequest = new PutObjectRequest(upload.bucketName,
                upload.key, file);

        ObjectMetadata om = new ObjectMetadata();
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

        putObjectRequest.setMetadata(om);
        putObjectRequest.setCannedAcl(getCannedAclFromString(upload.cannedAcl));

        return putObjectRequest;
    }

    private static final Map<String, CannedAccessControlList> cannedAclMap;
    static {
        cannedAclMap = new HashMap<String, CannedAccessControlList>();
        for (CannedAccessControlList cannedAcl : CannedAccessControlList.values()) {
            cannedAclMap.put(cannedAcl.toString(), cannedAcl);
        }
    }

    private static CannedAccessControlList getCannedAclFromString(String cannedAcl) {
        return cannedAcl == null ? null : cannedAclMap.get(cannedAcl);
    }
}
