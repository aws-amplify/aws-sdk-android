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
 * JSON marshaller for POJO TeradataParameters
 */
class TeradataParametersJsonMarshaller {

    public void marshall(TeradataParameters teradataParameters, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (teradataParameters.getHost() != null) {
            String host = teradataParameters.getHost();
            jsonWriter.name("Host");
            jsonWriter.value(host);
        }
        if (teradataParameters.getPort() != null) {
            Integer port = teradataParameters.getPort();
            jsonWriter.name("Port");
            jsonWriter.value(port);
        }
        if (teradataParameters.getDatabase() != null) {
            String database = teradataParameters.getDatabase();
            jsonWriter.name("Database");
            jsonWriter.value(database);
        }
        jsonWriter.endObject();
    }

    private static TeradataParametersJsonMarshaller instance;

    public static TeradataParametersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TeradataParametersJsonMarshaller();
        return instance;
    }
}
