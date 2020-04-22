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
 * StAX marshaller for POJO ClusterParameterGroup
 */
class ClusterParameterGroupStaxMarshaller {

    public void marshall(ClusterParameterGroup _clusterParameterGroup, Request<?> request,
            String _prefix) {
        String prefix;
        if (_clusterParameterGroup.getParameterGroupName() != null) {
            prefix = _prefix + "ParameterGroupName";
            String parameterGroupName = _clusterParameterGroup.getParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(parameterGroupName));
        }
        if (_clusterParameterGroup.getParameterGroupFamily() != null) {
            prefix = _prefix + "ParameterGroupFamily";
            String parameterGroupFamily = _clusterParameterGroup.getParameterGroupFamily();
            request.addParameter(prefix, StringUtils.fromString(parameterGroupFamily));
        }
        if (_clusterParameterGroup.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _clusterParameterGroup.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_clusterParameterGroup.getTags() != null) {
            prefix = _prefix + "Tags";
            java.util.List<Tag> tags = _clusterParameterGroup.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (Tag tagsItem : tags) {
                prefix = tagsPrefix + "." + tagsIndex;
                if (tagsItem != null) {
                    TagStaxMarshaller.getInstance().marshall(tagsItem, request, prefix + ".");
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }
    }

    private static ClusterParameterGroupStaxMarshaller instance;

    public static ClusterParameterGroupStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterParameterGroupStaxMarshaller();
        return instance;
    }
}
