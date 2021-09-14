/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DocumentReaderConfig
 */
class DocumentReaderConfigJsonMarshaller {

    public void marshall(DocumentReaderConfig documentReaderConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (documentReaderConfig.getDocumentReadAction() != null) {
            String documentReadAction = documentReaderConfig.getDocumentReadAction();
            jsonWriter.name("DocumentReadAction");
            jsonWriter.value(documentReadAction);
        }
        if (documentReaderConfig.getDocumentReadMode() != null) {
            String documentReadMode = documentReaderConfig.getDocumentReadMode();
            jsonWriter.name("DocumentReadMode");
            jsonWriter.value(documentReadMode);
        }
        if (documentReaderConfig.getFeatureTypes() != null) {
            java.util.List<String> featureTypes = documentReaderConfig.getFeatureTypes();
            jsonWriter.name("FeatureTypes");
            jsonWriter.beginArray();
            for (String featureTypesItem : featureTypes) {
                if (featureTypesItem != null) {
                    jsonWriter.value(featureTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static DocumentReaderConfigJsonMarshaller instance;

    public static DocumentReaderConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DocumentReaderConfigJsonMarshaller();
        return instance;
    }
}
