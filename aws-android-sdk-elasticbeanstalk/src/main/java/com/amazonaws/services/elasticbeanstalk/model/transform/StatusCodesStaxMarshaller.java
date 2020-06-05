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
 * StAX marshaller for POJO StatusCodes
 */
class StatusCodesStaxMarshaller {

    public void marshall(StatusCodes _statusCodes, Request<?> request, String _prefix) {
        String prefix;
        if (_statusCodes.getStatus2xx() != null) {
            prefix = _prefix + "Status2xx";
            Integer status2xx = _statusCodes.getStatus2xx();
            request.addParameter(prefix, StringUtils.fromInteger(status2xx));
        }
        if (_statusCodes.getStatus3xx() != null) {
            prefix = _prefix + "Status3xx";
            Integer status3xx = _statusCodes.getStatus3xx();
            request.addParameter(prefix, StringUtils.fromInteger(status3xx));
        }
        if (_statusCodes.getStatus4xx() != null) {
            prefix = _prefix + "Status4xx";
            Integer status4xx = _statusCodes.getStatus4xx();
            request.addParameter(prefix, StringUtils.fromInteger(status4xx));
        }
        if (_statusCodes.getStatus5xx() != null) {
            prefix = _prefix + "Status5xx";
            Integer status5xx = _statusCodes.getStatus5xx();
            request.addParameter(prefix, StringUtils.fromInteger(status5xx));
        }
    }

    private static StatusCodesStaxMarshaller instance;

    public static StatusCodesStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StatusCodesStaxMarshaller();
        return instance;
    }
}
