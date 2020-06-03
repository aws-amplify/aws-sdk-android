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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO UpdateCsvClassifierRequest
 */
class UpdateCsvClassifierRequestJsonUnmarshaller implements
        Unmarshaller<UpdateCsvClassifierRequest, JsonUnmarshallerContext> {

    public UpdateCsvClassifierRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UpdateCsvClassifierRequest updateCsvClassifierRequest = new UpdateCsvClassifierRequest();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                updateCsvClassifierRequest.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Delimiter")) {
                updateCsvClassifierRequest.setDelimiter(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("QuoteSymbol")) {
                updateCsvClassifierRequest.setQuoteSymbol(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContainsHeader")) {
                updateCsvClassifierRequest.setContainsHeader(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Header")) {
                updateCsvClassifierRequest.setHeader(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DisableValueTrimming")) {
                updateCsvClassifierRequest.setDisableValueTrimming(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AllowSingleColumn")) {
                updateCsvClassifierRequest.setAllowSingleColumn(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return updateCsvClassifierRequest;
    }

    private static UpdateCsvClassifierRequestJsonUnmarshaller instance;

    public static UpdateCsvClassifierRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateCsvClassifierRequestJsonUnmarshaller();
        return instance;
    }
}
