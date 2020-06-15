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

package com.amazonaws.services.a4b.model.transform;

import com.amazonaws.services.a4b.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SkillSummary
 */
class SkillSummaryJsonMarshaller {

    public void marshall(SkillSummary skillSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (skillSummary.getSkillId() != null) {
            String skillId = skillSummary.getSkillId();
            jsonWriter.name("SkillId");
            jsonWriter.value(skillId);
        }
        if (skillSummary.getSkillName() != null) {
            String skillName = skillSummary.getSkillName();
            jsonWriter.name("SkillName");
            jsonWriter.value(skillName);
        }
        if (skillSummary.getSupportsLinking() != null) {
            Boolean supportsLinking = skillSummary.getSupportsLinking();
            jsonWriter.name("SupportsLinking");
            jsonWriter.value(supportsLinking);
        }
        if (skillSummary.getEnablementType() != null) {
            String enablementType = skillSummary.getEnablementType();
            jsonWriter.name("EnablementType");
            jsonWriter.value(enablementType);
        }
        if (skillSummary.getSkillType() != null) {
            String skillType = skillSummary.getSkillType();
            jsonWriter.name("SkillType");
            jsonWriter.value(skillType);
        }
        jsonWriter.endObject();
    }

    private static SkillSummaryJsonMarshaller instance;

    public static SkillSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SkillSummaryJsonMarshaller();
        return instance;
    }
}
