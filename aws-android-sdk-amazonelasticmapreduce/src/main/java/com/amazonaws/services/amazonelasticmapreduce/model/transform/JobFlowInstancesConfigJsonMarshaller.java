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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JobFlowInstancesConfig
 */
class JobFlowInstancesConfigJsonMarshaller {

    public void marshall(JobFlowInstancesConfig jobFlowInstancesConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (jobFlowInstancesConfig.getMasterInstanceType() != null) {
            String masterInstanceType = jobFlowInstancesConfig.getMasterInstanceType();
            jsonWriter.name("MasterInstanceType");
            jsonWriter.value(masterInstanceType);
        }
        if (jobFlowInstancesConfig.getSlaveInstanceType() != null) {
            String slaveInstanceType = jobFlowInstancesConfig.getSlaveInstanceType();
            jsonWriter.name("SlaveInstanceType");
            jsonWriter.value(slaveInstanceType);
        }
        if (jobFlowInstancesConfig.getInstanceCount() != null) {
            Integer instanceCount = jobFlowInstancesConfig.getInstanceCount();
            jsonWriter.name("InstanceCount");
            jsonWriter.value(instanceCount);
        }
        if (jobFlowInstancesConfig.getInstanceGroups() != null) {
            java.util.List<InstanceGroupConfig> instanceGroups = jobFlowInstancesConfig
                    .getInstanceGroups();
            jsonWriter.name("InstanceGroups");
            jsonWriter.beginArray();
            for (InstanceGroupConfig instanceGroupsItem : instanceGroups) {
                if (instanceGroupsItem != null) {
                    InstanceGroupConfigJsonMarshaller.getInstance().marshall(instanceGroupsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (jobFlowInstancesConfig.getInstanceFleets() != null) {
            java.util.List<InstanceFleetConfig> instanceFleets = jobFlowInstancesConfig
                    .getInstanceFleets();
            jsonWriter.name("InstanceFleets");
            jsonWriter.beginArray();
            for (InstanceFleetConfig instanceFleetsItem : instanceFleets) {
                if (instanceFleetsItem != null) {
                    InstanceFleetConfigJsonMarshaller.getInstance().marshall(instanceFleetsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (jobFlowInstancesConfig.getEc2KeyName() != null) {
            String ec2KeyName = jobFlowInstancesConfig.getEc2KeyName();
            jsonWriter.name("Ec2KeyName");
            jsonWriter.value(ec2KeyName);
        }
        if (jobFlowInstancesConfig.getPlacement() != null) {
            PlacementType placement = jobFlowInstancesConfig.getPlacement();
            jsonWriter.name("Placement");
            PlacementTypeJsonMarshaller.getInstance().marshall(placement, jsonWriter);
        }
        if (jobFlowInstancesConfig.getKeepJobFlowAliveWhenNoSteps() != null) {
            Boolean keepJobFlowAliveWhenNoSteps = jobFlowInstancesConfig
                    .getKeepJobFlowAliveWhenNoSteps();
            jsonWriter.name("KeepJobFlowAliveWhenNoSteps");
            jsonWriter.value(keepJobFlowAliveWhenNoSteps);
        }
        if (jobFlowInstancesConfig.getTerminationProtected() != null) {
            Boolean terminationProtected = jobFlowInstancesConfig.getTerminationProtected();
            jsonWriter.name("TerminationProtected");
            jsonWriter.value(terminationProtected);
        }
        if (jobFlowInstancesConfig.getHadoopVersion() != null) {
            String hadoopVersion = jobFlowInstancesConfig.getHadoopVersion();
            jsonWriter.name("HadoopVersion");
            jsonWriter.value(hadoopVersion);
        }
        if (jobFlowInstancesConfig.getEc2SubnetId() != null) {
            String ec2SubnetId = jobFlowInstancesConfig.getEc2SubnetId();
            jsonWriter.name("Ec2SubnetId");
            jsonWriter.value(ec2SubnetId);
        }
        if (jobFlowInstancesConfig.getEc2SubnetIds() != null) {
            java.util.List<String> ec2SubnetIds = jobFlowInstancesConfig.getEc2SubnetIds();
            jsonWriter.name("Ec2SubnetIds");
            jsonWriter.beginArray();
            for (String ec2SubnetIdsItem : ec2SubnetIds) {
                if (ec2SubnetIdsItem != null) {
                    jsonWriter.value(ec2SubnetIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (jobFlowInstancesConfig.getEmrManagedMasterSecurityGroup() != null) {
            String emrManagedMasterSecurityGroup = jobFlowInstancesConfig
                    .getEmrManagedMasterSecurityGroup();
            jsonWriter.name("EmrManagedMasterSecurityGroup");
            jsonWriter.value(emrManagedMasterSecurityGroup);
        }
        if (jobFlowInstancesConfig.getEmrManagedSlaveSecurityGroup() != null) {
            String emrManagedSlaveSecurityGroup = jobFlowInstancesConfig
                    .getEmrManagedSlaveSecurityGroup();
            jsonWriter.name("EmrManagedSlaveSecurityGroup");
            jsonWriter.value(emrManagedSlaveSecurityGroup);
        }
        if (jobFlowInstancesConfig.getServiceAccessSecurityGroup() != null) {
            String serviceAccessSecurityGroup = jobFlowInstancesConfig
                    .getServiceAccessSecurityGroup();
            jsonWriter.name("ServiceAccessSecurityGroup");
            jsonWriter.value(serviceAccessSecurityGroup);
        }
        if (jobFlowInstancesConfig.getAdditionalMasterSecurityGroups() != null) {
            java.util.List<String> additionalMasterSecurityGroups = jobFlowInstancesConfig
                    .getAdditionalMasterSecurityGroups();
            jsonWriter.name("AdditionalMasterSecurityGroups");
            jsonWriter.beginArray();
            for (String additionalMasterSecurityGroupsItem : additionalMasterSecurityGroups) {
                if (additionalMasterSecurityGroupsItem != null) {
                    jsonWriter.value(additionalMasterSecurityGroupsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (jobFlowInstancesConfig.getAdditionalSlaveSecurityGroups() != null) {
            java.util.List<String> additionalSlaveSecurityGroups = jobFlowInstancesConfig
                    .getAdditionalSlaveSecurityGroups();
            jsonWriter.name("AdditionalSlaveSecurityGroups");
            jsonWriter.beginArray();
            for (String additionalSlaveSecurityGroupsItem : additionalSlaveSecurityGroups) {
                if (additionalSlaveSecurityGroupsItem != null) {
                    jsonWriter.value(additionalSlaveSecurityGroupsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static JobFlowInstancesConfigJsonMarshaller instance;

    public static JobFlowInstancesConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobFlowInstancesConfigJsonMarshaller();
        return instance;
    }
}
