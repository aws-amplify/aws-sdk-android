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

/**
 * This package provides features to invoke a Lambda function via dynamic proxy.
 * One can define a standard Java method in an interface, and then get a proxied
 * object by calling LambdaInvokerFactory.build.
 *
 * <pre>
 * <code>
 * // define a method echo in MyEchoFunction
 * public interface MyEchoFunction {
 *   // specify the Lambda function name and invocation type
 *   {@literal @}LambdaFunction(functionName = "echo", invocationType = "RequestResponse")
 *   String echo(String str);
 * }
 *
 * // creates an invocation factory
 * LambdaInvokerFactory factory = new LambdaInvokerFactory(context,
 *     Regions.US_WEST_2, provider);
 *
 * // create a proxied object of MyEchoFunction
 * MyEchoFunction echoFunction = factory.build(MyEchoFunction.class,
 *     new LambdaJsonBinder());
 *
 * // invoke it just like a regular method
 * String echo = echoFunction.echo("Hello world!");
 * </code>
 * </pre>
 */

package com.amazonaws.mobileconnectors.lambdainvoker;
