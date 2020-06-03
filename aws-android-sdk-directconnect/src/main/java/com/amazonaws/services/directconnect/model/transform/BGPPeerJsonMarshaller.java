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
 * JSON marshaller for POJO BGPPeer
 */
class BGPPeerJsonMarshaller {

    public void marshall(BGPPeer bGPPeer, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (bGPPeer.getBgpPeerId() != null) {
            String bgpPeerId = bGPPeer.getBgpPeerId();
            jsonWriter.name("bgpPeerId");
            jsonWriter.value(bgpPeerId);
        }
        if (bGPPeer.getAsn() != null) {
            Integer asn = bGPPeer.getAsn();
            jsonWriter.name("asn");
            jsonWriter.value(asn);
        }
        if (bGPPeer.getAuthKey() != null) {
            String authKey = bGPPeer.getAuthKey();
            jsonWriter.name("authKey");
            jsonWriter.value(authKey);
        }
        if (bGPPeer.getAddressFamily() != null) {
            String addressFamily = bGPPeer.getAddressFamily();
            jsonWriter.name("addressFamily");
            jsonWriter.value(addressFamily);
        }
        if (bGPPeer.getAmazonAddress() != null) {
            String amazonAddress = bGPPeer.getAmazonAddress();
            jsonWriter.name("amazonAddress");
            jsonWriter.value(amazonAddress);
        }
        if (bGPPeer.getCustomerAddress() != null) {
            String customerAddress = bGPPeer.getCustomerAddress();
            jsonWriter.name("customerAddress");
            jsonWriter.value(customerAddress);
        }
        if (bGPPeer.getBgpPeerState() != null) {
            String bgpPeerState = bGPPeer.getBgpPeerState();
            jsonWriter.name("bgpPeerState");
            jsonWriter.value(bgpPeerState);
        }
        if (bGPPeer.getBgpStatus() != null) {
            String bgpStatus = bGPPeer.getBgpStatus();
            jsonWriter.name("bgpStatus");
            jsonWriter.value(bgpStatus);
        }
        if (bGPPeer.getAwsDeviceV2() != null) {
            String awsDeviceV2 = bGPPeer.getAwsDeviceV2();
            jsonWriter.name("awsDeviceV2");
            jsonWriter.value(awsDeviceV2);
        }
        jsonWriter.endObject();
    }

    private static BGPPeerJsonMarshaller instance;

    public static BGPPeerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BGPPeerJsonMarshaller();
        return instance;
    }
}
