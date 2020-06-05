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
 * StAX request marshaller for DescribeConfigurationSettingsRequest
 */
public class DescribeConfigurationSettingsRequestMarshaller
        implements
        Marshaller<Request<DescribeConfigurationSettingsRequest>, DescribeConfigurationSettingsRequest> {

    public Request<DescribeConfigurationSettingsRequest> marshall(
            DescribeConfigurationSettingsRequest describeConfigurationSettingsRequest) {
        if (describeConfigurationSettingsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeConfigurationSettingsRequest)");
        }

        Request<DescribeConfigurationSettingsRequest> request = new DefaultRequest<DescribeConfigurationSettingsRequest>(
                describeConfigurationSettingsRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "DescribeConfigurationSettings");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (describeConfigurationSettingsRequest.getApplicationName() != null) {
            prefix = "ApplicationName";
            String applicationName = describeConfigurationSettingsRequest.getApplicationName();
            request.addParameter(prefix, StringUtils.fromString(applicationName));
        }
        if (describeConfigurationSettingsRequest.getTemplateName() != null) {
            prefix = "TemplateName";
            String templateName = describeConfigurationSettingsRequest.getTemplateName();
            request.addParameter(prefix, StringUtils.fromString(templateName));
        }
        if (describeConfigurationSettingsRequest.getEnvironmentName() != null) {
            prefix = "EnvironmentName";
            String environmentName = describeConfigurationSettingsRequest.getEnvironmentName();
            request.addParameter(prefix, StringUtils.fromString(environmentName));
        }

        return request;
    }
}
