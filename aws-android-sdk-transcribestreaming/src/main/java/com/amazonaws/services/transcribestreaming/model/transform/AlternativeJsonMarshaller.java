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

package com.amazonaws.services.transcribestreaming.model.transform;

import com.amazonaws.services.transcribestreaming.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Alternative
 */
class AlternativeJsonMarshaller {

    public void marshall(Alternative alternative, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (alternative.getTranscript() != null) {
            String transcript = alternative.getTranscript();
            jsonWriter.name("Transcript");
            jsonWriter.value(transcript);
        }
        if (alternative.getItems() != null) {
            java.util.List<Item> items = alternative.getItems();
            jsonWriter.name("Items");
            jsonWriter.beginArray();
            for (Item itemsItem : items) {
                if (itemsItem != null) {
                    ItemJsonMarshaller.getInstance().marshall(itemsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AlternativeJsonMarshaller instance;

    public static AlternativeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AlternativeJsonMarshaller();
        return instance;
    }
}
