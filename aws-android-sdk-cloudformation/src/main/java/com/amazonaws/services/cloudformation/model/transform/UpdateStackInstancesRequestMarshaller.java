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
 * StAX request marshaller for UpdateStackInstancesRequest
 */
public class UpdateStackInstancesRequestMarshaller implements
        Marshaller<Request<UpdateStackInstancesRequest>, UpdateStackInstancesRequest> {

    public Request<UpdateStackInstancesRequest> marshall(
            UpdateStackInstancesRequest updateStackInstancesRequest) {
        if (updateStackInstancesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateStackInstancesRequest)");
        }

        Request<UpdateStackInstancesRequest> request = new DefaultRequest<UpdateStackInstancesRequest>(
                updateStackInstancesRequest, "AWSCloudFormation");
        request.addParameter("Action", "UpdateStackInstances");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (updateStackInstancesRequest.getStackSetName() != null) {
            prefix = "StackSetName";
            String stackSetName = updateStackInstancesRequest.getStackSetName();
            request.addParameter(prefix, StringUtils.fromString(stackSetName));
        }
        if (updateStackInstancesRequest.getAccounts() != null) {
            prefix = "Accounts";
            java.util.List<String> accounts = updateStackInstancesRequest.getAccounts();
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
        if (updateStackInstancesRequest.getDeploymentTargets() != null) {
            prefix = "DeploymentTargets";
            DeploymentTargets deploymentTargets = updateStackInstancesRequest
                    .getDeploymentTargets();
            DeploymentTargetsStaxMarshaller.getInstance().marshall(deploymentTargets, request,
                    prefix + ".");
        }
        if (updateStackInstancesRequest.getRegions() != null) {
            prefix = "Regions";
            java.util.List<String> regions = updateStackInstancesRequest.getRegions();
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
        if (updateStackInstancesRequest.getParameterOverrides() != null) {
            prefix = "ParameterOverrides";
            java.util.List<Parameter> parameterOverrides = updateStackInstancesRequest
                    .getParameterOverrides();
            int parameterOverridesIndex = 1;
            String parameterOverridesPrefix = prefix;
            for (Parameter parameterOverridesItem : parameterOverrides) {
                prefix = parameterOverridesPrefix + ".member." + parameterOverridesIndex;
                if (parameterOverridesItem != null) {
                    ParameterStaxMarshaller.getInstance().marshall(parameterOverridesItem, request,
                            prefix + ".");
                }
                parameterOverridesIndex++;
            }
            prefix = parameterOverridesPrefix;
        }
        if (updateStackInstancesRequest.getOperationPreferences() != null) {
            prefix = "OperationPreferences";
            StackSetOperationPreferences operationPreferences = updateStackInstancesRequest
                    .getOperationPreferences();
            StackSetOperationPreferencesStaxMarshaller.getInstance().marshall(operationPreferences,
                    request, prefix + ".");
        }
        if (updateStackInstancesRequest.getOperationId() != null) {
            prefix = "OperationId";
            String operationId = updateStackInstancesRequest.getOperationId();
            request.addParameter(prefix, StringUtils.fromString(operationId));
        }

        return request;
    }
}
