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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DescribeConfigurationOptionsRequest
 */
public class DescribeConfigurationOptionsRequestMarshaller
        implements
        Marshaller<Request<DescribeConfigurationOptionsRequest>, DescribeConfigurationOptionsRequest> {

    public Request<DescribeConfigurationOptionsRequest> marshall(
            DescribeConfigurationOptionsRequest describeConfigurationOptionsRequest) {
        if (describeConfigurationOptionsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeConfigurationOptionsRequest)");
        }

        Request<DescribeConfigurationOptionsRequest> request = new DefaultRequest<DescribeConfigurationOptionsRequest>(
                describeConfigurationOptionsRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "DescribeConfigurationOptions");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (describeConfigurationOptionsRequest.getApplicationName() != null) {
            prefix = "ApplicationName";
            String applicationName = describeConfigurationOptionsRequest.getApplicationName();
            request.addParameter(prefix, StringUtils.fromString(applicationName));
        }
        if (describeConfigurationOptionsRequest.getTemplateName() != null) {
            prefix = "TemplateName";
            String templateName = describeConfigurationOptionsRequest.getTemplateName();
            request.addParameter(prefix, StringUtils.fromString(templateName));
        }
        if (describeConfigurationOptionsRequest.getEnvironmentName() != null) {
            prefix = "EnvironmentName";
            String environmentName = describeConfigurationOptionsRequest.getEnvironmentName();
            request.addParameter(prefix, StringUtils.fromString(environmentName));
        }
        if (describeConfigurationOptionsRequest.getSolutionStackName() != null) {
            prefix = "SolutionStackName";
            String solutionStackName = describeConfigurationOptionsRequest.getSolutionStackName();
            request.addParameter(prefix, StringUtils.fromString(solutionStackName));
        }
        if (describeConfigurationOptionsRequest.getPlatformArn() != null) {
            prefix = "PlatformArn";
            String platformArn = describeConfigurationOptionsRequest.getPlatformArn();
            request.addParameter(prefix, StringUtils.fromString(platformArn));
        }
        if (describeConfigurationOptionsRequest.getOptions() != null) {
            prefix = "Options";
            java.util.List<OptionSpecification> options = describeConfigurationOptionsRequest
                    .getOptions();
            int optionsIndex = 1;
            String optionsPrefix = prefix;
            for (OptionSpecification optionsItem : options) {
                prefix = optionsPrefix + ".member." + optionsIndex;
                if (optionsItem != null) {
                    OptionSpecificationStaxMarshaller.getInstance().marshall(optionsItem, request,
                            prefix + ".");
                }
                optionsIndex++;
            }
            prefix = optionsPrefix;
        }

        return request;
    }
}
