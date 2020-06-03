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
 * JSON unmarshaller for POJO Lag
 */
class LagJsonUnmarshaller implements Unmarshaller<Lag, JsonUnmarshallerContext> {

    public Lag unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Lag lag = new Lag();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("connectionsBandwidth")) {
                lag.setConnectionsBandwidth(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("numberOfConnections")) {
                lag.setNumberOfConnections(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lagId")) {
                lag.setLagId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ownerAccount")) {
                lag.setOwnerAccount(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lagName")) {
                lag.setLagName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lagState")) {
                lag.setLagState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                lag.setLocation(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("region")) {
                lag.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("minimumLinks")) {
                lag.setMinimumLinks(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDevice")) {
                lag.setAwsDevice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsDeviceV2")) {
                lag.setAwsDeviceV2(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connections")) {
                lag.setConnections(new ListUnmarshaller<Connection>(ConnectionJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("allowsHostedConnections")) {
                lag.setAllowsHostedConnections(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jumboFrameCapable")) {
                lag.setJumboFrameCapable(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("hasLogicalRedundancy")) {
                lag.setHasLogicalRedundancy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                lag.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("providerName")) {
                lag.setProviderName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return lag;
    }

    private static LagJsonUnmarshaller instance;

    public static LagJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LagJsonUnmarshaller();
        return instance;
    }
}
