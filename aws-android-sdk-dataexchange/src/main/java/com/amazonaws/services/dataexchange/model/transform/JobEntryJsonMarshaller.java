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

package com.amazonaws.services.dataexchange.model.transform;

import com.amazonaws.services.dataexchange.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JobEntry
 */
class JobEntryJsonMarshaller {

    public void marshall(JobEntry jobEntry, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (jobEntry.getArn() != null) {
            String arn = jobEntry.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (jobEntry.getCreatedAt() != null) {
            java.util.Date createdAt = jobEntry.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.value(createdAt);
        }
        if (jobEntry.getDetails() != null) {
            ResponseDetails details = jobEntry.getDetails();
            jsonWriter.name("Details");
            ResponseDetailsJsonMarshaller.getInstance().marshall(details, jsonWriter);
        }
        if (jobEntry.getErrors() != null) {
            java.util.List<JobError> errors = jobEntry.getErrors();
            jsonWriter.name("Errors");
            jsonWriter.beginArray();
            for (JobError errorsItem : errors) {
                if (errorsItem != null) {
                    JobErrorJsonMarshaller.getInstance().marshall(errorsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (jobEntry.getId() != null) {
            String id = jobEntry.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (jobEntry.getState() != null) {
            String state = jobEntry.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (jobEntry.getType() != null) {
            String type = jobEntry.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (jobEntry.getUpdatedAt() != null) {
            java.util.Date updatedAt = jobEntry.getUpdatedAt();
            jsonWriter.name("UpdatedAt");
            jsonWriter.value(updatedAt);
        }
        jsonWriter.endObject();
    }

    private static JobEntryJsonMarshaller instance;

    public static JobEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobEntryJsonMarshaller();
        return instance;
    }
}
