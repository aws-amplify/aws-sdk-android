/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO ExpectedAttributeValue
 */
class ExpectedAttributeValueJsonMarshaller {

    public void marshall(ExpectedAttributeValue expectedAttributeValue, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (expectedAttributeValue.getValue() != null) {
            AttributeValue value = expectedAttributeValue.getValue();
            jsonWriter.name("Value");
            AttributeValueJsonMarshaller.getInstance().marshall(value, jsonWriter);
        }
        if (expectedAttributeValue.getExists() != null) {
            Boolean exists = expectedAttributeValue.getExists();
            jsonWriter.name("Exists");
            jsonWriter.value(exists);
        }
        if (expectedAttributeValue.getComparisonOperator() != null) {
            String comparisonOperator = expectedAttributeValue.getComparisonOperator();
            jsonWriter.name("ComparisonOperator");
            jsonWriter.value(comparisonOperator);
        }
        if (expectedAttributeValue.getAttributeValueList() != null) {
            java.util.List<AttributeValue> attributeValueList = expectedAttributeValue
                    .getAttributeValueList();
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
        jsonWriter.endObject();
    }

    private static ExpectedAttributeValueJsonMarshaller instance;

    public static ExpectedAttributeValueJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExpectedAttributeValueJsonMarshaller();
        return instance;
    }
}
