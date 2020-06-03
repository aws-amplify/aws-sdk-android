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
 * JSON unmarshaller for response AllocateHostedConnectionResult
 */
public class AllocateHostedConnectionResultJsonUnmarshaller implements
        Unmarshaller<AllocateHostedConnectionResult, JsonUnmarshallerContext> {

    public AllocateHostedConnectionResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AllocateHostedConnectionResult allocateHostedConnectionResult = new AllocateHostedConnectionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ownerAccount")) {
                allocateHostedConnectionResult.setOwnerAccount(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionId")) {
                allocateHostedConnectionResult.setConnectionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionName")) {
                allocateHostedConnectionResult.setConnectionName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionState")) {
                allocateHostedConnectionResult.setConnectionState(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("region")) {
                allocateHostedConnectionResult.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                allocateHostedConnectionResult.setLocation(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("bandwidth")) {
                allocateHostedConnectionResult.setBandwidth(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("vlan")) {
                allocateHostedConnectionResult.setVlan(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("partnerName")) {
                allocateHostedConnectionResult.setPartnerName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("loaIssueTime")) {
                allocateHostedConnectionResult.setLoaIssueTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lagId")) {
                allocateHostedConnectionResult.setLagId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDevice")) {
                allocateHostedConnectionResult.setAwsDevice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jumboFrameCapable")) {
                allocateHostedConnectionResult.setJumboFrameCapable(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDeviceV2")) {
                allocateHostedConnectionResult.setAwsDeviceV2(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("hasLogicalRedundancy")) {
                allocateHostedConnectionResult.setHasLogicalRedundancy(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                allocateHostedConnectionResult.setTags(new ListUnmarshaller<Tag>(
                        TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("providerName")) {
                allocateHostedConnectionResult.setProviderName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return allocateHostedConnectionResult;
    }

    private static AllocateHostedConnectionResultJsonUnmarshaller instance;

    public static AllocateHostedConnectionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AllocateHostedConnectionResultJsonUnmarshaller();
        return instance;
    }
}
