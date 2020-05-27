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

package com.amazonaws.services.guardduty.model.transform;

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
import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateThreatIntelSetRequest
 */
public class CreateThreatIntelSetRequestMarshaller implements
        Marshaller<Request<CreateThreatIntelSetRequest>, CreateThreatIntelSetRequest> {

    public Request<CreateThreatIntelSetRequest> marshall(
            CreateThreatIntelSetRequest createThreatIntelSetRequest) {
        if (createThreatIntelSetRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateThreatIntelSetRequest)");
        }

        Request<CreateThreatIntelSetRequest> request = new DefaultRequest<CreateThreatIntelSetRequest>(
                createThreatIntelSetRequest, "AmazonGuardDuty");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/detector/{detectorId}/threatintelset";
        uriResourcePath = uriResourcePath.replace(
                "{detectorId}",
                (createThreatIntelSetRequest.getDetectorId() == null) ? "" : StringUtils
                        .fromString(createThreatIntelSetRequest.getDetectorId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createThreatIntelSetRequest.getName() != null) {
                String name = createThreatIntelSetRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createThreatIntelSetRequest.getFormat() != null) {
                String format = createThreatIntelSetRequest.getFormat();
                jsonWriter.name("Format");
                jsonWriter.value(format);
            }
            if (createThreatIntelSetRequest.getLocation() != null) {
                String location = createThreatIntelSetRequest.getLocation();
                jsonWriter.name("Location");
                jsonWriter.value(location);
            }
            if (createThreatIntelSetRequest.getActivate() != null) {
                Boolean activate = createThreatIntelSetRequest.getActivate();
                jsonWriter.name("Activate");
                jsonWriter.value(activate);
            }
            if (createThreatIntelSetRequest.getClientToken() != null) {
                String clientToken = createThreatIntelSetRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
            }
            if (createThreatIntelSetRequest.getTags() != null) {
                java.util.Map<String, String> tags = createThreatIntelSetRequest.getTags();
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
