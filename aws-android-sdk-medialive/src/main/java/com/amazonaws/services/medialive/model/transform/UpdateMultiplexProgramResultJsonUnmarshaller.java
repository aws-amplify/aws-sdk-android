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

package com.amazonaws.services.medialive.model.transform;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response UpdateMultiplexProgramResult
 */
public class UpdateMultiplexProgramResultJsonUnmarshaller implements
        Unmarshaller<UpdateMultiplexProgramResult, JsonUnmarshallerContext> {

    public UpdateMultiplexProgramResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        UpdateMultiplexProgramResult updateMultiplexProgramResult = new UpdateMultiplexProgramResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("MultiplexProgram")) {
                updateMultiplexProgramResult.setMultiplexProgram(MultiplexProgramJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateMultiplexProgramResult;
    }

    private static UpdateMultiplexProgramResultJsonUnmarshaller instance;

    public static UpdateMultiplexProgramResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateMultiplexProgramResultJsonUnmarshaller();
        return instance;
    }
}
