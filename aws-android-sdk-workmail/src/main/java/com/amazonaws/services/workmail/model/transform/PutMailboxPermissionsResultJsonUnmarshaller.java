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

package com.amazonaws.services.workmail.model.transform;

import com.amazonaws.services.workmail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response PutMailboxPermissionsResult
 */
public class PutMailboxPermissionsResultJsonUnmarshaller implements
        Unmarshaller<PutMailboxPermissionsResult, JsonUnmarshallerContext> {

    public PutMailboxPermissionsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutMailboxPermissionsResult putMailboxPermissionsResult = new PutMailboxPermissionsResult();

        return putMailboxPermissionsResult;
    }

    private static PutMailboxPermissionsResultJsonUnmarshaller instance;

    public static PutMailboxPermissionsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutMailboxPermissionsResultJsonUnmarshaller();
        return instance;
    }
}
