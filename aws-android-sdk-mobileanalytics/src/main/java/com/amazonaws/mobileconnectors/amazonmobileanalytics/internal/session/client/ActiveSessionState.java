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
 * Session Logic for when the Application Session is ACTIVE. ie: The session is
 * running and has not been paused
 *
 * @author Dirk Hortensius [hortensi@amazon.com]
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public final class ActiveSessionState extends SessionClientState {

    private static final String TAG = "ActiveSessoinState";

    public ActiveSessionState(final DefaultSessionClient client) {
        super(client);
    }

    /**
     * If session is running, ignore the resume.
     */
    @Override
    public void resume() {
        // Log Failure
        Log.i(TAG, "Session Resume Failed: Session is already running.");
    }

    /**
     * If the Session is running, pause the session.
     */
    @Override
    public void pause() {
        super.executePause();
    }

    /**
     * If the Session is already running, start a new one only if a specified
     * amount of time has elapsed. The old session should be stopped before
     * starting the new one.
     */
    @Override
    public void start() {
        if (System.currentTimeMillis() - client.session.getStartTime() > client.getRestartDelay()) {
            super.executeStop();
            super.executeStart();
        }
        else {
            Log.i(TAG, "Session Start Failed: Previous session was started too recently");
        }
    }

    /**
     * If the Session is running, stop it.
     */
    @Override
    public void stop() {
        super.executeStop();
    }

}
