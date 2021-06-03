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

import com.amazonaws.AbortedException;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import java.util.concurrent.Callable;

class UploadPartTask implements Callable<Boolean> {
    private static final Log LOGGER = LogFactory.getLog(UploadPartTask.class);
    private static final int RETRY_COUNT = 3;

    private final UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata;
    private final UploadPartTaskProgressListener uploadPartTaskProgressListener;
    private final UploadPartRequest uploadPartRequest;
    private final AmazonS3 s3;
    private final TransferDBUtil dbUtil;

    public UploadPartTask(UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata,
                          UploadTask.UploadTaskProgressListener uploadTaskProgressListener,
                          UploadPartRequest uploadPartRequest,
                          AmazonS3 s3,
                          TransferDBUtil dbUtil) {
        this.uploadPartTaskMetadata = uploadPartTaskMetadata;
        this.uploadPartTaskProgressListener = new UploadPartTaskProgressListener(uploadTaskProgressListener);
        this.uploadPartRequest = uploadPartRequest;
        this.s3 = s3;
        this.dbUtil = dbUtil;
    }

    /*
     * Runs part upload task and returns whether successfully uploaded.
     */
    @Override
    public Boolean call() throws Exception {
        uploadPartTaskMetadata.state = TransferState.IN_PROGRESS;
        uploadPartRequest.setGeneralProgressListener(uploadPartTaskProgressListener);
        UploadPartResult putPartResult = null;
        int retried = 0;
        while (retried < RETRY_COUNT) {
            try {
                putPartResult = s3.uploadPart(uploadPartRequest);
                break;
            } catch (AbortedException e) {
                // If request got aborted, operation was paused or canceled. do not retry.
                LOGGER.error("Upload part aborted.");
                resetProgress();
                return false;
            } catch (final Exception e) {
                LOGGER.error("Unexpected error occurred: " + e);
                resetProgress();

                // Check if network is not connected, set the state to WAITING_FOR_NETWORK.
                try {
                    if (TransferNetworkLossHandler.getInstance() != null &&
                            !TransferNetworkLossHandler.getInstance().isNetworkConnected()) {
                        LOGGER.info("Thread: [" + Thread.currentThread().getId() + "]: Network wasn't available.");
                        /*
                         * Network connection is being interrupted. Moving the TransferState
                         * to WAITING_FOR_NETWORK till the network availability resumes.
                         */
                        uploadPartTaskMetadata.state = TransferState.WAITING_FOR_NETWORK;
                        dbUtil.updateState(uploadPartRequest.getId(), TransferState.WAITING_FOR_NETWORK);
                        LOGGER.info("Network Connection Interrupted: " +
                                "Moving the TransferState to WAITING_FOR_NETWORK");
                        return false;
                    }
                } catch (TransferUtilityException transferUtilityException) {
                    LOGGER.error("TransferUtilityException: [" + transferUtilityException + "]");
                }

                if (retried >= RETRY_COUNT) {
                    setTaskState(TransferState.FAILED);
                    LOGGER.error("Encountered error uploading part ", e);
                    throw e;
                }
                LOGGER.debug("Retry attempt: " + ++retried, e);
            }
        }

        if (putPartResult == null) {
            setTaskState(TransferState.FAILED);
            return false;
        }
        setTaskState(TransferState.PART_COMPLETED);
        dbUtil.updateETag(uploadPartRequest.getId(), putPartResult.getETag());
        return true;
    }

    private void setTaskState(TransferState newState) {
        uploadPartTaskMetadata.state = newState;
        dbUtil.updateState(uploadPartRequest.getId(),newState);
    }

    private void resetProgress() {
        ProgressEvent resetEvent = new ProgressEvent(0);
        resetEvent.setEventCode(ProgressEvent.RESET_EVENT_CODE);
        uploadPartTaskProgressListener.progressChanged(resetEvent);
    }

    /**
     * Progress Listener for a part
     */
    private class UploadPartTaskProgressListener implements ProgressListener {

        private final UploadTask.UploadTaskProgressListener uploadTaskProgressListener;

        private long bytesTransferredSoFar;

        public UploadPartTaskProgressListener(UploadTask.UploadTaskProgressListener progressListener) {
            this.uploadTaskProgressListener = progressListener;
        }

        @Override
        public void progressChanged(ProgressEvent progressEvent) {
            if (ProgressEvent.RESET_EVENT_CODE == progressEvent.getEventCode()) {
                // Reset will discard what's been transferred
                LOGGER.debug("Reset Event triggered. Resetting the bytesCurrent to 0.");
                // Reset the local counter to 0.
                bytesTransferredSoFar = 0;
            } else {
                bytesTransferredSoFar += progressEvent.getBytesTransferred();          
            }
            this.uploadTaskProgressListener.onProgressChanged(
                    uploadPartRequest.getPartNumber(),
                    bytesTransferredSoFar
            );
        }
    }
}
