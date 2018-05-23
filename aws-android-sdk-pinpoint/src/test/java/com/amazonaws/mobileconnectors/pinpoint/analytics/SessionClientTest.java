/**
 * Copyright 2016-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import com.amazonaws.mobileconnectors.pinpoint.PinpointConfiguration;
import com.amazonaws.mobileconnectors.pinpoint.analytics.utils.AnalyticsContextBuilder;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.configuration.AndroidPreferencesConfiguration;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.MockSystem;
import com.amazonaws.mobileconnectors.pinpoint.targeting.TargetingClient;

import static com.amazonaws.mobileconnectors.pinpoint.analytics.SessionClient.SESSION_PAUSE_EVENT_TYPE;
import static com.amazonaws.mobileconnectors.pinpoint.analytics.SessionClient.SESSION_RESUME_EVENT_TYPE;
import static com.amazonaws.mobileconnectors.pinpoint.analytics.SessionClient.SESSION_START_EVENT_TYPE;
import static com.amazonaws.mobileconnectors.pinpoint.analytics.SessionClient.SESSION_STOP_EVENT_TYPE;
import static com.amazonaws.mobileconnectors.pinpoint.analytics.SessionClient.SHARED_PREFS_SESSION_KEY;
import static com.amazonaws.mobileconnectors.pinpoint.analytics.SessionClient.SessionState;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class SessionClientTest extends MobileAnalyticsTestBase {
    private static final String UNIQUE_ID = "deadbeef-DEADBEEF-deadbeef-DEADBEEF";
    private static final String SDK_NAME = "AppIntelligenceSDK-Analytics";
    private static final String SDK_VERSION = "test";

    private PinpointContext mockPinpointContext;

    @Mock
    private AnalyticsClient mockAnalyticsClient;
    @Mock
    private TargetingClient mockTargetingClient;
    @Mock
    private AndroidPreferencesConfiguration mockConfiguration;
    @Mock
    private PinpointConfiguration mockPinpointConfiguration;

    private SessionClient target;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        this.mockPinpointContext = new AnalyticsContextBuilder()
                                           .withSdkInfo(SDK_NAME, SDK_VERSION)
                                           .withUniqueIdValue(UNIQUE_ID)
                                           .withConfiguration(mockConfiguration)
                                           .withContext(RuntimeEnvironment.application
                                                                .getApplicationContext())
                                           .withSystem(new MockSystem("SESSION_CLIENT.test"))
                                           .build();

        when(mockPinpointContext.getAnalyticsClient())
                .thenReturn(mockAnalyticsClient);
        when(mockPinpointContext.getTargetingClient())
                .thenReturn(mockTargetingClient);
        when(mockPinpointContext.getConfiguration())
                .thenReturn(mockConfiguration);
        when(mockPinpointContext.getPinpointConfiguration())
                .thenReturn(mockPinpointConfiguration);
        target = new SessionClient(mockPinpointContext);
        System.out.print(target.toString());
    }

    @After
    public void teardown() {
        target.stopSession();
    }

    @Test(expected = NullPointerException.class)
    public void constructor_NullContext_ThrowsNullPointer() {
        target = new SessionClient(null);
    }

    // ~ START SESSION
    // =========================================================================
    // ~\\
    //
    @Test
    public void startSession_sessionIsActive_SetsNewSession() throws InterruptedException {
        target.startSession();
        String firstSessionId = target.getSession().getSessionID();
        long firstStartTime = target.getSession().getStartTime();
        verify(mockAnalyticsClient, times(1)).setSessionId(firstSessionId);
        verify(mockAnalyticsClient, times(1)).setSessionStartTime(firstStartTime);

        target.getSession().getStartTime();
        // TODO Add salt to session name to prevent same name
        Thread.sleep(100);
        target.startSession();

        String secondSessionId = target.getSession().getSessionID();
        long secondStartTime = target.getSession().getStartTime();

        assertNotEquals(firstSessionId, secondSessionId);
        assertNotEquals(firstStartTime, secondStartTime);

        verify(mockAnalyticsClient, times(1)).setSessionId(secondSessionId);
        verify(mockAnalyticsClient, times(1)).setSessionStartTime(secondStartTime);

    }

    @Test
    public void
    startSession_sessionIsActive_startsNewSession() {
        target = new SessionClient(mockPinpointContext);
        target.startSession();

        Session session = target.getSession();
        assertThat(session.isPaused(), is(false));
        target.startSession();

        // assert the old session was paused and the a new session is now
        // active
        assertThat(session.isPaused(), is(true));
        assertThat(target.getSession(), is(not(session)));

        verify(mockAnalyticsClient, times(2)).createEvent(
            eq(SESSION_START_EVENT_TYPE));
        verify(mockAnalyticsClient, times(1)).createEvent(
            eq(SESSION_STOP_EVENT_TYPE),
            any(Long.class),
            any(Long.class),
            any(Long.class));

    }

    @Test
    public void startSession_firesStartEvent() {
        target.startSession();
        verify(mockAnalyticsClient, times(1)).createEvent(
                                                                 eq(SESSION_START_EVENT_TYPE));
    }

    @Test
    public void startSession_stateChangedToActive() {
        target.startSession();
        assertEquals(target.getSessionState(),
                            SessionState.ACTIVE);
    }

    @Test
    public void startSession_sessionIsPaused_firesStopEvent_firesStartEvent()
            throws InterruptedException {
        target.startSession();
        Thread.sleep(50);
        target.pauseSession();

        target.startSession();

        verify(mockAnalyticsClient, times(1)).createEvent(
                                                                 eq(SESSION_PAUSE_EVENT_TYPE),
                                                                 any(Long.class),
                                                                 any(Long.class),
                                                                 any(Long.class));
        verify(mockAnalyticsClient, times(1)).createEvent(
                                                                 eq(SESSION_STOP_EVENT_TYPE),
                                                                 any(Long.class),
                                                                 any(Long.class),
                                                                 any(Long.class));
        verify(mockAnalyticsClient, times(2)).createEvent(
                                                                 eq(SESSION_START_EVENT_TYPE));

    }

    @Test
    public void startSession_sessionIsPaused_stateChangedToActive() {
        target.startSession();
        target.pauseSession();

        target.startSession();
        assertEquals(target.getSessionState(),
                            SessionState.ACTIVE);
    }

    @Test
    public void
    startSession_previousPausedSessionColdStart_fireStopEvent_firesStartEvent()
            throws InterruptedException {

        Session mockSession = new Session("BEEFY_MKBEEF_CAKES", "0", "12345");

        // initialize session client with a pending session that needs to be closed
        //Save session to user defaults
        mockPinpointContext.getSystem().getPreferences()
                .putString(SHARED_PREFS_SESSION_KEY, mockSession.toString());

        SessionClient coldStartTarget = new
                                                SessionClient(mockPinpointContext);

        assertThat(coldStartTarget.getSession(), is(notNullValue()));
        assertThat(coldStartTarget.getSessionState(), is(SessionState.PAUSED));

        // starting a session should close the pending one
        coldStartTarget.startSession();
        verify(mockAnalyticsClient, times(1)).createEvent(
                                                                 SESSION_STOP_EVENT_TYPE,
                                                                 mockSession
                                                                         .getStartTime(),
                                                                 mockSession
                                                                         .getStopTime(),
                                                                 mockSession
                                                                         .getSessionDuration()
                                                                         .longValue());
        verify(mockAnalyticsClient, times(1)).createEvent(
                                                                 eq(SESSION_STOP_EVENT_TYPE),
                                                                 any(Long.class),
                                                                 any(Long.class),
                                                                 any(Long.class));

    }

    @Test
    public void stopSession_sessionIsInactive_doesNotFireStopEvent() {
        target.stopSession();
        target.startSession();
        target.stopSession();
        target.stopSession();
        target.stopSession();
        verify(mockAnalyticsClient, times(1)).createEvent(
                                                                 eq(SESSION_STOP_EVENT_TYPE),
                                                                 any(Long.class),
                                                                 any(Long.class),
                                                                 any(Long.class));
    }

    @Test
    public void stopSession_getStopTime() {
        target.startSession();

        Session originalSession = target.getSession();
        target.stopSession();

        assertTrue(System.currentTimeMillis() - originalSession.getStopTime() <
                           100);
    }

    @Test
    public void stopSession_multipleStops_stopTimeNotChanged() throws
            InterruptedException {
        target.startSession();

        Session originalSession = target.getSession();
        target.stopSession();
        long originalStopTime = originalSession.getStopTime();

        Thread.sleep(500);
        target.stopSession();

        assertTrue(originalStopTime == originalSession.getStopTime());
    }

    @Test
    public void stopSession_sessionIsActive_firesStopEvent() throws
            InterruptedException {
        target.startSession();

        Thread.sleep(50);

        long startTime = target.getSession().getStartTime();
        target.stopSession();
        // After this call session is null, so we cannot get the stop/duration
        // time

        verify(mockAnalyticsClient, times(1)).createEvent(
                                                                 eq(SESSION_STOP_EVENT_TYPE),
                                                                 eq(startTime),
                                                                 any(Long.class),
                                                                 any(Long.class));
        assertTrue(target.getSessionState().equals(SessionState.INACTIVE));
    }

    @Test
    public void stopSession_sessionIsActive_pausesOldSession() {
        target.startSession();
        Session session = target.getSession();

        assertThat(session.isPaused(), is(false));

        target.stopSession();

        assertThat(session.isPaused(), is(true));
        assertThat(target.getSession(), is(nullValue()));
    }

    @Test
    public void stopSession_sessionIsActive_stateChangedToInactive() {
        target.startSession();
        target.stopSession();
        assertEquals(target.getSessionState(),
                            SessionState.INACTIVE);
    }

    @Test
    public void stopSession_sessionIsPaused_firesStopEvent() throws
            InterruptedException {
        target.startSession();
        Thread.sleep(50);
        target.pauseSession();
        Session originalSession = target.getSession();
        target.stopSession();

        verify(mockAnalyticsClient, times(1)).createEvent(
                                                                 SESSION_STOP_EVENT_TYPE,
                                                                 originalSession
                                                                         .getStartTime(),
                                                                 originalSession
                                                                         .getStopTime(),
                                                                 originalSession
                                                                         .getSessionDuration()
                                                                         .longValue());
    }

    @Test
    public void stopSession_sessionIsPaused_stateChangedToInactive() {
        target.startSession();
        target.pauseSession();
        target.stopSession();
        assertEquals(target.getSessionState(),
                            SessionState.INACTIVE);
    }

    @Test
    public void pauseSession_sessionIsActive_firesPauseEvent() {
        target.startSession();
        target.pauseSession();
        verify(mockAnalyticsClient, times(1)).createEvent(
                                                                 eq(SESSION_PAUSE_EVENT_TYPE),
                                                                 any(Long.class),
                                                                 any(Long.class),
                                                                 any(Long.class));
    }

    @Test
    public void pauseSession_sessionIsActive_stateChangedToPaused() {
        target.startSession();
        target.pauseSession();
        assertEquals(target.getSessionState(),
                            SessionState.PAUSED);
    }

    @Test
    public void pauseSession_sessionIsInactive_firesNoEvent() {
        target.pauseSession();
        target.pauseSession();
        target.pauseSession();
        verify(mockAnalyticsClient, times(0)).createEvent(any(String.class));
        verify(mockAnalyticsClient, times(0)).createEvent(
                                                                 any(String.class),
                                                                 any(Long.class),
                                                                 any(Long.class),
                                                                 any(Long.class));
    }

    @Test
    public void pauseSession_sessionIsInactive_stateIsNotChanged() {
        target.pauseSession();
        target.pauseSession();
        target.pauseSession();
        assertEquals(target.getSessionState(),
                            SessionState.INACTIVE);
    }

    @Test
    public void pauseSession_sessionIsPaused_doesNotFirePauseEvent() {
        target.startSession();
        target.pauseSession();
        target.pauseSession();
        target.pauseSession();
        verify(mockAnalyticsClient, times(1)).createEvent(
                                                                 eq(SESSION_PAUSE_EVENT_TYPE),
                                                                 any(Long.class),
                                                                 any(Long.class),
                                                                 any(Long.class));
    }

    @Test
    public void resumeSession_sessionIsActive_doesNotFireResumeEvent() {
        target.startSession();
        target.resumeSession();
        target.resumeSession();
        target.resumeSession();
        verify(mockAnalyticsClient, times(0)).createEvent(
                                                                 eq(SESSION_RESUME_EVENT_TYPE),
                                                                 any(Long.class),
                                                                 any(Long.class),
                                                                 any(Long.class));
    }

    @Test
    public void resumeSession_sessionIsInactive_firesBlankResumeEvent() {
        target.resumeSession();
        target.resumeSession();
        target.resumeSession();
        verify(mockAnalyticsClient, times(3)).createEvent(
                                                                 eq(SESSION_RESUME_EVENT_TYPE));
    }

    @Test
    public void resumeSession_sessionIsInactive_stateIsNotChanged() {
        target.resumeSession();
        assertEquals(target.getSessionState(),
                            SessionState.INACTIVE);
    }
}
