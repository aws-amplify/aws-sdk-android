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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DeleteDBClusterParameterGroupRequest
 */
public class DeleteDBClusterParameterGroupRequestMarshaller
        implements
        Marshaller<Request<DeleteDBClusterParameterGroupRequest>, DeleteDBClusterParameterGroupRequest> {

    public Request<DeleteDBClusterParameterGroupRequest> marshall(
            DeleteDBClusterParameterGroupRequest deleteDBClusterParameterGroupRequest) {
        if (deleteDBClusterParameterGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteDBClusterParameterGroupRequest)");
        }

        Request<DeleteDBClusterParameterGroupRequest> request = new DefaultRequest<DeleteDBClusterParameterGroupRequest>(
                deleteDBClusterParameterGroupRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "DeleteDBClusterParameterGroup");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (deleteDBClusterParameterGroupRequest.getDBClusterParameterGroupName() != null) {
            prefix = "DBClusterParameterGroupName";
            String dBClusterParameterGroupName = deleteDBClusterParameterGroupRequest
                    .getDBClusterParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBClusterParameterGroupName));
        }

        return request;
    }
}
