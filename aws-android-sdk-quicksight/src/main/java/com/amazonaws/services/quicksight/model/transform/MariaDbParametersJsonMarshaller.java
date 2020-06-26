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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MariaDbParameters
 */
class MariaDbParametersJsonMarshaller {

    public void marshall(MariaDbParameters mariaDbParameters, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (mariaDbParameters.getHost() != null) {
            String host = mariaDbParameters.getHost();
            jsonWriter.name("Host");
            jsonWriter.value(host);
        }
        if (mariaDbParameters.getPort() != null) {
            Integer port = mariaDbParameters.getPort();
            jsonWriter.name("Port");
            jsonWriter.value(port);
        }
        if (mariaDbParameters.getDatabase() != null) {
            String database = mariaDbParameters.getDatabase();
            jsonWriter.name("Database");
            jsonWriter.value(database);
        }
        jsonWriter.endObject();
    }

    private static MariaDbParametersJsonMarshaller instance;

    public static MariaDbParametersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MariaDbParametersJsonMarshaller();
        return instance;
    }
}
