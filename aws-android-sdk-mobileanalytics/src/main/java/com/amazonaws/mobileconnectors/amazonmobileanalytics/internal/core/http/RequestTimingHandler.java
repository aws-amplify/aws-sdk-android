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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.http;

import android.util.Log;

import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.AnalyticsEvent;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.Connectivity;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.DateUtil;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.StringUtil;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.InternalEventClient;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.Map;

/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class RequestTimingHandler extends RequestHandler2 {
    private static final String TAG = "RequestTimingHandler";

    public static final String REQUESTTIME_HEADER = "x-amzn-RequestTime";
    public static final String REQUESTATTEMPTS_HEADER = "x-amzn-RequestAttempts";
    public static final String SERVERINFO_HEADER = "x-amzn-ServerInfo";
    private static final String TIMEZONE_FORMAT = "Z";
    private DateFormat df;
    private final InternalEventClient eventClient;
    private final Connectivity connectivity;
    private long startTime;
    private int contentLength;

    public RequestTimingHandler(final Connectivity connectivity,
            final InternalEventClient eventClient) {
        df = DateUtil.createLocaleIndependentDateFormatter(TIMEZONE_FORMAT);
        this.eventClient = eventClient;
        this.connectivity = connectivity;
    }

    private synchronized String getTimeZone() {
        // TODO: Add clockskew
        return df.format(new Date());
    }

    @Override
    public void afterError(com.amazonaws.Request<?> request, com.amazonaws.Response<?> response,
            Exception exception) {
    }

    @Override
    public void afterResponse(com.amazonaws.Request<?> request, com.amazonaws.Response<?> response) {
        try {
            if (response == null) {
                return;
            }

            Map<String, String> headers = response.getHttpResponse().getHeaders();
            String responseTimeStr = headers.get(REQUESTTIME_HEADER);
            long responseTime = startTime - System.currentTimeMillis();
            if (responseTimeStr != null && responseTimeStr.trim().length() > 0) {
                try {
                    responseTime = Long.parseLong(responseTimeStr.trim());
                } catch (NumberFormatException e) {
                }
            }

            double responseDouble = -1;
            try {
                responseDouble = Double.valueOf(Long.toString(responseTime));
            } catch (NumberFormatException numberFormatException) {
                Log.e(TAG, "Couldn't convert response time to double format", numberFormatException);
            }
            String requestAttemptsStr = headers.get(REQUESTATTEMPTS_HEADER);
            double requestAttempts = 0;
            if (requestAttemptsStr != null && requestAttemptsStr.trim().length() > 0) {
                try {
                    requestAttempts = Double.parseDouble(requestAttemptsStr.trim());
                } catch (NumberFormatException e) {
                }
            }

            String serverInfo = headers.get(SERVERINFO_HEADER);
            if (!StringUtil.isNullOrEmpty(responseTimeStr)) {
                if (eventClient == null) {
                    return;
                }
                AnalyticsEvent recordEvent = eventClient
                        .createEvent("_httpRequestTiming")
                        .withAttribute("url", request.getEndpoint().toURL().toString())
                        .withAttribute("responseCode",
                                Integer.toString(response.getHttpResponse().getStatusCode()))
                        .withAttribute("timeZone", getTimeZone())
                        .withMetric("attempts", requestAttempts)
                        .withMetric("totalTime", responseDouble)
                        .withMetric("requestSize", (double) contentLength);

                String connectionType = "UNKNOWN";
                if (connectivity != null) {
                    if (connectivity.hasWifi()) {
                        connectionType = "WIFI";
                    } else if (connectivity.hasWAN()) {
                        connectionType = "WAN";
                    }
                }

                recordEvent.withAttribute("network", connectionType);

                if (serverInfo != null) {
                    recordEvent.withAttribute("serverInfo", serverInfo);
                }

                eventClient.recordEvent(recordEvent);
            }
        } catch (Exception e) {
            Log.e(TAG, "Unable to record _RequestTime event", e);
        }
    }

    @Override
    public void beforeRequest(com.amazonaws.Request<?> request) {
        // TODO: factor in clockskew
        startTime = System.currentTimeMillis();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        InputStream is = request.getContent();
        int currentByte = 0;
        try {
            while ((currentByte = is.read()) != -1) {
                baos.write(currentByte);
            }

            contentLength = baos.size();
            request.setContent(new ByteArrayInputStream(baos.toByteArray()));
        } catch (IOException e) {
            Log.e(TAG, "Cannot read content of request");
            throw new RuntimeException(e);
        }
    }
}
