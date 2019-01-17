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
 * StAX marshaller for POJO Template
 */
class TemplateStaxMarshaller {

    public void marshall(Template _template, Request<?> request, String _prefix) {
        String prefix;
        if (_template.getTemplateName() != null) {
            prefix = _prefix + "TemplateName";
            String templateName = _template.getTemplateName();
            request.addParameter(prefix, StringUtils.fromString(templateName));
        }
        if (_template.getSubjectPart() != null) {
            prefix = _prefix + "SubjectPart";
            String subjectPart = _template.getSubjectPart();
            request.addParameter(prefix, StringUtils.fromString(subjectPart));
        }
        if (_template.getTextPart() != null) {
            prefix = _prefix + "TextPart";
            String textPart = _template.getTextPart();
            request.addParameter(prefix, StringUtils.fromString(textPart));
        }
        if (_template.getHtmlPart() != null) {
            prefix = _prefix + "HtmlPart";
            String htmlPart = _template.getHtmlPart();
            request.addParameter(prefix, StringUtils.fromString(htmlPart));
        }
    }

    private static TemplateStaxMarshaller instance;

    public static TemplateStaxMarshaller getInstance() {
        if (instance == null)
            instance = new TemplateStaxMarshaller();
        return instance;
    }
}
