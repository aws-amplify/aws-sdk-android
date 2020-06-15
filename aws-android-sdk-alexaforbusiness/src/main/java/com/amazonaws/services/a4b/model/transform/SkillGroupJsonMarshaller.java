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
 * JSON marshaller for POJO SkillGroup
 */
class SkillGroupJsonMarshaller {

    public void marshall(SkillGroup skillGroup, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (skillGroup.getSkillGroupArn() != null) {
            String skillGroupArn = skillGroup.getSkillGroupArn();
            jsonWriter.name("SkillGroupArn");
            jsonWriter.value(skillGroupArn);
        }
        if (skillGroup.getSkillGroupName() != null) {
            String skillGroupName = skillGroup.getSkillGroupName();
            jsonWriter.name("SkillGroupName");
            jsonWriter.value(skillGroupName);
        }
        if (skillGroup.getDescription() != null) {
            String description = skillGroup.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        jsonWriter.endObject();
    }

    private static SkillGroupJsonMarshaller instance;

    public static SkillGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SkillGroupJsonMarshaller();
        return instance;
    }
}
