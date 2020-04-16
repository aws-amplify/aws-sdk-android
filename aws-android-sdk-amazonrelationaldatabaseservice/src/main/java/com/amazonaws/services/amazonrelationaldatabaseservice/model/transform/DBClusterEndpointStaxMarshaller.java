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
 * StAX marshaller for POJO DBClusterEndpoint
 */
class DBClusterEndpointStaxMarshaller {

    public void marshall(DBClusterEndpoint _dBClusterEndpoint, Request<?> request, String _prefix) {
        String prefix;
        if (_dBClusterEndpoint.getDBClusterEndpointIdentifier() != null) {
            prefix = _prefix + "DBClusterEndpointIdentifier";
            String dBClusterEndpointIdentifier = _dBClusterEndpoint
                    .getDBClusterEndpointIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBClusterEndpointIdentifier));
        }
        if (_dBClusterEndpoint.getDBClusterIdentifier() != null) {
            prefix = _prefix + "DBClusterIdentifier";
            String dBClusterIdentifier = _dBClusterEndpoint.getDBClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBClusterIdentifier));
        }
        if (_dBClusterEndpoint.getDBClusterEndpointResourceIdentifier() != null) {
            prefix = _prefix + "DBClusterEndpointResourceIdentifier";
            String dBClusterEndpointResourceIdentifier = _dBClusterEndpoint
                    .getDBClusterEndpointResourceIdentifier();
            request.addParameter(prefix,
                    StringUtils.fromString(dBClusterEndpointResourceIdentifier));
        }
        if (_dBClusterEndpoint.getEndpoint() != null) {
            prefix = _prefix + "Endpoint";
            String endpoint = _dBClusterEndpoint.getEndpoint();
            request.addParameter(prefix, StringUtils.fromString(endpoint));
        }
        if (_dBClusterEndpoint.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _dBClusterEndpoint.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_dBClusterEndpoint.getEndpointType() != null) {
            prefix = _prefix + "EndpointType";
            String endpointType = _dBClusterEndpoint.getEndpointType();
            request.addParameter(prefix, StringUtils.fromString(endpointType));
        }
        if (_dBClusterEndpoint.getCustomEndpointType() != null) {
            prefix = _prefix + "CustomEndpointType";
            String customEndpointType = _dBClusterEndpoint.getCustomEndpointType();
            request.addParameter(prefix, StringUtils.fromString(customEndpointType));
        }
        if (_dBClusterEndpoint.getStaticMembers() != null) {
            prefix = _prefix + "StaticMembers";
            java.util.List<String> staticMembers = _dBClusterEndpoint.getStaticMembers();
            int staticMembersIndex = 1;
            String staticMembersPrefix = prefix;
            for (String staticMembersItem : staticMembers) {
                prefix = staticMembersPrefix + ".member." + staticMembersIndex;
                if (staticMembersItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(staticMembersItem));
                }
                staticMembersIndex++;
            }
            prefix = staticMembersPrefix;
        }
        if (_dBClusterEndpoint.getExcludedMembers() != null) {
            prefix = _prefix + "ExcludedMembers";
            java.util.List<String> excludedMembers = _dBClusterEndpoint.getExcludedMembers();
            int excludedMembersIndex = 1;
            String excludedMembersPrefix = prefix;
            for (String excludedMembersItem : excludedMembers) {
                prefix = excludedMembersPrefix + ".member." + excludedMembersIndex;
                if (excludedMembersItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(excludedMembersItem));
                }
                excludedMembersIndex++;
            }
            prefix = excludedMembersPrefix;
        }
        if (_dBClusterEndpoint.getDBClusterEndpointArn() != null) {
            prefix = _prefix + "DBClusterEndpointArn";
            String dBClusterEndpointArn = _dBClusterEndpoint.getDBClusterEndpointArn();
            request.addParameter(prefix, StringUtils.fromString(dBClusterEndpointArn));
        }
    }

    private static DBClusterEndpointStaxMarshaller instance;

    public static DBClusterEndpointStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DBClusterEndpointStaxMarshaller();
        return instance;
    }
}
