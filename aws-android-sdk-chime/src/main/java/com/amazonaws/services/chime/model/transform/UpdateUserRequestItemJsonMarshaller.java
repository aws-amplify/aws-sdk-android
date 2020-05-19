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
 * JSON marshaller for POJO UpdateUserRequestItem
 */
class UpdateUserRequestItemJsonMarshaller {

    public void marshall(UpdateUserRequestItem updateUserRequestItem, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (updateUserRequestItem.getUserId() != null) {
            String userId = updateUserRequestItem.getUserId();
            jsonWriter.name("UserId");
            jsonWriter.value(userId);
        }
        if (updateUserRequestItem.getLicenseType() != null) {
            String licenseType = updateUserRequestItem.getLicenseType();
            jsonWriter.name("LicenseType");
            jsonWriter.value(licenseType);
        }
        if (updateUserRequestItem.getUserType() != null) {
            String userType = updateUserRequestItem.getUserType();
            jsonWriter.name("UserType");
            jsonWriter.value(userType);
        }
        if (updateUserRequestItem.getAlexaForBusinessMetadata() != null) {
            AlexaForBusinessMetadata alexaForBusinessMetadata = updateUserRequestItem
                    .getAlexaForBusinessMetadata();
            jsonWriter.name("AlexaForBusinessMetadata");
            AlexaForBusinessMetadataJsonMarshaller.getInstance().marshall(alexaForBusinessMetadata,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static UpdateUserRequestItemJsonMarshaller instance;

    public static UpdateUserRequestItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UpdateUserRequestItemJsonMarshaller();
        return instance;
    }
}
