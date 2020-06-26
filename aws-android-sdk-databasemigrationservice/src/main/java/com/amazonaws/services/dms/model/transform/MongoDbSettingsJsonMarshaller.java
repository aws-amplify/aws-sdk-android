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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MongoDbSettings
 */
class MongoDbSettingsJsonMarshaller {

    public void marshall(MongoDbSettings mongoDbSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (mongoDbSettings.getUsername() != null) {
            String username = mongoDbSettings.getUsername();
            jsonWriter.name("Username");
            jsonWriter.value(username);
        }
        if (mongoDbSettings.getPassword() != null) {
            String password = mongoDbSettings.getPassword();
            jsonWriter.name("Password");
            jsonWriter.value(password);
        }
        if (mongoDbSettings.getServerName() != null) {
            String serverName = mongoDbSettings.getServerName();
            jsonWriter.name("ServerName");
            jsonWriter.value(serverName);
        }
        if (mongoDbSettings.getPort() != null) {
            Integer port = mongoDbSettings.getPort();
            jsonWriter.name("Port");
            jsonWriter.value(port);
        }
        if (mongoDbSettings.getDatabaseName() != null) {
            String databaseName = mongoDbSettings.getDatabaseName();
            jsonWriter.name("DatabaseName");
            jsonWriter.value(databaseName);
        }
        if (mongoDbSettings.getAuthType() != null) {
            String authType = mongoDbSettings.getAuthType();
            jsonWriter.name("AuthType");
            jsonWriter.value(authType);
        }
        if (mongoDbSettings.getAuthMechanism() != null) {
            String authMechanism = mongoDbSettings.getAuthMechanism();
            jsonWriter.name("AuthMechanism");
            jsonWriter.value(authMechanism);
        }
        if (mongoDbSettings.getNestingLevel() != null) {
            String nestingLevel = mongoDbSettings.getNestingLevel();
            jsonWriter.name("NestingLevel");
            jsonWriter.value(nestingLevel);
        }
        if (mongoDbSettings.getExtractDocId() != null) {
            String extractDocId = mongoDbSettings.getExtractDocId();
            jsonWriter.name("ExtractDocId");
            jsonWriter.value(extractDocId);
        }
        if (mongoDbSettings.getDocsToInvestigate() != null) {
            String docsToInvestigate = mongoDbSettings.getDocsToInvestigate();
            jsonWriter.name("DocsToInvestigate");
            jsonWriter.value(docsToInvestigate);
        }
        if (mongoDbSettings.getAuthSource() != null) {
            String authSource = mongoDbSettings.getAuthSource();
            jsonWriter.name("AuthSource");
            jsonWriter.value(authSource);
        }
        if (mongoDbSettings.getKmsKeyId() != null) {
            String kmsKeyId = mongoDbSettings.getKmsKeyId();
            jsonWriter.name("KmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        jsonWriter.endObject();
    }

    private static MongoDbSettingsJsonMarshaller instance;

    public static MongoDbSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MongoDbSettingsJsonMarshaller();
        return instance;
    }
}
