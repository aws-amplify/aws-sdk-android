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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ScheduledInstancesEbs
 */
class ScheduledInstancesEbsJsonMarshaller {

    public void marshall(ScheduledInstancesEbs scheduledInstancesEbs, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (scheduledInstancesEbs.getDeleteOnTermination() != null) {
            Boolean deleteOnTermination = scheduledInstancesEbs.getDeleteOnTermination();
            jsonWriter.name("DeleteOnTermination");
            jsonWriter.value(deleteOnTermination);
        }
        if (scheduledInstancesEbs.getEncrypted() != null) {
            Boolean encrypted = scheduledInstancesEbs.getEncrypted();
            jsonWriter.name("Encrypted");
            jsonWriter.value(encrypted);
        }
        if (scheduledInstancesEbs.getIops() != null) {
            Integer iops = scheduledInstancesEbs.getIops();
            jsonWriter.name("Iops");
            jsonWriter.value(iops);
        }
        if (scheduledInstancesEbs.getSnapshotId() != null) {
            String snapshotId = scheduledInstancesEbs.getSnapshotId();
            jsonWriter.name("SnapshotId");
            jsonWriter.value(snapshotId);
        }
        if (scheduledInstancesEbs.getVolumeSize() != null) {
            Integer volumeSize = scheduledInstancesEbs.getVolumeSize();
            jsonWriter.name("VolumeSize");
            jsonWriter.value(volumeSize);
        }
        if (scheduledInstancesEbs.getVolumeType() != null) {
            String volumeType = scheduledInstancesEbs.getVolumeType();
            jsonWriter.name("VolumeType");
            jsonWriter.value(volumeType);
        }
        jsonWriter.endObject();
    }

    private static ScheduledInstancesEbsJsonMarshaller instance;

    public static ScheduledInstancesEbsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledInstancesEbsJsonMarshaller();
        return instance;
    }
}
