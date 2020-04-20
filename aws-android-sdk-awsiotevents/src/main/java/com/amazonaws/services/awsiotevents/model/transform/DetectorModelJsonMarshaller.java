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

package com.amazonaws.services.awsiotevents.model.transform;

import com.amazonaws.services.awsiotevents.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DetectorModel
 */
class DetectorModelJsonMarshaller {

    public void marshall(DetectorModel detectorModel, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (detectorModel.getDetectorModelDefinition() != null) {
            DetectorModelDefinition detectorModelDefinition = detectorModel
                    .getDetectorModelDefinition();
            jsonWriter.name("detectorModelDefinition");
            DetectorModelDefinitionJsonMarshaller.getInstance().marshall(detectorModelDefinition,
                    jsonWriter);
        }
        if (detectorModel.getDetectorModelConfiguration() != null) {
            DetectorModelConfiguration detectorModelConfiguration = detectorModel
                    .getDetectorModelConfiguration();
            jsonWriter.name("detectorModelConfiguration");
            DetectorModelConfigurationJsonMarshaller.getInstance().marshall(
                    detectorModelConfiguration, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DetectorModelJsonMarshaller instance;

    public static DetectorModelJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DetectorModelJsonMarshaller();
        return instance;
    }
}
