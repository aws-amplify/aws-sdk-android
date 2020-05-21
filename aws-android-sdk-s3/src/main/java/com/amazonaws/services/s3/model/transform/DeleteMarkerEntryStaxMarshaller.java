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

package com.amazonaws.services.s3.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO DeleteMarkerEntry
 */
class DeleteMarkerEntryStaxMarshaller {

    public void marshall(DeleteMarkerEntry _deleteMarkerEntry, Request<?> request, String _prefix) {
        String prefix;
        if (_deleteMarkerEntry.getOwner() != null) {
            prefix = _prefix + "Owner";
            Owner owner = _deleteMarkerEntry.getOwner();
            OwnerStaxMarshaller.getInstance().marshall(owner, request, prefix + ".");
        }
        if (_deleteMarkerEntry.getKey() != null) {
            prefix = _prefix + "Key";
            String key = _deleteMarkerEntry.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (_deleteMarkerEntry.getVersionId() != null) {
            prefix = _prefix + "VersionId";
            String versionId = _deleteMarkerEntry.getVersionId();
            request.addParameter(prefix, StringUtils.fromString(versionId));
        }
        if (_deleteMarkerEntry.getIsLatest() != null) {
            prefix = _prefix + "IsLatest";
            Boolean isLatest = _deleteMarkerEntry.getIsLatest();
            request.addParameter(prefix, StringUtils.fromBoolean(isLatest));
        }
        if (_deleteMarkerEntry.getLastModified() != null) {
            prefix = _prefix + "LastModified";
            java.util.Date lastModified = _deleteMarkerEntry.getLastModified();
            request.addParameter(prefix, StringUtils.fromDate(lastModified));
        }
    }

    private static DeleteMarkerEntryStaxMarshaller instance;

    public static DeleteMarkerEntryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DeleteMarkerEntryStaxMarshaller();
        return instance;
    }
}
