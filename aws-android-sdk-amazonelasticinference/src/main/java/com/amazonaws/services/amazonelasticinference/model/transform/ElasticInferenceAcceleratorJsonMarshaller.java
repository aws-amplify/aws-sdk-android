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

package com.amazonaws.services.amazonelasticinference.model.transform;

import com.amazonaws.services.amazonelasticinference.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ElasticInferenceAccelerator
 */
class ElasticInferenceAcceleratorJsonMarshaller {

    public void marshall(ElasticInferenceAccelerator elasticInferenceAccelerator,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (elasticInferenceAccelerator.getAcceleratorHealth() != null) {
            ElasticInferenceAcceleratorHealth acceleratorHealth = elasticInferenceAccelerator
                    .getAcceleratorHealth();
            jsonWriter.name("acceleratorHealth");
            ElasticInferenceAcceleratorHealthJsonMarshaller.getInstance().marshall(
                    acceleratorHealth, jsonWriter);
        }
        if (elasticInferenceAccelerator.getAcceleratorType() != null) {
            String acceleratorType = elasticInferenceAccelerator.getAcceleratorType();
            jsonWriter.name("acceleratorType");
            jsonWriter.value(acceleratorType);
        }
        if (elasticInferenceAccelerator.getAcceleratorId() != null) {
            String acceleratorId = elasticInferenceAccelerator.getAcceleratorId();
            jsonWriter.name("acceleratorId");
            jsonWriter.value(acceleratorId);
        }
        if (elasticInferenceAccelerator.getAvailabilityZone() != null) {
            String availabilityZone = elasticInferenceAccelerator.getAvailabilityZone();
            jsonWriter.name("availabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (elasticInferenceAccelerator.getAttachedResource() != null) {
            String attachedResource = elasticInferenceAccelerator.getAttachedResource();
            jsonWriter.name("attachedResource");
            jsonWriter.value(attachedResource);
        }
        jsonWriter.endObject();
    }

    private static ElasticInferenceAcceleratorJsonMarshaller instance;

    public static ElasticInferenceAcceleratorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ElasticInferenceAcceleratorJsonMarshaller();
        return instance;
    }
}
