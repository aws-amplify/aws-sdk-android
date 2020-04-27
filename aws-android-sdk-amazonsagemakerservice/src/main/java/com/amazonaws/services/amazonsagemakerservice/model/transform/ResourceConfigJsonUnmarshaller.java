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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ResourceConfig
 */
class ResourceConfigJsonUnmarshaller implements
        Unmarshaller<ResourceConfig, JsonUnmarshallerContext> {

    public ResourceConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ResourceConfig resourceConfig = new ResourceConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("InstanceType")) {
                resourceConfig.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceCount")) {
                resourceConfig.setInstanceCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeSizeInGB")) {
                resourceConfig.setVolumeSizeInGB(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeKmsKeyId")) {
                resourceConfig.setVolumeKmsKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return resourceConfig;
    }

    private static ResourceConfigJsonUnmarshaller instance;

    public static ResourceConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceConfigJsonUnmarshaller();
        return instance;
    }
}
