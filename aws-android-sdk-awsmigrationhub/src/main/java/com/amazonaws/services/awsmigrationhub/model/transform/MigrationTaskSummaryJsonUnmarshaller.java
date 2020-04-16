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

package com.amazonaws.services.awsmigrationhub.model.transform;

import com.amazonaws.services.awsmigrationhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MigrationTaskSummary
 */
class MigrationTaskSummaryJsonUnmarshaller implements
        Unmarshaller<MigrationTaskSummary, JsonUnmarshallerContext> {

    public MigrationTaskSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MigrationTaskSummary migrationTaskSummary = new MigrationTaskSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ProgressUpdateStream")) {
                migrationTaskSummary.setProgressUpdateStream(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MigrationTaskName")) {
                migrationTaskSummary.setMigrationTaskName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                migrationTaskSummary.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProgressPercent")) {
                migrationTaskSummary.setProgressPercent(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusDetail")) {
                migrationTaskSummary.setStatusDetail(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpdateDateTime")) {
                migrationTaskSummary.setUpdateDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return migrationTaskSummary;
    }

    private static MigrationTaskSummaryJsonUnmarshaller instance;

    public static MigrationTaskSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MigrationTaskSummaryJsonUnmarshaller();
        return instance;
    }
}
