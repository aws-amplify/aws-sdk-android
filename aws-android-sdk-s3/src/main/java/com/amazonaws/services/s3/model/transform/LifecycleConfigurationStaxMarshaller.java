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
 * StAX marshaller for POJO LifecycleConfiguration
 */
class LifecycleConfigurationStaxMarshaller {

    public void marshall(LifecycleConfiguration _lifecycleConfiguration, Request<?> request,
            String _prefix) {
        String prefix;
        if (_lifecycleConfiguration.getRules() != null) {
            prefix = _prefix + "Rules";
            java.util.List<Rule> rules = _lifecycleConfiguration.getRules();
            int rulesIndex = 1;
            String rulesPrefix = prefix;
            for (Rule rulesItem : rules) {
                prefix = rulesPrefix + ".member." + rulesIndex;
                if (rulesItem != null) {
                    RuleStaxMarshaller.getInstance().marshall(rulesItem, request, prefix + ".");
                }
                rulesIndex++;
            }
            prefix = rulesPrefix;
        }
    }

    private static LifecycleConfigurationStaxMarshaller instance;

    public static LifecycleConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new LifecycleConfigurationStaxMarshaller();
        return instance;
    }
}
