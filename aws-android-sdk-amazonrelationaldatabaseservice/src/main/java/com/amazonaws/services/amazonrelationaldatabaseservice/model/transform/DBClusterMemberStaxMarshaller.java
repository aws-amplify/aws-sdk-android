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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO DBClusterMember
 */
class DBClusterMemberStaxMarshaller {

    public void marshall(DBClusterMember _dBClusterMember, Request<?> request, String _prefix) {
        String prefix;
        if (_dBClusterMember.getDBInstanceIdentifier() != null) {
            prefix = _prefix + "DBInstanceIdentifier";
            String dBInstanceIdentifier = _dBClusterMember.getDBInstanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceIdentifier));
        }
        if (_dBClusterMember.getIsClusterWriter() != null) {
            prefix = _prefix + "IsClusterWriter";
            Boolean isClusterWriter = _dBClusterMember.getIsClusterWriter();
            request.addParameter(prefix, StringUtils.fromBoolean(isClusterWriter));
        }
        if (_dBClusterMember.getDBClusterParameterGroupStatus() != null) {
            prefix = _prefix + "DBClusterParameterGroupStatus";
            String dBClusterParameterGroupStatus = _dBClusterMember
                    .getDBClusterParameterGroupStatus();
            request.addParameter(prefix, StringUtils.fromString(dBClusterParameterGroupStatus));
        }
        if (_dBClusterMember.getPromotionTier() != null) {
            prefix = _prefix + "PromotionTier";
            Integer promotionTier = _dBClusterMember.getPromotionTier();
            request.addParameter(prefix, StringUtils.fromInteger(promotionTier));
        }
    }

    private static DBClusterMemberStaxMarshaller instance;

    public static DBClusterMemberStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DBClusterMemberStaxMarshaller();
        return instance;
    }
}
