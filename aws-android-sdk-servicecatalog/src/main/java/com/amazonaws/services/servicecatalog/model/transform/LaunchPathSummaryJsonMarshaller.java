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

package com.amazonaws.services.servicecatalog.model.transform;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LaunchPathSummary
 */
class LaunchPathSummaryJsonMarshaller {

    public void marshall(LaunchPathSummary launchPathSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (launchPathSummary.getId() != null) {
            String id = launchPathSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (launchPathSummary.getConstraintSummaries() != null) {
            java.util.List<ConstraintSummary> constraintSummaries = launchPathSummary
                    .getConstraintSummaries();
            jsonWriter.name("ConstraintSummaries");
            jsonWriter.beginArray();
            for (ConstraintSummary constraintSummariesItem : constraintSummaries) {
                if (constraintSummariesItem != null) {
                    ConstraintSummaryJsonMarshaller.getInstance().marshall(constraintSummariesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (launchPathSummary.getTags() != null) {
            java.util.List<Tag> tags = launchPathSummary.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (launchPathSummary.getName() != null) {
            String name = launchPathSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        jsonWriter.endObject();
    }

    private static LaunchPathSummaryJsonMarshaller instance;

    public static LaunchPathSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchPathSummaryJsonMarshaller();
        return instance;
    }
}
