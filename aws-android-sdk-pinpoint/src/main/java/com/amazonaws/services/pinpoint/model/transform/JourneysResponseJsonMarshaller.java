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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JourneysResponse
 */
class JourneysResponseJsonMarshaller {

    public void marshall(JourneysResponse journeysResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (journeysResponse.getItem() != null) {
            java.util.List<JourneyResponse> item = journeysResponse.getItem();
            jsonWriter.name("Item");
            jsonWriter.beginArray();
            for (JourneyResponse itemItem : item) {
                if (itemItem != null) {
                    JourneyResponseJsonMarshaller.getInstance().marshall(itemItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (journeysResponse.getNextToken() != null) {
            String nextToken = journeysResponse.getNextToken();
            jsonWriter.name("NextToken");
            jsonWriter.value(nextToken);
        }
        jsonWriter.endObject();
    }

    private static JourneysResponseJsonMarshaller instance;

    public static JourneysResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JourneysResponseJsonMarshaller();
        return instance;
    }
}
