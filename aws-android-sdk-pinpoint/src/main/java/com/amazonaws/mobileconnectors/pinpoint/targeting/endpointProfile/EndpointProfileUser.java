/**
 * Copyright 2016-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.pinpoint.targeting.endpointProfile;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.JSONBuilder;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.JSONSerializable;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * An endpoint profile user
 */
public class EndpointProfileUser implements JSONSerializable {
    private static final Log log = LogFactory.getLog(EndpointProfileUser.class);

    private String userId;
    private Map<String, List<String>> userAttributes;

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Map<String, List<String>> getUserAttributes() {
        return this.userAttributes;
    }

    public void setUserAttributes(Map<String, List<String>> userAttributes) {
        this.userAttributes = userAttributes;
    }

    public EndpointProfileUser addUserAttribute(String key, List<String> value) {
        if (this.userAttributes == null) {
            this.userAttributes = new ConcurrentHashMap<>();
        }
        this.userAttributes.put(key, value);
        return this;
    }

    @Override
    public JSONObject toJSONObject() {
        final JSONBuilder builder = new JSONBuilder(null);
        builder.withAttribute("UserId", getUserId());

        if (getUserAttributes() != null) {
            final JSONObject attributesJson = new JSONObject();
            for (final Map.Entry<String, List<String>> entry : getUserAttributes().entrySet()) {
                try {
                    final JSONArray array = new JSONArray(entry.getValue());
                    attributesJson.put(entry.getKey(), array);
                } catch (final JSONException e) {
                    // Do not log e due to potentially sensitive information
                    log.warn("Error serializing user attributes.");
                }
            }

            // If there are any attributes put then add the attributes to the structure
            if (attributesJson.length() > 0) {
                builder.withAttribute("UserAttributes", attributesJson);
            }
        }

        return builder.toJSONObject();
    }
}
