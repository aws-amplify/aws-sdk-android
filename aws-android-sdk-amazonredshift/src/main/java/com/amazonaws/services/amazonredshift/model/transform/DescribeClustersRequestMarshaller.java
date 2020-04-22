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
 * StAX request marshaller for DescribeClustersRequest
 */
public class DescribeClustersRequestMarshaller implements
        Marshaller<Request<DescribeClustersRequest>, DescribeClustersRequest> {

    public Request<DescribeClustersRequest> marshall(DescribeClustersRequest describeClustersRequest) {
        if (describeClustersRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeClustersRequest)");
        }

        Request<DescribeClustersRequest> request = new DefaultRequest<DescribeClustersRequest>(
                describeClustersRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeClusters");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (describeClustersRequest.getClusterIdentifier() != null) {
            prefix = "ClusterIdentifier";
            String clusterIdentifier = describeClustersRequest.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (describeClustersRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeClustersRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeClustersRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeClustersRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (describeClustersRequest.getTagKeys() != null) {
            prefix = "TagKeys";
            java.util.List<String> tagKeys = describeClustersRequest.getTagKeys();
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
        if (describeClustersRequest.getTagValues() != null) {
            prefix = "TagValues";
            java.util.List<String> tagValues = describeClustersRequest.getTagValues();
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
