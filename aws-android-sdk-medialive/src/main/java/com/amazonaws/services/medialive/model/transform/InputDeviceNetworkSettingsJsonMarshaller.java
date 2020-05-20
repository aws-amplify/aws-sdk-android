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

package com.amazonaws.services.medialive.model.transform;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InputDeviceNetworkSettings
 */
class InputDeviceNetworkSettingsJsonMarshaller {

    public void marshall(InputDeviceNetworkSettings inputDeviceNetworkSettings,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (inputDeviceNetworkSettings.getDnsAddresses() != null) {
            java.util.List<String> dnsAddresses = inputDeviceNetworkSettings.getDnsAddresses();
            jsonWriter.name("DnsAddresses");
            jsonWriter.beginArray();
            for (String dnsAddressesItem : dnsAddresses) {
                if (dnsAddressesItem != null) {
                    jsonWriter.value(dnsAddressesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (inputDeviceNetworkSettings.getGateway() != null) {
            String gateway = inputDeviceNetworkSettings.getGateway();
            jsonWriter.name("Gateway");
            jsonWriter.value(gateway);
        }
        if (inputDeviceNetworkSettings.getIpAddress() != null) {
            String ipAddress = inputDeviceNetworkSettings.getIpAddress();
            jsonWriter.name("IpAddress");
            jsonWriter.value(ipAddress);
        }
        if (inputDeviceNetworkSettings.getIpScheme() != null) {
            String ipScheme = inputDeviceNetworkSettings.getIpScheme();
            jsonWriter.name("IpScheme");
            jsonWriter.value(ipScheme);
        }
        if (inputDeviceNetworkSettings.getSubnetMask() != null) {
            String subnetMask = inputDeviceNetworkSettings.getSubnetMask();
            jsonWriter.name("SubnetMask");
            jsonWriter.value(subnetMask);
        }
        jsonWriter.endObject();
    }

    private static InputDeviceNetworkSettingsJsonMarshaller instance;

    public static InputDeviceNetworkSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InputDeviceNetworkSettingsJsonMarshaller();
        return instance;
    }
}
