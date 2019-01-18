/*
 * Copyright 2011-2019 Amazon Technologies, Inc.
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

package com.amazonaws;

import java.util.EnumMap;
import java.util.Map;

/**
 * Client markers for individual {@link AmazonWebServiceRequest}s.
 */
public final class RequestClientOptions {

    private static final int STREAM_BUFFER_SHIFT_VAL = 17;
    /**
     * Used to enable mark-and-reset for non-mark-and-resettable non-file input
     * stream for up to 128K memory buffering by default. Add 1 to get around an
     * implementation quirk of BufferedInputStream. Retries after reading
     * {@link #DEFAULT_STREAM_BUFFER_SIZE} bytes would fail to reset the
     * underlying input stream as the mark position would have been invalidated.
     */
    public static final int DEFAULT_STREAM_BUFFER_SIZE = (1 << STREAM_BUFFER_SHIFT_VAL) + 1;

    /**
     * Marker enum.
     */
    public static enum Marker {
        /**
         * Used to specify the http user_agent value. This marker is intended
         * only for internal use by the AWS SDK.
         */
        USER_AGENT;
    }

    private final Map<Marker, String> markers = new EnumMap<Marker, String>(Marker.class);

    /**
     * @deprecated by {@link #getClientMarker(Marker)}. This method is intended
     *             only for internal use by the AWS SDK. Returns the
     *             "USER_AGENT" marker as a space-delimited string.
     * @return the client marker.
     */
    @Deprecated
    public String getClientMarker() {
        return getClientMarker(Marker.USER_AGENT);
    }

    /**
     * @param marker the marker.
     * @return the value of the specified marker; or null if there is no such
     * value.
     */
    public String getClientMarker(Marker marker) {
        return markers.get(marker);
    }

    /**
     * Associates the given value with the given marker. Note the
     * {@link Marker#USER_AGENT} is only intended for internal use by the AWS
     * SDK.
     * @param marker the marker.
     * @param value the value.
     */
    public void putClientMarker(Marker marker, String value) {
        markers.put(marker, value);
    }

    /**
     * @deprecated by {@link #appendUserAgent(String)}. This method is intended
     *             only for internal use by the AWS SDK. Adds a "USER_AGENT"
     *             client marker, if it wasn't already present.
     * @param clientMarker the client marker.
     */
    @Deprecated
    public void addClientMarker(String clientMarker) {
        appendUserAgent(clientMarker);
    }

    /**
     * Appends a user agent to the USER_AGENT client marker. This method is
     * intended only for internal use by the AWS SDK.
     * @param userAgent the user agent.
     */
    public void appendUserAgent(String userAgent) {
        String marker = markers.get(Marker.USER_AGENT);
        if (marker == null) {
            marker = "";
        }
        marker = createUserAgentMarkerString(marker, userAgent);
        putClientMarker(Marker.USER_AGENT, marker);
    }

    /**
     * Appends the given client marker string to the existing one and returns
     * it.
     * @param marker the marker.
     * @param userAgent the user agent.
     * @return the marker string with the given client marker appended.
     */
    private String createUserAgentMarkerString(final String marker, String userAgent) {
        return marker.contains(userAgent) ? marker : marker + " " + userAgent;
    }
}
