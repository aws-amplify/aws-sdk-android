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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DescribeUsageLimitsRequest
 */
public class DescribeUsageLimitsRequestMarshaller implements
        Marshaller<Request<DescribeUsageLimitsRequest>, DescribeUsageLimitsRequest> {

    public Request<DescribeUsageLimitsRequest> marshall(
            DescribeUsageLimitsRequest describeUsageLimitsRequest) {
        if (describeUsageLimitsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeUsageLimitsRequest)");
        }

        Request<DescribeUsageLimitsRequest> request = new DefaultRequest<DescribeUsageLimitsRequest>(
                describeUsageLimitsRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeUsageLimits");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (describeUsageLimitsRequest.getUsageLimitId() != null) {
            prefix = "UsageLimitId";
            String usageLimitId = describeUsageLimitsRequest.getUsageLimitId();
            request.addParameter(prefix, StringUtils.fromString(usageLimitId));
        }
        if (describeUsageLimitsRequest.getClusterIdentifier() != null) {
            prefix = "ClusterIdentifier";
            String clusterIdentifier = describeUsageLimitsRequest.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (describeUsageLimitsRequest.getFeatureType() != null) {
            prefix = "FeatureType";
            String featureType = describeUsageLimitsRequest.getFeatureType();
            request.addParameter(prefix, StringUtils.fromString(featureType));
        }
        if (describeUsageLimitsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeUsageLimitsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeUsageLimitsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeUsageLimitsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (describeUsageLimitsRequest.getTagKeys() != null) {
            prefix = "TagKeys";
            java.util.List<String> tagKeys = describeUsageLimitsRequest.getTagKeys();
            int tagKeysIndex = 1;
            String tagKeysPrefix = prefix;
            for (String tagKeysItem : tagKeys) {
                prefix = tagKeysPrefix + "." + tagKeysIndex;
                if (tagKeysItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(tagKeysItem));
                }
                tagKeysIndex++;
            }
            prefix = tagKeysPrefix;
        }
        if (describeUsageLimitsRequest.getTagValues() != null) {
            prefix = "TagValues";
            java.util.List<String> tagValues = describeUsageLimitsRequest.getTagValues();
            int tagValuesIndex = 1;
            String tagValuesPrefix = prefix;
            for (String tagValuesItem : tagValues) {
                prefix = tagValuesPrefix + "." + tagValuesIndex;
                if (tagValuesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(tagValuesItem));
                }
                tagValuesIndex++;
            }
            prefix = tagValuesPrefix;
        }

        return request;
    }
}
