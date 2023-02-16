/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

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
import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateTaskTemplateRequest
 */
public class CreateTaskTemplateRequestMarshaller implements
        Marshaller<Request<CreateTaskTemplateRequest>, CreateTaskTemplateRequest> {

    public Request<CreateTaskTemplateRequest> marshall(
            CreateTaskTemplateRequest createTaskTemplateRequest) {
        if (createTaskTemplateRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateTaskTemplateRequest)");
        }

        Request<CreateTaskTemplateRequest> request = new DefaultRequest<CreateTaskTemplateRequest>(
                createTaskTemplateRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/instance/{InstanceId}/task/template";
        uriResourcePath = uriResourcePath.replace(
                "{InstanceId}",
                (createTaskTemplateRequest.getInstanceId() == null) ? "" : StringUtils
                        .fromString(createTaskTemplateRequest.getInstanceId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createTaskTemplateRequest.getName() != null) {
                String name = createTaskTemplateRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createTaskTemplateRequest.getDescription() != null) {
                String description = createTaskTemplateRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createTaskTemplateRequest.getContactFlowId() != null) {
                String contactFlowId = createTaskTemplateRequest.getContactFlowId();
                jsonWriter.name("ContactFlowId");
                jsonWriter.value(contactFlowId);
            }
            if (createTaskTemplateRequest.getConstraints() != null) {
                TaskTemplateConstraints constraints = createTaskTemplateRequest.getConstraints();
                jsonWriter.name("Constraints");
                TaskTemplateConstraintsJsonMarshaller.getInstance().marshall(constraints,
                        jsonWriter);
            }
            if (createTaskTemplateRequest.getDefaults() != null) {
                TaskTemplateDefaults defaults = createTaskTemplateRequest.getDefaults();
                jsonWriter.name("Defaults");
                TaskTemplateDefaultsJsonMarshaller.getInstance().marshall(defaults, jsonWriter);
            }
            if (createTaskTemplateRequest.getStatus() != null) {
                String status = createTaskTemplateRequest.getStatus();
                jsonWriter.name("Status");
                jsonWriter.value(status);
            }
            if (createTaskTemplateRequest.getFields() != null) {
                java.util.List<TaskTemplateField> fields = createTaskTemplateRequest.getFields();
                jsonWriter.name("Fields");
                jsonWriter.beginArray();
                for (TaskTemplateField fieldsItem : fields) {
                    if (fieldsItem != null) {
                        TaskTemplateFieldJsonMarshaller.getInstance().marshall(fieldsItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createTaskTemplateRequest.getClientToken() != null) {
                String clientToken = createTaskTemplateRequest.getClientToken();
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
