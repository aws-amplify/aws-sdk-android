/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.client;

import android.util.Log;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.AnalyticsEvent;

/**
 * Session Logic for when the Application Session is INACTIVE. ie: The session
 * has either been stopped or not started yet.
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class InactiveSessionState extends SessionClientState {

    private static final String TAG = "InactiveSessionState";

    public InactiveSessionState(final DefaultSessionClient client) {
        super(client);
    }

    /**
     * If no Session is active, then ignore the resume.
     */
    @Override
    public void resume() {
        // fire blank resume event
        AnalyticsEvent e = client.eventClient
                .createEvent(DefaultSessionClient.SESSION_RESUME_EVENT_TYPE);
        client.eventClient.recordEvent(e);

        // log failure
        Log.i(TAG, "Session Resume Failed: No session is paused.");
    }

    /**
     * If no Session is active, then ignore the pause.
     */
    @Override
    public void pause() {
        // log failure
        Log.i(TAG, "Session Pause Failed: No session is running.");
    }

    /**
     * If no session is active, start one.
     */
    @Override
    public void start() {
        Log.i(TAG, "InactiveSession starting");
        super.executeStart();
    }

    /**
     * If no session is active, ignore the stop.
     */
    @Override
    public void stop() {
        // Log Failure
        Log.i(TAG, "Session Stop Failed: No session is running.");
    }
}
