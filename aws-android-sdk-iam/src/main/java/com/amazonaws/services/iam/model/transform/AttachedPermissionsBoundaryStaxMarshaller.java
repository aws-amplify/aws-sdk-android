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

package com.amazonaws.services.iam.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.iam.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO AttachedPermissionsBoundary
 */
class AttachedPermissionsBoundaryStaxMarshaller {

    public void marshall(AttachedPermissionsBoundary _attachedPermissionsBoundary,
            Request<?> request, String _prefix) {
        String prefix;
        if (_attachedPermissionsBoundary.getPermissionsBoundaryType() != null) {
            prefix = _prefix + "PermissionsBoundaryType";
            String permissionsBoundaryType = _attachedPermissionsBoundary
                    .getPermissionsBoundaryType();
            request.addParameter(prefix, StringUtils.fromString(permissionsBoundaryType));
        }
        if (_attachedPermissionsBoundary.getPermissionsBoundaryArn() != null) {
            prefix = _prefix + "PermissionsBoundaryArn";
            String permissionsBoundaryArn = _attachedPermissionsBoundary
                    .getPermissionsBoundaryArn();
            request.addParameter(prefix, StringUtils.fromString(permissionsBoundaryArn));
        }
    }

    private static AttachedPermissionsBoundaryStaxMarshaller instance;

    public static AttachedPermissionsBoundaryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AttachedPermissionsBoundaryStaxMarshaller();
        return instance;
    }
}
