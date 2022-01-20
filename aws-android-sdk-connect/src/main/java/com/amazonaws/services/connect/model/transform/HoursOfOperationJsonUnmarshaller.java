/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for POJO HoursOfOperation
 */
class HoursOfOperationJsonUnmarshaller implements
        Unmarshaller<HoursOfOperation, JsonUnmarshallerContext> {

    public HoursOfOperation unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HoursOfOperation hoursOfOperation = new HoursOfOperation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("HoursOfOperationId")) {
                hoursOfOperation.setHoursOfOperationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HoursOfOperationArn")) {
                hoursOfOperation.setHoursOfOperationArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                hoursOfOperation.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                hoursOfOperation.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimeZone")) {
                hoursOfOperation.setTimeZone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Config")) {
                hoursOfOperation.setConfig(new ListUnmarshaller<HoursOfOperationConfig>(
                        HoursOfOperationConfigJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Tags")) {
                hoursOfOperation.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return hoursOfOperation;
    }

    private static HoursOfOperationJsonUnmarshaller instance;

    public static HoursOfOperationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HoursOfOperationJsonUnmarshaller();
        return instance;
    }
}
