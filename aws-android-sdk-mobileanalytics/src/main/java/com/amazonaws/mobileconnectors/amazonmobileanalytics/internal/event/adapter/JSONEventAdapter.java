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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.adapter;

import android.util.Log;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.idresolver.Id;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.AndroidAppDetails;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.AndroidDeviceDetails;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.AppDetails;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.DeviceDetails;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.JSONBuilder;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.SDKInfo;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.ClientContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.DefaultEvent;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.InternalEvent;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class JSONEventAdapter implements EventAdapter<JSONObject> {
    private static final String TAG = "JSONEventAdapter";

    @Override
    public JSONObject translateFromEvent(InternalEvent source) {
        if (null == source) {
            Log.w(TAG, "The Event provided was null");
            return null;
        }

        JSONObject json = source.toJSONObject();
        if (json.has("class")) {
            json.remove("class");
        }
        if (json.has("hashCode")) {
            json.remove("hashCode");
        }
        return json;
    }

    @Override
    public String toString() {
        return new JSONBuilder(this).toString();
    }

    @Override
    public InternalEvent translateToEvent(JSONObject source) throws JSONException {

        Map<String, String> attributes = new HashMap<String, String>();
        Map<String, Double> metrics = new HashMap<String, Double>();

        AppDetails appDetails = new AndroidAppDetails(source.optString("app_package_name"),
                source.optString("app_version_code"), source.optString("app_version_name"),
                source.optString("app_title"), source.optString(ClientContext.APP_ID_KEY));
        SDKInfo sdkInfo = new SDKInfo(source.optString("sdk_version"), source.optString("sdk_name"));
        DeviceDetails deviceDetails = new AndroidDeviceDetails(source.optString("carrier"));
        String eventType = source.getString("event_type");
        Long timestamp = source.getLong("timestamp");
        Id uniqueId = Id.valueOf(source.getString("unique_id"));

        String sessionId = "";
        Long sessionStart = null;
        Long sessionStop = null;
        Long sessionDuration = null;

        JSONObject sessionJSON = source.getJSONObject("session");
        if (sessionJSON != null) {
            sessionId = sessionJSON.getString("id");
            sessionStart = sessionJSON.getLong("startTimestamp");
            sessionStop = sessionJSON.optLong("stopTimestamp");
            sessionDuration = sessionJSON.optLong("duration");
        }

        JSONObject attributesJSON = source.optJSONObject("attributes");
        if (attributesJSON != null) {
            Iterator<String> keysIterator = attributesJSON.keys();
            String key;
            while (keysIterator.hasNext()) {
                key = keysIterator.next();
                attributes.put(key, attributesJSON.optString(key));
            }
        }

        JSONObject metricsJSON = source.optJSONObject("metrics");
        if (metricsJSON != null) {
            Iterator<String> keysIterator = metricsJSON.keys();
            String key;
            while (keysIterator.hasNext()) {
                key = keysIterator.next();
                try {
                    metrics.put(key, metricsJSON.getDouble(key));
                } catch (JSONException e) {
                    Log.e(TAG, "Failed to convert metric back to double from JSON value", e);
                }
            }
        }

        return DefaultEvent.newInstance(eventType, attributes, metrics, sdkInfo, sessionId,
                sessionStart, sessionStop, sessionDuration, timestamp, uniqueId, appDetails,
                deviceDetails);
    }

}
