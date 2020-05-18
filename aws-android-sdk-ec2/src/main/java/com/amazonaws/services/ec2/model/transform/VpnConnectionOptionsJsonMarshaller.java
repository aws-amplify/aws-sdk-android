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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO VpnConnectionOptions
 */
class VpnConnectionOptionsJsonMarshaller {

    public void marshall(VpnConnectionOptions vpnConnectionOptions, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (vpnConnectionOptions.getEnableAcceleration() != null) {
            Boolean enableAcceleration = vpnConnectionOptions.getEnableAcceleration();
            jsonWriter.name("EnableAcceleration");
            jsonWriter.value(enableAcceleration);
        }
        if (vpnConnectionOptions.getStaticRoutesOnly() != null) {
            Boolean staticRoutesOnly = vpnConnectionOptions.getStaticRoutesOnly();
            jsonWriter.name("StaticRoutesOnly");
            jsonWriter.value(staticRoutesOnly);
        }
        if (vpnConnectionOptions.getTunnelOptions() != null) {
            java.util.List<TunnelOption> tunnelOptions = vpnConnectionOptions.getTunnelOptions();
            jsonWriter.name("TunnelOptions");
            jsonWriter.beginArray();
            for (TunnelOption tunnelOptionsItem : tunnelOptions) {
                if (tunnelOptionsItem != null) {
                    TunnelOptionJsonMarshaller.getInstance()
                            .marshall(tunnelOptionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static VpnConnectionOptionsJsonMarshaller instance;

    public static VpnConnectionOptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VpnConnectionOptionsJsonMarshaller();
        return instance;
    }
}
