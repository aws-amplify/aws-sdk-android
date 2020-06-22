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
 * StAX request marshaller for CreateDBSnapshotRequest
 */
public class CreateDBSnapshotRequestMarshaller implements
        Marshaller<Request<CreateDBSnapshotRequest>, CreateDBSnapshotRequest> {

    public Request<CreateDBSnapshotRequest> marshall(CreateDBSnapshotRequest createDBSnapshotRequest) {
        if (createDBSnapshotRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateDBSnapshotRequest)");
        }

        Request<CreateDBSnapshotRequest> request = new DefaultRequest<CreateDBSnapshotRequest>(
                createDBSnapshotRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "CreateDBSnapshot");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (createDBSnapshotRequest.getDBSnapshotIdentifier() != null) {
            prefix = "DBSnapshotIdentifier";
            String dBSnapshotIdentifier = createDBSnapshotRequest.getDBSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBSnapshotIdentifier));
        }
        if (createDBSnapshotRequest.getDBInstanceIdentifier() != null) {
            prefix = "DBInstanceIdentifier";
            String dBInstanceIdentifier = createDBSnapshotRequest.getDBInstanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceIdentifier));
        }
        if (createDBSnapshotRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createDBSnapshotRequest.getTags();
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
