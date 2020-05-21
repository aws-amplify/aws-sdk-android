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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CanaryRunConfigInput
 */
class CanaryRunConfigInputJsonUnmarshaller implements
        Unmarshaller<CanaryRunConfigInput, JsonUnmarshallerContext> {

    public CanaryRunConfigInput unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CanaryRunConfigInput canaryRunConfigInput = new CanaryRunConfigInput();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TimeoutInSeconds")) {
                canaryRunConfigInput.setTimeoutInSeconds(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MemoryInMB")) {
                canaryRunConfigInput.setMemoryInMB(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return canaryRunConfigInput;
    }

    private static CanaryRunConfigInputJsonUnmarshaller instance;

    public static CanaryRunConfigInputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CanaryRunConfigInputJsonUnmarshaller();
        return instance;
    }
}
