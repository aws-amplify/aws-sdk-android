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
 * StAX marshaller for POJO InstanceHealthSummary
 */
class InstanceHealthSummaryStaxMarshaller {

    public void marshall(InstanceHealthSummary _instanceHealthSummary, Request<?> request,
            String _prefix) {
        String prefix;
        if (_instanceHealthSummary.getNoData() != null) {
            prefix = _prefix + "NoData";
            Integer noData = _instanceHealthSummary.getNoData();
            request.addParameter(prefix, StringUtils.fromInteger(noData));
        }
        if (_instanceHealthSummary.getUnknown() != null) {
            prefix = _prefix + "Unknown";
            Integer unknown = _instanceHealthSummary.getUnknown();
            request.addParameter(prefix, StringUtils.fromInteger(unknown));
        }
        if (_instanceHealthSummary.getPending() != null) {
            prefix = _prefix + "Pending";
            Integer pending = _instanceHealthSummary.getPending();
            request.addParameter(prefix, StringUtils.fromInteger(pending));
        }
        if (_instanceHealthSummary.getOk() != null) {
            prefix = _prefix + "Ok";
            Integer ok = _instanceHealthSummary.getOk();
            request.addParameter(prefix, StringUtils.fromInteger(ok));
        }
        if (_instanceHealthSummary.getInfo() != null) {
            prefix = _prefix + "Info";
            Integer info = _instanceHealthSummary.getInfo();
            request.addParameter(prefix, StringUtils.fromInteger(info));
        }
        if (_instanceHealthSummary.getWarning() != null) {
            prefix = _prefix + "Warning";
            Integer warning = _instanceHealthSummary.getWarning();
            request.addParameter(prefix, StringUtils.fromInteger(warning));
        }
        if (_instanceHealthSummary.getDegraded() != null) {
            prefix = _prefix + "Degraded";
            Integer degraded = _instanceHealthSummary.getDegraded();
            request.addParameter(prefix, StringUtils.fromInteger(degraded));
        }
        if (_instanceHealthSummary.getSevere() != null) {
            prefix = _prefix + "Severe";
            Integer severe = _instanceHealthSummary.getSevere();
            request.addParameter(prefix, StringUtils.fromInteger(severe));
        }
    }

    private static InstanceHealthSummaryStaxMarshaller instance;

    public static InstanceHealthSummaryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceHealthSummaryStaxMarshaller();
        return instance;
    }
}
