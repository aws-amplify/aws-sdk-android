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
 * JSON marshaller for POJO NetworkAclEntry
 */
class NetworkAclEntryJsonMarshaller {

    public void marshall(NetworkAclEntry networkAclEntry, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (networkAclEntry.getCidrBlock() != null) {
            String cidrBlock = networkAclEntry.getCidrBlock();
            jsonWriter.name("CidrBlock");
            jsonWriter.value(cidrBlock);
        }
        if (networkAclEntry.getEgress() != null) {
            Boolean egress = networkAclEntry.getEgress();
            jsonWriter.name("Egress");
            jsonWriter.value(egress);
        }
        if (networkAclEntry.getIcmpTypeCode() != null) {
            IcmpTypeCode icmpTypeCode = networkAclEntry.getIcmpTypeCode();
            jsonWriter.name("IcmpTypeCode");
            IcmpTypeCodeJsonMarshaller.getInstance().marshall(icmpTypeCode, jsonWriter);
        }
        if (networkAclEntry.getIpv6CidrBlock() != null) {
            String ipv6CidrBlock = networkAclEntry.getIpv6CidrBlock();
            jsonWriter.name("Ipv6CidrBlock");
            jsonWriter.value(ipv6CidrBlock);
        }
        if (networkAclEntry.getPortRange() != null) {
            PortRange portRange = networkAclEntry.getPortRange();
            jsonWriter.name("PortRange");
            PortRangeJsonMarshaller.getInstance().marshall(portRange, jsonWriter);
        }
        if (networkAclEntry.getProtocol() != null) {
            String protocol = networkAclEntry.getProtocol();
            jsonWriter.name("Protocol");
            jsonWriter.value(protocol);
        }
        if (networkAclEntry.getRuleAction() != null) {
            String ruleAction = networkAclEntry.getRuleAction();
            jsonWriter.name("RuleAction");
            jsonWriter.value(ruleAction);
        }
        if (networkAclEntry.getRuleNumber() != null) {
            Integer ruleNumber = networkAclEntry.getRuleNumber();
            jsonWriter.name("RuleNumber");
            jsonWriter.value(ruleNumber);
        }
        jsonWriter.endObject();
    }

    private static NetworkAclEntryJsonMarshaller instance;

    public static NetworkAclEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NetworkAclEntryJsonMarshaller();
        return instance;
    }
}
