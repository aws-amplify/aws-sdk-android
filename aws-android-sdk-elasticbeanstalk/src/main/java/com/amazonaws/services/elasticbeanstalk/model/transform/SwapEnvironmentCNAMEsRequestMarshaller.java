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
 * StAX request marshaller for SwapEnvironmentCNAMEsRequest
 */
public class SwapEnvironmentCNAMEsRequestMarshaller implements
        Marshaller<Request<SwapEnvironmentCNAMEsRequest>, SwapEnvironmentCNAMEsRequest> {

    public Request<SwapEnvironmentCNAMEsRequest> marshall(
            SwapEnvironmentCNAMEsRequest swapEnvironmentCNAMEsRequest) {
        if (swapEnvironmentCNAMEsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SwapEnvironmentCNAMEsRequest)");
        }

        Request<SwapEnvironmentCNAMEsRequest> request = new DefaultRequest<SwapEnvironmentCNAMEsRequest>(
                swapEnvironmentCNAMEsRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "SwapEnvironmentCNAMEs");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (swapEnvironmentCNAMEsRequest.getSourceEnvironmentId() != null) {
            prefix = "SourceEnvironmentId";
            String sourceEnvironmentId = swapEnvironmentCNAMEsRequest.getSourceEnvironmentId();
            request.addParameter(prefix, StringUtils.fromString(sourceEnvironmentId));
        }
        if (swapEnvironmentCNAMEsRequest.getSourceEnvironmentName() != null) {
            prefix = "SourceEnvironmentName";
            String sourceEnvironmentName = swapEnvironmentCNAMEsRequest.getSourceEnvironmentName();
            request.addParameter(prefix, StringUtils.fromString(sourceEnvironmentName));
        }
        if (swapEnvironmentCNAMEsRequest.getDestinationEnvironmentId() != null) {
            prefix = "DestinationEnvironmentId";
            String destinationEnvironmentId = swapEnvironmentCNAMEsRequest
                    .getDestinationEnvironmentId();
            request.addParameter(prefix, StringUtils.fromString(destinationEnvironmentId));
        }
        if (swapEnvironmentCNAMEsRequest.getDestinationEnvironmentName() != null) {
            prefix = "DestinationEnvironmentName";
            String destinationEnvironmentName = swapEnvironmentCNAMEsRequest
                    .getDestinationEnvironmentName();
            request.addParameter(prefix, StringUtils.fromString(destinationEnvironmentName));
        }

        return request;
    }
}
