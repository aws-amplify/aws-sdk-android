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
 * JSON request marshaller for CreateCapacityReservationRequest
 */
public class CreateCapacityReservationRequestMarshaller implements
        Marshaller<Request<CreateCapacityReservationRequest>, CreateCapacityReservationRequest> {

    public Request<CreateCapacityReservationRequest> marshall(
            CreateCapacityReservationRequest createCapacityReservationRequest) {
        if (createCapacityReservationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateCapacityReservationRequest)");
        }

        Request<CreateCapacityReservationRequest> request = new DefaultRequest<CreateCapacityReservationRequest>(
                createCapacityReservationRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createCapacityReservationRequest.getClientToken() != null) {
                String clientToken = createCapacityReservationRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
            }
            if (createCapacityReservationRequest.getInstanceType() != null) {
                String instanceType = createCapacityReservationRequest.getInstanceType();
                jsonWriter.name("InstanceType");
                jsonWriter.value(instanceType);
            }
            if (createCapacityReservationRequest.getInstancePlatform() != null) {
                String instancePlatform = createCapacityReservationRequest.getInstancePlatform();
                jsonWriter.name("InstancePlatform");
                jsonWriter.value(instancePlatform);
            }
            if (createCapacityReservationRequest.getAvailabilityZone() != null) {
                String availabilityZone = createCapacityReservationRequest.getAvailabilityZone();
                jsonWriter.name("AvailabilityZone");
                jsonWriter.value(availabilityZone);
            }
            if (createCapacityReservationRequest.getAvailabilityZoneId() != null) {
                String availabilityZoneId = createCapacityReservationRequest
                        .getAvailabilityZoneId();
                jsonWriter.name("AvailabilityZoneId");
                jsonWriter.value(availabilityZoneId);
            }
            if (createCapacityReservationRequest.getTenancy() != null) {
                String tenancy = createCapacityReservationRequest.getTenancy();
                jsonWriter.name("Tenancy");
                jsonWriter.value(tenancy);
            }
            if (createCapacityReservationRequest.getInstanceCount() != null) {
                Integer instanceCount = createCapacityReservationRequest.getInstanceCount();
                jsonWriter.name("InstanceCount");
                jsonWriter.value(instanceCount);
            }
            if (createCapacityReservationRequest.getEbsOptimized() != null) {
                Boolean ebsOptimized = createCapacityReservationRequest.getEbsOptimized();
                jsonWriter.name("EbsOptimized");
                jsonWriter.value(ebsOptimized);
            }
            if (createCapacityReservationRequest.getEphemeralStorage() != null) {
                Boolean ephemeralStorage = createCapacityReservationRequest.getEphemeralStorage();
                jsonWriter.name("EphemeralStorage");
                jsonWriter.value(ephemeralStorage);
            }
            if (createCapacityReservationRequest.getEndDate() != null) {
                java.util.Date endDate = createCapacityReservationRequest.getEndDate();
                jsonWriter.name("EndDate");
                jsonWriter.value(endDate);
            }
            if (createCapacityReservationRequest.getEndDateType() != null) {
                String endDateType = createCapacityReservationRequest.getEndDateType();
                jsonWriter.name("EndDateType");
                jsonWriter.value(endDateType);
            }
            if (createCapacityReservationRequest.getInstanceMatchCriteria() != null) {
                String instanceMatchCriteria = createCapacityReservationRequest
                        .getInstanceMatchCriteria();
                jsonWriter.name("InstanceMatchCriteria");
                jsonWriter.value(instanceMatchCriteria);
            }
            if (createCapacityReservationRequest.getTagSpecifications() != null) {
                java.util.List<TagSpecification> tagSpecifications = createCapacityReservationRequest
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
            if (createCapacityReservationRequest.getDryRun() != null) {
                Boolean dryRun = createCapacityReservationRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
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
