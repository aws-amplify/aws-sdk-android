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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response UpdateTemplateResult
 */
public class UpdateTemplateResultJsonUnmarshaller implements
        Unmarshaller<UpdateTemplateResult, JsonUnmarshallerContext> {

    public UpdateTemplateResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateTemplateResult updateTemplateResult = new UpdateTemplateResult();

        updateTemplateResult.setStatus(context.getHttpResponse().getStatusCode());
        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TemplateId")) {
                updateTemplateResult.setTemplateId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arn")) {
                updateTemplateResult.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VersionArn")) {
                updateTemplateResult.setVersionArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationStatus")) {
                updateTemplateResult.setCreationStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                updateTemplateResult.setStatus(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestId")) {
                updateTemplateResult.setRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateTemplateResult;
    }

    private static UpdateTemplateResultJsonUnmarshaller instance;

    public static UpdateTemplateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateTemplateResultJsonUnmarshaller();
        return instance;
    }
}
