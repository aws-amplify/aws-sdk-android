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
 * JSON marshaller for POJO Lag
 */
class LagJsonMarshaller {

    public void marshall(Lag lag, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (lag.getConnectionsBandwidth() != null) {
            String connectionsBandwidth = lag.getConnectionsBandwidth();
            jsonWriter.name("connectionsBandwidth");
            jsonWriter.value(connectionsBandwidth);
        }
        if (lag.getNumberOfConnections() != null) {
            Integer numberOfConnections = lag.getNumberOfConnections();
            jsonWriter.name("numberOfConnections");
            jsonWriter.value(numberOfConnections);
        }
        if (lag.getLagId() != null) {
            String lagId = lag.getLagId();
            jsonWriter.name("lagId");
            jsonWriter.value(lagId);
        }
        if (lag.getOwnerAccount() != null) {
            String ownerAccount = lag.getOwnerAccount();
            jsonWriter.name("ownerAccount");
            jsonWriter.value(ownerAccount);
        }
        if (lag.getLagName() != null) {
            String lagName = lag.getLagName();
            jsonWriter.name("lagName");
            jsonWriter.value(lagName);
        }
        if (lag.getLagState() != null) {
            String lagState = lag.getLagState();
            jsonWriter.name("lagState");
            jsonWriter.value(lagState);
        }
        if (lag.getLocation() != null) {
            String location = lag.getLocation();
            jsonWriter.name("location");
            jsonWriter.value(location);
        }
        if (lag.getRegion() != null) {
            String region = lag.getRegion();
            jsonWriter.name("region");
            jsonWriter.value(region);
        }
        if (lag.getMinimumLinks() != null) {
            Integer minimumLinks = lag.getMinimumLinks();
            jsonWriter.name("minimumLinks");
            jsonWriter.value(minimumLinks);
        }
        if (lag.getAwsDevice() != null) {
            String awsDevice = lag.getAwsDevice();
            jsonWriter.name("awsDevice");
            jsonWriter.value(awsDevice);
        }
        if (lag.getAwsDeviceV2() != null) {
            String awsDeviceV2 = lag.getAwsDeviceV2();
            jsonWriter.name("awsDeviceV2");
            jsonWriter.value(awsDeviceV2);
        }
        if (lag.getConnections() != null) {
            java.util.List<Connection> connections = lag.getConnections();
            jsonWriter.name("connections");
            jsonWriter.beginArray();
            for (Connection connectionsItem : connections) {
                if (connectionsItem != null) {
                    ConnectionJsonMarshaller.getInstance().marshall(connectionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (lag.getAllowsHostedConnections() != null) {
            Boolean allowsHostedConnections = lag.getAllowsHostedConnections();
            jsonWriter.name("allowsHostedConnections");
            jsonWriter.value(allowsHostedConnections);
        }
        if (lag.getJumboFrameCapable() != null) {
            Boolean jumboFrameCapable = lag.getJumboFrameCapable();
            jsonWriter.name("jumboFrameCapable");
            jsonWriter.value(jumboFrameCapable);
        }
        if (lag.getHasLogicalRedundancy() != null) {
            String hasLogicalRedundancy = lag.getHasLogicalRedundancy();
            jsonWriter.name("hasLogicalRedundancy");
            jsonWriter.value(hasLogicalRedundancy);
        }
        if (lag.getTags() != null) {
            java.util.List<Tag> tags = lag.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (lag.getProviderName() != null) {
            String providerName = lag.getProviderName();
            jsonWriter.name("providerName");
            jsonWriter.value(providerName);
        }
        jsonWriter.endObject();
    }

    private static LagJsonMarshaller instance;

    public static LagJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LagJsonMarshaller();
        return instance;
    }
}
