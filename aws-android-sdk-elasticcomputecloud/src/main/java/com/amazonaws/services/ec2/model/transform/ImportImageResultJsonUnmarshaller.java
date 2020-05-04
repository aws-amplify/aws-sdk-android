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
 * JSON unmarshaller for response ImportImageResult
 */
public class ImportImageResultJsonUnmarshaller implements
        Unmarshaller<ImportImageResult, JsonUnmarshallerContext> {

    public ImportImageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ImportImageResult importImageResult = new ImportImageResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Architecture")) {
                importImageResult.setArchitecture(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                importImageResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Encrypted")) {
                importImageResult.setEncrypted(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Hypervisor")) {
                importImageResult.setHypervisor(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImageId")) {
                importImageResult.setImageId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImportTaskId")) {
                importImageResult.setImportTaskId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KmsKeyId")) {
                importImageResult.setKmsKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LicenseType")) {
                importImageResult.setLicenseType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Platform")) {
                importImageResult.setPlatform(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Progress")) {
                importImageResult.setProgress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SnapshotDetails")) {
                importImageResult.setSnapshotDetails(new ListUnmarshaller<SnapshotDetail>(
                        SnapshotDetailJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Status")) {
                importImageResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                importImageResult.setStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LicenseSpecifications")) {
                importImageResult
                        .setLicenseSpecifications(new ListUnmarshaller<ImportImageLicenseConfigurationResponse>(
                                ImportImageLicenseConfigurationResponseJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return importImageResult;
    }

    private static ImportImageResultJsonUnmarshaller instance;

    public static ImportImageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImportImageResultJsonUnmarshaller();
        return instance;
    }
}
