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

package com.amazonaws.services.simpleemail.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CreateConfigurationSetRequest
 */
public class CreateConfigurationSetRequestMarshaller implements
        Marshaller<Request<CreateConfigurationSetRequest>, CreateConfigurationSetRequest> {

    public Request<CreateConfigurationSetRequest> marshall(
            CreateConfigurationSetRequest createConfigurationSetRequest) {
        if (createConfigurationSetRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateConfigurationSetRequest)");
        }

        Request<CreateConfigurationSetRequest> request = new DefaultRequest<CreateConfigurationSetRequest>(
                createConfigurationSetRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "CreateConfigurationSet");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (createConfigurationSetRequest.getConfigurationSet() != null) {
            prefix = "ConfigurationSet";
            ConfigurationSet configurationSet = createConfigurationSetRequest.getConfigurationSet();
            ConfigurationSetStaxMarshaller.getInstance().marshall(configurationSet, request,
                    prefix + ".");
        }

        return request;
    }
}
