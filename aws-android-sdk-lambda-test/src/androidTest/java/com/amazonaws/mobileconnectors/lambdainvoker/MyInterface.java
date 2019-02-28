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

package com.amazonaws.mobileconnectors.lambdainvoker;


public interface MyInterface {

    @LambdaFunction
    NameInfo echo(NameInfo nameInfo);

    @LambdaFunction(functionName = "echo")
    void noEcho(NameInfo nameInfo);

    @LambdaFunction(logType = "Tail")
    String echoFirst(NameInfo nameInfo);

    @LambdaFunction(functionName = "echo", invocationType = "RequestResponse")
    void syncSilence();

    @LambdaFunction(functionName = "echoFirst", qualifier = "7")
    String echoFirstVersion(NameInfo nameInfo);

    @LambdaFunction(functionName = "echoFirst", qualifier = "alias")
    String echoFirstAlias(NameInfo nameInfo);

    @LambdaFunction(functionName = "echo", invocationType = "Event")
    void echoEventLogNone(NameInfo nameInfo);

    @LambdaFunction(functionName = "echo", invocationType = "Event", logType = "Tail")
    void echoEventLogTail(NameInfo nameInfo);
}
