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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery;

import android.util.Log;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.ClientContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.InternalEvent;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.adapter.JSONEventAdapter;
import com.amazonaws.services.mobileanalytics.model.Event;
import com.amazonaws.services.mobileanalytics.model.PutEventsRequest;
import com.amazonaws.services.mobileanalytics.model.Session;
import com.amazonaws.util.Base64;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class ERSRequestBuilder {

    private static final String TAG = "ERSRequestBuilder";

    public PutEventsRequest createRecordEventsRequest(JSONArray events, String networkType) {

        String body = events.toString();
        if (body == null) {
            return null;
        }

        PutEventsRequest putRequest = new PutEventsRequest();
        List<Event> eventList = new ArrayList<Event>();
        JSONEventAdapter eventAdapter = new JSONEventAdapter();

        ClientContext clientContext = null;
        for (int i = 0; i < events.length(); i++) {
            JSONObject eventJSON = null;
            InternalEvent internalEvent = null;
            try {
                eventJSON = events.getJSONObject(i);
                internalEvent = eventAdapter.translateToEvent(eventJSON);
            } catch (JSONException e) {
                Log.e(TAG, "Stored event was invalid JSON", e);
                continue;
            }
            clientContext = internalEvent.createClientContext(networkType);
            Event event = new Event();
            Session session = new Session();
            session.withId(internalEvent.getSessionId());
            session.withStartTimestamp(DateUtils.formatISO8601Date(new Date(internalEvent
                    .getSessionStart())));
            if (internalEvent.getSessionStop() != null && internalEvent.getSessionStop() != 0L) {
                session.withStopTimestamp(DateUtils.formatISO8601Date(new Date(internalEvent
                        .getSessionStop())));
            }
            if (internalEvent.getSessionDuration() != null
                    && internalEvent.getSessionDuration() != 0L) {
                session.withDuration(internalEvent.getSessionDuration());
            }

            event.withAttributes(internalEvent.getAllAttributes())
                    .withMetrics(internalEvent.getAllMetrics())
                    .withEventType(internalEvent.getEventType())
                    .withTimestamp(
                            DateUtils.formatISO8601Date(new Date(internalEvent.getEventTimestamp())))
                    .withSession(session);

            eventList.add(event);
        }

        if (clientContext != null && eventList.size() > 0) {
            putRequest.withEvents(eventList).withClientContext(
                    Base64.encodeAsString(clientContext.toJSONObject().toString()
                            .getBytes(StringUtils.UTF8)));
        } else {
            Log.e(TAG, "ClientContext is null or event list is empty");
        }
        return putRequest;
    }
}
