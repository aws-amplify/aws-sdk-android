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

package com.amazonaws.services.connect.model.transform;

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
import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateHoursOfOperationRequest
 */
public class UpdateHoursOfOperationRequestMarshaller implements
        Marshaller<Request<UpdateHoursOfOperationRequest>, UpdateHoursOfOperationRequest> {

    public Request<UpdateHoursOfOperationRequest> marshall(
            UpdateHoursOfOperationRequest updateHoursOfOperationRequest) {
        if (updateHoursOfOperationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateHoursOfOperationRequest)");
        }

        Request<UpdateHoursOfOperationRequest> request = new DefaultRequest<UpdateHoursOfOperationRequest>(
                updateHoursOfOperationRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/hours-of-operations/{InstanceId}/{HoursOfOperationId}";
        uriResourcePath = uriResourcePath.replace(
                "{InstanceId}",
                (updateHoursOfOperationRequest.getInstanceId() == null) ? "" : StringUtils
                        .fromString(updateHoursOfOperationRequest.getInstanceId()));
        uriResourcePath = uriResourcePath.replace(
                "{HoursOfOperationId}",
                (updateHoursOfOperationRequest.getHoursOfOperationId() == null) ? "" : StringUtils
                        .fromString(updateHoursOfOperationRequest.getHoursOfOperationId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateHoursOfOperationRequest.getName() != null) {
                String name = updateHoursOfOperationRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateHoursOfOperationRequest.getDescription() != null) {
                String description = updateHoursOfOperationRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (updateHoursOfOperationRequest.getTimeZone() != null) {
                String timeZone = updateHoursOfOperationRequest.getTimeZone();
                jsonWriter.name("TimeZone");
                jsonWriter.value(timeZone);
            }
            if (updateHoursOfOperationRequest.getConfig() != null) {
                java.util.List<HoursOfOperationConfig> config = updateHoursOfOperationRequest
                        .getConfig();
                jsonWriter.name("Config");
                jsonWriter.beginArray();
                for (HoursOfOperationConfig configItem : config) {
                    if (configItem != null) {
                        HoursOfOperationConfigJsonMarshaller.getInstance().marshall(configItem,
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
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
