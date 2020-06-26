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

package com.amazonaws.services.cloudformation.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for SignalResourceRequest
 */
public class SignalResourceRequestMarshaller implements
        Marshaller<Request<SignalResourceRequest>, SignalResourceRequest> {

    public Request<SignalResourceRequest> marshall(SignalResourceRequest signalResourceRequest) {
        if (signalResourceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SignalResourceRequest)");
        }

        Request<SignalResourceRequest> request = new DefaultRequest<SignalResourceRequest>(
                signalResourceRequest, "AWSCloudFormation");
        request.addParameter("Action", "SignalResource");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (signalResourceRequest.getStackName() != null) {
            prefix = "StackName";
            String stackName = signalResourceRequest.getStackName();
            request.addParameter(prefix, StringUtils.fromString(stackName));
        }
        if (signalResourceRequest.getLogicalResourceId() != null) {
            prefix = "LogicalResourceId";
            String logicalResourceId = signalResourceRequest.getLogicalResourceId();
            request.addParameter(prefix, StringUtils.fromString(logicalResourceId));
        }
        if (signalResourceRequest.getUniqueId() != null) {
            prefix = "UniqueId";
            String uniqueId = signalResourceRequest.getUniqueId();
            request.addParameter(prefix, StringUtils.fromString(uniqueId));
        }
        if (signalResourceRequest.getStatus() != null) {
            prefix = "Status";
            String status = signalResourceRequest.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }

        return request;
    }
}
