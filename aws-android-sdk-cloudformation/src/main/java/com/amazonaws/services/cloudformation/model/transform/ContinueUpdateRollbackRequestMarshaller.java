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
 * StAX request marshaller for ContinueUpdateRollbackRequest
 */
public class ContinueUpdateRollbackRequestMarshaller implements
        Marshaller<Request<ContinueUpdateRollbackRequest>, ContinueUpdateRollbackRequest> {

    public Request<ContinueUpdateRollbackRequest> marshall(
            ContinueUpdateRollbackRequest continueUpdateRollbackRequest) {
        if (continueUpdateRollbackRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ContinueUpdateRollbackRequest)");
        }

        Request<ContinueUpdateRollbackRequest> request = new DefaultRequest<ContinueUpdateRollbackRequest>(
                continueUpdateRollbackRequest, "AWSCloudFormation");
        request.addParameter("Action", "ContinueUpdateRollback");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (continueUpdateRollbackRequest.getStackName() != null) {
            prefix = "StackName";
            String stackName = continueUpdateRollbackRequest.getStackName();
            request.addParameter(prefix, StringUtils.fromString(stackName));
        }
        if (continueUpdateRollbackRequest.getRoleARN() != null) {
            prefix = "RoleARN";
            String roleARN = continueUpdateRollbackRequest.getRoleARN();
            request.addParameter(prefix, StringUtils.fromString(roleARN));
        }
        if (continueUpdateRollbackRequest.getResourcesToSkip() != null) {
            prefix = "ResourcesToSkip";
            java.util.List<String> resourcesToSkip = continueUpdateRollbackRequest
                    .getResourcesToSkip();
            int resourcesToSkipIndex = 1;
            String resourcesToSkipPrefix = prefix;
            for (String resourcesToSkipItem : resourcesToSkip) {
                prefix = resourcesToSkipPrefix + ".member." + resourcesToSkipIndex;
                if (resourcesToSkipItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(resourcesToSkipItem));
                }
                resourcesToSkipIndex++;
            }
            prefix = resourcesToSkipPrefix;
        }
        if (continueUpdateRollbackRequest.getClientRequestToken() != null) {
            prefix = "ClientRequestToken";
            String clientRequestToken = continueUpdateRollbackRequest.getClientRequestToken();
            request.addParameter(prefix, StringUtils.fromString(clientRequestToken));
        }

        return request;
    }
}
