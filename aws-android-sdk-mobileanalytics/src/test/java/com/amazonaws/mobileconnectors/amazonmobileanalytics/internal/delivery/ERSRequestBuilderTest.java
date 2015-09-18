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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.MobileAnalyticsTestBase;
import com.amazonaws.services.mobileanalytics.model.PutEventsRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class ERSRequestBuilderTest extends MobileAnalyticsTestBase {

    @Test
    public void createPutEventsRequest() throws JSONException {

        JSONArray events = new JSONArray();
        JSONObject event1 = new JSONObject();
        event1.put("platform", "ANDROID");
        event1.put("model", "test");
        event1.put("app_verison_code", "0");
        event1.put("event_type", "testEvent 1");
        event1.put("locale", "en_US");
        event1.put("sdk_version", "2.1.10");
        event1.put("sdk_name", "AmazonMobileAnalyticsSDK");
        event1.put("unique_id", "26586999-0f31-4593-a220-68834c6859c4");
        event1.put("timestamp", "1426634280111");
        event1.put("app_package_name", "aws.tests.ERSRequestBuilderTests");
        event1.put("carrier", "Motorola");
        event1.put("unique_id", "26586999-0f31-4593-a220-68834c6859c4");
        event1.put("app_id", "dd0fe530-edca-11e3-ac10-0800200c9a66+TEST-1739129675");
        event1.put("make", "unknown");
        JSONObject session1 = new JSONObject();
        session1.put("id", "4c6859c4-20150317-231800110");
        session1.put("startTimestamp", 1426634280110L);
        event1.put("session", session1);

        JSONObject event2 = new JSONObject();
        event2.put("platform", "ANDROID");
        event2.put("model", "test");
        event2.put("app_verison_code", "0");
        event2.put("event_type", "testEvent 2");
        event2.put("locale", "en_US");
        event2.put("sdk_version", "2.1.10");
        event2.put("sdk_name", "AmazonMobileAnalyticsSDK");
        event2.put("unique_id", "26586999-0f31-4593-a220-68834c6859c4");
        event2.put("timestamp", "1426634280111");
        event2.put("app_package_name", "aws.tests.ERSRequestBuilderTests");
        event2.put("carrier", "Motorola");
        event2.put("unique_id", "26586999-0f31-4593-a220-68834c6859c4");
        event2.put("app_id", "dd0fe530-edca-11e3-ac10-0800200c9a66+TEST-1739129675");
        event2.put("session", session1);

        events.put(event1);
        events.put(event2);

        ERSRequestBuilder builder = new ERSRequestBuilder();
        PutEventsRequest putRequest = builder.createRecordEventsRequest(events, "testNetwork");

        assertEquals(2, putRequest.getEvents().size());
        assertNotNull(putRequest.getClientContext());

    }

}
