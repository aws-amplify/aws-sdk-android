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
 * StAX request marshaller for DescribeCacheParametersRequest
 */
public class DescribeCacheParametersRequestMarshaller implements
        Marshaller<Request<DescribeCacheParametersRequest>, DescribeCacheParametersRequest> {

    public Request<DescribeCacheParametersRequest> marshall(
            DescribeCacheParametersRequest describeCacheParametersRequest) {
        if (describeCacheParametersRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeCacheParametersRequest)");
        }

        Request<DescribeCacheParametersRequest> request = new DefaultRequest<DescribeCacheParametersRequest>(
                describeCacheParametersRequest, "AmazonElastiCache");
        request.addParameter("Action", "DescribeCacheParameters");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (describeCacheParametersRequest.getCacheParameterGroupName() != null) {
            prefix = "CacheParameterGroupName";
            String cacheParameterGroupName = describeCacheParametersRequest
                    .getCacheParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(cacheParameterGroupName));
        }
        if (describeCacheParametersRequest.getSource() != null) {
            prefix = "Source";
            String source = describeCacheParametersRequest.getSource();
            request.addParameter(prefix, StringUtils.fromString(source));
        }
        if (describeCacheParametersRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeCacheParametersRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeCacheParametersRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeCacheParametersRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}
