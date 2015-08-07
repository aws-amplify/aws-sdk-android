/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.auth.policy.conditions;

import static org.junit.Assert.assertEquals;

import com.amazonaws.auth.policy.Condition;
import com.amazonaws.auth.policy.conditions.StringCondition.StringComparisonType;
import com.amazonaws.services.s3.model.CannedAccessControlList;

import org.junit.Test;

public class S3ConditionFactoryTest {

    @Test
    public void testS3ConditionFactory() {
        CannedAccessControlList acl = CannedAccessControlList.Private;
        Condition c = S3ConditionFactory.newCannedACLCondition(acl);
        assertEquals(c.getType(), StringComparisonType.StringEquals.toString());
        assertEquals(c.getConditionKey(), "s3:x-amz-acl");
        assertEquals(c.getValues().get(0), acl.toString());
    }

}
