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
 * JSON unmarshaller for POJO UserData
 */
class UserDataJsonUnmarshaller implements Unmarshaller<UserData, JsonUnmarshallerContext> {

    public UserData unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UserData userData = new UserData();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("User")) {
                userData.setUser(UserReferenceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoutingProfile")) {
                userData.setRoutingProfile(RoutingProfileReferenceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HierarchyPath")) {
                userData.setHierarchyPath(HierarchyPathReferenceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                userData.setStatus(AgentStatusReferenceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailableSlotsByChannel")) {
                userData.setAvailableSlotsByChannel(new MapUnmarshaller<Integer>(
                        IntegerJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("MaxSlotsByChannel")) {
                userData.setMaxSlotsByChannel(new MapUnmarshaller<Integer>(IntegerJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ActiveSlotsByChannel")) {
                userData.setActiveSlotsByChannel(new MapUnmarshaller<Integer>(
                        IntegerJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Contacts")) {
                userData.setContacts(new ListUnmarshaller<AgentContactReference>(
                        AgentContactReferenceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextStatus")) {
                userData.setNextStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return userData;
    }

    private static UserDataJsonUnmarshaller instance;

    public static UserDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserDataJsonUnmarshaller();
        return instance;
    }
}
