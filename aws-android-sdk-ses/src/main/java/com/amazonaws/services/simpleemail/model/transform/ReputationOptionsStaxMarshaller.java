/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ReputationOptions
 */
class ReputationOptionsStaxMarshaller {

    public void marshall(ReputationOptions _reputationOptions, Request<?> request, String _prefix) {
        String prefix;
        if (_reputationOptions.getSendingEnabled() != null) {
            prefix = _prefix + "SendingEnabled";
            Boolean sendingEnabled = _reputationOptions.getSendingEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(sendingEnabled));
        }
        if (_reputationOptions.getReputationMetricsEnabled() != null) {
            prefix = _prefix + "ReputationMetricsEnabled";
            Boolean reputationMetricsEnabled = _reputationOptions.getReputationMetricsEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(reputationMetricsEnabled));
        }
        if (_reputationOptions.getLastFreshStart() != null) {
            prefix = _prefix + "LastFreshStart";
            java.util.Date lastFreshStart = _reputationOptions.getLastFreshStart();
            request.addParameter(prefix, StringUtils.fromDate(lastFreshStart));
        }
    }

    private static ReputationOptionsStaxMarshaller instance;

    public static ReputationOptionsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ReputationOptionsStaxMarshaller();
        return instance;
    }
}
