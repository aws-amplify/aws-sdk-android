/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO WarningsListItem
 */
class WarningsListItemJsonMarshaller {

    public void marshall(WarningsListItem warningsListItem, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (warningsListItem.getPage() != null) {
            Integer page = warningsListItem.getPage();
            jsonWriter.name("Page");
            jsonWriter.value(page);
        }
        if (warningsListItem.getWarnCode() != null) {
            String warnCode = warningsListItem.getWarnCode();
            jsonWriter.name("WarnCode");
            jsonWriter.value(warnCode);
        }
        if (warningsListItem.getWarnMessage() != null) {
            String warnMessage = warningsListItem.getWarnMessage();
            jsonWriter.name("WarnMessage");
            jsonWriter.value(warnMessage);
        }
        jsonWriter.endObject();
    }

    private static WarningsListItemJsonMarshaller instance;

    public static WarningsListItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WarningsListItemJsonMarshaller();
        return instance;
    }
}
