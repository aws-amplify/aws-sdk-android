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
 * JSON unmarshaller for POJO JobFlowInstancesDetail
 */
class JobFlowInstancesDetailJsonUnmarshaller implements
        Unmarshaller<JobFlowInstancesDetail, JsonUnmarshallerContext> {

    public JobFlowInstancesDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        JobFlowInstancesDetail jobFlowInstancesDetail = new JobFlowInstancesDetail();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("MasterInstanceType")) {
                jobFlowInstancesDetail.setMasterInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MasterPublicDnsName")) {
                jobFlowInstancesDetail.setMasterPublicDnsName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MasterInstanceId")) {
                jobFlowInstancesDetail.setMasterInstanceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SlaveInstanceType")) {
                jobFlowInstancesDetail.setSlaveInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceCount")) {
                jobFlowInstancesDetail.setInstanceCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceGroups")) {
                jobFlowInstancesDetail.setInstanceGroups(new ListUnmarshaller<InstanceGroupDetail>(
                        InstanceGroupDetailJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NormalizedInstanceHours")) {
                jobFlowInstancesDetail.setNormalizedInstanceHours(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Ec2KeyName")) {
                jobFlowInstancesDetail.setEc2KeyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Ec2SubnetId")) {
                jobFlowInstancesDetail.setEc2SubnetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Placement")) {
                jobFlowInstancesDetail.setPlacement(PlacementTypeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeepJobFlowAliveWhenNoSteps")) {
                jobFlowInstancesDetail.setKeepJobFlowAliveWhenNoSteps(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TerminationProtected")) {
                jobFlowInstancesDetail.setTerminationProtected(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("HadoopVersion")) {
                jobFlowInstancesDetail.setHadoopVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return jobFlowInstancesDetail;
    }

    private static JobFlowInstancesDetailJsonUnmarshaller instance;

    public static JobFlowInstancesDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobFlowInstancesDetailJsonUnmarshaller();
        return instance;
    }
}
