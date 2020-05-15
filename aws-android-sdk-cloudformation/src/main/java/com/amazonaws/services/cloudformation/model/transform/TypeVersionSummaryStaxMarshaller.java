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

package com.amazonaws.services.cloudformation.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO TypeVersionSummary
 */
class TypeVersionSummaryStaxMarshaller {

    public void marshall(TypeVersionSummary _typeVersionSummary, Request<?> request, String _prefix) {
        String prefix;
        if (_typeVersionSummary.getType() != null) {
            prefix = _prefix + "Type";
            String type = _typeVersionSummary.getType();
            request.addParameter(prefix, StringUtils.fromString(type));
        }
        if (_typeVersionSummary.getTypeName() != null) {
            prefix = _prefix + "TypeName";
            String typeName = _typeVersionSummary.getTypeName();
            request.addParameter(prefix, StringUtils.fromString(typeName));
        }
        if (_typeVersionSummary.getVersionId() != null) {
            prefix = _prefix + "VersionId";
            String versionId = _typeVersionSummary.getVersionId();
            request.addParameter(prefix, StringUtils.fromString(versionId));
        }
        if (_typeVersionSummary.getIsDefaultVersion() != null) {
            prefix = _prefix + "IsDefaultVersion";
            Boolean isDefaultVersion = _typeVersionSummary.getIsDefaultVersion();
            request.addParameter(prefix, StringUtils.fromBoolean(isDefaultVersion));
        }
        if (_typeVersionSummary.getArn() != null) {
            prefix = _prefix + "Arn";
            String arn = _typeVersionSummary.getArn();
            request.addParameter(prefix, StringUtils.fromString(arn));
        }
        if (_typeVersionSummary.getTimeCreated() != null) {
            prefix = _prefix + "TimeCreated";
            java.util.Date timeCreated = _typeVersionSummary.getTimeCreated();
            request.addParameter(prefix, StringUtils.fromDate(timeCreated));
        }
        if (_typeVersionSummary.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _typeVersionSummary.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
    }

    private static TypeVersionSummaryStaxMarshaller instance;

    public static TypeVersionSummaryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new TypeVersionSummaryStaxMarshaller();
        return instance;
    }
}
