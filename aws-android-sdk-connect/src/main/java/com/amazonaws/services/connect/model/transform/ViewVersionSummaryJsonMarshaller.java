/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ViewVersionSummary
 */
class ViewVersionSummaryJsonMarshaller {

    public void marshall(ViewVersionSummary viewVersionSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (viewVersionSummary.getId() != null) {
            String id = viewVersionSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (viewVersionSummary.getArn() != null) {
            String arn = viewVersionSummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (viewVersionSummary.getDescription() != null) {
            String description = viewVersionSummary.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (viewVersionSummary.getName() != null) {
            String name = viewVersionSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (viewVersionSummary.getType() != null) {
            String type = viewVersionSummary.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (viewVersionSummary.getVersion() != null) {
            Integer version = viewVersionSummary.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        if (viewVersionSummary.getVersionDescription() != null) {
            String versionDescription = viewVersionSummary.getVersionDescription();
            jsonWriter.name("VersionDescription");
            jsonWriter.value(versionDescription);
        }
        jsonWriter.endObject();
    }

    private static ViewVersionSummaryJsonMarshaller instance;

    public static ViewVersionSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ViewVersionSummaryJsonMarshaller();
        return instance;
    }
}
