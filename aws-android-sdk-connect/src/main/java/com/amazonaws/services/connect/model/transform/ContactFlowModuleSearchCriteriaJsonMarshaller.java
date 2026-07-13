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
 * JSON marshaller for POJO ContactFlowModuleSearchCriteria
 */
class ContactFlowModuleSearchCriteriaJsonMarshaller {

    public void marshall(ContactFlowModuleSearchCriteria contactFlowModuleSearchCriteria,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (contactFlowModuleSearchCriteria.getOrConditions() != null) {
            java.util.List<ContactFlowModuleSearchCriteria> orConditions = contactFlowModuleSearchCriteria
                    .getOrConditions();
            jsonWriter.name("OrConditions");
            jsonWriter.beginArray();
            for (ContactFlowModuleSearchCriteria orConditionsItem : orConditions) {
                if (orConditionsItem != null) {
                    ContactFlowModuleSearchCriteriaJsonMarshaller.getInstance().marshall(
                            orConditionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (contactFlowModuleSearchCriteria.getAndConditions() != null) {
            java.util.List<ContactFlowModuleSearchCriteria> andConditions = contactFlowModuleSearchCriteria
                    .getAndConditions();
            jsonWriter.name("AndConditions");
            jsonWriter.beginArray();
            for (ContactFlowModuleSearchCriteria andConditionsItem : andConditions) {
                if (andConditionsItem != null) {
                    ContactFlowModuleSearchCriteriaJsonMarshaller.getInstance().marshall(
                            andConditionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (contactFlowModuleSearchCriteria.getStringCondition() != null) {
            StringCondition stringCondition = contactFlowModuleSearchCriteria.getStringCondition();
            jsonWriter.name("StringCondition");
            StringConditionJsonMarshaller.getInstance().marshall(stringCondition, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ContactFlowModuleSearchCriteriaJsonMarshaller instance;

    public static ContactFlowModuleSearchCriteriaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContactFlowModuleSearchCriteriaJsonMarshaller();
        return instance;
    }
}
