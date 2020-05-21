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
 * StAX marshaller for POJO ServerSideEncryptionConfiguration
 */
class ServerSideEncryptionConfigurationStaxMarshaller {

    public void marshall(ServerSideEncryptionConfiguration _serverSideEncryptionConfiguration,
            Request<?> request, String _prefix) {
        String prefix;
        if (_serverSideEncryptionConfiguration.getRules() != null) {
            prefix = _prefix + "Rules";
            java.util.List<ServerSideEncryptionRule> rules = _serverSideEncryptionConfiguration
                    .getRules();
            int rulesIndex = 1;
            String rulesPrefix = prefix;
            for (ServerSideEncryptionRule rulesItem : rules) {
                prefix = rulesPrefix + ".member." + rulesIndex;
                if (rulesItem != null) {
                    ServerSideEncryptionRuleStaxMarshaller.getInstance().marshall(rulesItem,
                            request, prefix + ".");
                }
                rulesIndex++;
            }
            prefix = rulesPrefix;
        }
    }

    private static ServerSideEncryptionConfigurationStaxMarshaller instance;

    public static ServerSideEncryptionConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ServerSideEncryptionConfigurationStaxMarshaller();
        return instance;
    }
}
