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
 * StAX marshaller for POJO Output
 */
class OutputStaxMarshaller {

    public void marshall(Output _output, Request<?> request, String _prefix) {
        String prefix;
        if (_output.getOutputKey() != null) {
            prefix = _prefix + "OutputKey";
            String outputKey = _output.getOutputKey();
            request.addParameter(prefix, StringUtils.fromString(outputKey));
        }
        if (_output.getOutputValue() != null) {
            prefix = _prefix + "OutputValue";
            String outputValue = _output.getOutputValue();
            request.addParameter(prefix, StringUtils.fromString(outputValue));
        }
        if (_output.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _output.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_output.getExportName() != null) {
            prefix = _prefix + "ExportName";
            String exportName = _output.getExportName();
            request.addParameter(prefix, StringUtils.fromString(exportName));
        }
    }

    private static OutputStaxMarshaller instance;

    public static OutputStaxMarshaller getInstance() {
        if (instance == null)
            instance = new OutputStaxMarshaller();
        return instance;
    }
}
