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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CriterionAdditionalProperties
 */
class CriterionAdditionalPropertiesJsonUnmarshaller implements
        Unmarshaller<CriterionAdditionalProperties, JsonUnmarshallerContext> {

    public CriterionAdditionalProperties unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CriterionAdditionalProperties criterionAdditionalProperties = new CriterionAdditionalProperties();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("eq")) {
                criterionAdditionalProperties.setEq(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("gt")) {
                criterionAdditionalProperties.setGt(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("gte")) {
                criterionAdditionalProperties.setGte(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lt")) {
                criterionAdditionalProperties.setLt(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lte")) {
                criterionAdditionalProperties.setLte(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("neq")) {
                criterionAdditionalProperties.setNeq(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return criterionAdditionalProperties;
    }

    private static CriterionAdditionalPropertiesJsonUnmarshaller instance;

    public static CriterionAdditionalPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CriterionAdditionalPropertiesJsonUnmarshaller();
        return instance;
    }
}
