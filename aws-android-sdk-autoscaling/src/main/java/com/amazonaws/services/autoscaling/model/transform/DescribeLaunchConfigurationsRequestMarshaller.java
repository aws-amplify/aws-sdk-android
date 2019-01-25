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
 * StAX request marshaller for DescribeLaunchConfigurationsRequest
 */
public class DescribeLaunchConfigurationsRequestMarshaller
        implements
        Marshaller<Request<DescribeLaunchConfigurationsRequest>, DescribeLaunchConfigurationsRequest> {

    public Request<DescribeLaunchConfigurationsRequest> marshall(
            DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest) {
        if (describeLaunchConfigurationsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeLaunchConfigurationsRequest)");
        }

        Request<DescribeLaunchConfigurationsRequest> request = new DefaultRequest<DescribeLaunchConfigurationsRequest>(
                describeLaunchConfigurationsRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DescribeLaunchConfigurations");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (describeLaunchConfigurationsRequest.getLaunchConfigurationNames() != null) {
            prefix = "LaunchConfigurationNames";
            java.util.List<String> launchConfigurationNames = describeLaunchConfigurationsRequest
                    .getLaunchConfigurationNames();
            int launchConfigurationNamesIndex = 1;
            String launchConfigurationNamesPrefix = prefix;
            for (String launchConfigurationNamesItem : launchConfigurationNames) {
                prefix = launchConfigurationNamesPrefix + ".member."
                        + launchConfigurationNamesIndex;
                if (launchConfigurationNamesItem != null) {
                    request.addParameter(prefix,
                            StringUtils.fromString(launchConfigurationNamesItem));
                }
                launchConfigurationNamesIndex++;
            }
            prefix = launchConfigurationNamesPrefix;
        }
        if (describeLaunchConfigurationsRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = describeLaunchConfigurationsRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }
        if (describeLaunchConfigurationsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeLaunchConfigurationsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }

        return request;
    }
}
