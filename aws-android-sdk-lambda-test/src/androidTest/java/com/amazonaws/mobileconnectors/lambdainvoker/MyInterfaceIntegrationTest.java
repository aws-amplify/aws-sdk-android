/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.lambdainvoker;


import android.support.test.InstrumentationRegistry;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.testutils.AWSTestBase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.robolectric.shadows.ShadowLog;

import java.util.Locale;

public class MyInterfaceIntegrationTest extends AWSTestBase {

    private static Locale LOCALE_DEFAULT = Locale.getDefault();
    private MyInterface myInterface;

    @Before
    public void setup() throws Exception {
        setUpCredentials();

        AWSCredentialsProvider provider = new StaticCredentialsProvider(credentials);
        LambdaInvokerFactory factory = new LambdaInvokerFactory(InstrumentationRegistry.getContext(), Regions.US_WEST_2,
                provider);
        LambdaDataBinder dataBinder = new LambdaJsonBinder();
        myInterface = factory.build(MyInterface.class, dataBinder);

        // redirect Android log
        ShadowLog.stream = System.out;
    }

    @After
    public void teardown() {
        Locale.setDefault(LOCALE_DEFAULT);
    }

    @Test
    public void testEcho() {
        NameInfo nameInfo = new NameInfo("Big", "Bird");

        NameInfo result = myInterface.echo(nameInfo);

        Assert.assertEquals(result.getFirstName(), nameInfo.getFirstName());
        Assert.assertEquals(result.getLastName(), nameInfo.getLastName());
    }

    @Test
    public void testEchoLocale() {
        Locale.setDefault(new Locale("tr", "TR"));
        NameInfo nameInfo = new NameInfo("Big", "Oğuzlar");

        NameInfo result = myInterface.echo(nameInfo);

        Assert.assertEquals(result.getFirstName(), nameInfo.getFirstName());
        Assert.assertEquals(result.getLastName(), nameInfo.getLastName());
    }

    @Test
    public void testNoEcho() {
        NameInfo nameInfo = new NameInfo("Big", "Bird");

        myInterface.noEcho(nameInfo);
    }

    @Test
    public void testEchoFirstName() {
        NameInfo nameInfo = new NameInfo("Oscar", "Grouch");

        String result = myInterface.echoFirst(nameInfo);

        Assert.assertEquals(result, nameInfo.getFirstName());
    }

    @Test
    public void testSilence() {
        myInterface.syncSilence();
    }

    @Test
    public void testVersion() {
        NameInfo nameInfo = new NameInfo("Oscar", "Grouch");

        String result = myInterface.echoFirstVersion(nameInfo);

        Assert.assertEquals("versioned result", result, "versioned: " + nameInfo.getFirstName());
    }

    @Test
    public void testAlias() {
        NameInfo nameInfo = new NameInfo("Oscar", "Grouch");

        String result = myInterface.echoFirstAlias(nameInfo);

        Assert.assertEquals("alias result", result, "alias: " + nameInfo.getFirstName());
    }

    @Test
    public void testEchoEventLogNone() {
        NameInfo nameInfo = new NameInfo("Oscar", "Grouch");

        myInterface.echoEventLogNone(nameInfo);
    }

    @Test
    public void testEchoEventLogTail() {
        NameInfo nameInfo = new NameInfo("Oscar", "Grouch");

        myInterface.echoEventLogTail(nameInfo);
    }
}
