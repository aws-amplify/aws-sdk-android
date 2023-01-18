/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for POJO UserSearchSummary
 */
class UserSearchSummaryJsonUnmarshaller implements
        Unmarshaller<UserSearchSummary, JsonUnmarshallerContext> {

    public UserSearchSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UserSearchSummary userSearchSummary = new UserSearchSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                userSearchSummary.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DirectoryUserId")) {
                userSearchSummary.setDirectoryUserId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HierarchyGroupId")) {
                userSearchSummary.setHierarchyGroupId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                userSearchSummary.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IdentityInfo")) {
                userSearchSummary.setIdentityInfo(UserIdentityInfoLiteJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PhoneConfig")) {
                userSearchSummary.setPhoneConfig(UserPhoneConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoutingProfileId")) {
                userSearchSummary.setRoutingProfileId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecurityProfileIds")) {
                userSearchSummary.setSecurityProfileIds(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Tags")) {
                userSearchSummary.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Username")) {
                userSearchSummary.setUsername(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return userSearchSummary;
    }

    private static UserSearchSummaryJsonUnmarshaller instance;

    public static UserSearchSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserSearchSummaryJsonUnmarshaller();
        return instance;
    }
}
