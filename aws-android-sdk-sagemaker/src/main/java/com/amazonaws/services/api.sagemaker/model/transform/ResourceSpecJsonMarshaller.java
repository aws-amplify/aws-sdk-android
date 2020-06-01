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
 * JSON marshaller for POJO ResourceSpec
 */
class ResourceSpecJsonMarshaller {

    public void marshall(ResourceSpec resourceSpec, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resourceSpec.getSageMakerImageArn() != null) {
            String sageMakerImageArn = resourceSpec.getSageMakerImageArn();
            jsonWriter.name("SageMakerImageArn");
            jsonWriter.value(sageMakerImageArn);
        }
        if (resourceSpec.getInstanceType() != null) {
            String instanceType = resourceSpec.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        jsonWriter.endObject();
    }

    private static ResourceSpecJsonMarshaller instance;

    public static ResourceSpecJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceSpecJsonMarshaller();
        return instance;
    }
}
