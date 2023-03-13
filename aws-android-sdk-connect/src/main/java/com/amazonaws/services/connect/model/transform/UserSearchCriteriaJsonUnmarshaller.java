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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO UserSearchCriteria
 */
class UserSearchCriteriaJsonUnmarshaller implements
        Unmarshaller<UserSearchCriteria, JsonUnmarshallerContext> {

    public UserSearchCriteria unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UserSearchCriteria userSearchCriteria = new UserSearchCriteria();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("OrConditions")) {
                userSearchCriteria.setOrConditions(new ListUnmarshaller<UserSearchCriteria>(
                        UserSearchCriteriaJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AndConditions")) {
                userSearchCriteria.setAndConditions(new ListUnmarshaller<UserSearchCriteria>(
                        UserSearchCriteriaJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("StringCondition")) {
                userSearchCriteria.setStringCondition(StringConditionJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HierarchyGroupCondition")) {
                userSearchCriteria
                        .setHierarchyGroupCondition(HierarchyGroupConditionJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return userSearchCriteria;
    }

    private static UserSearchCriteriaJsonUnmarshaller instance;

    public static UserSearchCriteriaJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserSearchCriteriaJsonUnmarshaller();
        return instance;
    }
}
