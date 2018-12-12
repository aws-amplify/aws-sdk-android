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

/**
 * Session Logic for when the Application Session is PAUSED.
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class PausedSessionState extends SessionClientState {

    private static final String TAG = "PausedSessionState";

    public PausedSessionState(final DefaultSessionClient client) {
        super(client);
    }

    /**
     * If the session has been paused for less than the specified time,
     * re-activate it. Otherwise, start a new one.
     */
    @Override
    public void resume() {
        if (System.currentTimeMillis() - client.session.getStopTime() < client.getResumeDelay()) {
            super.executeResume();
        } else {
            // Start new session
            Log.i(TAG, "Session has expired. Starting a fresh one...");
            this.start();
        }
    }

    /**
     * If the session is already paused, ignore more pauses.
     */
    @Override
    public void pause() {
        // log failure
        Log.i(TAG, "Session Pause Failed: Session is already paused.");
    }

    /**
     * If the session is paused, fully stop it ant start a new one.
     */
    @Override
    public void start() {
        super.executeStop();
        super.executeStart();
    }

    /**
     * If the session is paused, bring it to a full stop.
     */
    @Override
    public void stop() {
        super.executeStop();
    }

}
