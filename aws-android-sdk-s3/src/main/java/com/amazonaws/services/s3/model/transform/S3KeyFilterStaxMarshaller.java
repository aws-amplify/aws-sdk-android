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
 * StAX marshaller for POJO S3KeyFilter
 */
class S3KeyFilterStaxMarshaller {

    public void marshall(S3KeyFilter _s3KeyFilter, Request<?> request, String _prefix) {
        String prefix;
        if (_s3KeyFilter.getFilterRules() != null) {
            prefix = _prefix + "FilterRules";
            java.util.List<FilterRule> filterRules = _s3KeyFilter.getFilterRules();
            int filterRulesIndex = 1;
            String filterRulesPrefix = prefix;
            for (FilterRule filterRulesItem : filterRules) {
                prefix = filterRulesPrefix + ".member." + filterRulesIndex;
                if (filterRulesItem != null) {
                    FilterRuleStaxMarshaller.getInstance().marshall(filterRulesItem, request,
                            prefix + ".");
                }
                filterRulesIndex++;
            }
            prefix = filterRulesPrefix;
        }
    }

    private static S3KeyFilterStaxMarshaller instance;

    public static S3KeyFilterStaxMarshaller getInstance() {
        if (instance == null)
            instance = new S3KeyFilterStaxMarshaller();
        return instance;
    }
}
