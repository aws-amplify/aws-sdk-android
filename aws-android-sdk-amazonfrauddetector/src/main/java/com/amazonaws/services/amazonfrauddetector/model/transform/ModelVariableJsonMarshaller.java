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

package com.amazonaws.services.amazonfrauddetector.model.transform;

import com.amazonaws.services.amazonfrauddetector.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ModelVariable
 */
class ModelVariableJsonMarshaller {

    public void marshall(ModelVariable modelVariable, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (modelVariable.getName() != null) {
            String name = modelVariable.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (modelVariable.getIndex() != null) {
            Integer index = modelVariable.getIndex();
            jsonWriter.name("index");
            jsonWriter.value(index);
        }
        jsonWriter.endObject();
    }

    private static ModelVariableJsonMarshaller instance;

    public static ModelVariableJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ModelVariableJsonMarshaller();
        return instance;
    }
}
