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

package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Condition
 */
class ConditionJsonMarshaller {

    public void marshall(Condition condition, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (condition.getAttributeValueList() != null) {
            java.util.List<AttributeValue> attributeValueList = condition.getAttributeValueList();
            jsonWriter.name("AttributeValueList");
            jsonWriter.beginArray();
            for (AttributeValue attributeValueListItem : attributeValueList) {
                if (attributeValueListItem != null) {
                    AttributeValueJsonMarshaller.getInstance().marshall(attributeValueListItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (condition.getComparisonOperator() != null) {
            String comparisonOperator = condition.getComparisonOperator();
            jsonWriter.name("ComparisonOperator");
            jsonWriter.value(comparisonOperator);
        }
        jsonWriter.endObject();
    }

    private static ConditionJsonMarshaller instance;

    public static ConditionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConditionJsonMarshaller();
        return instance;
    }
}
