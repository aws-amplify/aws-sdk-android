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
 * JSON marshaller for POJO NewBGPPeer
 */
class NewBGPPeerJsonMarshaller {

    public void marshall(NewBGPPeer newBGPPeer, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (newBGPPeer.getAsn() != null) {
            Integer asn = newBGPPeer.getAsn();
            jsonWriter.name("asn");
            jsonWriter.value(asn);
        }
        if (newBGPPeer.getAuthKey() != null) {
            String authKey = newBGPPeer.getAuthKey();
            jsonWriter.name("authKey");
            jsonWriter.value(authKey);
        }
        if (newBGPPeer.getAddressFamily() != null) {
            String addressFamily = newBGPPeer.getAddressFamily();
            jsonWriter.name("addressFamily");
            jsonWriter.value(addressFamily);
        }
        if (newBGPPeer.getAmazonAddress() != null) {
            String amazonAddress = newBGPPeer.getAmazonAddress();
            jsonWriter.name("amazonAddress");
            jsonWriter.value(amazonAddress);
        }
        if (newBGPPeer.getCustomerAddress() != null) {
            String customerAddress = newBGPPeer.getCustomerAddress();
            jsonWriter.name("customerAddress");
            jsonWriter.value(customerAddress);
        }
        jsonWriter.endObject();
    }

    private static NewBGPPeerJsonMarshaller instance;

    public static NewBGPPeerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NewBGPPeerJsonMarshaller();
        return instance;
    }
}
