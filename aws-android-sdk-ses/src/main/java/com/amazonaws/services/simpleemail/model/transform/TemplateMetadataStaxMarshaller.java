/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO TemplateMetadata
 */
class TemplateMetadataStaxMarshaller {

    public void marshall(TemplateMetadata _templateMetadata, Request<?> request, String _prefix) {
        String prefix;
        if (_templateMetadata.getName() != null) {
            prefix = _prefix + "Name";
            String name = _templateMetadata.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_templateMetadata.getCreatedTimestamp() != null) {
            prefix = _prefix + "CreatedTimestamp";
            java.util.Date createdTimestamp = _templateMetadata.getCreatedTimestamp();
            request.addParameter(prefix, StringUtils.fromDate(createdTimestamp));
        }
    }

    private static TemplateMetadataStaxMarshaller instance;

    public static TemplateMetadataStaxMarshaller getInstance() {
        if (instance == null)
            instance = new TemplateMetadataStaxMarshaller();
        return instance;
    }
}
