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
 * StAX request marshaller for DescribePlatformVersionRequest
 */
public class DescribePlatformVersionRequestMarshaller implements
        Marshaller<Request<DescribePlatformVersionRequest>, DescribePlatformVersionRequest> {

    public Request<DescribePlatformVersionRequest> marshall(
            DescribePlatformVersionRequest describePlatformVersionRequest) {
        if (describePlatformVersionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribePlatformVersionRequest)");
        }

        Request<DescribePlatformVersionRequest> request = new DefaultRequest<DescribePlatformVersionRequest>(
                describePlatformVersionRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "DescribePlatformVersion");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (describePlatformVersionRequest.getPlatformArn() != null) {
            prefix = "PlatformArn";
            String platformArn = describePlatformVersionRequest.getPlatformArn();
            request.addParameter(prefix, StringUtils.fromString(platformArn));
        }

        return request;
    }
}
