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
 * StAX marshaller for POJO LaunchTemplateSpecification
 */
class LaunchTemplateSpecificationStaxMarshaller {

    public void marshall(LaunchTemplateSpecification _launchTemplateSpecification,
            Request<?> request, String _prefix) {
        String prefix;
        if (_launchTemplateSpecification.getLaunchTemplateId() != null) {
            prefix = _prefix + "LaunchTemplateId";
            String launchTemplateId = _launchTemplateSpecification.getLaunchTemplateId();
            request.addParameter(prefix, StringUtils.fromString(launchTemplateId));
        }
        if (_launchTemplateSpecification.getLaunchTemplateName() != null) {
            prefix = _prefix + "LaunchTemplateName";
            String launchTemplateName = _launchTemplateSpecification.getLaunchTemplateName();
            request.addParameter(prefix, StringUtils.fromString(launchTemplateName));
        }
        if (_launchTemplateSpecification.getVersion() != null) {
            prefix = _prefix + "Version";
            String version = _launchTemplateSpecification.getVersion();
            request.addParameter(prefix, StringUtils.fromString(version));
        }
    }

    private static LaunchTemplateSpecificationStaxMarshaller instance;

    public static LaunchTemplateSpecificationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateSpecificationStaxMarshaller();
        return instance;
    }
}
