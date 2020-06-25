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
 * JSON marshaller for POJO CsvClassifier
 */
class CsvClassifierJsonMarshaller {

    public void marshall(CsvClassifier csvClassifier, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (csvClassifier.getName() != null) {
            String name = csvClassifier.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (csvClassifier.getCreationTime() != null) {
            java.util.Date creationTime = csvClassifier.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (csvClassifier.getLastUpdated() != null) {
            java.util.Date lastUpdated = csvClassifier.getLastUpdated();
            jsonWriter.name("LastUpdated");
            jsonWriter.value(lastUpdated);
        }
        if (csvClassifier.getVersion() != null) {
            Long version = csvClassifier.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        if (csvClassifier.getDelimiter() != null) {
            String delimiter = csvClassifier.getDelimiter();
            jsonWriter.name("Delimiter");
            jsonWriter.value(delimiter);
        }
        if (csvClassifier.getQuoteSymbol() != null) {
            String quoteSymbol = csvClassifier.getQuoteSymbol();
            jsonWriter.name("QuoteSymbol");
            jsonWriter.value(quoteSymbol);
        }
        if (csvClassifier.getContainsHeader() != null) {
            String containsHeader = csvClassifier.getContainsHeader();
            jsonWriter.name("ContainsHeader");
            jsonWriter.value(containsHeader);
        }
        if (csvClassifier.getHeader() != null) {
            java.util.List<String> header = csvClassifier.getHeader();
            jsonWriter.name("Header");
            jsonWriter.beginArray();
            for (String headerItem : header) {
                if (headerItem != null) {
                    jsonWriter.value(headerItem);
                }
            }
            jsonWriter.endArray();
        }
        if (csvClassifier.getDisableValueTrimming() != null) {
            Boolean disableValueTrimming = csvClassifier.getDisableValueTrimming();
            jsonWriter.name("DisableValueTrimming");
            jsonWriter.value(disableValueTrimming);
        }
        if (csvClassifier.getAllowSingleColumn() != null) {
            Boolean allowSingleColumn = csvClassifier.getAllowSingleColumn();
            jsonWriter.name("AllowSingleColumn");
            jsonWriter.value(allowSingleColumn);
        }
        jsonWriter.endObject();
    }

    private static CsvClassifierJsonMarshaller instance;

    public static CsvClassifierJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CsvClassifierJsonMarshaller();
        return instance;
    }
}
