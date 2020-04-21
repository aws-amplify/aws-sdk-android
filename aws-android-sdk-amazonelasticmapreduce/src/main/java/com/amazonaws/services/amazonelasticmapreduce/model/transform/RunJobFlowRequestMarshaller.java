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
import com.amazonaws.services.amazonelasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for RunJobFlowRequest
 */
public class RunJobFlowRequestMarshaller implements
        Marshaller<Request<RunJobFlowRequest>, RunJobFlowRequest> {

    public Request<RunJobFlowRequest> marshall(RunJobFlowRequest runJobFlowRequest) {
        if (runJobFlowRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RunJobFlowRequest)");
        }

        Request<RunJobFlowRequest> request = new DefaultRequest<RunJobFlowRequest>(
                runJobFlowRequest, "AmazonElasticMapReduce");
        String target = "ElasticMapReduce.RunJobFlow";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (runJobFlowRequest.getName() != null) {
                String name = runJobFlowRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (runJobFlowRequest.getLogUri() != null) {
                String logUri = runJobFlowRequest.getLogUri();
                jsonWriter.name("LogUri");
                jsonWriter.value(logUri);
            }
            if (runJobFlowRequest.getAdditionalInfo() != null) {
                String additionalInfo = runJobFlowRequest.getAdditionalInfo();
                jsonWriter.name("AdditionalInfo");
                jsonWriter.value(additionalInfo);
            }
            if (runJobFlowRequest.getAmiVersion() != null) {
                String amiVersion = runJobFlowRequest.getAmiVersion();
                jsonWriter.name("AmiVersion");
                jsonWriter.value(amiVersion);
            }
            if (runJobFlowRequest.getReleaseLabel() != null) {
                String releaseLabel = runJobFlowRequest.getReleaseLabel();
                jsonWriter.name("ReleaseLabel");
                jsonWriter.value(releaseLabel);
            }
            if (runJobFlowRequest.getInstances() != null) {
                JobFlowInstancesConfig instances = runJobFlowRequest.getInstances();
                jsonWriter.name("Instances");
                JobFlowInstancesConfigJsonMarshaller.getInstance().marshall(instances, jsonWriter);
            }
            if (runJobFlowRequest.getSteps() != null) {
                java.util.List<StepConfig> steps = runJobFlowRequest.getSteps();
                jsonWriter.name("Steps");
                jsonWriter.beginArray();
                for (StepConfig stepsItem : steps) {
                    if (stepsItem != null) {
                        StepConfigJsonMarshaller.getInstance().marshall(stepsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (runJobFlowRequest.getBootstrapActions() != null) {
                java.util.List<BootstrapActionConfig> bootstrapActions = runJobFlowRequest
                        .getBootstrapActions();
                jsonWriter.name("BootstrapActions");
                jsonWriter.beginArray();
                for (BootstrapActionConfig bootstrapActionsItem : bootstrapActions) {
                    if (bootstrapActionsItem != null) {
                        BootstrapActionConfigJsonMarshaller.getInstance().marshall(
                                bootstrapActionsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (runJobFlowRequest.getSupportedProducts() != null) {
                java.util.List<String> supportedProducts = runJobFlowRequest.getSupportedProducts();
                jsonWriter.name("SupportedProducts");
                jsonWriter.beginArray();
                for (String supportedProductsItem : supportedProducts) {
                    if (supportedProductsItem != null) {
                        jsonWriter.value(supportedProductsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (runJobFlowRequest.getNewSupportedProducts() != null) {
                java.util.List<SupportedProductConfig> newSupportedProducts = runJobFlowRequest
                        .getNewSupportedProducts();
                jsonWriter.name("NewSupportedProducts");
                jsonWriter.beginArray();
                for (SupportedProductConfig newSupportedProductsItem : newSupportedProducts) {
                    if (newSupportedProductsItem != null) {
                        SupportedProductConfigJsonMarshaller.getInstance().marshall(
                                newSupportedProductsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (runJobFlowRequest.getApplications() != null) {
                java.util.List<Application> applications = runJobFlowRequest.getApplications();
                jsonWriter.name("Applications");
                jsonWriter.beginArray();
                for (Application applicationsItem : applications) {
                    if (applicationsItem != null) {
                        ApplicationJsonMarshaller.getInstance().marshall(applicationsItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (runJobFlowRequest.getConfigurations() != null) {
                java.util.List<Configuration> configurations = runJobFlowRequest
                        .getConfigurations();
                jsonWriter.name("Configurations");
                jsonWriter.beginArray();
                for (Configuration configurationsItem : configurations) {
                    if (configurationsItem != null) {
                        ConfigurationJsonMarshaller.getInstance().marshall(configurationsItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (runJobFlowRequest.getVisibleToAllUsers() != null) {
                Boolean visibleToAllUsers = runJobFlowRequest.getVisibleToAllUsers();
                jsonWriter.name("VisibleToAllUsers");
                jsonWriter.value(visibleToAllUsers);
            }
            if (runJobFlowRequest.getJobFlowRole() != null) {
                String jobFlowRole = runJobFlowRequest.getJobFlowRole();
                jsonWriter.name("JobFlowRole");
                jsonWriter.value(jobFlowRole);
            }
            if (runJobFlowRequest.getServiceRole() != null) {
                String serviceRole = runJobFlowRequest.getServiceRole();
                jsonWriter.name("ServiceRole");
                jsonWriter.value(serviceRole);
            }
            if (runJobFlowRequest.getTags() != null) {
                java.util.List<Tag> tags = runJobFlowRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (runJobFlowRequest.getSecurityConfiguration() != null) {
                String securityConfiguration = runJobFlowRequest.getSecurityConfiguration();
                jsonWriter.name("SecurityConfiguration");
                jsonWriter.value(securityConfiguration);
            }
            if (runJobFlowRequest.getAutoScalingRole() != null) {
                String autoScalingRole = runJobFlowRequest.getAutoScalingRole();
                jsonWriter.name("AutoScalingRole");
                jsonWriter.value(autoScalingRole);
            }
            if (runJobFlowRequest.getScaleDownBehavior() != null) {
                String scaleDownBehavior = runJobFlowRequest.getScaleDownBehavior();
                jsonWriter.name("ScaleDownBehavior");
                jsonWriter.value(scaleDownBehavior);
            }
            if (runJobFlowRequest.getCustomAmiId() != null) {
                String customAmiId = runJobFlowRequest.getCustomAmiId();
                jsonWriter.name("CustomAmiId");
                jsonWriter.value(customAmiId);
            }
            if (runJobFlowRequest.getEbsRootVolumeSize() != null) {
                Integer ebsRootVolumeSize = runJobFlowRequest.getEbsRootVolumeSize();
                jsonWriter.name("EbsRootVolumeSize");
                jsonWriter.value(ebsRootVolumeSize);
            }
            if (runJobFlowRequest.getRepoUpgradeOnBoot() != null) {
                String repoUpgradeOnBoot = runJobFlowRequest.getRepoUpgradeOnBoot();
                jsonWriter.name("RepoUpgradeOnBoot");
                jsonWriter.value(repoUpgradeOnBoot);
            }
            if (runJobFlowRequest.getKerberosAttributes() != null) {
                KerberosAttributes kerberosAttributes = runJobFlowRequest.getKerberosAttributes();
                jsonWriter.name("KerberosAttributes");
                KerberosAttributesJsonMarshaller.getInstance().marshall(kerberosAttributes,
                        jsonWriter);
            }
            if (runJobFlowRequest.getStepConcurrencyLevel() != null) {
                Integer stepConcurrencyLevel = runJobFlowRequest.getStepConcurrencyLevel();
                jsonWriter.name("StepConcurrencyLevel");
                jsonWriter.value(stepConcurrencyLevel);
            }
            if (runJobFlowRequest.getManagedScalingPolicy() != null) {
                ManagedScalingPolicy managedScalingPolicy = runJobFlowRequest
                        .getManagedScalingPolicy();
                jsonWriter.name("ManagedScalingPolicy");
                ManagedScalingPolicyJsonMarshaller.getInstance().marshall(managedScalingPolicy,
                        jsonWriter);
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
