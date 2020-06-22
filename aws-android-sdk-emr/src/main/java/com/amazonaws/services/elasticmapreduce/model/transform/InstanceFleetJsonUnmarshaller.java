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

package com.amazonaws.services.elasticmapreduce.model.transform;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO InstanceFleet
 */
class InstanceFleetJsonUnmarshaller implements Unmarshaller<InstanceFleet, JsonUnmarshallerContext> {

    public InstanceFleet unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InstanceFleet instanceFleet = new InstanceFleet();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                instanceFleet.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                instanceFleet.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                instanceFleet.setStatus(InstanceFleetStatusJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceFleetType")) {
                instanceFleet.setInstanceFleetType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetOnDemandCapacity")) {
                instanceFleet.setTargetOnDemandCapacity(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetSpotCapacity")) {
                instanceFleet.setTargetSpotCapacity(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProvisionedOnDemandCapacity")) {
                instanceFleet.setProvisionedOnDemandCapacity(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProvisionedSpotCapacity")) {
                instanceFleet.setProvisionedSpotCapacity(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceTypeSpecifications")) {
                instanceFleet
                        .setInstanceTypeSpecifications(new ListUnmarshaller<InstanceTypeSpecification>(
                                InstanceTypeSpecificationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("LaunchSpecifications")) {
                instanceFleet
                        .setLaunchSpecifications(InstanceFleetProvisioningSpecificationsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return instanceFleet;
    }

    private static InstanceFleetJsonUnmarshaller instance;

    public static InstanceFleetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceFleetJsonUnmarshaller();
        return instance;
    }
}
