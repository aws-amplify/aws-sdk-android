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
 * StAX marshaller for POJO LifecycleRuleAndOperator
 */
class LifecycleRuleAndOperatorStaxMarshaller {

    public void marshall(LifecycleRuleAndOperator _lifecycleRuleAndOperator, Request<?> request,
            String _prefix) {
        String prefix;
        if (_lifecycleRuleAndOperator.getPrefix() != null) {
            prefix = _prefix + "Prefix";
            String prefix = _lifecycleRuleAndOperator.getPrefix();
            request.addParameter(prefix, StringUtils.fromString(prefix));
        }
        if (_lifecycleRuleAndOperator.getTags() != null) {
            prefix = _prefix + "Tag";
            java.util.List<Tag> tags = _lifecycleRuleAndOperator.getTags();
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

    private static LifecycleRuleAndOperatorStaxMarshaller instance;

    public static LifecycleRuleAndOperatorStaxMarshaller getInstance() {
        if (instance == null)
            instance = new LifecycleRuleAndOperatorStaxMarshaller();
        return instance;
    }
}
