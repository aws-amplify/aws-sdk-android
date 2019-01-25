/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DescribeLifecycleHooksRequest
 */
public class DescribeLifecycleHooksRequestMarshaller implements
        Marshaller<Request<DescribeLifecycleHooksRequest>, DescribeLifecycleHooksRequest> {

    public Request<DescribeLifecycleHooksRequest> marshall(
            DescribeLifecycleHooksRequest describeLifecycleHooksRequest) {
        if (describeLifecycleHooksRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeLifecycleHooksRequest)");
        }

        Request<DescribeLifecycleHooksRequest> request = new DefaultRequest<DescribeLifecycleHooksRequest>(
                describeLifecycleHooksRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DescribeLifecycleHooks");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (describeLifecycleHooksRequest.getAutoScalingGroupName() != null) {
            prefix = "AutoScalingGroupName";
            String autoScalingGroupName = describeLifecycleHooksRequest.getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (describeLifecycleHooksRequest.getLifecycleHookNames() != null) {
            prefix = "LifecycleHookNames";
            java.util.List<String> lifecycleHookNames = describeLifecycleHooksRequest
                    .getLifecycleHookNames();
            int lifecycleHookNamesIndex = 1;
            String lifecycleHookNamesPrefix = prefix;
            for (String lifecycleHookNamesItem : lifecycleHookNames) {
                prefix = lifecycleHookNamesPrefix + ".member." + lifecycleHookNamesIndex;
                if (lifecycleHookNamesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(lifecycleHookNamesItem));
                }
                lifecycleHookNamesIndex++;
            }
            prefix = lifecycleHookNamesPrefix;
        }

        return request;
    }
}
