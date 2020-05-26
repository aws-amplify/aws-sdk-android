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
 * JSON marshaller for POJO StaleIpPermission
 */
class StaleIpPermissionJsonMarshaller {

    public void marshall(StaleIpPermission staleIpPermission, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (staleIpPermission.getFromPort() != null) {
            Integer fromPort = staleIpPermission.getFromPort();
            jsonWriter.name("FromPort");
            jsonWriter.value(fromPort);
        }
        if (staleIpPermission.getIpProtocol() != null) {
            String ipProtocol = staleIpPermission.getIpProtocol();
            jsonWriter.name("IpProtocol");
            jsonWriter.value(ipProtocol);
        }
        if (staleIpPermission.getIpRanges() != null) {
            java.util.List<String> ipRanges = staleIpPermission.getIpRanges();
            jsonWriter.name("IpRanges");
            jsonWriter.beginArray();
            for (String ipRangesItem : ipRanges) {
                if (ipRangesItem != null) {
                    jsonWriter.value(ipRangesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (staleIpPermission.getPrefixListIds() != null) {
            java.util.List<String> prefixListIds = staleIpPermission.getPrefixListIds();
            jsonWriter.name("PrefixListIds");
            jsonWriter.beginArray();
            for (String prefixListIdsItem : prefixListIds) {
                if (prefixListIdsItem != null) {
                    jsonWriter.value(prefixListIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (staleIpPermission.getToPort() != null) {
            Integer toPort = staleIpPermission.getToPort();
            jsonWriter.name("ToPort");
            jsonWriter.value(toPort);
        }
        if (staleIpPermission.getUserIdGroupPairs() != null) {
            java.util.List<UserIdGroupPair> userIdGroupPairs = staleIpPermission
                    .getUserIdGroupPairs();
            jsonWriter.name("UserIdGroupPairs");
            jsonWriter.beginArray();
            for (UserIdGroupPair userIdGroupPairsItem : userIdGroupPairs) {
                if (userIdGroupPairsItem != null) {
                    UserIdGroupPairJsonMarshaller.getInstance().marshall(userIdGroupPairsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static StaleIpPermissionJsonMarshaller instance;

    public static StaleIpPermissionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StaleIpPermissionJsonMarshaller();
        return instance;
    }
}
