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
 * JSON request marshaller for UpdateDeploymentGroupRequest
 */
public class UpdateDeploymentGroupRequestMarshaller implements
        Marshaller<Request<UpdateDeploymentGroupRequest>, UpdateDeploymentGroupRequest> {

    public Request<UpdateDeploymentGroupRequest> marshall(
            UpdateDeploymentGroupRequest updateDeploymentGroupRequest) {
        if (updateDeploymentGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateDeploymentGroupRequest)");
        }

        Request<UpdateDeploymentGroupRequest> request = new DefaultRequest<UpdateDeploymentGroupRequest>(
                updateDeploymentGroupRequest, "AWSCodeDeploy");
        String target = "CodeDeploy_20141006.UpdateDeploymentGroup";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateDeploymentGroupRequest.getApplicationName() != null) {
                String applicationName = updateDeploymentGroupRequest.getApplicationName();
                jsonWriter.name("applicationName");
                jsonWriter.value(applicationName);
            }
            if (updateDeploymentGroupRequest.getCurrentDeploymentGroupName() != null) {
                String currentDeploymentGroupName = updateDeploymentGroupRequest
                        .getCurrentDeploymentGroupName();
                jsonWriter.name("currentDeploymentGroupName");
                jsonWriter.value(currentDeploymentGroupName);
            }
            if (updateDeploymentGroupRequest.getNewDeploymentGroupName() != null) {
                String newDeploymentGroupName = updateDeploymentGroupRequest
                        .getNewDeploymentGroupName();
                jsonWriter.name("newDeploymentGroupName");
                jsonWriter.value(newDeploymentGroupName);
            }
            if (updateDeploymentGroupRequest.getDeploymentConfigName() != null) {
                String deploymentConfigName = updateDeploymentGroupRequest
                        .getDeploymentConfigName();
                jsonWriter.name("deploymentConfigName");
                jsonWriter.value(deploymentConfigName);
            }
            if (updateDeploymentGroupRequest.getEc2TagFilters() != null) {
                java.util.List<EC2TagFilter> ec2TagFilters = updateDeploymentGroupRequest
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
            if (updateDeploymentGroupRequest.getOnPremisesInstanceTagFilters() != null) {
                java.util.List<TagFilter> onPremisesInstanceTagFilters = updateDeploymentGroupRequest
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
            if (updateDeploymentGroupRequest.getAutoScalingGroups() != null) {
                java.util.List<String> autoScalingGroups = updateDeploymentGroupRequest
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
            if (updateDeploymentGroupRequest.getServiceRoleArn() != null) {
                String serviceRoleArn = updateDeploymentGroupRequest.getServiceRoleArn();
                jsonWriter.name("serviceRoleArn");
                jsonWriter.value(serviceRoleArn);
            }
            if (updateDeploymentGroupRequest.getTriggerConfigurations() != null) {
                java.util.List<TriggerConfig> triggerConfigurations = updateDeploymentGroupRequest
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
            if (updateDeploymentGroupRequest.getAlarmConfiguration() != null) {
                AlarmConfiguration alarmConfiguration = updateDeploymentGroupRequest
                        .getAlarmConfiguration();
                jsonWriter.name("alarmConfiguration");
                AlarmConfigurationJsonMarshaller.getInstance().marshall(alarmConfiguration,
                        jsonWriter);
            }
            if (updateDeploymentGroupRequest.getAutoRollbackConfiguration() != null) {
                AutoRollbackConfiguration autoRollbackConfiguration = updateDeploymentGroupRequest
                        .getAutoRollbackConfiguration();
                jsonWriter.name("autoRollbackConfiguration");
                AutoRollbackConfigurationJsonMarshaller.getInstance().marshall(
                        autoRollbackConfiguration, jsonWriter);
            }
            if (updateDeploymentGroupRequest.getDeploymentStyle() != null) {
                DeploymentStyle deploymentStyle = updateDeploymentGroupRequest.getDeploymentStyle();
                jsonWriter.name("deploymentStyle");
                DeploymentStyleJsonMarshaller.getInstance().marshall(deploymentStyle, jsonWriter);
            }
            if (updateDeploymentGroupRequest.getBlueGreenDeploymentConfiguration() != null) {
                BlueGreenDeploymentConfiguration blueGreenDeploymentConfiguration = updateDeploymentGroupRequest
                        .getBlueGreenDeploymentConfiguration();
                jsonWriter.name("blueGreenDeploymentConfiguration");
                BlueGreenDeploymentConfigurationJsonMarshaller.getInstance().marshall(
                        blueGreenDeploymentConfiguration, jsonWriter);
            }
            if (updateDeploymentGroupRequest.getLoadBalancerInfo() != null) {
                LoadBalancerInfo loadBalancerInfo = updateDeploymentGroupRequest
                        .getLoadBalancerInfo();
                jsonWriter.name("loadBalancerInfo");
                LoadBalancerInfoJsonMarshaller.getInstance().marshall(loadBalancerInfo, jsonWriter);
            }
            if (updateDeploymentGroupRequest.getEc2TagSet() != null) {
                EC2TagSet ec2TagSet = updateDeploymentGroupRequest.getEc2TagSet();
                jsonWriter.name("ec2TagSet");
                EC2TagSetJsonMarshaller.getInstance().marshall(ec2TagSet, jsonWriter);
            }
            if (updateDeploymentGroupRequest.getEcsServices() != null) {
                java.util.List<ECSService> ecsServices = updateDeploymentGroupRequest
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
            if (updateDeploymentGroupRequest.getOnPremisesTagSet() != null) {
                OnPremisesTagSet onPremisesTagSet = updateDeploymentGroupRequest
                        .getOnPremisesTagSet();
                jsonWriter.name("onPremisesTagSet");
                OnPremisesTagSetJsonMarshaller.getInstance().marshall(onPremisesTagSet, jsonWriter);
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
