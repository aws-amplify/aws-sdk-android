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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO SkillsStoreSkill
 */
class SkillsStoreSkillJsonUnmarshaller implements
        Unmarshaller<SkillsStoreSkill, JsonUnmarshallerContext> {

    public SkillsStoreSkill unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SkillsStoreSkill skillsStoreSkill = new SkillsStoreSkill();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("SkillId")) {
                skillsStoreSkill.setSkillId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SkillName")) {
                skillsStoreSkill.setSkillName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ShortDescription")) {
                skillsStoreSkill.setShortDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IconUrl")) {
                skillsStoreSkill.setIconUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SampleUtterances")) {
                skillsStoreSkill.setSampleUtterances(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SkillDetails")) {
                skillsStoreSkill.setSkillDetails(SkillDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SupportsLinking")) {
                skillsStoreSkill.setSupportsLinking(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return skillsStoreSkill;
    }

    private static SkillsStoreSkillJsonUnmarshaller instance;

    public static SkillsStoreSkillJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SkillsStoreSkillJsonUnmarshaller();
        return instance;
    }
}
