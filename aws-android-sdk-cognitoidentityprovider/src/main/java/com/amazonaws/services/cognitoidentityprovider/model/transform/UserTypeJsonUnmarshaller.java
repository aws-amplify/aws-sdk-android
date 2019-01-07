/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO UserType
 */
class UserTypeJsonUnmarshaller implements Unmarshaller<UserType, JsonUnmarshallerContext> {

    public UserType unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UserType userType = new UserType();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Username")) {
                userType.setUsername(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Attributes")) {
                userType.setAttributes(new ListUnmarshaller<AttributeType>(
                        AttributeTypeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("UserCreateDate")) {
                userType.setUserCreateDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserLastModifiedDate")) {
                userType.setUserLastModifiedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Enabled")) {
                userType.setEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserStatus")) {
                userType.setUserStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MFAOptions")) {
                userType.setMFAOptions(new ListUnmarshaller<MFAOptionType>(
                        MFAOptionTypeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return userType;
    }

    private static UserTypeJsonUnmarshaller instance;

    public static UserTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserTypeJsonUnmarshaller();
        return instance;
    }
}
