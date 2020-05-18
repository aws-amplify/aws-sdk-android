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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO User
 */
class UserJsonMarshaller {

    public void marshall(User user, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (user.getUserId() != null) {
            String userId = user.getUserId();
            jsonWriter.name("UserId");
            jsonWriter.value(userId);
        }
        if (user.getAccountId() != null) {
            String accountId = user.getAccountId();
            jsonWriter.name("AccountId");
            jsonWriter.value(accountId);
        }
        if (user.getPrimaryEmail() != null) {
            String primaryEmail = user.getPrimaryEmail();
            jsonWriter.name("PrimaryEmail");
            jsonWriter.value(primaryEmail);
        }
        if (user.getPrimaryProvisionedNumber() != null) {
            String primaryProvisionedNumber = user.getPrimaryProvisionedNumber();
            jsonWriter.name("PrimaryProvisionedNumber");
            jsonWriter.value(primaryProvisionedNumber);
        }
        if (user.getDisplayName() != null) {
            String displayName = user.getDisplayName();
            jsonWriter.name("DisplayName");
            jsonWriter.value(displayName);
        }
        if (user.getLicenseType() != null) {
            String licenseType = user.getLicenseType();
            jsonWriter.name("LicenseType");
            jsonWriter.value(licenseType);
        }
        if (user.getUserType() != null) {
            String userType = user.getUserType();
            jsonWriter.name("UserType");
            jsonWriter.value(userType);
        }
        if (user.getUserRegistrationStatus() != null) {
            String userRegistrationStatus = user.getUserRegistrationStatus();
            jsonWriter.name("UserRegistrationStatus");
            jsonWriter.value(userRegistrationStatus);
        }
        if (user.getUserInvitationStatus() != null) {
            String userInvitationStatus = user.getUserInvitationStatus();
            jsonWriter.name("UserInvitationStatus");
            jsonWriter.value(userInvitationStatus);
        }
        if (user.getRegisteredOn() != null) {
            java.util.Date registeredOn = user.getRegisteredOn();
            jsonWriter.name("RegisteredOn");
            jsonWriter.value(registeredOn);
        }
        if (user.getInvitedOn() != null) {
            java.util.Date invitedOn = user.getInvitedOn();
            jsonWriter.name("InvitedOn");
            jsonWriter.value(invitedOn);
        }
        if (user.getAlexaForBusinessMetadata() != null) {
            AlexaForBusinessMetadata alexaForBusinessMetadata = user.getAlexaForBusinessMetadata();
            jsonWriter.name("AlexaForBusinessMetadata");
            AlexaForBusinessMetadataJsonMarshaller.getInstance().marshall(alexaForBusinessMetadata,
                    jsonWriter);
        }
        if (user.getPersonalPIN() != null) {
            String personalPIN = user.getPersonalPIN();
            jsonWriter.name("PersonalPIN");
            jsonWriter.value(personalPIN);
        }
        jsonWriter.endObject();
    }

    private static UserJsonMarshaller instance;

    public static UserJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserJsonMarshaller();
        return instance;
    }
}
