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
 * JSON unmarshaller for POJO CreateCsvClassifierRequest
 */
class CreateCsvClassifierRequestJsonUnmarshaller implements
        Unmarshaller<CreateCsvClassifierRequest, JsonUnmarshallerContext> {

    public CreateCsvClassifierRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CreateCsvClassifierRequest createCsvClassifierRequest = new CreateCsvClassifierRequest();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                createCsvClassifierRequest.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Delimiter")) {
                createCsvClassifierRequest.setDelimiter(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("QuoteSymbol")) {
                createCsvClassifierRequest.setQuoteSymbol(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContainsHeader")) {
                createCsvClassifierRequest.setContainsHeader(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Header")) {
                createCsvClassifierRequest.setHeader(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DisableValueTrimming")) {
                createCsvClassifierRequest.setDisableValueTrimming(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AllowSingleColumn")) {
                createCsvClassifierRequest.setAllowSingleColumn(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createCsvClassifierRequest;
    }

    private static CreateCsvClassifierRequestJsonUnmarshaller instance;

    public static CreateCsvClassifierRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateCsvClassifierRequestJsonUnmarshaller();
        return instance;
    }
}
