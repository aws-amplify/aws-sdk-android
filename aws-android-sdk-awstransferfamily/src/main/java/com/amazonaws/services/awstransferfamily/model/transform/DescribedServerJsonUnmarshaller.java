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

package com.amazonaws.services.awstransferfamily.model.transform;

import com.amazonaws.services.awstransferfamily.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DescribedServer
 */
class DescribedServerJsonUnmarshaller implements
        Unmarshaller<DescribedServer, JsonUnmarshallerContext> {

    public DescribedServer unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DescribedServer describedServer = new DescribedServer();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                describedServer.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Certificate")) {
                describedServer.setCertificate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndpointDetails")) {
                describedServer.setEndpointDetails(EndpointDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndpointType")) {
                describedServer.setEndpointType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HostKeyFingerprint")) {
                describedServer.setHostKeyFingerprint(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IdentityProviderDetails")) {
                describedServer.setIdentityProviderDetails(IdentityProviderDetailsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("IdentityProviderType")) {
                describedServer.setIdentityProviderType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LoggingRole")) {
                describedServer.setLoggingRole(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Protocols")) {
                describedServer.setProtocols(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ServerId")) {
                describedServer.setServerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                describedServer.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                describedServer.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("UserCount")) {
                describedServer.setUserCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return describedServer;
    }

    private static DescribedServerJsonUnmarshaller instance;

    public static DescribedServerJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribedServerJsonUnmarshaller();
        return instance;
    }
}
