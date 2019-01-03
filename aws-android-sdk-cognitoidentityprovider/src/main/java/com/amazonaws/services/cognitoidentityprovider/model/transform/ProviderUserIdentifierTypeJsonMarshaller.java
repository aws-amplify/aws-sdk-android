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
 * JSON marshaller for POJO ProviderUserIdentifierType
 */
class ProviderUserIdentifierTypeJsonMarshaller {

    public void marshall(ProviderUserIdentifierType providerUserIdentifierType,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (providerUserIdentifierType.getProviderName() != null) {
            String providerName = providerUserIdentifierType.getProviderName();
            jsonWriter.name("ProviderName");
            jsonWriter.value(providerName);
        }
        if (providerUserIdentifierType.getProviderAttributeName() != null) {
            String providerAttributeName = providerUserIdentifierType.getProviderAttributeName();
            jsonWriter.name("ProviderAttributeName");
            jsonWriter.value(providerAttributeName);
        }
        if (providerUserIdentifierType.getProviderAttributeValue() != null) {
            String providerAttributeValue = providerUserIdentifierType.getProviderAttributeValue();
            jsonWriter.name("ProviderAttributeValue");
            jsonWriter.value(providerAttributeValue);
        }
        jsonWriter.endObject();
    }

    private static ProviderUserIdentifierTypeJsonMarshaller instance;

    public static ProviderUserIdentifierTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProviderUserIdentifierTypeJsonMarshaller();
        return instance;
    }
}
