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

package com.amazonaws.services.directconnect.model.transform;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Connection
 */
class ConnectionJsonMarshaller {

    public void marshall(Connection connection, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (connection.getOwnerAccount() != null) {
            String ownerAccount = connection.getOwnerAccount();
            jsonWriter.name("ownerAccount");
            jsonWriter.value(ownerAccount);
        }
        if (connection.getConnectionId() != null) {
            String connectionId = connection.getConnectionId();
            jsonWriter.name("connectionId");
            jsonWriter.value(connectionId);
        }
        if (connection.getConnectionName() != null) {
            String connectionName = connection.getConnectionName();
            jsonWriter.name("connectionName");
            jsonWriter.value(connectionName);
        }
        if (connection.getConnectionState() != null) {
            String connectionState = connection.getConnectionState();
            jsonWriter.name("connectionState");
            jsonWriter.value(connectionState);
        }
        if (connection.getRegion() != null) {
            String region = connection.getRegion();
            jsonWriter.name("region");
            jsonWriter.value(region);
        }
        if (connection.getLocation() != null) {
            String location = connection.getLocation();
            jsonWriter.name("location");
            jsonWriter.value(location);
        }
        if (connection.getBandwidth() != null) {
            String bandwidth = connection.getBandwidth();
            jsonWriter.name("bandwidth");
            jsonWriter.value(bandwidth);
        }
        if (connection.getVlan() != null) {
            Integer vlan = connection.getVlan();
            jsonWriter.name("vlan");
            jsonWriter.value(vlan);
        }
        if (connection.getPartnerName() != null) {
            String partnerName = connection.getPartnerName();
            jsonWriter.name("partnerName");
            jsonWriter.value(partnerName);
        }
        if (connection.getLoaIssueTime() != null) {
            java.util.Date loaIssueTime = connection.getLoaIssueTime();
            jsonWriter.name("loaIssueTime");
            jsonWriter.value(loaIssueTime);
        }
        if (connection.getLagId() != null) {
            String lagId = connection.getLagId();
            jsonWriter.name("lagId");
            jsonWriter.value(lagId);
        }
        if (connection.getAwsDevice() != null) {
            String awsDevice = connection.getAwsDevice();
            jsonWriter.name("awsDevice");
            jsonWriter.value(awsDevice);
        }
        if (connection.getJumboFrameCapable() != null) {
            Boolean jumboFrameCapable = connection.getJumboFrameCapable();
            jsonWriter.name("jumboFrameCapable");
            jsonWriter.value(jumboFrameCapable);
        }
        if (connection.getAwsDeviceV2() != null) {
            String awsDeviceV2 = connection.getAwsDeviceV2();
            jsonWriter.name("awsDeviceV2");
            jsonWriter.value(awsDeviceV2);
        }
        if (connection.getHasLogicalRedundancy() != null) {
            String hasLogicalRedundancy = connection.getHasLogicalRedundancy();
            jsonWriter.name("hasLogicalRedundancy");
            jsonWriter.value(hasLogicalRedundancy);
        }
        if (connection.getTags() != null) {
            java.util.List<Tag> tags = connection.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (connection.getProviderName() != null) {
            String providerName = connection.getProviderName();
            jsonWriter.name("providerName");
            jsonWriter.value(providerName);
        }
        jsonWriter.endObject();
    }

    private static ConnectionJsonMarshaller instance;

    public static ConnectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConnectionJsonMarshaller();
        return instance;
    }
}
