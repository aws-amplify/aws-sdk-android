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

package com.amazonaws.services.amazonroute53.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonroute53.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO HealthCheckObservation
 */
class HealthCheckObservationStaxMarshaller {

    public void marshall(HealthCheckObservation _healthCheckObservation, Request<?> request,
            String _prefix) {
        String prefix;
        if (_healthCheckObservation.getRegion() != null) {
            prefix = _prefix + "Region";
            String region = _healthCheckObservation.getRegion();
            request.addParameter(prefix, StringUtils.fromString(region));
        }
        if (_healthCheckObservation.getIPAddress() != null) {
            prefix = _prefix + "IPAddress";
            String iPAddress = _healthCheckObservation.getIPAddress();
            request.addParameter(prefix, StringUtils.fromString(iPAddress));
        }
        if (_healthCheckObservation.getStatusReport() != null) {
            prefix = _prefix + "StatusReport";
            StatusReport statusReport = _healthCheckObservation.getStatusReport();
            StatusReportStaxMarshaller.getInstance().marshall(statusReport, request, prefix + ".");
        }
    }

    private static HealthCheckObservationStaxMarshaller instance;

    public static HealthCheckObservationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new HealthCheckObservationStaxMarshaller();
        return instance;
    }
}
