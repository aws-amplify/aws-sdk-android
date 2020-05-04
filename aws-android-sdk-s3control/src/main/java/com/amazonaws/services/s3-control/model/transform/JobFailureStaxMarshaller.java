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
package com.amazonaws.services.s3-control.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3-control.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO JobFailure
 */
class JobFailureStaxMarshaller {

    public void marshall(JobFailure _jobFailure, Request<?> request, String _prefix) {
        String prefix;
        if (_jobFailure.getFailureCode() != null) {
            prefix = _prefix + "FailureCode";
            String failureCode = _jobFailure.getFailureCode();
            request.addParameter(prefix, StringUtils.fromString(failureCode));
        }
        if (_jobFailure.getFailureReason() != null) {
            prefix = _prefix + "FailureReason";
            String failureReason = _jobFailure.getFailureReason();
            request.addParameter(prefix, StringUtils.fromString(failureReason));
        }
    }

    private static JobFailureStaxMarshaller instance;
    public static JobFailureStaxMarshaller getInstance() {
        if (instance == null) instance = new JobFailureStaxMarshaller();
        return instance;
    }
}
