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
 * JSON unmarshaller for response CreateLagResult
 */
public class CreateLagResultJsonUnmarshaller implements
        Unmarshaller<CreateLagResult, JsonUnmarshallerContext> {

    public CreateLagResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateLagResult createLagResult = new CreateLagResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("connectionsBandwidth")) {
                createLagResult.setConnectionsBandwidth(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("numberOfConnections")) {
                createLagResult.setNumberOfConnections(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lagId")) {
                createLagResult.setLagId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ownerAccount")) {
                createLagResult.setOwnerAccount(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lagName")) {
                createLagResult.setLagName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lagState")) {
                createLagResult.setLagState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                createLagResult.setLocation(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("region")) {
                createLagResult.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("minimumLinks")) {
                createLagResult.setMinimumLinks(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDevice")) {
                createLagResult.setAwsDevice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDeviceV2")) {
                createLagResult.setAwsDeviceV2(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connections")) {
                createLagResult.setConnections(new ListUnmarshaller<Connection>(
                        ConnectionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("allowsHostedConnections")) {
                createLagResult.setAllowsHostedConnections(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jumboFrameCapable")) {
                createLagResult.setJumboFrameCapable(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("hasLogicalRedundancy")) {
                createLagResult.setHasLogicalRedundancy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                createLagResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("providerName")) {
                createLagResult.setProviderName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createLagResult;
    }

    private static CreateLagResultJsonUnmarshaller instance;

    public static CreateLagResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateLagResultJsonUnmarshaller();
        return instance;
    }
}
