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
 * JSON marshaller for POJO BucketLevelPermissions
 */
class BucketLevelPermissionsJsonMarshaller {

    public void marshall(BucketLevelPermissions bucketLevelPermissions, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (bucketLevelPermissions.getAccessControlList() != null) {
            AccessControlList accessControlList = bucketLevelPermissions.getAccessControlList();
            jsonWriter.name("AccessControlList");
            AccessControlListJsonMarshaller.getInstance().marshall(accessControlList, jsonWriter);
        }
        if (bucketLevelPermissions.getBucketPolicy() != null) {
            BucketPolicy bucketPolicy = bucketLevelPermissions.getBucketPolicy();
            jsonWriter.name("BucketPolicy");
            BucketPolicyJsonMarshaller.getInstance().marshall(bucketPolicy, jsonWriter);
        }
        if (bucketLevelPermissions.getBlockPublicAccess() != null) {
            BlockPublicAccess blockPublicAccess = bucketLevelPermissions.getBlockPublicAccess();
            jsonWriter.name("BlockPublicAccess");
            BlockPublicAccessJsonMarshaller.getInstance().marshall(blockPublicAccess, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static BucketLevelPermissionsJsonMarshaller instance;

    public static BucketLevelPermissionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BucketLevelPermissionsJsonMarshaller();
        return instance;
    }
}
