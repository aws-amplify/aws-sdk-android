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
 * JSON unmarshaller for POJO JobFlowInstancesConfig
 */
class JobFlowInstancesConfigJsonUnmarshaller implements
        Unmarshaller<JobFlowInstancesConfig, JsonUnmarshallerContext> {

    public JobFlowInstancesConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        JobFlowInstancesConfig jobFlowInstancesConfig = new JobFlowInstancesConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("MasterInstanceType")) {
                jobFlowInstancesConfig.setMasterInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SlaveInstanceType")) {
                jobFlowInstancesConfig.setSlaveInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceCount")) {
                jobFlowInstancesConfig.setInstanceCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceGroups")) {
                jobFlowInstancesConfig.setInstanceGroups(new ListUnmarshaller<InstanceGroupConfig>(
                        InstanceGroupConfigJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("InstanceFleets")) {
                jobFlowInstancesConfig.setInstanceFleets(new ListUnmarshaller<InstanceFleetConfig>(
                        InstanceFleetConfigJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Ec2KeyName")) {
                jobFlowInstancesConfig.setEc2KeyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Placement")) {
                jobFlowInstancesConfig.setPlacement(PlacementTypeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeepJobFlowAliveWhenNoSteps")) {
                jobFlowInstancesConfig.setKeepJobFlowAliveWhenNoSteps(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TerminationProtected")) {
                jobFlowInstancesConfig.setTerminationProtected(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("HadoopVersion")) {
                jobFlowInstancesConfig.setHadoopVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Ec2SubnetId")) {
                jobFlowInstancesConfig.setEc2SubnetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Ec2SubnetIds")) {
                jobFlowInstancesConfig.setEc2SubnetIds(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EmrManagedMasterSecurityGroup")) {
                jobFlowInstancesConfig.setEmrManagedMasterSecurityGroup(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EmrManagedSlaveSecurityGroup")) {
                jobFlowInstancesConfig.setEmrManagedSlaveSecurityGroup(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServiceAccessSecurityGroup")) {
                jobFlowInstancesConfig.setServiceAccessSecurityGroup(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AdditionalMasterSecurityGroups")) {
                jobFlowInstancesConfig
                        .setAdditionalMasterSecurityGroups(new ListUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AdditionalSlaveSecurityGroups")) {
                jobFlowInstancesConfig
                        .setAdditionalSlaveSecurityGroups(new ListUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return jobFlowInstancesConfig;
    }

    private static JobFlowInstancesConfigJsonUnmarshaller instance;

    public static JobFlowInstancesConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobFlowInstancesConfigJsonUnmarshaller();
        return instance;
    }
}
