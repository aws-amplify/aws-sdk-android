/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TimestreamAction
 */
class TimestreamActionJsonUnmarshaller implements
        Unmarshaller<TimestreamAction, JsonUnmarshallerContext> {

    public TimestreamAction unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TimestreamAction timestreamAction = new TimestreamAction();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("roleArn")) {
                timestreamAction.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("databaseName")) {
                timestreamAction.setDatabaseName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tableName")) {
                timestreamAction.setTableName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("dimensions")) {
                timestreamAction.setDimensions(new ListUnmarshaller<TimestreamDimension>(
                        TimestreamDimensionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("timestamp")) {
                timestreamAction.setTimestamp(TimestreamTimestampJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return timestreamAction;
    }

    private static TimestreamActionJsonUnmarshaller instance;

    public static TimestreamActionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TimestreamActionJsonUnmarshaller();
        return instance;
    }
}
