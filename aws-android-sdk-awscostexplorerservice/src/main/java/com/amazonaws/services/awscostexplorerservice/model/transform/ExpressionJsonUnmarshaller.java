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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Expression
 */
class ExpressionJsonUnmarshaller implements Unmarshaller<Expression, JsonUnmarshallerContext> {

    public Expression unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Expression expression = new Expression();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Or")) {
                expression.setOr(new ListUnmarshaller<Expression>(ExpressionJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("And")) {
                expression.setAnd(new ListUnmarshaller<Expression>(ExpressionJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Not")) {
                expression.setNot(ExpressionJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Dimensions")) {
                expression.setDimensions(DimensionValuesJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                expression.setTags(TagValuesJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CostCategories")) {
                expression.setCostCategories(CostCategoryValuesJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return expression;
    }

    private static ExpressionJsonUnmarshaller instance;

    public static ExpressionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExpressionJsonUnmarshaller();
        return instance;
    }
}
