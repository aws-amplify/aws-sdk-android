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

package com.amazonaws.services.models.lex.model.transform;

import com.amazonaws.services.models.lex.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UtteranceData
 */
class UtteranceDataJsonMarshaller {

    public void marshall(UtteranceData utteranceData, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (utteranceData.getUtteranceString() != null) {
            String utteranceString = utteranceData.getUtteranceString();
            jsonWriter.name("utteranceString");
            jsonWriter.value(utteranceString);
        }
        if (utteranceData.getCount() != null) {
            Integer count = utteranceData.getCount();
            jsonWriter.name("count");
            jsonWriter.value(count);
        }
        if (utteranceData.getDistinctUsers() != null) {
            Integer distinctUsers = utteranceData.getDistinctUsers();
            jsonWriter.name("distinctUsers");
            jsonWriter.value(distinctUsers);
        }
        if (utteranceData.getFirstUtteredDate() != null) {
            java.util.Date firstUtteredDate = utteranceData.getFirstUtteredDate();
            jsonWriter.name("firstUtteredDate");
            jsonWriter.value(firstUtteredDate);
        }
        if (utteranceData.getLastUtteredDate() != null) {
            java.util.Date lastUtteredDate = utteranceData.getLastUtteredDate();
            jsonWriter.name("lastUtteredDate");
            jsonWriter.value(lastUtteredDate);
        }
        jsonWriter.endObject();
    }

    private static UtteranceDataJsonMarshaller instance;

    public static UtteranceDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UtteranceDataJsonMarshaller();
        return instance;
    }
}
