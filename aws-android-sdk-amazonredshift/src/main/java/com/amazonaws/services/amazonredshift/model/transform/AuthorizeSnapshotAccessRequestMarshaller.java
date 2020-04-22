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
 * StAX request marshaller for AuthorizeSnapshotAccessRequest
 */
public class AuthorizeSnapshotAccessRequestMarshaller implements
        Marshaller<Request<AuthorizeSnapshotAccessRequest>, AuthorizeSnapshotAccessRequest> {

    public Request<AuthorizeSnapshotAccessRequest> marshall(
            AuthorizeSnapshotAccessRequest authorizeSnapshotAccessRequest) {
        if (authorizeSnapshotAccessRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(AuthorizeSnapshotAccessRequest)");
        }

        Request<AuthorizeSnapshotAccessRequest> request = new DefaultRequest<AuthorizeSnapshotAccessRequest>(
                authorizeSnapshotAccessRequest, "AmazonRedshift");
        request.addParameter("Action", "AuthorizeSnapshotAccess");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (authorizeSnapshotAccessRequest.getSnapshotIdentifier() != null) {
            prefix = "SnapshotIdentifier";
            String snapshotIdentifier = authorizeSnapshotAccessRequest.getSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(snapshotIdentifier));
        }
        if (authorizeSnapshotAccessRequest.getSnapshotClusterIdentifier() != null) {
            prefix = "SnapshotClusterIdentifier";
            String snapshotClusterIdentifier = authorizeSnapshotAccessRequest
                    .getSnapshotClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(snapshotClusterIdentifier));
        }
        if (authorizeSnapshotAccessRequest.getAccountWithRestoreAccess() != null) {
            prefix = "AccountWithRestoreAccess";
            String accountWithRestoreAccess = authorizeSnapshotAccessRequest
                    .getAccountWithRestoreAccess();
            request.addParameter(prefix, StringUtils.fromString(accountWithRestoreAccess));
        }

        return request;
    }
}
