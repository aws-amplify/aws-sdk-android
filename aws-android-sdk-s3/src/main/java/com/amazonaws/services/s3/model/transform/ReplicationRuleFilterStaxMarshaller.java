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
 * StAX marshaller for POJO ReplicationRuleFilter
 */
class ReplicationRuleFilterStaxMarshaller {

    public void marshall(ReplicationRuleFilter _replicationRuleFilter, Request<?> request,
            String _prefix) {
        String prefix;
        if (_replicationRuleFilter.getPrefix() != null) {
            prefix = _prefix + "Prefix";
            String prefix = _replicationRuleFilter.getPrefix();
            request.addParameter(prefix, StringUtils.fromString(prefix));
        }
        if (_replicationRuleFilter.getTag() != null) {
            prefix = _prefix + "Tag";
            Tag tag = _replicationRuleFilter.getTag();
            TagStaxMarshaller.getInstance().marshall(tag, request, prefix + ".");
        }
        if (_replicationRuleFilter.getAnd() != null) {
            prefix = _prefix + "And";
            ReplicationRuleAndOperator and = _replicationRuleFilter.getAnd();
            ReplicationRuleAndOperatorStaxMarshaller.getInstance().marshall(and, request,
                    prefix + ".");
        }
    }

    private static ReplicationRuleFilterStaxMarshaller instance;

    public static ReplicationRuleFilterStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationRuleFilterStaxMarshaller();
        return instance;
    }
}
