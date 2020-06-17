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
 * JSON request marshaller for UpdateJobRequest
 */
public class UpdateJobRequestMarshaller implements
        Marshaller<Request<UpdateJobRequest>, UpdateJobRequest> {

    public Request<UpdateJobRequest> marshall(UpdateJobRequest updateJobRequest) {
        if (updateJobRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(UpdateJobRequest)");
        }

        Request<UpdateJobRequest> request = new DefaultRequest<UpdateJobRequest>(updateJobRequest,
                "AmazonImport/ExportSnowball");
        String target = "AWSIESnowballJobManagementService.UpdateJob";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateJobRequest.getJobId() != null) {
                String jobId = updateJobRequest.getJobId();
                jsonWriter.name("JobId");
                jsonWriter.value(jobId);
            }
            if (updateJobRequest.getRoleARN() != null) {
                String roleARN = updateJobRequest.getRoleARN();
                jsonWriter.name("RoleARN");
                jsonWriter.value(roleARN);
            }
            if (updateJobRequest.getNotification() != null) {
                Notification notification = updateJobRequest.getNotification();
                jsonWriter.name("Notification");
                NotificationJsonMarshaller.getInstance().marshall(notification, jsonWriter);
            }
            if (updateJobRequest.getResources() != null) {
                JobResource resources = updateJobRequest.getResources();
                jsonWriter.name("Resources");
                JobResourceJsonMarshaller.getInstance().marshall(resources, jsonWriter);
            }
            if (updateJobRequest.getAddressId() != null) {
                String addressId = updateJobRequest.getAddressId();
                jsonWriter.name("AddressId");
                jsonWriter.value(addressId);
            }
            if (updateJobRequest.getShippingOption() != null) {
                String shippingOption = updateJobRequest.getShippingOption();
                jsonWriter.name("ShippingOption");
                jsonWriter.value(shippingOption);
            }
            if (updateJobRequest.getDescription() != null) {
                String description = updateJobRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (updateJobRequest.getSnowballCapacityPreference() != null) {
                String snowballCapacityPreference = updateJobRequest
                        .getSnowballCapacityPreference();
                jsonWriter.name("SnowballCapacityPreference");
                jsonWriter.value(snowballCapacityPreference);
            }
            if (updateJobRequest.getForwardingAddressId() != null) {
                String forwardingAddressId = updateJobRequest.getForwardingAddressId();
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
