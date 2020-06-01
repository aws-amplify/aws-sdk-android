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
 * JSON marshaller for POJO JobFlowDetail
 */
class JobFlowDetailJsonMarshaller {

    public void marshall(JobFlowDetail jobFlowDetail, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (jobFlowDetail.getJobFlowId() != null) {
            String jobFlowId = jobFlowDetail.getJobFlowId();
            jsonWriter.name("JobFlowId");
            jsonWriter.value(jobFlowId);
        }
        if (jobFlowDetail.getName() != null) {
            String name = jobFlowDetail.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (jobFlowDetail.getLogUri() != null) {
            String logUri = jobFlowDetail.getLogUri();
            jsonWriter.name("LogUri");
            jsonWriter.value(logUri);
        }
        if (jobFlowDetail.getLogEncryptionKmsKeyId() != null) {
            String logEncryptionKmsKeyId = jobFlowDetail.getLogEncryptionKmsKeyId();
            jsonWriter.name("LogEncryptionKmsKeyId");
            jsonWriter.value(logEncryptionKmsKeyId);
        }
        if (jobFlowDetail.getAmiVersion() != null) {
            String amiVersion = jobFlowDetail.getAmiVersion();
            jsonWriter.name("AmiVersion");
            jsonWriter.value(amiVersion);
        }
        if (jobFlowDetail.getExecutionStatusDetail() != null) {
            JobFlowExecutionStatusDetail executionStatusDetail = jobFlowDetail
                    .getExecutionStatusDetail();
            jsonWriter.name("ExecutionStatusDetail");
            JobFlowExecutionStatusDetailJsonMarshaller.getInstance().marshall(
                    executionStatusDetail, jsonWriter);
        }
        if (jobFlowDetail.getInstances() != null) {
            JobFlowInstancesDetail instances = jobFlowDetail.getInstances();
            jsonWriter.name("Instances");
            JobFlowInstancesDetailJsonMarshaller.getInstance().marshall(instances, jsonWriter);
        }
        if (jobFlowDetail.getSteps() != null) {
            java.util.List<StepDetail> steps = jobFlowDetail.getSteps();
            jsonWriter.name("Steps");
            jsonWriter.beginArray();
            for (StepDetail stepsItem : steps) {
                if (stepsItem != null) {
                    StepDetailJsonMarshaller.getInstance().marshall(stepsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (jobFlowDetail.getBootstrapActions() != null) {
            java.util.List<BootstrapActionDetail> bootstrapActions = jobFlowDetail
                    .getBootstrapActions();
            jsonWriter.name("BootstrapActions");
            jsonWriter.beginArray();
            for (BootstrapActionDetail bootstrapActionsItem : bootstrapActions) {
                if (bootstrapActionsItem != null) {
                    BootstrapActionDetailJsonMarshaller.getInstance().marshall(
                            bootstrapActionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (jobFlowDetail.getSupportedProducts() != null) {
            java.util.List<String> supportedProducts = jobFlowDetail.getSupportedProducts();
            jsonWriter.name("SupportedProducts");
            jsonWriter.beginArray();
            for (String supportedProductsItem : supportedProducts) {
                if (supportedProductsItem != null) {
                    jsonWriter.value(supportedProductsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (jobFlowDetail.getVisibleToAllUsers() != null) {
            Boolean visibleToAllUsers = jobFlowDetail.getVisibleToAllUsers();
            jsonWriter.name("VisibleToAllUsers");
            jsonWriter.value(visibleToAllUsers);
        }
        if (jobFlowDetail.getJobFlowRole() != null) {
            String jobFlowRole = jobFlowDetail.getJobFlowRole();
            jsonWriter.name("JobFlowRole");
            jsonWriter.value(jobFlowRole);
        }
        if (jobFlowDetail.getServiceRole() != null) {
            String serviceRole = jobFlowDetail.getServiceRole();
            jsonWriter.name("ServiceRole");
            jsonWriter.value(serviceRole);
        }
        if (jobFlowDetail.getAutoScalingRole() != null) {
            String autoScalingRole = jobFlowDetail.getAutoScalingRole();
            jsonWriter.name("AutoScalingRole");
            jsonWriter.value(autoScalingRole);
        }
        if (jobFlowDetail.getScaleDownBehavior() != null) {
            String scaleDownBehavior = jobFlowDetail.getScaleDownBehavior();
            jsonWriter.name("ScaleDownBehavior");
            jsonWriter.value(scaleDownBehavior);
        }
        jsonWriter.endObject();
    }

    private static JobFlowDetailJsonMarshaller instance;

    public static JobFlowDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobFlowDetailJsonMarshaller();
        return instance;
    }
}
