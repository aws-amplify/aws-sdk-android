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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class JSONBuilder implements JSONSerializable {
    private JSONObject json = new JSONObject();

    public JSONBuilder(Object component) {
        if (null != component) {
            this.withAttribute("class", component.getClass().getName());
            this.withAttribute("hashCode", Integer.toHexString(component.hashCode()));
        }
    }

    public JSONBuilder withAttribute(String key, Object value) {
        Object jsonValue = value instanceof JSONSerializable ? ((JSONSerializable) value)
                .toJSONObject() : value;
        try {
            json.putOpt(key, jsonValue);
        } catch (JSONException e) {
            // somehow value is Double or Float NaN or Infinity, so ignore
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
                return json.toString(4);
            } else {
                return "";
            }
        } catch (JSONException e) {
            return json.toString();
        }
    }
}
