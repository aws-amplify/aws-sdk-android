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
 * JSON marshaller for POJO AuroraPostgreSqlParameters
 */
class AuroraPostgreSqlParametersJsonMarshaller {

    public void marshall(AuroraPostgreSqlParameters auroraPostgreSqlParameters,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (auroraPostgreSqlParameters.getHost() != null) {
            String host = auroraPostgreSqlParameters.getHost();
            jsonWriter.name("Host");
            jsonWriter.value(host);
        }
        if (auroraPostgreSqlParameters.getPort() != null) {
            Integer port = auroraPostgreSqlParameters.getPort();
            jsonWriter.name("Port");
            jsonWriter.value(port);
        }
        if (auroraPostgreSqlParameters.getDatabase() != null) {
            String database = auroraPostgreSqlParameters.getDatabase();
            jsonWriter.name("Database");
            jsonWriter.value(database);
        }
        jsonWriter.endObject();
    }

    private static AuroraPostgreSqlParametersJsonMarshaller instance;

    public static AuroraPostgreSqlParametersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AuroraPostgreSqlParametersJsonMarshaller();
        return instance;
    }
}
