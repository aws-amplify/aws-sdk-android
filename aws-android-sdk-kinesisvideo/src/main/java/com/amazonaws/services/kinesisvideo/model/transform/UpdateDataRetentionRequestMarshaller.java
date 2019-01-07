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

package com.amazonaws.services.kinesisvideo.model.transform;

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
import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateDataRetentionRequest
 */
public class UpdateDataRetentionRequestMarshaller implements
        Marshaller<Request<UpdateDataRetentionRequest>, UpdateDataRetentionRequest> {

    public Request<UpdateDataRetentionRequest> marshall(
            UpdateDataRetentionRequest updateDataRetentionRequest) {
        if (updateDataRetentionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateDataRetentionRequest)");
        }

        Request<UpdateDataRetentionRequest> request = new DefaultRequest<UpdateDataRetentionRequest>(
                updateDataRetentionRequest, "AWSKinesisVideo");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/updateDataRetention";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateDataRetentionRequest.getStreamName() != null) {
                String streamName = updateDataRetentionRequest.getStreamName();
                jsonWriter.name("StreamName");
                jsonWriter.value(streamName);
            }
            if (updateDataRetentionRequest.getStreamARN() != null) {
                String streamARN = updateDataRetentionRequest.getStreamARN();
                jsonWriter.name("StreamARN");
                jsonWriter.value(streamARN);
            }
            if (updateDataRetentionRequest.getCurrentVersion() != null) {
                String currentVersion = updateDataRetentionRequest.getCurrentVersion();
                jsonWriter.name("CurrentVersion");
                jsonWriter.value(currentVersion);
            }
            if (updateDataRetentionRequest.getOperation() != null) {
                String operation = updateDataRetentionRequest.getOperation();
                jsonWriter.name("Operation");
                jsonWriter.value(operation);
            }
            if (updateDataRetentionRequest.getDataRetentionChangeInHours() != null) {
                Integer dataRetentionChangeInHours = updateDataRetentionRequest
                        .getDataRetentionChangeInHours();
                jsonWriter.name("DataRetentionChangeInHours");
                jsonWriter.value(dataRetentionChangeInHours);
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
