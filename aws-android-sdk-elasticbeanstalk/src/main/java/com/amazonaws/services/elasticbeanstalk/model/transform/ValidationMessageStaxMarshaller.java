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
 * StAX marshaller for POJO ValidationMessage
 */
class ValidationMessageStaxMarshaller {

    public void marshall(ValidationMessage _validationMessage, Request<?> request, String _prefix) {
        String prefix;
        if (_validationMessage.getMessage() != null) {
            prefix = _prefix + "Message";
            String message = _validationMessage.getMessage();
            request.addParameter(prefix, StringUtils.fromString(message));
        }
        if (_validationMessage.getSeverity() != null) {
            prefix = _prefix + "Severity";
            String severity = _validationMessage.getSeverity();
            request.addParameter(prefix, StringUtils.fromString(severity));
        }
        if (_validationMessage.getNamespace() != null) {
            prefix = _prefix + "Namespace";
            String namespace = _validationMessage.getNamespace();
            request.addParameter(prefix, StringUtils.fromString(namespace));
        }
        if (_validationMessage.getOptionName() != null) {
            prefix = _prefix + "OptionName";
            String optionName = _validationMessage.getOptionName();
            request.addParameter(prefix, StringUtils.fromString(optionName));
        }
    }

    private static ValidationMessageStaxMarshaller instance;

    public static ValidationMessageStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ValidationMessageStaxMarshaller();
        return instance;
    }
}
