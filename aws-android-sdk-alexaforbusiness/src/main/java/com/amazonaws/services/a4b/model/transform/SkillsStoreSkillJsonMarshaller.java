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
 * JSON marshaller for POJO SkillsStoreSkill
 */
class SkillsStoreSkillJsonMarshaller {

    public void marshall(SkillsStoreSkill skillsStoreSkill, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (skillsStoreSkill.getSkillId() != null) {
            String skillId = skillsStoreSkill.getSkillId();
            jsonWriter.name("SkillId");
            jsonWriter.value(skillId);
        }
        if (skillsStoreSkill.getSkillName() != null) {
            String skillName = skillsStoreSkill.getSkillName();
            jsonWriter.name("SkillName");
            jsonWriter.value(skillName);
        }
        if (skillsStoreSkill.getShortDescription() != null) {
            String shortDescription = skillsStoreSkill.getShortDescription();
            jsonWriter.name("ShortDescription");
            jsonWriter.value(shortDescription);
        }
        if (skillsStoreSkill.getIconUrl() != null) {
            String iconUrl = skillsStoreSkill.getIconUrl();
            jsonWriter.name("IconUrl");
            jsonWriter.value(iconUrl);
        }
        if (skillsStoreSkill.getSampleUtterances() != null) {
            java.util.List<String> sampleUtterances = skillsStoreSkill.getSampleUtterances();
            jsonWriter.name("SampleUtterances");
            jsonWriter.beginArray();
            for (String sampleUtterancesItem : sampleUtterances) {
                if (sampleUtterancesItem != null) {
                    jsonWriter.value(sampleUtterancesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (skillsStoreSkill.getSkillDetails() != null) {
            SkillDetails skillDetails = skillsStoreSkill.getSkillDetails();
            jsonWriter.name("SkillDetails");
            SkillDetailsJsonMarshaller.getInstance().marshall(skillDetails, jsonWriter);
        }
        if (skillsStoreSkill.getSupportsLinking() != null) {
            Boolean supportsLinking = skillsStoreSkill.getSupportsLinking();
            jsonWriter.name("SupportsLinking");
            jsonWriter.value(supportsLinking);
        }
        jsonWriter.endObject();
    }

    private static SkillsStoreSkillJsonMarshaller instance;

    public static SkillsStoreSkillJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SkillsStoreSkillJsonMarshaller();
        return instance;
    }
}
