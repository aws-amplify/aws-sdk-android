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
 * StAX marshaller for POJO Body
 */
class BodyStaxMarshaller {

    public void marshall(Body _body, Request<?> request, String _prefix) {
        String prefix;
        if (_body.getText() != null) {
            prefix = _prefix + "Text";
            Content text = _body.getText();
            ContentStaxMarshaller.getInstance().marshall(text, request, prefix + ".");
        }
        if (_body.getHtml() != null) {
            prefix = _prefix + "Html";
            Content html = _body.getHtml();
            ContentStaxMarshaller.getInstance().marshall(html, request, prefix + ".");
        }
    }

    private static BodyStaxMarshaller instance;

    public static BodyStaxMarshaller getInstance() {
        if (instance == null)
            instance = new BodyStaxMarshaller();
        return instance;
    }
}
