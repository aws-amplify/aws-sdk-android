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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Deployment
 */
class DeploymentStaxMarshaller {

    public void marshall(Deployment _deployment, Request<?> request, String _prefix) {
        String prefix;
        if (_deployment.getVersionLabel() != null) {
            prefix = _prefix + "VersionLabel";
            String versionLabel = _deployment.getVersionLabel();
            request.addParameter(prefix, StringUtils.fromString(versionLabel));
        }
        if (_deployment.getDeploymentId() != null) {
            prefix = _prefix + "DeploymentId";
            Long deploymentId = _deployment.getDeploymentId();
            request.addParameter(prefix, StringUtils.fromLong(deploymentId));
        }
        if (_deployment.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _deployment.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_deployment.getDeploymentTime() != null) {
            prefix = _prefix + "DeploymentTime";
            java.util.Date deploymentTime = _deployment.getDeploymentTime();
            request.addParameter(prefix, StringUtils.fromDate(deploymentTime));
        }
    }

    private static DeploymentStaxMarshaller instance;

    public static DeploymentStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentStaxMarshaller();
        return instance;
    }
}
