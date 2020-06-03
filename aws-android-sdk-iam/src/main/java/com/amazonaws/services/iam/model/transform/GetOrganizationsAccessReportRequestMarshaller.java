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
 * StAX request marshaller for GetOrganizationsAccessReportRequest
 */
public class GetOrganizationsAccessReportRequestMarshaller
        implements
        Marshaller<Request<GetOrganizationsAccessReportRequest>, GetOrganizationsAccessReportRequest> {

    public Request<GetOrganizationsAccessReportRequest> marshall(
            GetOrganizationsAccessReportRequest getOrganizationsAccessReportRequest) {
        if (getOrganizationsAccessReportRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetOrganizationsAccessReportRequest)");
        }

        Request<GetOrganizationsAccessReportRequest> request = new DefaultRequest<GetOrganizationsAccessReportRequest>(
                getOrganizationsAccessReportRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "GetOrganizationsAccessReport");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (getOrganizationsAccessReportRequest.getJobId() != null) {
            prefix = "JobId";
            String jobId = getOrganizationsAccessReportRequest.getJobId();
            request.addParameter(prefix, StringUtils.fromString(jobId));
        }
        if (getOrganizationsAccessReportRequest.getMaxItems() != null) {
            prefix = "MaxItems";
            Integer maxItems = getOrganizationsAccessReportRequest.getMaxItems();
            request.addParameter(prefix, StringUtils.fromInteger(maxItems));
        }
        if (getOrganizationsAccessReportRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = getOrganizationsAccessReportRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (getOrganizationsAccessReportRequest.getSortKey() != null) {
            prefix = "SortKey";
            String sortKey = getOrganizationsAccessReportRequest.getSortKey();
            request.addParameter(prefix, StringUtils.fromString(sortKey));
        }

        return request;
    }
}
