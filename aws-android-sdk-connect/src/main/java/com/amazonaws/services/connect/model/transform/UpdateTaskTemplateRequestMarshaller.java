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
 * JSON request marshaller for UpdateTaskTemplateRequest
 */
public class UpdateTaskTemplateRequestMarshaller implements
        Marshaller<Request<UpdateTaskTemplateRequest>, UpdateTaskTemplateRequest> {

    public Request<UpdateTaskTemplateRequest> marshall(
            UpdateTaskTemplateRequest updateTaskTemplateRequest) {
        if (updateTaskTemplateRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateTaskTemplateRequest)");
        }

        Request<UpdateTaskTemplateRequest> request = new DefaultRequest<UpdateTaskTemplateRequest>(
                updateTaskTemplateRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/instance/{InstanceId}/task/template/{TaskTemplateId}";
        uriResourcePath = uriResourcePath.replace(
                "{TaskTemplateId}",
                (updateTaskTemplateRequest.getTaskTemplateId() == null) ? "" : StringUtils
                        .fromString(updateTaskTemplateRequest.getTaskTemplateId()));
        uriResourcePath = uriResourcePath.replace(
                "{InstanceId}",
                (updateTaskTemplateRequest.getInstanceId() == null) ? "" : StringUtils
                        .fromString(updateTaskTemplateRequest.getInstanceId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateTaskTemplateRequest.getName() != null) {
                String name = updateTaskTemplateRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateTaskTemplateRequest.getDescription() != null) {
                String description = updateTaskTemplateRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (updateTaskTemplateRequest.getContactFlowId() != null) {
                String contactFlowId = updateTaskTemplateRequest.getContactFlowId();
                jsonWriter.name("ContactFlowId");
                jsonWriter.value(contactFlowId);
            }
            if (updateTaskTemplateRequest.getConstraints() != null) {
                TaskTemplateConstraints constraints = updateTaskTemplateRequest.getConstraints();
                jsonWriter.name("Constraints");
                TaskTemplateConstraintsJsonMarshaller.getInstance().marshall(constraints,
                        jsonWriter);
            }
            if (updateTaskTemplateRequest.getDefaults() != null) {
                TaskTemplateDefaults defaults = updateTaskTemplateRequest.getDefaults();
                jsonWriter.name("Defaults");
                TaskTemplateDefaultsJsonMarshaller.getInstance().marshall(defaults, jsonWriter);
            }
            if (updateTaskTemplateRequest.getStatus() != null) {
                String status = updateTaskTemplateRequest.getStatus();
                jsonWriter.name("Status");
                jsonWriter.value(status);
            }
            if (updateTaskTemplateRequest.getFields() != null) {
                java.util.List<TaskTemplateField> fields = updateTaskTemplateRequest.getFields();
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
