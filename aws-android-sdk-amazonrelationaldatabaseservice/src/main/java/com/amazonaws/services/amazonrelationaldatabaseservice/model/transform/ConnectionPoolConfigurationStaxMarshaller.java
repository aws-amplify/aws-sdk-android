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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ConnectionPoolConfiguration
 */
class ConnectionPoolConfigurationStaxMarshaller {

    public void marshall(ConnectionPoolConfiguration _connectionPoolConfiguration,
            Request<?> request, String _prefix) {
        String prefix;
        if (_connectionPoolConfiguration.getMaxConnectionsPercent() != null) {
            prefix = _prefix + "MaxConnectionsPercent";
            Integer maxConnectionsPercent = _connectionPoolConfiguration.getMaxConnectionsPercent();
            request.addParameter(prefix, StringUtils.fromInteger(maxConnectionsPercent));
        }
        if (_connectionPoolConfiguration.getMaxIdleConnectionsPercent() != null) {
            prefix = _prefix + "MaxIdleConnectionsPercent";
            Integer maxIdleConnectionsPercent = _connectionPoolConfiguration
                    .getMaxIdleConnectionsPercent();
            request.addParameter(prefix, StringUtils.fromInteger(maxIdleConnectionsPercent));
        }
        if (_connectionPoolConfiguration.getConnectionBorrowTimeout() != null) {
            prefix = _prefix + "ConnectionBorrowTimeout";
            Integer connectionBorrowTimeout = _connectionPoolConfiguration
                    .getConnectionBorrowTimeout();
            request.addParameter(prefix, StringUtils.fromInteger(connectionBorrowTimeout));
        }
        if (_connectionPoolConfiguration.getSessionPinningFilters() != null) {
            prefix = _prefix + "SessionPinningFilters";
            java.util.List<String> sessionPinningFilters = _connectionPoolConfiguration
                    .getSessionPinningFilters();
            int sessionPinningFiltersIndex = 1;
            String sessionPinningFiltersPrefix = prefix;
            for (String sessionPinningFiltersItem : sessionPinningFilters) {
                prefix = sessionPinningFiltersPrefix + ".member." + sessionPinningFiltersIndex;
                if (sessionPinningFiltersItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(sessionPinningFiltersItem));
                }
                sessionPinningFiltersIndex++;
            }
            prefix = sessionPinningFiltersPrefix;
        }
        if (_connectionPoolConfiguration.getInitQuery() != null) {
            prefix = _prefix + "InitQuery";
            String initQuery = _connectionPoolConfiguration.getInitQuery();
            request.addParameter(prefix, StringUtils.fromString(initQuery));
        }
    }

    private static ConnectionPoolConfigurationStaxMarshaller instance;

    public static ConnectionPoolConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ConnectionPoolConfigurationStaxMarshaller();
        return instance;
    }
}
