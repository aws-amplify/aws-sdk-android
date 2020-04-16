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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsEc2SecurityGroupIpPermission
 */
class AwsEc2SecurityGroupIpPermissionJsonMarshaller {

    public void marshall(AwsEc2SecurityGroupIpPermission awsEc2SecurityGroupIpPermission,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsEc2SecurityGroupIpPermission.getIpProtocol() != null) {
            String ipProtocol = awsEc2SecurityGroupIpPermission.getIpProtocol();
            jsonWriter.name("IpProtocol");
            jsonWriter.value(ipProtocol);
        }
        if (awsEc2SecurityGroupIpPermission.getFromPort() != null) {
            Integer fromPort = awsEc2SecurityGroupIpPermission.getFromPort();
            jsonWriter.name("FromPort");
            jsonWriter.value(fromPort);
        }
        if (awsEc2SecurityGroupIpPermission.getToPort() != null) {
            Integer toPort = awsEc2SecurityGroupIpPermission.getToPort();
            jsonWriter.name("ToPort");
            jsonWriter.value(toPort);
        }
        if (awsEc2SecurityGroupIpPermission.getUserIdGroupPairs() != null) {
            java.util.List<AwsEc2SecurityGroupUserIdGroupPair> userIdGroupPairs = awsEc2SecurityGroupIpPermission
                    .getUserIdGroupPairs();
            jsonWriter.name("UserIdGroupPairs");
            jsonWriter.beginArray();
            for (AwsEc2SecurityGroupUserIdGroupPair userIdGroupPairsItem : userIdGroupPairs) {
                if (userIdGroupPairsItem != null) {
                    AwsEc2SecurityGroupUserIdGroupPairJsonMarshaller.getInstance().marshall(
                            userIdGroupPairsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsEc2SecurityGroupIpPermission.getIpRanges() != null) {
            java.util.List<AwsEc2SecurityGroupIpRange> ipRanges = awsEc2SecurityGroupIpPermission
                    .getIpRanges();
            jsonWriter.name("IpRanges");
            jsonWriter.beginArray();
            for (AwsEc2SecurityGroupIpRange ipRangesItem : ipRanges) {
                if (ipRangesItem != null) {
                    AwsEc2SecurityGroupIpRangeJsonMarshaller.getInstance().marshall(ipRangesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsEc2SecurityGroupIpPermission.getIpv6Ranges() != null) {
            java.util.List<AwsEc2SecurityGroupIpv6Range> ipv6Ranges = awsEc2SecurityGroupIpPermission
                    .getIpv6Ranges();
            jsonWriter.name("Ipv6Ranges");
            jsonWriter.beginArray();
            for (AwsEc2SecurityGroupIpv6Range ipv6RangesItem : ipv6Ranges) {
                if (ipv6RangesItem != null) {
                    AwsEc2SecurityGroupIpv6RangeJsonMarshaller.getInstance().marshall(
                            ipv6RangesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsEc2SecurityGroupIpPermission.getPrefixListIds() != null) {
            java.util.List<AwsEc2SecurityGroupPrefixListId> prefixListIds = awsEc2SecurityGroupIpPermission
                    .getPrefixListIds();
            jsonWriter.name("PrefixListIds");
            jsonWriter.beginArray();
            for (AwsEc2SecurityGroupPrefixListId prefixListIdsItem : prefixListIds) {
                if (prefixListIdsItem != null) {
                    AwsEc2SecurityGroupPrefixListIdJsonMarshaller.getInstance().marshall(
                            prefixListIdsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AwsEc2SecurityGroupIpPermissionJsonMarshaller instance;

    public static AwsEc2SecurityGroupIpPermissionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2SecurityGroupIpPermissionJsonMarshaller();
        return instance;
    }
}
