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

package com.amazonaws.services.awscostexplorerservice.model.transform;

import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Expression
 */
class ExpressionJsonMarshaller {

    public void marshall(Expression expression, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (expression.getOr() != null) {
            java.util.List<Expression> or = expression.getOr();
            jsonWriter.name("Or");
            jsonWriter.beginArray();
            for (Expression orItem : or) {
                if (orItem != null) {
                    ExpressionJsonMarshaller.getInstance().marshall(orItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (expression.getAnd() != null) {
            java.util.List<Expression> and = expression.getAnd();
            jsonWriter.name("And");
            jsonWriter.beginArray();
            for (Expression andItem : and) {
                if (andItem != null) {
                    ExpressionJsonMarshaller.getInstance().marshall(andItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (expression.getNot() != null) {
            Expression not = expression.getNot();
            jsonWriter.name("Not");
            ExpressionJsonMarshaller.getInstance().marshall(not, jsonWriter);
        }
        if (expression.getDimensions() != null) {
            DimensionValues dimensions = expression.getDimensions();
            jsonWriter.name("Dimensions");
            DimensionValuesJsonMarshaller.getInstance().marshall(dimensions, jsonWriter);
        }
        if (expression.getTags() != null) {
            TagValues tags = expression.getTags();
            jsonWriter.name("Tags");
            TagValuesJsonMarshaller.getInstance().marshall(tags, jsonWriter);
        }
        if (expression.getCostCategories() != null) {
            CostCategoryValues costCategories = expression.getCostCategories();
            jsonWriter.name("CostCategories");
            CostCategoryValuesJsonMarshaller.getInstance().marshall(costCategories, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ExpressionJsonMarshaller instance;

    public static ExpressionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExpressionJsonMarshaller();
        return instance;
    }
}
