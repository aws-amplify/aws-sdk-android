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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JdbcTarget
 */
class JdbcTargetJsonMarshaller {

    public void marshall(JdbcTarget jdbcTarget, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (jdbcTarget.getConnectionName() != null) {
            String connectionName = jdbcTarget.getConnectionName();
            jsonWriter.name("ConnectionName");
            jsonWriter.value(connectionName);
        }
        if (jdbcTarget.getPath() != null) {
            String path = jdbcTarget.getPath();
            jsonWriter.name("Path");
            jsonWriter.value(path);
        }
        if (jdbcTarget.getExclusions() != null) {
            java.util.List<String> exclusions = jdbcTarget.getExclusions();
            jsonWriter.name("Exclusions");
            jsonWriter.beginArray();
            for (String exclusionsItem : exclusions) {
                if (exclusionsItem != null) {
                    jsonWriter.value(exclusionsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static JdbcTargetJsonMarshaller instance;

    public static JdbcTargetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JdbcTargetJsonMarshaller();
        return instance;
    }
}
