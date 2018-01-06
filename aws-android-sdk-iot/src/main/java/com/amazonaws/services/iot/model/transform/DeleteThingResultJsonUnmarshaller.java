/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DeleteThingResult
 */
public class DeleteThingResultJsonUnmarshaller implements
        Unmarshaller<DeleteThingResult, JsonUnmarshallerContext> {

    public DeleteThingResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteThingResult deleteThingResult = new DeleteThingResult();

        return deleteThingResult;
    }

    private static DeleteThingResultJsonUnmarshaller instance;

    public static DeleteThingResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteThingResultJsonUnmarshaller();
        return instance;
    }
}
