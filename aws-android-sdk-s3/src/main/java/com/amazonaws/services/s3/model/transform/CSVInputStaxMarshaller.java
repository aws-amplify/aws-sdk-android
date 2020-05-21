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
 * StAX marshaller for POJO CSVInput
 */
class CSVInputStaxMarshaller {

    public void marshall(CSVInput _cSVInput, Request<?> request, String _prefix) {
        String prefix;
        if (_cSVInput.getFileHeaderInfo() != null) {
            prefix = _prefix + "FileHeaderInfo";
            String fileHeaderInfo = _cSVInput.getFileHeaderInfo();
            request.addParameter(prefix, StringUtils.fromString(fileHeaderInfo));
        }
        if (_cSVInput.getComments() != null) {
            prefix = _prefix + "Comments";
            String comments = _cSVInput.getComments();
            request.addParameter(prefix, StringUtils.fromString(comments));
        }
        if (_cSVInput.getQuoteEscapeCharacter() != null) {
            prefix = _prefix + "QuoteEscapeCharacter";
            String quoteEscapeCharacter = _cSVInput.getQuoteEscapeCharacter();
            request.addParameter(prefix, StringUtils.fromString(quoteEscapeCharacter));
        }
        if (_cSVInput.getRecordDelimiter() != null) {
            prefix = _prefix + "RecordDelimiter";
            String recordDelimiter = _cSVInput.getRecordDelimiter();
            request.addParameter(prefix, StringUtils.fromString(recordDelimiter));
        }
        if (_cSVInput.getFieldDelimiter() != null) {
            prefix = _prefix + "FieldDelimiter";
            String fieldDelimiter = _cSVInput.getFieldDelimiter();
            request.addParameter(prefix, StringUtils.fromString(fieldDelimiter));
        }
        if (_cSVInput.getQuoteCharacter() != null) {
            prefix = _prefix + "QuoteCharacter";
            String quoteCharacter = _cSVInput.getQuoteCharacter();
            request.addParameter(prefix, StringUtils.fromString(quoteCharacter));
        }
        if (_cSVInput.getAllowQuotedRecordDelimiter() != null) {
            prefix = _prefix + "AllowQuotedRecordDelimiter";
            Boolean allowQuotedRecordDelimiter = _cSVInput.getAllowQuotedRecordDelimiter();
            request.addParameter(prefix, StringUtils.fromBoolean(allowQuotedRecordDelimiter));
        }
    }

    private static CSVInputStaxMarshaller instance;

    public static CSVInputStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CSVInputStaxMarshaller();
        return instance;
    }
}
