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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PrincipalPermissions
 */
class PrincipalPermissionsJsonMarshaller {

    public void marshall(PrincipalPermissions principalPermissions, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (principalPermissions.getPrincipal() != null) {
            DataLakePrincipal principal = principalPermissions.getPrincipal();
            jsonWriter.name("Principal");
            DataLakePrincipalJsonMarshaller.getInstance().marshall(principal, jsonWriter);
        }
        if (principalPermissions.getPermissions() != null) {
            java.util.List<String> permissions = principalPermissions.getPermissions();
            jsonWriter.name("Permissions");
            jsonWriter.beginArray();
            for (String permissionsItem : permissions) {
                if (permissionsItem != null) {
                    jsonWriter.value(permissionsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static PrincipalPermissionsJsonMarshaller instance;

    public static PrincipalPermissionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PrincipalPermissionsJsonMarshaller();
        return instance;
    }
}
