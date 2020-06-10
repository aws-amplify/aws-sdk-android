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
 * JSON marshaller for POJO BucketCountBySharedAccessType
 */
class BucketCountBySharedAccessTypeJsonMarshaller {

    public void marshall(BucketCountBySharedAccessType bucketCountBySharedAccessType,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (bucketCountBySharedAccessType.getExternal() != null) {
            Long external = bucketCountBySharedAccessType.getExternal();
            jsonWriter.name("external");
            jsonWriter.value(external);
        }
        if (bucketCountBySharedAccessType.getInternal() != null) {
            Long internal = bucketCountBySharedAccessType.getInternal();
            jsonWriter.name("internal");
            jsonWriter.value(internal);
        }
        if (bucketCountBySharedAccessType.getNotShared() != null) {
            Long notShared = bucketCountBySharedAccessType.getNotShared();
            jsonWriter.name("notShared");
            jsonWriter.value(notShared);
        }
        jsonWriter.endObject();
    }

    private static BucketCountBySharedAccessTypeJsonMarshaller instance;

    public static BucketCountBySharedAccessTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BucketCountBySharedAccessTypeJsonMarshaller();
        return instance;
    }
}
