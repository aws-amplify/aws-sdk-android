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
 * JSON request marshaller for CreateFindingsFilterRequest
 */
public class CreateFindingsFilterRequestMarshaller implements
        Marshaller<Request<CreateFindingsFilterRequest>, CreateFindingsFilterRequest> {

    public Request<CreateFindingsFilterRequest> marshall(
            CreateFindingsFilterRequest createFindingsFilterRequest) {
        if (createFindingsFilterRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateFindingsFilterRequest)");
        }

        Request<CreateFindingsFilterRequest> request = new DefaultRequest<CreateFindingsFilterRequest>(
                createFindingsFilterRequest, "AmazonMacie2");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/findingsfilters";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createFindingsFilterRequest.getAction() != null) {
                String action = createFindingsFilterRequest.getAction();
                jsonWriter.name("action");
                jsonWriter.value(action);
            }
            if (createFindingsFilterRequest.getClientToken() != null) {
                String clientToken = createFindingsFilterRequest.getClientToken();
                jsonWriter.name("clientToken");
                jsonWriter.value(clientToken);
            }
            if (createFindingsFilterRequest.getDescription() != null) {
                String description = createFindingsFilterRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (createFindingsFilterRequest.getFindingCriteria() != null) {
                FindingCriteria findingCriteria = createFindingsFilterRequest.getFindingCriteria();
                jsonWriter.name("findingCriteria");
                FindingCriteriaJsonMarshaller.getInstance().marshall(findingCriteria, jsonWriter);
            }
            if (createFindingsFilterRequest.getName() != null) {
                String name = createFindingsFilterRequest.getName();
                jsonWriter.name("name");
                jsonWriter.value(name);
            }
            if (createFindingsFilterRequest.getPosition() != null) {
                Integer position = createFindingsFilterRequest.getPosition();
                jsonWriter.name("position");
                jsonWriter.value(position);
            }
            if (createFindingsFilterRequest.getTags() != null) {
                java.util.Map<String, String> tags = createFindingsFilterRequest.getTags();
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
