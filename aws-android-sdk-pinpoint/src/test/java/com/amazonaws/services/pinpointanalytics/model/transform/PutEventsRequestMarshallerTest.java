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

package com.amazonaws.services.pinpointanalytics.model.transform;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.amazonaws.Request;
import com.amazonaws.services.pinpointanalytics.model.Event;
import com.amazonaws.services.pinpointanalytics.model.PutEventsRequest;
import com.amazonaws.services.pinpointanalytics.model.Session;
import com.amazonaws.services.pinpointanalytics.model.transform.PutEventsRequestMarshaller;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.IOUtils;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

public class PutEventsRequestMarshallerTest {
    @Test
    public void test() throws Exception {
        PutEventsRequest putEventsRequest = new PutEventsRequest();
        List<Event> events = new ArrayList<Event>();
        events.add(createEvent());
        events.add(createEvent());
        putEventsRequest.setEvents(events);
        PutEventsRequestMarshaller marshaller = new PutEventsRequestMarshaller();
        Request<PutEventsRequest> request = marshaller.marshall(putEventsRequest);

        assertEquals("content encoding", "gzip", request.getHeaders().get("Content-Encoding"));
        byte[] content = IOUtils.toByteArray(request.getContent());
        System.out.println(content.length);
        assertEquals("content length", request.getHeaders().get("Content-Length"),
                String.valueOf(content.length));
        GZIPInputStream gis = new GZIPInputStream(new ByteArrayInputStream(content));
        String str = IOUtils.toString(gis);
        assertTrue("data is compressed", content.length < str.length());
    }

    private Event createEvent() {
        Event event = new Event();
        event.setSession(new Session());
        event.setEventType("event type");
        event.setTimestamp(DateUtils.formatISO8601Date(new Date()));
        Map<String, String> attributes = new HashMap<String, String>();
        attributes.put("platform", "ANDROID");
        attributes.put("model", "test");
        attributes.put("app_verison_code", "0");
        attributes.put("locale", "en_US");
        attributes.put("sdk_version", "2.1.10");
        attributes.put("sdk_name", "AmazonMobileAnalyticsSDK");
        attributes.put("unique_id", "26586999-0f31-4593-a220-68834c6859c4");
        attributes.put("app_package_name", "aws.tests.ERSRequestBuilderTests");
        attributes.put("carrier", "Motorola");
        attributes.put("unique_id", "26586999-0f31-4593-a220-68834c6859c4");
        attributes.put("app_id", "dd0fe530-edca-11e3-ac10-0800200c9a66+TEST-1739129675");
        event.setAttributes(attributes);
        return event;
    }
}
