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
 * JSON marshaller for POJO TemplateVersionsResponse
 */
class TemplateVersionsResponseJsonMarshaller {

    public void marshall(TemplateVersionsResponse templateVersionsResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (templateVersionsResponse.getItem() != null) {
            java.util.List<TemplateVersionResponse> item = templateVersionsResponse.getItem();
            jsonWriter.name("Item");
            jsonWriter.beginArray();
            for (TemplateVersionResponse itemItem : item) {
                if (itemItem != null) {
                    TemplateVersionResponseJsonMarshaller.getInstance().marshall(itemItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (templateVersionsResponse.getMessage() != null) {
            String message = templateVersionsResponse.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (templateVersionsResponse.getNextToken() != null) {
            String nextToken = templateVersionsResponse.getNextToken();
            jsonWriter.name("NextToken");
            jsonWriter.value(nextToken);
        }
        if (templateVersionsResponse.getRequestID() != null) {
            String requestID = templateVersionsResponse.getRequestID();
            jsonWriter.name("RequestID");
            jsonWriter.value(requestID);
        }
        jsonWriter.endObject();
    }

    private static TemplateVersionsResponseJsonMarshaller instance;

    public static TemplateVersionsResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TemplateVersionsResponseJsonMarshaller();
        return instance;
    }
}
