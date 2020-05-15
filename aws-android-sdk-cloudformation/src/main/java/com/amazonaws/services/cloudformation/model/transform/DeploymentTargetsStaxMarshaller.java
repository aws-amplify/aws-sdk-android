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

import com.amazonaws.Request;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO DeploymentTargets
 */
class DeploymentTargetsStaxMarshaller {

    public void marshall(DeploymentTargets _deploymentTargets, Request<?> request, String _prefix) {
        String prefix;
        if (_deploymentTargets.getAccounts() != null) {
            prefix = _prefix + "Accounts";
            java.util.List<String> accounts = _deploymentTargets.getAccounts();
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
        if (_deploymentTargets.getOrganizationalUnitIds() != null) {
            prefix = _prefix + "OrganizationalUnitIds";
            java.util.List<String> organizationalUnitIds = _deploymentTargets
                    .getOrganizationalUnitIds();
            int organizationalUnitIdsIndex = 1;
            String organizationalUnitIdsPrefix = prefix;
            for (String organizationalUnitIdsItem : organizationalUnitIds) {
                prefix = organizationalUnitIdsPrefix + ".member." + organizationalUnitIdsIndex;
                if (organizationalUnitIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(organizationalUnitIdsItem));
                }
                organizationalUnitIdsIndex++;
            }
            prefix = organizationalUnitIdsPrefix;
        }
    }

    private static DeploymentTargetsStaxMarshaller instance;

    public static DeploymentTargetsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentTargetsStaxMarshaller();
        return instance;
    }
}
