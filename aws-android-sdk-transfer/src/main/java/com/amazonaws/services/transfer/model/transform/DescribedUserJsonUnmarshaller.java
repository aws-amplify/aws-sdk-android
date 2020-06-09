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

package com.amazonaws.services.transfer.model.transform;

import com.amazonaws.services.transfer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DescribedUser
 */
class DescribedUserJsonUnmarshaller implements Unmarshaller<DescribedUser, JsonUnmarshallerContext> {

    public DescribedUser unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DescribedUser describedUser = new DescribedUser();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                describedUser.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HomeDirectory")) {
                describedUser.setHomeDirectory(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HomeDirectoryMappings")) {
                describedUser.setHomeDirectoryMappings(new ListUnmarshaller<HomeDirectoryMapEntry>(
                        HomeDirectoryMapEntryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("HomeDirectoryType")) {
                describedUser.setHomeDirectoryType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Policy")) {
                describedUser.setPolicy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Role")) {
                describedUser.setRole(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SshPublicKeys")) {
                describedUser.setSshPublicKeys(new ListUnmarshaller<SshPublicKey>(
                        SshPublicKeyJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Tags")) {
                describedUser.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("UserName")) {
                describedUser.setUserName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return describedUser;
    }

    private static DescribedUserJsonUnmarshaller instance;

    public static DescribedUserJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribedUserJsonUnmarshaller();
        return instance;
    }
}
