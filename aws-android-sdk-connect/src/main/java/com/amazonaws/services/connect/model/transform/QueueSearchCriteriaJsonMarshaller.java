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
 * JSON marshaller for POJO QueueSearchCriteria
 */
class QueueSearchCriteriaJsonMarshaller {

    public void marshall(QueueSearchCriteria queueSearchCriteria, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (queueSearchCriteria.getOrConditions() != null) {
            java.util.List<QueueSearchCriteria> orConditions = queueSearchCriteria
                    .getOrConditions();
            jsonWriter.name("OrConditions");
            jsonWriter.beginArray();
            for (QueueSearchCriteria orConditionsItem : orConditions) {
                if (orConditionsItem != null) {
                    QueueSearchCriteriaJsonMarshaller.getInstance().marshall(orConditionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (queueSearchCriteria.getAndConditions() != null) {
            java.util.List<QueueSearchCriteria> andConditions = queueSearchCriteria
                    .getAndConditions();
            jsonWriter.name("AndConditions");
            jsonWriter.beginArray();
            for (QueueSearchCriteria andConditionsItem : andConditions) {
                if (andConditionsItem != null) {
                    QueueSearchCriteriaJsonMarshaller.getInstance().marshall(andConditionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (queueSearchCriteria.getStringCondition() != null) {
            StringCondition stringCondition = queueSearchCriteria.getStringCondition();
            jsonWriter.name("StringCondition");
            StringConditionJsonMarshaller.getInstance().marshall(stringCondition, jsonWriter);
        }
        if (queueSearchCriteria.getQueueTypeCondition() != null) {
            String queueTypeCondition = queueSearchCriteria.getQueueTypeCondition();
            jsonWriter.name("QueueTypeCondition");
            jsonWriter.value(queueTypeCondition);
        }
        jsonWriter.endObject();
    }

    private static QueueSearchCriteriaJsonMarshaller instance;

    public static QueueSearchCriteriaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new QueueSearchCriteriaJsonMarshaller();
        return instance;
    }
}
