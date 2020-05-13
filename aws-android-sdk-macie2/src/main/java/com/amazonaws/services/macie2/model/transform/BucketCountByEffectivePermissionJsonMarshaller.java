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
 * JSON marshaller for POJO BucketCountByEffectivePermission
 */
class BucketCountByEffectivePermissionJsonMarshaller {

    public void marshall(BucketCountByEffectivePermission bucketCountByEffectivePermission,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (bucketCountByEffectivePermission.getPubliclyAccessible() != null) {
            Long publiclyAccessible = bucketCountByEffectivePermission.getPubliclyAccessible();
            jsonWriter.name("publiclyAccessible");
            jsonWriter.value(publiclyAccessible);
        }
        if (bucketCountByEffectivePermission.getPubliclyReadable() != null) {
            Long publiclyReadable = bucketCountByEffectivePermission.getPubliclyReadable();
            jsonWriter.name("publiclyReadable");
            jsonWriter.value(publiclyReadable);
        }
        if (bucketCountByEffectivePermission.getPubliclyWritable() != null) {
            Long publiclyWritable = bucketCountByEffectivePermission.getPubliclyWritable();
            jsonWriter.name("publiclyWritable");
            jsonWriter.value(publiclyWritable);
        }
        jsonWriter.endObject();
    }

    private static BucketCountByEffectivePermissionJsonMarshaller instance;

    public static BucketCountByEffectivePermissionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BucketCountByEffectivePermissionJsonMarshaller();
        return instance;
    }
}
