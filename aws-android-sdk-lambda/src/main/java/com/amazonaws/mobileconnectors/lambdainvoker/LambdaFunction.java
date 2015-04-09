/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.lambdainvoker;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation that can be used to declare a method to be proxied by Lambda
 * service.
 *
 * <pre>
 * <code>
 * public interface MyEchoFunction {
 *   {@literal @}LambdaFunction(functionName = "echo", invocationType = "RequestResponse")
 *   String echo(String str);
 * }
 * </code>
 * </pre>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LambdaFunction {

    /**
     * The name of the function to invoke for this annotated method. If not
     * explicitly assigned, we use the name of the interface method.
     */
    String functionName() default "";

    /**
     * The type of invocation to use (one of 'RequestResponse', 'Event', or
     * 'DryRun'). If not explicitly specified, we use 'RequestResponse' unless
     * the method's return type is void, in which case we use 'Event'.
     */
    String invocationType() default "RequestResponse";

    /**
     * The type of log to request from the service, either 'None' as default or
     * 'Tail'. If set to other than 'None', the invocation type will be
     * 'RequestResponse' regardless of any explicit setting.
     */
    String logType() default "None";
}
