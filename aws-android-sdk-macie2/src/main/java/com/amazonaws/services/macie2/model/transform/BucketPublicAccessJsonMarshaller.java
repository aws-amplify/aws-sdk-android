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
 * JSON marshaller for POJO BucketPublicAccess
 */
class BucketPublicAccessJsonMarshaller {

    public void marshall(BucketPublicAccess bucketPublicAccess, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (bucketPublicAccess.getEffectivePermission() != null) {
            String effectivePermission = bucketPublicAccess.getEffectivePermission();
            jsonWriter.name("effectivePermission");
            jsonWriter.value(effectivePermission);
        }
        if (bucketPublicAccess.getPermissionConfiguration() != null) {
            BucketPermissionConfiguration permissionConfiguration = bucketPublicAccess
                    .getPermissionConfiguration();
            jsonWriter.name("permissionConfiguration");
            BucketPermissionConfigurationJsonMarshaller.getInstance().marshall(
                    permissionConfiguration, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static BucketPublicAccessJsonMarshaller instance;

    public static BucketPublicAccessJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BucketPublicAccessJsonMarshaller();
        return instance;
    }
}
