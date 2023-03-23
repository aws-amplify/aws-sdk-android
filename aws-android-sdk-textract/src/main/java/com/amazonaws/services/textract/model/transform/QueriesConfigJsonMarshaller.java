/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model.transform;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO QueriesConfig
 */
class QueriesConfigJsonMarshaller {

    public void marshall(QueriesConfig queriesConfig, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (queriesConfig.getQueries() != null) {
            java.util.List<Query> queries = queriesConfig.getQueries();
            jsonWriter.name("Queries");
            jsonWriter.beginArray();
            for (Query queriesItem : queries) {
                if (queriesItem != null) {
                    QueryJsonMarshaller.getInstance().marshall(queriesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static QueriesConfigJsonMarshaller instance;

    public static QueriesConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new QueriesConfigJsonMarshaller();
        return instance;
    }
}
