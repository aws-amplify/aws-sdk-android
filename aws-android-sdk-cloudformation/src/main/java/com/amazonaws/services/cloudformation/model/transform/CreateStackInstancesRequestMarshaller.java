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
 * StAX request marshaller for CreateStackInstancesRequest
 */
public class CreateStackInstancesRequestMarshaller implements
        Marshaller<Request<CreateStackInstancesRequest>, CreateStackInstancesRequest> {

    public Request<CreateStackInstancesRequest> marshall(
            CreateStackInstancesRequest createStackInstancesRequest) {
        if (createStackInstancesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateStackInstancesRequest)");
        }

        Request<CreateStackInstancesRequest> request = new DefaultRequest<CreateStackInstancesRequest>(
                createStackInstancesRequest, "AWSCloudFormation");
        request.addParameter("Action", "CreateStackInstances");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (createStackInstancesRequest.getStackSetName() != null) {
            prefix = "StackSetName";
            String stackSetName = createStackInstancesRequest.getStackSetName();
            request.addParameter(prefix, StringUtils.fromString(stackSetName));
        }
        if (createStackInstancesRequest.getAccounts() != null) {
            prefix = "Accounts";
            java.util.List<String> accounts = createStackInstancesRequest.getAccounts();
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
        if (createStackInstancesRequest.getDeploymentTargets() != null) {
            prefix = "DeploymentTargets";
            DeploymentTargets deploymentTargets = createStackInstancesRequest
                    .getDeploymentTargets();
            DeploymentTargetsStaxMarshaller.getInstance().marshall(deploymentTargets, request,
                    prefix + ".");
        }
        if (createStackInstancesRequest.getRegions() != null) {
            prefix = "Regions";
            java.util.List<String> regions = createStackInstancesRequest.getRegions();
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
        if (createStackInstancesRequest.getParameterOverrides() != null) {
            prefix = "ParameterOverrides";
            java.util.List<Parameter> parameterOverrides = createStackInstancesRequest
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
        if (createStackInstancesRequest.getOperationPreferences() != null) {
            prefix = "OperationPreferences";
            StackSetOperationPreferences operationPreferences = createStackInstancesRequest
                    .getOperationPreferences();
            StackSetOperationPreferencesStaxMarshaller.getInstance().marshall(operationPreferences,
                    request, prefix + ".");
        }
        if (createStackInstancesRequest.getOperationId() != null) {
            prefix = "OperationId";
            String operationId = createStackInstancesRequest.getOperationId();
            request.addParameter(prefix, StringUtils.fromString(operationId));
        }

        return request;
    }
}
