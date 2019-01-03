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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO RoleAliasDescription
 */
class RoleAliasDescriptionJsonUnmarshaller implements
        Unmarshaller<RoleAliasDescription, JsonUnmarshallerContext> {

    public RoleAliasDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RoleAliasDescription roleAliasDescription = new RoleAliasDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("roleAlias")) {
                roleAliasDescription.setRoleAlias(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("roleAliasArn")) {
                roleAliasDescription.setRoleAliasArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("roleArn")) {
                roleAliasDescription.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("owner")) {
                roleAliasDescription.setOwner(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("credentialDurationSeconds")) {
                roleAliasDescription.setCredentialDurationSeconds(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationDate")) {
                roleAliasDescription.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastModifiedDate")) {
                roleAliasDescription.setLastModifiedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return roleAliasDescription;
    }

    private static RoleAliasDescriptionJsonUnmarshaller instance;

    public static RoleAliasDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RoleAliasDescriptionJsonUnmarshaller();
        return instance;
    }
}
