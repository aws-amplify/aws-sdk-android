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

package com.amazonaws.services.connectparticipant.model.transform;

import com.amazonaws.services.connectparticipant.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ConnectionCredentials
 */
class ConnectionCredentialsJsonMarshaller {

    public void marshall(ConnectionCredentials connectionCredentials, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (connectionCredentials.getConnectionToken() != null) {
            String connectionToken = connectionCredentials.getConnectionToken();
            jsonWriter.name("ConnectionToken");
            jsonWriter.value(connectionToken);
        }
        if (connectionCredentials.getExpiry() != null) {
            String expiry = connectionCredentials.getExpiry();
            jsonWriter.name("Expiry");
            jsonWriter.value(expiry);
        }
        jsonWriter.endObject();
    }

    private static ConnectionCredentialsJsonMarshaller instance;

    public static ConnectionCredentialsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConnectionCredentialsJsonMarshaller();
        return instance;
    }
}
