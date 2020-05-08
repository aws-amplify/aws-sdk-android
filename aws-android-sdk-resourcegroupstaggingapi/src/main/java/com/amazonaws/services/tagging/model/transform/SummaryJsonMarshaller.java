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

package com.amazonaws.services.tagging.model.transform;

import com.amazonaws.services.tagging.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Summary
 */
class SummaryJsonMarshaller {

    public void marshall(Summary summary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (summary.getLastUpdated() != null) {
            String lastUpdated = summary.getLastUpdated();
            jsonWriter.name("LastUpdated");
            jsonWriter.value(lastUpdated);
        }
        if (summary.getTargetId() != null) {
            String targetId = summary.getTargetId();
            jsonWriter.name("TargetId");
            jsonWriter.value(targetId);
        }
        if (summary.getTargetIdType() != null) {
            String targetIdType = summary.getTargetIdType();
            jsonWriter.name("TargetIdType");
            jsonWriter.value(targetIdType);
        }
        if (summary.getRegion() != null) {
            String region = summary.getRegion();
            jsonWriter.name("Region");
            jsonWriter.value(region);
        }
        if (summary.getResourceType() != null) {
            String resourceType = summary.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        if (summary.getNonCompliantResources() != null) {
            Long nonCompliantResources = summary.getNonCompliantResources();
            jsonWriter.name("NonCompliantResources");
            jsonWriter.value(nonCompliantResources);
        }
        jsonWriter.endObject();
    }

    private static SummaryJsonMarshaller instance;

    public static SummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SummaryJsonMarshaller();
        return instance;
    }
}
