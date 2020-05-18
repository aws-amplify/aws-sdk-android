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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BucketPermissionConfiguration
 */
class BucketPermissionConfigurationJsonMarshaller {

    public void marshall(BucketPermissionConfiguration bucketPermissionConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (bucketPermissionConfiguration.getAccountLevelPermissions() != null) {
            AccountLevelPermissions accountLevelPermissions = bucketPermissionConfiguration
                    .getAccountLevelPermissions();
            jsonWriter.name("accountLevelPermissions");
            AccountLevelPermissionsJsonMarshaller.getInstance().marshall(accountLevelPermissions,
                    jsonWriter);
        }
        if (bucketPermissionConfiguration.getBucketLevelPermissions() != null) {
            BucketLevelPermissions bucketLevelPermissions = bucketPermissionConfiguration
                    .getBucketLevelPermissions();
            jsonWriter.name("bucketLevelPermissions");
            BucketLevelPermissionsJsonMarshaller.getInstance().marshall(bucketLevelPermissions,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static BucketPermissionConfigurationJsonMarshaller instance;

    public static BucketPermissionConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BucketPermissionConfigurationJsonMarshaller();
        return instance;
    }
}
