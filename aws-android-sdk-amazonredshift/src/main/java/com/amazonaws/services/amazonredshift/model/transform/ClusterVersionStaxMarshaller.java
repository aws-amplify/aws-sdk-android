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
 * StAX marshaller for POJO ClusterVersion
 */
class ClusterVersionStaxMarshaller {

    public void marshall(ClusterVersion _clusterVersion, Request<?> request, String _prefix) {
        String prefix;
        if (_clusterVersion.getClusterVersion() != null) {
            prefix = _prefix + "ClusterVersion";
            String clusterVersion = _clusterVersion.getClusterVersion();
            request.addParameter(prefix, StringUtils.fromString(clusterVersion));
        }
        if (_clusterVersion.getClusterParameterGroupFamily() != null) {
            prefix = _prefix + "ClusterParameterGroupFamily";
            String clusterParameterGroupFamily = _clusterVersion.getClusterParameterGroupFamily();
            request.addParameter(prefix, StringUtils.fromString(clusterParameterGroupFamily));
        }
        if (_clusterVersion.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _clusterVersion.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
    }

    private static ClusterVersionStaxMarshaller instance;

    public static ClusterVersionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterVersionStaxMarshaller();
        return instance;
    }
}
