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
 * StAX marshaller for POJO CSVOutput
 */
class CSVOutputStaxMarshaller {

    public void marshall(CSVOutput _cSVOutput, Request<?> request, String _prefix) {
        String prefix;
        if (_cSVOutput.getQuoteFields() != null) {
            prefix = _prefix + "QuoteFields";
            String quoteFields = _cSVOutput.getQuoteFields();
            request.addParameter(prefix, StringUtils.fromString(quoteFields));
        }
        if (_cSVOutput.getQuoteEscapeCharacter() != null) {
            prefix = _prefix + "QuoteEscapeCharacter";
            String quoteEscapeCharacter = _cSVOutput.getQuoteEscapeCharacter();
            request.addParameter(prefix, StringUtils.fromString(quoteEscapeCharacter));
        }
        if (_cSVOutput.getRecordDelimiter() != null) {
            prefix = _prefix + "RecordDelimiter";
            String recordDelimiter = _cSVOutput.getRecordDelimiter();
            request.addParameter(prefix, StringUtils.fromString(recordDelimiter));
        }
        if (_cSVOutput.getFieldDelimiter() != null) {
            prefix = _prefix + "FieldDelimiter";
            String fieldDelimiter = _cSVOutput.getFieldDelimiter();
            request.addParameter(prefix, StringUtils.fromString(fieldDelimiter));
        }
        if (_cSVOutput.getQuoteCharacter() != null) {
            prefix = _prefix + "QuoteCharacter";
            String quoteCharacter = _cSVOutput.getQuoteCharacter();
            request.addParameter(prefix, StringUtils.fromString(quoteCharacter));
        }
    }

    private static CSVOutputStaxMarshaller instance;

    public static CSVOutputStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CSVOutputStaxMarshaller();
        return instance;
    }
}
