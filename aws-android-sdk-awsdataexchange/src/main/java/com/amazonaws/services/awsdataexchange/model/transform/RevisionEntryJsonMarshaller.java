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

package com.amazonaws.services.awsdataexchange.model.transform;

import com.amazonaws.services.awsdataexchange.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RevisionEntry
 */
class RevisionEntryJsonMarshaller {

    public void marshall(RevisionEntry revisionEntry, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (revisionEntry.getArn() != null) {
            String arn = revisionEntry.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (revisionEntry.getComment() != null) {
            String comment = revisionEntry.getComment();
            jsonWriter.name("Comment");
            jsonWriter.value(comment);
        }
        if (revisionEntry.getCreatedAt() != null) {
            java.util.Date createdAt = revisionEntry.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.value(createdAt);
        }
        if (revisionEntry.getDataSetId() != null) {
            String dataSetId = revisionEntry.getDataSetId();
            jsonWriter.name("DataSetId");
            jsonWriter.value(dataSetId);
        }
        if (revisionEntry.getFinalized() != null) {
            Boolean finalized = revisionEntry.getFinalized();
            jsonWriter.name("Finalized");
            jsonWriter.value(finalized);
        }
        if (revisionEntry.getId() != null) {
            String id = revisionEntry.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (revisionEntry.getSourceId() != null) {
            String sourceId = revisionEntry.getSourceId();
            jsonWriter.name("SourceId");
            jsonWriter.value(sourceId);
        }
        if (revisionEntry.getUpdatedAt() != null) {
            java.util.Date updatedAt = revisionEntry.getUpdatedAt();
            jsonWriter.name("UpdatedAt");
            jsonWriter.value(updatedAt);
        }
        jsonWriter.endObject();
    }

    private static RevisionEntryJsonMarshaller instance;

    public static RevisionEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RevisionEntryJsonMarshaller();
        return instance;
    }
}
