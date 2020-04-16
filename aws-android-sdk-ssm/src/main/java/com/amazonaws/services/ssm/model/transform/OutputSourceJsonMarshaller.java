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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OutputSource
 */
class OutputSourceJsonMarshaller {

    public void marshall(OutputSource outputSource, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (outputSource.getOutputSourceId() != null) {
            String outputSourceId = outputSource.getOutputSourceId();
            jsonWriter.name("OutputSourceId");
            jsonWriter.value(outputSourceId);
        }
        if (outputSource.getOutputSourceType() != null) {
            String outputSourceType = outputSource.getOutputSourceType();
            jsonWriter.name("OutputSourceType");
            jsonWriter.value(outputSourceType);
        }
        jsonWriter.endObject();
    }

    private static OutputSourceJsonMarshaller instance;

    public static OutputSourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OutputSourceJsonMarshaller();
        return instance;
    }
}
