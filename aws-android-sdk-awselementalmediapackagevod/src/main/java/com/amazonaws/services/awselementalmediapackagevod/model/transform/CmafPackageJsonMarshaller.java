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
 * JSON marshaller for POJO CmafPackage
 */
class CmafPackageJsonMarshaller {

    public void marshall(CmafPackage cmafPackage, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (cmafPackage.getEncryption() != null) {
            CmafEncryption encryption = cmafPackage.getEncryption();
            jsonWriter.name("Encryption");
            CmafEncryptionJsonMarshaller.getInstance().marshall(encryption, jsonWriter);
        }
        if (cmafPackage.getHlsManifests() != null) {
            java.util.List<HlsManifest> hlsManifests = cmafPackage.getHlsManifests();
            jsonWriter.name("HlsManifests");
            jsonWriter.beginArray();
            for (HlsManifest hlsManifestsItem : hlsManifests) {
                if (hlsManifestsItem != null) {
                    HlsManifestJsonMarshaller.getInstance().marshall(hlsManifestsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (cmafPackage.getSegmentDurationSeconds() != null) {
            Integer segmentDurationSeconds = cmafPackage.getSegmentDurationSeconds();
            jsonWriter.name("SegmentDurationSeconds");
            jsonWriter.value(segmentDurationSeconds);
        }
        jsonWriter.endObject();
    }

    private static CmafPackageJsonMarshaller instance;

    public static CmafPackageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CmafPackageJsonMarshaller();
        return instance;
    }
}
