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

package com.amazonaws.services.iot.model.transform;

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
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateScheduledAuditRequest
 */
public class UpdateScheduledAuditRequestMarshaller implements
        Marshaller<Request<UpdateScheduledAuditRequest>, UpdateScheduledAuditRequest> {

    public Request<UpdateScheduledAuditRequest> marshall(
            UpdateScheduledAuditRequest updateScheduledAuditRequest) {
        if (updateScheduledAuditRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateScheduledAuditRequest)");
        }

        Request<UpdateScheduledAuditRequest> request = new DefaultRequest<UpdateScheduledAuditRequest>(
                updateScheduledAuditRequest, "AWSIot");
        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/audit/scheduledaudits/{scheduledAuditName}";
        uriResourcePath = uriResourcePath.replace(
                "{scheduledAuditName}",
                (updateScheduledAuditRequest.getScheduledAuditName() == null) ? "" : StringUtils
                        .fromString(updateScheduledAuditRequest.getScheduledAuditName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateScheduledAuditRequest.getFrequency() != null) {
                String frequency = updateScheduledAuditRequest.getFrequency();
                jsonWriter.name("frequency");
                jsonWriter.value(frequency);
            }
            if (updateScheduledAuditRequest.getDayOfMonth() != null) {
                String dayOfMonth = updateScheduledAuditRequest.getDayOfMonth();
                jsonWriter.name("dayOfMonth");
                jsonWriter.value(dayOfMonth);
            }
            if (updateScheduledAuditRequest.getDayOfWeek() != null) {
                String dayOfWeek = updateScheduledAuditRequest.getDayOfWeek();
                jsonWriter.name("dayOfWeek");
                jsonWriter.value(dayOfWeek);
            }
            if (updateScheduledAuditRequest.getTargetCheckNames() != null) {
                java.util.List<String> targetCheckNames = updateScheduledAuditRequest
                        .getTargetCheckNames();
                jsonWriter.name("targetCheckNames");
                jsonWriter.beginArray();
                for (String targetCheckNamesItem : targetCheckNames) {
                    if (targetCheckNamesItem != null) {
                        jsonWriter.value(targetCheckNamesItem);
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
