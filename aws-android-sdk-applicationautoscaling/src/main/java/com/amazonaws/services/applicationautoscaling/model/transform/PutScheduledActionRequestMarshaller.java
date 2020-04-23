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

package com.amazonaws.services.applicationautoscaling.model.transform;

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
import com.amazonaws.services.applicationautoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for PutScheduledActionRequest
 */
public class PutScheduledActionRequestMarshaller implements
        Marshaller<Request<PutScheduledActionRequest>, PutScheduledActionRequest> {

    public Request<PutScheduledActionRequest> marshall(
            PutScheduledActionRequest putScheduledActionRequest) {
        if (putScheduledActionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutScheduledActionRequest)");
        }

        Request<PutScheduledActionRequest> request = new DefaultRequest<PutScheduledActionRequest>(
                putScheduledActionRequest, "ApplicationAutoScaling");
        String target = "AnyScaleFrontendService.PutScheduledAction";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (putScheduledActionRequest.getServiceNamespace() != null) {
                String serviceNamespace = putScheduledActionRequest.getServiceNamespace();
                jsonWriter.name("ServiceNamespace");
                jsonWriter.value(serviceNamespace);
            }
            if (putScheduledActionRequest.getSchedule() != null) {
                String schedule = putScheduledActionRequest.getSchedule();
                jsonWriter.name("Schedule");
                jsonWriter.value(schedule);
            }
            if (putScheduledActionRequest.getScheduledActionName() != null) {
                String scheduledActionName = putScheduledActionRequest.getScheduledActionName();
                jsonWriter.name("ScheduledActionName");
                jsonWriter.value(scheduledActionName);
            }
            if (putScheduledActionRequest.getResourceId() != null) {
                String resourceId = putScheduledActionRequest.getResourceId();
                jsonWriter.name("ResourceId");
                jsonWriter.value(resourceId);
            }
            if (putScheduledActionRequest.getScalableDimension() != null) {
                String scalableDimension = putScheduledActionRequest.getScalableDimension();
                jsonWriter.name("ScalableDimension");
                jsonWriter.value(scalableDimension);
            }
            if (putScheduledActionRequest.getStartTime() != null) {
                java.util.Date startTime = putScheduledActionRequest.getStartTime();
                jsonWriter.name("StartTime");
                jsonWriter.value(startTime);
            }
            if (putScheduledActionRequest.getEndTime() != null) {
                java.util.Date endTime = putScheduledActionRequest.getEndTime();
                jsonWriter.name("EndTime");
                jsonWriter.value(endTime);
            }
            if (putScheduledActionRequest.getScalableTargetAction() != null) {
                ScalableTargetAction scalableTargetAction = putScheduledActionRequest
                        .getScalableTargetAction();
                jsonWriter.name("ScalableTargetAction");
                ScalableTargetActionJsonMarshaller.getInstance().marshall(scalableTargetAction,
                        jsonWriter);
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
