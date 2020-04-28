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
 * JSON unmarshaller for response DeleteRepositoryPolicyResult
 */
public class DeleteRepositoryPolicyResultJsonUnmarshaller implements
        Unmarshaller<DeleteRepositoryPolicyResult, JsonUnmarshallerContext> {

    public DeleteRepositoryPolicyResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DeleteRepositoryPolicyResult deleteRepositoryPolicyResult = new DeleteRepositoryPolicyResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("registryId")) {
                deleteRepositoryPolicyResult.setRegistryId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("repositoryName")) {
                deleteRepositoryPolicyResult.setRepositoryName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("policyText")) {
                deleteRepositoryPolicyResult.setPolicyText(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return deleteRepositoryPolicyResult;
    }

    private static DeleteRepositoryPolicyResultJsonUnmarshaller instance;

    public static DeleteRepositoryPolicyResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteRepositoryPolicyResultJsonUnmarshaller();
        return instance;
    }
}
