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

package com.amazonaws.mobileconnectors.pinpoint.analytics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.StringUtil;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.regex.Pattern;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class SessionObjectTest extends MobileAnalyticsTestBase {

    private static final String DEF_UNIQ_ID = "deadbeef-DEADBEEF-deadbeef-DEADBEEF";

    @Mock
    private AnalyticsClient mockEventClient;
    private PinpointContext mockPinpointContext = Mockito.mock(PinpointContext.class);
    private Session target;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        when(mockPinpointContext.getUniqueId()).thenReturn(DEF_UNIQ_ID);

        target = Session.newInstance(mockPinpointContext);
    }

    @Test(expected = NullPointerException.class)
    public void constructor_NullInsightsContext_ThrowsNullPointer() {
        target = Session.newInstance(null);
    }

    @Test
    public void sessionID_isCorrectFormat() {
        String regex = "^"
                + "[" + Session.SESSION_ID_PAD_CHAR + "a-zA-Z0-9]{"
                + Session.SESSION_ID_UNIQID_LENGTH + "}" + Session.SESSION_ID_DELIMITER
                + "[0-9]{" + Session.SESSION_ID_DATE_FORMAT.length() + "}"
                + Session.SESSION_ID_DELIMITER
                + "[0-9]{" + Session.SESSION_ID_TIME_FORMAT.length() + "}"
                + "$";
        Pattern pattern = Pattern.compile(regex);

        System.out.println("Session id: " + target.getSessionID());
        assertTrue(pattern.matcher(target.getSessionID()).find());
    }

    @Test
    public void sessionID_isCorrectContent() {
        SimpleDateFormat formatter;

        // UniqueID
        String regex = StringUtil.trimOrPadString(DEF_UNIQ_ID, Session.SESSION_ID_UNIQID_LENGTH,
                Session.SESSION_ID_PAD_CHAR);
        Pattern pattern = Pattern.compile(regex);
        assertTrue(pattern.matcher(target.getSessionID()).find());

        // Date
        formatter = new SimpleDateFormat(Session.SESSION_ID_DATE_FORMAT);
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        pattern = Pattern.compile(formatter.format(target.getStartTime()));
        assertTrue(pattern.matcher(target.getSessionID()).find());

        // Time
        formatter = new SimpleDateFormat(Session.SESSION_ID_TIME_FORMAT);
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        pattern = Pattern.compile(formatter.format(target.getStartTime()));
        assertTrue(pattern.matcher(target.getSessionID()).find());

        // Assert Time used was within last 5 seconds
        assertTrue(System.currentTimeMillis() - target.getStartTime() < 5000l);
    }

    @Test
    public void sessionID_padsUniqueID_ifNullorEmpty() {
        String regex = ".*" + Session.SESSION_ID_PAD_CHAR + "{" + Session.SESSION_ID_UNIQID_LENGTH
                + "}.*$";
        Pattern pattern = Pattern.compile(regex);
        assertFalse(pattern.matcher(target.getSessionID()).find());

        when(mockPinpointContext.getUniqueId()).thenReturn("");
        target = Session.newInstance(mockPinpointContext);
        assertTrue(pattern.matcher(target.getSessionID()).find());

        when(mockPinpointContext.getUniqueId()).thenReturn(String.valueOf(""));
        target = Session.newInstance(mockPinpointContext);
        assertTrue(pattern.matcher(target.getSessionID()).find());
    }

    @Test
    public void toJSONObject_isCorrectContent() {
        JSONObject json = target.toJSONObject();

        String regex = ".*" + target.getSessionID() + ".*";
        Pattern pattern = Pattern.compile(regex);
        assertTrue(pattern.matcher(json.toString()).find());

        regex = ".*" + target.getStartTime() + ".*";
        pattern = Pattern.compile(regex);
        assertTrue(pattern.matcher(json.toString()).find());

        long stopT = Long.MIN_VALUE;
        if (target.getStopTime() != null) {
            stopT = target.getStopTime();
        }
        regex = ".*" + stopT + ".*";
        pattern = Pattern.compile(regex);
        assertTrue(pattern.matcher(json.toString()).find());
    }

    @Test
    public void conservesAttributes_whenSerialized() {
        Session ses = Session.getSessionFromSerializedSession(target.toString());
        assertEquals(ses.getSessionID(), target.getSessionID());
        assertEquals(ses.getStartTime(), target.getStartTime());
        assertEquals(ses.getStopTime(), target.getStopTime());

        target.pause();
        ses = Session.getSessionFromSerializedSession(target.toString());
        assertEquals(ses.getSessionID(), target.getSessionID());
        assertEquals(ses.getStartTime(), target.getStartTime());
        assertEquals(ses.getStopTime(), target.getStopTime());
    }
}
