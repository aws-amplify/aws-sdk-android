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

package com.amazonaws.services.snowball.model.transform;

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
import com.amazonaws.services.snowball.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateClusterRequest
 */
public class UpdateClusterRequestMarshaller implements
        Marshaller<Request<UpdateClusterRequest>, UpdateClusterRequest> {

    public Request<UpdateClusterRequest> marshall(UpdateClusterRequest updateClusterRequest) {
        if (updateClusterRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateClusterRequest)");
        }

        Request<UpdateClusterRequest> request = new DefaultRequest<UpdateClusterRequest>(
                updateClusterRequest, "AmazonImport/ExportSnowball");
        String target = "AWSIESnowballJobManagementService.UpdateCluster";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateClusterRequest.getClusterId() != null) {
                String clusterId = updateClusterRequest.getClusterId();
                jsonWriter.name("ClusterId");
                jsonWriter.value(clusterId);
            }
            if (updateClusterRequest.getRoleARN() != null) {
                String roleARN = updateClusterRequest.getRoleARN();
                jsonWriter.name("RoleARN");
                jsonWriter.value(roleARN);
            }
            if (updateClusterRequest.getDescription() != null) {
                String description = updateClusterRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (updateClusterRequest.getResources() != null) {
                JobResource resources = updateClusterRequest.getResources();
                jsonWriter.name("Resources");
                JobResourceJsonMarshaller.getInstance().marshall(resources, jsonWriter);
            }
            if (updateClusterRequest.getAddressId() != null) {
                String addressId = updateClusterRequest.getAddressId();
                jsonWriter.name("AddressId");
                jsonWriter.value(addressId);
            }
            if (updateClusterRequest.getShippingOption() != null) {
                String shippingOption = updateClusterRequest.getShippingOption();
                jsonWriter.name("ShippingOption");
                jsonWriter.value(shippingOption);
            }
            if (updateClusterRequest.getNotification() != null) {
                Notification notification = updateClusterRequest.getNotification();
                jsonWriter.name("Notification");
                NotificationJsonMarshaller.getInstance().marshall(notification, jsonWriter);
            }
            if (updateClusterRequest.getForwardingAddressId() != null) {
                String forwardingAddressId = updateClusterRequest.getForwardingAddressId();
                jsonWriter.name("ForwardingAddressId");
                jsonWriter.value(forwardingAddressId);
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
