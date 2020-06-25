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
 * JSON marshaller for POJO CreateCsvClassifierRequest
 */
class CreateCsvClassifierRequestJsonMarshaller {

    public void marshall(CreateCsvClassifierRequest createCsvClassifierRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (createCsvClassifierRequest.getName() != null) {
            String name = createCsvClassifierRequest.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (createCsvClassifierRequest.getDelimiter() != null) {
            String delimiter = createCsvClassifierRequest.getDelimiter();
            jsonWriter.name("Delimiter");
            jsonWriter.value(delimiter);
        }
        if (createCsvClassifierRequest.getQuoteSymbol() != null) {
            String quoteSymbol = createCsvClassifierRequest.getQuoteSymbol();
            jsonWriter.name("QuoteSymbol");
            jsonWriter.value(quoteSymbol);
        }
        if (createCsvClassifierRequest.getContainsHeader() != null) {
            String containsHeader = createCsvClassifierRequest.getContainsHeader();
            jsonWriter.name("ContainsHeader");
            jsonWriter.value(containsHeader);
        }
        if (createCsvClassifierRequest.getHeader() != null) {
            java.util.List<String> header = createCsvClassifierRequest.getHeader();
            jsonWriter.name("Header");
            jsonWriter.beginArray();
            for (String headerItem : header) {
                if (headerItem != null) {
                    jsonWriter.value(headerItem);
                }
            }
            jsonWriter.endArray();
        }
        if (createCsvClassifierRequest.getDisableValueTrimming() != null) {
            Boolean disableValueTrimming = createCsvClassifierRequest.getDisableValueTrimming();
            jsonWriter.name("DisableValueTrimming");
            jsonWriter.value(disableValueTrimming);
        }
        if (createCsvClassifierRequest.getAllowSingleColumn() != null) {
            Boolean allowSingleColumn = createCsvClassifierRequest.getAllowSingleColumn();
            jsonWriter.name("AllowSingleColumn");
            jsonWriter.value(allowSingleColumn);
        }
        jsonWriter.endObject();
    }

    private static CreateCsvClassifierRequestJsonMarshaller instance;

    public static CreateCsvClassifierRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreateCsvClassifierRequestJsonMarshaller();
        return instance;
    }
}
