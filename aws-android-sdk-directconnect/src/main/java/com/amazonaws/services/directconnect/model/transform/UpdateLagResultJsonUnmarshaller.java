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
 * JSON unmarshaller for response UpdateLagResult
 */
public class UpdateLagResultJsonUnmarshaller implements
        Unmarshaller<UpdateLagResult, JsonUnmarshallerContext> {

    public UpdateLagResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateLagResult updateLagResult = new UpdateLagResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("connectionsBandwidth")) {
                updateLagResult.setConnectionsBandwidth(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("numberOfConnections")) {
                updateLagResult.setNumberOfConnections(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lagId")) {
                updateLagResult.setLagId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ownerAccount")) {
                updateLagResult.setOwnerAccount(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lagName")) {
                updateLagResult.setLagName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lagState")) {
                updateLagResult.setLagState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                updateLagResult.setLocation(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("region")) {
                updateLagResult.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("minimumLinks")) {
                updateLagResult.setMinimumLinks(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDevice")) {
                updateLagResult.setAwsDevice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDeviceV2")) {
                updateLagResult.setAwsDeviceV2(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connections")) {
                updateLagResult.setConnections(new ListUnmarshaller<Connection>(
                        ConnectionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("allowsHostedConnections")) {
                updateLagResult.setAllowsHostedConnections(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jumboFrameCapable")) {
                updateLagResult.setJumboFrameCapable(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("hasLogicalRedundancy")) {
                updateLagResult.setHasLogicalRedundancy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                updateLagResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("providerName")) {
                updateLagResult.setProviderName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateLagResult;
    }

    private static UpdateLagResultJsonUnmarshaller instance;

    public static UpdateLagResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateLagResultJsonUnmarshaller();
        return instance;
    }
}
