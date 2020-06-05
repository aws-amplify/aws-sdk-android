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
 * StAX marshaller for POJO SourceConfiguration
 */
class SourceConfigurationStaxMarshaller {

    public void marshall(SourceConfiguration _sourceConfiguration, Request<?> request,
            String _prefix) {
        String prefix;
        if (_sourceConfiguration.getApplicationName() != null) {
            prefix = _prefix + "ApplicationName";
            String applicationName = _sourceConfiguration.getApplicationName();
            request.addParameter(prefix, StringUtils.fromString(applicationName));
        }
        if (_sourceConfiguration.getTemplateName() != null) {
            prefix = _prefix + "TemplateName";
            String templateName = _sourceConfiguration.getTemplateName();
            request.addParameter(prefix, StringUtils.fromString(templateName));
        }
    }

    private static SourceConfigurationStaxMarshaller instance;

    public static SourceConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SourceConfigurationStaxMarshaller();
        return instance;
    }
}
