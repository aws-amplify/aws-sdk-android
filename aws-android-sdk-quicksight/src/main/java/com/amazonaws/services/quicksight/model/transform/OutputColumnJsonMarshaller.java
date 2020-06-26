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
 * JSON marshaller for POJO OutputColumn
 */
class OutputColumnJsonMarshaller {

    public void marshall(OutputColumn outputColumn, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (outputColumn.getName() != null) {
            String name = outputColumn.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (outputColumn.getType() != null) {
            String type = outputColumn.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static OutputColumnJsonMarshaller instance;

    public static OutputColumnJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OutputColumnJsonMarshaller();
        return instance;
    }
}
