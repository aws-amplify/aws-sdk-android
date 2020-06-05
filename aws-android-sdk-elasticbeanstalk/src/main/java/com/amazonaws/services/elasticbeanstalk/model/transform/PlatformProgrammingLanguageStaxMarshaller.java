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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO PlatformProgrammingLanguage
 */
class PlatformProgrammingLanguageStaxMarshaller {

    public void marshall(PlatformProgrammingLanguage _platformProgrammingLanguage,
            Request<?> request, String _prefix) {
        String prefix;
        if (_platformProgrammingLanguage.getName() != null) {
            prefix = _prefix + "Name";
            String name = _platformProgrammingLanguage.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_platformProgrammingLanguage.getVersion() != null) {
            prefix = _prefix + "Version";
            String version = _platformProgrammingLanguage.getVersion();
            request.addParameter(prefix, StringUtils.fromString(version));
        }
    }

    private static PlatformProgrammingLanguageStaxMarshaller instance;

    public static PlatformProgrammingLanguageStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PlatformProgrammingLanguageStaxMarshaller();
        return instance;
    }
}
