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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Classifier
 */
class ClassifierJsonMarshaller {

    public void marshall(Classifier classifier, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (classifier.getGrokClassifier() != null) {
            GrokClassifier grokClassifier = classifier.getGrokClassifier();
            jsonWriter.name("GrokClassifier");
            GrokClassifierJsonMarshaller.getInstance().marshall(grokClassifier, jsonWriter);
        }
        if (classifier.getXMLClassifier() != null) {
            XMLClassifier xMLClassifier = classifier.getXMLClassifier();
            jsonWriter.name("XMLClassifier");
            XMLClassifierJsonMarshaller.getInstance().marshall(xMLClassifier, jsonWriter);
        }
        if (classifier.getJsonClassifier() != null) {
            JsonClassifier jsonClassifier = classifier.getJsonClassifier();
            jsonWriter.name("JsonClassifier");
            JsonClassifierJsonMarshaller.getInstance().marshall(jsonClassifier, jsonWriter);
        }
        if (classifier.getCsvClassifier() != null) {
            CsvClassifier csvClassifier = classifier.getCsvClassifier();
            jsonWriter.name("CsvClassifier");
            CsvClassifierJsonMarshaller.getInstance().marshall(csvClassifier, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ClassifierJsonMarshaller instance;

    public static ClassifierJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClassifierJsonMarshaller();
        return instance;
    }
}
