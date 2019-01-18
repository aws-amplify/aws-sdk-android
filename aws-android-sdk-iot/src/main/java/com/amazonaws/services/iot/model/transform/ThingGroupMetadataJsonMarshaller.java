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

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ThingGroupMetadata
 */
class ThingGroupMetadataJsonMarshaller {

    public void marshall(ThingGroupMetadata thingGroupMetadata, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (thingGroupMetadata.getParentGroupName() != null) {
            String parentGroupName = thingGroupMetadata.getParentGroupName();
            jsonWriter.name("parentGroupName");
            jsonWriter.value(parentGroupName);
        }
        if (thingGroupMetadata.getRootToParentThingGroups() != null) {
            java.util.List<GroupNameAndArn> rootToParentThingGroups = thingGroupMetadata
                    .getRootToParentThingGroups();
            jsonWriter.name("rootToParentThingGroups");
            jsonWriter.beginArray();
            for (GroupNameAndArn rootToParentThingGroupsItem : rootToParentThingGroups) {
                if (rootToParentThingGroupsItem != null) {
                    GroupNameAndArnJsonMarshaller.getInstance().marshall(
                            rootToParentThingGroupsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (thingGroupMetadata.getCreationDate() != null) {
            java.util.Date creationDate = thingGroupMetadata.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        jsonWriter.endObject();
    }

    private static ThingGroupMetadataJsonMarshaller instance;

    public static ThingGroupMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ThingGroupMetadataJsonMarshaller();
        return instance;
    }
}
