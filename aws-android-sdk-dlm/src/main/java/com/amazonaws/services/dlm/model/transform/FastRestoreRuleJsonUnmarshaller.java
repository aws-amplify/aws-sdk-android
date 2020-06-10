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

package com.amazonaws.services.dlm.model.transform;

import com.amazonaws.services.dlm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO FastRestoreRule
 */
class FastRestoreRuleJsonUnmarshaller implements
        Unmarshaller<FastRestoreRule, JsonUnmarshallerContext> {

    public FastRestoreRule unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FastRestoreRule fastRestoreRule = new FastRestoreRule();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Count")) {
                fastRestoreRule.setCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Interval")) {
                fastRestoreRule.setInterval(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IntervalUnit")) {
                fastRestoreRule.setIntervalUnit(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailabilityZones")) {
                fastRestoreRule.setAvailabilityZones(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return fastRestoreRule;
    }

    private static FastRestoreRuleJsonUnmarshaller instance;

    public static FastRestoreRuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FastRestoreRuleJsonUnmarshaller();
        return instance;
    }
}
