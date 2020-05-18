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
 * JSON marshaller for POJO LocalGatewayVirtualInterface
 */
class LocalGatewayVirtualInterfaceJsonMarshaller {

    public void marshall(LocalGatewayVirtualInterface localGatewayVirtualInterface,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (localGatewayVirtualInterface.getLocalGatewayVirtualInterfaceId() != null) {
            String localGatewayVirtualInterfaceId = localGatewayVirtualInterface
                    .getLocalGatewayVirtualInterfaceId();
            jsonWriter.name("LocalGatewayVirtualInterfaceId");
            jsonWriter.value(localGatewayVirtualInterfaceId);
        }
        if (localGatewayVirtualInterface.getLocalGatewayId() != null) {
            String localGatewayId = localGatewayVirtualInterface.getLocalGatewayId();
            jsonWriter.name("LocalGatewayId");
            jsonWriter.value(localGatewayId);
        }
        if (localGatewayVirtualInterface.getVlan() != null) {
            Integer vlan = localGatewayVirtualInterface.getVlan();
            jsonWriter.name("Vlan");
            jsonWriter.value(vlan);
        }
        if (localGatewayVirtualInterface.getLocalAddress() != null) {
            String localAddress = localGatewayVirtualInterface.getLocalAddress();
            jsonWriter.name("LocalAddress");
            jsonWriter.value(localAddress);
        }
        if (localGatewayVirtualInterface.getPeerAddress() != null) {
            String peerAddress = localGatewayVirtualInterface.getPeerAddress();
            jsonWriter.name("PeerAddress");
            jsonWriter.value(peerAddress);
        }
        if (localGatewayVirtualInterface.getLocalBgpAsn() != null) {
            Integer localBgpAsn = localGatewayVirtualInterface.getLocalBgpAsn();
            jsonWriter.name("LocalBgpAsn");
            jsonWriter.value(localBgpAsn);
        }
        if (localGatewayVirtualInterface.getPeerBgpAsn() != null) {
            Integer peerBgpAsn = localGatewayVirtualInterface.getPeerBgpAsn();
            jsonWriter.name("PeerBgpAsn");
            jsonWriter.value(peerBgpAsn);
        }
        if (localGatewayVirtualInterface.getTags() != null) {
            java.util.List<Tag> tags = localGatewayVirtualInterface.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static LocalGatewayVirtualInterfaceJsonMarshaller instance;

    public static LocalGatewayVirtualInterfaceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LocalGatewayVirtualInterfaceJsonMarshaller();
        return instance;
    }
}
