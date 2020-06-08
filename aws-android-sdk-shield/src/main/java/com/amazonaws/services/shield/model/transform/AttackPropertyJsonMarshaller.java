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
 * JSON marshaller for POJO AttackProperty
 */
class AttackPropertyJsonMarshaller {

    public void marshall(AttackProperty attackProperty, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (attackProperty.getAttackLayer() != null) {
            String attackLayer = attackProperty.getAttackLayer();
            jsonWriter.name("AttackLayer");
            jsonWriter.value(attackLayer);
        }
        if (attackProperty.getAttackPropertyIdentifier() != null) {
            String attackPropertyIdentifier = attackProperty.getAttackPropertyIdentifier();
            jsonWriter.name("AttackPropertyIdentifier");
            jsonWriter.value(attackPropertyIdentifier);
        }
        if (attackProperty.getTopContributors() != null) {
            java.util.List<Contributor> topContributors = attackProperty.getTopContributors();
            jsonWriter.name("TopContributors");
            jsonWriter.beginArray();
            for (Contributor topContributorsItem : topContributors) {
                if (topContributorsItem != null) {
                    ContributorJsonMarshaller.getInstance().marshall(topContributorsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (attackProperty.getUnit() != null) {
            String unit = attackProperty.getUnit();
            jsonWriter.name("Unit");
            jsonWriter.value(unit);
        }
        if (attackProperty.getTotal() != null) {
            Long total = attackProperty.getTotal();
            jsonWriter.name("Total");
            jsonWriter.value(total);
        }
        jsonWriter.endObject();
    }

    private static AttackPropertyJsonMarshaller instance;

    public static AttackPropertyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AttackPropertyJsonMarshaller();
        return instance;
    }
}
