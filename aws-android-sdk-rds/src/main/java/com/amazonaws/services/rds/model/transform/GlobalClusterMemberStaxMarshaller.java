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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO GlobalClusterMember
 */
class GlobalClusterMemberStaxMarshaller {

    public void marshall(GlobalClusterMember _globalClusterMember, Request<?> request,
            String _prefix) {
        String prefix;
        if (_globalClusterMember.getDBClusterArn() != null) {
            prefix = _prefix + "DBClusterArn";
            String dBClusterArn = _globalClusterMember.getDBClusterArn();
            request.addParameter(prefix, StringUtils.fromString(dBClusterArn));
        }
        if (_globalClusterMember.getReaders() != null) {
            prefix = _prefix + "Readers";
            java.util.List<String> readers = _globalClusterMember.getReaders();
            int readersIndex = 1;
            String readersPrefix = prefix;
            for (String readersItem : readers) {
                prefix = readersPrefix + ".member." + readersIndex;
                if (readersItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(readersItem));
                }
                readersIndex++;
            }
            prefix = readersPrefix;
        }
        if (_globalClusterMember.getIsWriter() != null) {
            prefix = _prefix + "IsWriter";
            Boolean isWriter = _globalClusterMember.getIsWriter();
            request.addParameter(prefix, StringUtils.fromBoolean(isWriter));
        }
        if (_globalClusterMember.getGlobalWriteForwardingStatus() != null) {
            prefix = _prefix + "GlobalWriteForwardingStatus";
            String globalWriteForwardingStatus = _globalClusterMember
                    .getGlobalWriteForwardingStatus();
            request.addParameter(prefix, StringUtils.fromString(globalWriteForwardingStatus));
        }
    }

    private static GlobalClusterMemberStaxMarshaller instance;

    public static GlobalClusterMemberStaxMarshaller getInstance() {
        if (instance == null)
            instance = new GlobalClusterMemberStaxMarshaller();
        return instance;
    }
}
