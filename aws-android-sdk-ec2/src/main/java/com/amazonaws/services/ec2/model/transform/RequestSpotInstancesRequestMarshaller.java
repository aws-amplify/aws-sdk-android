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
 * JSON request marshaller for RequestSpotInstancesRequest
 */
public class RequestSpotInstancesRequestMarshaller implements
        Marshaller<Request<RequestSpotInstancesRequest>, RequestSpotInstancesRequest> {

    public Request<RequestSpotInstancesRequest> marshall(
            RequestSpotInstancesRequest requestSpotInstancesRequest) {
        if (requestSpotInstancesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RequestSpotInstancesRequest)");
        }

        Request<RequestSpotInstancesRequest> request = new DefaultRequest<RequestSpotInstancesRequest>(
                requestSpotInstancesRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (requestSpotInstancesRequest.getAvailabilityZoneGroup() != null) {
                String availabilityZoneGroup = requestSpotInstancesRequest
                        .getAvailabilityZoneGroup();
                jsonWriter.name("AvailabilityZoneGroup");
                jsonWriter.value(availabilityZoneGroup);
            }
            if (requestSpotInstancesRequest.getBlockDurationMinutes() != null) {
                Integer blockDurationMinutes = requestSpotInstancesRequest
                        .getBlockDurationMinutes();
                jsonWriter.name("BlockDurationMinutes");
                jsonWriter.value(blockDurationMinutes);
            }
            if (requestSpotInstancesRequest.getClientToken() != null) {
                String clientToken = requestSpotInstancesRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
            }
            if (requestSpotInstancesRequest.getDryRun() != null) {
                Boolean dryRun = requestSpotInstancesRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (requestSpotInstancesRequest.getInstanceCount() != null) {
                Integer instanceCount = requestSpotInstancesRequest.getInstanceCount();
                jsonWriter.name("InstanceCount");
                jsonWriter.value(instanceCount);
            }
            if (requestSpotInstancesRequest.getLaunchGroup() != null) {
                String launchGroup = requestSpotInstancesRequest.getLaunchGroup();
                jsonWriter.name("LaunchGroup");
                jsonWriter.value(launchGroup);
            }
            if (requestSpotInstancesRequest.getLaunchSpecification() != null) {
                RequestSpotLaunchSpecification launchSpecification = requestSpotInstancesRequest
                        .getLaunchSpecification();
                jsonWriter.name("LaunchSpecification");
                RequestSpotLaunchSpecificationJsonMarshaller.getInstance().marshall(
                        launchSpecification, jsonWriter);
            }
            if (requestSpotInstancesRequest.getSpotPrice() != null) {
                String spotPrice = requestSpotInstancesRequest.getSpotPrice();
                jsonWriter.name("SpotPrice");
                jsonWriter.value(spotPrice);
            }
            if (requestSpotInstancesRequest.getType() != null) {
                String type = requestSpotInstancesRequest.getType();
                jsonWriter.name("Type");
                jsonWriter.value(type);
            }
            if (requestSpotInstancesRequest.getValidFrom() != null) {
                java.util.Date validFrom = requestSpotInstancesRequest.getValidFrom();
                jsonWriter.name("ValidFrom");
                jsonWriter.value(validFrom);
            }
            if (requestSpotInstancesRequest.getValidUntil() != null) {
                java.util.Date validUntil = requestSpotInstancesRequest.getValidUntil();
                jsonWriter.name("ValidUntil");
                jsonWriter.value(validUntil);
            }
            if (requestSpotInstancesRequest.getInstanceInterruptionBehavior() != null) {
                String instanceInterruptionBehavior = requestSpotInstancesRequest
                        .getInstanceInterruptionBehavior();
                jsonWriter.name("InstanceInterruptionBehavior");
                jsonWriter.value(instanceInterruptionBehavior);
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
