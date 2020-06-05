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
 * StAX marshaller for POJO ContentTypeProfileConfig
 */
class ContentTypeProfileConfigStaxMarshaller {

    public void marshall(ContentTypeProfileConfig _contentTypeProfileConfig, Request<?> request,
            String _prefix) {
        String prefix;
        if (_contentTypeProfileConfig.getForwardWhenContentTypeIsUnknown() != null) {
            prefix = _prefix + "ForwardWhenContentTypeIsUnknown";
            Boolean forwardWhenContentTypeIsUnknown = _contentTypeProfileConfig
                    .getForwardWhenContentTypeIsUnknown();
            request.addParameter(prefix, StringUtils.fromBoolean(forwardWhenContentTypeIsUnknown));
        }
        if (_contentTypeProfileConfig.getContentTypeProfiles() != null) {
            prefix = _prefix + "ContentTypeProfiles";
            ContentTypeProfiles contentTypeProfiles = _contentTypeProfileConfig
                    .getContentTypeProfiles();
            ContentTypeProfilesStaxMarshaller.getInstance().marshall(contentTypeProfiles, request,
                    prefix + ".");
        }
    }

    private static ContentTypeProfileConfigStaxMarshaller instance;

    public static ContentTypeProfileConfigStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ContentTypeProfileConfigStaxMarshaller();
        return instance;
    }
}
