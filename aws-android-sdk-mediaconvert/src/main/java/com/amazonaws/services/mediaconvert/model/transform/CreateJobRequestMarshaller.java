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

package com.amazonaws.services.mediaconvert.model.transform;

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
import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateJobRequest
 */
public class CreateJobRequestMarshaller implements
        Marshaller<Request<CreateJobRequest>, CreateJobRequest> {

    public Request<CreateJobRequest> marshall(CreateJobRequest createJobRequest) {
        if (createJobRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(CreateJobRequest)");
        }

        Request<CreateJobRequest> request = new DefaultRequest<CreateJobRequest>(createJobRequest,
                "AWSElementalMediaConvert");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2017-08-29/jobs";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createJobRequest.getAccelerationSettings() != null) {
                AccelerationSettings accelerationSettings = createJobRequest
                        .getAccelerationSettings();
                jsonWriter.name("AccelerationSettings");
                AccelerationSettingsJsonMarshaller.getInstance().marshall(accelerationSettings,
                        jsonWriter);
            }
            if (createJobRequest.getBillingTagsSource() != null) {
                String billingTagsSource = createJobRequest.getBillingTagsSource();
                jsonWriter.name("BillingTagsSource");
                jsonWriter.value(billingTagsSource);
            }
            if (createJobRequest.getClientRequestToken() != null) {
                String clientRequestToken = createJobRequest.getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
            }
            if (createJobRequest.getHopDestinations() != null) {
                java.util.List<HopDestination> hopDestinations = createJobRequest
                        .getHopDestinations();
                jsonWriter.name("HopDestinations");
                jsonWriter.beginArray();
                for (HopDestination hopDestinationsItem : hopDestinations) {
                    if (hopDestinationsItem != null) {
                        HopDestinationJsonMarshaller.getInstance().marshall(hopDestinationsItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createJobRequest.getJobTemplate() != null) {
                String jobTemplate = createJobRequest.getJobTemplate();
                jsonWriter.name("JobTemplate");
                jsonWriter.value(jobTemplate);
            }
            if (createJobRequest.getPriority() != null) {
                Integer priority = createJobRequest.getPriority();
                jsonWriter.name("Priority");
                jsonWriter.value(priority);
            }
            if (createJobRequest.getQueue() != null) {
                String queue = createJobRequest.getQueue();
                jsonWriter.name("Queue");
                jsonWriter.value(queue);
            }
            if (createJobRequest.getRole() != null) {
                String role = createJobRequest.getRole();
                jsonWriter.name("Role");
                jsonWriter.value(role);
            }
            if (createJobRequest.getSettings() != null) {
                JobSettings settings = createJobRequest.getSettings();
                jsonWriter.name("Settings");
                JobSettingsJsonMarshaller.getInstance().marshall(settings, jsonWriter);
            }
            if (createJobRequest.getSimulateReservedQueue() != null) {
                String simulateReservedQueue = createJobRequest.getSimulateReservedQueue();
                jsonWriter.name("SimulateReservedQueue");
                jsonWriter.value(simulateReservedQueue);
            }
            if (createJobRequest.getStatusUpdateInterval() != null) {
                String statusUpdateInterval = createJobRequest.getStatusUpdateInterval();
                jsonWriter.name("StatusUpdateInterval");
                jsonWriter.value(statusUpdateInterval);
            }
            if (createJobRequest.getTags() != null) {
                java.util.Map<String, String> tags = createJobRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                    String tagsValue = tagsEntry.getValue();
                    if (tagsValue != null) {
                        jsonWriter.name(tagsEntry.getKey());
                        jsonWriter.value(tagsValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (createJobRequest.getUserMetadata() != null) {
                java.util.Map<String, String> userMetadata = createJobRequest.getUserMetadata();
                jsonWriter.name("UserMetadata");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> userMetadataEntry : userMetadata
                        .entrySet()) {
                    String userMetadataValue = userMetadataEntry.getValue();
                    if (userMetadataValue != null) {
                        jsonWriter.name(userMetadataEntry.getKey());
                        jsonWriter.value(userMetadataValue);
                    }
                }
                jsonWriter.endObject();
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
