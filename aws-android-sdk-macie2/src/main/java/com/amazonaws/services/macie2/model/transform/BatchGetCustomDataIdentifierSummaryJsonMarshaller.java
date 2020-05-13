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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BatchGetCustomDataIdentifierSummary
 */
class BatchGetCustomDataIdentifierSummaryJsonMarshaller {

    public void marshall(BatchGetCustomDataIdentifierSummary batchGetCustomDataIdentifierSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (batchGetCustomDataIdentifierSummary.getArn() != null) {
            String arn = batchGetCustomDataIdentifierSummary.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (batchGetCustomDataIdentifierSummary.getCreatedAt() != null) {
            java.util.Date createdAt = batchGetCustomDataIdentifierSummary.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (batchGetCustomDataIdentifierSummary.getDeleted() != null) {
            Boolean deleted = batchGetCustomDataIdentifierSummary.getDeleted();
            jsonWriter.name("deleted");
            jsonWriter.value(deleted);
        }
        if (batchGetCustomDataIdentifierSummary.getDescription() != null) {
            String description = batchGetCustomDataIdentifierSummary.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (batchGetCustomDataIdentifierSummary.getId() != null) {
            String id = batchGetCustomDataIdentifierSummary.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (batchGetCustomDataIdentifierSummary.getName() != null) {
            String name = batchGetCustomDataIdentifierSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        jsonWriter.endObject();
    }

    private static BatchGetCustomDataIdentifierSummaryJsonMarshaller instance;

    public static BatchGetCustomDataIdentifierSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchGetCustomDataIdentifierSummaryJsonMarshaller();
        return instance;
    }
}
