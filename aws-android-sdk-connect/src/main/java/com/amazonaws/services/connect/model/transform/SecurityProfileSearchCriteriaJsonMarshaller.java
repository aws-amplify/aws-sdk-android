/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO SecurityProfileSearchCriteria
 */
class SecurityProfileSearchCriteriaJsonMarshaller {

    public void marshall(SecurityProfileSearchCriteria securityProfileSearchCriteria,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (securityProfileSearchCriteria.getOrConditions() != null) {
            java.util.List<SecurityProfileSearchCriteria> orConditions = securityProfileSearchCriteria
                    .getOrConditions();
            jsonWriter.name("OrConditions");
            jsonWriter.beginArray();
            for (SecurityProfileSearchCriteria orConditionsItem : orConditions) {
                if (orConditionsItem != null) {
                    SecurityProfileSearchCriteriaJsonMarshaller.getInstance().marshall(
                            orConditionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (securityProfileSearchCriteria.getAndConditions() != null) {
            java.util.List<SecurityProfileSearchCriteria> andConditions = securityProfileSearchCriteria
                    .getAndConditions();
            jsonWriter.name("AndConditions");
            jsonWriter.beginArray();
            for (SecurityProfileSearchCriteria andConditionsItem : andConditions) {
                if (andConditionsItem != null) {
                    SecurityProfileSearchCriteriaJsonMarshaller.getInstance().marshall(
                            andConditionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (securityProfileSearchCriteria.getStringCondition() != null) {
            StringCondition stringCondition = securityProfileSearchCriteria.getStringCondition();
            jsonWriter.name("StringCondition");
            StringConditionJsonMarshaller.getInstance().marshall(stringCondition, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SecurityProfileSearchCriteriaJsonMarshaller instance;

    public static SecurityProfileSearchCriteriaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SecurityProfileSearchCriteriaJsonMarshaller();
        return instance;
    }
}
