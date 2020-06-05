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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ApplicationVersionLifecycleConfig
 */
class ApplicationVersionLifecycleConfigStaxMarshaller {

    public void marshall(ApplicationVersionLifecycleConfig _applicationVersionLifecycleConfig,
            Request<?> request, String _prefix) {
        String prefix;
        if (_applicationVersionLifecycleConfig.getMaxCountRule() != null) {
            prefix = _prefix + "MaxCountRule";
            MaxCountRule maxCountRule = _applicationVersionLifecycleConfig.getMaxCountRule();
            MaxCountRuleStaxMarshaller.getInstance().marshall(maxCountRule, request, prefix + ".");
        }
        if (_applicationVersionLifecycleConfig.getMaxAgeRule() != null) {
            prefix = _prefix + "MaxAgeRule";
            MaxAgeRule maxAgeRule = _applicationVersionLifecycleConfig.getMaxAgeRule();
            MaxAgeRuleStaxMarshaller.getInstance().marshall(maxAgeRule, request, prefix + ".");
        }
    }

    private static ApplicationVersionLifecycleConfigStaxMarshaller instance;

    public static ApplicationVersionLifecycleConfigStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationVersionLifecycleConfigStaxMarshaller();
        return instance;
    }
}
