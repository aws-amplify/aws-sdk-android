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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.idresolver.Id;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.AppDetails;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.DeviceDetails;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.MockAppDetails;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.MockDeviceDetails;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.SDKInfo;

import java.util.HashMap;
import java.util.Map;

public class MockInternalEvent {

    public static final String EVENT_SDK_NAME = "event_sdk_name";
    public static final String EVENT_SDK_VERSION = "event_sdk_version";
    public static final String EVENT_APP_KEY = "event_app_key";
    public static final String EVENT_UNIQUE_ID = "987654321";

    public static InternalEvent newInstance(String eventType, Long timeStamp) {
        Id mockUniqueId = mock(Id.class);
        when(mockUniqueId.getValue()).thenReturn(EVENT_UNIQUE_ID);

        SDKInfo testInfo = new SDKInfo("testSDK", "TestVersion");
        AppDetails appDetails = new MockAppDetails();
        DeviceDetails deviceDetails = new MockDeviceDetails();

        Map<String, String> attributes = new HashMap<String, String>();
        Map<String, Double> metrics = new HashMap<String, Double>();

        Id uniqueId = Id.valueOf("TestId");

        String sessionId = "TestSessionId";
        long sessionStart = 0;
        long sessionEnd = 1000L;
        long sessionDuration = 1000L;

        return new DefaultEvent(eventType, attributes, metrics, testInfo, sessionId, sessionStart,
                sessionEnd, sessionDuration, timeStamp, uniqueId, appDetails, deviceDetails);
    }

}
