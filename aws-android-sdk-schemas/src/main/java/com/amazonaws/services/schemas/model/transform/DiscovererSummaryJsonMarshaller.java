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

package com.amazonaws.services.schemas.model.transform;

import com.amazonaws.services.schemas.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DiscovererSummary
 */
class DiscovererSummaryJsonMarshaller {

    public void marshall(DiscovererSummary discovererSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (discovererSummary.getDiscovererArn() != null) {
            String discovererArn = discovererSummary.getDiscovererArn();
            jsonWriter.name("DiscovererArn");
            jsonWriter.value(discovererArn);
        }
        if (discovererSummary.getDiscovererId() != null) {
            String discovererId = discovererSummary.getDiscovererId();
            jsonWriter.name("DiscovererId");
            jsonWriter.value(discovererId);
        }
        if (discovererSummary.getSourceArn() != null) {
            String sourceArn = discovererSummary.getSourceArn();
            jsonWriter.name("SourceArn");
            jsonWriter.value(sourceArn);
        }
        if (discovererSummary.getState() != null) {
            String state = discovererSummary.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (discovererSummary.getTags() != null) {
            java.util.Map<String, String> tags = discovererSummary.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static DiscovererSummaryJsonMarshaller instance;

    public static DiscovererSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DiscovererSummaryJsonMarshaller();
        return instance;
    }
}
