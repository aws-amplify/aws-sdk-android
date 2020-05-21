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
 * StAX marshaller for POJO OutputSerialization
 */
class OutputSerializationStaxMarshaller {

    public void marshall(OutputSerialization _outputSerialization, Request<?> request,
            String _prefix) {
        String prefix;
        if (_outputSerialization.getCSV() != null) {
            prefix = _prefix + "CSV";
            CSVOutput cSV = _outputSerialization.getCSV();
            CSVOutputStaxMarshaller.getInstance().marshall(cSV, request, prefix + ".");
        }
        if (_outputSerialization.getJSON() != null) {
            prefix = _prefix + "JSON";
            JSONOutput jSON = _outputSerialization.getJSON();
            JSONOutputStaxMarshaller.getInstance().marshall(jSON, request, prefix + ".");
        }
    }

    private static OutputSerializationStaxMarshaller instance;

    public static OutputSerializationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new OutputSerializationStaxMarshaller();
        return instance;
    }
}
