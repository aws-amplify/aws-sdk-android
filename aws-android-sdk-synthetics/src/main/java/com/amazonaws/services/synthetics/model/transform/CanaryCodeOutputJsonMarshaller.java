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

package com.amazonaws.services.synthetics.model.transform;

import com.amazonaws.services.synthetics.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CanaryCodeOutput
 */
class CanaryCodeOutputJsonMarshaller {

    public void marshall(CanaryCodeOutput canaryCodeOutput, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (canaryCodeOutput.getSourceLocationArn() != null) {
            String sourceLocationArn = canaryCodeOutput.getSourceLocationArn();
            jsonWriter.name("SourceLocationArn");
            jsonWriter.value(sourceLocationArn);
        }
        if (canaryCodeOutput.getHandler() != null) {
            String handler = canaryCodeOutput.getHandler();
            jsonWriter.name("Handler");
            jsonWriter.value(handler);
        }
        jsonWriter.endObject();
    }

    private static CanaryCodeOutputJsonMarshaller instance;

    public static CanaryCodeOutputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CanaryCodeOutputJsonMarshaller();
        return instance;
    }
}
