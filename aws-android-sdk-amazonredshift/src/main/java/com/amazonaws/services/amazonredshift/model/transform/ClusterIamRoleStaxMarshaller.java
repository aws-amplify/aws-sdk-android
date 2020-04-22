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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ClusterIamRole
 */
class ClusterIamRoleStaxMarshaller {

    public void marshall(ClusterIamRole _clusterIamRole, Request<?> request, String _prefix) {
        String prefix;
        if (_clusterIamRole.getIamRoleArn() != null) {
            prefix = _prefix + "IamRoleArn";
            String iamRoleArn = _clusterIamRole.getIamRoleArn();
            request.addParameter(prefix, StringUtils.fromString(iamRoleArn));
        }
        if (_clusterIamRole.getApplyStatus() != null) {
            prefix = _prefix + "ApplyStatus";
            String applyStatus = _clusterIamRole.getApplyStatus();
            request.addParameter(prefix, StringUtils.fromString(applyStatus));
        }
    }

    private static ClusterIamRoleStaxMarshaller instance;

    public static ClusterIamRoleStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterIamRoleStaxMarshaller();
        return instance;
    }
}
