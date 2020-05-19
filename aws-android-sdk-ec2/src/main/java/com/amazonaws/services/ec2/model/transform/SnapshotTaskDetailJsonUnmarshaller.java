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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO SnapshotTaskDetail
 */
class SnapshotTaskDetailJsonUnmarshaller implements
        Unmarshaller<SnapshotTaskDetail, JsonUnmarshallerContext> {

    public SnapshotTaskDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SnapshotTaskDetail snapshotTaskDetail = new SnapshotTaskDetail();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Description")) {
                snapshotTaskDetail.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DiskImageSize")) {
                snapshotTaskDetail.setDiskImageSize(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Encrypted")) {
                snapshotTaskDetail.setEncrypted(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Format")) {
                snapshotTaskDetail.setFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KmsKeyId")) {
                snapshotTaskDetail.setKmsKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Progress")) {
                snapshotTaskDetail.setProgress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SnapshotId")) {
                snapshotTaskDetail.setSnapshotId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                snapshotTaskDetail.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                snapshotTaskDetail.setStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Url")) {
                snapshotTaskDetail.setUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserBucket")) {
                snapshotTaskDetail.setUserBucket(UserBucketDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return snapshotTaskDetail;
    }

    private static SnapshotTaskDetailJsonUnmarshaller instance;

    public static SnapshotTaskDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SnapshotTaskDetailJsonUnmarshaller();
        return instance;
    }
}
