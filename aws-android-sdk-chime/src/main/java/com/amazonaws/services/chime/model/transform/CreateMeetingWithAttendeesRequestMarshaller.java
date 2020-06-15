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

package com.amazonaws.services.chime.model.transform;

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
import com.amazonaws.services.chime.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateMeetingWithAttendeesRequest
 */
public class CreateMeetingWithAttendeesRequestMarshaller implements
        Marshaller<Request<CreateMeetingWithAttendeesRequest>, CreateMeetingWithAttendeesRequest> {

    public Request<CreateMeetingWithAttendeesRequest> marshall(
            CreateMeetingWithAttendeesRequest createMeetingWithAttendeesRequest) {
        if (createMeetingWithAttendeesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateMeetingWithAttendeesRequest)");
        }

        Request<CreateMeetingWithAttendeesRequest> request = new DefaultRequest<CreateMeetingWithAttendeesRequest>(
                createMeetingWithAttendeesRequest, "AmazonChime");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/meetings?operation&#x3D;create-attendees";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createMeetingWithAttendeesRequest.getClientRequestToken() != null) {
                String clientRequestToken = createMeetingWithAttendeesRequest
                        .getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
            }
            if (createMeetingWithAttendeesRequest.getExternalMeetingId() != null) {
                String externalMeetingId = createMeetingWithAttendeesRequest.getExternalMeetingId();
                jsonWriter.name("ExternalMeetingId");
                jsonWriter.value(externalMeetingId);
            }
            if (createMeetingWithAttendeesRequest.getMeetingHostId() != null) {
                String meetingHostId = createMeetingWithAttendeesRequest.getMeetingHostId();
                jsonWriter.name("MeetingHostId");
                jsonWriter.value(meetingHostId);
            }
            if (createMeetingWithAttendeesRequest.getMediaRegion() != null) {
                String mediaRegion = createMeetingWithAttendeesRequest.getMediaRegion();
                jsonWriter.name("MediaRegion");
                jsonWriter.value(mediaRegion);
            }
            if (createMeetingWithAttendeesRequest.getTags() != null) {
                java.util.List<Tag> tags = createMeetingWithAttendeesRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createMeetingWithAttendeesRequest.getNotificationsConfiguration() != null) {
                MeetingNotificationConfiguration notificationsConfiguration = createMeetingWithAttendeesRequest
                        .getNotificationsConfiguration();
                jsonWriter.name("NotificationsConfiguration");
                MeetingNotificationConfigurationJsonMarshaller.getInstance().marshall(
                        notificationsConfiguration, jsonWriter);
            }
            if (createMeetingWithAttendeesRequest.getAttendees() != null) {
                java.util.List<CreateAttendeeRequestItem> attendees = createMeetingWithAttendeesRequest
                        .getAttendees();
                jsonWriter.name("Attendees");
                jsonWriter.beginArray();
                for (CreateAttendeeRequestItem attendeesItem : attendees) {
                    if (attendeesItem != null) {
                        CreateAttendeeRequestItemJsonMarshaller.getInstance().marshall(
                                attendeesItem, jsonWriter);
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
