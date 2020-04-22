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
 * StAX marshaller for POJO NodeConfigurationOption
 */
class NodeConfigurationOptionStaxMarshaller {

    public void marshall(NodeConfigurationOption _nodeConfigurationOption, Request<?> request,
            String _prefix) {
        String prefix;
        if (_nodeConfigurationOption.getNodeType() != null) {
            prefix = _prefix + "NodeType";
            String nodeType = _nodeConfigurationOption.getNodeType();
            request.addParameter(prefix, StringUtils.fromString(nodeType));
        }
        if (_nodeConfigurationOption.getNumberOfNodes() != null) {
            prefix = _prefix + "NumberOfNodes";
            Integer numberOfNodes = _nodeConfigurationOption.getNumberOfNodes();
            request.addParameter(prefix, StringUtils.fromInteger(numberOfNodes));
        }
        if (_nodeConfigurationOption.getEstimatedDiskUtilizationPercent() != null) {
            prefix = _prefix + "EstimatedDiskUtilizationPercent";
            Double estimatedDiskUtilizationPercent = _nodeConfigurationOption
                    .getEstimatedDiskUtilizationPercent();
            request.addParameter(prefix, StringUtils.fromDouble(estimatedDiskUtilizationPercent));
        }
        if (_nodeConfigurationOption.getMode() != null) {
            prefix = _prefix + "Mode";
            String mode = _nodeConfigurationOption.getMode();
            request.addParameter(prefix, StringUtils.fromString(mode));
        }
    }

    private static NodeConfigurationOptionStaxMarshaller instance;

    public static NodeConfigurationOptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new NodeConfigurationOptionStaxMarshaller();
        return instance;
    }
}
