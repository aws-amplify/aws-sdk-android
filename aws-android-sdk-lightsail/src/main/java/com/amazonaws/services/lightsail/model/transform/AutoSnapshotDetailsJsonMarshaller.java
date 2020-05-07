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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AutoSnapshotDetails
 */
class AutoSnapshotDetailsJsonMarshaller {

    public void marshall(AutoSnapshotDetails autoSnapshotDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (autoSnapshotDetails.getDate() != null) {
            String dateValue = autoSnapshotDetails.getDate();
            jsonWriter.name("date");
            jsonWriter.value(dateValue);
        }
        if (autoSnapshotDetails.getCreatedAt() != null) {
            java.util.Date createdAt = autoSnapshotDetails.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (autoSnapshotDetails.getStatus() != null) {
            String status = autoSnapshotDetails.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (autoSnapshotDetails.getFromAttachedDisks() != null) {
            java.util.List<AttachedDisk> fromAttachedDisks = autoSnapshotDetails
                    .getFromAttachedDisks();
            jsonWriter.name("fromAttachedDisks");
            jsonWriter.beginArray();
            for (AttachedDisk fromAttachedDisksItem : fromAttachedDisks) {
                if (fromAttachedDisksItem != null) {
                    AttachedDiskJsonMarshaller.getInstance().marshall(fromAttachedDisksItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AutoSnapshotDetailsJsonMarshaller instance;

    public static AutoSnapshotDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutoSnapshotDetailsJsonMarshaller();
        return instance;
    }
}
