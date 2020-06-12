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

package com.amazonaws.services.storagegateway.model.transform;

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
import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ActivateGatewayRequest
 */
public class ActivateGatewayRequestMarshaller implements
        Marshaller<Request<ActivateGatewayRequest>, ActivateGatewayRequest> {

    public Request<ActivateGatewayRequest> marshall(ActivateGatewayRequest activateGatewayRequest) {
        if (activateGatewayRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ActivateGatewayRequest)");
        }

        Request<ActivateGatewayRequest> request = new DefaultRequest<ActivateGatewayRequest>(
                activateGatewayRequest, "AWSStorageGateway");
        String target = "StorageGateway_20130630.ActivateGateway";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (activateGatewayRequest.getActivationKey() != null) {
                String activationKey = activateGatewayRequest.getActivationKey();
                jsonWriter.name("ActivationKey");
                jsonWriter.value(activationKey);
            }
            if (activateGatewayRequest.getGatewayName() != null) {
                String gatewayName = activateGatewayRequest.getGatewayName();
                jsonWriter.name("GatewayName");
                jsonWriter.value(gatewayName);
            }
            if (activateGatewayRequest.getGatewayTimezone() != null) {
                String gatewayTimezone = activateGatewayRequest.getGatewayTimezone();
                jsonWriter.name("GatewayTimezone");
                jsonWriter.value(gatewayTimezone);
            }
            if (activateGatewayRequest.getGatewayRegion() != null) {
                String gatewayRegion = activateGatewayRequest.getGatewayRegion();
                jsonWriter.name("GatewayRegion");
                jsonWriter.value(gatewayRegion);
            }
            if (activateGatewayRequest.getGatewayType() != null) {
                String gatewayType = activateGatewayRequest.getGatewayType();
                jsonWriter.name("GatewayType");
                jsonWriter.value(gatewayType);
            }
            if (activateGatewayRequest.getTapeDriveType() != null) {
                String tapeDriveType = activateGatewayRequest.getTapeDriveType();
                jsonWriter.name("TapeDriveType");
                jsonWriter.value(tapeDriveType);
            }
            if (activateGatewayRequest.getMediumChangerType() != null) {
                String mediumChangerType = activateGatewayRequest.getMediumChangerType();
                jsonWriter.name("MediumChangerType");
                jsonWriter.value(mediumChangerType);
            }
            if (activateGatewayRequest.getTags() != null) {
                java.util.List<Tag> tags = activateGatewayRequest.getTags();
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
