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
 * JSON unmarshaller for POJO TunnelOption
 */
class TunnelOptionJsonUnmarshaller implements Unmarshaller<TunnelOption, JsonUnmarshallerContext> {

    public TunnelOption unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TunnelOption tunnelOption = new TunnelOption();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("OutsideIpAddress")) {
                tunnelOption.setOutsideIpAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TunnelInsideCidr")) {
                tunnelOption.setTunnelInsideCidr(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PreSharedKey")) {
                tunnelOption.setPreSharedKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Phase1LifetimeSeconds")) {
                tunnelOption.setPhase1LifetimeSeconds(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Phase2LifetimeSeconds")) {
                tunnelOption.setPhase2LifetimeSeconds(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RekeyMarginTimeSeconds")) {
                tunnelOption.setRekeyMarginTimeSeconds(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RekeyFuzzPercentage")) {
                tunnelOption.setRekeyFuzzPercentage(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplayWindowSize")) {
                tunnelOption.setReplayWindowSize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DpdTimeoutSeconds")) {
                tunnelOption.setDpdTimeoutSeconds(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Phase1EncryptionAlgorithms")) {
                tunnelOption
                        .setPhase1EncryptionAlgorithms(new ListUnmarshaller<Phase1EncryptionAlgorithmsListValue>(
                                Phase1EncryptionAlgorithmsListValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Phase2EncryptionAlgorithms")) {
                tunnelOption
                        .setPhase2EncryptionAlgorithms(new ListUnmarshaller<Phase2EncryptionAlgorithmsListValue>(
                                Phase2EncryptionAlgorithmsListValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Phase1IntegrityAlgorithms")) {
                tunnelOption
                        .setPhase1IntegrityAlgorithms(new ListUnmarshaller<Phase1IntegrityAlgorithmsListValue>(
                                Phase1IntegrityAlgorithmsListValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Phase2IntegrityAlgorithms")) {
                tunnelOption
                        .setPhase2IntegrityAlgorithms(new ListUnmarshaller<Phase2IntegrityAlgorithmsListValue>(
                                Phase2IntegrityAlgorithmsListValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Phase1DHGroupNumbers")) {
                tunnelOption
                        .setPhase1DHGroupNumbers(new ListUnmarshaller<Phase1DHGroupNumbersListValue>(
                                Phase1DHGroupNumbersListValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Phase2DHGroupNumbers")) {
                tunnelOption
                        .setPhase2DHGroupNumbers(new ListUnmarshaller<Phase2DHGroupNumbersListValue>(
                                Phase2DHGroupNumbersListValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("IkeVersions")) {
                tunnelOption.setIkeVersions(new ListUnmarshaller<IKEVersionsListValue>(
                        IKEVersionsListValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return tunnelOption;
    }

    private static TunnelOptionJsonUnmarshaller instance;

    public static TunnelOptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TunnelOptionJsonUnmarshaller();
        return instance;
    }
}
