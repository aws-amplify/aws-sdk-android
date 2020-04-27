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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateTrainingJobRequest
 */
public class CreateTrainingJobRequestMarshaller implements
        Marshaller<Request<CreateTrainingJobRequest>, CreateTrainingJobRequest> {

    public Request<CreateTrainingJobRequest> marshall(
            CreateTrainingJobRequest createTrainingJobRequest) {
        if (createTrainingJobRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateTrainingJobRequest)");
        }

        Request<CreateTrainingJobRequest> request = new DefaultRequest<CreateTrainingJobRequest>(
                createTrainingJobRequest, "AmazonSageMakerService");
        String target = "SageMaker.CreateTrainingJob";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createTrainingJobRequest.getTrainingJobName() != null) {
                String trainingJobName = createTrainingJobRequest.getTrainingJobName();
                jsonWriter.name("TrainingJobName");
                jsonWriter.value(trainingJobName);
            }
            if (createTrainingJobRequest.getHyperParameters() != null) {
                java.util.Map<String, String> hyperParameters = createTrainingJobRequest
                        .getHyperParameters();
                jsonWriter.name("HyperParameters");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> hyperParametersEntry : hyperParameters
                        .entrySet()) {
                    String hyperParametersValue = hyperParametersEntry.getValue();
                    if (hyperParametersValue != null) {
                        jsonWriter.name(hyperParametersEntry.getKey());
                        jsonWriter.value(hyperParametersValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (createTrainingJobRequest.getAlgorithmSpecification() != null) {
                AlgorithmSpecification algorithmSpecification = createTrainingJobRequest
                        .getAlgorithmSpecification();
                jsonWriter.name("AlgorithmSpecification");
                AlgorithmSpecificationJsonMarshaller.getInstance().marshall(algorithmSpecification,
                        jsonWriter);
            }
            if (createTrainingJobRequest.getRoleArn() != null) {
                String roleArn = createTrainingJobRequest.getRoleArn();
                jsonWriter.name("RoleArn");
                jsonWriter.value(roleArn);
            }
            if (createTrainingJobRequest.getInputDataConfig() != null) {
                java.util.List<Channel> inputDataConfig = createTrainingJobRequest
                        .getInputDataConfig();
                jsonWriter.name("InputDataConfig");
                jsonWriter.beginArray();
                for (Channel inputDataConfigItem : inputDataConfig) {
                    if (inputDataConfigItem != null) {
                        ChannelJsonMarshaller.getInstance().marshall(inputDataConfigItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createTrainingJobRequest.getOutputDataConfig() != null) {
                OutputDataConfig outputDataConfig = createTrainingJobRequest.getOutputDataConfig();
                jsonWriter.name("OutputDataConfig");
                OutputDataConfigJsonMarshaller.getInstance().marshall(outputDataConfig, jsonWriter);
            }
            if (createTrainingJobRequest.getResourceConfig() != null) {
                ResourceConfig resourceConfig = createTrainingJobRequest.getResourceConfig();
                jsonWriter.name("ResourceConfig");
                ResourceConfigJsonMarshaller.getInstance().marshall(resourceConfig, jsonWriter);
            }
            if (createTrainingJobRequest.getVpcConfig() != null) {
                VpcConfig vpcConfig = createTrainingJobRequest.getVpcConfig();
                jsonWriter.name("VpcConfig");
                VpcConfigJsonMarshaller.getInstance().marshall(vpcConfig, jsonWriter);
            }
            if (createTrainingJobRequest.getStoppingCondition() != null) {
                StoppingCondition stoppingCondition = createTrainingJobRequest
                        .getStoppingCondition();
                jsonWriter.name("StoppingCondition");
                StoppingConditionJsonMarshaller.getInstance().marshall(stoppingCondition,
                        jsonWriter);
            }
            if (createTrainingJobRequest.getTags() != null) {
                java.util.List<Tag> tags = createTrainingJobRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createTrainingJobRequest.getEnableNetworkIsolation() != null) {
                Boolean enableNetworkIsolation = createTrainingJobRequest
                        .getEnableNetworkIsolation();
                jsonWriter.name("EnableNetworkIsolation");
                jsonWriter.value(enableNetworkIsolation);
            }
            if (createTrainingJobRequest.getEnableInterContainerTrafficEncryption() != null) {
                Boolean enableInterContainerTrafficEncryption = createTrainingJobRequest
                        .getEnableInterContainerTrafficEncryption();
                jsonWriter.name("EnableInterContainerTrafficEncryption");
                jsonWriter.value(enableInterContainerTrafficEncryption);
            }
            if (createTrainingJobRequest.getEnableManagedSpotTraining() != null) {
                Boolean enableManagedSpotTraining = createTrainingJobRequest
                        .getEnableManagedSpotTraining();
                jsonWriter.name("EnableManagedSpotTraining");
                jsonWriter.value(enableManagedSpotTraining);
            }
            if (createTrainingJobRequest.getCheckpointConfig() != null) {
                CheckpointConfig checkpointConfig = createTrainingJobRequest.getCheckpointConfig();
                jsonWriter.name("CheckpointConfig");
                CheckpointConfigJsonMarshaller.getInstance().marshall(checkpointConfig, jsonWriter);
            }
            if (createTrainingJobRequest.getDebugHookConfig() != null) {
                DebugHookConfig debugHookConfig = createTrainingJobRequest.getDebugHookConfig();
                jsonWriter.name("DebugHookConfig");
                DebugHookConfigJsonMarshaller.getInstance().marshall(debugHookConfig, jsonWriter);
            }
            if (createTrainingJobRequest.getDebugRuleConfigurations() != null) {
                java.util.List<DebugRuleConfiguration> debugRuleConfigurations = createTrainingJobRequest
                        .getDebugRuleConfigurations();
                jsonWriter.name("DebugRuleConfigurations");
                jsonWriter.beginArray();
                for (DebugRuleConfiguration debugRuleConfigurationsItem : debugRuleConfigurations) {
                    if (debugRuleConfigurationsItem != null) {
                        DebugRuleConfigurationJsonMarshaller.getInstance().marshall(
                                debugRuleConfigurationsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createTrainingJobRequest.getTensorBoardOutputConfig() != null) {
                TensorBoardOutputConfig tensorBoardOutputConfig = createTrainingJobRequest
                        .getTensorBoardOutputConfig();
                jsonWriter.name("TensorBoardOutputConfig");
                TensorBoardOutputConfigJsonMarshaller.getInstance().marshall(
                        tensorBoardOutputConfig, jsonWriter);
            }
            if (createTrainingJobRequest.getExperimentConfig() != null) {
                ExperimentConfig experimentConfig = createTrainingJobRequest.getExperimentConfig();
                jsonWriter.name("ExperimentConfig");
                ExperimentConfigJsonMarshaller.getInstance().marshall(experimentConfig, jsonWriter);
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
