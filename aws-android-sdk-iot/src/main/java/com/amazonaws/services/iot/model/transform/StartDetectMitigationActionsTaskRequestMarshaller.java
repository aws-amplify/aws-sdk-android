/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for StartDetectMitigationActionsTaskRequest
 */
public class StartDetectMitigationActionsTaskRequestMarshaller
        implements
        Marshaller<Request<StartDetectMitigationActionsTaskRequest>, StartDetectMitigationActionsTaskRequest> {

    public Request<StartDetectMitigationActionsTaskRequest> marshall(
            StartDetectMitigationActionsTaskRequest startDetectMitigationActionsTaskRequest) {
        if (startDetectMitigationActionsTaskRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartDetectMitigationActionsTaskRequest)");
        }

        Request<StartDetectMitigationActionsTaskRequest> request = new DefaultRequest<StartDetectMitigationActionsTaskRequest>(
                startDetectMitigationActionsTaskRequest, "AWSIot");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/detect/mitigationactions/tasks/{taskId}";
        uriResourcePath = uriResourcePath.replace(
                "{taskId}",
                (startDetectMitigationActionsTaskRequest.getTaskId() == null) ? "" : StringUtils
                        .fromString(startDetectMitigationActionsTaskRequest.getTaskId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (startDetectMitigationActionsTaskRequest.getTarget() != null) {
                DetectMitigationActionsTaskTarget target = startDetectMitigationActionsTaskRequest
                        .getTarget();
                jsonWriter.name("target");
                DetectMitigationActionsTaskTargetJsonMarshaller.getInstance().marshall(target,
                        jsonWriter);
            }
            if (startDetectMitigationActionsTaskRequest.getActions() != null) {
                java.util.List<String> actions = startDetectMitigationActionsTaskRequest
                        .getActions();
                jsonWriter.name("actions");
                jsonWriter.beginArray();
                for (String actionsItem : actions) {
                    if (actionsItem != null) {
                        jsonWriter.value(actionsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (startDetectMitigationActionsTaskRequest.getViolationEventOccurrenceRange() != null) {
                ViolationEventOccurrenceRange violationEventOccurrenceRange = startDetectMitigationActionsTaskRequest
                        .getViolationEventOccurrenceRange();
                jsonWriter.name("violationEventOccurrenceRange");
                ViolationEventOccurrenceRangeJsonMarshaller.getInstance().marshall(
                        violationEventOccurrenceRange, jsonWriter);
            }
            if (startDetectMitigationActionsTaskRequest.getIncludeOnlyActiveViolations() != null) {
                Boolean includeOnlyActiveViolations = startDetectMitigationActionsTaskRequest
                        .getIncludeOnlyActiveViolations();
                jsonWriter.name("includeOnlyActiveViolations");
                jsonWriter.value(includeOnlyActiveViolations);
            }
            if (startDetectMitigationActionsTaskRequest.getIncludeSuppressedAlerts() != null) {
                Boolean includeSuppressedAlerts = startDetectMitigationActionsTaskRequest
                        .getIncludeSuppressedAlerts();
                jsonWriter.name("includeSuppressedAlerts");
                jsonWriter.value(includeSuppressedAlerts);
            }
            if (startDetectMitigationActionsTaskRequest.getClientRequestToken() != null) {
                String clientRequestToken = startDetectMitigationActionsTaskRequest
                        .getClientRequestToken();
                jsonWriter.name("clientRequestToken");
                jsonWriter.value(clientRequestToken);
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
