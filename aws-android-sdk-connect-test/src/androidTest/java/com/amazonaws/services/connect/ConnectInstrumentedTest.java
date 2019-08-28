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

package com.amazonaws.services.connect;

import android.support.test.runner.AndroidJUnit4;

import com.amazonaws.services.connect.model.ListUsersRequest;
import com.amazonaws.services.connect.model.ListUsersResult;
import com.amazonaws.services.connect.model.UserSummary;
import com.amazonaws.testutils.AWSTestBase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ConnectInstrumentedTest extends AWSTestBase {

    private AmazonConnectClient connectClient;
    private String instanceId;
    private String adminUserName;

    private String TAG = ConnectInstrumentedTest.class.getSimpleName();

    @Before
    public void setUp() throws Exception {
        setUpCredentials();
        connectClient = new AmazonConnectClient(credentials);

        instanceId = getPackageConfigure("connect").getString("instanceId");
        adminUserName = getPackageConfigure("connect").getString("adminUserName");
    }

    @Test
    public void testListUsers() {
        ListUsersRequest listUsersRequest = new ListUsersRequest();
        listUsersRequest.setInstanceId(instanceId);
        ListUsersResult listUsersResult = connectClient.listUsers(listUsersRequest);

        assert listUsersResult.getUserSummaryList().size() > 0;
        List<String> userNames = new ArrayList<>();
        for (UserSummary userSummary : listUsersResult.getUserSummaryList()) {
            userNames.add(userSummary.getUsername());
        }

        assertTrue("UserSummaryList should have admin username.", userNames.contains(adminUserName));
    }
}
