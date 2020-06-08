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
 * JSON marshaller for POJO AttackDetail
 */
class AttackDetailJsonMarshaller {

    public void marshall(AttackDetail attackDetail, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (attackDetail.getAttackId() != null) {
            String attackId = attackDetail.getAttackId();
            jsonWriter.name("AttackId");
            jsonWriter.value(attackId);
        }
        if (attackDetail.getResourceArn() != null) {
            String resourceArn = attackDetail.getResourceArn();
            jsonWriter.name("ResourceArn");
            jsonWriter.value(resourceArn);
        }
        if (attackDetail.getSubResources() != null) {
            java.util.List<SubResourceSummary> subResources = attackDetail.getSubResources();
            jsonWriter.name("SubResources");
            jsonWriter.beginArray();
            for (SubResourceSummary subResourcesItem : subResources) {
                if (subResourcesItem != null) {
                    SubResourceSummaryJsonMarshaller.getInstance().marshall(subResourcesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (attackDetail.getStartTime() != null) {
            java.util.Date startTime = attackDetail.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (attackDetail.getEndTime() != null) {
            java.util.Date endTime = attackDetail.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (attackDetail.getAttackCounters() != null) {
            java.util.List<SummarizedCounter> attackCounters = attackDetail.getAttackCounters();
            jsonWriter.name("AttackCounters");
            jsonWriter.beginArray();
            for (SummarizedCounter attackCountersItem : attackCounters) {
                if (attackCountersItem != null) {
                    SummarizedCounterJsonMarshaller.getInstance().marshall(attackCountersItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (attackDetail.getAttackProperties() != null) {
            java.util.List<AttackProperty> attackProperties = attackDetail.getAttackProperties();
            jsonWriter.name("AttackProperties");
            jsonWriter.beginArray();
            for (AttackProperty attackPropertiesItem : attackProperties) {
                if (attackPropertiesItem != null) {
                    AttackPropertyJsonMarshaller.getInstance().marshall(attackPropertiesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (attackDetail.getMitigations() != null) {
            java.util.List<Mitigation> mitigations = attackDetail.getMitigations();
            jsonWriter.name("Mitigations");
            jsonWriter.beginArray();
            for (Mitigation mitigationsItem : mitigations) {
                if (mitigationsItem != null) {
                    MitigationJsonMarshaller.getInstance().marshall(mitigationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AttackDetailJsonMarshaller instance;

    public static AttackDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AttackDetailJsonMarshaller();
        return instance;
    }
}
