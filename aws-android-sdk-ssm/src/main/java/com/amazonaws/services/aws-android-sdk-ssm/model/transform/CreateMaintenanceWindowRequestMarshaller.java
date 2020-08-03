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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

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
import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;


/**
 * JSON request marshaller for CreateMaintenanceWindowRequest
 */
public class CreateMaintenanceWindowRequestMarshaller implements Marshaller<Request<CreateMaintenanceWindowRequest>, CreateMaintenanceWindowRequest> {

    public Request<CreateMaintenanceWindowRequest> marshall(CreateMaintenanceWindowRequest createMaintenanceWindowRequest) {
        if (createMaintenanceWindowRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(CreateMaintenanceWindowRequest)");
        }

        Request<CreateMaintenanceWindowRequest> request = new DefaultRequest<CreateMaintenanceWindowRequest>(createMaintenanceWindowRequest, "AmazonSimpleSystemsManager(SSM)");
        String target = "AmazonSSM.CreateMaintenanceWindow";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createMaintenanceWindowRequest.getName() != null) {
                String name = createMaintenanceWindowRequest.getName();
                jsonWriter.name("Name");
            jsonWriter.value(name);
            }
            if (createMaintenanceWindowRequest.getDescription() != null) {
                String description = createMaintenanceWindowRequest.getDescription();
                jsonWriter.name("Description");
            jsonWriter.value(description);
            }
            if (createMaintenanceWindowRequest.getStartDate() != null) {
                String startDate = createMaintenanceWindowRequest.getStartDate();
                jsonWriter.name("StartDate");
            jsonWriter.value(startDate);
            }
            if (createMaintenanceWindowRequest.getEndDate() != null) {
                String endDate = createMaintenanceWindowRequest.getEndDate();
                jsonWriter.name("EndDate");
            jsonWriter.value(endDate);
            }
            if (createMaintenanceWindowRequest.getSchedule() != null) {
                String schedule = createMaintenanceWindowRequest.getSchedule();
                jsonWriter.name("Schedule");
            jsonWriter.value(schedule);
            }
            if (createMaintenanceWindowRequest.getScheduleTimezone() != null) {
                String scheduleTimezone = createMaintenanceWindowRequest.getScheduleTimezone();
                jsonWriter.name("ScheduleTimezone");
            jsonWriter.value(scheduleTimezone);
            }
            if (createMaintenanceWindowRequest.getScheduleOffset() != null) {
                Integer scheduleOffset = createMaintenanceWindowRequest.getScheduleOffset();
                jsonWriter.name("ScheduleOffset");
            jsonWriter.value(scheduleOffset);
            }
            if (createMaintenanceWindowRequest.getDuration() != null) {
                Integer duration = createMaintenanceWindowRequest.getDuration();
                jsonWriter.name("Duration");
            jsonWriter.value(duration);
            }
            if (createMaintenanceWindowRequest.getCutoff() != null) {
                Integer cutoff = createMaintenanceWindowRequest.getCutoff();
                jsonWriter.name("Cutoff");
            jsonWriter.value(cutoff);
            }
            if (createMaintenanceWindowRequest.getAllowUnassociatedTargets() != null) {
                Boolean allowUnassociatedTargets = createMaintenanceWindowRequest.getAllowUnassociatedTargets();
                jsonWriter.name("AllowUnassociatedTargets");
            jsonWriter.value(allowUnassociatedTargets);
            }
            if (createMaintenanceWindowRequest.getClientToken() != null) {
                String clientToken = createMaintenanceWindowRequest.getClientToken();
                jsonWriter.name("ClientToken");
            jsonWriter.value(clientToken);
            }
            if (createMaintenanceWindowRequest.getTags() != null) {
                java.util.List<Tag> tags = createMaintenanceWindowRequest.getTags();
                jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
            TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
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
        } catch(Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
