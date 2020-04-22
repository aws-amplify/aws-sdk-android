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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ModifyClusterIamRolesRequest
 */
public class ModifyClusterIamRolesRequestMarshaller implements
        Marshaller<Request<ModifyClusterIamRolesRequest>, ModifyClusterIamRolesRequest> {

    public Request<ModifyClusterIamRolesRequest> marshall(
            ModifyClusterIamRolesRequest modifyClusterIamRolesRequest) {
        if (modifyClusterIamRolesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyClusterIamRolesRequest)");
        }

        Request<ModifyClusterIamRolesRequest> request = new DefaultRequest<ModifyClusterIamRolesRequest>(
                modifyClusterIamRolesRequest, "AmazonRedshift");
        request.addParameter("Action", "ModifyClusterIamRoles");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (modifyClusterIamRolesRequest.getClusterIdentifier() != null) {
            prefix = "ClusterIdentifier";
            String clusterIdentifier = modifyClusterIamRolesRequest.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (modifyClusterIamRolesRequest.getAddIamRoles() != null) {
            prefix = "AddIamRoles";
            java.util.List<String> addIamRoles = modifyClusterIamRolesRequest.getAddIamRoles();
            int addIamRolesIndex = 1;
            String addIamRolesPrefix = prefix;
            for (String addIamRolesItem : addIamRoles) {
                prefix = addIamRolesPrefix + "." + addIamRolesIndex;
                if (addIamRolesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(addIamRolesItem));
                }
                addIamRolesIndex++;
            }
            prefix = addIamRolesPrefix;
        }
        if (modifyClusterIamRolesRequest.getRemoveIamRoles() != null) {
            prefix = "RemoveIamRoles";
            java.util.List<String> removeIamRoles = modifyClusterIamRolesRequest
                    .getRemoveIamRoles();
            int removeIamRolesIndex = 1;
            String removeIamRolesPrefix = prefix;
            for (String removeIamRolesItem : removeIamRoles) {
                prefix = removeIamRolesPrefix + "." + removeIamRolesIndex;
                if (removeIamRolesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(removeIamRolesItem));
                }
                removeIamRolesIndex++;
            }
            prefix = removeIamRolesPrefix;
        }

        return request;
    }
}
