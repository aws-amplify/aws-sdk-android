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
 * JSON marshaller for POJO MssManifest
 */
class MssManifestJsonMarshaller {

    public void marshall(MssManifest mssManifest, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (mssManifest.getManifestName() != null) {
            String manifestName = mssManifest.getManifestName();
            jsonWriter.name("ManifestName");
            jsonWriter.value(manifestName);
        }
        if (mssManifest.getStreamSelection() != null) {
            StreamSelection streamSelection = mssManifest.getStreamSelection();
            jsonWriter.name("StreamSelection");
            StreamSelectionJsonMarshaller.getInstance().marshall(streamSelection, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static MssManifestJsonMarshaller instance;

    public static MssManifestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MssManifestJsonMarshaller();
        return instance;
    }
}
