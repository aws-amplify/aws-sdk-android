/*
 * Copyright 2017-2022 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.cognito.clientcontext.datacollection;

import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.view.Display;
import android.view.WindowManager;

/**
 * It collects information that identifying the device.
 */
public class DeviceDataCollector extends DataCollector {

    private static final String PLATFORM = "ANDROID";
    protected static final String LOCAL_STORAGE_PATH = "AWS.Cognito.ContextData";
    protected static final String LOCAL_STORAGE_DEVICE_ID_KEY = "CognitoDeviceId";

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, String> collect(Context context) {
        Map<String, String> contextdata = new HashMap<String, String>();
        contextdata.put(DataRecordKey.TIMEZONE, getTimezoneOffset());
        contextdata.put(DataRecordKey.PLATFORM, PLATFORM);
        contextdata.put(DataRecordKey.THIRD_PARTY_DEVICE_AGENT, getThirdPartyDeviceAgent());
        contextdata.put(DataRecordKey.DEVICE_AGENT, getCognitoDeviceAgent(context));
        contextdata.put(DataRecordKey.DEVICE_LANGUAGE, getLanguage());

        Display display = getDisplay(context);
        contextdata.put(DataRecordKey.DEVICE_HEIGHT, String.valueOf(display.getHeight()));
        contextdata.put(DataRecordKey.DEVICE_WIDTH, String.valueOf(display.getWidth()));

        return contextdata;
    }

    private Display getDisplay(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        return windowManager.getDefaultDisplay();
    }

    protected String getCognitoDeviceAgent(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(LOCAL_STORAGE_PATH, Context.MODE_PRIVATE);
        if (sharedPreferences == null) {
            return null;
        }

        String storedId = sharedPreferences.getString(LOCAL_STORAGE_DEVICE_ID_KEY, null);
        if (storedId != null) {
            return storedId;
        }

        String randomId = UUID.randomUUID().toString();
        String deviceId = randomId + ":" + new Date().getTime();

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(LOCAL_STORAGE_DEVICE_ID_KEY, deviceId);
        editor.apply();
        return deviceId;
    }

    protected String getThirdPartyDeviceAgent() {
        return Settings.Secure.ANDROID_ID;
    }

    protected String getLanguage() {
        return Locale.getDefault().toString();
    }

    private String getTimezoneOffset() {
        TimeZone timeZone = getTimezone();
        int rawTimezoneOffset = timeZone.getRawOffset();

        long hours = TimeUnit.MILLISECONDS.toHours(rawTimezoneOffset);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(rawTimezoneOffset) - TimeUnit.HOURS.toMinutes(hours);

        String offset = (hours < 0 ? "-" : "") + String.format(Locale.US, "%02d:%02d", Math.abs(hours), minutes);
        return offset;
    }

    /**
     * Method is protected to allow it to be over-riden for unit testing
     */
    protected TimeZone getTimezone() {
        return TimeZone.getDefault();
    }
}