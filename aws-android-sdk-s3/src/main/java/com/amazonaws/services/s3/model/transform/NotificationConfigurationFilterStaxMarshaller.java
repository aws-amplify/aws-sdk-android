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
 * StAX marshaller for POJO NotificationConfigurationFilter
 */
class NotificationConfigurationFilterStaxMarshaller {

    public void marshall(NotificationConfigurationFilter _notificationConfigurationFilter,
            Request<?> request, String _prefix) {
        String prefix;
        if (_notificationConfigurationFilter.getKey() != null) {
            prefix = _prefix + "S3Key";
            S3KeyFilter key = _notificationConfigurationFilter.getKey();
            S3KeyFilterStaxMarshaller.getInstance().marshall(key, request, prefix + ".");
        }
    }

    private static NotificationConfigurationFilterStaxMarshaller instance;

    public static NotificationConfigurationFilterStaxMarshaller getInstance() {
        if (instance == null)
            instance = new NotificationConfigurationFilterStaxMarshaller();
        return instance;
    }
}
