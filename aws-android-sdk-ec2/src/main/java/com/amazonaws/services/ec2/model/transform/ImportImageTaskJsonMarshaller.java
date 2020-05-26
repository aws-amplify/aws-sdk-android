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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ImportImageTask
 */
class ImportImageTaskJsonMarshaller {

    public void marshall(ImportImageTask importImageTask, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (importImageTask.getArchitecture() != null) {
            String architecture = importImageTask.getArchitecture();
            jsonWriter.name("Architecture");
            jsonWriter.value(architecture);
        }
        if (importImageTask.getDescription() != null) {
            String description = importImageTask.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (importImageTask.getEncrypted() != null) {
            Boolean encrypted = importImageTask.getEncrypted();
            jsonWriter.name("Encrypted");
            jsonWriter.value(encrypted);
        }
        if (importImageTask.getHypervisor() != null) {
            String hypervisor = importImageTask.getHypervisor();
            jsonWriter.name("Hypervisor");
            jsonWriter.value(hypervisor);
        }
        if (importImageTask.getImageId() != null) {
            String imageId = importImageTask.getImageId();
            jsonWriter.name("ImageId");
            jsonWriter.value(imageId);
        }
        if (importImageTask.getImportTaskId() != null) {
            String importTaskId = importImageTask.getImportTaskId();
            jsonWriter.name("ImportTaskId");
            jsonWriter.value(importTaskId);
        }
        if (importImageTask.getKmsKeyId() != null) {
            String kmsKeyId = importImageTask.getKmsKeyId();
            jsonWriter.name("KmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        if (importImageTask.getLicenseType() != null) {
            String licenseType = importImageTask.getLicenseType();
            jsonWriter.name("LicenseType");
            jsonWriter.value(licenseType);
        }
        if (importImageTask.getPlatform() != null) {
            String platform = importImageTask.getPlatform();
            jsonWriter.name("Platform");
            jsonWriter.value(platform);
        }
        if (importImageTask.getProgress() != null) {
            String progress = importImageTask.getProgress();
            jsonWriter.name("Progress");
            jsonWriter.value(progress);
        }
        if (importImageTask.getSnapshotDetails() != null) {
            java.util.List<SnapshotDetail> snapshotDetails = importImageTask.getSnapshotDetails();
            jsonWriter.name("SnapshotDetails");
            jsonWriter.beginArray();
            for (SnapshotDetail snapshotDetailsItem : snapshotDetails) {
                if (snapshotDetailsItem != null) {
                    SnapshotDetailJsonMarshaller.getInstance().marshall(snapshotDetailsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (importImageTask.getStatus() != null) {
            String status = importImageTask.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (importImageTask.getStatusMessage() != null) {
            String statusMessage = importImageTask.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        if (importImageTask.getTags() != null) {
            java.util.List<Tag> tags = importImageTask.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (importImageTask.getLicenseSpecifications() != null) {
            java.util.List<ImportImageLicenseConfigurationResponse> licenseSpecifications = importImageTask
                    .getLicenseSpecifications();
            jsonWriter.name("LicenseSpecifications");
            jsonWriter.beginArray();
            for (ImportImageLicenseConfigurationResponse licenseSpecificationsItem : licenseSpecifications) {
                if (licenseSpecificationsItem != null) {
                    ImportImageLicenseConfigurationResponseJsonMarshaller.getInstance().marshall(
                            licenseSpecificationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ImportImageTaskJsonMarshaller instance;

    public static ImportImageTaskJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImportImageTaskJsonMarshaller();
        return instance;
    }
}
