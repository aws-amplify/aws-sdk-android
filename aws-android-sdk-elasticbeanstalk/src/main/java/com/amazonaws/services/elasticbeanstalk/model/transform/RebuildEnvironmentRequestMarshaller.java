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
 * StAX request marshaller for RebuildEnvironmentRequest
 */
public class RebuildEnvironmentRequestMarshaller implements
        Marshaller<Request<RebuildEnvironmentRequest>, RebuildEnvironmentRequest> {

    public Request<RebuildEnvironmentRequest> marshall(
            RebuildEnvironmentRequest rebuildEnvironmentRequest) {
        if (rebuildEnvironmentRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RebuildEnvironmentRequest)");
        }

        Request<RebuildEnvironmentRequest> request = new DefaultRequest<RebuildEnvironmentRequest>(
                rebuildEnvironmentRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "RebuildEnvironment");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (rebuildEnvironmentRequest.getEnvironmentId() != null) {
            prefix = "EnvironmentId";
            String environmentId = rebuildEnvironmentRequest.getEnvironmentId();
            request.addParameter(prefix, StringUtils.fromString(environmentId));
        }
        if (rebuildEnvironmentRequest.getEnvironmentName() != null) {
            prefix = "EnvironmentName";
            String environmentName = rebuildEnvironmentRequest.getEnvironmentName();
            request.addParameter(prefix, StringUtils.fromString(environmentName));
        }

        return request;
    }
}
