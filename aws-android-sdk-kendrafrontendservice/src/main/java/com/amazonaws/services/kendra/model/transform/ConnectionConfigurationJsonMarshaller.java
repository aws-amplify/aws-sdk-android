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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ConnectionConfiguration
 */
class ConnectionConfigurationJsonMarshaller {

    public void marshall(ConnectionConfiguration connectionConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (connectionConfiguration.getDatabaseHost() != null) {
            String databaseHost = connectionConfiguration.getDatabaseHost();
            jsonWriter.name("DatabaseHost");
            jsonWriter.value(databaseHost);
        }
        if (connectionConfiguration.getDatabasePort() != null) {
            Integer databasePort = connectionConfiguration.getDatabasePort();
            jsonWriter.name("DatabasePort");
            jsonWriter.value(databasePort);
        }
        if (connectionConfiguration.getDatabaseName() != null) {
            String databaseName = connectionConfiguration.getDatabaseName();
            jsonWriter.name("DatabaseName");
            jsonWriter.value(databaseName);
        }
        if (connectionConfiguration.getTableName() != null) {
            String tableName = connectionConfiguration.getTableName();
            jsonWriter.name("TableName");
            jsonWriter.value(tableName);
        }
        if (connectionConfiguration.getSecretArn() != null) {
            String secretArn = connectionConfiguration.getSecretArn();
            jsonWriter.name("SecretArn");
            jsonWriter.value(secretArn);
        }
        jsonWriter.endObject();
    }

    private static ConnectionConfigurationJsonMarshaller instance;

    public static ConnectionConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConnectionConfigurationJsonMarshaller();
        return instance;
    }
}
