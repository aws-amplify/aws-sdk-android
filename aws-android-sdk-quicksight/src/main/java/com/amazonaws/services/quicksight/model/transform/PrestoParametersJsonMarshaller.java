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
 * JSON marshaller for POJO PrestoParameters
 */
class PrestoParametersJsonMarshaller {

    public void marshall(PrestoParameters prestoParameters, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (prestoParameters.getHost() != null) {
            String host = prestoParameters.getHost();
            jsonWriter.name("Host");
            jsonWriter.value(host);
        }
        if (prestoParameters.getPort() != null) {
            Integer port = prestoParameters.getPort();
            jsonWriter.name("Port");
            jsonWriter.value(port);
        }
        if (prestoParameters.getCatalog() != null) {
            String catalog = prestoParameters.getCatalog();
            jsonWriter.name("Catalog");
            jsonWriter.value(catalog);
        }
        jsonWriter.endObject();
    }

    private static PrestoParametersJsonMarshaller instance;

    public static PrestoParametersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PrestoParametersJsonMarshaller();
        return instance;
    }
}
