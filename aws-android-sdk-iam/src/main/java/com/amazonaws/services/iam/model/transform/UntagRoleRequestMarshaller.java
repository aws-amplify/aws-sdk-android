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

package com.amazonaws.services.iam.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.iam.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for UntagRoleRequest
 */
public class UntagRoleRequestMarshaller implements
        Marshaller<Request<UntagRoleRequest>, UntagRoleRequest> {

    public Request<UntagRoleRequest> marshall(UntagRoleRequest untagRoleRequest) {
        if (untagRoleRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(UntagRoleRequest)");
        }

        Request<UntagRoleRequest> request = new DefaultRequest<UntagRoleRequest>(untagRoleRequest,
                "AWSIdentityandAccessManagement");
        request.addParameter("Action", "UntagRole");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (untagRoleRequest.getRoleName() != null) {
            prefix = "RoleName";
            String roleName = untagRoleRequest.getRoleName();
            request.addParameter(prefix, StringUtils.fromString(roleName));
        }
        if (untagRoleRequest.getTagKeys() != null) {
            prefix = "TagKeys";
            java.util.List<String> tagKeys = untagRoleRequest.getTagKeys();
            int tagKeysIndex = 1;
            String tagKeysPrefix = prefix;
            for (String tagKeysItem : tagKeys) {
                prefix = tagKeysPrefix + ".member." + tagKeysIndex;
                if (tagKeysItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(tagKeysItem));
                }
                tagKeysIndex++;
            }
            prefix = tagKeysPrefix;
        }

        return request;
    }
}
