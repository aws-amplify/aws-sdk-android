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
 * JSON marshaller for POJO VpnTunnelOptionsSpecification
 */
class VpnTunnelOptionsSpecificationJsonMarshaller {

    public void marshall(VpnTunnelOptionsSpecification vpnTunnelOptionsSpecification,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (vpnTunnelOptionsSpecification.getTunnelInsideCidr() != null) {
            String tunnelInsideCidr = vpnTunnelOptionsSpecification.getTunnelInsideCidr();
            jsonWriter.name("TunnelInsideCidr");
            jsonWriter.value(tunnelInsideCidr);
        }
        if (vpnTunnelOptionsSpecification.getPreSharedKey() != null) {
            String preSharedKey = vpnTunnelOptionsSpecification.getPreSharedKey();
            jsonWriter.name("PreSharedKey");
            jsonWriter.value(preSharedKey);
        }
        if (vpnTunnelOptionsSpecification.getPhase1LifetimeSeconds() != null) {
            Integer phase1LifetimeSeconds = vpnTunnelOptionsSpecification
                    .getPhase1LifetimeSeconds();
            jsonWriter.name("Phase1LifetimeSeconds");
            jsonWriter.value(phase1LifetimeSeconds);
        }
        if (vpnTunnelOptionsSpecification.getPhase2LifetimeSeconds() != null) {
            Integer phase2LifetimeSeconds = vpnTunnelOptionsSpecification
                    .getPhase2LifetimeSeconds();
            jsonWriter.name("Phase2LifetimeSeconds");
            jsonWriter.value(phase2LifetimeSeconds);
        }
        if (vpnTunnelOptionsSpecification.getRekeyMarginTimeSeconds() != null) {
            Integer rekeyMarginTimeSeconds = vpnTunnelOptionsSpecification
                    .getRekeyMarginTimeSeconds();
            jsonWriter.name("RekeyMarginTimeSeconds");
            jsonWriter.value(rekeyMarginTimeSeconds);
        }
        if (vpnTunnelOptionsSpecification.getRekeyFuzzPercentage() != null) {
            Integer rekeyFuzzPercentage = vpnTunnelOptionsSpecification.getRekeyFuzzPercentage();
            jsonWriter.name("RekeyFuzzPercentage");
            jsonWriter.value(rekeyFuzzPercentage);
        }
        if (vpnTunnelOptionsSpecification.getReplayWindowSize() != null) {
            Integer replayWindowSize = vpnTunnelOptionsSpecification.getReplayWindowSize();
            jsonWriter.name("ReplayWindowSize");
            jsonWriter.value(replayWindowSize);
        }
        if (vpnTunnelOptionsSpecification.getDPDTimeoutSeconds() != null) {
            Integer dPDTimeoutSeconds = vpnTunnelOptionsSpecification.getDPDTimeoutSeconds();
            jsonWriter.name("DPDTimeoutSeconds");
            jsonWriter.value(dPDTimeoutSeconds);
        }
        if (vpnTunnelOptionsSpecification.getPhase1EncryptionAlgorithms() != null) {
            java.util.List<Phase1EncryptionAlgorithmsRequestListValue> phase1EncryptionAlgorithms = vpnTunnelOptionsSpecification
                    .getPhase1EncryptionAlgorithms();
            jsonWriter.name("Phase1EncryptionAlgorithms");
            jsonWriter.beginArray();
            for (Phase1EncryptionAlgorithmsRequestListValue phase1EncryptionAlgorithmsItem : phase1EncryptionAlgorithms) {
                if (phase1EncryptionAlgorithmsItem != null) {
                    Phase1EncryptionAlgorithmsRequestListValueJsonMarshaller.getInstance()
                            .marshall(phase1EncryptionAlgorithmsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (vpnTunnelOptionsSpecification.getPhase2EncryptionAlgorithms() != null) {
            java.util.List<Phase2EncryptionAlgorithmsRequestListValue> phase2EncryptionAlgorithms = vpnTunnelOptionsSpecification
                    .getPhase2EncryptionAlgorithms();
            jsonWriter.name("Phase2EncryptionAlgorithms");
            jsonWriter.beginArray();
            for (Phase2EncryptionAlgorithmsRequestListValue phase2EncryptionAlgorithmsItem : phase2EncryptionAlgorithms) {
                if (phase2EncryptionAlgorithmsItem != null) {
                    Phase2EncryptionAlgorithmsRequestListValueJsonMarshaller.getInstance()
                            .marshall(phase2EncryptionAlgorithmsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (vpnTunnelOptionsSpecification.getPhase1IntegrityAlgorithms() != null) {
            java.util.List<Phase1IntegrityAlgorithmsRequestListValue> phase1IntegrityAlgorithms = vpnTunnelOptionsSpecification
                    .getPhase1IntegrityAlgorithms();
            jsonWriter.name("Phase1IntegrityAlgorithms");
            jsonWriter.beginArray();
            for (Phase1IntegrityAlgorithmsRequestListValue phase1IntegrityAlgorithmsItem : phase1IntegrityAlgorithms) {
                if (phase1IntegrityAlgorithmsItem != null) {
                    Phase1IntegrityAlgorithmsRequestListValueJsonMarshaller.getInstance().marshall(
                            phase1IntegrityAlgorithmsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (vpnTunnelOptionsSpecification.getPhase2IntegrityAlgorithms() != null) {
            java.util.List<Phase2IntegrityAlgorithmsRequestListValue> phase2IntegrityAlgorithms = vpnTunnelOptionsSpecification
                    .getPhase2IntegrityAlgorithms();
            jsonWriter.name("Phase2IntegrityAlgorithms");
            jsonWriter.beginArray();
            for (Phase2IntegrityAlgorithmsRequestListValue phase2IntegrityAlgorithmsItem : phase2IntegrityAlgorithms) {
                if (phase2IntegrityAlgorithmsItem != null) {
                    Phase2IntegrityAlgorithmsRequestListValueJsonMarshaller.getInstance().marshall(
                            phase2IntegrityAlgorithmsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (vpnTunnelOptionsSpecification.getPhase1DHGroupNumbers() != null) {
            java.util.List<Phase1DHGroupNumbersRequestListValue> phase1DHGroupNumbers = vpnTunnelOptionsSpecification
                    .getPhase1DHGroupNumbers();
            jsonWriter.name("Phase1DHGroupNumbers");
            jsonWriter.beginArray();
            for (Phase1DHGroupNumbersRequestListValue phase1DHGroupNumbersItem : phase1DHGroupNumbers) {
                if (phase1DHGroupNumbersItem != null) {
                    Phase1DHGroupNumbersRequestListValueJsonMarshaller.getInstance().marshall(
                            phase1DHGroupNumbersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (vpnTunnelOptionsSpecification.getPhase2DHGroupNumbers() != null) {
            java.util.List<Phase2DHGroupNumbersRequestListValue> phase2DHGroupNumbers = vpnTunnelOptionsSpecification
                    .getPhase2DHGroupNumbers();
            jsonWriter.name("Phase2DHGroupNumbers");
            jsonWriter.beginArray();
            for (Phase2DHGroupNumbersRequestListValue phase2DHGroupNumbersItem : phase2DHGroupNumbers) {
                if (phase2DHGroupNumbersItem != null) {
                    Phase2DHGroupNumbersRequestListValueJsonMarshaller.getInstance().marshall(
                            phase2DHGroupNumbersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (vpnTunnelOptionsSpecification.getIKEVersions() != null) {
            java.util.List<IKEVersionsRequestListValue> iKEVersions = vpnTunnelOptionsSpecification
                    .getIKEVersions();
            jsonWriter.name("IKEVersions");
            jsonWriter.beginArray();
            for (IKEVersionsRequestListValue iKEVersionsItem : iKEVersions) {
                if (iKEVersionsItem != null) {
                    IKEVersionsRequestListValueJsonMarshaller.getInstance().marshall(
                            iKEVersionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static VpnTunnelOptionsSpecificationJsonMarshaller instance;

    public static VpnTunnelOptionsSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VpnTunnelOptionsSpecificationJsonMarshaller();
        return instance;
    }
}
