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
 * StAX marshaller for POJO EventDescription
 */
class EventDescriptionStaxMarshaller {

    public void marshall(EventDescription _eventDescription, Request<?> request, String _prefix) {
        String prefix;
        if (_eventDescription.getEventDate() != null) {
            prefix = _prefix + "EventDate";
            java.util.Date eventDate = _eventDescription.getEventDate();
            request.addParameter(prefix, StringUtils.fromDate(eventDate));
        }
        if (_eventDescription.getMessage() != null) {
            prefix = _prefix + "Message";
            String message = _eventDescription.getMessage();
            request.addParameter(prefix, StringUtils.fromString(message));
        }
        if (_eventDescription.getApplicationName() != null) {
            prefix = _prefix + "ApplicationName";
            String applicationName = _eventDescription.getApplicationName();
            request.addParameter(prefix, StringUtils.fromString(applicationName));
        }
        if (_eventDescription.getVersionLabel() != null) {
            prefix = _prefix + "VersionLabel";
            String versionLabel = _eventDescription.getVersionLabel();
            request.addParameter(prefix, StringUtils.fromString(versionLabel));
        }
        if (_eventDescription.getTemplateName() != null) {
            prefix = _prefix + "TemplateName";
            String templateName = _eventDescription.getTemplateName();
            request.addParameter(prefix, StringUtils.fromString(templateName));
        }
        if (_eventDescription.getEnvironmentName() != null) {
            prefix = _prefix + "EnvironmentName";
            String environmentName = _eventDescription.getEnvironmentName();
            request.addParameter(prefix, StringUtils.fromString(environmentName));
        }
        if (_eventDescription.getPlatformArn() != null) {
            prefix = _prefix + "PlatformArn";
            String platformArn = _eventDescription.getPlatformArn();
            request.addParameter(prefix, StringUtils.fromString(platformArn));
        }
        if (_eventDescription.getRequestId() != null) {
            prefix = _prefix + "RequestId";
            String requestId = _eventDescription.getRequestId();
            request.addParameter(prefix, StringUtils.fromString(requestId));
        }
        if (_eventDescription.getSeverity() != null) {
            prefix = _prefix + "Severity";
            String severity = _eventDescription.getSeverity();
            request.addParameter(prefix, StringUtils.fromString(severity));
        }
    }

    private static EventDescriptionStaxMarshaller instance;

    public static EventDescriptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new EventDescriptionStaxMarshaller();
        return instance;
    }
}
