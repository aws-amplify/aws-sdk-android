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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TimestreamAction
 */
class TimestreamActionJsonMarshaller {

    public void marshall(TimestreamAction timestreamAction, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (timestreamAction.getRoleArn() != null) {
            String roleArn = timestreamAction.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (timestreamAction.getDatabaseName() != null) {
            String databaseName = timestreamAction.getDatabaseName();
            jsonWriter.name("databaseName");
            jsonWriter.value(databaseName);
        }
        if (timestreamAction.getTableName() != null) {
            String tableName = timestreamAction.getTableName();
            jsonWriter.name("tableName");
            jsonWriter.value(tableName);
        }
        if (timestreamAction.getDimensions() != null) {
            java.util.List<TimestreamDimension> dimensions = timestreamAction.getDimensions();
            jsonWriter.name("dimensions");
            jsonWriter.beginArray();
            for (TimestreamDimension dimensionsItem : dimensions) {
                if (dimensionsItem != null) {
                    TimestreamDimensionJsonMarshaller.getInstance().marshall(dimensionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (timestreamAction.getTimestamp() != null) {
            TimestreamTimestamp timestamp = timestreamAction.getTimestamp();
            jsonWriter.name("timestamp");
            TimestreamTimestampJsonMarshaller.getInstance().marshall(timestamp, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TimestreamActionJsonMarshaller instance;

    public static TimestreamActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TimestreamActionJsonMarshaller();
        return instance;
    }
}
