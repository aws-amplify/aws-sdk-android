/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import android.content.Context;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.mobileconnectors.util.ClientContext;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.lambda.AWSLambda;
import com.amazonaws.services.lambda.AWSLambdaClient;

import java.lang.reflect.Proxy;

/**
 * A factory class that creates a dynamic proxy object backed by Lambda service.
 */
public class LambdaInvokerFactory {

    // -------------------------------------------------------------
    // Methods - Public - Static
    // -------------------------------------------------------------

    private final AWSLambda lambda;
    private final ClientContext clientContext;

    /**
     * Constructs a Lambda invoker factory object.
     *
     * @param context context of the app. A client context will be created from
     *            the given context.
     * @param region region of Lambda service
     * @param provider a AWS credentials provider
     */
    public LambdaInvokerFactory(Context context, Regions region, AWSCredentialsProvider provider) {
        this(context, region, provider, new ClientConfiguration());
    }

    /**
     * Constructs a Lambda invoker factory object. If your Lambda function takes
     * a long time to finish (longer than the default socket timeout of 15
     * seconds), you can increase the timeout via {@link ClientConfiguration} .
     *
     * <pre>
     * ClientConfiguration config = new ClientConfiguration();
     * config.setSocketTimeout(5 * 60 * 1000); // 5 minutes
     * LambdaInvokerFactory factory = new LambdaInvokerFactory(context, region,
     *         provider, config);
     * </pre>
     *
     * @param context context of the app. A client context will be created from
     *            the given context.
     * @param region region of Lambda service
     * @param provider a AWS credentials provider
     * @param clientConfiguration client configuration for the factory
     */
    public LambdaInvokerFactory(Context context, Regions region, AWSCredentialsProvider provider,
            ClientConfiguration clientConfiguration) {
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        if (provider == null) {
            throw new IllegalArgumentException("provider can't be null");
        }

        // constructs a lambda client
        lambda = new AWSLambdaClient(provider, clientConfiguration);
        lambda.setRegion(Region.getRegion(region));
        clientContext = new ClientContext(context);
    }

    /**
     * Constructs a Lambda invoker factory object.
     *
     * @param lambda a lambda client
     * @param clientContext client context object
     */
    LambdaInvokerFactory(AWSLambda lambda, ClientContext clientContext) {
        this.lambda = lambda;
        this.clientContext = clientContext;
    }

    /**
     * Contexts a dynamic proxy object of the given class with a default Json
     * data binder.
     *
     * @param interfaceClass the class to be dynamically proxied by Lambda
     * @return a dynamic proxy object of the given class
     */
    public <T> T build(Class<T> interfaceClass) {
        return build(interfaceClass, new LambdaJsonBinder());
    }

    /**
     * Contexts a dynamic proxy object of the given class.
     *
     * @param interfaceClass the class to be dynamically proxied by Lambda
     * @param binder a data binder to convert between POJO and byte stream.
     * @return a dynamic proxy object of the given class
     */
    public <T> T build(Class<T> interfaceClass, LambdaDataBinder binder) {
        Object proxy = Proxy.newProxyInstance(interfaceClass.getClassLoader(),
                new Class<?>[] {
                    interfaceClass
                },
                new LambdaInvocationHandler(lambda, binder, clientContext));
        return interfaceClass.cast(proxy);
    }

    /**
     * Gets the client context associated with this factory. Changes to the
     * client context will affect all proxy objects created by this factory,
     * including those were created.
     *
     * @return client context
     */
    public ClientContext getClientContext() {
        return clientContext;
    }
}
