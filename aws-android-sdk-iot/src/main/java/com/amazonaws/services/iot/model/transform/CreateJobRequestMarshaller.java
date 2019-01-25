/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.iot.model.*;
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
                "AWSIot");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/jobs/{jobId}";
        uriResourcePath = uriResourcePath.replace(
                "{jobId}",
                (createJobRequest.getJobId() == null) ? "" : StringUtils
                        .fromString(createJobRequest.getJobId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createJobRequest.getTargets() != null) {
                java.util.List<String> targets = createJobRequest.getTargets();
                jsonWriter.name("targets");
                jsonWriter.beginArray();
                for (String targetsItem : targets) {
                    if (targetsItem != null) {
                        jsonWriter.value(targetsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createJobRequest.getDocumentSource() != null) {
                String documentSource = createJobRequest.getDocumentSource();
                jsonWriter.name("documentSource");
                jsonWriter.value(documentSource);
            }
            if (createJobRequest.getDocument() != null) {
                String document = createJobRequest.getDocument();
                jsonWriter.name("document");
                jsonWriter.value(document);
            }
            if (createJobRequest.getDescription() != null) {
                String description = createJobRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (createJobRequest.getPresignedUrlConfig() != null) {
                PresignedUrlConfig presignedUrlConfig = createJobRequest.getPresignedUrlConfig();
                jsonWriter.name("presignedUrlConfig");
                PresignedUrlConfigJsonMarshaller.getInstance().marshall(presignedUrlConfig,
                        jsonWriter);
            }
            if (createJobRequest.getTargetSelection() != null) {
                String targetSelection = createJobRequest.getTargetSelection();
                jsonWriter.name("targetSelection");
                jsonWriter.value(targetSelection);
            }
            if (createJobRequest.getJobExecutionsRolloutConfig() != null) {
                JobExecutionsRolloutConfig jobExecutionsRolloutConfig = createJobRequest
                        .getJobExecutionsRolloutConfig();
                jsonWriter.name("jobExecutionsRolloutConfig");
                JobExecutionsRolloutConfigJsonMarshaller.getInstance().marshall(
                        jobExecutionsRolloutConfig, jsonWriter);
            }
            if (createJobRequest.getAbortConfig() != null) {
                AbortConfig abortConfig = createJobRequest.getAbortConfig();
                jsonWriter.name("abortConfig");
                AbortConfigJsonMarshaller.getInstance().marshall(abortConfig, jsonWriter);
            }
            if (createJobRequest.getTimeoutConfig() != null) {
                TimeoutConfig timeoutConfig = createJobRequest.getTimeoutConfig();
                jsonWriter.name("timeoutConfig");
                TimeoutConfigJsonMarshaller.getInstance().marshall(timeoutConfig, jsonWriter);
            }
            if (createJobRequest.getTags() != null) {
                java.util.List<Tag> tags = createJobRequest.getTags();
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
