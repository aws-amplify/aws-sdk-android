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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO InstanceAccessDetails
 */
class InstanceAccessDetailsJsonUnmarshaller implements
        Unmarshaller<InstanceAccessDetails, JsonUnmarshallerContext> {

    public InstanceAccessDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InstanceAccessDetails instanceAccessDetails = new InstanceAccessDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("certKey")) {
                instanceAccessDetails.setCertKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("expiresAt")) {
                instanceAccessDetails.setExpiresAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ipAddress")) {
                instanceAccessDetails.setIpAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("password")) {
                instanceAccessDetails.setPassword(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("passwordData")) {
                instanceAccessDetails.setPasswordData(PasswordDataJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("privateKey")) {
                instanceAccessDetails.setPrivateKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("protocol")) {
                instanceAccessDetails.setProtocol(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("instanceName")) {
                instanceAccessDetails.setInstanceName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("username")) {
                instanceAccessDetails.setUsername(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("hostKeys")) {
                instanceAccessDetails.setHostKeys(new ListUnmarshaller<HostKeyAttributes>(
                        HostKeyAttributesJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return instanceAccessDetails;
    }

    private static InstanceAccessDetailsJsonUnmarshaller instance;

    public static InstanceAccessDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceAccessDetailsJsonUnmarshaller();
        return instance;
    }
}
