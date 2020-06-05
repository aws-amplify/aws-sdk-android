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
 * StAX marshaller for POJO Instance
 */
class InstanceStaxMarshaller {

    public void marshall(Instance _instance, Request<?> request, String _prefix) {
        String prefix;
        if (_instance.getId() != null) {
            prefix = _prefix + "Id";
            String id = _instance.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
    }

    private static InstanceStaxMarshaller instance;

    public static InstanceStaxMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceStaxMarshaller();
        return instance;
    }
}
