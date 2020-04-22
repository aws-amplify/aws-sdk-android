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

import com.amazonaws.Request;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO SnapshotSchedule
 */
class SnapshotScheduleStaxMarshaller {

    public void marshall(SnapshotSchedule _snapshotSchedule, Request<?> request, String _prefix) {
        String prefix;
        if (_snapshotSchedule.getScheduleDefinitions() != null) {
            prefix = _prefix + "ScheduleDefinitions";
            java.util.List<String> scheduleDefinitions = _snapshotSchedule.getScheduleDefinitions();
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
        if (_snapshotSchedule.getScheduleIdentifier() != null) {
            prefix = _prefix + "ScheduleIdentifier";
            String scheduleIdentifier = _snapshotSchedule.getScheduleIdentifier();
            request.addParameter(prefix, StringUtils.fromString(scheduleIdentifier));
        }
        if (_snapshotSchedule.getScheduleDescription() != null) {
            prefix = _prefix + "ScheduleDescription";
            String scheduleDescription = _snapshotSchedule.getScheduleDescription();
            request.addParameter(prefix, StringUtils.fromString(scheduleDescription));
        }
        if (_snapshotSchedule.getTags() != null) {
            prefix = _prefix + "Tags";
            java.util.List<Tag> tags = _snapshotSchedule.getTags();
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
        if (_snapshotSchedule.getNextInvocations() != null) {
            prefix = _prefix + "NextInvocations";
            java.util.List<java.util.Date> nextInvocations = _snapshotSchedule.getNextInvocations();
            int nextInvocationsIndex = 1;
            String nextInvocationsPrefix = prefix;
            for (java.util.Date nextInvocationsItem : nextInvocations) {
                prefix = nextInvocationsPrefix + "." + nextInvocationsIndex;
                if (nextInvocationsItem != null) {
                    request.addParameter(prefix, StringUtils.fromDate(nextInvocationsItem));
                }
                nextInvocationsIndex++;
            }
            prefix = nextInvocationsPrefix;
        }
        if (_snapshotSchedule.getAssociatedClusterCount() != null) {
            prefix = _prefix + "AssociatedClusterCount";
            Integer associatedClusterCount = _snapshotSchedule.getAssociatedClusterCount();
            request.addParameter(prefix, StringUtils.fromInteger(associatedClusterCount));
        }
        if (_snapshotSchedule.getAssociatedClusters() != null) {
            prefix = _prefix + "AssociatedClusters";
            java.util.List<ClusterAssociatedToSchedule> associatedClusters = _snapshotSchedule
                    .getAssociatedClusters();
            int associatedClustersIndex = 1;
            String associatedClustersPrefix = prefix;
            for (ClusterAssociatedToSchedule associatedClustersItem : associatedClusters) {
                prefix = associatedClustersPrefix + "." + associatedClustersIndex;
                if (associatedClustersItem != null) {
                    ClusterAssociatedToScheduleStaxMarshaller.getInstance().marshall(
                            associatedClustersItem, request, prefix + ".");
                }
                associatedClustersIndex++;
            }
            prefix = associatedClustersPrefix;
        }
    }

    private static SnapshotScheduleStaxMarshaller instance;

    public static SnapshotScheduleStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SnapshotScheduleStaxMarshaller();
        return instance;
    }
}
