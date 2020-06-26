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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ModelPackageValidationProfile
 */
class ModelPackageValidationProfileJsonMarshaller {

    public void marshall(ModelPackageValidationProfile modelPackageValidationProfile,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (modelPackageValidationProfile.getProfileName() != null) {
            String profileName = modelPackageValidationProfile.getProfileName();
            jsonWriter.name("ProfileName");
            jsonWriter.value(profileName);
        }
        if (modelPackageValidationProfile.getTransformJobDefinition() != null) {
            TransformJobDefinition transformJobDefinition = modelPackageValidationProfile
                    .getTransformJobDefinition();
            jsonWriter.name("TransformJobDefinition");
            TransformJobDefinitionJsonMarshaller.getInstance().marshall(transformJobDefinition,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ModelPackageValidationProfileJsonMarshaller instance;

    public static ModelPackageValidationProfileJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ModelPackageValidationProfileJsonMarshaller();
        return instance;
    }
}
