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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DeleteDBSecurityGroupRequest
 */
public class DeleteDBSecurityGroupRequestMarshaller implements
        Marshaller<Request<DeleteDBSecurityGroupRequest>, DeleteDBSecurityGroupRequest> {

    public Request<DeleteDBSecurityGroupRequest> marshall(
            DeleteDBSecurityGroupRequest deleteDBSecurityGroupRequest) {
        if (deleteDBSecurityGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteDBSecurityGroupRequest)");
        }

        Request<DeleteDBSecurityGroupRequest> request = new DefaultRequest<DeleteDBSecurityGroupRequest>(
                deleteDBSecurityGroupRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "DeleteDBSecurityGroup");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (deleteDBSecurityGroupRequest.getDBSecurityGroupName() != null) {
            prefix = "DBSecurityGroupName";
            String dBSecurityGroupName = deleteDBSecurityGroupRequest.getDBSecurityGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBSecurityGroupName));
        }

        return request;
    }
}
