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

package com.amazonaws.services.amazonec2containerregistry.model.transform;

import com.amazonaws.services.amazonec2containerregistry.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DeleteRepositoryResult
 */
public class DeleteRepositoryResultJsonUnmarshaller implements
        Unmarshaller<DeleteRepositoryResult, JsonUnmarshallerContext> {

    public DeleteRepositoryResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteRepositoryResult deleteRepositoryResult = new DeleteRepositoryResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("repository")) {
                deleteRepositoryResult.setRepository(RepositoryJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return deleteRepositoryResult;
    }

    private static DeleteRepositoryResultJsonUnmarshaller instance;

    public static DeleteRepositoryResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteRepositoryResultJsonUnmarshaller();
        return instance;
    }
}
