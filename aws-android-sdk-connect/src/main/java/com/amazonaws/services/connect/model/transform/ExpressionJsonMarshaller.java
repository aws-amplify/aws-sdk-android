/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Expression
 */
class ExpressionJsonMarshaller {

    public void marshall(Expression expression, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (expression.getAttributeCondition() != null) {
            AttributeCondition attributeCondition = expression.getAttributeCondition();
            jsonWriter.name("AttributeCondition");
            AttributeConditionJsonMarshaller.getInstance().marshall(attributeCondition, jsonWriter);
        }
        if (expression.getAndExpression() != null) {
            java.util.List<Expression> andExpression = expression.getAndExpression();
            jsonWriter.name("AndExpression");
            jsonWriter.beginArray();
            for (Expression andExpressionItem : andExpression) {
                if (andExpressionItem != null) {
                    ExpressionJsonMarshaller.getInstance().marshall(andExpressionItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (expression.getOrExpression() != null) {
            java.util.List<Expression> orExpression = expression.getOrExpression();
            jsonWriter.name("OrExpression");
            jsonWriter.beginArray();
            for (Expression orExpressionItem : orExpression) {
                if (orExpressionItem != null) {
                    ExpressionJsonMarshaller.getInstance().marshall(orExpressionItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
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
