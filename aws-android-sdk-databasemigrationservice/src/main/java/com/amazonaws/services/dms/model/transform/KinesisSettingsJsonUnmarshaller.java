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

package com.amazonaws.services.dms.model.transform;

import com.amazonaws.services.dms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO KinesisSettings
 */
class KinesisSettingsJsonUnmarshaller implements
        Unmarshaller<KinesisSettings, JsonUnmarshallerContext> {

    public KinesisSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        KinesisSettings kinesisSettings = new KinesisSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("StreamArn")) {
                kinesisSettings.setStreamArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MessageFormat")) {
                kinesisSettings.setMessageFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServiceAccessRoleArn")) {
                kinesisSettings.setServiceAccessRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IncludeTransactionDetails")) {
                kinesisSettings.setIncludeTransactionDetails(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IncludePartitionValue")) {
                kinesisSettings.setIncludePartitionValue(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PartitionIncludeSchemaTable")) {
                kinesisSettings.setPartitionIncludeSchemaTable(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("IncludeTableAlterOperations")) {
                kinesisSettings.setIncludeTableAlterOperations(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("IncludeControlDetails")) {
                kinesisSettings.setIncludeControlDetails(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return kinesisSettings;
    }

    private static KinesisSettingsJsonUnmarshaller instance;

    public static KinesisSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KinesisSettingsJsonUnmarshaller();
        return instance;
    }
}
