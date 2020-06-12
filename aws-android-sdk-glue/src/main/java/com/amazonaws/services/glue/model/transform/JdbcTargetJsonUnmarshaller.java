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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO JdbcTarget
 */
class JdbcTargetJsonUnmarshaller implements Unmarshaller<JdbcTarget, JsonUnmarshallerContext> {

    public JdbcTarget unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        JdbcTarget jdbcTarget = new JdbcTarget();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ConnectionName")) {
                jdbcTarget.setConnectionName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Path")) {
                jdbcTarget.setPath(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Exclusions")) {
                jdbcTarget.setExclusions(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return jdbcTarget;
    }

    private static JdbcTargetJsonUnmarshaller instance;

    public static JdbcTargetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JdbcTargetJsonUnmarshaller();
        return instance;
    }
}
