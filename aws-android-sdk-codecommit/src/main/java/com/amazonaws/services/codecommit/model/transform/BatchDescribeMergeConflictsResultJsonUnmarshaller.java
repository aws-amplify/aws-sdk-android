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

package com.amazonaws.services.codecommit.model.transform;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response BatchDescribeMergeConflictsResult
 */
public class BatchDescribeMergeConflictsResultJsonUnmarshaller implements
        Unmarshaller<BatchDescribeMergeConflictsResult, JsonUnmarshallerContext> {

    public BatchDescribeMergeConflictsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        BatchDescribeMergeConflictsResult batchDescribeMergeConflictsResult = new BatchDescribeMergeConflictsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("conflicts")) {
                batchDescribeMergeConflictsResult.setConflicts(new ListUnmarshaller<Conflict>(
                        ConflictJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("nextToken")) {
                batchDescribeMergeConflictsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("errors")) {
                batchDescribeMergeConflictsResult
                        .setErrors(new ListUnmarshaller<BatchDescribeMergeConflictsError>(
                                BatchDescribeMergeConflictsErrorJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("destinationCommitId")) {
                batchDescribeMergeConflictsResult.setDestinationCommitId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("sourceCommitId")) {
                batchDescribeMergeConflictsResult.setSourceCommitId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("baseCommitId")) {
                batchDescribeMergeConflictsResult.setBaseCommitId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return batchDescribeMergeConflictsResult;
    }

    private static BatchDescribeMergeConflictsResultJsonUnmarshaller instance;

    public static BatchDescribeMergeConflictsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchDescribeMergeConflictsResultJsonUnmarshaller();
        return instance;
    }
}
