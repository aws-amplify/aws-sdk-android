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

package com.amazonaws.services.shield.model.transform;

import com.amazonaws.services.shield.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AttackSummary
 */
class AttackSummaryJsonMarshaller {

    public void marshall(AttackSummary attackSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (attackSummary.getAttackId() != null) {
            String attackId = attackSummary.getAttackId();
            jsonWriter.name("AttackId");
            jsonWriter.value(attackId);
        }
        if (attackSummary.getResourceArn() != null) {
            String resourceArn = attackSummary.getResourceArn();
            jsonWriter.name("ResourceArn");
            jsonWriter.value(resourceArn);
        }
        if (attackSummary.getStartTime() != null) {
            java.util.Date startTime = attackSummary.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (attackSummary.getEndTime() != null) {
            java.util.Date endTime = attackSummary.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (attackSummary.getAttackVectors() != null) {
            java.util.List<AttackVectorDescription> attackVectors = attackSummary
                    .getAttackVectors();
            jsonWriter.name("AttackVectors");
            jsonWriter.beginArray();
            for (AttackVectorDescription attackVectorsItem : attackVectors) {
                if (attackVectorsItem != null) {
                    AttackVectorDescriptionJsonMarshaller.getInstance().marshall(attackVectorsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AttackSummaryJsonMarshaller instance;

    public static AttackSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AttackSummaryJsonMarshaller();
        return instance;
    }
}
