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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO UserIdentity
 */
class UserIdentityJsonUnmarshaller implements Unmarshaller<UserIdentity, JsonUnmarshallerContext> {

    public UserIdentity unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UserIdentity userIdentity = new UserIdentity();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("assumedRole")) {
                userIdentity.setAssumedRole(AssumedRoleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsAccount")) {
                userIdentity.setAwsAccount(AwsAccountJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsService")) {
                userIdentity.setAwsService(AwsServiceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("federatedUser")) {
                userIdentity.setFederatedUser(FederatedUserJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("iamUser")) {
                userIdentity.setIamUser(IamUserJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("root")) {
                userIdentity.setRoot(UserIdentityRootJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("type")) {
                userIdentity.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return userIdentity;
    }

    private static UserIdentityJsonUnmarshaller instance;

    public static UserIdentityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserIdentityJsonUnmarshaller();
        return instance;
    }
}
