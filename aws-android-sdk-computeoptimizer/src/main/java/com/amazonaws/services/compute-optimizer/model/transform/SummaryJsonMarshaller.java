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
package com.amazonaws.services.compute-optimizer.model.transform;

import com.amazonaws.services.compute-optimizer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Summary
 */
class SummaryJsonMarshaller {

    public void marshall(Summary summary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (summary.getName() != null) {
            String name = summary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (summary.getValue() != null) {
            Double value = summary.getValue();
            jsonWriter.name("value");
            jsonWriter.value(value);
        }
        jsonWriter.endObject();
    }

    private static SummaryJsonMarshaller instance;
    public static SummaryJsonMarshaller getInstance() {
        if (instance == null) instance = new SummaryJsonMarshaller();
        return instance;
    }
}
