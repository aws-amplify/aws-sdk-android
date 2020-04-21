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
 * JSON unmarshaller for POJO JobFlowDetail
 */
class JobFlowDetailJsonUnmarshaller implements Unmarshaller<JobFlowDetail, JsonUnmarshallerContext> {

    public JobFlowDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        JobFlowDetail jobFlowDetail = new JobFlowDetail();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobFlowId")) {
                jobFlowDetail.setJobFlowId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                jobFlowDetail.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LogUri")) {
                jobFlowDetail.setLogUri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AmiVersion")) {
                jobFlowDetail.setAmiVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExecutionStatusDetail")) {
                jobFlowDetail.setExecutionStatusDetail(JobFlowExecutionStatusDetailJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Instances")) {
                jobFlowDetail.setInstances(JobFlowInstancesDetailJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Steps")) {
                jobFlowDetail.setSteps(new ListUnmarshaller<StepDetail>(StepDetailJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("BootstrapActions")) {
                jobFlowDetail.setBootstrapActions(new ListUnmarshaller<BootstrapActionDetail>(
                        BootstrapActionDetailJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SupportedProducts")) {
                jobFlowDetail.setSupportedProducts(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("VisibleToAllUsers")) {
                jobFlowDetail.setVisibleToAllUsers(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobFlowRole")) {
                jobFlowDetail.setJobFlowRole(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServiceRole")) {
                jobFlowDetail.setServiceRole(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutoScalingRole")) {
                jobFlowDetail.setAutoScalingRole(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScaleDownBehavior")) {
                jobFlowDetail.setScaleDownBehavior(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return jobFlowDetail;
    }

    private static JobFlowDetailJsonUnmarshaller instance;

    public static JobFlowDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobFlowDetailJsonUnmarshaller();
        return instance;
    }
}
