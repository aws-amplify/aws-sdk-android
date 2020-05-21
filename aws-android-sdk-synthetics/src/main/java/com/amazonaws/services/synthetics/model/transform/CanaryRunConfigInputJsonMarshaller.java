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
 * JSON marshaller for POJO CanaryRunConfigInput
 */
class CanaryRunConfigInputJsonMarshaller {

    public void marshall(CanaryRunConfigInput canaryRunConfigInput, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (canaryRunConfigInput.getTimeoutInSeconds() != null) {
            Integer timeoutInSeconds = canaryRunConfigInput.getTimeoutInSeconds();
            jsonWriter.name("TimeoutInSeconds");
            jsonWriter.value(timeoutInSeconds);
        }
        if (canaryRunConfigInput.getMemoryInMB() != null) {
            Integer memoryInMB = canaryRunConfigInput.getMemoryInMB();
            jsonWriter.name("MemoryInMB");
            jsonWriter.value(memoryInMB);
        }
        jsonWriter.endObject();
    }

    private static CanaryRunConfigInputJsonMarshaller instance;

    public static CanaryRunConfigInputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CanaryRunConfigInputJsonMarshaller();
        return instance;
    }
}
