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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ElasticInferenceAccelerator
 */
class ElasticInferenceAcceleratorJsonUnmarshaller implements
        Unmarshaller<ElasticInferenceAccelerator, JsonUnmarshallerContext> {

    public ElasticInferenceAccelerator unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ElasticInferenceAccelerator elasticInferenceAccelerator = new ElasticInferenceAccelerator();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("acceleratorHealth")) {
                elasticInferenceAccelerator
                        .setAcceleratorHealth(ElasticInferenceAcceleratorHealthJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("acceleratorType")) {
                elasticInferenceAccelerator.setAcceleratorType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("acceleratorId")) {
                elasticInferenceAccelerator.setAcceleratorId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("availabilityZone")) {
                elasticInferenceAccelerator.setAvailabilityZone(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("attachedResource")) {
                elasticInferenceAccelerator.setAttachedResource(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return elasticInferenceAccelerator;
    }

    private static ElasticInferenceAcceleratorJsonUnmarshaller instance;

    public static ElasticInferenceAcceleratorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ElasticInferenceAcceleratorJsonUnmarshaller();
        return instance;
    }
}
