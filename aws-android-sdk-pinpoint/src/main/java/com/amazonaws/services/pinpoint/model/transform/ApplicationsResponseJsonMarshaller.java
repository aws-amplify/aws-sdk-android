/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO ApplicationsResponse
 */
class ApplicationsResponseJsonMarshaller {

    public void marshall(ApplicationsResponse applicationsResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (applicationsResponse.getItem() != null) {
            java.util.List<ApplicationResponse> item = applicationsResponse.getItem();
            jsonWriter.name("Item");
            jsonWriter.beginArray();
            for (ApplicationResponse itemItem : item) {
                if (itemItem != null) {
                    ApplicationResponseJsonMarshaller.getInstance().marshall(itemItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (applicationsResponse.getNextToken() != null) {
            String nextToken = applicationsResponse.getNextToken();
            jsonWriter.name("NextToken");
            jsonWriter.value(nextToken);
        }
        jsonWriter.endObject();
    }

    private static ApplicationsResponseJsonMarshaller instance;

    public static ApplicationsResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationsResponseJsonMarshaller();
        return instance;
    }
}
