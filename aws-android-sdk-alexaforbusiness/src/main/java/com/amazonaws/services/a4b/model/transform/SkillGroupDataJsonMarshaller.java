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
 * JSON marshaller for POJO SkillGroupData
 */
class SkillGroupDataJsonMarshaller {

    public void marshall(SkillGroupData skillGroupData, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (skillGroupData.getSkillGroupArn() != null) {
            String skillGroupArn = skillGroupData.getSkillGroupArn();
            jsonWriter.name("SkillGroupArn");
            jsonWriter.value(skillGroupArn);
        }
        if (skillGroupData.getSkillGroupName() != null) {
            String skillGroupName = skillGroupData.getSkillGroupName();
            jsonWriter.name("SkillGroupName");
            jsonWriter.value(skillGroupName);
        }
        if (skillGroupData.getDescription() != null) {
            String description = skillGroupData.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        jsonWriter.endObject();
    }

    private static SkillGroupDataJsonMarshaller instance;

    public static SkillGroupDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SkillGroupDataJsonMarshaller();
        return instance;
    }
}
