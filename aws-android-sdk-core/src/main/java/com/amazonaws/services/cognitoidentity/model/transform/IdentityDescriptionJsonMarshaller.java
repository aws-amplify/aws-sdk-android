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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO IdentityDescription
 */
class IdentityDescriptionJsonMarshaller {

    public void marshall(IdentityDescription identityDescription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (identityDescription.getIdentityId() != null) {
            String identityId = identityDescription.getIdentityId();
            jsonWriter.name("IdentityId");
            jsonWriter.value(identityId);
        }
        if (identityDescription.getLogins() != null) {
            java.util.List<String> logins = identityDescription.getLogins();
            jsonWriter.name("Logins");
            jsonWriter.beginArray();
            for (String loginsItem : logins) {
                if (loginsItem != null) {
                    jsonWriter.value(loginsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (identityDescription.getCreationDate() != null) {
            java.util.Date creationDate = identityDescription.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (identityDescription.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = identityDescription.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        jsonWriter.endObject();
    }

    private static IdentityDescriptionJsonMarshaller instance;

    public static IdentityDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IdentityDescriptionJsonMarshaller();
        return instance;
    }
}
