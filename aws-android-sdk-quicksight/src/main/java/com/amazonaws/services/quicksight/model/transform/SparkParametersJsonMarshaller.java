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
 * JSON marshaller for POJO SparkParameters
 */
class SparkParametersJsonMarshaller {

    public void marshall(SparkParameters sparkParameters, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sparkParameters.getHost() != null) {
            String host = sparkParameters.getHost();
            jsonWriter.name("Host");
            jsonWriter.value(host);
        }
        if (sparkParameters.getPort() != null) {
            Integer port = sparkParameters.getPort();
            jsonWriter.name("Port");
            jsonWriter.value(port);
        }
        jsonWriter.endObject();
    }

    private static SparkParametersJsonMarshaller instance;

    public static SparkParametersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SparkParametersJsonMarshaller();
        return instance;
    }
}
