/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model.transform;

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
import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for IndexFacesRequest
 */
public class IndexFacesRequestMarshaller implements
        Marshaller<Request<IndexFacesRequest>, IndexFacesRequest> {

    public Request<IndexFacesRequest> marshall(IndexFacesRequest indexFacesRequest) {
        if (indexFacesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(IndexFacesRequest)");
        }

        Request<IndexFacesRequest> request = new DefaultRequest<IndexFacesRequest>(
                indexFacesRequest, "AmazonRekognition");
        String target = "RekognitionService.IndexFaces";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (indexFacesRequest.getCollectionId() != null) {
                String collectionId = indexFacesRequest.getCollectionId();
                jsonWriter.name("CollectionId");
                jsonWriter.value(collectionId);
            }
            if (indexFacesRequest.getImage() != null) {
                Image image = indexFacesRequest.getImage();
                jsonWriter.name("Image");
                ImageJsonMarshaller.getInstance().marshall(image, jsonWriter);
            }
            if (indexFacesRequest.getExternalImageId() != null) {
                String externalImageId = indexFacesRequest.getExternalImageId();
                jsonWriter.name("ExternalImageId");
                jsonWriter.value(externalImageId);
            }
            if (indexFacesRequest.getDetectionAttributes() != null) {
                java.util.List<String> detectionAttributes = indexFacesRequest
                        .getDetectionAttributes();
                jsonWriter.name("DetectionAttributes");
                jsonWriter.beginArray();
                for (String detectionAttributesItem : detectionAttributes) {
                    if (detectionAttributesItem != null) {
                        jsonWriter.value(detectionAttributesItem);
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
