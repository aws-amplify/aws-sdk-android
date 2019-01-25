/**
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonClientException;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.ObjectTagging;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.SSEAwsKeyManagementParams;
import com.amazonaws.services.s3.model.Tag;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.util.Mimetypes;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * When an upload transfer is requested through TransferUtility,
 * a thread is created with UploadTask. Here a check is made for
 * single-part uploads (<= 5MB) and multi-part uploads (> 5MB).
 *
 * For multi-part uploads, a thread is created per part (5MB)
 * and submitted to the thread pool.
 */
class UploadTask implements Callable<Boolean> {

    private static final Log LOGGER = LogFactory.getLog(UploadTask.class);
    private static final String OBJECT_TAGS_DELIMITER = "&";
    private static final String OBJECT_TAG_KEY_VALUE_SEPARATOR = "=";
    private static final String REQUESTER_PAYS = "requester";

    private final AmazonS3 s3;
    private final TransferRecord upload;
    private final TransferDBUtil dbUtil;
    private final TransferStatusUpdater updater;

    public UploadTask(TransferRecord uploadInfo,
                      AmazonS3 s3,
                      TransferDBUtil dbUtil,
                      TransferStatusUpdater updater) {
        this.upload = uploadInfo;
        this.s3 = s3;
        this.dbUtil = dbUtil;
        this.updater = updater;
    }

    /*
     * Runs upload task and returns whether successfully uploaded.
     */
    @Override
    public Boolean call() throws Exception {
        try {
            if (TransferNetworkLossHandler.getInstance() != null &&
                !TransferNetworkLossHandler.getInstance().isNetworkConnected()) {
                LOGGER.info("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                updater.updateState(upload.id, TransferState.WAITING_FOR_NETWORK);
                return false;
            }
        } catch (TransferUtilityException transferUtilityException) {
            LOGGER.error("TransferUtilityException: [" + transferUtilityException + "]");
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
         * For a new multipart upload, upload.multipartId should be null. If
         * it's a resumed upload, upload.multipartId would not be null.
         */
        long bytesAlreadyTransferred = 0;
        if (upload.multipartId == null || upload.multipartId.isEmpty()) {
            final PutObjectRequest putObjectRequest = createPutObjectRequest(upload);
            TransferUtility.appendMultipartTransferServiceUserAgentString(putObjectRequest);
            try {
                upload.multipartId = initiateMultipartUpload(putObjectRequest);
            } catch (final AmazonClientException ace) {
                LOGGER.error("Error initiating multipart upload: " + upload.id
                        + " due to " + ace.getMessage(), ace);
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
            bytesAlreadyTransferred = dbUtil.queryBytesTransferredByMainUploadId(upload.id);
            if (bytesAlreadyTransferred > 0) {
                LOGGER.debug(String.format("Resume transfer %d from %d bytes",
                        upload.id, bytesAlreadyTransferred));
            }
        }
        updater.updateProgress(upload.id, bytesAlreadyTransferred, upload.bytesTotal);

        final List<UploadPartRequest> requestList = dbUtil.getNonCompletedPartRequestsFromDB(upload.id,
                upload.multipartId);
        LOGGER.info("Multipart upload " + upload.id + " in " + requestList.size() + " parts.");
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
                // Set the TransferState to WAITING_FOR_NETWORK if the individual parts
                // were waiting for network
                boolean isNetworkInterrupted = dbUtil.checkWaitingForNetworkPartRequestsFromDB(upload.id);
                if (isNetworkInterrupted) {
                    LOGGER.debug("Network Connection Interrupted: Transfer " + upload.id + " waits for network");
                    updater.updateState(upload.id, TransferState.WAITING_FOR_NETWORK);
                }
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
            LOGGER.debug("Transfer " + upload.id + " is interrupted by user");
            LOGGER.error("Error encountered during multi-part upload: " + upload.id
                    + " due to " + e.getMessage(), e);
            updater.updateState(upload.id, TransferState.FAILED);
            updater.throwError(upload.id, e);

            return false;
        } catch (final ExecutionException ee) {
            // Set the TransferState to WAITING_FOR_NETWORK if the individual parts
            // were waiting for network
            boolean isNetworkInterrupted = dbUtil.checkWaitingForNetworkPartRequestsFromDB(upload.id);
            if (isNetworkInterrupted) {
                LOGGER.debug("Network Connection Interrupted: Transfer " + upload.id + " waits for network");
                updater.updateState(upload.id, TransferState.WAITING_FOR_NETWORK);
                return false;
            }

            // If the thread that is executing the transfer is interrupted
            // because of a user initiated pause, do not throw exception or
            // set the state to FAILED.
            final Exception e = (Exception) ee.getCause();
            if (RetryUtils.isInterrupted(e) &&
                TransferState.PAUSED.equals(upload.state)) {
                LOGGER.debug("Transfer " + upload.id + " is interrupted by user");
                return false;
            }

            LOGGER.error("Error encountered during multi-part upload: " + upload.id
                    + " due to " + e.getMessage(), e);
            updater.updateState(upload.id, TransferState.FAILED);
            updater.throwError(upload.id, e);
            return false;
        }

        LOGGER.info("Completing the multi-part upload transfer for " + upload.id);
        try {
            completeMultiPartUpload(upload.id, upload.bucketName, upload.key,
                    upload.multipartId);
            updater.updateProgress(upload.id, upload.bytesTotal, upload.bytesTotal);
            updater.updateState(upload.id, TransferState.COMPLETED);
            return true;
        } catch (final AmazonClientException ace) {
            LOGGER.error("Failed to complete multipart: " + upload.id
                    + " due to " + ace.getMessage(), ace);
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
            // Check if network is not connected, set the state to WAITING_FOR_NETWORK.
            try {
                if (TransferNetworkLossHandler.getInstance() != null && 
                    !TransferNetworkLossHandler.getInstance().isNetworkConnected()) {
                    LOGGER.info("Thread:[" + Thread.currentThread().getId() + "]: Network wasn't available.");
                    /*
                     * Network connection is being interrupted. Moving the TransferState
                     * to WAITING_FOR_NETWORK till the network availability resumes.
                     */
                    updater.updateState(upload.id, TransferState.WAITING_FOR_NETWORK);
                    LOGGER.debug("Network Connection Interrupted: " +
                            "Moving the TransferState to WAITING_FOR_NETWORK");
                    return false;
                }
            } catch (TransferUtilityException transferUtilityException) {
                LOGGER.error("TransferUtilityException: [" + transferUtilityException + "]");
            }

            // If the thread that is executing the transfer is interrupted
            // because of a user initiated pause, do not throw exception or
            // set the state to FAILED.
            if (RetryUtils.isInterrupted(e) &&
                TransferState.PAUSED.equals(upload.state)) {
                // thread interrupted by user
                LOGGER.error("Single-part Upload interrupted: " + e.getMessage());
                return false;
            }

            // In other cases, set the transfer state to FAILED.
            LOGGER.debug("Failed to do a single-part upload: " + upload.id + " due to " + e.getMessage());
            updater.throwError(upload.id, e);
            updater.updateState(upload.id, TransferState.FAILED);
            return false;
        }
    }

    /**
     * Completes the multi-part upload transfer.
     *
     * @param mainUploadId  Main ID of the multi-part transfer
     * @param bucket        Name of the S3 bucket
     * @param key           Name of the object stored in the bucket
     * @param multipartId   Multi-part identifier given by S3 that
     *                      uniquely identifies this transfer
     */
    private void completeMultiPartUpload(int mainUploadId, String bucket,
            String key, String multipartId) {
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
    private String initiateMultipartUpload(PutObjectRequest putObjectRequest) {
        InitiateMultipartUploadRequest initiateMultipartUploadRequest = new InitiateMultipartUploadRequest(
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
    @SuppressWarnings("checkstyle:hiddenfield")
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
        if (upload.headerStorageClass != null) {
            putObjectRequest.setStorageClass(upload.headerStorageClass);
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
            // Check Object Tag
            String objectTag = upload.userMetadata.get(Headers.S3_TAGGING);
            if (objectTag != null) {
                try {
                    String[] tags = objectTag.split(OBJECT_TAGS_DELIMITER);
                    List<Tag> tagList = new ArrayList<Tag>();
                    for (String tag : tags) {
                        String[] tagParts = tag.split(OBJECT_TAG_KEY_VALUE_SEPARATOR);
                        tagList.add(new Tag(tagParts[0], tagParts[1]));
                    }
                    putObjectRequest.setTagging(new ObjectTagging(tagList));
                } catch (Exception exception) {
                    LOGGER.error("Error in passing the object tags as request headers.", exception);
                }
            }
            // Check Redirect Location
            String redirectLocation = upload.userMetadata.get(Headers.REDIRECT_LOCATION);
            if (redirectLocation != null) {
                putObjectRequest.setRedirectLocation(redirectLocation);
            }
            // Check Requester Pays
            String isRequesterPays = upload.userMetadata.get(Headers.REQUESTER_PAYS_HEADER);
            if (isRequesterPays != null) {
                putObjectRequest.setRequesterPays(REQUESTER_PAYS.equals(isRequesterPays) ? true : false);
            }
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

    /**
     * Convenience methods for Canned ACL.
     */
    private static final Map<String, CannedAccessControlList> CANNED_ACL_MAP;
    static {
        CANNED_ACL_MAP = new HashMap<String, CannedAccessControlList>();
        for (final CannedAccessControlList cannedAcl : CannedAccessControlList.values()) {
            CANNED_ACL_MAP.put(cannedAcl.toString(), cannedAcl);
        }
    }

    private static CannedAccessControlList getCannedAclFromString(String cannedAcl) {
        return cannedAcl == null ? null : CANNED_ACL_MAP.get(cannedAcl);
    }
}
