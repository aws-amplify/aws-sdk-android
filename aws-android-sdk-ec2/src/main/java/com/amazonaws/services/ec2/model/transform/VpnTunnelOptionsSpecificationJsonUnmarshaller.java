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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO VpnTunnelOptionsSpecification
 */
class VpnTunnelOptionsSpecificationJsonUnmarshaller implements
        Unmarshaller<VpnTunnelOptionsSpecification, JsonUnmarshallerContext> {

    public VpnTunnelOptionsSpecification unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        VpnTunnelOptionsSpecification vpnTunnelOptionsSpecification = new VpnTunnelOptionsSpecification();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TunnelInsideCidr")) {
                vpnTunnelOptionsSpecification.setTunnelInsideCidr(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PreSharedKey")) {
                vpnTunnelOptionsSpecification.setPreSharedKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Phase1LifetimeSeconds")) {
                vpnTunnelOptionsSpecification.setPhase1LifetimeSeconds(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Phase2LifetimeSeconds")) {
                vpnTunnelOptionsSpecification.setPhase2LifetimeSeconds(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RekeyMarginTimeSeconds")) {
                vpnTunnelOptionsSpecification.setRekeyMarginTimeSeconds(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RekeyFuzzPercentage")) {
                vpnTunnelOptionsSpecification.setRekeyFuzzPercentage(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplayWindowSize")) {
                vpnTunnelOptionsSpecification.setReplayWindowSize(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DPDTimeoutSeconds")) {
                vpnTunnelOptionsSpecification.setDPDTimeoutSeconds(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Phase1EncryptionAlgorithms")) {
                vpnTunnelOptionsSpecification
                        .setPhase1EncryptionAlgorithms(new ListUnmarshaller<Phase1EncryptionAlgorithmsRequestListValue>(
                                Phase1EncryptionAlgorithmsRequestListValueJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Phase2EncryptionAlgorithms")) {
                vpnTunnelOptionsSpecification
                        .setPhase2EncryptionAlgorithms(new ListUnmarshaller<Phase2EncryptionAlgorithmsRequestListValue>(
                                Phase2EncryptionAlgorithmsRequestListValueJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Phase1IntegrityAlgorithms")) {
                vpnTunnelOptionsSpecification
                        .setPhase1IntegrityAlgorithms(new ListUnmarshaller<Phase1IntegrityAlgorithmsRequestListValue>(
                                Phase1IntegrityAlgorithmsRequestListValueJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Phase2IntegrityAlgorithms")) {
                vpnTunnelOptionsSpecification
                        .setPhase2IntegrityAlgorithms(new ListUnmarshaller<Phase2IntegrityAlgorithmsRequestListValue>(
                                Phase2IntegrityAlgorithmsRequestListValueJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Phase1DHGroupNumbers")) {
                vpnTunnelOptionsSpecification
                        .setPhase1DHGroupNumbers(new ListUnmarshaller<Phase1DHGroupNumbersRequestListValue>(
                                Phase1DHGroupNumbersRequestListValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Phase2DHGroupNumbers")) {
                vpnTunnelOptionsSpecification
                        .setPhase2DHGroupNumbers(new ListUnmarshaller<Phase2DHGroupNumbersRequestListValue>(
                                Phase2DHGroupNumbersRequestListValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("IKEVersions")) {
                vpnTunnelOptionsSpecification
                        .setIKEVersions(new ListUnmarshaller<IKEVersionsRequestListValue>(
                                IKEVersionsRequestListValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return vpnTunnelOptionsSpecification;
    }

    private static VpnTunnelOptionsSpecificationJsonUnmarshaller instance;

    public static VpnTunnelOptionsSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VpnTunnelOptionsSpecificationJsonUnmarshaller();
        return instance;
    }
}
