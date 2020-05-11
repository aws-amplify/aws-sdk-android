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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FaqSummary
 */
class FaqSummaryJsonMarshaller {

    public void marshall(FaqSummary faqSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (faqSummary.getId() != null) {
            String id = faqSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (faqSummary.getName() != null) {
            String name = faqSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (faqSummary.getStatus() != null) {
            String status = faqSummary.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (faqSummary.getCreatedAt() != null) {
            java.util.Date createdAt = faqSummary.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.value(createdAt);
        }
        if (faqSummary.getUpdatedAt() != null) {
            java.util.Date updatedAt = faqSummary.getUpdatedAt();
            jsonWriter.name("UpdatedAt");
            jsonWriter.value(updatedAt);
        }
        jsonWriter.endObject();
    }

    private static FaqSummaryJsonMarshaller instance;

    public static FaqSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FaqSummaryJsonMarshaller();
        return instance;
    }
}
