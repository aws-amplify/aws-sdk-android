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

package com.amazonaws.services.ec2.model.transform;

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
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for PurchaseScheduledInstancesRequest
 */
public class PurchaseScheduledInstancesRequestMarshaller implements
        Marshaller<Request<PurchaseScheduledInstancesRequest>, PurchaseScheduledInstancesRequest> {

    public Request<PurchaseScheduledInstancesRequest> marshall(
            PurchaseScheduledInstancesRequest purchaseScheduledInstancesRequest) {
        if (purchaseScheduledInstancesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PurchaseScheduledInstancesRequest)");
        }

        Request<PurchaseScheduledInstancesRequest> request = new DefaultRequest<PurchaseScheduledInstancesRequest>(
                purchaseScheduledInstancesRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (purchaseScheduledInstancesRequest.getClientToken() != null) {
                String clientToken = purchaseScheduledInstancesRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
            }
            if (purchaseScheduledInstancesRequest.getDryRun() != null) {
                Boolean dryRun = purchaseScheduledInstancesRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (purchaseScheduledInstancesRequest.getPurchaseRequests() != null) {
                java.util.List<PurchaseRequest> purchaseRequests = purchaseScheduledInstancesRequest
                        .getPurchaseRequests();
                jsonWriter.name("PurchaseRequests");
                jsonWriter.beginArray();
                for (PurchaseRequest purchaseRequestsItem : purchaseRequests) {
                    if (purchaseRequestsItem != null) {
                        PurchaseRequestJsonMarshaller.getInstance().marshall(purchaseRequestsItem,
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
