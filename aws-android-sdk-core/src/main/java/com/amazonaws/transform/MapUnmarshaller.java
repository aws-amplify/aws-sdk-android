/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.transform;

import com.amazonaws.util.json.AwsJsonReader;
import com.amazonaws.util.json.AwsJsonToken;

import java.util.HashMap;
import java.util.Map;

/**
 * MapUnmarshaller class.
 * @param <V> value type.
 */
public class MapUnmarshaller<V> implements Unmarshaller<Map<String, V>, JsonUnmarshallerContext> {

    private final Unmarshaller<V, JsonUnmarshallerContext> valueUnmarshaller;

    /**
     * Constructor.
     * @param valueUnmarshaller the value unmarshaller.
     */
    public MapUnmarshaller(Unmarshaller<V, JsonUnmarshallerContext> valueUnmarshaller) {
        this.valueUnmarshaller = valueUnmarshaller;
    }

    @Override
    public Map<String, V> unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (reader.peek() == AwsJsonToken.VALUE_NULL) {
            reader.skipValue();
            return null;
        }

        Map<String, V> map = new HashMap<String, V>();

        reader.beginObject();
        while (reader.hasNext()) {
            String key = reader.nextName();
            V v = valueUnmarshaller.unmarshall(context);
            map.put(key, v);
        }
        reader.endObject();

        return map;
    }

}
