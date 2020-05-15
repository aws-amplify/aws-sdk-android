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
 * StAX request marshaller for ExecuteChangeSetRequest
 */
public class ExecuteChangeSetRequestMarshaller implements
        Marshaller<Request<ExecuteChangeSetRequest>, ExecuteChangeSetRequest> {

    public Request<ExecuteChangeSetRequest> marshall(ExecuteChangeSetRequest executeChangeSetRequest) {
        if (executeChangeSetRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ExecuteChangeSetRequest)");
        }

        Request<ExecuteChangeSetRequest> request = new DefaultRequest<ExecuteChangeSetRequest>(
                executeChangeSetRequest, "AWSCloudFormation");
        request.addParameter("Action", "ExecuteChangeSet");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (executeChangeSetRequest.getChangeSetName() != null) {
            prefix = "ChangeSetName";
            String changeSetName = executeChangeSetRequest.getChangeSetName();
            request.addParameter(prefix, StringUtils.fromString(changeSetName));
        }
        if (executeChangeSetRequest.getStackName() != null) {
            prefix = "StackName";
            String stackName = executeChangeSetRequest.getStackName();
            request.addParameter(prefix, StringUtils.fromString(stackName));
        }
        if (executeChangeSetRequest.getClientRequestToken() != null) {
            prefix = "ClientRequestToken";
            String clientRequestToken = executeChangeSetRequest.getClientRequestToken();
            request.addParameter(prefix, StringUtils.fromString(clientRequestToken));
        }

        return request;
    }
}
