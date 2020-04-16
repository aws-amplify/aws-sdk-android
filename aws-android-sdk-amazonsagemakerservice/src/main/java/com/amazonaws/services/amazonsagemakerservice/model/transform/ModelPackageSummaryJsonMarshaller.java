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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ModelPackageSummary
 */
class ModelPackageSummaryJsonMarshaller {

    public void marshall(ModelPackageSummary modelPackageSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (modelPackageSummary.getModelPackageName() != null) {
            String modelPackageName = modelPackageSummary.getModelPackageName();
            jsonWriter.name("ModelPackageName");
            jsonWriter.value(modelPackageName);
        }
        if (modelPackageSummary.getModelPackageArn() != null) {
            String modelPackageArn = modelPackageSummary.getModelPackageArn();
            jsonWriter.name("ModelPackageArn");
            jsonWriter.value(modelPackageArn);
        }
        if (modelPackageSummary.getModelPackageDescription() != null) {
            String modelPackageDescription = modelPackageSummary.getModelPackageDescription();
            jsonWriter.name("ModelPackageDescription");
            jsonWriter.value(modelPackageDescription);
        }
        if (modelPackageSummary.getCreationTime() != null) {
            java.util.Date creationTime = modelPackageSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (modelPackageSummary.getModelPackageStatus() != null) {
            String modelPackageStatus = modelPackageSummary.getModelPackageStatus();
            jsonWriter.name("ModelPackageStatus");
            jsonWriter.value(modelPackageStatus);
        }
        jsonWriter.endObject();
    }

    private static ModelPackageSummaryJsonMarshaller instance;

    public static ModelPackageSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ModelPackageSummaryJsonMarshaller();
        return instance;
    }
}
