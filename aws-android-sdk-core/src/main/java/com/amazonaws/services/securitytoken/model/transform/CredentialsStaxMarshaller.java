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

package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.securitytoken.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Credentials
 */
class CredentialsStaxMarshaller {

    public void marshall(Credentials _credentials, Request<?> request, String _prefix) {
        String prefix;
        if (_credentials.getAccessKeyId() != null) {
            prefix = _prefix + "AccessKeyId";
            String accessKeyId = _credentials.getAccessKeyId();
            request.addParameter(prefix, StringUtils.fromString(accessKeyId));
        }
        if (_credentials.getSecretAccessKey() != null) {
            prefix = _prefix + "SecretAccessKey";
            String secretAccessKey = _credentials.getSecretAccessKey();
            request.addParameter(prefix, StringUtils.fromString(secretAccessKey));
        }
        if (_credentials.getSessionToken() != null) {
            prefix = _prefix + "SessionToken";
            String sessionToken = _credentials.getSessionToken();
            request.addParameter(prefix, StringUtils.fromString(sessionToken));
        }
        if (_credentials.getExpiration() != null) {
            prefix = _prefix + "Expiration";
            java.util.Date expiration = _credentials.getExpiration();
            request.addParameter(prefix, StringUtils.fromDate(expiration));
        }
    }

    private static CredentialsStaxMarshaller instance;

    public static CredentialsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CredentialsStaxMarshaller();
        return instance;
    }
}
