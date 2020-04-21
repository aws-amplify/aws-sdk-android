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
 * JSON unmarshaller for POJO InstanceGroup
 */
class InstanceGroupJsonUnmarshaller implements Unmarshaller<InstanceGroup, JsonUnmarshallerContext> {

    public InstanceGroup unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InstanceGroup instanceGroup = new InstanceGroup();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                instanceGroup.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                instanceGroup.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Market")) {
                instanceGroup.setMarket(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceGroupType")) {
                instanceGroup.setInstanceGroupType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BidPrice")) {
                instanceGroup.setBidPrice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceType")) {
                instanceGroup.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestedInstanceCount")) {
                instanceGroup.setRequestedInstanceCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RunningInstanceCount")) {
                instanceGroup.setRunningInstanceCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                instanceGroup.setStatus(InstanceGroupStatusJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Configurations")) {
                instanceGroup.setConfigurations(new ListUnmarshaller<Configuration>(
                        ConfigurationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ConfigurationsVersion")) {
                instanceGroup.setConfigurationsVersion(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastSuccessfullyAppliedConfigurations")) {
                instanceGroup
                        .setLastSuccessfullyAppliedConfigurations(new ListUnmarshaller<Configuration>(
                                ConfigurationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("LastSuccessfullyAppliedConfigurationsVersion")) {
                instanceGroup.setLastSuccessfullyAppliedConfigurationsVersion(LongJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EbsBlockDevices")) {
                instanceGroup.setEbsBlockDevices(new ListUnmarshaller<EbsBlockDevice>(
                        EbsBlockDeviceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EbsOptimized")) {
                instanceGroup.setEbsOptimized(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ShrinkPolicy")) {
                instanceGroup.setShrinkPolicy(ShrinkPolicyJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutoScalingPolicy")) {
                instanceGroup.setAutoScalingPolicy(AutoScalingPolicyDescriptionJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return instanceGroup;
    }

    private static InstanceGroupJsonUnmarshaller instance;

    public static InstanceGroupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceGroupJsonUnmarshaller();
        return instance;
    }
}
