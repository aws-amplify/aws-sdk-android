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

package com.amazonaws.services.amazonfrauddetector.model.transform;

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
import com.amazonaws.services.amazonfrauddetector.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetPredictionRequest
 */
public class GetPredictionRequestMarshaller implements
        Marshaller<Request<GetPredictionRequest>, GetPredictionRequest> {

    public Request<GetPredictionRequest> marshall(GetPredictionRequest getPredictionRequest) {
        if (getPredictionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetPredictionRequest)");
        }

        Request<GetPredictionRequest> request = new DefaultRequest<GetPredictionRequest>(
                getPredictionRequest, "AmazonFraudDetector");
        String target = "AWSHawksNestServiceFacade.GetPrediction";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (getPredictionRequest.getDetectorId() != null) {
                String detectorId = getPredictionRequest.getDetectorId();
                jsonWriter.name("detectorId");
                jsonWriter.value(detectorId);
            }
            if (getPredictionRequest.getDetectorVersionId() != null) {
                String detectorVersionId = getPredictionRequest.getDetectorVersionId();
                jsonWriter.name("detectorVersionId");
                jsonWriter.value(detectorVersionId);
            }
            if (getPredictionRequest.getEventId() != null) {
                String eventId = getPredictionRequest.getEventId();
                jsonWriter.name("eventId");
                jsonWriter.value(eventId);
            }
            if (getPredictionRequest.getEventAttributes() != null) {
                java.util.Map<String, String> eventAttributes = getPredictionRequest
                        .getEventAttributes();
                jsonWriter.name("eventAttributes");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> eventAttributesEntry : eventAttributes
                        .entrySet()) {
                    String eventAttributesValue = eventAttributesEntry.getValue();
                    if (eventAttributesValue != null) {
                        jsonWriter.name(eventAttributesEntry.getKey());
                        jsonWriter.value(eventAttributesValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (getPredictionRequest.getExternalModelEndpointDataBlobs() != null) {
                java.util.Map<String, ModelEndpointDataBlob> externalModelEndpointDataBlobs = getPredictionRequest
                        .getExternalModelEndpointDataBlobs();
                jsonWriter.name("externalModelEndpointDataBlobs");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, ModelEndpointDataBlob> externalModelEndpointDataBlobsEntry : externalModelEndpointDataBlobs
                        .entrySet()) {
                    ModelEndpointDataBlob externalModelEndpointDataBlobsValue = externalModelEndpointDataBlobsEntry
                            .getValue();
                    if (externalModelEndpointDataBlobsValue != null) {
                        jsonWriter.name(externalModelEndpointDataBlobsEntry.getKey());
                        ModelEndpointDataBlobJsonMarshaller.getInstance().marshall(
                                externalModelEndpointDataBlobsValue, jsonWriter);
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
