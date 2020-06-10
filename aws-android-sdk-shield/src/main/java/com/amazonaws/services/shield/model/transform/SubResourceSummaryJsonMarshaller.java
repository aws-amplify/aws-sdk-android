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
 * JSON marshaller for POJO SubResourceSummary
 */
class SubResourceSummaryJsonMarshaller {

    public void marshall(SubResourceSummary subResourceSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (subResourceSummary.getType() != null) {
            String type = subResourceSummary.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (subResourceSummary.getId() != null) {
            String id = subResourceSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (subResourceSummary.getAttackVectors() != null) {
            java.util.List<SummarizedAttackVector> attackVectors = subResourceSummary
                    .getAttackVectors();
            jsonWriter.name("AttackVectors");
            jsonWriter.beginArray();
            for (SummarizedAttackVector attackVectorsItem : attackVectors) {
                if (attackVectorsItem != null) {
                    SummarizedAttackVectorJsonMarshaller.getInstance().marshall(attackVectorsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (subResourceSummary.getCounters() != null) {
            java.util.List<SummarizedCounter> counters = subResourceSummary.getCounters();
            jsonWriter.name("Counters");
            jsonWriter.beginArray();
            for (SummarizedCounter countersItem : counters) {
                if (countersItem != null) {
                    SummarizedCounterJsonMarshaller.getInstance()
                            .marshall(countersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static SubResourceSummaryJsonMarshaller instance;

    public static SubResourceSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SubResourceSummaryJsonMarshaller();
        return instance;
    }
}
