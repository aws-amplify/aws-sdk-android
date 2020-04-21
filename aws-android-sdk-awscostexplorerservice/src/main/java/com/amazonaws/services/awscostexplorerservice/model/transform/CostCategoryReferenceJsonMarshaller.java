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
 * JSON marshaller for POJO CostCategoryReference
 */
class CostCategoryReferenceJsonMarshaller {

    public void marshall(CostCategoryReference costCategoryReference, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (costCategoryReference.getCostCategoryArn() != null) {
            String costCategoryArn = costCategoryReference.getCostCategoryArn();
            jsonWriter.name("CostCategoryArn");
            jsonWriter.value(costCategoryArn);
        }
        if (costCategoryReference.getName() != null) {
            String name = costCategoryReference.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (costCategoryReference.getEffectiveStart() != null) {
            String effectiveStart = costCategoryReference.getEffectiveStart();
            jsonWriter.name("EffectiveStart");
            jsonWriter.value(effectiveStart);
        }
        if (costCategoryReference.getEffectiveEnd() != null) {
            String effectiveEnd = costCategoryReference.getEffectiveEnd();
            jsonWriter.name("EffectiveEnd");
            jsonWriter.value(effectiveEnd);
        }
        if (costCategoryReference.getNumberOfRules() != null) {
            Integer numberOfRules = costCategoryReference.getNumberOfRules();
            jsonWriter.name("NumberOfRules");
            jsonWriter.value(numberOfRules);
        }
        jsonWriter.endObject();
    }

    private static CostCategoryReferenceJsonMarshaller instance;

    public static CostCategoryReferenceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CostCategoryReferenceJsonMarshaller();
        return instance;
    }
}
