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

package com.amazonaws.services.amazonpinpoint.model.transform;

import com.amazonaws.services.amazonpinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ListRecommenderConfigurationsResponse
 */
class ListRecommenderConfigurationsResponseJsonMarshaller {

    public void marshall(
            ListRecommenderConfigurationsResponse listRecommenderConfigurationsResponse,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (listRecommenderConfigurationsResponse.getItem() != null) {
            java.util.List<RecommenderConfigurationResponse> item = listRecommenderConfigurationsResponse
                    .getItem();
            jsonWriter.name("Item");
            jsonWriter.beginArray();
            for (RecommenderConfigurationResponse itemItem : item) {
                if (itemItem != null) {
                    RecommenderConfigurationResponseJsonMarshaller.getInstance().marshall(itemItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (listRecommenderConfigurationsResponse.getNextToken() != null) {
            String nextToken = listRecommenderConfigurationsResponse.getNextToken();
            jsonWriter.name("NextToken");
            jsonWriter.value(nextToken);
        }
        jsonWriter.endObject();
    }

    private static ListRecommenderConfigurationsResponseJsonMarshaller instance;

    public static ListRecommenderConfigurationsResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ListRecommenderConfigurationsResponseJsonMarshaller();
        return instance;
    }
}
