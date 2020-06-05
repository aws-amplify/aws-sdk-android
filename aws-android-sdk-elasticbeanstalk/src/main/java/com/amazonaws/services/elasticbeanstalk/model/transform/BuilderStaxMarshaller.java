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
 * StAX marshaller for POJO Builder
 */
class BuilderStaxMarshaller {

    public void marshall(Builder _builder, Request<?> request, String _prefix) {
        String prefix;
        if (_builder.getARN() != null) {
            prefix = _prefix + "ARN";
            String aRN = _builder.getARN();
            request.addParameter(prefix, StringUtils.fromString(aRN));
        }
    }

    private static BuilderStaxMarshaller instance;

    public static BuilderStaxMarshaller getInstance() {
        if (instance == null)
            instance = new BuilderStaxMarshaller();
        return instance;
    }
}
