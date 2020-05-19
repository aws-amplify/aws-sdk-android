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

package com.amazonaws.services.health.model.transform;

import com.amazonaws.services.health.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO EntityFilter
 */
class EntityFilterJsonUnmarshaller implements Unmarshaller<EntityFilter, JsonUnmarshallerContext> {

    public EntityFilter unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EntityFilter entityFilter = new EntityFilter();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("eventArns")) {
                entityFilter.setEventArns(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("entityArns")) {
                entityFilter.setEntityArns(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("entityValues")) {
                entityFilter.setEntityValues(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("lastUpdatedTimes")) {
                entityFilter.setLastUpdatedTimes(new ListUnmarshaller<DateTimeRange>(
                        DateTimeRangeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("tags")) {
                entityFilter.setTags(new ListUnmarshaller<java.util.Map<String, String>>(
                        new MapUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                        )
                                .unmarshall(context));
            } else if (name.equals("statusCodes")) {
                entityFilter.setStatusCodes(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return entityFilter;
    }

    private static EntityFilterJsonUnmarshaller instance;

    public static EntityFilterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EntityFilterJsonUnmarshaller();
        return instance;
    }
}
