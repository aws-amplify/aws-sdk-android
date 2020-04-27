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

package com.amazonaws.services.awsdatabasemigrationservice.model.transform;

import com.amazonaws.services.awsdatabasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MongoDbSettings
 */
class MongoDbSettingsJsonUnmarshaller implements
        Unmarshaller<MongoDbSettings, JsonUnmarshallerContext> {

    public MongoDbSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MongoDbSettings mongoDbSettings = new MongoDbSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Username")) {
                mongoDbSettings.setUsername(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Password")) {
                mongoDbSettings.setPassword(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServerName")) {
                mongoDbSettings.setServerName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Port")) {
                mongoDbSettings.setPort(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DatabaseName")) {
                mongoDbSettings.setDatabaseName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AuthType")) {
                mongoDbSettings.setAuthType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AuthMechanism")) {
                mongoDbSettings.setAuthMechanism(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NestingLevel")) {
                mongoDbSettings.setNestingLevel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExtractDocId")) {
                mongoDbSettings.setExtractDocId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DocsToInvestigate")) {
                mongoDbSettings.setDocsToInvestigate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AuthSource")) {
                mongoDbSettings.setAuthSource(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KmsKeyId")) {
                mongoDbSettings.setKmsKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return mongoDbSettings;
    }

    private static MongoDbSettingsJsonUnmarshaller instance;

    public static MongoDbSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MongoDbSettingsJsonUnmarshaller();
        return instance;
    }
}
