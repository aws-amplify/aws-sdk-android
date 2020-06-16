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
 * StAX marshaller for POJO DistributionConfigWithTags
 */
class DistributionConfigWithTagsStaxMarshaller {

    public void marshall(DistributionConfigWithTags _distributionConfigWithTags,
            Request<?> request, String _prefix) {
        String prefix;
        if (_distributionConfigWithTags.getDistributionConfig() != null) {
            prefix = _prefix + "DistributionConfig";
            DistributionConfig distributionConfig = _distributionConfigWithTags
                    .getDistributionConfig();
            DistributionConfigStaxMarshaller.getInstance().marshall(distributionConfig, request,
                    prefix + ".");
        }
        if (_distributionConfigWithTags.getTags() != null) {
            prefix = _prefix + "Tags";
            Tags tags = _distributionConfigWithTags.getTags();
            TagsStaxMarshaller.getInstance().marshall(tags, request, prefix + ".");
        }
    }

    private static DistributionConfigWithTagsStaxMarshaller instance;

    public static DistributionConfigWithTagsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DistributionConfigWithTagsStaxMarshaller();
        return instance;
    }
}
