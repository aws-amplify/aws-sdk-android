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


    private final UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata;
    private final UploadTask.UploadTaskProgressListener uploadTaskProgressListener;
    private final UploadPartRequest uploadPartRequest;
    private final AmazonS3 s3;
    private final TransferDBUtil dbUtil;

    public UploadPartTask(UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata,
                          UploadTask.UploadTaskProgressListener uploadTaskProgressListener,
                          UploadPartRequest uploadPartRequest,
                          AmazonS3 s3,
                          TransferDBUtil dbUtil) {
        this.uploadPartTaskMetadata = uploadPartTaskMetadata;
        this.uploadTaskProgressListener = uploadTaskProgressListener;
        this.uploadPartRequest = uploadPartRequest;
        this.s3 = s3;
        this.dbUtil = dbUtil;
    }

    /*
     * Runs part upload task and returns whether successfully uploaded.
     */
    @Override
    public Boolean call() throws Exception {
        try {
            uploadPartTaskMetadata.state = TransferState.IN_PROGRESS;
            uploadPartRequest.setGeneralProgressListener(new UploadPartTaskProgressListener(uploadTaskProgressListener));
            final UploadPartResult putPartResult = s3.uploadPart(uploadPartRequest);
            uploadPartTaskMetadata.state = TransferState.PART_COMPLETED;
            dbUtil.updateState(uploadPartRequest.getId(), TransferState.PART_COMPLETED);
            dbUtil.updateETag(uploadPartRequest.getId(), putPartResult.getETag());
            return true;
        } catch (final Exception e) {
            LOGGER.error("Upload part interrupted: " + e);
            ProgressEvent resetEvent = new ProgressEvent(0);
            resetEvent.setEventCode(ProgressEvent.RESET_EVENT_CODE);
            uploadTaskProgressListener.progressChanged(new ProgressEvent(0));

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

            // In other cases, set the transfer state to FAILED.
            uploadPartTaskMetadata.state = TransferState.FAILED;
            dbUtil.updateState(uploadPartRequest.getId(), TransferState.FAILED);
            LOGGER.error("Encountered error uploading part ", e);
            throw e;
        }
    }

    /**
     * Progress Listener for a part
     */
    private class UploadPartTaskProgressListener implements ProgressListener {

        private UploadTask.UploadTaskProgressListener uploadTaskProgressListener;

        private long bytesTransferredSoFar;

        public UploadPartTaskProgressListener(UploadTask.UploadTaskProgressListener progressListener) {
            this.uploadTaskProgressListener = progressListener;
        }

        @Override
        public void progressChanged(ProgressEvent progressEvent) {
            if (ProgressEvent.RESET_EVENT_CODE == progressEvent.getEventCode()) {
                // Reset will discard what's been transferred
                LOGGER.info("Reset Event triggerred. Resetting the bytesCurrent to 0.");
                // Reset the local counter to 0.
                bytesTransferredSoFar = 0;
            } else {
                bytesTransferredSoFar += progressEvent.getBytesTransferred();          
            }
            this.uploadTaskProgressListener
                    .onProgressChanged(UploadPartTask.this.uploadPartRequest.getPartNumber(), 
                        bytesTransferredSoFar);
        }
    }
}
