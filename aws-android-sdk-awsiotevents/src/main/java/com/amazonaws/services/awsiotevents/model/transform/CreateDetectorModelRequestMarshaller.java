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

package com.amazonaws.services.awsiotevents.model.transform;

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
import com.amazonaws.services.awsiotevents.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateDetectorModelRequest
 */
public class CreateDetectorModelRequestMarshaller implements
        Marshaller<Request<CreateDetectorModelRequest>, CreateDetectorModelRequest> {

    public Request<CreateDetectorModelRequest> marshall(
            CreateDetectorModelRequest createDetectorModelRequest) {
        if (createDetectorModelRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateDetectorModelRequest)");
        }

        Request<CreateDetectorModelRequest> request = new DefaultRequest<CreateDetectorModelRequest>(
                createDetectorModelRequest, "AWSIoTEvents");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/detector-models";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createDetectorModelRequest.getDetectorModelName() != null) {
                String detectorModelName = createDetectorModelRequest.getDetectorModelName();
                jsonWriter.name("detectorModelName");
                jsonWriter.value(detectorModelName);
            }
            if (createDetectorModelRequest.getDetectorModelDefinition() != null) {
                DetectorModelDefinition detectorModelDefinition = createDetectorModelRequest
                        .getDetectorModelDefinition();
                jsonWriter.name("detectorModelDefinition");
                DetectorModelDefinitionJsonMarshaller.getInstance().marshall(
                        detectorModelDefinition, jsonWriter);
            }
            if (createDetectorModelRequest.getDetectorModelDescription() != null) {
                String detectorModelDescription = createDetectorModelRequest
                        .getDetectorModelDescription();
                jsonWriter.name("detectorModelDescription");
                jsonWriter.value(detectorModelDescription);
            }
            if (createDetectorModelRequest.getKey() != null) {
                String key = createDetectorModelRequest.getKey();
                jsonWriter.name("key");
                jsonWriter.value(key);
            }
            if (createDetectorModelRequest.getRoleArn() != null) {
                String roleArn = createDetectorModelRequest.getRoleArn();
                jsonWriter.name("roleArn");
                jsonWriter.value(roleArn);
            }
            if (createDetectorModelRequest.getTags() != null) {
                java.util.List<Tag> tags = createDetectorModelRequest.getTags();
                jsonWriter.name("tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createDetectorModelRequest.getEvaluationMethod() != null) {
                String evaluationMethod = createDetectorModelRequest.getEvaluationMethod();
                jsonWriter.name("evaluationMethod");
                jsonWriter.value(evaluationMethod);
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
