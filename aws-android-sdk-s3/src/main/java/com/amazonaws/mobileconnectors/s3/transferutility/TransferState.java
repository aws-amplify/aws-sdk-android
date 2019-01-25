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


import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * The current state of a transfer. A transfer is initially in WAITING state
 * when added. It will turn into IN_PROGRESS once it starts. Customers can pause
 * or cancel the transfer when needed and turns it into PAUSED or CANCELED state
 * respectively. Finally the transfer will either succeed as COMPLETED or fail
 * as FAILED. WAITING_FOR_NETWORK state may kick in for an active transfer when
 * network is lost. The other enum values are internal use only.
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

    private static final Map<String, TransferState> MAP;
    static {
        MAP = new HashMap<String, TransferState>();
        for (final TransferState state : TransferState.values()) {
            MAP.put(state.toString(), state);
        }
    }

    private static final Log LOGGER = LogFactory.getLog(TransferState.class);

    /**
     * Returns the transfer state from string
     * 
     * @param stateAsString state of the transfer represented as string.
     * @return the {@link TransferState}
     */
    public static TransferState getState(String stateAsString) {
        if (MAP.containsKey(stateAsString)) {
            return MAP.get(stateAsString);
        }

        LOGGER.error("Unknown state " + stateAsString
                + " transfer will be have state set to UNKNOWN.");
        return UNKNOWN;
    }
}
