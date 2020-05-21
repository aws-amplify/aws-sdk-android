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

package com.amazonaws.services.s3.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Transition
 */
class TransitionStaxMarshaller {

    public void marshall(Transition _transition, Request<?> request, String _prefix) {
        String prefix;
        if (_transition.getDate() != null) {
            prefix = _prefix + "Date";
            java.util.Date dateValue = _transition.getDate();
            request.addParameter(prefix, StringUtils.fromDate(dateValue));
        }
        if (_transition.getDays() != null) {
            prefix = _prefix + "Days";
            Integer days = _transition.getDays();
            request.addParameter(prefix, StringUtils.fromInteger(days));
        }
        if (_transition.getStorageClass() != null) {
            prefix = _prefix + "StorageClass";
            String storageClass = _transition.getStorageClass();
            request.addParameter(prefix, StringUtils.fromString(storageClass));
        }
    }

    private static TransitionStaxMarshaller instance;

    public static TransitionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new TransitionStaxMarshaller();
        return instance;
    }
}
