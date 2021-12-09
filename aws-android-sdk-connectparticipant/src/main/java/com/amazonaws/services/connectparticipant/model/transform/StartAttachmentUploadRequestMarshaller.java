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

package com.amazonaws.services.connectparticipant.model.transform;

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
import com.amazonaws.services.connectparticipant.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for StartAttachmentUploadRequest
 */
public class StartAttachmentUploadRequestMarshaller implements
        Marshaller<Request<StartAttachmentUploadRequest>, StartAttachmentUploadRequest> {

    public Request<StartAttachmentUploadRequest> marshall(
            StartAttachmentUploadRequest startAttachmentUploadRequest) {
        if (startAttachmentUploadRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartAttachmentUploadRequest)");
        }

        Request<StartAttachmentUploadRequest> request = new DefaultRequest<StartAttachmentUploadRequest>(
                startAttachmentUploadRequest, "AmazonConnectParticipant");
        request.setHttpMethod(HttpMethodName.POST);

        if (startAttachmentUploadRequest.getConnectionToken() != null) {
            request.addHeader("X-Amz-Bearer",
                    StringUtils.fromString(startAttachmentUploadRequest.getConnectionToken()));
        }
        String uriResourcePath = "/participant/start-attachment-upload";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (startAttachmentUploadRequest.getContentType() != null) {
                String contentType = startAttachmentUploadRequest.getContentType();
                jsonWriter.name("ContentType");
                jsonWriter.value(contentType);
            }
            if (startAttachmentUploadRequest.getAttachmentSizeInBytes() != null) {
                Long attachmentSizeInBytes = startAttachmentUploadRequest
                        .getAttachmentSizeInBytes();
                jsonWriter.name("AttachmentSizeInBytes");
                jsonWriter.value(attachmentSizeInBytes);
            }
            if (startAttachmentUploadRequest.getAttachmentName() != null) {
                String attachmentName = startAttachmentUploadRequest.getAttachmentName();
                jsonWriter.name("AttachmentName");
                jsonWriter.value(attachmentName);
            }
            if (startAttachmentUploadRequest.getClientToken() != null) {
                String clientToken = startAttachmentUploadRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
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
