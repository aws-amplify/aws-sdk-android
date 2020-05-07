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
 * JSON request marshaller for RegisterTargetWithMaintenanceWindowRequest
 */
public class RegisterTargetWithMaintenanceWindowRequestMarshaller
        implements
        Marshaller<Request<RegisterTargetWithMaintenanceWindowRequest>, RegisterTargetWithMaintenanceWindowRequest> {

    public Request<RegisterTargetWithMaintenanceWindowRequest> marshall(
            RegisterTargetWithMaintenanceWindowRequest registerTargetWithMaintenanceWindowRequest) {
        if (registerTargetWithMaintenanceWindowRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RegisterTargetWithMaintenanceWindowRequest)");
        }

        Request<RegisterTargetWithMaintenanceWindowRequest> request = new DefaultRequest<RegisterTargetWithMaintenanceWindowRequest>(
                registerTargetWithMaintenanceWindowRequest, "AmazonSimpleSystemsManager(SSM)");
        String target = "AmazonSSM.RegisterTargetWithMaintenanceWindow";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (registerTargetWithMaintenanceWindowRequest.getWindowId() != null) {
                String windowId = registerTargetWithMaintenanceWindowRequest.getWindowId();
                jsonWriter.name("WindowId");
                jsonWriter.value(windowId);
            }
            if (registerTargetWithMaintenanceWindowRequest.getResourceType() != null) {
                String resourceType = registerTargetWithMaintenanceWindowRequest.getResourceType();
                jsonWriter.name("ResourceType");
                jsonWriter.value(resourceType);
            }
            if (registerTargetWithMaintenanceWindowRequest.getTargets() != null) {
                java.util.List<Target> targets = registerTargetWithMaintenanceWindowRequest
                        .getTargets();
                jsonWriter.name("Targets");
                jsonWriter.beginArray();
                for (Target targetsItem : targets) {
                    if (targetsItem != null) {
                        TargetJsonMarshaller.getInstance().marshall(targetsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (registerTargetWithMaintenanceWindowRequest.getOwnerInformation() != null) {
                String ownerInformation = registerTargetWithMaintenanceWindowRequest
                        .getOwnerInformation();
                jsonWriter.name("OwnerInformation");
                jsonWriter.value(ownerInformation);
            }
            if (registerTargetWithMaintenanceWindowRequest.getName() != null) {
                String name = registerTargetWithMaintenanceWindowRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (registerTargetWithMaintenanceWindowRequest.getDescription() != null) {
                String description = registerTargetWithMaintenanceWindowRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (registerTargetWithMaintenanceWindowRequest.getClientToken() != null) {
                String clientToken = registerTargetWithMaintenanceWindowRequest.getClientToken();
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
