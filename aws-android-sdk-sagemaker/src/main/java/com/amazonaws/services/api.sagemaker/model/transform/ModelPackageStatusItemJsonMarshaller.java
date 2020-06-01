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
 * JSON marshaller for POJO ModelPackageStatusItem
 */
class ModelPackageStatusItemJsonMarshaller {

    public void marshall(ModelPackageStatusItem modelPackageStatusItem, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (modelPackageStatusItem.getName() != null) {
            String name = modelPackageStatusItem.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (modelPackageStatusItem.getStatus() != null) {
            String status = modelPackageStatusItem.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (modelPackageStatusItem.getFailureReason() != null) {
            String failureReason = modelPackageStatusItem.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        jsonWriter.endObject();
    }

    private static ModelPackageStatusItemJsonMarshaller instance;

    public static ModelPackageStatusItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ModelPackageStatusItemJsonMarshaller();
        return instance;
    }
}
