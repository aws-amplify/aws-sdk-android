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

package com.amazonaws.services.chime.model.transform;

import com.amazonaws.services.chime.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO User
 */
class UserJsonUnmarshaller implements Unmarshaller<User, JsonUnmarshallerContext> {

    public User unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        User user = new User();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("UserId")) {
                user.setUserId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AccountId")) {
                user.setAccountId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrimaryEmail")) {
                user.setPrimaryEmail(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrimaryProvisionedNumber")) {
                user.setPrimaryProvisionedNumber(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisplayName")) {
                user.setDisplayName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LicenseType")) {
                user.setLicenseType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserType")) {
                user.setUserType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserRegistrationStatus")) {
                user.setUserRegistrationStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserInvitationStatus")) {
                user.setUserInvitationStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RegisteredOn")) {
                user.setRegisteredOn(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InvitedOn")) {
                user.setInvitedOn(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AlexaForBusinessMetadata")) {
                user.setAlexaForBusinessMetadata(AlexaForBusinessMetadataJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PersonalPIN")) {
                user.setPersonalPIN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return user;
    }

    private static UserJsonUnmarshaller instance;

    public static UserJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserJsonUnmarshaller();
        return instance;
    }
}
