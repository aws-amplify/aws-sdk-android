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

package com.amazonaws.services.models.lex.model.transform;

import com.amazonaws.services.models.lex.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetImportResult
 */
public class GetImportResultJsonUnmarshaller implements
        Unmarshaller<GetImportResult, JsonUnmarshallerContext> {

    public GetImportResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetImportResult getImportResult = new GetImportResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                getImportResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceType")) {
                getImportResult.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("mergeStrategy")) {
                getImportResult.setMergeStrategy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("importId")) {
                getImportResult.setImportId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("importStatus")) {
                getImportResult.setImportStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("failureReason")) {
                getImportResult.setFailureReason(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("createdDate")) {
                getImportResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getImportResult;
    }

    private static GetImportResultJsonUnmarshaller instance;

    public static GetImportResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetImportResultJsonUnmarshaller();
        return instance;
    }
}
