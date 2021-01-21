/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetIdentityPoolRolesResult
 */
public class GetIdentityPoolRolesResultJsonUnmarshaller implements
        Unmarshaller<GetIdentityPoolRolesResult, JsonUnmarshallerContext> {

    public GetIdentityPoolRolesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetIdentityPoolRolesResult getIdentityPoolRolesResult = new GetIdentityPoolRolesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("IdentityPoolId")) {
                getIdentityPoolRolesResult.setIdentityPoolId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Roles")) {
                getIdentityPoolRolesResult.setRoles(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RoleMappings")) {
                getIdentityPoolRolesResult.setRoleMappings(new MapUnmarshaller<RoleMapping>(
                        RoleMappingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getIdentityPoolRolesResult;
    }

    private static GetIdentityPoolRolesResultJsonUnmarshaller instance;

    public static GetIdentityPoolRolesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetIdentityPoolRolesResultJsonUnmarshaller();
        return instance;
    }
}
