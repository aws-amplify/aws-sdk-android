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
 * JSON marshaller for POJO UtteranceList
 */
class UtteranceListJsonMarshaller {

    public void marshall(UtteranceList utteranceList, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (utteranceList.getBotVersion() != null) {
            String botVersion = utteranceList.getBotVersion();
            jsonWriter.name("botVersion");
            jsonWriter.value(botVersion);
        }
        if (utteranceList.getUtterances() != null) {
            java.util.List<UtteranceData> utterances = utteranceList.getUtterances();
            jsonWriter.name("utterances");
            jsonWriter.beginArray();
            for (UtteranceData utterancesItem : utterances) {
                if (utterancesItem != null) {
                    UtteranceDataJsonMarshaller.getInstance().marshall(utterancesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static UtteranceListJsonMarshaller instance;

    public static UtteranceListJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UtteranceListJsonMarshaller();
        return instance;
    }
}
