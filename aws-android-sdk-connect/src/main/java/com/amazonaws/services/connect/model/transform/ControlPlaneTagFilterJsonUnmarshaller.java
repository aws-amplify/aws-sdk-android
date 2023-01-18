/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ControlPlaneTagFilter
 */
class ControlPlaneTagFilterJsonUnmarshaller implements
        Unmarshaller<ControlPlaneTagFilter, JsonUnmarshallerContext> {

    public ControlPlaneTagFilter unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ControlPlaneTagFilter controlPlaneTagFilter = new ControlPlaneTagFilter();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("OrConditions")) {
                controlPlaneTagFilter
                        .setOrConditions(new ListUnmarshaller<java.util.List<TagCondition>>(
                                new ListUnmarshaller<TagCondition>(TagConditionJsonUnmarshaller
                                        .getInstance()
                                )
                        )
                                .unmarshall(context));
            } else if (name.equals("AndConditions")) {
                controlPlaneTagFilter.setAndConditions(new ListUnmarshaller<TagCondition>(
                        TagConditionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TagCondition")) {
                controlPlaneTagFilter.setTagCondition(TagConditionJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return controlPlaneTagFilter;
    }

    private static ControlPlaneTagFilterJsonUnmarshaller instance;

    public static ControlPlaneTagFilterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ControlPlaneTagFilterJsonUnmarshaller();
        return instance;
    }
}
