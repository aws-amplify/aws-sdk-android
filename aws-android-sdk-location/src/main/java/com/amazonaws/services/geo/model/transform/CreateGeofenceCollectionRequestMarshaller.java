/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model.transform;

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
import com.amazonaws.services.geo.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateGeofenceCollectionRequest
 */
public class CreateGeofenceCollectionRequestMarshaller implements
        Marshaller<Request<CreateGeofenceCollectionRequest>, CreateGeofenceCollectionRequest> {

    public Request<CreateGeofenceCollectionRequest> marshall(
            CreateGeofenceCollectionRequest createGeofenceCollectionRequest) {
        if (createGeofenceCollectionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateGeofenceCollectionRequest)");
        }

        Request<CreateGeofenceCollectionRequest> request = new DefaultRequest<CreateGeofenceCollectionRequest>(
                createGeofenceCollectionRequest, "AmazonLocation");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/geofencing/v0/collections";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createGeofenceCollectionRequest.getCollectionName() != null) {
                String collectionName = createGeofenceCollectionRequest.getCollectionName();
                jsonWriter.name("CollectionName");
                jsonWriter.value(collectionName);
            }
            if (createGeofenceCollectionRequest.getDescription() != null) {
                String description = createGeofenceCollectionRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createGeofenceCollectionRequest.getKmsKeyId() != null) {
                String kmsKeyId = createGeofenceCollectionRequest.getKmsKeyId();
                jsonWriter.name("KmsKeyId");
                jsonWriter.value(kmsKeyId);
            }
            if (createGeofenceCollectionRequest.getPricingPlan() != null) {
                String pricingPlan = createGeofenceCollectionRequest.getPricingPlan();
                jsonWriter.name("PricingPlan");
                jsonWriter.value(pricingPlan);
            }
            if (createGeofenceCollectionRequest.getPricingPlanDataSource() != null) {
                String pricingPlanDataSource = createGeofenceCollectionRequest
                        .getPricingPlanDataSource();
                jsonWriter.name("PricingPlanDataSource");
                jsonWriter.value(pricingPlanDataSource);
            }
            if (createGeofenceCollectionRequest.getTags() != null) {
                java.util.Map<String, String> tags = createGeofenceCollectionRequest.getTags();
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
        request.setHostPrefix("geofencing.");

        return request;
    }
}
