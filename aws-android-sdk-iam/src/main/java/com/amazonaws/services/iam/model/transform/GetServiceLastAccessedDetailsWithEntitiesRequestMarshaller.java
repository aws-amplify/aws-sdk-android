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

package com.amazonaws.services.iam.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.iam.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for GetServiceLastAccessedDetailsWithEntitiesRequest
 */
public class GetServiceLastAccessedDetailsWithEntitiesRequestMarshaller
        implements
        Marshaller<Request<GetServiceLastAccessedDetailsWithEntitiesRequest>, GetServiceLastAccessedDetailsWithEntitiesRequest> {

    public Request<GetServiceLastAccessedDetailsWithEntitiesRequest> marshall(
            GetServiceLastAccessedDetailsWithEntitiesRequest getServiceLastAccessedDetailsWithEntitiesRequest) {
        if (getServiceLastAccessedDetailsWithEntitiesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetServiceLastAccessedDetailsWithEntitiesRequest)");
        }

        Request<GetServiceLastAccessedDetailsWithEntitiesRequest> request = new DefaultRequest<GetServiceLastAccessedDetailsWithEntitiesRequest>(
                getServiceLastAccessedDetailsWithEntitiesRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "GetServiceLastAccessedDetailsWithEntities");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (getServiceLastAccessedDetailsWithEntitiesRequest.getJobId() != null) {
            prefix = "JobId";
            String jobId = getServiceLastAccessedDetailsWithEntitiesRequest.getJobId();
            request.addParameter(prefix, StringUtils.fromString(jobId));
        }
        if (getServiceLastAccessedDetailsWithEntitiesRequest.getServiceNamespace() != null) {
            prefix = "ServiceNamespace";
            String serviceNamespace = getServiceLastAccessedDetailsWithEntitiesRequest
                    .getServiceNamespace();
            request.addParameter(prefix, StringUtils.fromString(serviceNamespace));
        }
        if (getServiceLastAccessedDetailsWithEntitiesRequest.getMaxItems() != null) {
            prefix = "MaxItems";
            Integer maxItems = getServiceLastAccessedDetailsWithEntitiesRequest.getMaxItems();
            request.addParameter(prefix, StringUtils.fromInteger(maxItems));
        }
        if (getServiceLastAccessedDetailsWithEntitiesRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = getServiceLastAccessedDetailsWithEntitiesRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}
