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
 * JSON unmarshaller for response AllocateConnectionOnInterconnectResult
 */
public class AllocateConnectionOnInterconnectResultJsonUnmarshaller implements
        Unmarshaller<AllocateConnectionOnInterconnectResult, JsonUnmarshallerContext> {

    public AllocateConnectionOnInterconnectResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AllocateConnectionOnInterconnectResult allocateConnectionOnInterconnectResult = new AllocateConnectionOnInterconnectResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ownerAccount")) {
                allocateConnectionOnInterconnectResult.setOwnerAccount(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionId")) {
                allocateConnectionOnInterconnectResult.setConnectionId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionName")) {
                allocateConnectionOnInterconnectResult.setConnectionName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionState")) {
                allocateConnectionOnInterconnectResult.setConnectionState(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("region")) {
                allocateConnectionOnInterconnectResult.setRegion(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                allocateConnectionOnInterconnectResult.setLocation(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("bandwidth")) {
                allocateConnectionOnInterconnectResult.setBandwidth(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("vlan")) {
                allocateConnectionOnInterconnectResult.setVlan(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("partnerName")) {
                allocateConnectionOnInterconnectResult.setPartnerName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("loaIssueTime")) {
                allocateConnectionOnInterconnectResult.setLoaIssueTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("lagId")) {
                allocateConnectionOnInterconnectResult.setLagId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDevice")) {
                allocateConnectionOnInterconnectResult.setAwsDevice(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("jumboFrameCapable")) {
                allocateConnectionOnInterconnectResult.setJumboFrameCapable(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDeviceV2")) {
                allocateConnectionOnInterconnectResult.setAwsDeviceV2(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("hasLogicalRedundancy")) {
                allocateConnectionOnInterconnectResult
                        .setHasLogicalRedundancy(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("tags")) {
                allocateConnectionOnInterconnectResult.setTags(new ListUnmarshaller<Tag>(
                        TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("providerName")) {
                allocateConnectionOnInterconnectResult.setProviderName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return allocateConnectionOnInterconnectResult;
    }

    private static AllocateConnectionOnInterconnectResultJsonUnmarshaller instance;

    public static AllocateConnectionOnInterconnectResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AllocateConnectionOnInterconnectResultJsonUnmarshaller();
        return instance;
    }
}
