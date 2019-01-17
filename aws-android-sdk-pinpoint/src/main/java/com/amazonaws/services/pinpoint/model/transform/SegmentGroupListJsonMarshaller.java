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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SegmentGroupList
 */
class SegmentGroupListJsonMarshaller {

    public void marshall(SegmentGroupList segmentGroupList, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (segmentGroupList.getGroups() != null) {
            java.util.List<SegmentGroup> groups = segmentGroupList.getGroups();
            jsonWriter.name("Groups");
            jsonWriter.beginArray();
            for (SegmentGroup groupsItem : groups) {
                if (groupsItem != null) {
                    SegmentGroupJsonMarshaller.getInstance().marshall(groupsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (segmentGroupList.getInclude() != null) {
            String include = segmentGroupList.getInclude();
            jsonWriter.name("Include");
            jsonWriter.value(include);
        }
        jsonWriter.endObject();
    }

    private static SegmentGroupListJsonMarshaller instance;

    public static SegmentGroupListJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SegmentGroupListJsonMarshaller();
        return instance;
    }
}
