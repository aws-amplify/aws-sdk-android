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


import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import java.util.concurrent.Callable;

class UploadPartTask implements Callable<Boolean> {
    private static final Log LOGGER = LogFactory.getLog(UploadPartTask.class);


    private final UploadPartRequest request;
    private final AmazonS3 s3;
    private final TransferDBUtil dbUtil;

    public UploadPartTask(UploadPartRequest request,
                          AmazonS3 s3,
                          TransferDBUtil dbUtil) {
        this.request = request;
        this.s3 = s3;
        this.dbUtil = dbUtil;
    }

    /*
     * Runs part upload task and returns whether successfully uploaded.
     */
    @Override
    public Boolean call() throws Exception {
        try {
            final UploadPartResult putPartResult = s3.uploadPart(request);
            dbUtil.updateState(request.getId(), TransferState.PART_COMPLETED);
            dbUtil.updateETag(request.getId(), putPartResult.getETag());
            return true;
        } catch (final Exception e) {
            // Check if network is not connected, set the state to WAITING_FOR_NETWORK.
            try {
                if (TransferNetworkLossHandler.getInstance() != null &&
                    !TransferNetworkLossHandler.getInstance().isNetworkConnected()) {
                    LOGGER.info("Thread: [" + Thread.currentThread().getId() + "]: Network wasn't available.");
                    /*
                     * Network connection is being interrupted. Moving the TransferState
                     * to WAITING_FOR_NETWORK till the network availability resumes.
                     */
                    dbUtil.updateState(request.getId(), TransferState.WAITING_FOR_NETWORK);
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
            if (RetryUtils.isInterrupted(e)) {
                LOGGER.error("Upload part interrupted: " + e.getMessage());
                return false;
            }

            // In other cases, set the transfer state to FAILED.
            dbUtil.updateState(request.getId(), TransferState.FAILED);
            LOGGER.error("Encountered error uploading part ", e);
            throw e;
        }
    }
}
