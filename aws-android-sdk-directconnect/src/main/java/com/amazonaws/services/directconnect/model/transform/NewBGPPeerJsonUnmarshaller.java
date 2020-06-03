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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO NewBGPPeer
 */
class NewBGPPeerJsonUnmarshaller implements Unmarshaller<NewBGPPeer, JsonUnmarshallerContext> {

    public NewBGPPeer unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        NewBGPPeer newBGPPeer = new NewBGPPeer();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("asn")) {
                newBGPPeer.setAsn(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("authKey")) {
                newBGPPeer.setAuthKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("addressFamily")) {
                newBGPPeer.setAddressFamily(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("amazonAddress")) {
                newBGPPeer.setAmazonAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("customerAddress")) {
                newBGPPeer.setCustomerAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return newBGPPeer;
    }

    private static NewBGPPeerJsonUnmarshaller instance;

    public static NewBGPPeerJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NewBGPPeerJsonUnmarshaller();
        return instance;
    }
}
