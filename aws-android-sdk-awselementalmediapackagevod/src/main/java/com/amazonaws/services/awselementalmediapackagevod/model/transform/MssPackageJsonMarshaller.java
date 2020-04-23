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

package com.amazonaws.services.awselementalmediapackagevod.model.transform;

import com.amazonaws.services.awselementalmediapackagevod.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MssPackage
 */
class MssPackageJsonMarshaller {

    public void marshall(MssPackage mssPackage, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (mssPackage.getEncryption() != null) {
            MssEncryption encryption = mssPackage.getEncryption();
            jsonWriter.name("Encryption");
            MssEncryptionJsonMarshaller.getInstance().marshall(encryption, jsonWriter);
        }
        if (mssPackage.getMssManifests() != null) {
            java.util.List<MssManifest> mssManifests = mssPackage.getMssManifests();
            jsonWriter.name("MssManifests");
            jsonWriter.beginArray();
            for (MssManifest mssManifestsItem : mssManifests) {
                if (mssManifestsItem != null) {
                    MssManifestJsonMarshaller.getInstance().marshall(mssManifestsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (mssPackage.getSegmentDurationSeconds() != null) {
            Integer segmentDurationSeconds = mssPackage.getSegmentDurationSeconds();
            jsonWriter.name("SegmentDurationSeconds");
            jsonWriter.value(segmentDurationSeconds);
        }
        jsonWriter.endObject();
    }

    private static MssPackageJsonMarshaller instance;

    public static MssPackageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MssPackageJsonMarshaller();
        return instance;
    }
}
