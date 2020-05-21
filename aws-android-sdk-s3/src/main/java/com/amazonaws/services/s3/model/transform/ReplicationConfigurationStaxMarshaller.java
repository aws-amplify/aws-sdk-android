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

package com.amazonaws.services.s3.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ReplicationConfiguration
 */
class ReplicationConfigurationStaxMarshaller {

    public void marshall(ReplicationConfiguration _replicationConfiguration, Request<?> request,
            String _prefix) {
        String prefix;
        if (_replicationConfiguration.getRole() != null) {
            prefix = _prefix + "Role";
            String role = _replicationConfiguration.getRole();
            request.addParameter(prefix, StringUtils.fromString(role));
        }
        if (_replicationConfiguration.getRules() != null) {
            prefix = _prefix + "Rules";
            java.util.List<ReplicationRule> rules = _replicationConfiguration.getRules();
            int rulesIndex = 1;
            String rulesPrefix = prefix;
            for (ReplicationRule rulesItem : rules) {
                prefix = rulesPrefix + ".member." + rulesIndex;
                if (rulesItem != null) {
                    ReplicationRuleStaxMarshaller.getInstance().marshall(rulesItem, request,
                            prefix + ".");
                }
                rulesIndex++;
            }
            prefix = rulesPrefix;
        }
    }

    private static ReplicationConfigurationStaxMarshaller instance;

    public static ReplicationConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationConfigurationStaxMarshaller();
        return instance;
    }
}
