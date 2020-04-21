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

package com.amazonaws.services.amazonelasticmapreduce.model.transform;

import com.amazonaws.services.amazonelasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO InstanceFleetConfig
 */
class InstanceFleetConfigJsonUnmarshaller implements
        Unmarshaller<InstanceFleetConfig, JsonUnmarshallerContext> {

    public InstanceFleetConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InstanceFleetConfig instanceFleetConfig = new InstanceFleetConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                instanceFleetConfig.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceFleetType")) {
                instanceFleetConfig.setInstanceFleetType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetOnDemandCapacity")) {
                instanceFleetConfig.setTargetOnDemandCapacity(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetSpotCapacity")) {
                instanceFleetConfig.setTargetSpotCapacity(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceTypeConfigs")) {
                instanceFleetConfig
                        .setInstanceTypeConfigs(new ListUnmarshaller<InstanceTypeConfig>(
                                InstanceTypeConfigJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("LaunchSpecifications")) {
                instanceFleetConfig
                        .setLaunchSpecifications(InstanceFleetProvisioningSpecificationsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return instanceFleetConfig;
    }

    private static InstanceFleetConfigJsonUnmarshaller instance;

    public static InstanceFleetConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceFleetConfigJsonUnmarshaller();
        return instance;
    }
}
