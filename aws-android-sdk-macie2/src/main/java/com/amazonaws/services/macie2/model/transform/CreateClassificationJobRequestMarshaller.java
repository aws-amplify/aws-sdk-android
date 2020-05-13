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

package com.amazonaws.services.macie2.model.transform;

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
import com.amazonaws.services.macie2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateClassificationJobRequest
 */
public class CreateClassificationJobRequestMarshaller implements
        Marshaller<Request<CreateClassificationJobRequest>, CreateClassificationJobRequest> {

    public Request<CreateClassificationJobRequest> marshall(
            CreateClassificationJobRequest createClassificationJobRequest) {
        if (createClassificationJobRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateClassificationJobRequest)");
        }

        Request<CreateClassificationJobRequest> request = new DefaultRequest<CreateClassificationJobRequest>(
                createClassificationJobRequest, "AmazonMacie2");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/jobs";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createClassificationJobRequest.getClientToken() != null) {
                String clientToken = createClassificationJobRequest.getClientToken();
                jsonWriter.name("clientToken");
                jsonWriter.value(clientToken);
            }
            if (createClassificationJobRequest.getCustomDataIdentifierIds() != null) {
                java.util.List<String> customDataIdentifierIds = createClassificationJobRequest
                        .getCustomDataIdentifierIds();
                jsonWriter.name("customDataIdentifierIds");
                jsonWriter.beginArray();
                for (String customDataIdentifierIdsItem : customDataIdentifierIds) {
                    if (customDataIdentifierIdsItem != null) {
                        jsonWriter.value(customDataIdentifierIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createClassificationJobRequest.getDescription() != null) {
                String description = createClassificationJobRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (createClassificationJobRequest.getInitialRun() != null) {
                Boolean initialRun = createClassificationJobRequest.getInitialRun();
                jsonWriter.name("initialRun");
                jsonWriter.value(initialRun);
            }
            if (createClassificationJobRequest.getJobType() != null) {
                String jobType = createClassificationJobRequest.getJobType();
                jsonWriter.name("jobType");
                jsonWriter.value(jobType);
            }
            if (createClassificationJobRequest.getName() != null) {
                String name = createClassificationJobRequest.getName();
                jsonWriter.name("name");
                jsonWriter.value(name);
            }
            if (createClassificationJobRequest.getS3JobDefinition() != null) {
                S3JobDefinition s3JobDefinition = createClassificationJobRequest
                        .getS3JobDefinition();
                jsonWriter.name("s3JobDefinition");
                S3JobDefinitionJsonMarshaller.getInstance().marshall(s3JobDefinition, jsonWriter);
            }
            if (createClassificationJobRequest.getSamplingPercentage() != null) {
                Integer samplingPercentage = createClassificationJobRequest.getSamplingPercentage();
                jsonWriter.name("samplingPercentage");
                jsonWriter.value(samplingPercentage);
            }
            if (createClassificationJobRequest.getScheduleFrequency() != null) {
                JobScheduleFrequency scheduleFrequency = createClassificationJobRequest
                        .getScheduleFrequency();
                jsonWriter.name("scheduleFrequency");
                JobScheduleFrequencyJsonMarshaller.getInstance().marshall(scheduleFrequency,
                        jsonWriter);
            }
            if (createClassificationJobRequest.getTags() != null) {
                java.util.Map<String, String> tags = createClassificationJobRequest.getTags();
                jsonWriter.name("tags");
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
