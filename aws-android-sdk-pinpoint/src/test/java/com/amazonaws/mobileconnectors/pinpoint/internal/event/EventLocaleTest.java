/**
 * Copyright 2016-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.pinpoint.internal.event;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import com.amazonaws.mobileconnectors.pinpoint.analytics.AnalyticsClient;
import com.amazonaws.mobileconnectors.pinpoint.analytics.AnalyticsEvent;
import com.amazonaws.mobileconnectors.pinpoint.analytics.utils.AnalyticsContextBuilder;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.configuration.AndroidPreferencesConfiguration;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.AndroidDeviceDetails;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE, sdk=23)
public class EventLocaleTest {

    private static final String SDK_NAME = "AppIntelligenceSDK-Analytics";
    private static final String SDK_VERSION = "test";
    private static final String UNIQUE_ID = "abc123";

    private static PinpointContext createMockContext(Locale localeToReturn) {
        AndroidPreferencesConfiguration mockConfiguration = Mockito.mock(AndroidPreferencesConfiguration.class);
        when(mockConfiguration.optString("versionKey", "ver"))
                .thenReturn("ver");
        when(mockConfiguration.optBoolean("isAnalyticsEnabled", true))
                .thenReturn(true);

        AndroidDeviceDetails mockDeviceDetails = Mockito.mock(AndroidDeviceDetails.class);
        when(mockDeviceDetails.locale()).thenReturn(localeToReturn);

        PinpointContext mockContext = new AnalyticsContextBuilder()
                                              .withSdkInfo(SDK_NAME,
                                                                  SDK_VERSION)
                                              .withUniqueIdValue(UNIQUE_ID)
                                              .withConfiguration(mockConfiguration)
                                              .withDeviceDetails(mockDeviceDetails)
                                              .withContext(RuntimeEnvironment.application
                                                                   .getApplicationContext())
                                              .build();
        return mockContext;
    }

    @Test
    public void createEvent_verifyLocaleFormat() throws JSONException {
        Map<String, Locale> locales = new HashMap<String, Locale>();
        locales.put("en_US", Locale.US);
        locales.put("en_CA", Locale.CANADA);
        locales.put("fr_CA", Locale.CANADA_FRENCH);
        locales.put("zh_CN", Locale.CHINA);
        locales.put("fr_FR", Locale.FRANCE);
        locales.put("de_DE", Locale.GERMANY);
        locales.put("it_IT", Locale.ITALY);
        locales.put("ja_JP", Locale.JAPAN);
        locales.put("ko_KR", Locale.KOREA);
        locales.put("zh_TW", Locale.TAIWAN);
        locales.put("en_GB", Locale.UK);
        locales.put("ar_SA", new Locale("ar", "SA"));
        locales.put("nl_NL", new Locale("nl", "NL"));
        locales.put("en_AU", new Locale("en", "AU"));
        locales.put("es_ES", new Locale("es", "ES"));
        locales.put("pt_BR", new Locale("pt", "BR"));
        locales.put("es_MX", new Locale("es", "MX"));

        for (String expectedLocaleName : locales.keySet()) {
            Locale expectedLocale = locales.get(expectedLocaleName);

            // create an event client
            AnalyticsClient target = new AnalyticsClient(createMockContext(expectedLocale));

            // create the event
            AnalyticsEvent event = target.createEvent("localeEvent");
            target.recordEvent(event);
            JSONObject jsonEvent = event.toJSONObject();
            assertThat(jsonEvent.getString("locale"), is(expectedLocaleName));
        }
    }

}
