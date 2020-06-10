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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstanceAccessDetails
 */
class InstanceAccessDetailsJsonMarshaller {

    public void marshall(InstanceAccessDetails instanceAccessDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceAccessDetails.getCertKey() != null) {
            String certKey = instanceAccessDetails.getCertKey();
            jsonWriter.name("certKey");
            jsonWriter.value(certKey);
        }
        if (instanceAccessDetails.getExpiresAt() != null) {
            java.util.Date expiresAt = instanceAccessDetails.getExpiresAt();
            jsonWriter.name("expiresAt");
            jsonWriter.value(expiresAt);
        }
        if (instanceAccessDetails.getIpAddress() != null) {
            String ipAddress = instanceAccessDetails.getIpAddress();
            jsonWriter.name("ipAddress");
            jsonWriter.value(ipAddress);
        }
        if (instanceAccessDetails.getPassword() != null) {
            String password = instanceAccessDetails.getPassword();
            jsonWriter.name("password");
            jsonWriter.value(password);
        }
        if (instanceAccessDetails.getPasswordData() != null) {
            PasswordData passwordData = instanceAccessDetails.getPasswordData();
            jsonWriter.name("passwordData");
            PasswordDataJsonMarshaller.getInstance().marshall(passwordData, jsonWriter);
        }
        if (instanceAccessDetails.getPrivateKey() != null) {
            String privateKey = instanceAccessDetails.getPrivateKey();
            jsonWriter.name("privateKey");
            jsonWriter.value(privateKey);
        }
        if (instanceAccessDetails.getProtocol() != null) {
            String protocol = instanceAccessDetails.getProtocol();
            jsonWriter.name("protocol");
            jsonWriter.value(protocol);
        }
        if (instanceAccessDetails.getInstanceName() != null) {
            String instanceName = instanceAccessDetails.getInstanceName();
            jsonWriter.name("instanceName");
            jsonWriter.value(instanceName);
        }
        if (instanceAccessDetails.getUsername() != null) {
            String username = instanceAccessDetails.getUsername();
            jsonWriter.name("username");
            jsonWriter.value(username);
        }
        if (instanceAccessDetails.getHostKeys() != null) {
            java.util.List<HostKeyAttributes> hostKeys = instanceAccessDetails.getHostKeys();
            jsonWriter.name("hostKeys");
            jsonWriter.beginArray();
            for (HostKeyAttributes hostKeysItem : hostKeys) {
                if (hostKeysItem != null) {
                    HostKeyAttributesJsonMarshaller.getInstance()
                            .marshall(hostKeysItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static InstanceAccessDetailsJsonMarshaller instance;

    public static InstanceAccessDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceAccessDetailsJsonMarshaller();
        return instance;
    }
}
