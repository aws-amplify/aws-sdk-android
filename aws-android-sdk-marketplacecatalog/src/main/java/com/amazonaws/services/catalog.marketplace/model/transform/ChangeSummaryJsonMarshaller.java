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
 * JSON marshaller for POJO ChangeSummary
 */
class ChangeSummaryJsonMarshaller {

    public void marshall(ChangeSummary changeSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (changeSummary.getChangeType() != null) {
            String changeType = changeSummary.getChangeType();
            jsonWriter.name("ChangeType");
            jsonWriter.value(changeType);
        }
        if (changeSummary.getEntity() != null) {
            Entity entity = changeSummary.getEntity();
            jsonWriter.name("Entity");
            EntityJsonMarshaller.getInstance().marshall(entity, jsonWriter);
        }
        if (changeSummary.getDetails() != null) {
            String details = changeSummary.getDetails();
            jsonWriter.name("Details");
            jsonWriter.value(details);
        }
        if (changeSummary.getErrorDetailList() != null) {
            java.util.List<ErrorDetail> errorDetailList = changeSummary.getErrorDetailList();
            jsonWriter.name("ErrorDetailList");
            jsonWriter.beginArray();
            for (ErrorDetail errorDetailListItem : errorDetailList) {
                if (errorDetailListItem != null) {
                    ErrorDetailJsonMarshaller.getInstance().marshall(errorDetailListItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ChangeSummaryJsonMarshaller instance;

    public static ChangeSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChangeSummaryJsonMarshaller();
        return instance;
    }
}
