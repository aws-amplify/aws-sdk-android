/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CreateFaceLivenessSessionRequestSettings
 */
class CreateFaceLivenessSessionRequestSettingsJsonMarshaller {

    public void marshall(
            CreateFaceLivenessSessionRequestSettings createFaceLivenessSessionRequestSettings,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (createFaceLivenessSessionRequestSettings.getOutputConfig() != null) {
            LivenessOutputConfig outputConfig = createFaceLivenessSessionRequestSettings
                    .getOutputConfig();
            jsonWriter.name("OutputConfig");
            LivenessOutputConfigJsonMarshaller.getInstance().marshall(outputConfig, jsonWriter);
        }
        if (createFaceLivenessSessionRequestSettings.getAuditImagesLimit() != null) {
            Integer auditImagesLimit = createFaceLivenessSessionRequestSettings
                    .getAuditImagesLimit();
            jsonWriter.name("AuditImagesLimit");
            jsonWriter.value(auditImagesLimit);
        }
        jsonWriter.endObject();
    }

    private static CreateFaceLivenessSessionRequestSettingsJsonMarshaller instance;

    public static CreateFaceLivenessSessionRequestSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreateFaceLivenessSessionRequestSettingsJsonMarshaller();
        return instance;
    }
}
