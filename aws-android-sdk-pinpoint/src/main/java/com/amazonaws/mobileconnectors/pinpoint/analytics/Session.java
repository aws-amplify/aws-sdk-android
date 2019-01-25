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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import org.json.JSONException;
import org.json.JSONObject;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.JSONBuilder;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.JSONSerializable;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.StringUtil;

import static com.amazonaws.mobileconnectors.pinpoint.internal.core.util.Preconditions.checkNotNull;

/**
 * A Session Object Mostly immutable, with the exception of its stop time. This
 * session object tracks whether or not it has been paused by checking the
 * status of it's stop time. A session's stop time is only set when the session
 * has been paused, and is set to -1 if it is currently running. Can be
 * serialized and restored for persistence.
 */
public class Session implements JSONSerializable {

    // - Session ID configuration constants -------------------------=
    protected static final String SESSION_ID_DATE_FORMAT = "yyyyMMdd";
    protected static final String SESSION_ID_TIME_FORMAT = "HHmmssSSS";
    protected static final char SESSION_ID_DELIMITER = '-';
    protected static final char SESSION_ID_PAD_CHAR = '_';
    protected static final int SESSION_ID_APPKEY_LENGTH = 8;
    protected static final int SESSION_ID_UNIQID_LENGTH = 8;
    private static final Log LOGGER = LogFactory.getLog(Session.class);
    // - JSON/Serialization constants -------------------------------=
    private static final String JSON_SESSION_ID_ATTR = "session_id";
    private static final String JSON_START_TIME_ATTR = "start_time";
    private static final String JSON_STOP_TIME_ATTR = "stop_time";
    private static final int INDENTATION = 4;
    // - Field Declarations -----------------------------------------=
    private final DateFormat sessionIdTimeFormat;
    private final String sessionID;
    private final Long startTime;
    private Long stopTime = null;

    /**
     * CONSTRUCTOR - ACTUAL Used by SessionClient
     *
     * @param context
     */
    protected Session(final PinpointContext context) {
        checkNotNull(context, "A valid PinpointContext must be provided!");

        this.sessionIdTimeFormat = new SimpleDateFormat(SESSION_ID_DATE_FORMAT + SESSION_ID_DELIMITER + SESSION_ID_TIME_FORMAT, Locale.US);
        this.sessionIdTimeFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.startTime = System.currentTimeMillis();
        this.stopTime = null;
        this.sessionID = this.generateSessionID(context);
    }

    /**
     * Used by deserealizer
     *
     * @param sessionID
     * @param startTime
     * @param stopTime
     */
    protected Session(final String sessionID, final String startTime, final String stopTime) {
        this.sessionIdTimeFormat = new SimpleDateFormat(SESSION_ID_DATE_FORMAT + SESSION_ID_DELIMITER + SESSION_ID_TIME_FORMAT, Locale.US);
        this.sessionIdTimeFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

        Scanner s = new Scanner(startTime);
        this.startTime = s.nextLong();
        s = new Scanner(stopTime);
        this.stopTime = s.nextLong();
        this.sessionID = sessionID;

        if (this.stopTime == Long.MIN_VALUE) {
            this.stopTime = null;
        }
    }

    /**
     * STATIC FACTORY
     *
     * @param context The {@link PinpointContext}
     * @return new Session object
     */
    public static Session newInstance(final PinpointContext context) {
        return new Session(context);
    }

    /**
     * Re-Generates a session object that has been serialized Returns null if
     * the input is null
     *
     * @param serializedSession - a Session's serialization string.
     * @return a session object identical to the one that was serialized
     */
    public static Session getSessionFromSerializedSession(final String serializedSession) {
        Session s = null;
        if (StringUtil.isBlank(serializedSession)) {
            return s;
        }

        try {
            final JSONObject json = new JSONObject(serializedSession);
            final String sessionID = json.getString(JSON_SESSION_ID_ATTR);
            final String startTime = json.getString(JSON_START_TIME_ATTR);
            final String stopTime = json.getString(JSON_STOP_TIME_ATTR);

            s = new Session(sessionID, startTime, stopTime);
        } catch (final JSONException e) {
            e.printStackTrace();
        }

        return s;
    }

    /**
     * Session is considered paused if stopTime is not null
     *
     * @return true iff session is currently paused
     */
    public boolean isPaused() {
        return (this.stopTime != null);
    }

    /**
     * Pauses the session object. Generates a stop time.
     */
    public void pause() {
        if (!isPaused()) {
            this.stopTime = System.currentTimeMillis();
        }
    }

    /**
     * Resumes the session object. Invalidates the stop time.
     */
    public void resume() {
        this.stopTime = null;
    }

    /**
     * Calculates and returns the session's duration Returns a duration of 0 if
     * session is not paused or the system clock has been tampered with.
     *
     * @return session duration in milliseconds
     */
    public Long getSessionDuration() {
        Long time = this.stopTime;
        if (time == null) {
            time = System.currentTimeMillis();
        }

        if (time < this.startTime) {
            return 0L;
        }

        Long sessionLength = -1L;
        try {
            sessionLength = time - this.startTime;
        } catch (final NumberFormatException e) {
            LOGGER.error("error parsing session duration", e);
        }
        return sessionLength;
    }

    /**
     * Generates Session ID by concatenating present AppKey, UniqueID, and
     * <AppKey>-<UniqueID>-yyyyMMdd-HHmmssSSS
     *
     * @param context The {@link PinpointContext}
     * @return [String] SessionID
     */
    public String generateSessionID(final PinpointContext context) {
        final String uniqID = context.getUniqueId();
        final String time = this.sessionIdTimeFormat.format(this.startTime);
        return StringUtil.trimOrPadString(uniqID, SESSION_ID_UNIQID_LENGTH, SESSION_ID_PAD_CHAR) + SESSION_ID_DELIMITER + time;
    }

    @Override
    public JSONObject toJSONObject() {
        Long stopT = this.stopTime;
        if (stopT == null) {
            stopT = Long.MIN_VALUE;
        }

        final JSONBuilder builder = new JSONBuilder(this);
        builder.withAttribute(JSON_SESSION_ID_ATTR, getSessionID());
        builder.withAttribute(JSON_START_TIME_ATTR, getStartTime());
        builder.withAttribute(JSON_STOP_TIME_ATTR, stopT);
        return builder.toJSONObject();
    }

    @Override
    public String toString() {
        final JSONObject json = toJSONObject();
        try {
            return json.toString(INDENTATION);
        } catch (final JSONException e) {
            return json.toString();
        }
    }

    public String getSessionID() {
        return this.sessionID;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public Long getStopTime() {
        return this.stopTime;
    }
}
