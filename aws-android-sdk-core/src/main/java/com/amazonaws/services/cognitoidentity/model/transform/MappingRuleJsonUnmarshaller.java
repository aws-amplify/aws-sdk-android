/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MappingRule
 */
class MappingRuleJsonUnmarshaller implements Unmarshaller<MappingRule, JsonUnmarshallerContext> {

    public MappingRule unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MappingRule mappingRule = new MappingRule();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Claim")) {
                mappingRule.setClaim(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MatchType")) {
                mappingRule.setMatchType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Value")) {
                mappingRule.setValue(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoleARN")) {
                mappingRule.setRoleARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return mappingRule;
    }

    private static MappingRuleJsonUnmarshaller instance;

    public static MappingRuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MappingRuleJsonUnmarshaller();
        return instance;
    }
}
