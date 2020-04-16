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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ThreatIntelIndicator
 */
class ThreatIntelIndicatorJsonMarshaller {

    public void marshall(ThreatIntelIndicator threatIntelIndicator, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (threatIntelIndicator.getType() != null) {
            String type = threatIntelIndicator.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (threatIntelIndicator.getValue() != null) {
            String value = threatIntelIndicator.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        if (threatIntelIndicator.getCategory() != null) {
            String category = threatIntelIndicator.getCategory();
            jsonWriter.name("Category");
            jsonWriter.value(category);
        }
        if (threatIntelIndicator.getLastObservedAt() != null) {
            String lastObservedAt = threatIntelIndicator.getLastObservedAt();
            jsonWriter.name("LastObservedAt");
            jsonWriter.value(lastObservedAt);
        }
        if (threatIntelIndicator.getSource() != null) {
            String source = threatIntelIndicator.getSource();
            jsonWriter.name("Source");
            jsonWriter.value(source);
        }
        if (threatIntelIndicator.getSourceUrl() != null) {
            String sourceUrl = threatIntelIndicator.getSourceUrl();
            jsonWriter.name("SourceUrl");
            jsonWriter.value(sourceUrl);
        }
        jsonWriter.endObject();
    }

    private static ThreatIntelIndicatorJsonMarshaller instance;

    public static ThreatIntelIndicatorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ThreatIntelIndicatorJsonMarshaller();
        return instance;
    }
}
