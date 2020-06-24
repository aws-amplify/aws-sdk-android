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
 * JSON unmarshaller for response GetMergeConflictsResult
 */
public class GetMergeConflictsResultJsonUnmarshaller implements
        Unmarshaller<GetMergeConflictsResult, JsonUnmarshallerContext> {

    public GetMergeConflictsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMergeConflictsResult getMergeConflictsResult = new GetMergeConflictsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("mergeable")) {
                getMergeConflictsResult.setMergeable(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("destinationCommitId")) {
                getMergeConflictsResult.setDestinationCommitId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sourceCommitId")) {
                getMergeConflictsResult.setSourceCommitId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("baseCommitId")) {
                getMergeConflictsResult.setBaseCommitId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("conflictMetadataList")) {
                getMergeConflictsResult
                        .setConflictMetadataList(new ListUnmarshaller<ConflictMetadata>(
                                ConflictMetadataJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("nextToken")) {
                getMergeConflictsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getMergeConflictsResult;
    }

    private static GetMergeConflictsResultJsonUnmarshaller instance;

    public static GetMergeConflictsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMergeConflictsResultJsonUnmarshaller();
        return instance;
    }
}
