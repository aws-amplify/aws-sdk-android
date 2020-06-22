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
 * StAX request marshaller for CopyDBParameterGroupRequest
 */
public class CopyDBParameterGroupRequestMarshaller implements
        Marshaller<Request<CopyDBParameterGroupRequest>, CopyDBParameterGroupRequest> {

    public Request<CopyDBParameterGroupRequest> marshall(
            CopyDBParameterGroupRequest copyDBParameterGroupRequest) {
        if (copyDBParameterGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CopyDBParameterGroupRequest)");
        }

        Request<CopyDBParameterGroupRequest> request = new DefaultRequest<CopyDBParameterGroupRequest>(
                copyDBParameterGroupRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "CopyDBParameterGroup");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (copyDBParameterGroupRequest.getSourceDBParameterGroupIdentifier() != null) {
            prefix = "SourceDBParameterGroupIdentifier";
            String sourceDBParameterGroupIdentifier = copyDBParameterGroupRequest
                    .getSourceDBParameterGroupIdentifier();
            request.addParameter(prefix, StringUtils.fromString(sourceDBParameterGroupIdentifier));
        }
        if (copyDBParameterGroupRequest.getTargetDBParameterGroupIdentifier() != null) {
            prefix = "TargetDBParameterGroupIdentifier";
            String targetDBParameterGroupIdentifier = copyDBParameterGroupRequest
                    .getTargetDBParameterGroupIdentifier();
            request.addParameter(prefix, StringUtils.fromString(targetDBParameterGroupIdentifier));
        }
        if (copyDBParameterGroupRequest.getTargetDBParameterGroupDescription() != null) {
            prefix = "TargetDBParameterGroupDescription";
            String targetDBParameterGroupDescription = copyDBParameterGroupRequest
                    .getTargetDBParameterGroupDescription();
            request.addParameter(prefix, StringUtils.fromString(targetDBParameterGroupDescription));
        }
        if (copyDBParameterGroupRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = copyDBParameterGroupRequest.getTags();
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
