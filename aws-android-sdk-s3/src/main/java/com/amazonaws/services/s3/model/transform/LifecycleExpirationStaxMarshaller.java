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
 * StAX marshaller for POJO LifecycleExpiration
 */
class LifecycleExpirationStaxMarshaller {

    public void marshall(LifecycleExpiration _lifecycleExpiration, Request<?> request,
            String _prefix) {
        String prefix;
        if (_lifecycleExpiration.getDate() != null) {
            prefix = _prefix + "Date";
            java.util.Date dateValue = _lifecycleExpiration.getDate();
            request.addParameter(prefix, StringUtils.fromDate(dateValue));
        }
        if (_lifecycleExpiration.getDays() != null) {
            prefix = _prefix + "Days";
            Integer days = _lifecycleExpiration.getDays();
            request.addParameter(prefix, StringUtils.fromInteger(days));
        }
        if (_lifecycleExpiration.getExpiredObjectDeleteMarker() != null) {
            prefix = _prefix + "ExpiredObjectDeleteMarker";
            Boolean expiredObjectDeleteMarker = _lifecycleExpiration.getExpiredObjectDeleteMarker();
            request.addParameter(prefix, StringUtils.fromBoolean(expiredObjectDeleteMarker));
        }
    }

    private static LifecycleExpirationStaxMarshaller instance;

    public static LifecycleExpirationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new LifecycleExpirationStaxMarshaller();
        return instance;
    }
}
