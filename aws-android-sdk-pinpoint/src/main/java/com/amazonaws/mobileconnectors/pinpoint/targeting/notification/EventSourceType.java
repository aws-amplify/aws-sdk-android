/**
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.pinpoint.targeting.notification;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static com.amazonaws.mobileconnectors.pinpoint.targeting.notification.NotificationClientBase.CAMPAIGN_ACTIVITY_ID_ATTRIBUTE_KEY;
import static com.amazonaws.mobileconnectors.pinpoint.targeting.notification.NotificationClientBase.CAMPAIGN_ID_ATTRIBUTE_KEY;
import static com.amazonaws.mobileconnectors.pinpoint.targeting.notification.NotificationClientBase.CAMPAIGN_PUSH_KEY_PREFIX;
import static com.amazonaws.mobileconnectors.pinpoint.targeting.notification.NotificationClientBase.JOURNEY_ACTIVITY_ID_ATTRIBUTE_KEY;
import static com.amazonaws.mobileconnectors.pinpoint.targeting.notification.NotificationClientBase.JOURNEY_ID_ATTRIBUTE_KEY;

final class EventSourceType {
    private static final String TAG = EventSourceType.class.getSimpleName();
    private static final String AWS_EVENT_TYPE_OPENED = "opened_notification";
    private static final String AWS_EVENT_TYPE_RECEIVED_FOREGROUND = "received_foreground";
    private static final String AWS_EVENT_TYPE_RECEIVED_BACKGROUND = "received_background";
    private static final String PINPOINT_ATTRIBUTE_KEY = "pinpoint";
    private static final String JOURNEY_ATTRIBUTE_KEY = "journey";
    private static final String CAMPAIGN_EVENT_SOURCE_NAME = "campaign";
    private static final String JOURNEY_EVENT_SOURCE_NAME = "journey";
    private static final String CAMPAIGN_EVENT_SOURCE_PREFIX = "_campaign";
    private static final String JOURNEY_EVENT_SOURCE_PREFIX = "_journey";
    private static final String UNKNOWN_EVENT_SOURCE_NAME = "unknown";

    private final EventSourceAttributeParser attributeParser;
    private final String eventSourceName;
    private final String eventTypeOpenend;
    private final String eventTypeReceivedForeground;
    private final String eventTypeReceivedBackground;
    private final String eventSourceIdAttributeKey;
    private final String eventSourceActivityIdAttributeKey;
    private final String eventSourceKeyPrefix;

    private static EventSourceType CAMPAIGN = new EventSourceType(CAMPAIGN_EVENT_SOURCE_NAME,
            CAMPAIGN_EVENT_SOURCE_PREFIX,
            CAMPAIGN_ID_ATTRIBUTE_KEY,
            CAMPAIGN_ACTIVITY_ID_ATTRIBUTE_KEY,
            CAMPAIGN_PUSH_KEY_PREFIX,
            new CampaignAttributeParser());
    private static EventSourceType JOURNEY = new EventSourceType(JOURNEY_EVENT_SOURCE_NAME,
            JOURNEY_EVENT_SOURCE_PREFIX,
            JOURNEY_ID_ATTRIBUTE_KEY,
            JOURNEY_ACTIVITY_ID_ATTRIBUTE_KEY,
            null,
            new JourneyAttributeParser());
    private static EventSourceType UNKNOWN = new EventSourceType(UNKNOWN_EVENT_SOURCE_NAME,
            "",
            "",
            "",
            "",
            new EventSourceAttributeParser());

    static EventSourceType getEventSourceType(Bundle bundle) {
        if (bundle == null) {
            return UNKNOWN;
        }
        String campaignKey = CAMPAIGN.getEventSourceKeyPrefix() + CAMPAIGN.getEventSourceIdAttributeKey();
        if (bundle.containsKey(campaignKey)) {
            return CAMPAIGN;
        } else if (bundle.containsKey(PINPOINT_ATTRIBUTE_KEY) &&
                  bundle.getString(PINPOINT_ATTRIBUTE_KEY).matches(".*\"journey_id\".*")) {
            return JOURNEY;
        } else {
            return UNKNOWN;
        }
    }

    private EventSourceType(String eventSourceName,
                            String eventSourcePrefix,
                            String eventSourceIdAttributeKey,
                            String eventSourceActivityIdAttributeKey,
                            String eventSourceKeyPrefix,
                            EventSourceAttributeParser attributeParser) {
        this.eventSourceName = eventSourceName;
        this.eventTypeOpenend = eventSourcePrefix + "." + AWS_EVENT_TYPE_OPENED;
        this.eventTypeReceivedBackground = eventSourcePrefix + "." + AWS_EVENT_TYPE_RECEIVED_BACKGROUND;
        this.eventTypeReceivedForeground = eventSourcePrefix + "." + AWS_EVENT_TYPE_RECEIVED_FOREGROUND;
        this.eventSourceIdAttributeKey = eventSourceIdAttributeKey;
        this.eventSourceActivityIdAttributeKey = eventSourceActivityIdAttributeKey;
        this.eventSourceKeyPrefix = eventSourceKeyPrefix;
        this.attributeParser = attributeParser;
    }

    boolean isUnkown() {
        return UNKNOWN_EVENT_SOURCE_NAME.equals(this.eventSourceName);
    }

    EventSourceAttributeParser getAttributeParser() {
        return attributeParser;
    }

    String getEventSourceName() {
        return eventSourceName;
    }

    String getEventTypeOpenend() {
        return eventTypeOpenend;
    }

    String getEventTypeReceivedForeground() {
        return eventTypeReceivedForeground;
    }

    String getEventTypeReceivedBackground() {
        return eventTypeReceivedBackground;
    }

    String getEventSourceIdAttributeKey() {
        return eventSourceIdAttributeKey;
    }

    String getEventSourceActivityIdAttributeKey() {
        return eventSourceActivityIdAttributeKey;
    }

    String getEventSourceKeyPrefix() {
        return eventSourceKeyPrefix;
    }

    /**
     * Campaign attributes are send from Pinpoint flattened
     * For example:
     *  "pinpoint.campaign.campaign_id"
     * Journey attributes come in JSON format
     * This class just seeks to abstract some of that away
     * from the logic that handles the notfication and
     * also provides a default implementation that returns
     * an empty map.
     */

    public static class EventSourceAttributeParser {
        public Map<String, String> parseAttributes(Bundle bundle) {
            return Collections.emptyMap();
        }
    }

    private static final class CampaignAttributeParser extends EventSourceAttributeParser {
        @Override
        public Map<String, String> parseAttributes(Bundle bundle) {
            Map<String, String> result = new HashMap<>();
            if (bundle == null) {
                return result;
            }
            String campaignKeyPrefix = CAMPAIGN.getEventSourceKeyPrefix();
            for (String key : bundle.keySet()) {
                if (key.startsWith(campaignKeyPrefix)) {
                    //If it matches the prefix, include it in the attributes
                    //after stripping out the prefix
                    result.put(key.replace(campaignKeyPrefix, ""), bundle.getString(key));
                }
            }
            return result;
        }
    }

    private static final class JourneyAttributeParser extends EventSourceAttributeParser {
        @Override
        public Map<String, String> parseAttributes(Bundle bundle) {
            Map<String, String> result = new HashMap<>();
            String pinpointPayload = bundle.getString(PINPOINT_ATTRIBUTE_KEY);
            if (pinpointPayload == null) {
                return result;
            }
            JsonElement pinpointJson;
            try {
                pinpointJson = new JsonParser().parse(pinpointPayload);
            } catch (JsonSyntaxException ex) {
                Log.w(TAG, "Exception attempting to parse pinpoint JSON payload.", ex);
                Log.v(TAG, "Payload: " + pinpointPayload);
                return result;
            }
            JsonElement journeyJson = pinpointJson.getAsJsonObject().get(JOURNEY_ATTRIBUTE_KEY);
            if (journeyJson == null) {
                return null;
            }
            for (Map.Entry entry : journeyJson.getAsJsonObject().entrySet()) {
                result.put((String) entry.getKey(), ((JsonPrimitive) entry.getValue()).getAsString());
            }
            return result;
        }
    }
}
