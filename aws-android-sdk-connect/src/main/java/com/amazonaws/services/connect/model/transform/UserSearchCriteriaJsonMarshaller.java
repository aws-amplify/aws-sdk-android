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
 * JSON marshaller for POJO UserSearchCriteria
 */
class UserSearchCriteriaJsonMarshaller {

    public void marshall(UserSearchCriteria userSearchCriteria, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (userSearchCriteria.getOrConditions() != null) {
            java.util.List<UserSearchCriteria> orConditions = userSearchCriteria.getOrConditions();
            jsonWriter.name("OrConditions");
            jsonWriter.beginArray();
            for (UserSearchCriteria orConditionsItem : orConditions) {
                if (orConditionsItem != null) {
                    UserSearchCriteriaJsonMarshaller.getInstance().marshall(orConditionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (userSearchCriteria.getAndConditions() != null) {
            java.util.List<UserSearchCriteria> andConditions = userSearchCriteria
                    .getAndConditions();
            jsonWriter.name("AndConditions");
            jsonWriter.beginArray();
            for (UserSearchCriteria andConditionsItem : andConditions) {
                if (andConditionsItem != null) {
                    UserSearchCriteriaJsonMarshaller.getInstance().marshall(andConditionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (userSearchCriteria.getStringCondition() != null) {
            StringCondition stringCondition = userSearchCriteria.getStringCondition();
            jsonWriter.name("StringCondition");
            StringConditionJsonMarshaller.getInstance().marshall(stringCondition, jsonWriter);
        }
        if (userSearchCriteria.getHierarchyGroupCondition() != null) {
            HierarchyGroupCondition hierarchyGroupCondition = userSearchCriteria
                    .getHierarchyGroupCondition();
            jsonWriter.name("HierarchyGroupCondition");
            HierarchyGroupConditionJsonMarshaller.getInstance().marshall(hierarchyGroupCondition,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static UserSearchCriteriaJsonMarshaller instance;

    public static UserSearchCriteriaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserSearchCriteriaJsonMarshaller();
        return instance;
    }
}
