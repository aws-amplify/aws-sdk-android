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

package com.amazonaws.services.ssm.model.transform;

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
import com.amazonaws.services.ssm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateDocumentRequest
 */
public class CreateDocumentRequestMarshaller implements
        Marshaller<Request<CreateDocumentRequest>, CreateDocumentRequest> {

    public Request<CreateDocumentRequest> marshall(CreateDocumentRequest createDocumentRequest) {
        if (createDocumentRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateDocumentRequest)");
        }

        Request<CreateDocumentRequest> request = new DefaultRequest<CreateDocumentRequest>(
                createDocumentRequest, "AmazonSSM");
        String target = "AmazonSSM.CreateDocument";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createDocumentRequest.getContent() != null) {
                String content = createDocumentRequest.getContent();
                jsonWriter.name("Content");
                jsonWriter.value(content);
            }
            if (createDocumentRequest.getRequires() != null) {
                java.util.List<DocumentRequires> requires = createDocumentRequest.getRequires();
                jsonWriter.name("Requires");
                jsonWriter.beginArray();
                for (DocumentRequires requiresItem : requires) {
                    if (requiresItem != null) {
                        DocumentRequiresJsonMarshaller.getInstance().marshall(requiresItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createDocumentRequest.getAttachments() != null) {
                java.util.List<AttachmentsSource> attachments = createDocumentRequest
                        .getAttachments();
                jsonWriter.name("Attachments");
                jsonWriter.beginArray();
                for (AttachmentsSource attachmentsItem : attachments) {
                    if (attachmentsItem != null) {
                        AttachmentsSourceJsonMarshaller.getInstance().marshall(attachmentsItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createDocumentRequest.getName() != null) {
                String name = createDocumentRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createDocumentRequest.getVersionName() != null) {
                String versionName = createDocumentRequest.getVersionName();
                jsonWriter.name("VersionName");
                jsonWriter.value(versionName);
            }
            if (createDocumentRequest.getDocumentType() != null) {
                String documentType = createDocumentRequest.getDocumentType();
                jsonWriter.name("DocumentType");
                jsonWriter.value(documentType);
            }
            if (createDocumentRequest.getDocumentFormat() != null) {
                String documentFormat = createDocumentRequest.getDocumentFormat();
                jsonWriter.name("DocumentFormat");
                jsonWriter.value(documentFormat);
            }
            if (createDocumentRequest.getTargetType() != null) {
                String targetType = createDocumentRequest.getTargetType();
                jsonWriter.name("TargetType");
                jsonWriter.value(targetType);
            }
            if (createDocumentRequest.getTags() != null) {
                java.util.List<Tag> tags = createDocumentRequest.getTags();
                jsonWriter.name("Tags");
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
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
