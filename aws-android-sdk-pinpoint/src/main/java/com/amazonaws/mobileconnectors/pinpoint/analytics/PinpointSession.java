/**
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.pinpoint.analytics;

/**
 * Represents a Session Object that is used to record session events and keep track of
 * a sessionId to be used for recording other events
 */
public class PinpointSession {
    private final String sessionId;
    private final Long sessionStart;
    private final Long sessionStop;
    private final Long sessionDuration;

    /**
     * Initializes the PinpointSession object
     *
     * @param sessionId       The sessionId
     * @param sessionStart    The sessionStart as an epoch timestamp
     * @param sessionStop     The sessionStop as an epoch timestamp
     * @param sessionDuration The session duration in seconds
     */
    public PinpointSession(final String sessionId, final Long sessionStart, final Long sessionStop, final Long sessionDuration) {
        this.sessionId = sessionId;
        this.sessionStart = sessionStart;
        this.sessionStop = sessionStop;
        this.sessionDuration = sessionDuration;
    }

    public String getSessionId() {
        return sessionId;
    }

    public Long getSessionStart() {
        return sessionStart;
    }

    public Long getSessionStop() {
        return sessionStop;
    }

    public Long getSessionDuration() {
        return sessionDuration;
    }
}
