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
import com.amazonaws.AmazonServiceException;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
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

    Map<Integer, UploadPartTaskMetadata> uploadPartTasks;
    private List<UploadPartRequest> requestList;

    public UploadTask(TransferRecord uploadInfo,
                      AmazonS3 s3,
                      TransferDBUtil dbUtil,
                      TransferStatusUpdater updater) {
        this.upload = uploadInfo;
        this.s3 = s3;
        this.dbUtil = dbUtil;
        this.updater = updater;
        this.uploadPartTasks = new HashMap<Integer, UploadPartTaskMetadata>();
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
                LOGGER.info(String.format("Resume transfer %d from %d bytes",
                        upload.id, bytesAlreadyTransferred));
            }
        }
        UploadTaskProgressListener uploadTaskProgressListener = new UploadTaskProgressListener(bytesAlreadyTransferred);
        updater.updateProgress(upload.id, bytesAlreadyTransferred, upload.bytesTotal, false);

        requestList = dbUtil.getNonCompletedPartRequestsFromDB(upload.id,
                upload.multipartId);
        LOGGER.info("Multipart upload " + upload.id + " in " + requestList.size() + " parts.");
        for (final UploadPartRequest request : requestList) {
            TransferUtility.appendMultipartTransferServiceUserAgentString(request);

            UploadPartTaskMetadata uploadPartTaskMetadata = new UploadPartTaskMetadata();
            uploadPartTaskMetadata.uploadPartRequest = request;
            uploadPartTaskMetadata.bytesTransferredSoFar = 0;
            uploadPartTaskMetadata.state = TransferState.WAITING;
            uploadPartTasks.put(request.getPartNumber(), uploadPartTaskMetadata);
            uploadPartTaskMetadata.uploadPartTask = TransferThreadPool.submitTask(
                    new UploadPartTask(uploadPartTaskMetadata, uploadTaskProgressListener, request, s3, dbUtil));
        }

        try {
            boolean isSuccess = true;
            /*
             * Future.get() will block the current thread until the method
             * returns.
             */
            for (final UploadPartTaskMetadata task : uploadPartTasks.values()) {
                // UploadPartTask returns false when it's interrupted by user
                // and the state is set by caller
                final boolean b = task.uploadPartTask.get();
                isSuccess &= b;
            }
            if (!isSuccess) {
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
            }
        } catch (final Exception e) {
            LOGGER.error("Upload resulted in an exception. " + e);

            /*
             * Future.get() will catch InterruptedException, but it's not a
             * failure, it may be caused by a pause operation from applications.
             * Cancel all the on-going part tasks.
             */
            for (final UploadPartTaskMetadata task : uploadPartTasks.values()) {
                task.uploadPartTask.cancel(true);
            }

            // If the thread that is executing the transfer is interrupted
            // because of a user initiated pause or cancel operation,
            // do not throw exception or set the state to FAILED.
            if (TransferState.PENDING_CANCEL.equals(upload.state)) {
                updater.updateState(upload.id, TransferState.CANCELED);
                LOGGER.info("Transfer is " + TransferState.CANCELED);
                return false;
            }

            if (TransferState.PENDING_PAUSE.equals(upload.state)) {
                updater.updateState(upload.id, TransferState.PAUSED);
                LOGGER.info("Transfer is " + TransferState.PAUSED);
                return false;
            }

            // interrupted due to network. Set the TransferState to
            // WAITING_FOR_NETWORK if the individual parts were waiting for network
            for (final UploadPartTaskMetadata task : uploadPartTasks.values()) {
                if (TransferState.WAITING_FOR_NETWORK.equals(task.state)) {
                    LOGGER.info("Individual part is WAITING_FOR_NETWORK.");
                    updater.updateState(upload.id, TransferState.WAITING_FOR_NETWORK);
                    return false;
                }
            }

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

            // interrupted due to reasons other than network.
            if (RetryUtils.isInterrupted(e)) {
                LOGGER.info("Transfer is interrupted. " + e);
                updater.updateState(upload.id, TransferState.FAILED);
                return false;
            }

            // in other cases, set the transfer to failed.
            LOGGER.error("Error encountered during multi-part upload: " + upload.id
                    + " due to " + e.getMessage(), e);
            updater.throwError(upload.id, e);
            updater.updateState(upload.id, TransferState.FAILED);
            return false;
        }

        LOGGER.info("Completing the multi-part upload transfer for " + upload.id);
        try {
            completeMultiPartUpload(upload.id, upload.bucketName, upload.key,
                    upload.multipartId);
            updater.updateProgress(upload.id, upload.bytesTotal, upload.bytesTotal, true);
            updater.updateState(upload.id, TransferState.COMPLETED);
            return true;
        } catch (final AmazonClientException ace) {
            LOGGER.error("Failed to complete multipart: " + upload.id
                    + " due to " + ace.getMessage(), ace);
            abortMultiPartUpload(upload.id, upload.bucketName, upload.key,
                    upload.multipartId);
            updater.throwError(upload.id, ace);
            updater.updateState(upload.id, TransferState.FAILED);
            return false;
        }
    }

    private Boolean uploadSinglePartAndWaitForCompletion() {
        final PutObjectRequest putObjectRequest = createPutObjectRequest(upload);
        final ProgressListener progressListener = updater.newProgressListener(upload.id);

        final long length = putObjectRequest.getFile().length();
        TransferUtility.appendTransferServiceUserAgentString(putObjectRequest);
        putObjectRequest.setGeneralProgressListener(progressListener);

        try {
            s3.putObject(putObjectRequest);
            updater.updateProgress(upload.id, length, length, true);
            updater.updateState(upload.id, TransferState.COMPLETED);
            return true;
        } catch (final Exception e) {
            // we dont need to update progress listener
            if (TransferState.PENDING_CANCEL.equals(upload.state)) {
                updater.updateState(upload.id, TransferState.CANCELED);
                LOGGER.info("Transfer is " + TransferState.CANCELED);
                return false;
            }

            // pause
            if (TransferState.PENDING_PAUSE.equals(upload.state)) {
                updater.updateState(upload.id, TransferState.PAUSED);
                LOGGER.info("Transfer is " + TransferState.PAUSED);
                ProgressEvent resetEvent = new ProgressEvent(0);
                resetEvent.setEventCode(ProgressEvent.RESET_EVENT_CODE);
                progressListener.progressChanged(new ProgressEvent(0));
                return false;
            }

            // If the thread that is executing the transfer is interrupted
            // because of a race condition in the network or OS.
            // interrupted and if its due to network drop, reset progress and
            // update state to WAITING_FOR_NETWORK.

            // Check if network is not connected, set the state to WAITING_FOR_NETWORK.
            try {
                if (TransferNetworkLossHandler.getInstance() != null &&
                    !TransferNetworkLossHandler.getInstance().isNetworkConnected()) {
                    LOGGER.info("Thread:[" + Thread.currentThread().getId() + "]: Network wasn't available.");
                    /*
                     * Network connection is being interrupted. Moving the TransferState to
                     * WAITING_FOR_NETWORK till the network availability resumes.
                     */
                    updater.updateState(upload.id, TransferState.WAITING_FOR_NETWORK);
                    LOGGER.debug("Network Connection Interrupted: " + "Moving the TransferState to WAITING_FOR_NETWORK");
                    ProgressEvent resetEvent = new ProgressEvent(0);
                    resetEvent.setEventCode(ProgressEvent.RESET_EVENT_CODE);
                    progressListener.progressChanged(new ProgressEvent(0));
                    return false;
                }
            } catch (TransferUtilityException transferUtilityException) {
                LOGGER.error("TransferUtilityException: [" + transferUtilityException + "]");
            }

            if (RetryUtils.isInterrupted(e)) {
                LOGGER.info("Transfer is interrupted. " + e);
                updater.updateState(upload.id, TransferState.FAILED);
                return false;
            }

            // In other cases, set the transfer state to FAILED.
            LOGGER.debug("Failed to upload: " + upload.id + " due to " + e.getMessage());
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
            String key, String multipartId) throws AmazonClientException, AmazonServiceException {
        final List<PartETag> partETags = dbUtil.queryPartETagsOfUpload(mainUploadId);
        final CompleteMultipartUploadRequest completeRequest = new CompleteMultipartUploadRequest(bucket,
                key, multipartId, partETags);
        TransferUtility.appendMultipartTransferServiceUserAgentString(completeRequest);
        s3.completeMultipartUpload(completeRequest);
    }

    private void abortMultiPartUpload(int mainUploadId, String bucket, String key, String multipartId) {
        LOGGER.info("Aborting the multipart since complete multipart failed.");
        try {
            // abort the multi part upload operation
            s3.abortMultipartUpload(
                    new AbortMultipartUploadRequest(
                            bucket,
                            key,
                            multipartId));
            LOGGER.debug("Successfully aborted multipart upload: " + mainUploadId);
        } catch (final AmazonClientException e) {
            LOGGER.debug("Failed to abort the multipart upload: " + mainUploadId, e);
        }
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
                                putObjectRequest.getSSEAwsKeyManagementParams())
                .withTagging(putObjectRequest.getTagging());
        TransferUtility
                .appendMultipartTransferServiceUserAgentString(initiateMultipartUploadRequest);
        return s3.initiateMultipartUpload(initiateMultipartUploadRequest).getUploadId();
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

    /**
     * Progress Listener for the Main UploadTask.
     */
    class UploadTaskProgressListener implements ProgressListener {

        // This variable tracks the previously reported total bytes transferred.
        private long prevTotalBytesTransferredOfAllParts;
        private final long bytesAlreadyTransferred;

        UploadTaskProgressListener(long bytesAlreadyTransferred) {
            prevTotalBytesTransferredOfAllParts = bytesAlreadyTransferred;
            this.bytesAlreadyTransferred = bytesAlreadyTransferred;
        }

        @Override
        public void progressChanged(final ProgressEvent progressEvent) {
            // No-op
        }

        public synchronized void onProgressChanged(final int partNum,
                                                   final long bytesTransferredSoFarForPartNum) {
            UploadPartTaskMetadata partNumTask = uploadPartTasks.get(partNum);
            if (partNumTask == null) {
                LOGGER.info("Update received for unknown part. Ignoring.");
                return;
            }

            partNumTask.bytesTransferredSoFar = bytesTransferredSoFarForPartNum;
            // Compute the sum of bytesTransferredSoFar for all parts and already completed parts
            long totalBytesTransferredOfAllParts = bytesAlreadyTransferred;
            for (Map.Entry<Integer, UploadPartTaskMetadata> part : uploadPartTasks.entrySet()) {
                totalBytesTransferredOfAllParts += part.getValue().bytesTransferredSoFar;
            }
            // Update the transfer record and the transfer listener
            // when the accumulated total bytesTransferred (totalBytesTransferredOfAllParts)
            // exceeds the previously reported toal bytesTransferred
            // (prevTotalBytesTransferredOfAllParts).
            if (totalBytesTransferredOfAllParts > prevTotalBytesTransferredOfAllParts &&
                totalBytesTransferredOfAllParts <= upload.bytesTotal) {
                updater.updateProgress(UploadTask.this.upload.id,
                    totalBytesTransferredOfAllParts,
                    UploadTask.this.upload.bytesTotal,
                    true);
                prevTotalBytesTransferredOfAllParts = totalBytesTransferredOfAllParts;
            }
        }
    }

    // This class represents the state being tracked per part
    class UploadPartTaskMetadata {
        // Reference to the request object for a part
        UploadPartRequest uploadPartRequest;

        // The future task that runs UploadPartTask to upload a part
        Future<Boolean> uploadPartTask;

        // number of bytes transferred so far for this part
        long bytesTransferredSoFar;

        // state of the transfer
        TransferState state;
    }
}
