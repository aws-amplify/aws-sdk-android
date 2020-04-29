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

package com.amazonaws.services.awscloudmap.model.transform;

import com.amazonaws.services.awscloudmap.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Operation
 */
class OperationJsonUnmarshaller implements Unmarshaller<Operation, JsonUnmarshallerContext> {

    public Operation unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Operation operation = new Operation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                operation.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                operation.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                operation.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ErrorMessage")) {
                operation.setErrorMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ErrorCode")) {
                operation.setErrorCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreateDate")) {
                operation.setCreateDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpdateDate")) {
                operation.setUpdateDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Targets")) {
                operation.setTargets(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return operation;
    }

    private static OperationJsonUnmarshaller instance;

    public static OperationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OperationJsonUnmarshaller();
        return instance;
    }
}
