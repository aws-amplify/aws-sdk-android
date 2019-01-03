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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RoleAliasDescription
 */
class RoleAliasDescriptionJsonMarshaller {

    public void marshall(RoleAliasDescription roleAliasDescription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (roleAliasDescription.getRoleAlias() != null) {
            String roleAlias = roleAliasDescription.getRoleAlias();
            jsonWriter.name("roleAlias");
            jsonWriter.value(roleAlias);
        }
        if (roleAliasDescription.getRoleAliasArn() != null) {
            String roleAliasArn = roleAliasDescription.getRoleAliasArn();
            jsonWriter.name("roleAliasArn");
            jsonWriter.value(roleAliasArn);
        }
        if (roleAliasDescription.getRoleArn() != null) {
            String roleArn = roleAliasDescription.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (roleAliasDescription.getOwner() != null) {
            String owner = roleAliasDescription.getOwner();
            jsonWriter.name("owner");
            jsonWriter.value(owner);
        }
        if (roleAliasDescription.getCredentialDurationSeconds() != null) {
            Integer credentialDurationSeconds = roleAliasDescription.getCredentialDurationSeconds();
            jsonWriter.name("credentialDurationSeconds");
            jsonWriter.value(credentialDurationSeconds);
        }
        if (roleAliasDescription.getCreationDate() != null) {
            java.util.Date creationDate = roleAliasDescription.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        if (roleAliasDescription.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = roleAliasDescription.getLastModifiedDate();
            jsonWriter.name("lastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        jsonWriter.endObject();
    }

    private static RoleAliasDescriptionJsonMarshaller instance;

    public static RoleAliasDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RoleAliasDescriptionJsonMarshaller();
        return instance;
    }
}
