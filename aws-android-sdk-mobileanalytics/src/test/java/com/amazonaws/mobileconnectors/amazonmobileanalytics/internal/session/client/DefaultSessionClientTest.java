/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.client;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.MobileAnalyticsTestBase;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.configuration.Configuration;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.DefaultEventClient;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.InternalEventClient;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.Session;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.SessionStore;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session.client.DefaultSessionClient.SessionState;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.utils.AnalyticsContextBuilder;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class DefaultSessionClientTest extends MobileAnalyticsTestBase {

    private static final String UNIQUE_ID = "deadbeef-DEADBEEF-deadbeef-DEADBEEF";
    private static final String SDK_NAME = "AppIntelligenceSDK-Analytics";
    private static final String SDK_VERSION = "test";

    private InternalEventClient mockEventClient;
    @Mock
    private AnalyticsContext mockInsightsContext;
    @Mock
    private Configuration mockConfiguration;

    private DefaultSessionClient target;

    private class TestSessionStore implements SessionStore {

        private Session session = null;

        @Override
        public void storeSession(Session session) {
            this.session = session;
        }

        @Override
        public Session getSession() {
            return this.session;
        }

    }

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        when(
                mockConfiguration.optLong(eq(DefaultSessionClient.RESTART_DELAY_CONFIG_KEY),
                        eq(DefaultSessionClient.DEFAULT_RESTART_DELAY))).thenReturn(300l);
        when(
                mockConfiguration.optLong(eq(DefaultSessionClient.RESUME_DELAY_CONFIG_KEY),
                        eq(DefaultSessionClient.DEFAULT_RESUME_DELAY))).thenReturn(100l);

        this.mockInsightsContext = new AnalyticsContextBuilder()
                .withSdkInfo(SDK_NAME, SDK_VERSION)
                .withUniqueIdValue(UNIQUE_ID)
                .withConfiguration(mockConfiguration)
                .build();

        mockEventClient = Mockito.mock(DefaultEventClient.class);

        target = new DefaultSessionClient(mockInsightsContext, mockEventClient,
                new TestSessionStore());
    }

    @Test(expected = NullPointerException.class)
    public void constructor_NullEventClient_ThrowsNullPointer() {
        target = new DefaultSessionClient(mockInsightsContext, null, new TestSessionStore());
    }

    @Test(expected = NullPointerException.class)
    public void constructor_NullInsightsContext_ThrowsNullPointer() {
        target = new DefaultSessionClient(null, mockEventClient, new TestSessionStore());
    }

    @Test(expected = NullPointerException.class)
    public void constructor_NullSessionStore_ThrowsNullPointer() {
        target = new DefaultSessionClient(mockInsightsContext, mockEventClient, null);
    }

    // ~ START SESSION
    // =========================================================================
    // ~\\
    //
    @Test
    public void startSession_sessionIsActive_doesNotSetNewSession_ifWithinTimeInterval() {
        target.startSession();

        long pTime = target.getSession().getStartTime();
        target.startSession();
        System.out.print(target.getRestartDelay() + "");

        assertTrue(System.currentTimeMillis() - pTime < target.getRestartDelay());
        verify(mockEventClient, times(1))
                .createEvent(DefaultSessionClient.SESSION_START_EVENT_TYPE);

        String firstSessionId = target.getSession().getSessionID();
        long firstStartTime = target.getSession().getStartTime();
        assertTrue(target.state instanceof ActiveSessionState);

        pTime = target.getSession().getStartTime();
        target.startSession();
        assertTrue(System.currentTimeMillis() - pTime < target.getRestartDelay());

        assertEquals(firstSessionId, target.getSession().getSessionID());
        assertEquals(firstStartTime, target.getSession().getStartTime());
        verify(mockEventClient, times(1)).setSessionId(firstSessionId);
        verify(mockEventClient, times(1)).setSessionStartTime(firstStartTime);

    }

    @Test
    public void startSession_sessionIsActive_doesNotStartNewSession_ifWithinTimeInterval() {
        target.startSession();

        long pTime = target.getSession().getStartTime();
        target.startSession();
        assertTrue(System.currentTimeMillis() - pTime < target.getRestartDelay());

        pTime = target.getSession().getStartTime();
        target.startSession();
        assertTrue(System.currentTimeMillis() - pTime < target.getRestartDelay());

        verify(mockEventClient, times(1)).createEvent(
                eq(DefaultSessionClient.SESSION_START_EVENT_TYPE));
    }

    @Test
    public void startSession_sessionIsActive_SetsNewSession_ifOutsideTimeInterval() {
        target.startSession();
        String firstSessionId = target.getSession().getSessionID();
        long firstStartTime = target.getSession().getStartTime();
        verify(mockEventClient, times(1)).setSessionId(firstSessionId);
        verify(mockEventClient, times(1)).setSessionStartTime(firstStartTime);

        try {
            Thread.sleep(target.getRestartDelay() + 50l);
            long pTime = target.getSession().getStartTime();
            target.startSession();
            System.out.print(target.getRestartDelay() + "");
            assertTrue(System.currentTimeMillis() - pTime > target.getRestartDelay());

            String secondSessionId = target.getSession().getSessionID();
            long secondStartTime = target.getSession().getStartTime();

            assertNotEquals(firstSessionId, secondSessionId);
            assertNotEquals(firstStartTime, secondStartTime);

            verify(mockEventClient, times(1)).setSessionId(secondSessionId);
            verify(mockEventClient, times(1)).setSessionStartTime(secondStartTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void
            startSession_sessionIsActive_startsNewSession_ifOutsideTimeInterval() {
        target.startSession();

        try {
            Session session = target.getSession();
            assertThat(session.isPaused(), is(false));
            Thread.sleep(target.getRestartDelay() + 50l);
            target.startSession();

            // assert the old session was paused and the a new session is now
            // active
            assertThat(session.isPaused(), is(true));
            assertThat(target.getSession(), is(not(session)));

            verify(mockEventClient, times(2)).createEvent(
                    eq(DefaultSessionClient.SESSION_START_EVENT_TYPE));
            verify(mockEventClient, times(1)).createInternalEvent(
                    eq(DefaultSessionClient.SESSION_STOP_EVENT_TYPE), any(Long.class),
                    any(Long.class), any(Long.class));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void startSession_firesStartEvent() {
        target.startSession();
        verify(mockEventClient, times(1)).createEvent(
                eq(DefaultSessionClient.SESSION_START_EVENT_TYPE));
    }

    @Test
    public void startSession_stateChangedToActive() {
        target.startSession();
        assertEquals(target.getSessionState(),
                DefaultSessionClient.SessionState.ACTIVE);
    }

    @Test
    public void startSession_sessionIsPaused_firesStopEvent_firesStartEvent()
            throws InterruptedException {
        target.startSession();
        Thread.sleep(50);
        target.pauseSession();

        target.startSession();

        verify(mockEventClient, times(1)).createInternalEvent(
                eq(DefaultSessionClient.SESSION_PAUSE_EVENT_TYPE), any(Long.class),
                any(Long.class),
                any(Long.class));
        verify(mockEventClient, times(1)).createInternalEvent(
                eq(DefaultSessionClient.SESSION_STOP_EVENT_TYPE), any(Long.class), any(Long.class),
                any(Long.class));
        verify(mockEventClient, times(2)).createEvent(
                eq(DefaultSessionClient.SESSION_START_EVENT_TYPE));

    }

    @Test
    public void startSession_sessionIsPaused_stateChangedToActive() {
        target.startSession();
        target.pauseSession();

        target.startSession();
        assertEquals(target.getSessionState(),
                DefaultSessionClient.SessionState.ACTIVE);
    }

    @Test
    public void
            startSession_previousPausedSessionColdStart_fireStopEvent_firesStartEvent()
                    throws InterruptedException {

        Session mockSession = Mockito.mock(Session.class);
        when(mockSession.getSessionDuration()).thenReturn(Long.valueOf(12345l));
        when(mockSession.getSessionID()).thenReturn("BEEFY_MKBEEF_CAKES");
        when(mockSession.getStartTime()).thenReturn(0l);
        when(mockSession.getStopTime()).thenReturn(Long.valueOf(12345l));
        when(mockSession.isPaused()).thenReturn(true);

        TestSessionStore mockSessionStore = new TestSessionStore();
        mockSessionStore.storeSession(mockSession);

        // initialize session client with a pending session that needs to be
        // closed
        DefaultSessionClient coldStartTarget = new
                DefaultSessionClient(mockInsightsContext, mockEventClient,
                        mockSessionStore);
        assertThat(coldStartTarget.getSession(), is(notNullValue()));
        assertThat(coldStartTarget.getSessionState(), is(SessionState.PAUSED));

        // starting a session should close the pending one
        coldStartTarget.startSession();
        verify(mockEventClient, times(1)).createInternalEvent(
                DefaultSessionClient.SESSION_STOP_EVENT_TYPE, mockSession.getStartTime(),
                mockSession.getStopTime(), mockSession.getSessionDuration().longValue());
        verify(mockEventClient, times(1)).createInternalEvent(
                eq(DefaultSessionClient.SESSION_STOP_EVENT_TYPE), any(Long.class), any(Long.class),
                any(Long.class));

    }

    // //
    // //~
    // =======================================================================================
    // ~//
    //
    //
    //
    //
    // //~ STOP SESSION
    // ==========================================================================
    // ~\\
    // //
    @Test
    public void stopSession_sessionIsInactive_doesNotFireStopEvent() {
        target.stopSession();
        target.startSession();
        target.stopSession();
        target.stopSession();
        target.stopSession();
        verify(mockEventClient, times(1)).createInternalEvent(
                eq(DefaultSessionClient.SESSION_STOP_EVENT_TYPE), any(Long.class), any(Long.class),
                any(Long.class));
    }

    @Test
    public void stopSession_getStopTime() {
        target.startSession();

        Session originalSession = target.getSession();
        target.stopSession();

        assertTrue(System.currentTimeMillis() - originalSession.getStopTime() < 100);
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

        verify(mockEventClient, times(1)).createInternalEvent(
                eq(DefaultSessionClient.SESSION_STOP_EVENT_TYPE), eq(startTime), any(Long.class),
                any(Long.class));
        assertTrue(target.state instanceof InactiveSessionState);
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
                DefaultSessionClient.SessionState.INACTIVE);
    }

    @Test
    public void stopSession_sessionIsPaused_firesStopEvent() throws
            InterruptedException {
        target.startSession();
        Thread.sleep(50);
        target.pauseSession();
        Session originalSession = target.getSession();
        target.stopSession();

        verify(mockEventClient, times(1)).createInternalEvent(
                DefaultSessionClient.SESSION_STOP_EVENT_TYPE, originalSession.getStartTime(),
                originalSession.getStopTime(),
                originalSession.getSessionDuration().longValue());
    }

    @Test
    public void stopSession_sessionIsPaused_stateChangedToInactive() {
        target.startSession();
        target.pauseSession();
        target.stopSession();
        assertEquals(target.getSessionState(),
                DefaultSessionClient.SessionState.INACTIVE);
    }

    // //
    // //~
    // ======================================================================================
    // ~//
    //
    //
    //
    //
    // //~ PAUSE SESSION
    // =========================================================================
    // ~\\
    // //
    @Test
    public void pauseSession_sessionIsActive_firesPauseEvent() {
        target.startSession();
        target.pauseSession();
        verify(mockEventClient, times(1)).createInternalEvent(
                eq(DefaultSessionClient.SESSION_PAUSE_EVENT_TYPE), any(Long.class),
                any(Long.class),
                any(Long.class));
    }

    @Test
    public void pauseSession_sessionIsActive_stateChangedToPaused() {
        target.startSession();
        target.pauseSession();
        assertEquals(target.getSessionState(),
                DefaultSessionClient.SessionState.PAUSED);
    }

    @Test
    public void pauseSession_sessionIsInactive_firesNoEvent() {
        target.pauseSession();
        target.pauseSession();
        target.pauseSession();
        verify(mockEventClient, times(0)).createEvent(any(String.class));
        verify(mockEventClient, times(0)).createInternalEvent(
                any(String.class), any(Long.class),
                any(Long.class),
                any(Long.class));
    }

    @Test
    public void pauseSession_sessionIsInactive_stateIsNotChanged() {
        target.pauseSession();
        target.pauseSession();
        target.pauseSession();
        assertEquals(target.getSessionState(),
                DefaultSessionClient.SessionState.INACTIVE);
    }

    @Test
    public void pauseSession_sessionIsPaused_doesNotFirePauseEvent() {
        target.startSession();
        target.pauseSession();
        target.pauseSession();
        target.pauseSession();
        verify(mockEventClient, times(1)).createInternalEvent(
                eq(DefaultSessionClient.SESSION_PAUSE_EVENT_TYPE), any(Long.class),
                any(Long.class),
                any(Long.class));
    }

    // //
    // //~
    // =======================================================================================
    // ~//
    //
    //
    //
    //
    // //~ RESUME SESSION
    // ========================================================================
    // ~\\
    // //
    @Test
    public void resumeSession_sessionIsActive_doesNotFireResumeEvent() {
        target.startSession();
        target.resumeSession();
        target.resumeSession();
        target.resumeSession();
        verify(mockEventClient, times(0)).createInternalEvent(
                eq(DefaultSessionClient.SESSION_RESUME_EVENT_TYPE), any(Long.class),
                any(Long.class),
                any(Long.class));
    }

    @Test
    public void resumeSession_sessionIsInactive_firesBlankResumeEvent() {
        target.resumeSession();
        target.resumeSession();
        target.resumeSession();
        verify(mockEventClient, times(3)).createEvent(
                eq(DefaultSessionClient.SESSION_RESUME_EVENT_TYPE));
    }

    @Test
    public void resumeSession_sessionIsInactive_stateIsNotChanged() {
        target.resumeSession();
        assertEquals(target.getSessionState(),
                DefaultSessionClient.SessionState.INACTIVE);
    }

    @Test
    public void
            resumeSession_sessionIsPaused_firesResumeEvent_ifWithinTimeInterval() {
        target.startSession();
        target.pauseSession();

        long pTime = target.getSession().getStopTime();
        target.resumeSession();

        assertTrue(System.currentTimeMillis() - pTime < target.getResumeDelay());
        verify(mockEventClient, times(1)).createEvent(
                DefaultSessionClient.SESSION_RESUME_EVENT_TYPE);
    }

    @Test
    public void
            resumeSession_sessionIsPaused_stateIsChanged_ifWithinTimeInterval() {
        target.startSession();
        target.pauseSession();

        long pTime = target.getSession().getStopTime();
        target.resumeSession();

        assertTrue(System.currentTimeMillis() - pTime < target.getResumeDelay());
        assertEquals(target.getSessionState(),
                DefaultSessionClient.SessionState.ACTIVE);
    }

    @Test
    public void
            resumeSession_sessionIsPaused_doesNotStartNewSession_ifWithinTimeInterval()
    {
        target.startSession();
        target.pauseSession();

        long pTime = target.getSession().getStopTime();
        target.resumeSession();

        assertTrue(System.currentTimeMillis() - pTime < target.getResumeDelay());
        verify(mockEventClient, times(1)).createEvent(
                eq(DefaultSessionClient.SESSION_START_EVENT_TYPE));

    }

    @Test
    public void
            resumeSession_sessionIsPaused_startsNewSession_ifOutsideTimeInterval()
                    throws InterruptedException {
        target.startSession();
        Thread.sleep(50);
        Session originalSession = target.getSession();
        target.pauseSession();

        String pSesId = target.getSession().getSessionID();
        try {
            Thread.sleep(target.getResumeDelay() + 50l);
            target.resumeSession();

            verify(mockEventClient, times(0)).createInternalEvent(
                    eq(DefaultSessionClient.SESSION_RESUME_EVENT_TYPE), any(Long.class),
                    any(Long.class),
                    any(Long.class));
            verify(mockEventClient, times(2)).createEvent(
                    eq(DefaultSessionClient.SESSION_START_EVENT_TYPE));
            verify(mockEventClient, times(1)).createInternalEvent(
                    DefaultSessionClient.SESSION_STOP_EVENT_TYPE, originalSession.getStartTime(),
                    originalSession.getStopTime(),
                    originalSession.getSessionDuration().longValue());
            assertEquals(target.getSessionState(),
                    DefaultSessionClient.SessionState.ACTIVE);
            assertFalse(target.getSession().getSessionID().equals(pSesId));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //
    // ~
    // ======================================================================================
    // ~//
}
