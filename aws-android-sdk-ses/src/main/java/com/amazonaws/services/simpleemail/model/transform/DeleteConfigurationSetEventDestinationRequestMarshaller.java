/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DeleteConfigurationSetEventDestinationRequest
 */
public class DeleteConfigurationSetEventDestinationRequestMarshaller
        implements
        Marshaller<Request<DeleteConfigurationSetEventDestinationRequest>, DeleteConfigurationSetEventDestinationRequest> {

    public Request<DeleteConfigurationSetEventDestinationRequest> marshall(
            DeleteConfigurationSetEventDestinationRequest deleteConfigurationSetEventDestinationRequest) {
        if (deleteConfigurationSetEventDestinationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteConfigurationSetEventDestinationRequest)");
        }

        Request<DeleteConfigurationSetEventDestinationRequest> request = new DefaultRequest<DeleteConfigurationSetEventDestinationRequest>(
                deleteConfigurationSetEventDestinationRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "DeleteConfigurationSetEventDestination");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (deleteConfigurationSetEventDestinationRequest.getConfigurationSetName() != null) {
            prefix = "ConfigurationSetName";
            String configurationSetName = deleteConfigurationSetEventDestinationRequest
                    .getConfigurationSetName();
            request.addParameter(prefix, StringUtils.fromString(configurationSetName));
        }
        if (deleteConfigurationSetEventDestinationRequest.getEventDestinationName() != null) {
            prefix = "EventDestinationName";
            String eventDestinationName = deleteConfigurationSetEventDestinationRequest
                    .getEventDestinationName();
            request.addParameter(prefix, StringUtils.fromString(eventDestinationName));
        }

        return request;
    }
}
