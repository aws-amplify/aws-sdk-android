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
 * JSON request marshaller for UpdateDetectorVersionMetadataRequest
 */
public class UpdateDetectorVersionMetadataRequestMarshaller
        implements
        Marshaller<Request<UpdateDetectorVersionMetadataRequest>, UpdateDetectorVersionMetadataRequest> {

    public Request<UpdateDetectorVersionMetadataRequest> marshall(
            UpdateDetectorVersionMetadataRequest updateDetectorVersionMetadataRequest) {
        if (updateDetectorVersionMetadataRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateDetectorVersionMetadataRequest)");
        }

        Request<UpdateDetectorVersionMetadataRequest> request = new DefaultRequest<UpdateDetectorVersionMetadataRequest>(
                updateDetectorVersionMetadataRequest, "AmazonFraudDetector");
        String target = "AWSHawksNestServiceFacade.UpdateDetectorVersionMetadata";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateDetectorVersionMetadataRequest.getDetectorId() != null) {
                String detectorId = updateDetectorVersionMetadataRequest.getDetectorId();
                jsonWriter.name("detectorId");
                jsonWriter.value(detectorId);
            }
            if (updateDetectorVersionMetadataRequest.getDetectorVersionId() != null) {
                String detectorVersionId = updateDetectorVersionMetadataRequest
                        .getDetectorVersionId();
                jsonWriter.name("detectorVersionId");
                jsonWriter.value(detectorVersionId);
            }
            if (updateDetectorVersionMetadataRequest.getDescription() != null) {
                String description = updateDetectorVersionMetadataRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
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
