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

package com.amazonaws.services.awstransferfamily.model.transform;

import com.amazonaws.services.awstransferfamily.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response UpdateUserResult
 */
public class UpdateUserResultJsonUnmarshaller implements
        Unmarshaller<UpdateUserResult, JsonUnmarshallerContext> {

    public UpdateUserResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateUserResult updateUserResult = new UpdateUserResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ServerId")) {
                updateUserResult.setServerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserName")) {
                updateUserResult.setUserName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateUserResult;
    }

    private static UpdateUserResultJsonUnmarshaller instance;

    public static UpdateUserResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateUserResultJsonUnmarshaller();
        return instance;
    }
}
