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
 * JSON unmarshaller for response DisassociateConnectionFromLagResult
 */
public class DisassociateConnectionFromLagResultJsonUnmarshaller implements
        Unmarshaller<DisassociateConnectionFromLagResult, JsonUnmarshallerContext> {

    public DisassociateConnectionFromLagResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DisassociateConnectionFromLagResult disassociateConnectionFromLagResult = new DisassociateConnectionFromLagResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ownerAccount")) {
                disassociateConnectionFromLagResult.setOwnerAccount(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionId")) {
                disassociateConnectionFromLagResult.setConnectionId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionName")) {
                disassociateConnectionFromLagResult.setConnectionName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionState")) {
                disassociateConnectionFromLagResult.setConnectionState(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("region")) {
                disassociateConnectionFromLagResult.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                disassociateConnectionFromLagResult.setLocation(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("bandwidth")) {
                disassociateConnectionFromLagResult.setBandwidth(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("vlan")) {
                disassociateConnectionFromLagResult.setVlan(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("partnerName")) {
                disassociateConnectionFromLagResult.setPartnerName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("loaIssueTime")) {
                disassociateConnectionFromLagResult.setLoaIssueTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("lagId")) {
                disassociateConnectionFromLagResult.setLagId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDevice")) {
                disassociateConnectionFromLagResult.setAwsDevice(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("jumboFrameCapable")) {
                disassociateConnectionFromLagResult.setJumboFrameCapable(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDeviceV2")) {
                disassociateConnectionFromLagResult.setAwsDeviceV2(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("hasLogicalRedundancy")) {
                disassociateConnectionFromLagResult.setHasLogicalRedundancy(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                disassociateConnectionFromLagResult.setTags(new ListUnmarshaller<Tag>(
                        TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("providerName")) {
                disassociateConnectionFromLagResult.setProviderName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return disassociateConnectionFromLagResult;
    }

    private static DisassociateConnectionFromLagResultJsonUnmarshaller instance;

    public static DisassociateConnectionFromLagResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DisassociateConnectionFromLagResultJsonUnmarshaller();
        return instance;
    }
}
