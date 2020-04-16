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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response InviteMembersResult
 */
public class InviteMembersResultJsonUnmarshaller implements
        Unmarshaller<InviteMembersResult, JsonUnmarshallerContext> {

    public InviteMembersResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        InviteMembersResult inviteMembersResult = new InviteMembersResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("UnprocessedAccounts")) {
                inviteMembersResult.setUnprocessedAccounts(new ListUnmarshaller<Result>(
                        ResultJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return inviteMembersResult;
    }

    private static InviteMembersResultJsonUnmarshaller instance;

    public static InviteMembersResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InviteMembersResultJsonUnmarshaller();
        return instance;
    }
}
