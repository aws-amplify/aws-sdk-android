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
 * JSON request marshaller for BatchDeleteGeofenceRequest
 */
public class BatchDeleteGeofenceRequestMarshaller implements
        Marshaller<Request<BatchDeleteGeofenceRequest>, BatchDeleteGeofenceRequest> {

    public Request<BatchDeleteGeofenceRequest> marshall(
            BatchDeleteGeofenceRequest batchDeleteGeofenceRequest) {
        if (batchDeleteGeofenceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(BatchDeleteGeofenceRequest)");
        }

        Request<BatchDeleteGeofenceRequest> request = new DefaultRequest<BatchDeleteGeofenceRequest>(
                batchDeleteGeofenceRequest, "AmazonLocation");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/geofencing/v0/collections/{CollectionName}/delete-geofences";
        uriResourcePath = uriResourcePath.replace(
                "{CollectionName}",
                (batchDeleteGeofenceRequest.getCollectionName() == null) ? "" : StringUtils
                        .fromString(batchDeleteGeofenceRequest.getCollectionName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (batchDeleteGeofenceRequest.getGeofenceIds() != null) {
                java.util.List<String> geofenceIds = batchDeleteGeofenceRequest.getGeofenceIds();
                jsonWriter.name("GeofenceIds");
                jsonWriter.beginArray();
                for (String geofenceIdsItem : geofenceIds) {
                    if (geofenceIdsItem != null) {
                        jsonWriter.value(geofenceIdsItem);
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
        request.setHostPrefix("geofencing.");

        return request;
    }
}
