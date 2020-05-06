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
package com.amazonaws.services.codestar-connections.model.transform;

import com.amazonaws.services.codestar-connections.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Connection
 */
class ConnectionJsonMarshaller {

    public void marshall(Connection connection, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (connection.getConnectionName() != null) {
            String connectionName = connection.getConnectionName();
            jsonWriter.name("ConnectionName");
            jsonWriter.value(connectionName);
        }
        if (connection.getConnectionArn() != null) {
            String connectionArn = connection.getConnectionArn();
            jsonWriter.name("ConnectionArn");
            jsonWriter.value(connectionArn);
        }
        if (connection.getProviderType() != null) {
            String providerType = connection.getProviderType();
            jsonWriter.name("ProviderType");
            jsonWriter.value(providerType);
        }
        if (connection.getOwnerAccountId() != null) {
            String ownerAccountId = connection.getOwnerAccountId();
            jsonWriter.name("OwnerAccountId");
            jsonWriter.value(ownerAccountId);
        }
        if (connection.getConnectionStatus() != null) {
            String connectionStatus = connection.getConnectionStatus();
            jsonWriter.name("ConnectionStatus");
            jsonWriter.value(connectionStatus);
        }
        jsonWriter.endObject();
    }

    private static ConnectionJsonMarshaller instance;
    public static ConnectionJsonMarshaller getInstance() {
        if (instance == null) instance = new ConnectionJsonMarshaller();
        return instance;
    }
}
