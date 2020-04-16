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

package com.amazonaws.services.awsmigrationhub.model.transform;

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
import com.amazonaws.services.awsmigrationhub.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for PutResourceAttributesRequest
 */
public class PutResourceAttributesRequestMarshaller implements
        Marshaller<Request<PutResourceAttributesRequest>, PutResourceAttributesRequest> {

    public Request<PutResourceAttributesRequest> marshall(
            PutResourceAttributesRequest putResourceAttributesRequest) {
        if (putResourceAttributesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutResourceAttributesRequest)");
        }

        Request<PutResourceAttributesRequest> request = new DefaultRequest<PutResourceAttributesRequest>(
                putResourceAttributesRequest, "AWSMigrationHub");
        String target = "AWSMigrationHub.PutResourceAttributes";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (putResourceAttributesRequest.getProgressUpdateStream() != null) {
                String progressUpdateStream = putResourceAttributesRequest
                        .getProgressUpdateStream();
                jsonWriter.name("ProgressUpdateStream");
                jsonWriter.value(progressUpdateStream);
            }
            if (putResourceAttributesRequest.getMigrationTaskName() != null) {
                String migrationTaskName = putResourceAttributesRequest.getMigrationTaskName();
                jsonWriter.name("MigrationTaskName");
                jsonWriter.value(migrationTaskName);
            }
            if (putResourceAttributesRequest.getResourceAttributeList() != null) {
                java.util.List<ResourceAttribute> resourceAttributeList = putResourceAttributesRequest
                        .getResourceAttributeList();
                jsonWriter.name("ResourceAttributeList");
                jsonWriter.beginArray();
                for (ResourceAttribute resourceAttributeListItem : resourceAttributeList) {
                    if (resourceAttributeListItem != null) {
                        ResourceAttributeJsonMarshaller.getInstance().marshall(
                                resourceAttributeListItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (putResourceAttributesRequest.getDryRun() != null) {
                Boolean dryRun = putResourceAttributesRequest.getDryRun();
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
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
