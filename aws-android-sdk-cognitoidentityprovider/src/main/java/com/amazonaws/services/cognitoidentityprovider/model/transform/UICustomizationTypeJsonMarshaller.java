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
 * JSON marshaller for POJO UICustomizationType
 */
class UICustomizationTypeJsonMarshaller {

    public void marshall(UICustomizationType uICustomizationType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (uICustomizationType.getUserPoolId() != null) {
            String userPoolId = uICustomizationType.getUserPoolId();
            jsonWriter.name("UserPoolId");
            jsonWriter.value(userPoolId);
        }
        if (uICustomizationType.getClientId() != null) {
            String clientId = uICustomizationType.getClientId();
            jsonWriter.name("ClientId");
            jsonWriter.value(clientId);
        }
        if (uICustomizationType.getImageUrl() != null) {
            String imageUrl = uICustomizationType.getImageUrl();
            jsonWriter.name("ImageUrl");
            jsonWriter.value(imageUrl);
        }
        if (uICustomizationType.getCSS() != null) {
            String cSS = uICustomizationType.getCSS();
            jsonWriter.name("CSS");
            jsonWriter.value(cSS);
        }
        if (uICustomizationType.getCSSVersion() != null) {
            String cSSVersion = uICustomizationType.getCSSVersion();
            jsonWriter.name("CSSVersion");
            jsonWriter.value(cSSVersion);
        }
        if (uICustomizationType.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = uICustomizationType.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (uICustomizationType.getCreationDate() != null) {
            java.util.Date creationDate = uICustomizationType.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        jsonWriter.endObject();
    }

    private static UICustomizationTypeJsonMarshaller instance;

    public static UICustomizationTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UICustomizationTypeJsonMarshaller();
        return instance;
    }
}
