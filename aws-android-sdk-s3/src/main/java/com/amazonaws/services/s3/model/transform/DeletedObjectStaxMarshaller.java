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
 * StAX marshaller for POJO DeletedObject
 */
class DeletedObjectStaxMarshaller {

    public void marshall(DeletedObject _deletedObject, Request<?> request, String _prefix) {
        String prefix;
        if (_deletedObject.getKey() != null) {
            prefix = _prefix + "Key";
            String key = _deletedObject.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (_deletedObject.getVersionId() != null) {
            prefix = _prefix + "VersionId";
            String versionId = _deletedObject.getVersionId();
            request.addParameter(prefix, StringUtils.fromString(versionId));
        }
        if (_deletedObject.getDeleteMarker() != null) {
            prefix = _prefix + "DeleteMarker";
            Boolean deleteMarker = _deletedObject.getDeleteMarker();
            request.addParameter(prefix, StringUtils.fromBoolean(deleteMarker));
        }
        if (_deletedObject.getDeleteMarkerVersionId() != null) {
            prefix = _prefix + "DeleteMarkerVersionId";
            String deleteMarkerVersionId = _deletedObject.getDeleteMarkerVersionId();
            request.addParameter(prefix, StringUtils.fromString(deleteMarkerVersionId));
        }
    }

    private static DeletedObjectStaxMarshaller instance;

    public static DeletedObjectStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DeletedObjectStaxMarshaller();
        return instance;
    }
}
