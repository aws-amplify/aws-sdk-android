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
 * StAX request marshaller for TerminateEnvironmentRequest
 */
public class TerminateEnvironmentRequestMarshaller implements
        Marshaller<Request<TerminateEnvironmentRequest>, TerminateEnvironmentRequest> {

    public Request<TerminateEnvironmentRequest> marshall(
            TerminateEnvironmentRequest terminateEnvironmentRequest) {
        if (terminateEnvironmentRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(TerminateEnvironmentRequest)");
        }

        Request<TerminateEnvironmentRequest> request = new DefaultRequest<TerminateEnvironmentRequest>(
                terminateEnvironmentRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "TerminateEnvironment");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (terminateEnvironmentRequest.getEnvironmentId() != null) {
            prefix = "EnvironmentId";
            String environmentId = terminateEnvironmentRequest.getEnvironmentId();
            request.addParameter(prefix, StringUtils.fromString(environmentId));
        }
        if (terminateEnvironmentRequest.getEnvironmentName() != null) {
            prefix = "EnvironmentName";
            String environmentName = terminateEnvironmentRequest.getEnvironmentName();
            request.addParameter(prefix, StringUtils.fromString(environmentName));
        }
        if (terminateEnvironmentRequest.getTerminateResources() != null) {
            prefix = "TerminateResources";
            Boolean terminateResources = terminateEnvironmentRequest.getTerminateResources();
            request.addParameter(prefix, StringUtils.fromBoolean(terminateResources));
        }
        if (terminateEnvironmentRequest.getForceTerminate() != null) {
            prefix = "ForceTerminate";
            Boolean forceTerminate = terminateEnvironmentRequest.getForceTerminate();
            request.addParameter(prefix, StringUtils.fromBoolean(forceTerminate));
        }

        return request;
    }
}
