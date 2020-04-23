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
 * StAX marshaller for POJO DBClusterBacktrack
 */
class DBClusterBacktrackStaxMarshaller {

    public void marshall(DBClusterBacktrack _dBClusterBacktrack, Request<?> request, String _prefix) {
        String prefix;
        if (_dBClusterBacktrack.getDBClusterIdentifier() != null) {
            prefix = _prefix + "DBClusterIdentifier";
            String dBClusterIdentifier = _dBClusterBacktrack.getDBClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBClusterIdentifier));
        }
        if (_dBClusterBacktrack.getBacktrackIdentifier() != null) {
            prefix = _prefix + "BacktrackIdentifier";
            String backtrackIdentifier = _dBClusterBacktrack.getBacktrackIdentifier();
            request.addParameter(prefix, StringUtils.fromString(backtrackIdentifier));
        }
        if (_dBClusterBacktrack.getBacktrackTo() != null) {
            prefix = _prefix + "BacktrackTo";
            java.util.Date backtrackTo = _dBClusterBacktrack.getBacktrackTo();
            request.addParameter(prefix, StringUtils.fromDate(backtrackTo));
        }
        if (_dBClusterBacktrack.getBacktrackedFrom() != null) {
            prefix = _prefix + "BacktrackedFrom";
            java.util.Date backtrackedFrom = _dBClusterBacktrack.getBacktrackedFrom();
            request.addParameter(prefix, StringUtils.fromDate(backtrackedFrom));
        }
        if (_dBClusterBacktrack.getBacktrackRequestCreationTime() != null) {
            prefix = _prefix + "BacktrackRequestCreationTime";
            java.util.Date backtrackRequestCreationTime = _dBClusterBacktrack
                    .getBacktrackRequestCreationTime();
            request.addParameter(prefix, StringUtils.fromDate(backtrackRequestCreationTime));
        }
        if (_dBClusterBacktrack.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _dBClusterBacktrack.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
    }

    private static DBClusterBacktrackStaxMarshaller instance;

    public static DBClusterBacktrackStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DBClusterBacktrackStaxMarshaller();
        return instance;
    }
}
