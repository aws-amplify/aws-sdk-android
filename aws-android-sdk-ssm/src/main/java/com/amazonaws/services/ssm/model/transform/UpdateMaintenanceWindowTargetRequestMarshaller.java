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
 * JSON request marshaller for UpdateMaintenanceWindowTargetRequest
 */
public class UpdateMaintenanceWindowTargetRequestMarshaller
        implements
        Marshaller<Request<UpdateMaintenanceWindowTargetRequest>, UpdateMaintenanceWindowTargetRequest> {

    public Request<UpdateMaintenanceWindowTargetRequest> marshall(
            UpdateMaintenanceWindowTargetRequest updateMaintenanceWindowTargetRequest) {
        if (updateMaintenanceWindowTargetRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateMaintenanceWindowTargetRequest)");
        }

        Request<UpdateMaintenanceWindowTargetRequest> request = new DefaultRequest<UpdateMaintenanceWindowTargetRequest>(
                updateMaintenanceWindowTargetRequest, "AmazonSSM");
        String target = "AmazonSSM.UpdateMaintenanceWindowTarget";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateMaintenanceWindowTargetRequest.getWindowId() != null) {
                String windowId = updateMaintenanceWindowTargetRequest.getWindowId();
                jsonWriter.name("WindowId");
                jsonWriter.value(windowId);
            }
            if (updateMaintenanceWindowTargetRequest.getWindowTargetId() != null) {
                String windowTargetId = updateMaintenanceWindowTargetRequest.getWindowTargetId();
                jsonWriter.name("WindowTargetId");
                jsonWriter.value(windowTargetId);
            }
            if (updateMaintenanceWindowTargetRequest.getTargets() != null) {
                java.util.List<Target> targets = updateMaintenanceWindowTargetRequest.getTargets();
                jsonWriter.name("Targets");
                jsonWriter.beginArray();
                for (Target targetsItem : targets) {
                    if (targetsItem != null) {
                        TargetJsonMarshaller.getInstance().marshall(targetsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateMaintenanceWindowTargetRequest.getOwnerInformation() != null) {
                String ownerInformation = updateMaintenanceWindowTargetRequest
                        .getOwnerInformation();
                jsonWriter.name("OwnerInformation");
                jsonWriter.value(ownerInformation);
            }
            if (updateMaintenanceWindowTargetRequest.getName() != null) {
                String name = updateMaintenanceWindowTargetRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateMaintenanceWindowTargetRequest.getDescription() != null) {
                String description = updateMaintenanceWindowTargetRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (updateMaintenanceWindowTargetRequest.getReplace() != null) {
                Boolean replace = updateMaintenanceWindowTargetRequest.getReplace();
                jsonWriter.name("Replace");
                jsonWriter.value(replace);
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
