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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO SpotFleetRequestConfigData
 */
class SpotFleetRequestConfigDataJsonUnmarshaller implements
        Unmarshaller<SpotFleetRequestConfigData, JsonUnmarshallerContext> {

    public SpotFleetRequestConfigData unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SpotFleetRequestConfigData spotFleetRequestConfigData = new SpotFleetRequestConfigData();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AllocationStrategy")) {
                spotFleetRequestConfigData.setAllocationStrategy(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OnDemandAllocationStrategy")) {
                spotFleetRequestConfigData.setOnDemandAllocationStrategy(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ClientToken")) {
                spotFleetRequestConfigData.setClientToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExcessCapacityTerminationPolicy")) {
                spotFleetRequestConfigData
                        .setExcessCapacityTerminationPolicy(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("FulfilledCapacity")) {
                spotFleetRequestConfigData.setFulfilledCapacity(DoubleJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OnDemandFulfilledCapacity")) {
                spotFleetRequestConfigData.setOnDemandFulfilledCapacity(DoubleJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("IamFleetRole")) {
                spotFleetRequestConfigData.setIamFleetRole(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LaunchSpecifications")) {
                spotFleetRequestConfigData
                        .setLaunchSpecifications(new ListUnmarshaller<SpotFleetLaunchSpecification>(
                                SpotFleetLaunchSpecificationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("LaunchTemplateConfigs")) {
                spotFleetRequestConfigData
                        .setLaunchTemplateConfigs(new ListUnmarshaller<LaunchTemplateConfig>(
                                LaunchTemplateConfigJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SpotPrice")) {
                spotFleetRequestConfigData.setSpotPrice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetCapacity")) {
                spotFleetRequestConfigData.setTargetCapacity(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OnDemandTargetCapacity")) {
                spotFleetRequestConfigData.setOnDemandTargetCapacity(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OnDemandMaxTotalPrice")) {
                spotFleetRequestConfigData.setOnDemandMaxTotalPrice(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SpotMaxTotalPrice")) {
                spotFleetRequestConfigData.setSpotMaxTotalPrice(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TerminateInstancesWithExpiration")) {
                spotFleetRequestConfigData
                        .setTerminateInstancesWithExpiration(BooleanJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Type")) {
                spotFleetRequestConfigData.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ValidFrom")) {
                spotFleetRequestConfigData.setValidFrom(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ValidUntil")) {
                spotFleetRequestConfigData.setValidUntil(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplaceUnhealthyInstances")) {
                spotFleetRequestConfigData.setReplaceUnhealthyInstances(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceInterruptionBehavior")) {
                spotFleetRequestConfigData.setInstanceInterruptionBehavior(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LoadBalancersConfig")) {
                spotFleetRequestConfigData
                        .setLoadBalancersConfig(LoadBalancersConfigJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("InstancePoolsToUseCount")) {
                spotFleetRequestConfigData.setInstancePoolsToUseCount(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TagSpecifications")) {
                spotFleetRequestConfigData
                        .setTagSpecifications(new ListUnmarshaller<TagSpecification>(
                                TagSpecificationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return spotFleetRequestConfigData;
    }

    private static SpotFleetRequestConfigDataJsonUnmarshaller instance;

    public static SpotFleetRequestConfigDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SpotFleetRequestConfigDataJsonUnmarshaller();
        return instance;
    }
}
