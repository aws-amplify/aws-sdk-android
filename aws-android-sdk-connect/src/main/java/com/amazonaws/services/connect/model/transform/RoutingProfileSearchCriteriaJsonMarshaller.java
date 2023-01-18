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
 * JSON marshaller for POJO RoutingProfileSearchCriteria
 */
class RoutingProfileSearchCriteriaJsonMarshaller {

    public void marshall(RoutingProfileSearchCriteria routingProfileSearchCriteria,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (routingProfileSearchCriteria.getOrConditions() != null) {
            java.util.List<RoutingProfileSearchCriteria> orConditions = routingProfileSearchCriteria
                    .getOrConditions();
            jsonWriter.name("OrConditions");
            jsonWriter.beginArray();
            for (RoutingProfileSearchCriteria orConditionsItem : orConditions) {
                if (orConditionsItem != null) {
                    RoutingProfileSearchCriteriaJsonMarshaller.getInstance().marshall(
                            orConditionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (routingProfileSearchCriteria.getAndConditions() != null) {
            java.util.List<RoutingProfileSearchCriteria> andConditions = routingProfileSearchCriteria
                    .getAndConditions();
            jsonWriter.name("AndConditions");
            jsonWriter.beginArray();
            for (RoutingProfileSearchCriteria andConditionsItem : andConditions) {
                if (andConditionsItem != null) {
                    RoutingProfileSearchCriteriaJsonMarshaller.getInstance().marshall(
                            andConditionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (routingProfileSearchCriteria.getStringCondition() != null) {
            StringCondition stringCondition = routingProfileSearchCriteria.getStringCondition();
            jsonWriter.name("StringCondition");
            StringConditionJsonMarshaller.getInstance().marshall(stringCondition, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static RoutingProfileSearchCriteriaJsonMarshaller instance;

    public static RoutingProfileSearchCriteriaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RoutingProfileSearchCriteriaJsonMarshaller();
        return instance;
    }
}
