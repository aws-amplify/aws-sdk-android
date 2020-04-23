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
 * StAX request marshaller for CopyOptionGroupRequest
 */
public class CopyOptionGroupRequestMarshaller implements
        Marshaller<Request<CopyOptionGroupRequest>, CopyOptionGroupRequest> {

    public Request<CopyOptionGroupRequest> marshall(CopyOptionGroupRequest copyOptionGroupRequest) {
        if (copyOptionGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CopyOptionGroupRequest)");
        }

        Request<CopyOptionGroupRequest> request = new DefaultRequest<CopyOptionGroupRequest>(
                copyOptionGroupRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "CopyOptionGroup");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (copyOptionGroupRequest.getSourceOptionGroupIdentifier() != null) {
            prefix = "SourceOptionGroupIdentifier";
            String sourceOptionGroupIdentifier = copyOptionGroupRequest
                    .getSourceOptionGroupIdentifier();
            request.addParameter(prefix, StringUtils.fromString(sourceOptionGroupIdentifier));
        }
        if (copyOptionGroupRequest.getTargetOptionGroupIdentifier() != null) {
            prefix = "TargetOptionGroupIdentifier";
            String targetOptionGroupIdentifier = copyOptionGroupRequest
                    .getTargetOptionGroupIdentifier();
            request.addParameter(prefix, StringUtils.fromString(targetOptionGroupIdentifier));
        }
        if (copyOptionGroupRequest.getTargetOptionGroupDescription() != null) {
            prefix = "TargetOptionGroupDescription";
            String targetOptionGroupDescription = copyOptionGroupRequest
                    .getTargetOptionGroupDescription();
            request.addParameter(prefix, StringUtils.fromString(targetOptionGroupDescription));
        }
        if (copyOptionGroupRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = copyOptionGroupRequest.getTags();
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
