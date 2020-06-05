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
 * StAX marshaller for POJO PlatformFramework
 */
class PlatformFrameworkStaxMarshaller {

    public void marshall(PlatformFramework _platformFramework, Request<?> request, String _prefix) {
        String prefix;
        if (_platformFramework.getName() != null) {
            prefix = _prefix + "Name";
            String name = _platformFramework.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_platformFramework.getVersion() != null) {
            prefix = _prefix + "Version";
            String version = _platformFramework.getVersion();
            request.addParameter(prefix, StringUtils.fromString(version));
        }
    }

    private static PlatformFrameworkStaxMarshaller instance;

    public static PlatformFrameworkStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PlatformFrameworkStaxMarshaller();
        return instance;
    }
}
