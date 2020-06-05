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
 * StAX marshaller for POJO OptionSpecification
 */
class OptionSpecificationStaxMarshaller {

    public void marshall(OptionSpecification _optionSpecification, Request<?> request,
            String _prefix) {
        String prefix;
        if (_optionSpecification.getResourceName() != null) {
            prefix = _prefix + "ResourceName";
            String resourceName = _optionSpecification.getResourceName();
            request.addParameter(prefix, StringUtils.fromString(resourceName));
        }
        if (_optionSpecification.getNamespace() != null) {
            prefix = _prefix + "Namespace";
            String namespace = _optionSpecification.getNamespace();
            request.addParameter(prefix, StringUtils.fromString(namespace));
        }
        if (_optionSpecification.getOptionName() != null) {
            prefix = _prefix + "OptionName";
            String optionName = _optionSpecification.getOptionName();
            request.addParameter(prefix, StringUtils.fromString(optionName));
        }
    }

    private static OptionSpecificationStaxMarshaller instance;

    public static OptionSpecificationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new OptionSpecificationStaxMarshaller();
        return instance;
    }
}
