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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.session;

import static com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.Preconditions.checkNotNull;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.JSONBuilder;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.JSONSerializable;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.StringUtil;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

/**
 * A Session Object Mostly immutable, with the exception of its stop time. This
 * session object tracks whether or not it has been paused by checking the
 * status of it's stop time. A session's stop time is only set when the session
 * has been paused, and is set to -1 if it is currently running. Can be
 * serialized and restored for persistence.
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class Session implements JSONSerializable {
    // - Session ID configuration constants -------------------------=
    protected static final String SESSION_ID_DATE_FORMAT = "yyyyMMdd";
    protected static final String SESSION_ID_TIME_FORMAT = "HHmmssSSS";
    protected static final char SESSION_ID_DELIMITER = '-';
    protected static final char SESSION_ID_PAD_CHAR = '_';
    protected static final int SESSION_ID_APPKEY_LENGTH = 8;
    protected static final int SESSION_ID_UNIQID_LENGTH = 8;
    // - JSON/Serialization constants -------------------------------=
    private static final String JSON_SESSION_ID_ATTR = "session_id";
    private static final String JSON_START_TIME_ATTR = "start_time";
    private static final String JSON_STOP_TIME_ATTR = "stop_time";
    // - Field Declarations -----------------------------------------=
    private final DateFormat sessionIdTimeFormat;
    private final String sessionID;
    private final Long startTime;
    private Long stopTime = null;

    /**
     * STATIC FACTORY
     *
     * @param context
     * @return new Session object
     */
    public static Session newInstance(final AnalyticsContext context) {
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
            JSONObject json = new JSONObject(serializedSession);
            String sessionID = json.getString(JSON_SESSION_ID_ATTR);
            String startTime = json.getString(JSON_START_TIME_ATTR);
            String stopTime = json.getString(JSON_STOP_TIME_ATTR);

            s = new Session(sessionID, startTime, stopTime);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return s;
    }

    /**
     * CONSTRUCTOR - ACTUAL Used by DefaultSessionClient
     *
     * @param context
     */
    protected Session(final AnalyticsContext context) {
        checkNotNull(context, "A valid AnalyticsContext must be provided!");

        this.sessionIdTimeFormat = new SimpleDateFormat(SESSION_ID_DATE_FORMAT
                + SESSION_ID_DELIMITER + SESSION_ID_TIME_FORMAT, Locale.US);
        this.sessionIdTimeFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

        this.startTime = System.currentTimeMillis();
        this.stopTime = null;
        this.sessionID = this.generateSessionID(context);
    }

    /**
     * CONSTRUCTOR - EXPLICIT Used by the
     *
     * @param sessionID
     * @param startTime
     * @param stopTime
     */
    protected Session(final String sessionID, final String startTime, final String stopTime) {
        this.sessionIdTimeFormat = new SimpleDateFormat(SESSION_ID_DATE_FORMAT
                + SESSION_ID_DELIMITER + SESSION_ID_TIME_FORMAT, Locale.US);
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
        } catch (NumberFormatException e) {
        }
        return sessionLength;
    }

    /**
     * Generates Session ID by concatenating present AppKey, UniqueID, and
     * Timestamp
     *
     * @return [String] SessionID
     */
    public String generateSessionID(final AnalyticsContext context) {
        String uniqID = context.getUniqueId().getValue();
        String time = this.sessionIdTimeFormat.format(this.startTime);
        return StringUtil.trimOrPadString(uniqID, SESSION_ID_UNIQID_LENGTH, SESSION_ID_PAD_CHAR)
                + SESSION_ID_DELIMITER
                + time;
    }

    // ~ SERIALIZATION METHODS ============================================ ~\\
    // -
    //
    @Override
    public JSONObject toJSONObject() {
        Long stopT = this.stopTime;
        if (stopT == null) {
            stopT = Long.MIN_VALUE;
        }

        JSONBuilder builder = new JSONBuilder(this);
        builder.withAttribute(JSON_SESSION_ID_ATTR, this.sessionID);
        builder.withAttribute(JSON_START_TIME_ATTR, this.startTime);
        builder.withAttribute(JSON_STOP_TIME_ATTR, stopT);
        return builder.toJSONObject();
    }

    @Override
    public String toString() {
        JSONObject json = toJSONObject();
        try {
            return json.toString(4);
        } catch (JSONException e) {
            return json.toString();
        }
    }

    // ~ ================================================================== ~//
    // -

    // ~ GETTERS =========================================================== ~\\
    // =
    public String getSessionID() {
        return this.sessionID;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public Long getStopTime() {
        return this.stopTime;
    }
    // ~ =================================================================== ~//
    // =
}
