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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AlgorithmStatusItem
 */
class AlgorithmStatusItemJsonMarshaller {

    public void marshall(AlgorithmStatusItem algorithmStatusItem, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (algorithmStatusItem.getName() != null) {
            String name = algorithmStatusItem.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (algorithmStatusItem.getStatus() != null) {
            String status = algorithmStatusItem.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (algorithmStatusItem.getFailureReason() != null) {
            String failureReason = algorithmStatusItem.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        jsonWriter.endObject();
    }

    private static AlgorithmStatusItemJsonMarshaller instance;

    public static AlgorithmStatusItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AlgorithmStatusItemJsonMarshaller();
        return instance;
    }
}
