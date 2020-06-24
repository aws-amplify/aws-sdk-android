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

package com.amazonaws.services.amplify.model.transform;

import com.amazonaws.services.amplify.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListArtifactsResult
 */
public class ListArtifactsResultJsonUnmarshaller implements
        Unmarshaller<ListArtifactsResult, JsonUnmarshallerContext> {

    public ListArtifactsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListArtifactsResult listArtifactsResult = new ListArtifactsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("artifacts")) {
                listArtifactsResult.setArtifacts(new ListUnmarshaller<Artifact>(
                        ArtifactJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("nextToken")) {
                listArtifactsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listArtifactsResult;
    }

    private static ListArtifactsResultJsonUnmarshaller instance;

    public static ListArtifactsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListArtifactsResultJsonUnmarshaller();
        return instance;
    }
}
