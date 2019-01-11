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

package com.amazonaws.mobileconnectors.pinpoint.internal.core.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONBuilder implements JSONSerializable {
    private static final Log LOGGER = LogFactory.getLog(JSONBuilder.class);
    private static final int INDENTATION = 4;
    private final JSONObject json = new JSONObject();

    public JSONBuilder(Object component) {
        if (null != component) {
            this.withAttribute("class", component.getClass().getName());
            this.withAttribute("hashCode", Integer.toHexString(component.hashCode()));
        }
    }

    public JSONBuilder withAttribute(String key, Object value) {
        final Object jsonValue = value instanceof JSONSerializable
                                         ? ((JSONSerializable) value).toJSONObject()
                                         : value;
        try {
            json.putOpt(key, jsonValue);
        } catch (final JSONException e) {
            LOGGER.warn("error parsing json", e);
        }
        return this;
    }

    @Override
    public JSONObject toJSONObject() {
        return json;
    }

    @Override
    public String toString() {
        try {
            if (json != null) {
                return json.toString(INDENTATION);
            } else {
                return "";
            }
        } catch (final JSONException e) {
            return json.toString();
        }
    }
}
