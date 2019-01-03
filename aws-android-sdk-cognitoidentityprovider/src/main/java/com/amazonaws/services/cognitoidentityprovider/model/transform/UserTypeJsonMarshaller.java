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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UserType
 */
class UserTypeJsonMarshaller {

    public void marshall(UserType userType, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (userType.getUsername() != null) {
            String username = userType.getUsername();
            jsonWriter.name("Username");
            jsonWriter.value(username);
        }
        if (userType.getAttributes() != null) {
            java.util.List<AttributeType> attributes = userType.getAttributes();
            jsonWriter.name("Attributes");
            jsonWriter.beginArray();
            for (AttributeType attributesItem : attributes) {
                if (attributesItem != null) {
                    AttributeTypeJsonMarshaller.getInstance().marshall(attributesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (userType.getUserCreateDate() != null) {
            java.util.Date userCreateDate = userType.getUserCreateDate();
            jsonWriter.name("UserCreateDate");
            jsonWriter.value(userCreateDate);
        }
        if (userType.getUserLastModifiedDate() != null) {
            java.util.Date userLastModifiedDate = userType.getUserLastModifiedDate();
            jsonWriter.name("UserLastModifiedDate");
            jsonWriter.value(userLastModifiedDate);
        }
        if (userType.getEnabled() != null) {
            Boolean enabled = userType.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (userType.getUserStatus() != null) {
            String userStatus = userType.getUserStatus();
            jsonWriter.name("UserStatus");
            jsonWriter.value(userStatus);
        }
        if (userType.getMFAOptions() != null) {
            java.util.List<MFAOptionType> mFAOptions = userType.getMFAOptions();
            jsonWriter.name("MFAOptions");
            jsonWriter.beginArray();
            for (MFAOptionType mFAOptionsItem : mFAOptions) {
                if (mFAOptionsItem != null) {
                    MFAOptionTypeJsonMarshaller.getInstance().marshall(mFAOptionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static UserTypeJsonMarshaller instance;

    public static UserTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserTypeJsonMarshaller();
        return instance;
    }
}
