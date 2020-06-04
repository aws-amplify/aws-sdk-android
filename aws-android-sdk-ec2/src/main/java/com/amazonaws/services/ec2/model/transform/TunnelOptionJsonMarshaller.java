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
 * JSON marshaller for POJO TunnelOption
 */
class TunnelOptionJsonMarshaller {

    public void marshall(TunnelOption tunnelOption, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (tunnelOption.getOutsideIpAddress() != null) {
            String outsideIpAddress = tunnelOption.getOutsideIpAddress();
            jsonWriter.name("OutsideIpAddress");
            jsonWriter.value(outsideIpAddress);
        }
        if (tunnelOption.getTunnelInsideCidr() != null) {
            String tunnelInsideCidr = tunnelOption.getTunnelInsideCidr();
            jsonWriter.name("TunnelInsideCidr");
            jsonWriter.value(tunnelInsideCidr);
        }
        if (tunnelOption.getPreSharedKey() != null) {
            String preSharedKey = tunnelOption.getPreSharedKey();
            jsonWriter.name("PreSharedKey");
            jsonWriter.value(preSharedKey);
        }
        if (tunnelOption.getPhase1LifetimeSeconds() != null) {
            Integer phase1LifetimeSeconds = tunnelOption.getPhase1LifetimeSeconds();
            jsonWriter.name("Phase1LifetimeSeconds");
            jsonWriter.value(phase1LifetimeSeconds);
        }
        if (tunnelOption.getPhase2LifetimeSeconds() != null) {
            Integer phase2LifetimeSeconds = tunnelOption.getPhase2LifetimeSeconds();
            jsonWriter.name("Phase2LifetimeSeconds");
            jsonWriter.value(phase2LifetimeSeconds);
        }
        if (tunnelOption.getRekeyMarginTimeSeconds() != null) {
            Integer rekeyMarginTimeSeconds = tunnelOption.getRekeyMarginTimeSeconds();
            jsonWriter.name("RekeyMarginTimeSeconds");
            jsonWriter.value(rekeyMarginTimeSeconds);
        }
        if (tunnelOption.getRekeyFuzzPercentage() != null) {
            Integer rekeyFuzzPercentage = tunnelOption.getRekeyFuzzPercentage();
            jsonWriter.name("RekeyFuzzPercentage");
            jsonWriter.value(rekeyFuzzPercentage);
        }
        if (tunnelOption.getReplayWindowSize() != null) {
            Integer replayWindowSize = tunnelOption.getReplayWindowSize();
            jsonWriter.name("ReplayWindowSize");
            jsonWriter.value(replayWindowSize);
        }
        if (tunnelOption.getDpdTimeoutSeconds() != null) {
            Integer dpdTimeoutSeconds = tunnelOption.getDpdTimeoutSeconds();
            jsonWriter.name("DpdTimeoutSeconds");
            jsonWriter.value(dpdTimeoutSeconds);
        }
        if (tunnelOption.getPhase1EncryptionAlgorithms() != null) {
            java.util.List<Phase1EncryptionAlgorithmsListValue> phase1EncryptionAlgorithms = tunnelOption
                    .getPhase1EncryptionAlgorithms();
            jsonWriter.name("Phase1EncryptionAlgorithms");
            jsonWriter.beginArray();
            for (Phase1EncryptionAlgorithmsListValue phase1EncryptionAlgorithmsItem : phase1EncryptionAlgorithms) {
                if (phase1EncryptionAlgorithmsItem != null) {
                    Phase1EncryptionAlgorithmsListValueJsonMarshaller.getInstance().marshall(
                            phase1EncryptionAlgorithmsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (tunnelOption.getPhase2EncryptionAlgorithms() != null) {
            java.util.List<Phase2EncryptionAlgorithmsListValue> phase2EncryptionAlgorithms = tunnelOption
                    .getPhase2EncryptionAlgorithms();
            jsonWriter.name("Phase2EncryptionAlgorithms");
            jsonWriter.beginArray();
            for (Phase2EncryptionAlgorithmsListValue phase2EncryptionAlgorithmsItem : phase2EncryptionAlgorithms) {
                if (phase2EncryptionAlgorithmsItem != null) {
                    Phase2EncryptionAlgorithmsListValueJsonMarshaller.getInstance().marshall(
                            phase2EncryptionAlgorithmsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (tunnelOption.getPhase1IntegrityAlgorithms() != null) {
            java.util.List<Phase1IntegrityAlgorithmsListValue> phase1IntegrityAlgorithms = tunnelOption
                    .getPhase1IntegrityAlgorithms();
            jsonWriter.name("Phase1IntegrityAlgorithms");
            jsonWriter.beginArray();
            for (Phase1IntegrityAlgorithmsListValue phase1IntegrityAlgorithmsItem : phase1IntegrityAlgorithms) {
                if (phase1IntegrityAlgorithmsItem != null) {
                    Phase1IntegrityAlgorithmsListValueJsonMarshaller.getInstance().marshall(
                            phase1IntegrityAlgorithmsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (tunnelOption.getPhase2IntegrityAlgorithms() != null) {
            java.util.List<Phase2IntegrityAlgorithmsListValue> phase2IntegrityAlgorithms = tunnelOption
                    .getPhase2IntegrityAlgorithms();
            jsonWriter.name("Phase2IntegrityAlgorithms");
            jsonWriter.beginArray();
            for (Phase2IntegrityAlgorithmsListValue phase2IntegrityAlgorithmsItem : phase2IntegrityAlgorithms) {
                if (phase2IntegrityAlgorithmsItem != null) {
                    Phase2IntegrityAlgorithmsListValueJsonMarshaller.getInstance().marshall(
                            phase2IntegrityAlgorithmsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (tunnelOption.getPhase1DHGroupNumbers() != null) {
            java.util.List<Phase1DHGroupNumbersListValue> phase1DHGroupNumbers = tunnelOption
                    .getPhase1DHGroupNumbers();
            jsonWriter.name("Phase1DHGroupNumbers");
            jsonWriter.beginArray();
            for (Phase1DHGroupNumbersListValue phase1DHGroupNumbersItem : phase1DHGroupNumbers) {
                if (phase1DHGroupNumbersItem != null) {
                    Phase1DHGroupNumbersListValueJsonMarshaller.getInstance().marshall(
                            phase1DHGroupNumbersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (tunnelOption.getPhase2DHGroupNumbers() != null) {
            java.util.List<Phase2DHGroupNumbersListValue> phase2DHGroupNumbers = tunnelOption
                    .getPhase2DHGroupNumbers();
            jsonWriter.name("Phase2DHGroupNumbers");
            jsonWriter.beginArray();
            for (Phase2DHGroupNumbersListValue phase2DHGroupNumbersItem : phase2DHGroupNumbers) {
                if (phase2DHGroupNumbersItem != null) {
                    Phase2DHGroupNumbersListValueJsonMarshaller.getInstance().marshall(
                            phase2DHGroupNumbersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (tunnelOption.getIkeVersions() != null) {
            java.util.List<IKEVersionsListValue> ikeVersions = tunnelOption.getIkeVersions();
            jsonWriter.name("IkeVersions");
            jsonWriter.beginArray();
            for (IKEVersionsListValue ikeVersionsItem : ikeVersions) {
                if (ikeVersionsItem != null) {
                    IKEVersionsListValueJsonMarshaller.getInstance().marshall(ikeVersionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TunnelOptionJsonMarshaller instance;

    public static TunnelOptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TunnelOptionJsonMarshaller();
        return instance;
    }
}
