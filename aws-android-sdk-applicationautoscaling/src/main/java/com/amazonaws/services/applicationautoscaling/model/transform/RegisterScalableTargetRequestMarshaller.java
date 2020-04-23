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

package com.amazonaws.services.applicationautoscaling.model.transform;

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
import com.amazonaws.services.applicationautoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for RegisterScalableTargetRequest
 */
public class RegisterScalableTargetRequestMarshaller implements
        Marshaller<Request<RegisterScalableTargetRequest>, RegisterScalableTargetRequest> {

    public Request<RegisterScalableTargetRequest> marshall(
            RegisterScalableTargetRequest registerScalableTargetRequest) {
        if (registerScalableTargetRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RegisterScalableTargetRequest)");
        }

        Request<RegisterScalableTargetRequest> request = new DefaultRequest<RegisterScalableTargetRequest>(
                registerScalableTargetRequest, "ApplicationAutoScaling");
        String target = "AnyScaleFrontendService.RegisterScalableTarget";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (registerScalableTargetRequest.getServiceNamespace() != null) {
                String serviceNamespace = registerScalableTargetRequest.getServiceNamespace();
                jsonWriter.name("ServiceNamespace");
                jsonWriter.value(serviceNamespace);
            }
            if (registerScalableTargetRequest.getResourceId() != null) {
                String resourceId = registerScalableTargetRequest.getResourceId();
                jsonWriter.name("ResourceId");
                jsonWriter.value(resourceId);
            }
            if (registerScalableTargetRequest.getScalableDimension() != null) {
                String scalableDimension = registerScalableTargetRequest.getScalableDimension();
                jsonWriter.name("ScalableDimension");
                jsonWriter.value(scalableDimension);
            }
            if (registerScalableTargetRequest.getMinCapacity() != null) {
                Integer minCapacity = registerScalableTargetRequest.getMinCapacity();
                jsonWriter.name("MinCapacity");
                jsonWriter.value(minCapacity);
            }
            if (registerScalableTargetRequest.getMaxCapacity() != null) {
                Integer maxCapacity = registerScalableTargetRequest.getMaxCapacity();
                jsonWriter.name("MaxCapacity");
                jsonWriter.value(maxCapacity);
            }
            if (registerScalableTargetRequest.getRoleARN() != null) {
                String roleARN = registerScalableTargetRequest.getRoleARN();
                jsonWriter.name("RoleARN");
                jsonWriter.value(roleARN);
            }
            if (registerScalableTargetRequest.getSuspendedState() != null) {
                SuspendedState suspendedState = registerScalableTargetRequest.getSuspendedState();
                jsonWriter.name("SuspendedState");
                SuspendedStateJsonMarshaller.getInstance().marshall(suspendedState, jsonWriter);
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
