/**
 * Copyright 2016-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;

import static com.amazonaws.mobileconnectors.pinpoint.internal.core.util.Preconditions.checkNotNull;

/**
 * Client for managing starting and stopping sessions which records session
 * events automatically as the session is stopped or started.
 *
 * It is recommended to start the session when the application comes to the foreground
 * and stop the session when it goes to the background.
 *
 * For reference, please refer to MobileHub's sample class AbstractApplicationLifeCycleHelper.
 */
public class SessionClient {

    /**
     * The eventType recorded for session start events
     */
    public static final String SESSION_START_EVENT_TYPE = "_session.start";

    // ~ Event Type Constants ---------------------------=
    /**
     * The eventType recorded for session stop events
     */
    public static final String SESSION_STOP_EVENT_TYPE = "_session.stop";
    /**
     * The eventType recorded for session pause events
     */
    public static final String SESSION_PAUSE_EVENT_TYPE = "_session.pause";
    /**
     * The eventType recorded for session resume events
     */
    public static final String SESSION_RESUME_EVENT_TYPE = "_session.resume";
    protected static final String NO_SESSION_ID = "00000000-00000000";
    protected static final String SHARED_PREFS_SESSION_KEY = "AWSPinpoint.Session";
    private static final Log log = LogFactory
        .getLog(SessionClient.class);
    protected final PinpointContext pinpointContext;

    protected Session session;

    /**
     * CONSTRUCTOR
     *
     * @param pinpointContext The {@link PinpointContext}
     */
    public SessionClient(final PinpointContext pinpointContext) {
        checkNotNull(pinpointContext, "A valid PinpointContext must be provided!");
        checkNotNull(pinpointContext.getAnalyticsClient(), "A valid AnalyticsClient must be provided!");

        this.pinpointContext = pinpointContext;
        final String sessionString = pinpointContext.getSystem().getPreferences().getString(SHARED_PREFS_SESSION_KEY, null);
        if (sessionString != null) {
            this.session = Session.getSessionFromSerializedSession(sessionString);
        }

        if (session != null) {
            pinpointContext.getAnalyticsClient().setSessionId(session.getSessionID());
            pinpointContext.getAnalyticsClient().setSessionStartTime(session.getStartTime());
        } else {
            if (pinpointContext.getPinpointConfiguration().getEnableTargeting()) {
                pinpointContext.getAnalyticsClient().setSessionId(NO_SESSION_ID);
                pinpointContext.getAnalyticsClient().setSessionStartTime(0);
            }
        }
    }

    /**
     * Start a session which records a _session.start event and saves that sessionId
     * to the AnalyticsClient to be used for recording future events.
     *
     * This triggers an update of the endpointProfile.
     *
     * It is recommended to start the session when the application comes to the foreground.
     *
     * For reference, please refer to MobileHub's sample class AbstractApplicationLifeCycleHelper.
     */
    public synchronized void startSession() {
        executeStop();
        executeStart();
    }

    /**
     * Stops a session which records a _session.stop event and flushes the events in localstorage
     * for submission.
     *
     * It is recommended to stop the session when the application goes to the background.
     *
     * For reference, please refer to MobileHub's sample class AbstractApplicationLifeCycleHelper.
     */
    public synchronized void stopSession() {
        executeStop();
    }

    /**
     * Briefly pauses an application session. Should be called in an activity's
     * onPause() method. This records a _session.pause event.
     */
    public synchronized void pauseSession() {
        if (getSessionState().equals(SessionState.ACTIVE)) {
            executePause();
        }
    }

    /**
     * Resumes an application session. Should be called in an activity's onResume() method.
     * This records a _session.resume event.
     */
    public synchronized void resumeSession() {
        if (getSessionState().equals(SessionState.PAUSED)) {
            executeResume();
        } else {
            final AnalyticsEvent e = this.pinpointContext.getAnalyticsClient().createEvent(SESSION_RESUME_EVENT_TYPE);
            this.pinpointContext.getAnalyticsClient().recordEvent(e);

            // log failure
            log.info("Session Resume Failed: No session is paused.");
        }
    }

    /**
     * Overridden toString method for testing
     *
     * @return diagnostic string
     */
    @Override
    public String toString() {
        return "[SessionClient]\n" + "- session: " +
               ((this.session == null) ? "<null>" : this.session.getSessionID()) +
               ((this.session != null && this.session.isPaused()) ? ": paused" : "");
    }

    // - Implementations --------------------------------=
    protected void executeStart() {
        if (this.pinpointContext.getTargetingClient() != null) {
            this.pinpointContext.getTargetingClient().updateEndpointProfile();
        }

        session = Session.newInstance(pinpointContext);

        // Enable event tagging
        this.pinpointContext.getAnalyticsClient().setSessionId(session.getSessionID());
        this.pinpointContext.getAnalyticsClient().setSessionStartTime(session.getStartTime());

        // Fire Session Start Event
        log.info("Firing Session Event: " + SESSION_START_EVENT_TYPE);

        final AnalyticsEvent e = this.pinpointContext.getAnalyticsClient().createEvent(SESSION_START_EVENT_TYPE);
        this.pinpointContext.getAnalyticsClient().recordEvent(e);
    }

    protected void executeStop() {
        // No session to stop
        if (session == null) {
            log.info("Session Stop Failed: No session exists.");
            return;
        }
        // Fire Session Stop Event

        // pause the session if it's not already
        if (!session.isPaused()) {
            session.pause();
        }

        log.info("Firing Session Event: " + SESSION_STOP_EVENT_TYPE);
        final Long stopTime = session.getStopTime() == null ? 0L : session.getStopTime();
        final AnalyticsEvent e = this.pinpointContext.getAnalyticsClient().createEvent(SESSION_STOP_EVENT_TYPE, session.getStartTime(),
                                                                                       stopTime, session.getSessionDuration());

        this.pinpointContext.getAnalyticsClient().recordEvent(e);

        // clear the global campaign attributes.
        this.pinpointContext.getAnalyticsClient().clearCampaignAttributes();

        // Kill Session Object
        session = null;
    }

    /**
     * - Pause the current session object - Fire a Session Pause Event - Persist
     * Session to the file system. (prepares for quiet death)
     */
    protected void executePause() {
        // No session to pause
        if (session == null) {
            log.info("Session Stop Failed: No session exists.");
            return;
        }
        // Set session paused
        session.pause();
        log.debug("Session Paused: " + session.getSessionID());

        // - Fire Session Pause Event ----------------------------=
        log.info("Firing Session Event: " + SESSION_PAUSE_EVENT_TYPE);
        final AnalyticsEvent e = this.pinpointContext.getAnalyticsClient().createEvent(SESSION_PAUSE_EVENT_TYPE, session.getStartTime(),
                                                                                       null, session.getSessionDuration());
        this.pinpointContext.getAnalyticsClient().recordEvent(e);

        // Store session to file system
        pinpointContext.getSystem().getPreferences().putString(SHARED_PREFS_SESSION_KEY, this.session.toString());
    }

    /**
     * - Re-Activate the session - Fire Session Resume Event
     */
    protected void executeResume() {
        // No session to resume
        if (session == null) {
            return;
        }
        // set session active
        session.resume();

        // Fire Session Resume Event
        log.debug("Firing Session Event: " + SESSION_RESUME_EVENT_TYPE);
        final AnalyticsEvent e = this.pinpointContext.getAnalyticsClient().createEvent(SESSION_RESUME_EVENT_TYPE);
        this.pinpointContext.getAnalyticsClient().recordEvent(e);

        // log success
        log.info("Session Resumed: " + session.getSessionID());
    }

    /**
     * Getters
     */
    protected Session getSession() {
        return this.session;
    }

    /**
     * Returns the Application Session's state
     */
    protected SessionState getSessionState() {
        if (this.session != null) {
            return (this.session.isPaused()
                    ? SessionState.PAUSED
                    : SessionState.ACTIVE);
        }
        return SessionState.INACTIVE;
    }

    /**
     * Internal Representation of Application Session's state
     */
    protected static enum SessionState {
        INACTIVE, ACTIVE, PAUSED
    }
}
