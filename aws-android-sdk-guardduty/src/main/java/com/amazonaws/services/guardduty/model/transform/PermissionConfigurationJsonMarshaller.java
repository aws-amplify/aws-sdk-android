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

package com.amazonaws.services.guardduty.model.transform;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PermissionConfiguration
 */
class PermissionConfigurationJsonMarshaller {

    public void marshall(PermissionConfiguration permissionConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (permissionConfiguration.getBucketLevelPermissions() != null) {
            BucketLevelPermissions bucketLevelPermissions = permissionConfiguration
                    .getBucketLevelPermissions();
            jsonWriter.name("BucketLevelPermissions");
            BucketLevelPermissionsJsonMarshaller.getInstance().marshall(bucketLevelPermissions,
                    jsonWriter);
        }
        if (permissionConfiguration.getAccountLevelPermissions() != null) {
            AccountLevelPermissions accountLevelPermissions = permissionConfiguration
                    .getAccountLevelPermissions();
            jsonWriter.name("AccountLevelPermissions");
            AccountLevelPermissionsJsonMarshaller.getInstance().marshall(accountLevelPermissions,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static PermissionConfigurationJsonMarshaller instance;

    public static PermissionConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PermissionConfigurationJsonMarshaller();
        return instance;
    }
}
