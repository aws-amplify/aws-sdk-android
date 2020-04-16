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

package com.amazonaws.services.amazonimportexportsnowball.model.transform;

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
import com.amazonaws.services.amazonimportexportsnowball.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateJobRequest
 */
public class CreateJobRequestMarshaller implements
        Marshaller<Request<CreateJobRequest>, CreateJobRequest> {

    public Request<CreateJobRequest> marshall(CreateJobRequest createJobRequest) {
        if (createJobRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(CreateJobRequest)");
        }

        Request<CreateJobRequest> request = new DefaultRequest<CreateJobRequest>(createJobRequest,
                "AmazonImport/ExportSnowball");
        String target = "AWSIESnowballJobManagementService.CreateJob";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createJobRequest.getJobType() != null) {
                String jobType = createJobRequest.getJobType();
                jsonWriter.name("JobType");
                jsonWriter.value(jobType);
            }
            if (createJobRequest.getResources() != null) {
                JobResource resources = createJobRequest.getResources();
                jsonWriter.name("Resources");
                JobResourceJsonMarshaller.getInstance().marshall(resources, jsonWriter);
            }
            if (createJobRequest.getDescription() != null) {
                String description = createJobRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createJobRequest.getAddressId() != null) {
                String addressId = createJobRequest.getAddressId();
                jsonWriter.name("AddressId");
                jsonWriter.value(addressId);
            }
            if (createJobRequest.getKmsKeyARN() != null) {
                String kmsKeyARN = createJobRequest.getKmsKeyARN();
                jsonWriter.name("KmsKeyARN");
                jsonWriter.value(kmsKeyARN);
            }
            if (createJobRequest.getRoleARN() != null) {
                String roleARN = createJobRequest.getRoleARN();
                jsonWriter.name("RoleARN");
                jsonWriter.value(roleARN);
            }
            if (createJobRequest.getSnowballCapacityPreference() != null) {
                String snowballCapacityPreference = createJobRequest
                        .getSnowballCapacityPreference();
                jsonWriter.name("SnowballCapacityPreference");
                jsonWriter.value(snowballCapacityPreference);
            }
            if (createJobRequest.getShippingOption() != null) {
                String shippingOption = createJobRequest.getShippingOption();
                jsonWriter.name("ShippingOption");
                jsonWriter.value(shippingOption);
            }
            if (createJobRequest.getNotification() != null) {
                Notification notification = createJobRequest.getNotification();
                jsonWriter.name("Notification");
                NotificationJsonMarshaller.getInstance().marshall(notification, jsonWriter);
            }
            if (createJobRequest.getClusterId() != null) {
                String clusterId = createJobRequest.getClusterId();
                jsonWriter.name("ClusterId");
                jsonWriter.value(clusterId);
            }
            if (createJobRequest.getSnowballType() != null) {
                String snowballType = createJobRequest.getSnowballType();
                jsonWriter.name("SnowballType");
                jsonWriter.value(snowballType);
            }
            if (createJobRequest.getForwardingAddressId() != null) {
                String forwardingAddressId = createJobRequest.getForwardingAddressId();
                jsonWriter.name("ForwardingAddressId");
                jsonWriter.value(forwardingAddressId);
            }
            if (createJobRequest.getTaxDocuments() != null) {
                TaxDocuments taxDocuments = createJobRequest.getTaxDocuments();
                jsonWriter.name("TaxDocuments");
                TaxDocumentsJsonMarshaller.getInstance().marshall(taxDocuments, jsonWriter);
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
