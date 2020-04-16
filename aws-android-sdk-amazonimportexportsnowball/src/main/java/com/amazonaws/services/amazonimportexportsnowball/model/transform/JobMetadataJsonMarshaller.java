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

package com.amazonaws.services.amazonimportexportsnowball.model.transform;

import com.amazonaws.services.amazonimportexportsnowball.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JobMetadata
 */
class JobMetadataJsonMarshaller {

    public void marshall(JobMetadata jobMetadata, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (jobMetadata.getJobId() != null) {
            String jobId = jobMetadata.getJobId();
            jsonWriter.name("JobId");
            jsonWriter.value(jobId);
        }
        if (jobMetadata.getJobState() != null) {
            String jobState = jobMetadata.getJobState();
            jsonWriter.name("JobState");
            jsonWriter.value(jobState);
        }
        if (jobMetadata.getJobType() != null) {
            String jobType = jobMetadata.getJobType();
            jsonWriter.name("JobType");
            jsonWriter.value(jobType);
        }
        if (jobMetadata.getSnowballType() != null) {
            String snowballType = jobMetadata.getSnowballType();
            jsonWriter.name("SnowballType");
            jsonWriter.value(snowballType);
        }
        if (jobMetadata.getCreationDate() != null) {
            java.util.Date creationDate = jobMetadata.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (jobMetadata.getResources() != null) {
            JobResource resources = jobMetadata.getResources();
            jsonWriter.name("Resources");
            JobResourceJsonMarshaller.getInstance().marshall(resources, jsonWriter);
        }
        if (jobMetadata.getDescription() != null) {
            String description = jobMetadata.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (jobMetadata.getKmsKeyARN() != null) {
            String kmsKeyARN = jobMetadata.getKmsKeyARN();
            jsonWriter.name("KmsKeyARN");
            jsonWriter.value(kmsKeyARN);
        }
        if (jobMetadata.getRoleARN() != null) {
            String roleARN = jobMetadata.getRoleARN();
            jsonWriter.name("RoleARN");
            jsonWriter.value(roleARN);
        }
        if (jobMetadata.getAddressId() != null) {
            String addressId = jobMetadata.getAddressId();
            jsonWriter.name("AddressId");
            jsonWriter.value(addressId);
        }
        if (jobMetadata.getShippingDetails() != null) {
            ShippingDetails shippingDetails = jobMetadata.getShippingDetails();
            jsonWriter.name("ShippingDetails");
            ShippingDetailsJsonMarshaller.getInstance().marshall(shippingDetails, jsonWriter);
        }
        if (jobMetadata.getSnowballCapacityPreference() != null) {
            String snowballCapacityPreference = jobMetadata.getSnowballCapacityPreference();
            jsonWriter.name("SnowballCapacityPreference");
            jsonWriter.value(snowballCapacityPreference);
        }
        if (jobMetadata.getNotification() != null) {
            Notification notification = jobMetadata.getNotification();
            jsonWriter.name("Notification");
            NotificationJsonMarshaller.getInstance().marshall(notification, jsonWriter);
        }
        if (jobMetadata.getDataTransferProgress() != null) {
            DataTransfer dataTransferProgress = jobMetadata.getDataTransferProgress();
            jsonWriter.name("DataTransferProgress");
            DataTransferJsonMarshaller.getInstance().marshall(dataTransferProgress, jsonWriter);
        }
        if (jobMetadata.getJobLogInfo() != null) {
            JobLogs jobLogInfo = jobMetadata.getJobLogInfo();
            jsonWriter.name("JobLogInfo");
            JobLogsJsonMarshaller.getInstance().marshall(jobLogInfo, jsonWriter);
        }
        if (jobMetadata.getClusterId() != null) {
            String clusterId = jobMetadata.getClusterId();
            jsonWriter.name("ClusterId");
            jsonWriter.value(clusterId);
        }
        if (jobMetadata.getForwardingAddressId() != null) {
            String forwardingAddressId = jobMetadata.getForwardingAddressId();
            jsonWriter.name("ForwardingAddressId");
            jsonWriter.value(forwardingAddressId);
        }
        if (jobMetadata.getTaxDocuments() != null) {
            TaxDocuments taxDocuments = jobMetadata.getTaxDocuments();
            jsonWriter.name("TaxDocuments");
            TaxDocumentsJsonMarshaller.getInstance().marshall(taxDocuments, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static JobMetadataJsonMarshaller instance;

    public static JobMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobMetadataJsonMarshaller();
        return instance;
    }
}
