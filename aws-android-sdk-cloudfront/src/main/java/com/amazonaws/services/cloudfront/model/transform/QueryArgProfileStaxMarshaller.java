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
 * StAX marshaller for POJO QueryArgProfile
 */
class QueryArgProfileStaxMarshaller {

    public void marshall(QueryArgProfile _queryArgProfile, Request<?> request, String _prefix) {
        String prefix;
        if (_queryArgProfile.getQueryArg() != null) {
            prefix = _prefix + "QueryArg";
            String queryArg = _queryArgProfile.getQueryArg();
            request.addParameter(prefix, StringUtils.fromString(queryArg));
        }
        if (_queryArgProfile.getProfileId() != null) {
            prefix = _prefix + "ProfileId";
            String profileId = _queryArgProfile.getProfileId();
            request.addParameter(prefix, StringUtils.fromString(profileId));
        }
    }

    private static QueryArgProfileStaxMarshaller instance;

    public static QueryArgProfileStaxMarshaller getInstance() {
        if (instance == null)
            instance = new QueryArgProfileStaxMarshaller();
        return instance;
    }
}
