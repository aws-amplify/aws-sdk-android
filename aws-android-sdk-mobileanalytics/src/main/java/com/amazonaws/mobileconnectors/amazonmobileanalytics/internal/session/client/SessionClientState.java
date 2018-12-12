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
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.Session;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.client.DefaultSessionClient.SessionState;

/**
 * SESSION LOGIC CLASS Object containing all the functionality of the session
 * client, based on The session state. If the Session is in state X, and there
 * is a call for method Y, the X.Y() will execute; This is the abstract base
 * class for the state objects.
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public abstract class SessionClientState {

    protected final DefaultSessionClient client;

    private static final String TAG = "SessionClientState";

    public SessionClientState(final DefaultSessionClient client) {
        this.client = client;
    }

    public abstract void resume();

    public abstract void pause();

    public abstract void start();

    public abstract void stop();

    // - Implementations --------------------------------=
    protected void executeStart() {
        client.session = Session.newInstance(client.context);

        // Enable event tagging
        client.eventClient.setSessionId(client.session.getSessionID());
        client.eventClient.setSessionStartTime(client.session.getStartTime());

        // Fire Session Start Event
        Log.v(TAG, "Firing Session Event: " + DefaultSessionClient.SESSION_START_EVENT_TYPE);

        AnalyticsEvent e = client.eventClient
                .createEvent(DefaultSessionClient.SESSION_START_EVENT_TYPE);
        client.eventClient.recordEvent(e);

        // State Change to ACTIVE
        client.changeState(SessionState.ACTIVE);
    }

    protected void executeStop() {
        // Fire Session Stop Event

        // pause the session if it's not already
        if (!client.session.isPaused()) {
            client.session.pause();
        }

        Log.v(TAG, "Firing Session Event: " + DefaultSessionClient.SESSION_STOP_EVENT_TYPE);
        Long stopTime = client.session.getStopTime() == null ? 0L : client.session.getStopTime();
        AnalyticsEvent e = client.eventClient.createInternalEvent(
                DefaultSessionClient.SESSION_STOP_EVENT_TYPE, client.session.getStartTime(),
                stopTime, client.session.getSessionDuration());

        client.eventClient.recordEvent(e);

        // Kill Session Object
        client.session = null;

        // State change to INACTIVE
        client.changeState(SessionState.INACTIVE);
    }

    /**
     * - Pause the current session object - Fire a Session Pause Event - Persist
     * Session to the file system. (prepares for quiet death)
     */
    protected void executePause() {
        // Set session paused
        client.session.pause();
        Log.d(TAG, "Session Paused: " + client.session.getSessionID());

        // - Fire Session Pause Event ----------------------------=
        Log.v(TAG, "Firing Session Event: " + DefaultSessionClient.SESSION_PAUSE_EVENT_TYPE);
        AnalyticsEvent e = client.eventClient.createInternalEvent(
                DefaultSessionClient.SESSION_PAUSE_EVENT_TYPE, client.session.getStartTime(), null,
                client.session.getSessionDuration());
        client.eventClient.recordEvent(e);

        // Store session to file system
        client.sessionStore.storeSession(client.session);

        // State change to PAUSED
        client.changeState(SessionState.PAUSED);
    }

    /**
     * - Re-Activate the session - Fire Session Resume Event
     */
    protected void executeResume() {
        // set session active
        client.session.resume();

        // Fire Session Resume Event
        Log.d(TAG, "Firing Session Event: " + DefaultSessionClient.SESSION_RESUME_EVENT_TYPE);
        AnalyticsEvent e = client.eventClient
                .createEvent(DefaultSessionClient.SESSION_RESUME_EVENT_TYPE);
        client.eventClient.recordEvent(e);

        // log success
        Log.i(TAG, "Session Resumed: " + client.session.getSessionID());

        // State changed to ACTIVE
        client.changeState(SessionState.ACTIVE);
    }

}
