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
 * StAX marshaller for POJO AutoDeployment
 */
class AutoDeploymentStaxMarshaller {

    public void marshall(AutoDeployment _autoDeployment, Request<?> request, String _prefix) {
        String prefix;
        if (_autoDeployment.getEnabled() != null) {
            prefix = _prefix + "Enabled";
            Boolean enabled = _autoDeployment.getEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(enabled));
        }
        if (_autoDeployment.getRetainStacksOnAccountRemoval() != null) {
            prefix = _prefix + "RetainStacksOnAccountRemoval";
            Boolean retainStacksOnAccountRemoval = _autoDeployment
                    .getRetainStacksOnAccountRemoval();
            request.addParameter(prefix, StringUtils.fromBoolean(retainStacksOnAccountRemoval));
        }
    }

    private static AutoDeploymentStaxMarshaller instance;

    public static AutoDeploymentStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AutoDeploymentStaxMarshaller();
        return instance;
    }
}
