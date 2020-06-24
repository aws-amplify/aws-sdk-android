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
 * StAX request marshaller for ListRolesRequest
 */
public class ListRolesRequestMarshaller implements
        Marshaller<Request<ListRolesRequest>, ListRolesRequest> {

    public Request<ListRolesRequest> marshall(ListRolesRequest listRolesRequest) {
        if (listRolesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(ListRolesRequest)");
        }

        Request<ListRolesRequest> request = new DefaultRequest<ListRolesRequest>(listRolesRequest,
                "AWSIdentityandAccessManagement");
        request.addParameter("Action", "ListRoles");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (listRolesRequest.getPathPrefix() != null) {
            prefix = "PathPrefix";
            String pathPrefix = listRolesRequest.getPathPrefix();
            request.addParameter(prefix, StringUtils.fromString(pathPrefix));
        }
        if (listRolesRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = listRolesRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (listRolesRequest.getMaxItems() != null) {
            prefix = "MaxItems";
            Integer maxItems = listRolesRequest.getMaxItems();
            request.addParameter(prefix, StringUtils.fromInteger(maxItems));
        }

        return request;
    }
}
