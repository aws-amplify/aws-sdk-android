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
 * JSON marshaller for POJO ClusterMetadata
 */
class ClusterMetadataJsonMarshaller {

    public void marshall(ClusterMetadata clusterMetadata, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (clusterMetadata.getClusterId() != null) {
            String clusterId = clusterMetadata.getClusterId();
            jsonWriter.name("ClusterId");
            jsonWriter.value(clusterId);
        }
        if (clusterMetadata.getDescription() != null) {
            String description = clusterMetadata.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (clusterMetadata.getKmsKeyARN() != null) {
            String kmsKeyARN = clusterMetadata.getKmsKeyARN();
            jsonWriter.name("KmsKeyARN");
            jsonWriter.value(kmsKeyARN);
        }
        if (clusterMetadata.getRoleARN() != null) {
            String roleARN = clusterMetadata.getRoleARN();
            jsonWriter.name("RoleARN");
            jsonWriter.value(roleARN);
        }
        if (clusterMetadata.getClusterState() != null) {
            String clusterState = clusterMetadata.getClusterState();
            jsonWriter.name("ClusterState");
            jsonWriter.value(clusterState);
        }
        if (clusterMetadata.getJobType() != null) {
            String jobType = clusterMetadata.getJobType();
            jsonWriter.name("JobType");
            jsonWriter.value(jobType);
        }
        if (clusterMetadata.getSnowballType() != null) {
            String snowballType = clusterMetadata.getSnowballType();
            jsonWriter.name("SnowballType");
            jsonWriter.value(snowballType);
        }
        if (clusterMetadata.getCreationDate() != null) {
            java.util.Date creationDate = clusterMetadata.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (clusterMetadata.getResources() != null) {
            JobResource resources = clusterMetadata.getResources();
            jsonWriter.name("Resources");
            JobResourceJsonMarshaller.getInstance().marshall(resources, jsonWriter);
        }
        if (clusterMetadata.getAddressId() != null) {
            String addressId = clusterMetadata.getAddressId();
            jsonWriter.name("AddressId");
            jsonWriter.value(addressId);
        }
        if (clusterMetadata.getShippingOption() != null) {
            String shippingOption = clusterMetadata.getShippingOption();
            jsonWriter.name("ShippingOption");
            jsonWriter.value(shippingOption);
        }
        if (clusterMetadata.getNotification() != null) {
            Notification notification = clusterMetadata.getNotification();
            jsonWriter.name("Notification");
            NotificationJsonMarshaller.getInstance().marshall(notification, jsonWriter);
        }
        if (clusterMetadata.getForwardingAddressId() != null) {
            String forwardingAddressId = clusterMetadata.getForwardingAddressId();
            jsonWriter.name("ForwardingAddressId");
            jsonWriter.value(forwardingAddressId);
        }
        if (clusterMetadata.getTaxDocuments() != null) {
            TaxDocuments taxDocuments = clusterMetadata.getTaxDocuments();
            jsonWriter.name("TaxDocuments");
            TaxDocumentsJsonMarshaller.getInstance().marshall(taxDocuments, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ClusterMetadataJsonMarshaller instance;

    public static ClusterMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterMetadataJsonMarshaller();
        return instance;
    }
}
