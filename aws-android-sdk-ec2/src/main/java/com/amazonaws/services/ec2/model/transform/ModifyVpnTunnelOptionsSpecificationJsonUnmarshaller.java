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
 * JSON unmarshaller for POJO ModifyVpnTunnelOptionsSpecification
 */
class ModifyVpnTunnelOptionsSpecificationJsonUnmarshaller implements
        Unmarshaller<ModifyVpnTunnelOptionsSpecification, JsonUnmarshallerContext> {

    public ModifyVpnTunnelOptionsSpecification unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ModifyVpnTunnelOptionsSpecification modifyVpnTunnelOptionsSpecification = new ModifyVpnTunnelOptionsSpecification();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TunnelInsideCidr")) {
                modifyVpnTunnelOptionsSpecification.setTunnelInsideCidr(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PreSharedKey")) {
                modifyVpnTunnelOptionsSpecification.setPreSharedKey(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Phase1LifetimeSeconds")) {
                modifyVpnTunnelOptionsSpecification
                        .setPhase1LifetimeSeconds(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Phase2LifetimeSeconds")) {
                modifyVpnTunnelOptionsSpecification
                        .setPhase2LifetimeSeconds(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("RekeyMarginTimeSeconds")) {
                modifyVpnTunnelOptionsSpecification
                        .setRekeyMarginTimeSeconds(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("RekeyFuzzPercentage")) {
                modifyVpnTunnelOptionsSpecification.setRekeyFuzzPercentage(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplayWindowSize")) {
                modifyVpnTunnelOptionsSpecification.setReplayWindowSize(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DPDTimeoutSeconds")) {
                modifyVpnTunnelOptionsSpecification.setDPDTimeoutSeconds(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Phase1EncryptionAlgorithms")) {
                modifyVpnTunnelOptionsSpecification
                        .setPhase1EncryptionAlgorithms(new ListUnmarshaller<Phase1EncryptionAlgorithmsRequestListValue>(
                                Phase1EncryptionAlgorithmsRequestListValueJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Phase2EncryptionAlgorithms")) {
                modifyVpnTunnelOptionsSpecification
                        .setPhase2EncryptionAlgorithms(new ListUnmarshaller<Phase2EncryptionAlgorithmsRequestListValue>(
                                Phase2EncryptionAlgorithmsRequestListValueJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Phase1IntegrityAlgorithms")) {
                modifyVpnTunnelOptionsSpecification
                        .setPhase1IntegrityAlgorithms(new ListUnmarshaller<Phase1IntegrityAlgorithmsRequestListValue>(
                                Phase1IntegrityAlgorithmsRequestListValueJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Phase2IntegrityAlgorithms")) {
                modifyVpnTunnelOptionsSpecification
                        .setPhase2IntegrityAlgorithms(new ListUnmarshaller<Phase2IntegrityAlgorithmsRequestListValue>(
                                Phase2IntegrityAlgorithmsRequestListValueJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Phase1DHGroupNumbers")) {
                modifyVpnTunnelOptionsSpecification
                        .setPhase1DHGroupNumbers(new ListUnmarshaller<Phase1DHGroupNumbersRequestListValue>(
                                Phase1DHGroupNumbersRequestListValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Phase2DHGroupNumbers")) {
                modifyVpnTunnelOptionsSpecification
                        .setPhase2DHGroupNumbers(new ListUnmarshaller<Phase2DHGroupNumbersRequestListValue>(
                                Phase2DHGroupNumbersRequestListValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("IKEVersions")) {
                modifyVpnTunnelOptionsSpecification
                        .setIKEVersions(new ListUnmarshaller<IKEVersionsRequestListValue>(
                                IKEVersionsRequestListValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return modifyVpnTunnelOptionsSpecification;
    }

    private static ModifyVpnTunnelOptionsSpecificationJsonUnmarshaller instance;

    public static ModifyVpnTunnelOptionsSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyVpnTunnelOptionsSpecificationJsonUnmarshaller();
        return instance;
    }
}
