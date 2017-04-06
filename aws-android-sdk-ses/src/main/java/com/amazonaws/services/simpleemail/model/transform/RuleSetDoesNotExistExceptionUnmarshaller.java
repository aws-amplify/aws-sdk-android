/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import org.w3c.dom.Node;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.util.XpathUtils;
import com.amazonaws.transform.StandardErrorUnmarshaller;

import com.amazonaws.services.simpleemail.model.RuleSetDoesNotExistException;

public class RuleSetDoesNotExistExceptionUnmarshaller extends StandardErrorUnmarshaller {

    public RuleSetDoesNotExistExceptionUnmarshaller() {
        super(RuleSetDoesNotExistException.class);
    }

    public AmazonServiceException unmarshall(Node node) throws Exception {
        // Bail out if this isn't the right error code that this
        // marshaller understands.
        String errorCode = parseErrorCode(node);
        if (errorCode == null || !errorCode.equals("RuleSetDoesNotExist"))
            return null;

        RuleSetDoesNotExistException e = (RuleSetDoesNotExistException) super.unmarshall(node);
        e.setName(XpathUtils.asString(getErrorPropertyPath("Name"), node));

        return e;
    }
}
