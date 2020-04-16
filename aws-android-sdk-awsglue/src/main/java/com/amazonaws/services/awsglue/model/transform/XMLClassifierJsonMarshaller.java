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
 * JSON marshaller for POJO XMLClassifier
 */
class XMLClassifierJsonMarshaller {

    public void marshall(XMLClassifier xMLClassifier, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (xMLClassifier.getName() != null) {
            String name = xMLClassifier.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (xMLClassifier.getClassification() != null) {
            String classification = xMLClassifier.getClassification();
            jsonWriter.name("Classification");
            jsonWriter.value(classification);
        }
        if (xMLClassifier.getCreationTime() != null) {
            java.util.Date creationTime = xMLClassifier.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (xMLClassifier.getLastUpdated() != null) {
            java.util.Date lastUpdated = xMLClassifier.getLastUpdated();
            jsonWriter.name("LastUpdated");
            jsonWriter.value(lastUpdated);
        }
        if (xMLClassifier.getVersion() != null) {
            Long version = xMLClassifier.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        if (xMLClassifier.getRowTag() != null) {
            String rowTag = xMLClassifier.getRowTag();
            jsonWriter.name("RowTag");
            jsonWriter.value(rowTag);
        }
        jsonWriter.endObject();
    }

    private static XMLClassifierJsonMarshaller instance;

    public static XMLClassifierJsonMarshaller getInstance() {
        if (instance == null)
            instance = new XMLClassifierJsonMarshaller();
        return instance;
    }
}
