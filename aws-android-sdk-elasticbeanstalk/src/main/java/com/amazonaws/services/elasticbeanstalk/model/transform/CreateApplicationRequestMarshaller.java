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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CreateApplicationRequest
 */
public class CreateApplicationRequestMarshaller implements
        Marshaller<Request<CreateApplicationRequest>, CreateApplicationRequest> {

    public Request<CreateApplicationRequest> marshall(
            CreateApplicationRequest createApplicationRequest) {
        if (createApplicationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateApplicationRequest)");
        }

        Request<CreateApplicationRequest> request = new DefaultRequest<CreateApplicationRequest>(
                createApplicationRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "CreateApplication");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (createApplicationRequest.getApplicationName() != null) {
            prefix = "ApplicationName";
            String applicationName = createApplicationRequest.getApplicationName();
            request.addParameter(prefix, StringUtils.fromString(applicationName));
        }
        if (createApplicationRequest.getDescription() != null) {
            prefix = "Description";
            String description = createApplicationRequest.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (createApplicationRequest.getResourceLifecycleConfig() != null) {
            prefix = "ResourceLifecycleConfig";
            ApplicationResourceLifecycleConfig resourceLifecycleConfig = createApplicationRequest
                    .getResourceLifecycleConfig();
            ApplicationResourceLifecycleConfigStaxMarshaller.getInstance().marshall(
                    resourceLifecycleConfig, request, prefix + ".");
        }
        if (createApplicationRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createApplicationRequest.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (Tag tagsItem : tags) {
                prefix = tagsPrefix + ".member." + tagsIndex;
                if (tagsItem != null) {
                    TagStaxMarshaller.getInstance().marshall(tagsItem, request, prefix + ".");
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }

        return request;
    }
}
