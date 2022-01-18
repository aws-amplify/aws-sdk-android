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
 * JSON request marshaller for BatchDeleteDevicePositionHistoryRequest
 */
public class BatchDeleteDevicePositionHistoryRequestMarshaller
        implements
        Marshaller<Request<BatchDeleteDevicePositionHistoryRequest>, BatchDeleteDevicePositionHistoryRequest> {

    public Request<BatchDeleteDevicePositionHistoryRequest> marshall(
            BatchDeleteDevicePositionHistoryRequest batchDeleteDevicePositionHistoryRequest) {
        if (batchDeleteDevicePositionHistoryRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(BatchDeleteDevicePositionHistoryRequest)");
        }

        Request<BatchDeleteDevicePositionHistoryRequest> request = new DefaultRequest<BatchDeleteDevicePositionHistoryRequest>(
                batchDeleteDevicePositionHistoryRequest, "AmazonLocation");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/tracking/v0/trackers/{TrackerName}/delete-positions";
        uriResourcePath = uriResourcePath.replace(
                "{TrackerName}",
                (batchDeleteDevicePositionHistoryRequest.getTrackerName() == null) ? ""
                        : StringUtils.fromString(batchDeleteDevicePositionHistoryRequest
                                .getTrackerName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (batchDeleteDevicePositionHistoryRequest.getDeviceIds() != null) {
                java.util.List<String> deviceIds = batchDeleteDevicePositionHistoryRequest
                        .getDeviceIds();
                jsonWriter.name("DeviceIds");
                jsonWriter.beginArray();
                for (String deviceIdsItem : deviceIds) {
                    if (deviceIdsItem != null) {
                        jsonWriter.value(deviceIdsItem);
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
        request.setHostPrefix("tracking.");

        return request;
    }
}
