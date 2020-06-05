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
 * StAX marshaller for POJO MaxAgeRule
 */
class MaxAgeRuleStaxMarshaller {

    public void marshall(MaxAgeRule _maxAgeRule, Request<?> request, String _prefix) {
        String prefix;
        if (_maxAgeRule.getEnabled() != null) {
            prefix = _prefix + "Enabled";
            Boolean enabled = _maxAgeRule.getEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(enabled));
        }
        if (_maxAgeRule.getMaxAgeInDays() != null) {
            prefix = _prefix + "MaxAgeInDays";
            Integer maxAgeInDays = _maxAgeRule.getMaxAgeInDays();
            request.addParameter(prefix, StringUtils.fromInteger(maxAgeInDays));
        }
        if (_maxAgeRule.getDeleteSourceFromS3() != null) {
            prefix = _prefix + "DeleteSourceFromS3";
            Boolean deleteSourceFromS3 = _maxAgeRule.getDeleteSourceFromS3();
            request.addParameter(prefix, StringUtils.fromBoolean(deleteSourceFromS3));
        }
    }

    private static MaxAgeRuleStaxMarshaller instance;

    public static MaxAgeRuleStaxMarshaller getInstance() {
        if (instance == null)
            instance = new MaxAgeRuleStaxMarshaller();
        return instance;
    }
}
