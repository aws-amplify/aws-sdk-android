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
 * JSON marshaller for POJO AlgorithmValidationSpecification
 */
class AlgorithmValidationSpecificationJsonMarshaller {

    public void marshall(AlgorithmValidationSpecification algorithmValidationSpecification,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (algorithmValidationSpecification.getValidationRole() != null) {
            String validationRole = algorithmValidationSpecification.getValidationRole();
            jsonWriter.name("ValidationRole");
            jsonWriter.value(validationRole);
        }
        if (algorithmValidationSpecification.getValidationProfiles() != null) {
            java.util.List<AlgorithmValidationProfile> validationProfiles = algorithmValidationSpecification
                    .getValidationProfiles();
            jsonWriter.name("ValidationProfiles");
            jsonWriter.beginArray();
            for (AlgorithmValidationProfile validationProfilesItem : validationProfiles) {
                if (validationProfilesItem != null) {
                    AlgorithmValidationProfileJsonMarshaller.getInstance().marshall(
                            validationProfilesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AlgorithmValidationSpecificationJsonMarshaller instance;

    public static AlgorithmValidationSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AlgorithmValidationSpecificationJsonMarshaller();
        return instance;
    }
}
