/**
 * Copyright 2015-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * The current state of a transfer.
 */
public enum TransferState {

    /**
     * This state represents a transfer that has been queued, but has not yet
     * started
     */
    WAITING,
    /**
     * This state represents a transfer that is currently uploading or
     * downloading data
     */
    IN_PROGRESS,
    /**
     * This state represents a transfer that is paused
     */
    PAUSED,
    /**
     * This state represents a transfer that has been resumed and queued for
     * execution, but has not started to actively transfer data
     */
    RESUMED_WAITING,
    /**
     * This state represents a transfer that is completed
     */
    COMPLETED,
    /**
     * This state represents a transfer that is canceled
     */
    CANCELED,
    /**
     * This state represents a transfer that has failed
     */
    FAILED,

    /**
     * This state represents a transfer that is currently on hold, waiting for
     * the network to become available
     */
    WAITING_FOR_NETWORK,
    /**
     * This state represents a transfer that is a completed part of a multi-part
     * upload. This state is primarily used internally and there should be no
     * need to use this state.
     */
    PART_COMPLETED,
    /**
     * This state represents a transfer that has been requested to cancel, but
     * the service processing transfers has not yet fulfilled this request. This
     * state is primarily used internally and there should be no need to use
     * this state.
     */
    PENDING_CANCEL,
    /**
     * This state represents a transfer that has been requested to pause by the
     * client, but the service processing transfers has not yet fulfilled this
     * request. This state is primarily used internally and there should be no
     * need to use this state.
     */
    PENDING_PAUSE,
    /**
     * This state represents a transfer that has been requested to pause by the
     * client because the network has been loss, but the service processing
     * transfers has not yet fulfilled this request. This state is primarily
     * used internally and there should be no need to use this state.
     */
    PENDING_NETWORK_DISCONNECT,
    /**
     * This is an internal value used to detect if the current transfer is in an
     * unknown state
     */
    UNKNOWN;

    public static TransferState getState(String stateAsString) {
        if (stateAsString.equalsIgnoreCase(TransferState.CANCELED.toString()))
            return TransferState.CANCELED;
        if (stateAsString.equalsIgnoreCase(TransferState.COMPLETED.toString()))
            return TransferState.COMPLETED;
        if (stateAsString.equalsIgnoreCase(TransferState.FAILED.toString()))
            return TransferState.FAILED;
        if (stateAsString.equalsIgnoreCase(TransferState.IN_PROGRESS.toString()))
            return TransferState.IN_PROGRESS;
        if (stateAsString.equalsIgnoreCase(TransferState.PART_COMPLETED.toString()))
            return TransferState.PART_COMPLETED;
        if (stateAsString.equalsIgnoreCase(TransferState.PAUSED.toString()))
            return TransferState.PAUSED;
        if (stateAsString.equalsIgnoreCase(TransferState.PENDING_CANCEL.toString()))
            return TransferState.PENDING_CANCEL;
        if (stateAsString.equalsIgnoreCase(TransferState.PENDING_NETWORK_DISCONNECT.toString()))
            return TransferState.PENDING_NETWORK_DISCONNECT;
        if (stateAsString.equalsIgnoreCase(TransferState.PENDING_PAUSE.toString()))
            return TransferState.PENDING_PAUSE;
        if (stateAsString.equalsIgnoreCase(TransferState.RESUMED_WAITING.toString()))
            return TransferState.RESUMED_WAITING;
        if (stateAsString.equalsIgnoreCase(TransferState.WAITING.toString()))
            return TransferState.WAITING;
        if (stateAsString.equalsIgnoreCase(TransferState.WAITING_FOR_NETWORK.toString()))
            return TransferState.WAITING_FOR_NETWORK;

        Log.e("TransferState", "Unknown state " + stateAsString
                + " transfer will be have state set to UNKNOWN.");
        return UNKNOWN;
    }
}
