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
 * JSON marshaller for POJO IpPermission
 */
class IpPermissionJsonMarshaller {

    public void marshall(IpPermission ipPermission, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (ipPermission.getFromPort() != null) {
            Integer fromPort = ipPermission.getFromPort();
            jsonWriter.name("FromPort");
            jsonWriter.value(fromPort);
        }
        if (ipPermission.getIpProtocol() != null) {
            String ipProtocol = ipPermission.getIpProtocol();
            jsonWriter.name("IpProtocol");
            jsonWriter.value(ipProtocol);
        }
        if (ipPermission.getIpRanges() != null) {
            java.util.List<IpRange> ipRanges = ipPermission.getIpRanges();
            jsonWriter.name("IpRanges");
            jsonWriter.beginArray();
            for (IpRange ipRangesItem : ipRanges) {
                if (ipRangesItem != null) {
                    IpRangeJsonMarshaller.getInstance().marshall(ipRangesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (ipPermission.getIpv6Ranges() != null) {
            java.util.List<Ipv6Range> ipv6Ranges = ipPermission.getIpv6Ranges();
            jsonWriter.name("Ipv6Ranges");
            jsonWriter.beginArray();
            for (Ipv6Range ipv6RangesItem : ipv6Ranges) {
                if (ipv6RangesItem != null) {
                    Ipv6RangeJsonMarshaller.getInstance().marshall(ipv6RangesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (ipPermission.getPrefixListIds() != null) {
            java.util.List<PrefixListId> prefixListIds = ipPermission.getPrefixListIds();
            jsonWriter.name("PrefixListIds");
            jsonWriter.beginArray();
            for (PrefixListId prefixListIdsItem : prefixListIds) {
                if (prefixListIdsItem != null) {
                    PrefixListIdJsonMarshaller.getInstance()
                            .marshall(prefixListIdsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (ipPermission.getToPort() != null) {
            Integer toPort = ipPermission.getToPort();
            jsonWriter.name("ToPort");
            jsonWriter.value(toPort);
        }
        if (ipPermission.getUserIdGroupPairs() != null) {
            java.util.List<UserIdGroupPair> userIdGroupPairs = ipPermission.getUserIdGroupPairs();
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

    private static IpPermissionJsonMarshaller instance;

    public static IpPermissionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IpPermissionJsonMarshaller();
        return instance;
    }
}
