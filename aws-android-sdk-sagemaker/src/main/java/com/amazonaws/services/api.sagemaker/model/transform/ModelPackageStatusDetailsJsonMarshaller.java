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
 * JSON marshaller for POJO ModelPackageStatusDetails
 */
class ModelPackageStatusDetailsJsonMarshaller {

    public void marshall(ModelPackageStatusDetails modelPackageStatusDetails,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (modelPackageStatusDetails.getValidationStatuses() != null) {
            java.util.List<ModelPackageStatusItem> validationStatuses = modelPackageStatusDetails
                    .getValidationStatuses();
            jsonWriter.name("ValidationStatuses");
            jsonWriter.beginArray();
            for (ModelPackageStatusItem validationStatusesItem : validationStatuses) {
                if (validationStatusesItem != null) {
                    ModelPackageStatusItemJsonMarshaller.getInstance().marshall(
                            validationStatusesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (modelPackageStatusDetails.getImageScanStatuses() != null) {
            java.util.List<ModelPackageStatusItem> imageScanStatuses = modelPackageStatusDetails
                    .getImageScanStatuses();
            jsonWriter.name("ImageScanStatuses");
            jsonWriter.beginArray();
            for (ModelPackageStatusItem imageScanStatusesItem : imageScanStatuses) {
                if (imageScanStatusesItem != null) {
                    ModelPackageStatusItemJsonMarshaller.getInstance().marshall(
                            imageScanStatusesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ModelPackageStatusDetailsJsonMarshaller instance;

    public static ModelPackageStatusDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ModelPackageStatusDetailsJsonMarshaller();
        return instance;
    }
}
