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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO GrokClassifier
 */
class GrokClassifierJsonMarshaller {

    public void marshall(GrokClassifier grokClassifier, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (grokClassifier.getName() != null) {
            String name = grokClassifier.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (grokClassifier.getClassification() != null) {
            String classification = grokClassifier.getClassification();
            jsonWriter.name("Classification");
            jsonWriter.value(classification);
        }
        if (grokClassifier.getCreationTime() != null) {
            java.util.Date creationTime = grokClassifier.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (grokClassifier.getLastUpdated() != null) {
            java.util.Date lastUpdated = grokClassifier.getLastUpdated();
            jsonWriter.name("LastUpdated");
            jsonWriter.value(lastUpdated);
        }
        if (grokClassifier.getVersion() != null) {
            Long version = grokClassifier.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        if (grokClassifier.getGrokPattern() != null) {
            String grokPattern = grokClassifier.getGrokPattern();
            jsonWriter.name("GrokPattern");
            jsonWriter.value(grokPattern);
        }
        if (grokClassifier.getCustomPatterns() != null) {
            String customPatterns = grokClassifier.getCustomPatterns();
            jsonWriter.name("CustomPatterns");
            jsonWriter.value(customPatterns);
        }
        jsonWriter.endObject();
    }

    private static GrokClassifierJsonMarshaller instance;

    public static GrokClassifierJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GrokClassifierJsonMarshaller();
        return instance;
    }
}
