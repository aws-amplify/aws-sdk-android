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

package com.amazonaws.services.servicecatalog.model.transform;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response CreateConstraintResult
 */
public class CreateConstraintResultJsonUnmarshaller implements
        Unmarshaller<CreateConstraintResult, JsonUnmarshallerContext> {

    public CreateConstraintResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateConstraintResult createConstraintResult = new CreateConstraintResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ConstraintDetail")) {
                createConstraintResult.setConstraintDetail(ConstraintDetailJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConstraintParameters")) {
                createConstraintResult.setConstraintParameters(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                createConstraintResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createConstraintResult;
    }

    private static CreateConstraintResultJsonUnmarshaller instance;

    public static CreateConstraintResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateConstraintResultJsonUnmarshaller();
        return instance;
    }
}
