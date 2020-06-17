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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FindingCriteria
 */
class FindingCriteriaJsonMarshaller {

    public void marshall(FindingCriteria findingCriteria, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (findingCriteria.getCriterion() != null) {
            java.util.Map<String, CriterionAdditionalProperties> criterion = findingCriteria
                    .getCriterion();
            jsonWriter.name("criterion");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, CriterionAdditionalProperties> criterionEntry : criterion
                    .entrySet()) {
                CriterionAdditionalProperties criterionValue = criterionEntry.getValue();
                if (criterionValue != null) {
                    jsonWriter.name(criterionEntry.getKey());
                    CriterionAdditionalPropertiesJsonMarshaller.getInstance().marshall(
                            criterionValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static FindingCriteriaJsonMarshaller instance;

    public static FindingCriteriaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FindingCriteriaJsonMarshaller();
        return instance;
    }
}
