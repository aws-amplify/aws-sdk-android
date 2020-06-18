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
 * StAX marshaller for POJO DBParameterGroup
 */
class DBParameterGroupStaxMarshaller {

    public void marshall(DBParameterGroup _dBParameterGroup, Request<?> request, String _prefix) {
        String prefix;
        if (_dBParameterGroup.getDBParameterGroupName() != null) {
            prefix = _prefix + "DBParameterGroupName";
            String dBParameterGroupName = _dBParameterGroup.getDBParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBParameterGroupName));
        }
        if (_dBParameterGroup.getDBParameterGroupFamily() != null) {
            prefix = _prefix + "DBParameterGroupFamily";
            String dBParameterGroupFamily = _dBParameterGroup.getDBParameterGroupFamily();
            request.addParameter(prefix, StringUtils.fromString(dBParameterGroupFamily));
        }
        if (_dBParameterGroup.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _dBParameterGroup.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_dBParameterGroup.getDBParameterGroupArn() != null) {
            prefix = _prefix + "DBParameterGroupArn";
            String dBParameterGroupArn = _dBParameterGroup.getDBParameterGroupArn();
            request.addParameter(prefix, StringUtils.fromString(dBParameterGroupArn));
        }
    }

    private static DBParameterGroupStaxMarshaller instance;

    public static DBParameterGroupStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DBParameterGroupStaxMarshaller();
        return instance;
    }
}
