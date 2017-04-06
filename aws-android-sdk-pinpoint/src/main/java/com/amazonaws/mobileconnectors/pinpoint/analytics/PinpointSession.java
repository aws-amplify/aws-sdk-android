/**
 * Copyright 2016-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * <p>
 * http://aws.amazon.com/apache2.0
 * <p>
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.pinpoint.analytics;

public class PinpointSession {
    private final String sessionId;
    private final Long sessionStart;
    private final Long sessionStop;
    private final Long sessionDuration;

    public PinpointSession(String sessionId, Long sessionStart,
                           Long sessionStop, Long sessionDuration){
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
