/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO LogGroup
 */
class LogGroupJsonUnmarshaller implements Unmarshaller<LogGroup, JsonUnmarshallerContext> {

    public LogGroup unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LogGroup logGroup = new LogGroup();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("logGroupName")) {
                logGroup.setLogGroupName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationTime")) {
                logGroup.setCreationTime(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("retentionInDays")) {
                logGroup.setRetentionInDays(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("metricFilterCount")) {
                logGroup.setMetricFilterCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("arn")) {
                logGroup.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("storedBytes")) {
                logGroup.setStoredBytes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("kmsKeyId")) {
                logGroup.setKmsKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return logGroup;
    }

    private static LogGroupJsonUnmarshaller instance;

    public static LogGroupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LogGroupJsonUnmarshaller();
        return instance;
    }
}
