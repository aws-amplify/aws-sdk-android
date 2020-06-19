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
 * StAX request marshaller for DescribeCacheEngineVersionsRequest
 */
public class DescribeCacheEngineVersionsRequestMarshaller implements
        Marshaller<Request<DescribeCacheEngineVersionsRequest>, DescribeCacheEngineVersionsRequest> {

    public Request<DescribeCacheEngineVersionsRequest> marshall(
            DescribeCacheEngineVersionsRequest describeCacheEngineVersionsRequest) {
        if (describeCacheEngineVersionsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeCacheEngineVersionsRequest)");
        }

        Request<DescribeCacheEngineVersionsRequest> request = new DefaultRequest<DescribeCacheEngineVersionsRequest>(
                describeCacheEngineVersionsRequest, "AmazonElastiCache");
        request.addParameter("Action", "DescribeCacheEngineVersions");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (describeCacheEngineVersionsRequest.getEngine() != null) {
            prefix = "Engine";
            String engine = describeCacheEngineVersionsRequest.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (describeCacheEngineVersionsRequest.getEngineVersion() != null) {
            prefix = "EngineVersion";
            String engineVersion = describeCacheEngineVersionsRequest.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (describeCacheEngineVersionsRequest.getCacheParameterGroupFamily() != null) {
            prefix = "CacheParameterGroupFamily";
            String cacheParameterGroupFamily = describeCacheEngineVersionsRequest
                    .getCacheParameterGroupFamily();
            request.addParameter(prefix, StringUtils.fromString(cacheParameterGroupFamily));
        }
        if (describeCacheEngineVersionsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeCacheEngineVersionsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeCacheEngineVersionsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeCacheEngineVersionsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (describeCacheEngineVersionsRequest.getDefaultOnly() != null) {
            prefix = "DefaultOnly";
            Boolean defaultOnly = describeCacheEngineVersionsRequest.getDefaultOnly();
            request.addParameter(prefix, StringUtils.fromBoolean(defaultOnly));
        }

        return request;
    }
}
