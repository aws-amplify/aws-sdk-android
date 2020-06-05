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
 * StAX marshaller for POJO ResourceQuota
 */
class ResourceQuotaStaxMarshaller {

    public void marshall(ResourceQuota _resourceQuota, Request<?> request, String _prefix) {
        String prefix;
        if (_resourceQuota.getMaximum() != null) {
            prefix = _prefix + "Maximum";
            Integer maximum = _resourceQuota.getMaximum();
            request.addParameter(prefix, StringUtils.fromInteger(maximum));
        }
    }

    private static ResourceQuotaStaxMarshaller instance;

    public static ResourceQuotaStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceQuotaStaxMarshaller();
        return instance;
    }
}
