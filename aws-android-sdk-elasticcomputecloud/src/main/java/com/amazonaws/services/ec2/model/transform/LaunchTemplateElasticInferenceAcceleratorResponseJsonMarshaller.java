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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LaunchTemplateElasticInferenceAcceleratorResponse
 */
class LaunchTemplateElasticInferenceAcceleratorResponseJsonMarshaller {

    public void marshall(
            LaunchTemplateElasticInferenceAcceleratorResponse launchTemplateElasticInferenceAcceleratorResponse,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (launchTemplateElasticInferenceAcceleratorResponse.getType() != null) {
            String type = launchTemplateElasticInferenceAcceleratorResponse.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (launchTemplateElasticInferenceAcceleratorResponse.getCount() != null) {
            Integer count = launchTemplateElasticInferenceAcceleratorResponse.getCount();
            jsonWriter.name("Count");
            jsonWriter.value(count);
        }
        jsonWriter.endObject();
    }

    private static LaunchTemplateElasticInferenceAcceleratorResponseJsonMarshaller instance;

    public static LaunchTemplateElasticInferenceAcceleratorResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateElasticInferenceAcceleratorResponseJsonMarshaller();
        return instance;
    }
}
