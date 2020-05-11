/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AttributeFilter
 */
class AttributeFilterJsonUnmarshaller implements
        Unmarshaller<AttributeFilter, JsonUnmarshallerContext> {

    public AttributeFilter unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AttributeFilter attributeFilter = new AttributeFilter();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AndAllFilters")) {
                attributeFilter.setAndAllFilters(new ListUnmarshaller<AttributeFilter>(
                        AttributeFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("OrAllFilters")) {
                attributeFilter.setOrAllFilters(new ListUnmarshaller<AttributeFilter>(
                        AttributeFilterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NotFilter")) {
                attributeFilter.setNotFilter(AttributeFilterJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EqualsTo")) {
                attributeFilter.setEqualsTo(DocumentAttributeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContainsAll")) {
                attributeFilter.setContainsAll(DocumentAttributeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContainsAny")) {
                attributeFilter.setContainsAny(DocumentAttributeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GreaterThan")) {
                attributeFilter.setGreaterThan(DocumentAttributeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GreaterThanOrEquals")) {
                attributeFilter.setGreaterThanOrEquals(DocumentAttributeJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LessThan")) {
                attributeFilter.setLessThan(DocumentAttributeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LessThanOrEquals")) {
                attributeFilter.setLessThanOrEquals(DocumentAttributeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return attributeFilter;
    }

    private static AttributeFilterJsonUnmarshaller instance;

    public static AttributeFilterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AttributeFilterJsonUnmarshaller();
        return instance;
    }
}
