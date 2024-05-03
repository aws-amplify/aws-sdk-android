/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response UpdateParticipantRoleConfigResult
 */
public class UpdateParticipantRoleConfigResultJsonUnmarshaller implements
        Unmarshaller<UpdateParticipantRoleConfigResult, JsonUnmarshallerContext> {

    public UpdateParticipantRoleConfigResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        UpdateParticipantRoleConfigResult updateParticipantRoleConfigResult = new UpdateParticipantRoleConfigResult();

        return updateParticipantRoleConfigResult;
    }

    private static UpdateParticipantRoleConfigResultJsonUnmarshaller instance;

    public static UpdateParticipantRoleConfigResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateParticipantRoleConfigResultJsonUnmarshaller();
        return instance;
    }
}
