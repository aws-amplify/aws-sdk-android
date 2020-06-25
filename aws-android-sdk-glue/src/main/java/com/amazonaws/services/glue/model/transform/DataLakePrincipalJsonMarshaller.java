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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DataLakePrincipal
 */
class DataLakePrincipalJsonMarshaller {

    public void marshall(DataLakePrincipal dataLakePrincipal, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (dataLakePrincipal.getDataLakePrincipalIdentifier() != null) {
            String dataLakePrincipalIdentifier = dataLakePrincipal.getDataLakePrincipalIdentifier();
            jsonWriter.name("DataLakePrincipalIdentifier");
            jsonWriter.value(dataLakePrincipalIdentifier);
        }
        jsonWriter.endObject();
    }

    private static DataLakePrincipalJsonMarshaller instance;

    public static DataLakePrincipalJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DataLakePrincipalJsonMarshaller();
        return instance;
    }
}
