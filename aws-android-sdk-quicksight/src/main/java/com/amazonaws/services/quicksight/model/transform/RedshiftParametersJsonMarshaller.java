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
 * JSON marshaller for POJO RedshiftParameters
 */
class RedshiftParametersJsonMarshaller {

    public void marshall(RedshiftParameters redshiftParameters, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (redshiftParameters.getHost() != null) {
            String host = redshiftParameters.getHost();
            jsonWriter.name("Host");
            jsonWriter.value(host);
        }
        if (redshiftParameters.getPort() != null) {
            Integer port = redshiftParameters.getPort();
            jsonWriter.name("Port");
            jsonWriter.value(port);
        }
        if (redshiftParameters.getDatabase() != null) {
            String database = redshiftParameters.getDatabase();
            jsonWriter.name("Database");
            jsonWriter.value(database);
        }
        if (redshiftParameters.getClusterId() != null) {
            String clusterId = redshiftParameters.getClusterId();
            jsonWriter.name("ClusterId");
            jsonWriter.value(clusterId);
        }
        jsonWriter.endObject();
    }

    private static RedshiftParametersJsonMarshaller instance;

    public static RedshiftParametersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RedshiftParametersJsonMarshaller();
        return instance;
    }
}
