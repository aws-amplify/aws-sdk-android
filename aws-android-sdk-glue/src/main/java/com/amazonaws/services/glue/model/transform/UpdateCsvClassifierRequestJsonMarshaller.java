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
 * JSON marshaller for POJO UpdateCsvClassifierRequest
 */
class UpdateCsvClassifierRequestJsonMarshaller {

    public void marshall(UpdateCsvClassifierRequest updateCsvClassifierRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (updateCsvClassifierRequest.getName() != null) {
            String name = updateCsvClassifierRequest.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (updateCsvClassifierRequest.getDelimiter() != null) {
            String delimiter = updateCsvClassifierRequest.getDelimiter();
            jsonWriter.name("Delimiter");
            jsonWriter.value(delimiter);
        }
        if (updateCsvClassifierRequest.getQuoteSymbol() != null) {
            String quoteSymbol = updateCsvClassifierRequest.getQuoteSymbol();
            jsonWriter.name("QuoteSymbol");
            jsonWriter.value(quoteSymbol);
        }
        if (updateCsvClassifierRequest.getContainsHeader() != null) {
            String containsHeader = updateCsvClassifierRequest.getContainsHeader();
            jsonWriter.name("ContainsHeader");
            jsonWriter.value(containsHeader);
        }
        if (updateCsvClassifierRequest.getHeader() != null) {
            java.util.List<String> header = updateCsvClassifierRequest.getHeader();
            jsonWriter.name("Header");
            jsonWriter.beginArray();
            for (String headerItem : header) {
                if (headerItem != null) {
                    jsonWriter.value(headerItem);
                }
            }
            jsonWriter.endArray();
        }
        if (updateCsvClassifierRequest.getDisableValueTrimming() != null) {
            Boolean disableValueTrimming = updateCsvClassifierRequest.getDisableValueTrimming();
            jsonWriter.name("DisableValueTrimming");
            jsonWriter.value(disableValueTrimming);
        }
        if (updateCsvClassifierRequest.getAllowSingleColumn() != null) {
            Boolean allowSingleColumn = updateCsvClassifierRequest.getAllowSingleColumn();
            jsonWriter.name("AllowSingleColumn");
            jsonWriter.value(allowSingleColumn);
        }
        jsonWriter.endObject();
    }

    private static UpdateCsvClassifierRequestJsonMarshaller instance;

    public static UpdateCsvClassifierRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UpdateCsvClassifierRequestJsonMarshaller();
        return instance;
    }
}
