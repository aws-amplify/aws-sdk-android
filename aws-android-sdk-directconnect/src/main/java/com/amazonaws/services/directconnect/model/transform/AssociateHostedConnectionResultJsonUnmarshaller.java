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
 * JSON unmarshaller for response AssociateHostedConnectionResult
 */
public class AssociateHostedConnectionResultJsonUnmarshaller implements
        Unmarshaller<AssociateHostedConnectionResult, JsonUnmarshallerContext> {

    public AssociateHostedConnectionResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AssociateHostedConnectionResult associateHostedConnectionResult = new AssociateHostedConnectionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ownerAccount")) {
                associateHostedConnectionResult.setOwnerAccount(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionId")) {
                associateHostedConnectionResult.setConnectionId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionName")) {
                associateHostedConnectionResult.setConnectionName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionState")) {
                associateHostedConnectionResult.setConnectionState(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("region")) {
                associateHostedConnectionResult.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                associateHostedConnectionResult.setLocation(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("bandwidth")) {
                associateHostedConnectionResult.setBandwidth(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("vlan")) {
                associateHostedConnectionResult.setVlan(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("partnerName")) {
                associateHostedConnectionResult.setPartnerName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("loaIssueTime")) {
                associateHostedConnectionResult.setLoaIssueTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lagId")) {
                associateHostedConnectionResult.setLagId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDevice")) {
                associateHostedConnectionResult.setAwsDevice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jumboFrameCapable")) {
                associateHostedConnectionResult.setJumboFrameCapable(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDeviceV2")) {
                associateHostedConnectionResult.setAwsDeviceV2(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("hasLogicalRedundancy")) {
                associateHostedConnectionResult.setHasLogicalRedundancy(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                associateHostedConnectionResult.setTags(new ListUnmarshaller<Tag>(
                        TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("providerName")) {
                associateHostedConnectionResult.setProviderName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return associateHostedConnectionResult;
    }

    private static AssociateHostedConnectionResultJsonUnmarshaller instance;

    public static AssociateHostedConnectionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssociateHostedConnectionResultJsonUnmarshaller();
        return instance;
    }
}
