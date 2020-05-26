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
 * StAX request marshaller for DescribeEngineDefaultParametersRequest
 */
public class DescribeEngineDefaultParametersRequestMarshaller
        implements
        Marshaller<Request<DescribeEngineDefaultParametersRequest>, DescribeEngineDefaultParametersRequest> {

    public Request<DescribeEngineDefaultParametersRequest> marshall(
            DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest) {
        if (describeEngineDefaultParametersRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeEngineDefaultParametersRequest)");
        }

        Request<DescribeEngineDefaultParametersRequest> request = new DefaultRequest<DescribeEngineDefaultParametersRequest>(
                describeEngineDefaultParametersRequest, "AmazonElastiCache");
        request.addParameter("Action", "DescribeEngineDefaultParameters");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (describeEngineDefaultParametersRequest.getCacheParameterGroupFamily() != null) {
            prefix = "CacheParameterGroupFamily";
            String cacheParameterGroupFamily = describeEngineDefaultParametersRequest
                    .getCacheParameterGroupFamily();
            request.addParameter(prefix, StringUtils.fromString(cacheParameterGroupFamily));
        }
        if (describeEngineDefaultParametersRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeEngineDefaultParametersRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeEngineDefaultParametersRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeEngineDefaultParametersRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}
