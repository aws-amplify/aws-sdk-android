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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SearchExpression
 */
class SearchExpressionJsonMarshaller {

    public void marshall(SearchExpression searchExpression, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (searchExpression.getFilters() != null) {
            java.util.List<Filter> filters = searchExpression.getFilters();
            jsonWriter.name("Filters");
            jsonWriter.beginArray();
            for (Filter filtersItem : filters) {
                if (filtersItem != null) {
                    FilterJsonMarshaller.getInstance().marshall(filtersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (searchExpression.getNestedFilters() != null) {
            java.util.List<NestedFilters> nestedFilters = searchExpression.getNestedFilters();
            jsonWriter.name("NestedFilters");
            jsonWriter.beginArray();
            for (NestedFilters nestedFiltersItem : nestedFilters) {
                if (nestedFiltersItem != null) {
                    NestedFiltersJsonMarshaller.getInstance().marshall(nestedFiltersItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (searchExpression.getSubExpressions() != null) {
            java.util.List<SearchExpression> subExpressions = searchExpression.getSubExpressions();
            jsonWriter.name("SubExpressions");
            jsonWriter.beginArray();
            for (SearchExpression subExpressionsItem : subExpressions) {
                if (subExpressionsItem != null) {
                    SearchExpressionJsonMarshaller.getInstance().marshall(subExpressionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (searchExpression.getOperator() != null) {
            String operator = searchExpression.getOperator();
            jsonWriter.name("Operator");
            jsonWriter.value(operator);
        }
        jsonWriter.endObject();
    }

    private static SearchExpressionJsonMarshaller instance;

    public static SearchExpressionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SearchExpressionJsonMarshaller();
        return instance;
    }
}
