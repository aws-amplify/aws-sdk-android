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

package com.amazonaws.services.autoscaling.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO FailedScheduledUpdateGroupActionRequest
 */
class FailedScheduledUpdateGroupActionRequestStaxMarshaller {

    public void marshall(
            FailedScheduledUpdateGroupActionRequest _failedScheduledUpdateGroupActionRequest,
            Request<?> request, String _prefix) {
        String prefix;
        if (_failedScheduledUpdateGroupActionRequest.getScheduledActionName() != null) {
            prefix = _prefix + "ScheduledActionName";
            String scheduledActionName = _failedScheduledUpdateGroupActionRequest
                    .getScheduledActionName();
            request.addParameter(prefix, StringUtils.fromString(scheduledActionName));
        }
        if (_failedScheduledUpdateGroupActionRequest.getErrorCode() != null) {
            prefix = _prefix + "ErrorCode";
            String errorCode = _failedScheduledUpdateGroupActionRequest.getErrorCode();
            request.addParameter(prefix, StringUtils.fromString(errorCode));
        }
        if (_failedScheduledUpdateGroupActionRequest.getErrorMessage() != null) {
            prefix = _prefix + "ErrorMessage";
            String errorMessage = _failedScheduledUpdateGroupActionRequest.getErrorMessage();
            request.addParameter(prefix, StringUtils.fromString(errorMessage));
        }
    }

    private static FailedScheduledUpdateGroupActionRequestStaxMarshaller instance;

    public static FailedScheduledUpdateGroupActionRequestStaxMarshaller getInstance() {
        if (instance == null)
            instance = new FailedScheduledUpdateGroupActionRequestStaxMarshaller();
        return instance;
    }
}
