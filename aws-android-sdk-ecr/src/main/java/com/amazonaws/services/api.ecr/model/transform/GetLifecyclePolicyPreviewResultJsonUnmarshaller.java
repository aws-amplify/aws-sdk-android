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

package com.amazonaws.services.api.ecr.model.transform;

import com.amazonaws.services.api.ecr.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetLifecyclePolicyPreviewResult
 */
public class GetLifecyclePolicyPreviewResultJsonUnmarshaller implements
        Unmarshaller<GetLifecyclePolicyPreviewResult, JsonUnmarshallerContext> {

    public GetLifecyclePolicyPreviewResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetLifecyclePolicyPreviewResult getLifecyclePolicyPreviewResult = new GetLifecyclePolicyPreviewResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("registryId")) {
                getLifecyclePolicyPreviewResult.setRegistryId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("repositoryName")) {
                getLifecyclePolicyPreviewResult.setRepositoryName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("lifecyclePolicyText")) {
                getLifecyclePolicyPreviewResult.setLifecyclePolicyText(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                getLifecyclePolicyPreviewResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("nextToken")) {
                getLifecyclePolicyPreviewResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("previewResults")) {
                getLifecyclePolicyPreviewResult
                        .setPreviewResults(new ListUnmarshaller<LifecyclePolicyPreviewResult>(
                                LifecyclePolicyPreviewResultJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("summary")) {
                getLifecyclePolicyPreviewResult
                        .setSummary(LifecyclePolicyPreviewSummaryJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getLifecyclePolicyPreviewResult;
    }

    private static GetLifecyclePolicyPreviewResultJsonUnmarshaller instance;

    public static GetLifecyclePolicyPreviewResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetLifecyclePolicyPreviewResultJsonUnmarshaller();
        return instance;
    }
}
