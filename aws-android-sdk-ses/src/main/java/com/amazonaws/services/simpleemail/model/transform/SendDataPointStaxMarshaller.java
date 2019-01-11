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
 * StAX marshaller for POJO SendDataPoint
 */
class SendDataPointStaxMarshaller {

    public void marshall(SendDataPoint _sendDataPoint, Request<?> request, String _prefix) {
        String prefix;
        if (_sendDataPoint.getTimestamp() != null) {
            prefix = _prefix + "Timestamp";
            java.util.Date timestamp = _sendDataPoint.getTimestamp();
            request.addParameter(prefix, StringUtils.fromDate(timestamp));
        }
        if (_sendDataPoint.getDeliveryAttempts() != null) {
            prefix = _prefix + "DeliveryAttempts";
            Long deliveryAttempts = _sendDataPoint.getDeliveryAttempts();
            request.addParameter(prefix, StringUtils.fromLong(deliveryAttempts));
        }
        if (_sendDataPoint.getBounces() != null) {
            prefix = _prefix + "Bounces";
            Long bounces = _sendDataPoint.getBounces();
            request.addParameter(prefix, StringUtils.fromLong(bounces));
        }
        if (_sendDataPoint.getComplaints() != null) {
            prefix = _prefix + "Complaints";
            Long complaints = _sendDataPoint.getComplaints();
            request.addParameter(prefix, StringUtils.fromLong(complaints));
        }
        if (_sendDataPoint.getRejects() != null) {
            prefix = _prefix + "Rejects";
            Long rejects = _sendDataPoint.getRejects();
            request.addParameter(prefix, StringUtils.fromLong(rejects));
        }
    }

    private static SendDataPointStaxMarshaller instance;

    public static SendDataPointStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SendDataPointStaxMarshaller();
        return instance;
    }
}
