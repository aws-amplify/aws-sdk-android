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
 * StAX marshaller for POJO UsageLimit
 */
class UsageLimitStaxMarshaller {

    public void marshall(UsageLimit _usageLimit, Request<?> request, String _prefix) {
        String prefix;
        if (_usageLimit.getUsageLimitId() != null) {
            prefix = _prefix + "UsageLimitId";
            String usageLimitId = _usageLimit.getUsageLimitId();
            request.addParameter(prefix, StringUtils.fromString(usageLimitId));
        }
        if (_usageLimit.getClusterIdentifier() != null) {
            prefix = _prefix + "ClusterIdentifier";
            String clusterIdentifier = _usageLimit.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (_usageLimit.getFeatureType() != null) {
            prefix = _prefix + "FeatureType";
            String featureType = _usageLimit.getFeatureType();
            request.addParameter(prefix, StringUtils.fromString(featureType));
        }
        if (_usageLimit.getLimitType() != null) {
            prefix = _prefix + "LimitType";
            String limitType = _usageLimit.getLimitType();
            request.addParameter(prefix, StringUtils.fromString(limitType));
        }
        if (_usageLimit.getAmount() != null) {
            prefix = _prefix + "Amount";
            Long amount = _usageLimit.getAmount();
            request.addParameter(prefix, StringUtils.fromLong(amount));
        }
        if (_usageLimit.getPeriod() != null) {
            prefix = _prefix + "Period";
            String period = _usageLimit.getPeriod();
            request.addParameter(prefix, StringUtils.fromString(period));
        }
        if (_usageLimit.getBreachAction() != null) {
            prefix = _prefix + "BreachAction";
            String breachAction = _usageLimit.getBreachAction();
            request.addParameter(prefix, StringUtils.fromString(breachAction));
        }
        if (_usageLimit.getTags() != null) {
            prefix = _prefix + "Tags";
            java.util.List<Tag> tags = _usageLimit.getTags();
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

    private static UsageLimitStaxMarshaller instance;

    public static UsageLimitStaxMarshaller getInstance() {
        if (instance == null)
            instance = new UsageLimitStaxMarshaller();
        return instance;
    }
}
