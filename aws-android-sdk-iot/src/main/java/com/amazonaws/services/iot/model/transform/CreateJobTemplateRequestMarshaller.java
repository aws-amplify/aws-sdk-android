/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateJobTemplateRequest
 */
public class CreateJobTemplateRequestMarshaller implements
        Marshaller<Request<CreateJobTemplateRequest>, CreateJobTemplateRequest> {

    public Request<CreateJobTemplateRequest> marshall(
            CreateJobTemplateRequest createJobTemplateRequest) {
        if (createJobTemplateRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateJobTemplateRequest)");
        }

        Request<CreateJobTemplateRequest> request = new DefaultRequest<CreateJobTemplateRequest>(
                createJobTemplateRequest, "AWSIot");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/job-templates/{jobTemplateId}";
        uriResourcePath = uriResourcePath.replace(
                "{jobTemplateId}",
                (createJobTemplateRequest.getJobTemplateId() == null) ? "" : StringUtils
                        .fromString(createJobTemplateRequest.getJobTemplateId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createJobTemplateRequest.getJobArn() != null) {
                String jobArn = createJobTemplateRequest.getJobArn();
                jsonWriter.name("jobArn");
                jsonWriter.value(jobArn);
            }
            if (createJobTemplateRequest.getDocumentSource() != null) {
                String documentSource = createJobTemplateRequest.getDocumentSource();
                jsonWriter.name("documentSource");
                jsonWriter.value(documentSource);
            }
            if (createJobTemplateRequest.getDocument() != null) {
                String document = createJobTemplateRequest.getDocument();
                jsonWriter.name("document");
                jsonWriter.value(document);
            }
            if (createJobTemplateRequest.getDescription() != null) {
                String description = createJobTemplateRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (createJobTemplateRequest.getPresignedUrlConfig() != null) {
                PresignedUrlConfig presignedUrlConfig = createJobTemplateRequest
                        .getPresignedUrlConfig();
                jsonWriter.name("presignedUrlConfig");
                PresignedUrlConfigJsonMarshaller.getInstance().marshall(presignedUrlConfig,
                        jsonWriter);
            }
            if (createJobTemplateRequest.getJobExecutionsRolloutConfig() != null) {
                JobExecutionsRolloutConfig jobExecutionsRolloutConfig = createJobTemplateRequest
                        .getJobExecutionsRolloutConfig();
                jsonWriter.name("jobExecutionsRolloutConfig");
                JobExecutionsRolloutConfigJsonMarshaller.getInstance().marshall(
                        jobExecutionsRolloutConfig, jsonWriter);
            }
            if (createJobTemplateRequest.getAbortConfig() != null) {
                AbortConfig abortConfig = createJobTemplateRequest.getAbortConfig();
                jsonWriter.name("abortConfig");
                AbortConfigJsonMarshaller.getInstance().marshall(abortConfig, jsonWriter);
            }
            if (createJobTemplateRequest.getTimeoutConfig() != null) {
                TimeoutConfig timeoutConfig = createJobTemplateRequest.getTimeoutConfig();
                jsonWriter.name("timeoutConfig");
                TimeoutConfigJsonMarshaller.getInstance().marshall(timeoutConfig, jsonWriter);
            }
            if (createJobTemplateRequest.getTags() != null) {
                java.util.List<Tag> tags = createJobTemplateRequest.getTags();
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
