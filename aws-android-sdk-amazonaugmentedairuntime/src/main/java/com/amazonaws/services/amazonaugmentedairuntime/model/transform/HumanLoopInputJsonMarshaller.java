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

package com.amazonaws.services.amazonaugmentedairuntime.model.transform;

import com.amazonaws.services.amazonaugmentedairuntime.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HumanLoopInput
 */
class HumanLoopInputJsonMarshaller {

    public void marshall(HumanLoopInput humanLoopInput, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (humanLoopInput.getInputContent() != null) {
            String inputContent = humanLoopInput.getInputContent();
            jsonWriter.name("InputContent");
            jsonWriter.value(inputContent);
        }
        jsonWriter.endObject();
    }

    private static HumanLoopInputJsonMarshaller instance;

    public static HumanLoopInputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HumanLoopInputJsonMarshaller();
        return instance;
    }
}
