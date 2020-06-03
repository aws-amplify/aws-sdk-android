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
 * JSON unmarshaller for response DeleteConnectionResult
 */
public class DeleteConnectionResultJsonUnmarshaller implements
        Unmarshaller<DeleteConnectionResult, JsonUnmarshallerContext> {

    public DeleteConnectionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteConnectionResult deleteConnectionResult = new DeleteConnectionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ownerAccount")) {
                deleteConnectionResult.setOwnerAccount(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionId")) {
                deleteConnectionResult.setConnectionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionName")) {
                deleteConnectionResult.setConnectionName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectionState")) {
                deleteConnectionResult.setConnectionState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("region")) {
                deleteConnectionResult.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                deleteConnectionResult.setLocation(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("bandwidth")) {
                deleteConnectionResult.setBandwidth(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("vlan")) {
                deleteConnectionResult.setVlan(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("partnerName")) {
                deleteConnectionResult.setPartnerName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("loaIssueTime")) {
                deleteConnectionResult.setLoaIssueTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lagId")) {
                deleteConnectionResult.setLagId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDevice")) {
                deleteConnectionResult.setAwsDevice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jumboFrameCapable")) {
                deleteConnectionResult.setJumboFrameCapable(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDeviceV2")) {
                deleteConnectionResult.setAwsDeviceV2(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("hasLogicalRedundancy")) {
                deleteConnectionResult.setHasLogicalRedundancy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                deleteConnectionResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("providerName")) {
                deleteConnectionResult.setProviderName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return deleteConnectionResult;
    }

    private static DeleteConnectionResultJsonUnmarshaller instance;

    public static DeleteConnectionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteConnectionResultJsonUnmarshaller();
        return instance;
    }
}
