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

package com.amazonaws.services.codedeploy.model.transform;

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
import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateDeploymentGroupRequest
 */
public class CreateDeploymentGroupRequestMarshaller implements
        Marshaller<Request<CreateDeploymentGroupRequest>, CreateDeploymentGroupRequest> {

    public Request<CreateDeploymentGroupRequest> marshall(
            CreateDeploymentGroupRequest createDeploymentGroupRequest) {
        if (createDeploymentGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateDeploymentGroupRequest)");
        }

        Request<CreateDeploymentGroupRequest> request = new DefaultRequest<CreateDeploymentGroupRequest>(
                createDeploymentGroupRequest, "AWSCodeDeploy");
        String target = "CodeDeploy_20141006.CreateDeploymentGroup";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createDeploymentGroupRequest.getApplicationName() != null) {
                String applicationName = createDeploymentGroupRequest.getApplicationName();
                jsonWriter.name("applicationName");
                jsonWriter.value(applicationName);
            }
            if (createDeploymentGroupRequest.getDeploymentGroupName() != null) {
                String deploymentGroupName = createDeploymentGroupRequest.getDeploymentGroupName();
                jsonWriter.name("deploymentGroupName");
                jsonWriter.value(deploymentGroupName);
            }
            if (createDeploymentGroupRequest.getDeploymentConfigName() != null) {
                String deploymentConfigName = createDeploymentGroupRequest
                        .getDeploymentConfigName();
                jsonWriter.name("deploymentConfigName");
                jsonWriter.value(deploymentConfigName);
            }
            if (createDeploymentGroupRequest.getEc2TagFilters() != null) {
                java.util.List<EC2TagFilter> ec2TagFilters = createDeploymentGroupRequest
                        .getEc2TagFilters();
                jsonWriter.name("ec2TagFilters");
                jsonWriter.beginArray();
                for (EC2TagFilter ec2TagFiltersItem : ec2TagFilters) {
                    if (ec2TagFiltersItem != null) {
                        EC2TagFilterJsonMarshaller.getInstance().marshall(ec2TagFiltersItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createDeploymentGroupRequest.getOnPremisesInstanceTagFilters() != null) {
                java.util.List<TagFilter> onPremisesInstanceTagFilters = createDeploymentGroupRequest
                        .getOnPremisesInstanceTagFilters();
                jsonWriter.name("onPremisesInstanceTagFilters");
                jsonWriter.beginArray();
                for (TagFilter onPremisesInstanceTagFiltersItem : onPremisesInstanceTagFilters) {
                    if (onPremisesInstanceTagFiltersItem != null) {
                        TagFilterJsonMarshaller.getInstance().marshall(
                                onPremisesInstanceTagFiltersItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createDeploymentGroupRequest.getAutoScalingGroups() != null) {
                java.util.List<String> autoScalingGroups = createDeploymentGroupRequest
                        .getAutoScalingGroups();
                jsonWriter.name("autoScalingGroups");
                jsonWriter.beginArray();
                for (String autoScalingGroupsItem : autoScalingGroups) {
                    if (autoScalingGroupsItem != null) {
                        jsonWriter.value(autoScalingGroupsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createDeploymentGroupRequest.getServiceRoleArn() != null) {
                String serviceRoleArn = createDeploymentGroupRequest.getServiceRoleArn();
                jsonWriter.name("serviceRoleArn");
                jsonWriter.value(serviceRoleArn);
            }
            if (createDeploymentGroupRequest.getTriggerConfigurations() != null) {
                java.util.List<TriggerConfig> triggerConfigurations = createDeploymentGroupRequest
                        .getTriggerConfigurations();
                jsonWriter.name("triggerConfigurations");
                jsonWriter.beginArray();
                for (TriggerConfig triggerConfigurationsItem : triggerConfigurations) {
                    if (triggerConfigurationsItem != null) {
                        TriggerConfigJsonMarshaller.getInstance().marshall(
                                triggerConfigurationsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createDeploymentGroupRequest.getAlarmConfiguration() != null) {
                AlarmConfiguration alarmConfiguration = createDeploymentGroupRequest
                        .getAlarmConfiguration();
                jsonWriter.name("alarmConfiguration");
                AlarmConfigurationJsonMarshaller.getInstance().marshall(alarmConfiguration,
                        jsonWriter);
            }
            if (createDeploymentGroupRequest.getAutoRollbackConfiguration() != null) {
                AutoRollbackConfiguration autoRollbackConfiguration = createDeploymentGroupRequest
                        .getAutoRollbackConfiguration();
                jsonWriter.name("autoRollbackConfiguration");
                AutoRollbackConfigurationJsonMarshaller.getInstance().marshall(
                        autoRollbackConfiguration, jsonWriter);
            }
            if (createDeploymentGroupRequest.getDeploymentStyle() != null) {
                DeploymentStyle deploymentStyle = createDeploymentGroupRequest.getDeploymentStyle();
                jsonWriter.name("deploymentStyle");
                DeploymentStyleJsonMarshaller.getInstance().marshall(deploymentStyle, jsonWriter);
            }
            if (createDeploymentGroupRequest.getBlueGreenDeploymentConfiguration() != null) {
                BlueGreenDeploymentConfiguration blueGreenDeploymentConfiguration = createDeploymentGroupRequest
                        .getBlueGreenDeploymentConfiguration();
                jsonWriter.name("blueGreenDeploymentConfiguration");
                BlueGreenDeploymentConfigurationJsonMarshaller.getInstance().marshall(
                        blueGreenDeploymentConfiguration, jsonWriter);
            }
            if (createDeploymentGroupRequest.getLoadBalancerInfo() != null) {
                LoadBalancerInfo loadBalancerInfo = createDeploymentGroupRequest
                        .getLoadBalancerInfo();
                jsonWriter.name("loadBalancerInfo");
                LoadBalancerInfoJsonMarshaller.getInstance().marshall(loadBalancerInfo, jsonWriter);
            }
            if (createDeploymentGroupRequest.getEc2TagSet() != null) {
                EC2TagSet ec2TagSet = createDeploymentGroupRequest.getEc2TagSet();
                jsonWriter.name("ec2TagSet");
                EC2TagSetJsonMarshaller.getInstance().marshall(ec2TagSet, jsonWriter);
            }
            if (createDeploymentGroupRequest.getEcsServices() != null) {
                java.util.List<ECSService> ecsServices = createDeploymentGroupRequest
                        .getEcsServices();
                jsonWriter.name("ecsServices");
                jsonWriter.beginArray();
                for (ECSService ecsServicesItem : ecsServices) {
                    if (ecsServicesItem != null) {
                        ECSServiceJsonMarshaller.getInstance()
                                .marshall(ecsServicesItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createDeploymentGroupRequest.getOnPremisesTagSet() != null) {
                OnPremisesTagSet onPremisesTagSet = createDeploymentGroupRequest
                        .getOnPremisesTagSet();
                jsonWriter.name("onPremisesTagSet");
                OnPremisesTagSetJsonMarshaller.getInstance().marshall(onPremisesTagSet, jsonWriter);
            }
            if (createDeploymentGroupRequest.getTags() != null) {
                java.util.List<Tag> tags = createDeploymentGroupRequest.getTags();
                jsonWriter.name("tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
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
