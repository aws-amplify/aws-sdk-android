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
 * StAX marshaller for POJO InputSerialization
 */
class InputSerializationStaxMarshaller {

    public void marshall(InputSerialization _inputSerialization, Request<?> request, String _prefix) {
        String prefix;
        if (_inputSerialization.getCSV() != null) {
            prefix = _prefix + "CSV";
            CSVInput cSV = _inputSerialization.getCSV();
            CSVInputStaxMarshaller.getInstance().marshall(cSV, request, prefix + ".");
        }
        if (_inputSerialization.getCompressionType() != null) {
            prefix = _prefix + "CompressionType";
            String compressionType = _inputSerialization.getCompressionType();
            request.addParameter(prefix, StringUtils.fromString(compressionType));
        }
        if (_inputSerialization.getJSON() != null) {
            prefix = _prefix + "JSON";
            JSONInput jSON = _inputSerialization.getJSON();
            JSONInputStaxMarshaller.getInstance().marshall(jSON, request, prefix + ".");
        }
        if (_inputSerialization.getParquet() != null) {
            prefix = _prefix + "Parquet";
            ParquetInput parquet = _inputSerialization.getParquet();
            ParquetInputStaxMarshaller.getInstance().marshall(parquet, request, prefix + ".");
        }
    }

    private static InputSerializationStaxMarshaller instance;

    public static InputSerializationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new InputSerializationStaxMarshaller();
        return instance;
    }
}
