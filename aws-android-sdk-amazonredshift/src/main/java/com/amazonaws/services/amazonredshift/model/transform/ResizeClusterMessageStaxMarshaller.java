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
 * StAX marshaller for POJO ResizeClusterMessage
 */
class ResizeClusterMessageStaxMarshaller {

    public void marshall(ResizeClusterMessage _resizeClusterMessage, Request<?> request,
            String _prefix) {
        String prefix;
        if (_resizeClusterMessage.getClusterIdentifier() != null) {
            prefix = _prefix + "ClusterIdentifier";
            String clusterIdentifier = _resizeClusterMessage.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (_resizeClusterMessage.getClusterType() != null) {
            prefix = _prefix + "ClusterType";
            String clusterType = _resizeClusterMessage.getClusterType();
            request.addParameter(prefix, StringUtils.fromString(clusterType));
        }
        if (_resizeClusterMessage.getNodeType() != null) {
            prefix = _prefix + "NodeType";
            String nodeType = _resizeClusterMessage.getNodeType();
            request.addParameter(prefix, StringUtils.fromString(nodeType));
        }
        if (_resizeClusterMessage.getNumberOfNodes() != null) {
            prefix = _prefix + "NumberOfNodes";
            Integer numberOfNodes = _resizeClusterMessage.getNumberOfNodes();
            request.addParameter(prefix, StringUtils.fromInteger(numberOfNodes));
        }
        if (_resizeClusterMessage.getClassic() != null) {
            prefix = _prefix + "Classic";
            Boolean classic = _resizeClusterMessage.getClassic();
            request.addParameter(prefix, StringUtils.fromBoolean(classic));
        }
    }

    private static ResizeClusterMessageStaxMarshaller instance;

    public static ResizeClusterMessageStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ResizeClusterMessageStaxMarshaller();
        return instance;
    }
}
