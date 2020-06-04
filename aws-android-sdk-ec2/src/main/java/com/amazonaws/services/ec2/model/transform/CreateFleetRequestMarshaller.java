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

package com.amazonaws.services.ec2.model.transform;

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
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateFleetRequest
 */
public class CreateFleetRequestMarshaller implements
        Marshaller<Request<CreateFleetRequest>, CreateFleetRequest> {

    public Request<CreateFleetRequest> marshall(CreateFleetRequest createFleetRequest) {
        if (createFleetRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateFleetRequest)");
        }

        Request<CreateFleetRequest> request = new DefaultRequest<CreateFleetRequest>(
                createFleetRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createFleetRequest.getDryRun() != null) {
                Boolean dryRun = createFleetRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (createFleetRequest.getClientToken() != null) {
                String clientToken = createFleetRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
            }
            if (createFleetRequest.getSpotOptions() != null) {
                SpotOptionsRequest spotOptions = createFleetRequest.getSpotOptions();
                jsonWriter.name("SpotOptions");
                SpotOptionsRequestJsonMarshaller.getInstance().marshall(spotOptions, jsonWriter);
            }
            if (createFleetRequest.getOnDemandOptions() != null) {
                OnDemandOptionsRequest onDemandOptions = createFleetRequest.getOnDemandOptions();
                jsonWriter.name("OnDemandOptions");
                OnDemandOptionsRequestJsonMarshaller.getInstance().marshall(onDemandOptions,
                        jsonWriter);
            }
            if (createFleetRequest.getExcessCapacityTerminationPolicy() != null) {
                String excessCapacityTerminationPolicy = createFleetRequest
                        .getExcessCapacityTerminationPolicy();
                jsonWriter.name("ExcessCapacityTerminationPolicy");
                jsonWriter.value(excessCapacityTerminationPolicy);
            }
            if (createFleetRequest.getLaunchTemplateConfigs() != null) {
                java.util.List<FleetLaunchTemplateConfigRequest> launchTemplateConfigs = createFleetRequest
                        .getLaunchTemplateConfigs();
                jsonWriter.name("LaunchTemplateConfigs");
                jsonWriter.beginArray();
                for (FleetLaunchTemplateConfigRequest launchTemplateConfigsItem : launchTemplateConfigs) {
                    if (launchTemplateConfigsItem != null) {
                        FleetLaunchTemplateConfigRequestJsonMarshaller.getInstance().marshall(
                                launchTemplateConfigsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createFleetRequest.getTargetCapacitySpecification() != null) {
                TargetCapacitySpecificationRequest targetCapacitySpecification = createFleetRequest
                        .getTargetCapacitySpecification();
                jsonWriter.name("TargetCapacitySpecification");
                TargetCapacitySpecificationRequestJsonMarshaller.getInstance().marshall(
                        targetCapacitySpecification, jsonWriter);
            }
            if (createFleetRequest.getTerminateInstancesWithExpiration() != null) {
                Boolean terminateInstancesWithExpiration = createFleetRequest
                        .getTerminateInstancesWithExpiration();
                jsonWriter.name("TerminateInstancesWithExpiration");
                jsonWriter.value(terminateInstancesWithExpiration);
            }
            if (createFleetRequest.getType() != null) {
                String type = createFleetRequest.getType();
                jsonWriter.name("Type");
                jsonWriter.value(type);
            }
            if (createFleetRequest.getValidFrom() != null) {
                java.util.Date validFrom = createFleetRequest.getValidFrom();
                jsonWriter.name("ValidFrom");
                jsonWriter.value(validFrom);
            }
            if (createFleetRequest.getValidUntil() != null) {
                java.util.Date validUntil = createFleetRequest.getValidUntil();
                jsonWriter.name("ValidUntil");
                jsonWriter.value(validUntil);
            }
            if (createFleetRequest.getReplaceUnhealthyInstances() != null) {
                Boolean replaceUnhealthyInstances = createFleetRequest
                        .getReplaceUnhealthyInstances();
                jsonWriter.name("ReplaceUnhealthyInstances");
                jsonWriter.value(replaceUnhealthyInstances);
            }
            if (createFleetRequest.getTagSpecifications() != null) {
                java.util.List<TagSpecification> tagSpecifications = createFleetRequest
                        .getTagSpecifications();
                jsonWriter.name("TagSpecifications");
                jsonWriter.beginArray();
                for (TagSpecification tagSpecificationsItem : tagSpecifications) {
                    if (tagSpecificationsItem != null) {
                        TagSpecificationJsonMarshaller.getInstance().marshall(
                                tagSpecificationsItem, jsonWriter);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
