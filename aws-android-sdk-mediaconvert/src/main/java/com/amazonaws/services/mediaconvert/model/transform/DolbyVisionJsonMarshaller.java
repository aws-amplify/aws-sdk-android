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
 * JSON marshaller for POJO DolbyVision
 */
class DolbyVisionJsonMarshaller {

    public void marshall(DolbyVision dolbyVision, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dolbyVision.getL6Metadata() != null) {
            DolbyVisionLevel6Metadata l6Metadata = dolbyVision.getL6Metadata();
            jsonWriter.name("L6Metadata");
            DolbyVisionLevel6MetadataJsonMarshaller.getInstance().marshall(l6Metadata, jsonWriter);
        }
        if (dolbyVision.getL6Mode() != null) {
            String l6Mode = dolbyVision.getL6Mode();
            jsonWriter.name("L6Mode");
            jsonWriter.value(l6Mode);
        }
        if (dolbyVision.getProfile() != null) {
            String profile = dolbyVision.getProfile();
            jsonWriter.name("Profile");
            jsonWriter.value(profile);
        }
        jsonWriter.endObject();
    }

    private static DolbyVisionJsonMarshaller instance;

    public static DolbyVisionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DolbyVisionJsonMarshaller();
        return instance;
    }
}
