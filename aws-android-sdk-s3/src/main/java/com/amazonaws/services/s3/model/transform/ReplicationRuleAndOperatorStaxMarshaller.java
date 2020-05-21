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
 * StAX marshaller for POJO ReplicationRuleAndOperator
 */
class ReplicationRuleAndOperatorStaxMarshaller {

    public void marshall(ReplicationRuleAndOperator _replicationRuleAndOperator,
            Request<?> request, String _prefix) {
        String prefix;
        if (_replicationRuleAndOperator.getPrefix() != null) {
            prefix = _prefix + "Prefix";
            String prefix = _replicationRuleAndOperator.getPrefix();
            request.addParameter(prefix, StringUtils.fromString(prefix));
        }
        if (_replicationRuleAndOperator.getTags() != null) {
            prefix = _prefix + "Tag";
            java.util.List<Tag> tags = _replicationRuleAndOperator.getTags();
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

    private static ReplicationRuleAndOperatorStaxMarshaller instance;

    public static ReplicationRuleAndOperatorStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationRuleAndOperatorStaxMarshaller();
        return instance;
    }
}
