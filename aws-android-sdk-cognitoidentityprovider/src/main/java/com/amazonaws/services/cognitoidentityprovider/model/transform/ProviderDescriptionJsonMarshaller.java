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
 * JSON marshaller for POJO ProviderDescription
 */
class ProviderDescriptionJsonMarshaller {

    public void marshall(ProviderDescription providerDescription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (providerDescription.getProviderName() != null) {
            String providerName = providerDescription.getProviderName();
            jsonWriter.name("ProviderName");
            jsonWriter.value(providerName);
        }
        if (providerDescription.getProviderType() != null) {
            String providerType = providerDescription.getProviderType();
            jsonWriter.name("ProviderType");
            jsonWriter.value(providerType);
        }
        if (providerDescription.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = providerDescription.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (providerDescription.getCreationDate() != null) {
            java.util.Date creationDate = providerDescription.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        jsonWriter.endObject();
    }

    private static ProviderDescriptionJsonMarshaller instance;

    public static ProviderDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProviderDescriptionJsonMarshaller();
        return instance;
    }
}
