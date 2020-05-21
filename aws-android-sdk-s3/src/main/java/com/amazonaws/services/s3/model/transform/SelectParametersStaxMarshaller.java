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
 * StAX marshaller for POJO SelectParameters
 */
class SelectParametersStaxMarshaller {

    public void marshall(SelectParameters _selectParameters, Request<?> request, String _prefix) {
        String prefix;
        if (_selectParameters.getInputSerialization() != null) {
            prefix = _prefix + "InputSerialization";
            InputSerialization inputSerialization = _selectParameters.getInputSerialization();
            InputSerializationStaxMarshaller.getInstance().marshall(inputSerialization, request,
                    prefix + ".");
        }
        if (_selectParameters.getExpressionType() != null) {
            prefix = _prefix + "ExpressionType";
            String expressionType = _selectParameters.getExpressionType();
            request.addParameter(prefix, StringUtils.fromString(expressionType));
        }
        if (_selectParameters.getExpression() != null) {
            prefix = _prefix + "Expression";
            String expression = _selectParameters.getExpression();
            request.addParameter(prefix, StringUtils.fromString(expression));
        }
        if (_selectParameters.getOutputSerialization() != null) {
            prefix = _prefix + "OutputSerialization";
            OutputSerialization outputSerialization = _selectParameters.getOutputSerialization();
            OutputSerializationStaxMarshaller.getInstance().marshall(outputSerialization, request,
                    prefix + ".");
        }
    }

    private static SelectParametersStaxMarshaller instance;

    public static SelectParametersStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SelectParametersStaxMarshaller();
        return instance;
    }
}
