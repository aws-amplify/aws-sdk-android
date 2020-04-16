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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CreateOptionGroupRequest
 */
public class CreateOptionGroupRequestMarshaller implements
        Marshaller<Request<CreateOptionGroupRequest>, CreateOptionGroupRequest> {

    public Request<CreateOptionGroupRequest> marshall(
            CreateOptionGroupRequest createOptionGroupRequest) {
        if (createOptionGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateOptionGroupRequest)");
        }

        Request<CreateOptionGroupRequest> request = new DefaultRequest<CreateOptionGroupRequest>(
                createOptionGroupRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "CreateOptionGroup");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (createOptionGroupRequest.getOptionGroupName() != null) {
            prefix = "OptionGroupName";
            String optionGroupName = createOptionGroupRequest.getOptionGroupName();
            request.addParameter(prefix, StringUtils.fromString(optionGroupName));
        }
        if (createOptionGroupRequest.getEngineName() != null) {
            prefix = "EngineName";
            String engineName = createOptionGroupRequest.getEngineName();
            request.addParameter(prefix, StringUtils.fromString(engineName));
        }
        if (createOptionGroupRequest.getMajorEngineVersion() != null) {
            prefix = "MajorEngineVersion";
            String majorEngineVersion = createOptionGroupRequest.getMajorEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(majorEngineVersion));
        }
        if (createOptionGroupRequest.getOptionGroupDescription() != null) {
            prefix = "OptionGroupDescription";
            String optionGroupDescription = createOptionGroupRequest.getOptionGroupDescription();
            request.addParameter(prefix, StringUtils.fromString(optionGroupDescription));
        }
        if (createOptionGroupRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createOptionGroupRequest.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (Tag tagsItem : tags) {
                prefix = tagsPrefix + "." + tagsIndex;
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
