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
 * JSON marshaller for POJO ResourceServerType
 */
class ResourceServerTypeJsonMarshaller {

    public void marshall(ResourceServerType resourceServerType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (resourceServerType.getUserPoolId() != null) {
            String userPoolId = resourceServerType.getUserPoolId();
            jsonWriter.name("UserPoolId");
            jsonWriter.value(userPoolId);
        }
        if (resourceServerType.getIdentifier() != null) {
            String identifier = resourceServerType.getIdentifier();
            jsonWriter.name("Identifier");
            jsonWriter.value(identifier);
        }
        if (resourceServerType.getName() != null) {
            String name = resourceServerType.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (resourceServerType.getScopes() != null) {
            java.util.List<ResourceServerScopeType> scopes = resourceServerType.getScopes();
            jsonWriter.name("Scopes");
            jsonWriter.beginArray();
            for (ResourceServerScopeType scopesItem : scopes) {
                if (scopesItem != null) {
                    ResourceServerScopeTypeJsonMarshaller.getInstance().marshall(scopesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ResourceServerTypeJsonMarshaller instance;

    public static ResourceServerTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceServerTypeJsonMarshaller();
        return instance;
    }
}
