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

package com.amazonaws.services.workmail.model.transform;

import com.amazonaws.services.workmail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Permission
 */
class PermissionJsonMarshaller {

    public void marshall(Permission permission, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (permission.getGranteeId() != null) {
            String granteeId = permission.getGranteeId();
            jsonWriter.name("GranteeId");
            jsonWriter.value(granteeId);
        }
        if (permission.getGranteeType() != null) {
            String granteeType = permission.getGranteeType();
            jsonWriter.name("GranteeType");
            jsonWriter.value(granteeType);
        }
        if (permission.getPermissionValues() != null) {
            java.util.List<String> permissionValues = permission.getPermissionValues();
            jsonWriter.name("PermissionValues");
            jsonWriter.beginArray();
            for (String permissionValuesItem : permissionValues) {
                if (permissionValuesItem != null) {
                    jsonWriter.value(permissionValuesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static PermissionJsonMarshaller instance;

    public static PermissionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PermissionJsonMarshaller();
        return instance;
    }
}
