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
 * JSON marshaller for POJO ExportJobsResponse
 */
class ExportJobsResponseJsonMarshaller {

    public void marshall(ExportJobsResponse exportJobsResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (exportJobsResponse.getItem() != null) {
            java.util.List<ExportJobResponse> item = exportJobsResponse.getItem();
            jsonWriter.name("Item");
            jsonWriter.beginArray();
            for (ExportJobResponse itemItem : item) {
                if (itemItem != null) {
                    ExportJobResponseJsonMarshaller.getInstance().marshall(itemItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (exportJobsResponse.getNextToken() != null) {
            String nextToken = exportJobsResponse.getNextToken();
            jsonWriter.name("NextToken");
            jsonWriter.value(nextToken);
        }
        jsonWriter.endObject();
    }

    private static ExportJobsResponseJsonMarshaller instance;

    public static ExportJobsResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExportJobsResponseJsonMarshaller();
        return instance;
    }
}
