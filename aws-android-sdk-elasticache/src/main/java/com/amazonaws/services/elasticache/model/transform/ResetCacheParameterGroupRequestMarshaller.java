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
 * StAX request marshaller for ResetCacheParameterGroupRequest
 */
public class ResetCacheParameterGroupRequestMarshaller implements
        Marshaller<Request<ResetCacheParameterGroupRequest>, ResetCacheParameterGroupRequest> {

    public Request<ResetCacheParameterGroupRequest> marshall(
            ResetCacheParameterGroupRequest resetCacheParameterGroupRequest) {
        if (resetCacheParameterGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ResetCacheParameterGroupRequest)");
        }

        Request<ResetCacheParameterGroupRequest> request = new DefaultRequest<ResetCacheParameterGroupRequest>(
                resetCacheParameterGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "ResetCacheParameterGroup");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (resetCacheParameterGroupRequest.getCacheParameterGroupName() != null) {
            prefix = "CacheParameterGroupName";
            String cacheParameterGroupName = resetCacheParameterGroupRequest
                    .getCacheParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(cacheParameterGroupName));
        }
        if (resetCacheParameterGroupRequest.getResetAllParameters() != null) {
            prefix = "ResetAllParameters";
            Boolean resetAllParameters = resetCacheParameterGroupRequest.getResetAllParameters();
            request.addParameter(prefix, StringUtils.fromBoolean(resetAllParameters));
        }
        if (resetCacheParameterGroupRequest.getParameterNameValues() != null) {
            prefix = "ParameterNameValues";
            java.util.List<ParameterNameValue> parameterNameValues = resetCacheParameterGroupRequest
                    .getParameterNameValues();
            int parameterNameValuesIndex = 1;
            String parameterNameValuesPrefix = prefix;
            for (ParameterNameValue parameterNameValuesItem : parameterNameValues) {
                prefix = parameterNameValuesPrefix + "." + parameterNameValuesIndex;
                if (parameterNameValuesItem != null) {
                    ParameterNameValueStaxMarshaller.getInstance().marshall(
                            parameterNameValuesItem, request, prefix + ".");
                }
                parameterNameValuesIndex++;
            }
            prefix = parameterNameValuesPrefix;
        }

        return request;
    }
}
