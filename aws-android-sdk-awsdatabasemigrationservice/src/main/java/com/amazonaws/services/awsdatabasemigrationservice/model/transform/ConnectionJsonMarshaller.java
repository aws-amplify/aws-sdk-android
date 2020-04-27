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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Connection
 */
class ConnectionJsonMarshaller {

    public void marshall(Connection connection, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (connection.getReplicationInstanceArn() != null) {
            String replicationInstanceArn = connection.getReplicationInstanceArn();
            jsonWriter.name("ReplicationInstanceArn");
            jsonWriter.value(replicationInstanceArn);
        }
        if (connection.getEndpointArn() != null) {
            String endpointArn = connection.getEndpointArn();
            jsonWriter.name("EndpointArn");
            jsonWriter.value(endpointArn);
        }
        if (connection.getStatus() != null) {
            String status = connection.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (connection.getLastFailureMessage() != null) {
            String lastFailureMessage = connection.getLastFailureMessage();
            jsonWriter.name("LastFailureMessage");
            jsonWriter.value(lastFailureMessage);
        }
        if (connection.getEndpointIdentifier() != null) {
            String endpointIdentifier = connection.getEndpointIdentifier();
            jsonWriter.name("EndpointIdentifier");
            jsonWriter.value(endpointIdentifier);
        }
        if (connection.getReplicationInstanceIdentifier() != null) {
            String replicationInstanceIdentifier = connection.getReplicationInstanceIdentifier();
            jsonWriter.name("ReplicationInstanceIdentifier");
            jsonWriter.value(replicationInstanceIdentifier);
        }
        jsonWriter.endObject();
    }

    private static ConnectionJsonMarshaller instance;

    public static ConnectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConnectionJsonMarshaller();
        return instance;
    }
}
