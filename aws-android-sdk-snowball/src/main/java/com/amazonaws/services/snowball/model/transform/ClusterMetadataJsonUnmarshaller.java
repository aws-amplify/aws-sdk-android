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

package com.amazonaws.services.snowball.model.transform;

import com.amazonaws.services.snowball.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ClusterMetadata
 */
class ClusterMetadataJsonUnmarshaller implements
        Unmarshaller<ClusterMetadata, JsonUnmarshallerContext> {

    public ClusterMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ClusterMetadata clusterMetadata = new ClusterMetadata();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ClusterId")) {
                clusterMetadata.setClusterId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                clusterMetadata.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KmsKeyARN")) {
                clusterMetadata.setKmsKeyARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoleARN")) {
                clusterMetadata.setRoleARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ClusterState")) {
                clusterMetadata.setClusterState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobType")) {
                clusterMetadata.setJobType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SnowballType")) {
                clusterMetadata.setSnowballType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                clusterMetadata.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Resources")) {
                clusterMetadata.setResources(JobResourceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AddressId")) {
                clusterMetadata.setAddressId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ShippingOption")) {
                clusterMetadata.setShippingOption(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Notification")) {
                clusterMetadata.setNotification(NotificationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ForwardingAddressId")) {
                clusterMetadata.setForwardingAddressId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TaxDocuments")) {
                clusterMetadata.setTaxDocuments(TaxDocumentsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return clusterMetadata;
    }

    private static ClusterMetadataJsonUnmarshaller instance;

    public static ClusterMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClusterMetadataJsonUnmarshaller();
        return instance;
    }
}
