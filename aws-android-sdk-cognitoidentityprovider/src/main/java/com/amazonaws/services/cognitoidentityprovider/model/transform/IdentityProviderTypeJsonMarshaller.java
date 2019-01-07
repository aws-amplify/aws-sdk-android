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
 * JSON marshaller for POJO IdentityProviderType
 */
class IdentityProviderTypeJsonMarshaller {

    public void marshall(IdentityProviderType identityProviderType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (identityProviderType.getUserPoolId() != null) {
            String userPoolId = identityProviderType.getUserPoolId();
            jsonWriter.name("UserPoolId");
            jsonWriter.value(userPoolId);
        }
        if (identityProviderType.getProviderName() != null) {
            String providerName = identityProviderType.getProviderName();
            jsonWriter.name("ProviderName");
            jsonWriter.value(providerName);
        }
        if (identityProviderType.getProviderType() != null) {
            String providerType = identityProviderType.getProviderType();
            jsonWriter.name("ProviderType");
            jsonWriter.value(providerType);
        }
        if (identityProviderType.getProviderDetails() != null) {
            java.util.Map<String, String> providerDetails = identityProviderType
                    .getProviderDetails();
            jsonWriter.name("ProviderDetails");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> providerDetailsEntry : providerDetails
                    .entrySet()) {
                String providerDetailsValue = providerDetailsEntry.getValue();
                if (providerDetailsValue != null) {
                    jsonWriter.name(providerDetailsEntry.getKey());
                    jsonWriter.value(providerDetailsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (identityProviderType.getAttributeMapping() != null) {
            java.util.Map<String, String> attributeMapping = identityProviderType
                    .getAttributeMapping();
            jsonWriter.name("AttributeMapping");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> attributeMappingEntry : attributeMapping
                    .entrySet()) {
                String attributeMappingValue = attributeMappingEntry.getValue();
                if (attributeMappingValue != null) {
                    jsonWriter.name(attributeMappingEntry.getKey());
                    jsonWriter.value(attributeMappingValue);
                }
            }
            jsonWriter.endObject();
        }
        if (identityProviderType.getIdpIdentifiers() != null) {
            java.util.List<String> idpIdentifiers = identityProviderType.getIdpIdentifiers();
            jsonWriter.name("IdpIdentifiers");
            jsonWriter.beginArray();
            for (String idpIdentifiersItem : idpIdentifiers) {
                if (idpIdentifiersItem != null) {
                    jsonWriter.value(idpIdentifiersItem);
                }
            }
            jsonWriter.endArray();
        }
        if (identityProviderType.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = identityProviderType.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (identityProviderType.getCreationDate() != null) {
            java.util.Date creationDate = identityProviderType.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        jsonWriter.endObject();
    }

    private static IdentityProviderTypeJsonMarshaller instance;

    public static IdentityProviderTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IdentityProviderTypeJsonMarshaller();
        return instance;
    }
}
