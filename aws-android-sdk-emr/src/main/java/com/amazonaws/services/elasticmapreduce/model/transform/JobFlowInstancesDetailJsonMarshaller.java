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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JobFlowInstancesDetail
 */
class JobFlowInstancesDetailJsonMarshaller {

    public void marshall(JobFlowInstancesDetail jobFlowInstancesDetail, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (jobFlowInstancesDetail.getMasterInstanceType() != null) {
            String masterInstanceType = jobFlowInstancesDetail.getMasterInstanceType();
            jsonWriter.name("MasterInstanceType");
            jsonWriter.value(masterInstanceType);
        }
        if (jobFlowInstancesDetail.getMasterPublicDnsName() != null) {
            String masterPublicDnsName = jobFlowInstancesDetail.getMasterPublicDnsName();
            jsonWriter.name("MasterPublicDnsName");
            jsonWriter.value(masterPublicDnsName);
        }
        if (jobFlowInstancesDetail.getMasterInstanceId() != null) {
            String masterInstanceId = jobFlowInstancesDetail.getMasterInstanceId();
            jsonWriter.name("MasterInstanceId");
            jsonWriter.value(masterInstanceId);
        }
        if (jobFlowInstancesDetail.getSlaveInstanceType() != null) {
            String slaveInstanceType = jobFlowInstancesDetail.getSlaveInstanceType();
            jsonWriter.name("SlaveInstanceType");
            jsonWriter.value(slaveInstanceType);
        }
        if (jobFlowInstancesDetail.getInstanceCount() != null) {
            Integer instanceCount = jobFlowInstancesDetail.getInstanceCount();
            jsonWriter.name("InstanceCount");
            jsonWriter.value(instanceCount);
        }
        if (jobFlowInstancesDetail.getInstanceGroups() != null) {
            java.util.List<InstanceGroupDetail> instanceGroups = jobFlowInstancesDetail
                    .getInstanceGroups();
            jsonWriter.name("InstanceGroups");
            jsonWriter.beginArray();
            for (InstanceGroupDetail instanceGroupsItem : instanceGroups) {
                if (instanceGroupsItem != null) {
                    InstanceGroupDetailJsonMarshaller.getInstance().marshall(instanceGroupsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (jobFlowInstancesDetail.getNormalizedInstanceHours() != null) {
            Integer normalizedInstanceHours = jobFlowInstancesDetail.getNormalizedInstanceHours();
            jsonWriter.name("NormalizedInstanceHours");
            jsonWriter.value(normalizedInstanceHours);
        }
        if (jobFlowInstancesDetail.getEc2KeyName() != null) {
            String ec2KeyName = jobFlowInstancesDetail.getEc2KeyName();
            jsonWriter.name("Ec2KeyName");
            jsonWriter.value(ec2KeyName);
        }
        if (jobFlowInstancesDetail.getEc2SubnetId() != null) {
            String ec2SubnetId = jobFlowInstancesDetail.getEc2SubnetId();
            jsonWriter.name("Ec2SubnetId");
            jsonWriter.value(ec2SubnetId);
        }
        if (jobFlowInstancesDetail.getPlacement() != null) {
            PlacementType placement = jobFlowInstancesDetail.getPlacement();
            jsonWriter.name("Placement");
            PlacementTypeJsonMarshaller.getInstance().marshall(placement, jsonWriter);
        }
        if (jobFlowInstancesDetail.getKeepJobFlowAliveWhenNoSteps() != null) {
            Boolean keepJobFlowAliveWhenNoSteps = jobFlowInstancesDetail
                    .getKeepJobFlowAliveWhenNoSteps();
            jsonWriter.name("KeepJobFlowAliveWhenNoSteps");
            jsonWriter.value(keepJobFlowAliveWhenNoSteps);
        }
        if (jobFlowInstancesDetail.getTerminationProtected() != null) {
            Boolean terminationProtected = jobFlowInstancesDetail.getTerminationProtected();
            jsonWriter.name("TerminationProtected");
            jsonWriter.value(terminationProtected);
        }
        if (jobFlowInstancesDetail.getHadoopVersion() != null) {
            String hadoopVersion = jobFlowInstancesDetail.getHadoopVersion();
            jsonWriter.name("HadoopVersion");
            jsonWriter.value(hadoopVersion);
        }
        jsonWriter.endObject();
    }

    private static JobFlowInstancesDetailJsonMarshaller instance;

    public static JobFlowInstancesDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobFlowInstancesDetailJsonMarshaller();
        return instance;
    }
}
