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
 * JSON unmarshaller for response CreateConnectionResult
 */
public class CreateConnectionResultJsonUnmarshaller implements
        Unmarshaller<CreateConnectionResult, JsonUnmarshallerContext> {

    public CreateConnectionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateConnectionResult createConnectionResult = new CreateConnectionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ownerAccount")) {
                createConnectionResult.setOwnerAccount(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionId")) {
                createConnectionResult.setConnectionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionName")) {
                createConnectionResult.setConnectionName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionState")) {
                createConnectionResult.setConnectionState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("region")) {
                createConnectionResult.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                createConnectionResult.setLocation(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("bandwidth")) {
                createConnectionResult.setBandwidth(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("vlan")) {
                createConnectionResult.setVlan(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("partnerName")) {
                createConnectionResult.setPartnerName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("loaIssueTime")) {
                createConnectionResult.setLoaIssueTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lagId")) {
                createConnectionResult.setLagId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDevice")) {
                createConnectionResult.setAwsDevice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jumboFrameCapable")) {
                createConnectionResult.setJumboFrameCapable(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDeviceV2")) {
                createConnectionResult.setAwsDeviceV2(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("hasLogicalRedundancy")) {
                createConnectionResult.setHasLogicalRedundancy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                createConnectionResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("providerName")) {
                createConnectionResult.setProviderName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createConnectionResult;
    }

    private static CreateConnectionResultJsonUnmarshaller instance;

    public static CreateConnectionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateConnectionResultJsonUnmarshaller();
        return instance;
    }
}
