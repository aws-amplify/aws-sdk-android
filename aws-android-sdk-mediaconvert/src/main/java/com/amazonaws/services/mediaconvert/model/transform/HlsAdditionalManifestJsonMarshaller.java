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

package com.amazonaws.services.mediaconvert.model.transform;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HlsAdditionalManifest
 */
class HlsAdditionalManifestJsonMarshaller {

    public void marshall(HlsAdditionalManifest hlsAdditionalManifest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (hlsAdditionalManifest.getManifestNameModifier() != null) {
            String manifestNameModifier = hlsAdditionalManifest.getManifestNameModifier();
            jsonWriter.name("ManifestNameModifier");
            jsonWriter.value(manifestNameModifier);
        }
        if (hlsAdditionalManifest.getSelectedOutputs() != null) {
            java.util.List<String> selectedOutputs = hlsAdditionalManifest.getSelectedOutputs();
            jsonWriter.name("SelectedOutputs");
            jsonWriter.beginArray();
            for (String selectedOutputsItem : selectedOutputs) {
                if (selectedOutputsItem != null) {
                    jsonWriter.value(selectedOutputsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static HlsAdditionalManifestJsonMarshaller instance;

    public static HlsAdditionalManifestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HlsAdditionalManifestJsonMarshaller();
        return instance;
    }
}
