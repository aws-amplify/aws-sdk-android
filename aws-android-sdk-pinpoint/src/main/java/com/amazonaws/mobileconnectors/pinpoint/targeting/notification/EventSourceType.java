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

import java.util.HashMap;
import java.util.Map;

import static com.amazonaws.mobileconnectors.pinpoint.targeting.notification.NotificationClientBase.CAMPAIGN_ACTIVITY_ID_ATTRIBUTE_KEY;
import static com.amazonaws.mobileconnectors.pinpoint.targeting.notification.NotificationClientBase.CAMPAIGN_ID_ATTRIBUTE_KEY;
import static com.amazonaws.mobileconnectors.pinpoint.targeting.notification.NotificationClientBase.CAMPAIGN_PUSH_KEY_PREFIX;
import static com.amazonaws.mobileconnectors.pinpoint.targeting.notification.NotificationClientBase.JOURNEY_ACTIVITY_ID_ATTRIBUTE_KEY;
import static com.amazonaws.mobileconnectors.pinpoint.targeting.notification.NotificationClientBase.JOURNEY_ID_ATTRIBUTE_KEY;

public class EventSourceType {
    private static final String TAG = EventSourceType.class.getSimpleName();
    private static final String AWS_EVENT_TYPE_OPENED = "opened_notification";
    private static final String AWS_EVENT_TYPE_RECEIVED_FOREGROUND = "received_foreground";
    private static final String AWS_EVENT_TYPE_RECEIVED_BACKGROUND = "received_background";
    private static final String PINPOINT_ATTRIBUTE_KEY = "pinpoint";
    private static final String JOURNEY_ATTRIBUTE_KEY = "journey";
    private final EventSourceAttributeParser attributeParser;
    private String eventSourceName;
    private String eventTypeOpenend;
    private String eventTypeReceivedForeground;
    private String eventTypeReceivedBackground;
    private String eventSourceIdAttributeKey;
    private String eventSourceActivityIdAttributeKey;
    private String eventSourceKeyPrefix;

    /**
     * Campaign attributes are send from pinpoint flattened
     * For example:
     *  "pinpoint.campaign.campaign_id"
     * Journey attributes come in JSON format
     * This interface just seeks to abstract some of that away
     * from the logic that handles the notfication
     * @return
     */
    public interface EventSourceAttributeParser {
        Map<String, String> getEventSourceAttributes(Bundle bundle);
    }

    private static final EventSourceAttributeParser CAMPAIGN_PARSER = new EventSourceAttributeParser() {
        @Override
        public Map<String, String> getEventSourceAttributes(Bundle bundle) {
            if(bundle == null) {
                return null;
            }
            final Map<String, String> campaignAttributes = new HashMap<>();
            String campaignKeyPrefix = CAMPAIGN.getEventSourceKeyPrefix();

            for(String key : bundle.keySet()) {
                if (key.startsWith(campaignKeyPrefix)) {
                    //If it matches the prefix, include it in the attributes
                    //after stripping out the prefix
                    campaignAttributes.put(key.replace(campaignKeyPrefix,""), bundle.getString(key));
                }
            }
            return campaignAttributes.size() > 0 ? campaignAttributes : null;
        }
    };

    private static final EventSourceAttributeParser JOURNEY_PARSER = new EventSourceAttributeParser() {
        @Override
        public Map<String, String> getEventSourceAttributes(Bundle bundle) {
            String pinpointPayload = bundle.getString(PINPOINT_ATTRIBUTE_KEY);
            if(pinpointPayload == null) {
                return null;
            }
            Map<String, String> result = null;
            try {
                JsonElement pinpointJson = new JsonParser().parse(pinpointPayload);
                JsonElement journeyJson = pinpointJson.getAsJsonObject().get(JOURNEY_ATTRIBUTE_KEY);
                if(journeyJson == null) {
                    return null;
                }
                result = new HashMap<>();
                for(Map.Entry entry : journeyJson.getAsJsonObject().entrySet()) {
                    result.put((String) entry.getKey(), ((JsonPrimitive)entry.getValue()).getAsString());
                }
            } catch(JsonSyntaxException ex) {
                Log.w(TAG, "Exception attempting to parse pinpoint JSON payload.", ex);
                Log.v(TAG, "Payload: "+pinpointPayload);
                return null;
            }

            return result;
        }
    };

    public static EventSourceType CAMPAIGN = new EventSourceType("campaign",
            "_campaign",
            CAMPAIGN_ID_ATTRIBUTE_KEY,
            CAMPAIGN_ACTIVITY_ID_ATTRIBUTE_KEY,
            CAMPAIGN_PUSH_KEY_PREFIX,
            CAMPAIGN_PARSER);
    public static EventSourceType JOURNEY = new EventSourceType("journey",
            "_journey",
            JOURNEY_ID_ATTRIBUTE_KEY,
            JOURNEY_ACTIVITY_ID_ATTRIBUTE_KEY,
            null,
            JOURNEY_PARSER);

    public static EventSourceType getEventSourceType(Bundle bundle) {
        if(bundle == null) {
            return null;
        }
        if(bundle.containsKey(CAMPAIGN.getEventSourceKeyPrefix()+CAMPAIGN.getEventSourceIdAttributeKey())) {
            return CAMPAIGN;
        } else {
            return JOURNEY;
        }
    }

    public static Map<String, String> getEventSourceAttributes(Bundle bundle) {
        if(bundle == null) {
            return null;
        }
        if(bundle.containsKey(CAMPAIGN.getEventSourceKeyPrefix()+CAMPAIGN.getEventSourceIdAttributeKey())) {
            return CAMPAIGN_PARSER.getEventSourceAttributes(bundle);
        } else {
            return JOURNEY_PARSER.getEventSourceAttributes(bundle);
        }
    }

    private EventSourceType(String eventSourceName,
                            String eventSourcePrefix,
                            String eventSourceIdAttributeKey,
                            String eventSourceActivityIdAttributeKey,
                            String eventSourceKeyPrefix,
                            EventSourceAttributeParser attributeParser) {
        this.eventSourceName = eventSourceName;
        this.eventTypeOpenend = eventSourcePrefix+"." + AWS_EVENT_TYPE_OPENED;
        this.eventTypeReceivedBackground = eventSourcePrefix+"." + AWS_EVENT_TYPE_RECEIVED_BACKGROUND;
        this.eventTypeReceivedForeground = eventSourcePrefix+"." + AWS_EVENT_TYPE_RECEIVED_FOREGROUND;
        this.eventSourceIdAttributeKey = eventSourceIdAttributeKey;
        this.eventSourceActivityIdAttributeKey = eventSourceActivityIdAttributeKey;
        this.eventSourceKeyPrefix = eventSourceKeyPrefix;
        this.attributeParser = attributeParser;
    }

    public EventSourceAttributeParser getAttributeParser() {
        return attributeParser;
    }

    public String getEventSourceName() {
        return eventSourceName;
    }

    public String getEventTypeOpenend() {
        return eventTypeOpenend;
    }

    public String getEventTypeReceivedForeground() {
        return eventTypeReceivedForeground;
    }

    public String getEventTypeReceivedBackground() {
        return eventTypeReceivedBackground;
    }

    public String getEventSourceIdAttributeKey() {
        return eventSourceIdAttributeKey;
    }

    public String getEventSourceActivityIdAttributeKey() {
        return eventSourceActivityIdAttributeKey;
    }

    public String getEventSourceKeyPrefix() {
        return eventSourceKeyPrefix;
    }
}
