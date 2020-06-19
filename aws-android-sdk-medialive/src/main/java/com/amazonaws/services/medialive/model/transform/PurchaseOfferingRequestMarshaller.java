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

package com.amazonaws.services.medialive.model.transform;

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
import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for PurchaseOfferingRequest
 */
public class PurchaseOfferingRequestMarshaller implements
        Marshaller<Request<PurchaseOfferingRequest>, PurchaseOfferingRequest> {

    public Request<PurchaseOfferingRequest> marshall(PurchaseOfferingRequest purchaseOfferingRequest) {
        if (purchaseOfferingRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PurchaseOfferingRequest)");
        }

        Request<PurchaseOfferingRequest> request = new DefaultRequest<PurchaseOfferingRequest>(
                purchaseOfferingRequest, "AWSElementalMediaLive");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/prod/offerings/{offeringId}/purchase";
        uriResourcePath = uriResourcePath.replace(
                "{offeringId}",
                (purchaseOfferingRequest.getOfferingId() == null) ? "" : StringUtils
                        .fromString(purchaseOfferingRequest.getOfferingId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (purchaseOfferingRequest.getCount() != null) {
                Integer count = purchaseOfferingRequest.getCount();
                jsonWriter.name("Count");
                jsonWriter.value(count);
            }
            if (purchaseOfferingRequest.getName() != null) {
                String name = purchaseOfferingRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (purchaseOfferingRequest.getRequestId() != null) {
                String requestId = purchaseOfferingRequest.getRequestId();
                jsonWriter.name("RequestId");
                jsonWriter.value(requestId);
            }
            if (purchaseOfferingRequest.getStart() != null) {
                String start = purchaseOfferingRequest.getStart();
                jsonWriter.name("Start");
                jsonWriter.value(start);
            }
            if (purchaseOfferingRequest.getTags() != null) {
                java.util.Map<String, String> tags = purchaseOfferingRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                    String tagsValue = tagsEntry.getValue();
                    if (tagsValue != null) {
                        jsonWriter.name(tagsEntry.getKey());
                        jsonWriter.value(tagsValue);
                    }
                }
                jsonWriter.endObject();
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
