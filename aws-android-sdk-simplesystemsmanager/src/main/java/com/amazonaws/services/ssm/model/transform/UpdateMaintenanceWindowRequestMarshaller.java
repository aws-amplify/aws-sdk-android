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

package com.amazonaws.services.ssm.model.transform;

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
import com.amazonaws.services.ssm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateMaintenanceWindowRequest
 */
public class UpdateMaintenanceWindowRequestMarshaller implements
        Marshaller<Request<UpdateMaintenanceWindowRequest>, UpdateMaintenanceWindowRequest> {

    public Request<UpdateMaintenanceWindowRequest> marshall(
            UpdateMaintenanceWindowRequest updateMaintenanceWindowRequest) {
        if (updateMaintenanceWindowRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateMaintenanceWindowRequest)");
        }

        Request<UpdateMaintenanceWindowRequest> request = new DefaultRequest<UpdateMaintenanceWindowRequest>(
                updateMaintenanceWindowRequest, "AmazonSimpleSystemsManager(SSM)");
        String target = "AmazonSSM.UpdateMaintenanceWindow";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateMaintenanceWindowRequest.getWindowId() != null) {
                String windowId = updateMaintenanceWindowRequest.getWindowId();
                jsonWriter.name("WindowId");
                jsonWriter.value(windowId);
            }
            if (updateMaintenanceWindowRequest.getName() != null) {
                String name = updateMaintenanceWindowRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateMaintenanceWindowRequest.getDescription() != null) {
                String description = updateMaintenanceWindowRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (updateMaintenanceWindowRequest.getStartDate() != null) {
                String startDate = updateMaintenanceWindowRequest.getStartDate();
                jsonWriter.name("StartDate");
                jsonWriter.value(startDate);
            }
            if (updateMaintenanceWindowRequest.getEndDate() != null) {
                String endDate = updateMaintenanceWindowRequest.getEndDate();
                jsonWriter.name("EndDate");
                jsonWriter.value(endDate);
            }
            if (updateMaintenanceWindowRequest.getSchedule() != null) {
                String schedule = updateMaintenanceWindowRequest.getSchedule();
                jsonWriter.name("Schedule");
                jsonWriter.value(schedule);
            }
            if (updateMaintenanceWindowRequest.getScheduleTimezone() != null) {
                String scheduleTimezone = updateMaintenanceWindowRequest.getScheduleTimezone();
                jsonWriter.name("ScheduleTimezone");
                jsonWriter.value(scheduleTimezone);
            }
            if (updateMaintenanceWindowRequest.getDuration() != null) {
                Integer duration = updateMaintenanceWindowRequest.getDuration();
                jsonWriter.name("Duration");
                jsonWriter.value(duration);
            }
            if (updateMaintenanceWindowRequest.getCutoff() != null) {
                Integer cutoff = updateMaintenanceWindowRequest.getCutoff();
                jsonWriter.name("Cutoff");
                jsonWriter.value(cutoff);
            }
            if (updateMaintenanceWindowRequest.getAllowUnassociatedTargets() != null) {
                Boolean allowUnassociatedTargets = updateMaintenanceWindowRequest
                        .getAllowUnassociatedTargets();
                jsonWriter.name("AllowUnassociatedTargets");
                jsonWriter.value(allowUnassociatedTargets);
            }
            if (updateMaintenanceWindowRequest.getEnabled() != null) {
                Boolean enabled = updateMaintenanceWindowRequest.getEnabled();
                jsonWriter.name("Enabled");
                jsonWriter.value(enabled);
            }
            if (updateMaintenanceWindowRequest.getReplace() != null) {
                Boolean replace = updateMaintenanceWindowRequest.getReplace();
                jsonWriter.name("Replace");
                jsonWriter.value(replace);
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
