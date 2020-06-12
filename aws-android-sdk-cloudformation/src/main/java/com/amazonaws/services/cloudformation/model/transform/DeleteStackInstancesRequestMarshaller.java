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
 * StAX request marshaller for DeleteStackInstancesRequest
 */
public class DeleteStackInstancesRequestMarshaller implements
        Marshaller<Request<DeleteStackInstancesRequest>, DeleteStackInstancesRequest> {

    public Request<DeleteStackInstancesRequest> marshall(
            DeleteStackInstancesRequest deleteStackInstancesRequest) {
        if (deleteStackInstancesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteStackInstancesRequest)");
        }

        Request<DeleteStackInstancesRequest> request = new DefaultRequest<DeleteStackInstancesRequest>(
                deleteStackInstancesRequest, "AWSCloudFormation");
        request.addParameter("Action", "DeleteStackInstances");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (deleteStackInstancesRequest.getStackSetName() != null) {
            prefix = "StackSetName";
            String stackSetName = deleteStackInstancesRequest.getStackSetName();
            request.addParameter(prefix, StringUtils.fromString(stackSetName));
        }
        if (deleteStackInstancesRequest.getAccounts() != null) {
            prefix = "Accounts";
            java.util.List<String> accounts = deleteStackInstancesRequest.getAccounts();
            int accountsIndex = 1;
            String accountsPrefix = prefix;
            for (String accountsItem : accounts) {
                prefix = accountsPrefix + ".member." + accountsIndex;
                if (accountsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(accountsItem));
                }
                accountsIndex++;
            }
            prefix = accountsPrefix;
        }
        if (deleteStackInstancesRequest.getDeploymentTargets() != null) {
            prefix = "DeploymentTargets";
            DeploymentTargets deploymentTargets = deleteStackInstancesRequest
                    .getDeploymentTargets();
            DeploymentTargetsStaxMarshaller.getInstance().marshall(deploymentTargets, request,
                    prefix + ".");
        }
        if (deleteStackInstancesRequest.getRegions() != null) {
            prefix = "Regions";
            java.util.List<String> regions = deleteStackInstancesRequest.getRegions();
            int regionsIndex = 1;
            String regionsPrefix = prefix;
            for (String regionsItem : regions) {
                prefix = regionsPrefix + ".member." + regionsIndex;
                if (regionsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(regionsItem));
                }
                regionsIndex++;
            }
            prefix = regionsPrefix;
        }
        if (deleteStackInstancesRequest.getOperationPreferences() != null) {
            prefix = "OperationPreferences";
            StackSetOperationPreferences operationPreferences = deleteStackInstancesRequest
                    .getOperationPreferences();
            StackSetOperationPreferencesStaxMarshaller.getInstance().marshall(operationPreferences,
                    request, prefix + ".");
        }
        if (deleteStackInstancesRequest.getRetainStacks() != null) {
            prefix = "RetainStacks";
            Boolean retainStacks = deleteStackInstancesRequest.getRetainStacks();
            request.addParameter(prefix, StringUtils.fromBoolean(retainStacks));
        }
        if (deleteStackInstancesRequest.getOperationId() != null) {
            prefix = "OperationId";
            String operationId = deleteStackInstancesRequest.getOperationId();
            request.addParameter(prefix, StringUtils.fromString(operationId));
        }

        return request;
    }
}
