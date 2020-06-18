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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO DBClusterParameterGroup
 */
class DBClusterParameterGroupStaxMarshaller {

    public void marshall(DBClusterParameterGroup _dBClusterParameterGroup, Request<?> request,
            String _prefix) {
        String prefix;
        if (_dBClusterParameterGroup.getDBClusterParameterGroupName() != null) {
            prefix = _prefix + "DBClusterParameterGroupName";
            String dBClusterParameterGroupName = _dBClusterParameterGroup
                    .getDBClusterParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBClusterParameterGroupName));
        }
        if (_dBClusterParameterGroup.getDBParameterGroupFamily() != null) {
            prefix = _prefix + "DBParameterGroupFamily";
            String dBParameterGroupFamily = _dBClusterParameterGroup.getDBParameterGroupFamily();
            request.addParameter(prefix, StringUtils.fromString(dBParameterGroupFamily));
        }
        if (_dBClusterParameterGroup.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _dBClusterParameterGroup.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_dBClusterParameterGroup.getDBClusterParameterGroupArn() != null) {
            prefix = _prefix + "DBClusterParameterGroupArn";
            String dBClusterParameterGroupArn = _dBClusterParameterGroup
                    .getDBClusterParameterGroupArn();
            request.addParameter(prefix, StringUtils.fromString(dBClusterParameterGroupArn));
        }
    }

    private static DBClusterParameterGroupStaxMarshaller instance;

    public static DBClusterParameterGroupStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DBClusterParameterGroupStaxMarshaller();
        return instance;
    }
}
