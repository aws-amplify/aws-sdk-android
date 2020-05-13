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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Severity
 */
class SeverityJsonMarshaller {

    public void marshall(Severity severity, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (severity.getDescription() != null) {
            String description = severity.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (severity.getScore() != null) {
            Long score = severity.getScore();
            jsonWriter.name("score");
            jsonWriter.value(score);
        }
        jsonWriter.endObject();
    }

    private static SeverityJsonMarshaller instance;

    public static SeverityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SeverityJsonMarshaller();
        return instance;
    }
}
