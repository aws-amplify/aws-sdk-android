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

package com.amazonaws.services.worklink.model.transform;

import com.amazonaws.services.worklink.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO WebsiteCaSummary
 */
class WebsiteCaSummaryJsonMarshaller {

    public void marshall(WebsiteCaSummary websiteCaSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (websiteCaSummary.getWebsiteCaId() != null) {
            String websiteCaId = websiteCaSummary.getWebsiteCaId();
            jsonWriter.name("WebsiteCaId");
            jsonWriter.value(websiteCaId);
        }
        if (websiteCaSummary.getCreatedTime() != null) {
            java.util.Date createdTime = websiteCaSummary.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (websiteCaSummary.getDisplayName() != null) {
            String displayName = websiteCaSummary.getDisplayName();
            jsonWriter.name("DisplayName");
            jsonWriter.value(displayName);
        }
        jsonWriter.endObject();
    }

    private static WebsiteCaSummaryJsonMarshaller instance;

    public static WebsiteCaSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WebsiteCaSummaryJsonMarshaller();
        return instance;
    }
}
