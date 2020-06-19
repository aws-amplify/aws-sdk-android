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
 * JSON unmarshaller for POJO FleetData
 */
class FleetDataJsonUnmarshaller implements Unmarshaller<FleetData, JsonUnmarshallerContext> {

    public FleetData unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FleetData fleetData = new FleetData();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ActivityStatus")) {
                fleetData.setActivityStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreateTime")) {
                fleetData.setCreateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FleetId")) {
                fleetData.setFleetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FleetState")) {
                fleetData.setFleetState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ClientToken")) {
                fleetData.setClientToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExcessCapacityTerminationPolicy")) {
                fleetData.setExcessCapacityTerminationPolicy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FulfilledCapacity")) {
                fleetData.setFulfilledCapacity(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FulfilledOnDemandCapacity")) {
                fleetData.setFulfilledOnDemandCapacity(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LaunchTemplateConfigs")) {
                fleetData.setLaunchTemplateConfigs(new ListUnmarshaller<FleetLaunchTemplateConfig>(
                        FleetLaunchTemplateConfigJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TargetCapacitySpecification")) {
                fleetData
                        .setTargetCapacitySpecification(TargetCapacitySpecificationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("TerminateInstancesWithExpiration")) {
                fleetData.setTerminateInstancesWithExpiration(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                fleetData.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ValidFrom")) {
                fleetData.setValidFrom(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ValidUntil")) {
                fleetData.setValidUntil(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplaceUnhealthyInstances")) {
                fleetData.setReplaceUnhealthyInstances(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SpotOptions")) {
                fleetData.setSpotOptions(SpotOptionsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OnDemandOptions")) {
                fleetData.setOnDemandOptions(OnDemandOptionsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                fleetData.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Errors")) {
                fleetData.setErrors(new ListUnmarshaller<DescribeFleetError>(
                        DescribeFleetErrorJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Instances")) {
                fleetData.setInstances(new ListUnmarshaller<DescribeFleetsInstances>(
                        DescribeFleetsInstancesJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return fleetData;
    }

    private static FleetDataJsonUnmarshaller instance;

    public static FleetDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FleetDataJsonUnmarshaller();
        return instance;
    }
}
