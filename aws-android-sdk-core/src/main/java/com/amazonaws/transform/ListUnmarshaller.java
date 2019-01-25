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

import java.util.ArrayList;
import java.util.List;

/***
 * The ListUnmarshaller class.
 * @param <T> the class type.
 */
public class ListUnmarshaller<T>
        implements Unmarshaller<List<T>, JsonUnmarshallerContext> {

    private final Unmarshaller<T, JsonUnmarshallerContext> itemUnmarshaller;

    /**
     * Constructor.
     * @param itemUnmarshaller the item unmarshaller.
     */
    public ListUnmarshaller(
            Unmarshaller<T, JsonUnmarshallerContext> itemUnmarshaller) {
        this.itemUnmarshaller = itemUnmarshaller;
    }

    @Override
    public List<T> unmarshall(JsonUnmarshallerContext context)
            throws Exception {

        AwsJsonReader reader = context.getReader();
        if (reader.peek() == AwsJsonToken.VALUE_NULL) {
            reader.skipValue();
            return null;
        }

        List<T> list = new ArrayList<T>();

        reader.beginArray();
        while (reader.hasNext()) {
            list.add(itemUnmarshaller.unmarshall(context));
        }
        reader.endArray();

        return list;
    }
}
