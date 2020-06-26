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
 * JSON marshaller for POJO SqlServerParameters
 */
class SqlServerParametersJsonMarshaller {

    public void marshall(SqlServerParameters sqlServerParameters, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sqlServerParameters.getHost() != null) {
            String host = sqlServerParameters.getHost();
            jsonWriter.name("Host");
            jsonWriter.value(host);
        }
        if (sqlServerParameters.getPort() != null) {
            Integer port = sqlServerParameters.getPort();
            jsonWriter.name("Port");
            jsonWriter.value(port);
        }
        if (sqlServerParameters.getDatabase() != null) {
            String database = sqlServerParameters.getDatabase();
            jsonWriter.name("Database");
            jsonWriter.value(database);
        }
        jsonWriter.endObject();
    }

    private static SqlServerParametersJsonMarshaller instance;

    public static SqlServerParametersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SqlServerParametersJsonMarshaller();
        return instance;
    }
}
