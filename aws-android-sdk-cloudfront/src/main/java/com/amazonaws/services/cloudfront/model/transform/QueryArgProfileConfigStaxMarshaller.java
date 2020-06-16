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

package com.amazonaws.services.cloudfront.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO QueryArgProfileConfig
 */
class QueryArgProfileConfigStaxMarshaller {

    public void marshall(QueryArgProfileConfig _queryArgProfileConfig, Request<?> request,
            String _prefix) {
        String prefix;
        if (_queryArgProfileConfig.getForwardWhenQueryArgProfileIsUnknown() != null) {
            prefix = _prefix + "ForwardWhenQueryArgProfileIsUnknown";
            Boolean forwardWhenQueryArgProfileIsUnknown = _queryArgProfileConfig
                    .getForwardWhenQueryArgProfileIsUnknown();
            request.addParameter(prefix,
                    StringUtils.fromBoolean(forwardWhenQueryArgProfileIsUnknown));
        }
        if (_queryArgProfileConfig.getQueryArgProfiles() != null) {
            prefix = _prefix + "QueryArgProfiles";
            QueryArgProfiles queryArgProfiles = _queryArgProfileConfig.getQueryArgProfiles();
            QueryArgProfilesStaxMarshaller.getInstance().marshall(queryArgProfiles, request,
                    prefix + ".");
        }
    }

    private static QueryArgProfileConfigStaxMarshaller instance;

    public static QueryArgProfileConfigStaxMarshaller getInstance() {
        if (instance == null)
            instance = new QueryArgProfileConfigStaxMarshaller();
        return instance;
    }
}
