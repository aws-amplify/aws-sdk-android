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
 * StAX marshaller for POJO Export
 */
class ExportStaxMarshaller {

    public void marshall(Export _export, Request<?> request, String _prefix) {
        String prefix;
        if (_export.getExportingStackId() != null) {
            prefix = _prefix + "ExportingStackId";
            String exportingStackId = _export.getExportingStackId();
            request.addParameter(prefix, StringUtils.fromString(exportingStackId));
        }
        if (_export.getName() != null) {
            prefix = _prefix + "Name";
            String name = _export.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_export.getValue() != null) {
            prefix = _prefix + "Value";
            String value = _export.getValue();
            request.addParameter(prefix, StringUtils.fromString(value));
        }
    }

    private static ExportStaxMarshaller instance;

    public static ExportStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ExportStaxMarshaller();
        return instance;
    }
}
