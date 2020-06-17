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
 * JSON marshaller for POJO CriterionAdditionalProperties
 */
class CriterionAdditionalPropertiesJsonMarshaller {

    public void marshall(CriterionAdditionalProperties criterionAdditionalProperties,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (criterionAdditionalProperties.getEq() != null) {
            java.util.List<String> eq = criterionAdditionalProperties.getEq();
            jsonWriter.name("eq");
            jsonWriter.beginArray();
            for (String eqItem : eq) {
                if (eqItem != null) {
                    jsonWriter.value(eqItem);
                }
            }
            jsonWriter.endArray();
        }
        if (criterionAdditionalProperties.getGt() != null) {
            Long gt = criterionAdditionalProperties.getGt();
            jsonWriter.name("gt");
            jsonWriter.value(gt);
        }
        if (criterionAdditionalProperties.getGte() != null) {
            Long gte = criterionAdditionalProperties.getGte();
            jsonWriter.name("gte");
            jsonWriter.value(gte);
        }
        if (criterionAdditionalProperties.getLt() != null) {
            Long lt = criterionAdditionalProperties.getLt();
            jsonWriter.name("lt");
            jsonWriter.value(lt);
        }
        if (criterionAdditionalProperties.getLte() != null) {
            Long lte = criterionAdditionalProperties.getLte();
            jsonWriter.name("lte");
            jsonWriter.value(lte);
        }
        if (criterionAdditionalProperties.getNeq() != null) {
            java.util.List<String> neq = criterionAdditionalProperties.getNeq();
            jsonWriter.name("neq");
            jsonWriter.beginArray();
            for (String neqItem : neq) {
                if (neqItem != null) {
                    jsonWriter.value(neqItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static CriterionAdditionalPropertiesJsonMarshaller instance;

    public static CriterionAdditionalPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CriterionAdditionalPropertiesJsonMarshaller();
        return instance;
    }
}
