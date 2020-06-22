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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ModifyOptionGroupRequest
 */
public class ModifyOptionGroupRequestMarshaller implements
        Marshaller<Request<ModifyOptionGroupRequest>, ModifyOptionGroupRequest> {

    public Request<ModifyOptionGroupRequest> marshall(
            ModifyOptionGroupRequest modifyOptionGroupRequest) {
        if (modifyOptionGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyOptionGroupRequest)");
        }

        Request<ModifyOptionGroupRequest> request = new DefaultRequest<ModifyOptionGroupRequest>(
                modifyOptionGroupRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "ModifyOptionGroup");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (modifyOptionGroupRequest.getOptionGroupName() != null) {
            prefix = "OptionGroupName";
            String optionGroupName = modifyOptionGroupRequest.getOptionGroupName();
            request.addParameter(prefix, StringUtils.fromString(optionGroupName));
        }
        if (modifyOptionGroupRequest.getOptionsToInclude() != null) {
            prefix = "OptionsToInclude";
            java.util.List<OptionConfiguration> optionsToInclude = modifyOptionGroupRequest
                    .getOptionsToInclude();
            int optionsToIncludeIndex = 1;
            String optionsToIncludePrefix = prefix;
            for (OptionConfiguration optionsToIncludeItem : optionsToInclude) {
                prefix = optionsToIncludePrefix + "." + optionsToIncludeIndex;
                if (optionsToIncludeItem != null) {
                    OptionConfigurationStaxMarshaller.getInstance().marshall(optionsToIncludeItem,
                            request, prefix + ".");
                }
                optionsToIncludeIndex++;
            }
            prefix = optionsToIncludePrefix;
        }
        if (modifyOptionGroupRequest.getOptionsToRemove() != null) {
            prefix = "OptionsToRemove";
            java.util.List<String> optionsToRemove = modifyOptionGroupRequest.getOptionsToRemove();
            int optionsToRemoveIndex = 1;
            String optionsToRemovePrefix = prefix;
            for (String optionsToRemoveItem : optionsToRemove) {
                prefix = optionsToRemovePrefix + ".member." + optionsToRemoveIndex;
                if (optionsToRemoveItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(optionsToRemoveItem));
                }
                optionsToRemoveIndex++;
            }
            prefix = optionsToRemovePrefix;
        }
        if (modifyOptionGroupRequest.getApplyImmediately() != null) {
            prefix = "ApplyImmediately";
            Boolean applyImmediately = modifyOptionGroupRequest.getApplyImmediately();
            request.addParameter(prefix, StringUtils.fromBoolean(applyImmediately));
        }

        return request;
    }
}
