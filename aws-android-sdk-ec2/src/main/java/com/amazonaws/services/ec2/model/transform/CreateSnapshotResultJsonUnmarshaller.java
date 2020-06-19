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
 * JSON unmarshaller for response CreateSnapshotResult
 */
public class CreateSnapshotResultJsonUnmarshaller implements
        Unmarshaller<CreateSnapshotResult, JsonUnmarshallerContext> {

    public CreateSnapshotResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateSnapshotResult createSnapshotResult = new CreateSnapshotResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DataEncryptionKeyId")) {
                createSnapshotResult.setDataEncryptionKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                createSnapshotResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Encrypted")) {
                createSnapshotResult.setEncrypted(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KmsKeyId")) {
                createSnapshotResult.setKmsKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OwnerId")) {
                createSnapshotResult.setOwnerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Progress")) {
                createSnapshotResult.setProgress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SnapshotId")) {
                createSnapshotResult.setSnapshotId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartTime")) {
                createSnapshotResult.setStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                createSnapshotResult.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StateMessage")) {
                createSnapshotResult.setStateMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeId")) {
                createSnapshotResult.setVolumeId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeSize")) {
                createSnapshotResult.setVolumeSize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OwnerAlias")) {
                createSnapshotResult.setOwnerAlias(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                createSnapshotResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createSnapshotResult;
    }

    private static CreateSnapshotResultJsonUnmarshaller instance;

    public static CreateSnapshotResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateSnapshotResultJsonUnmarshaller();
        return instance;
    }
}
