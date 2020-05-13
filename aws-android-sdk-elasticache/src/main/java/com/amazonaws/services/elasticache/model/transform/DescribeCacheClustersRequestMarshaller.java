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

package com.amazonaws.services.elasticache.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DescribeCacheClustersRequest
 */
public class DescribeCacheClustersRequestMarshaller implements
        Marshaller<Request<DescribeCacheClustersRequest>, DescribeCacheClustersRequest> {

    public Request<DescribeCacheClustersRequest> marshall(
            DescribeCacheClustersRequest describeCacheClustersRequest) {
        if (describeCacheClustersRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeCacheClustersRequest)");
        }

        Request<DescribeCacheClustersRequest> request = new DefaultRequest<DescribeCacheClustersRequest>(
                describeCacheClustersRequest, "AmazonElastiCache");
        request.addParameter("Action", "DescribeCacheClusters");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (describeCacheClustersRequest.getCacheClusterId() != null) {
            prefix = "CacheClusterId";
            String cacheClusterId = describeCacheClustersRequest.getCacheClusterId();
            request.addParameter(prefix, StringUtils.fromString(cacheClusterId));
        }
        if (describeCacheClustersRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeCacheClustersRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeCacheClustersRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeCacheClustersRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (describeCacheClustersRequest.getShowCacheNodeInfo() != null) {
            prefix = "ShowCacheNodeInfo";
            Boolean showCacheNodeInfo = describeCacheClustersRequest.getShowCacheNodeInfo();
            request.addParameter(prefix, StringUtils.fromBoolean(showCacheNodeInfo));
        }
        if (describeCacheClustersRequest.getShowCacheClustersNotInReplicationGroups() != null) {
            prefix = "ShowCacheClustersNotInReplicationGroups";
            Boolean showCacheClustersNotInReplicationGroups = describeCacheClustersRequest
                    .getShowCacheClustersNotInReplicationGroups();
            request.addParameter(prefix,
                    StringUtils.fromBoolean(showCacheClustersNotInReplicationGroups));
        }

        return request;
    }
}
