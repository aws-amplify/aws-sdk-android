/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.securitytoken.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO FederatedUser
 */
class FederatedUserStaxMarshaller {

    public void marshall(FederatedUser _federatedUser, Request<?> request, String _prefix) {
        String prefix;
        if (_federatedUser.getFederatedUserId() != null) {
            prefix = _prefix + "FederatedUserId";
            String federatedUserId = _federatedUser.getFederatedUserId();
            request.addParameter(prefix, StringUtils.fromString(federatedUserId));
        }
        if (_federatedUser.getArn() != null) {
            prefix = _prefix + "Arn";
            String arn = _federatedUser.getArn();
            request.addParameter(prefix, StringUtils.fromString(arn));
        }
    }

    private static FederatedUserStaxMarshaller instance;

    public static FederatedUserStaxMarshaller getInstance() {
        if (instance == null)
            instance = new FederatedUserStaxMarshaller();
        return instance;
    }
}
