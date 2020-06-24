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
 * JSON unmarshaller for response MergeBranchesByFastForwardResult
 */
public class MergeBranchesByFastForwardResultJsonUnmarshaller implements
        Unmarshaller<MergeBranchesByFastForwardResult, JsonUnmarshallerContext> {

    public MergeBranchesByFastForwardResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        MergeBranchesByFastForwardResult mergeBranchesByFastForwardResult = new MergeBranchesByFastForwardResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("commitId")) {
                mergeBranchesByFastForwardResult.setCommitId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("treeId")) {
                mergeBranchesByFastForwardResult.setTreeId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return mergeBranchesByFastForwardResult;
    }

    private static MergeBranchesByFastForwardResultJsonUnmarshaller instance;

    public static MergeBranchesByFastForwardResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MergeBranchesByFastForwardResultJsonUnmarshaller();
        return instance;
    }
}
