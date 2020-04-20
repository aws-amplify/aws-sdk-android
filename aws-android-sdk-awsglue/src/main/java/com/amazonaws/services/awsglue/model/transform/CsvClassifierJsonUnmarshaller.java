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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CsvClassifier
 */
class CsvClassifierJsonUnmarshaller implements Unmarshaller<CsvClassifier, JsonUnmarshallerContext> {

    public CsvClassifier unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CsvClassifier csvClassifier = new CsvClassifier();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                csvClassifier.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                csvClassifier.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdated")) {
                csvClassifier.setLastUpdated(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Version")) {
                csvClassifier.setVersion(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Delimiter")) {
                csvClassifier.setDelimiter(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("QuoteSymbol")) {
                csvClassifier.setQuoteSymbol(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContainsHeader")) {
                csvClassifier.setContainsHeader(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Header")) {
                csvClassifier.setHeader(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DisableValueTrimming")) {
                csvClassifier.setDisableValueTrimming(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AllowSingleColumn")) {
                csvClassifier.setAllowSingleColumn(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return csvClassifier;
    }

    private static CsvClassifierJsonUnmarshaller instance;

    public static CsvClassifierJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CsvClassifierJsonUnmarshaller();
        return instance;
    }
}
