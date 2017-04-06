/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.elasticloadbalancing.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ConnectionSettings
 */
class ConnectionSettingsStaxMarshaller {

    public void marshall(ConnectionSettings _connectionSettings, Request<?> request, String _prefix) {
        String prefix;
        if (_connectionSettings.getIdleTimeout() != null) {
            prefix = _prefix + "IdleTimeout";
            Integer idleTimeout = _connectionSettings.getIdleTimeout();
            request.addParameter(prefix, StringUtils.fromInteger(idleTimeout));
        }
    }

    private static ConnectionSettingsStaxMarshaller instance;

    public static ConnectionSettingsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ConnectionSettingsStaxMarshaller();
        return instance;
    }
}
