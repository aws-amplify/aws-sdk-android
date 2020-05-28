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

package com.amazonaws.services.catalog.marketplace.model.transform;

import com.amazonaws.services.catalog.marketplace.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ChangeSetSummaryListItem
 */
class ChangeSetSummaryListItemJsonMarshaller {

    public void marshall(ChangeSetSummaryListItem changeSetSummaryListItem, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (changeSetSummaryListItem.getChangeSetId() != null) {
            String changeSetId = changeSetSummaryListItem.getChangeSetId();
            jsonWriter.name("ChangeSetId");
            jsonWriter.value(changeSetId);
        }
        if (changeSetSummaryListItem.getChangeSetArn() != null) {
            String changeSetArn = changeSetSummaryListItem.getChangeSetArn();
            jsonWriter.name("ChangeSetArn");
            jsonWriter.value(changeSetArn);
        }
        if (changeSetSummaryListItem.getChangeSetName() != null) {
            String changeSetName = changeSetSummaryListItem.getChangeSetName();
            jsonWriter.name("ChangeSetName");
            jsonWriter.value(changeSetName);
        }
        if (changeSetSummaryListItem.getStartTime() != null) {
            String startTime = changeSetSummaryListItem.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (changeSetSummaryListItem.getEndTime() != null) {
            String endTime = changeSetSummaryListItem.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (changeSetSummaryListItem.getStatus() != null) {
            String status = changeSetSummaryListItem.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (changeSetSummaryListItem.getEntityIdList() != null) {
            java.util.List<String> entityIdList = changeSetSummaryListItem.getEntityIdList();
            jsonWriter.name("EntityIdList");
            jsonWriter.beginArray();
            for (String entityIdListItem : entityIdList) {
                if (entityIdListItem != null) {
                    jsonWriter.value(entityIdListItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ChangeSetSummaryListItemJsonMarshaller instance;

    public static ChangeSetSummaryListItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChangeSetSummaryListItemJsonMarshaller();
        return instance;
    }
}
