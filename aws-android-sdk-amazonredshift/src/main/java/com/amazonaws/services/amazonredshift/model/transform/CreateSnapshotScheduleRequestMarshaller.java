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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CreateSnapshotScheduleRequest
 */
public class CreateSnapshotScheduleRequestMarshaller implements
        Marshaller<Request<CreateSnapshotScheduleRequest>, CreateSnapshotScheduleRequest> {

    public Request<CreateSnapshotScheduleRequest> marshall(
            CreateSnapshotScheduleRequest createSnapshotScheduleRequest) {
        if (createSnapshotScheduleRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateSnapshotScheduleRequest)");
        }

        Request<CreateSnapshotScheduleRequest> request = new DefaultRequest<CreateSnapshotScheduleRequest>(
                createSnapshotScheduleRequest, "AmazonRedshift");
        request.addParameter("Action", "CreateSnapshotSchedule");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (createSnapshotScheduleRequest.getScheduleDefinitions() != null) {
            prefix = "ScheduleDefinitions";
            java.util.List<String> scheduleDefinitions = createSnapshotScheduleRequest
                    .getScheduleDefinitions();
            int scheduleDefinitionsIndex = 1;
            String scheduleDefinitionsPrefix = prefix;
            for (String scheduleDefinitionsItem : scheduleDefinitions) {
                prefix = scheduleDefinitionsPrefix + "." + scheduleDefinitionsIndex;
                if (scheduleDefinitionsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(scheduleDefinitionsItem));
                }
                scheduleDefinitionsIndex++;
            }
            prefix = scheduleDefinitionsPrefix;
        }
        if (createSnapshotScheduleRequest.getScheduleIdentifier() != null) {
            prefix = "ScheduleIdentifier";
            String scheduleIdentifier = createSnapshotScheduleRequest.getScheduleIdentifier();
            request.addParameter(prefix, StringUtils.fromString(scheduleIdentifier));
        }
        if (createSnapshotScheduleRequest.getScheduleDescription() != null) {
            prefix = "ScheduleDescription";
            String scheduleDescription = createSnapshotScheduleRequest.getScheduleDescription();
            request.addParameter(prefix, StringUtils.fromString(scheduleDescription));
        }
        if (createSnapshotScheduleRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createSnapshotScheduleRequest.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (Tag tagsItem : tags) {
                prefix = tagsPrefix + "." + tagsIndex;
                if (tagsItem != null) {
                    TagStaxMarshaller.getInstance().marshall(tagsItem, request, prefix + ".");
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }
        if (createSnapshotScheduleRequest.getDryRun() != null) {
            prefix = "DryRun";
            Boolean dryRun = createSnapshotScheduleRequest.getDryRun();
            request.addParameter(prefix, StringUtils.fromBoolean(dryRun));
        }
        if (createSnapshotScheduleRequest.getNextInvocations() != null) {
            prefix = "NextInvocations";
            Integer nextInvocations = createSnapshotScheduleRequest.getNextInvocations();
            request.addParameter(prefix, StringUtils.fromInteger(nextInvocations));
        }

        return request;
    }
}
