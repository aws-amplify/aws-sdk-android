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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PlacementGroup
 */
class PlacementGroupJsonMarshaller {

    public void marshall(PlacementGroup placementGroup, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (placementGroup.getGroupName() != null) {
            String groupName = placementGroup.getGroupName();
            jsonWriter.name("GroupName");
            jsonWriter.value(groupName);
        }
        if (placementGroup.getState() != null) {
            String state = placementGroup.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (placementGroup.getStrategy() != null) {
            String strategy = placementGroup.getStrategy();
            jsonWriter.name("Strategy");
            jsonWriter.value(strategy);
        }
        if (placementGroup.getPartitionCount() != null) {
            Integer partitionCount = placementGroup.getPartitionCount();
            jsonWriter.name("PartitionCount");
            jsonWriter.value(partitionCount);
        }
        if (placementGroup.getGroupId() != null) {
            String groupId = placementGroup.getGroupId();
            jsonWriter.name("GroupId");
            jsonWriter.value(groupId);
        }
        if (placementGroup.getTags() != null) {
            java.util.List<Tag> tags = placementGroup.getTags();
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
    }

    private static PlacementGroupJsonMarshaller instance;

    public static PlacementGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PlacementGroupJsonMarshaller();
        return instance;
    }
}
