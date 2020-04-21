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

package com.amazonaws.services.amazonguardduty.model.transform;

import com.amazonaws.services.amazonguardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Condition
 */
class ConditionJsonMarshaller {

    public void marshall(Condition condition, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (condition.getEq() != null) {
            java.util.List<String> eq = condition.getEq();
            jsonWriter.name("Eq");
            jsonWriter.beginArray();
            for (String eqItem : eq) {
                if (eqItem != null) {
                    jsonWriter.value(eqItem);
                }
            }
            jsonWriter.endArray();
        }
        if (condition.getNeq() != null) {
            java.util.List<String> neq = condition.getNeq();
            jsonWriter.name("Neq");
            jsonWriter.beginArray();
            for (String neqItem : neq) {
                if (neqItem != null) {
                    jsonWriter.value(neqItem);
                }
            }
            jsonWriter.endArray();
        }
        if (condition.getGt() != null) {
            Integer gt = condition.getGt();
            jsonWriter.name("Gt");
            jsonWriter.value(gt);
        }
        if (condition.getGte() != null) {
            Integer gte = condition.getGte();
            jsonWriter.name("Gte");
            jsonWriter.value(gte);
        }
        if (condition.getLt() != null) {
            Integer lt = condition.getLt();
            jsonWriter.name("Lt");
            jsonWriter.value(lt);
        }
        if (condition.getLte() != null) {
            Integer lte = condition.getLte();
            jsonWriter.name("Lte");
            jsonWriter.value(lte);
        }
        if (condition.getEquals() != null) {
            java.util.List<String> equals = condition.getEquals();
            jsonWriter.name("Equals");
            jsonWriter.beginArray();
            for (String equalsItem : equals) {
                if (equalsItem != null) {
                    jsonWriter.value(equalsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (condition.getNotEquals() != null) {
            java.util.List<String> notEquals = condition.getNotEquals();
            jsonWriter.name("NotEquals");
            jsonWriter.beginArray();
            for (String notEqualsItem : notEquals) {
                if (notEqualsItem != null) {
                    jsonWriter.value(notEqualsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (condition.getGreaterThan() != null) {
            Long greaterThan = condition.getGreaterThan();
            jsonWriter.name("GreaterThan");
            jsonWriter.value(greaterThan);
        }
        if (condition.getGreaterThanOrEqual() != null) {
            Long greaterThanOrEqual = condition.getGreaterThanOrEqual();
            jsonWriter.name("GreaterThanOrEqual");
            jsonWriter.value(greaterThanOrEqual);
        }
        if (condition.getLessThan() != null) {
            Long lessThan = condition.getLessThan();
            jsonWriter.name("LessThan");
            jsonWriter.value(lessThan);
        }
        if (condition.getLessThanOrEqual() != null) {
            Long lessThanOrEqual = condition.getLessThanOrEqual();
            jsonWriter.name("LessThanOrEqual");
            jsonWriter.value(lessThanOrEqual);
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
