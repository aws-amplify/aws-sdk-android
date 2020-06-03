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
 * JSON unmarshaller for response DeleteLagResult
 */
public class DeleteLagResultJsonUnmarshaller implements
        Unmarshaller<DeleteLagResult, JsonUnmarshallerContext> {

    public DeleteLagResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteLagResult deleteLagResult = new DeleteLagResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("connectionsBandwidth")) {
                deleteLagResult.setConnectionsBandwidth(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("numberOfConnections")) {
                deleteLagResult.setNumberOfConnections(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lagId")) {
                deleteLagResult.setLagId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ownerAccount")) {
                deleteLagResult.setOwnerAccount(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lagName")) {
                deleteLagResult.setLagName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lagState")) {
                deleteLagResult.setLagState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                deleteLagResult.setLocation(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("region")) {
                deleteLagResult.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("minimumLinks")) {
                deleteLagResult.setMinimumLinks(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDevice")) {
                deleteLagResult.setAwsDevice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDeviceV2")) {
                deleteLagResult.setAwsDeviceV2(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connections")) {
                deleteLagResult.setConnections(new ListUnmarshaller<Connection>(
                        ConnectionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("allowsHostedConnections")) {
                deleteLagResult.setAllowsHostedConnections(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jumboFrameCapable")) {
                deleteLagResult.setJumboFrameCapable(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("hasLogicalRedundancy")) {
                deleteLagResult.setHasLogicalRedundancy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                deleteLagResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("providerName")) {
                deleteLagResult.setProviderName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return deleteLagResult;
    }

    private static DeleteLagResultJsonUnmarshaller instance;

    public static DeleteLagResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteLagResultJsonUnmarshaller();
        return instance;
    }
}
