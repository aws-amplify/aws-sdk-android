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
 * JSON marshaller for POJO DashAdditionalManifest
 */
class DashAdditionalManifestJsonMarshaller {

    public void marshall(DashAdditionalManifest dashAdditionalManifest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (dashAdditionalManifest.getManifestNameModifier() != null) {
            String manifestNameModifier = dashAdditionalManifest.getManifestNameModifier();
            jsonWriter.name("ManifestNameModifier");
            jsonWriter.value(manifestNameModifier);
        }
        if (dashAdditionalManifest.getSelectedOutputs() != null) {
            java.util.List<String> selectedOutputs = dashAdditionalManifest.getSelectedOutputs();
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

    private static DashAdditionalManifestJsonMarshaller instance;

    public static DashAdditionalManifestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DashAdditionalManifestJsonMarshaller();
        return instance;
    }
}
