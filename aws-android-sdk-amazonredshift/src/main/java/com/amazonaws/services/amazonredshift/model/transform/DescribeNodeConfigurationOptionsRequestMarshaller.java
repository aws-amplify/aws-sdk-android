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
 * StAX request marshaller for DescribeNodeConfigurationOptionsRequest
 */
public class DescribeNodeConfigurationOptionsRequestMarshaller
        implements
        Marshaller<Request<DescribeNodeConfigurationOptionsRequest>, DescribeNodeConfigurationOptionsRequest> {

    public Request<DescribeNodeConfigurationOptionsRequest> marshall(
            DescribeNodeConfigurationOptionsRequest describeNodeConfigurationOptionsRequest) {
        if (describeNodeConfigurationOptionsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeNodeConfigurationOptionsRequest)");
        }

        Request<DescribeNodeConfigurationOptionsRequest> request = new DefaultRequest<DescribeNodeConfigurationOptionsRequest>(
                describeNodeConfigurationOptionsRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeNodeConfigurationOptions");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (describeNodeConfigurationOptionsRequest.getActionType() != null) {
            prefix = "ActionType";
            String actionType = describeNodeConfigurationOptionsRequest.getActionType();
            request.addParameter(prefix, StringUtils.fromString(actionType));
        }
        if (describeNodeConfigurationOptionsRequest.getClusterIdentifier() != null) {
            prefix = "ClusterIdentifier";
            String clusterIdentifier = describeNodeConfigurationOptionsRequest
                    .getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (describeNodeConfigurationOptionsRequest.getSnapshotIdentifier() != null) {
            prefix = "SnapshotIdentifier";
            String snapshotIdentifier = describeNodeConfigurationOptionsRequest
                    .getSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(snapshotIdentifier));
        }
        if (describeNodeConfigurationOptionsRequest.getOwnerAccount() != null) {
            prefix = "OwnerAccount";
            String ownerAccount = describeNodeConfigurationOptionsRequest.getOwnerAccount();
            request.addParameter(prefix, StringUtils.fromString(ownerAccount));
        }
        if (describeNodeConfigurationOptionsRequest.getFilters() != null) {
            prefix = "Filter";
            java.util.List<NodeConfigurationOptionsFilter> filters = describeNodeConfigurationOptionsRequest
                    .getFilters();
            int filtersIndex = 1;
            String filtersPrefix = prefix;
            for (NodeConfigurationOptionsFilter filtersItem : filters) {
                prefix = filtersPrefix + "." + filtersIndex;
                if (filtersItem != null) {
                    NodeConfigurationOptionsFilterStaxMarshaller.getInstance().marshall(
                            filtersItem, request, prefix + ".");
                }
                filtersIndex++;
            }
            prefix = filtersPrefix;
        }
        if (describeNodeConfigurationOptionsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeNodeConfigurationOptionsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (describeNodeConfigurationOptionsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeNodeConfigurationOptionsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }

        return request;
    }
}
