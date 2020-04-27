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

package com.amazonaws.services.accessanalyzer.model.transform;

import com.amazonaws.services.accessanalyzer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Criterion
 */
class CriterionJsonMarshaller {

    public void marshall(Criterion criterion, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (criterion.getContains() != null) {
            java.util.List<String> contains = criterion.getContains();
            jsonWriter.name("contains");
            jsonWriter.beginArray();
            for (String containsItem : contains) {
                if (containsItem != null) {
                    jsonWriter.value(containsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (criterion.getEq() != null) {
            java.util.List<String> eq = criterion.getEq();
            jsonWriter.name("eq");
            jsonWriter.beginArray();
            for (String eqItem : eq) {
                if (eqItem != null) {
                    jsonWriter.value(eqItem);
                }
            }
            jsonWriter.endArray();
        }
        if (criterion.getExists() != null) {
            Boolean exists = criterion.getExists();
            jsonWriter.name("exists");
            jsonWriter.value(exists);
        }
        if (criterion.getNeq() != null) {
            java.util.List<String> neq = criterion.getNeq();
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

    private static CriterionJsonMarshaller instance;

    public static CriterionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CriterionJsonMarshaller();
        return instance;
    }
}
