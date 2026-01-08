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
 * JSON marshaller for POJO AttributeCondition
 */
class AttributeConditionJsonMarshaller {

    public void marshall(AttributeCondition attributeCondition, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (attributeCondition.getName() != null) {
            String name = attributeCondition.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (attributeCondition.getValue() != null) {
            String value = attributeCondition.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        if (attributeCondition.getProficiencyLevel() != null) {
            Float proficiencyLevel = attributeCondition.getProficiencyLevel();
            jsonWriter.name("ProficiencyLevel");
            jsonWriter.value(proficiencyLevel);
        }
        if (attributeCondition.getMatchCriteria() != null) {
            MatchCriteria matchCriteria = attributeCondition.getMatchCriteria();
            jsonWriter.name("MatchCriteria");
            MatchCriteriaJsonMarshaller.getInstance().marshall(matchCriteria, jsonWriter);
        }
        if (attributeCondition.getComparisonOperator() != null) {
            String comparisonOperator = attributeCondition.getComparisonOperator();
            jsonWriter.name("ComparisonOperator");
            jsonWriter.value(comparisonOperator);
        }
        jsonWriter.endObject();
    }

    private static AttributeConditionJsonMarshaller instance;

    public static AttributeConditionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AttributeConditionJsonMarshaller();
        return instance;
    }
}
