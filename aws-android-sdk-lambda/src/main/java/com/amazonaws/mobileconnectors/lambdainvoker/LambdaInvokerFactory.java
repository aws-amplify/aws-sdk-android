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

package com.amazonaws.mobileconnectors.lambdainvoker;

import android.content.Context;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.mobileconnectors.util.ClientContext;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.lambda.AWSLambda;
import com.amazonaws.services.lambda.AWSLambdaClient;

import org.json.JSONObject;

import java.lang.reflect.Proxy;

/**
 * A factory class that creates a dynamic proxy object backed by Lambda service.
 */
@SuppressWarnings("checkstyle:hiddenfield")
public class LambdaInvokerFactory {

    // -------------------------------------------------------------
    // Methods - Public - Static
    // -------------------------------------------------------------

    private final AWSLambda lambda;
    private final ClientContext clientContext;
    
    /**
     * Builder class for LambdaInvokerFactory
     */
    public static class Builder {
        private Context context;
        private Regions region;
        private AWSCredentialsProvider provider;
        private ClientConfiguration clientConfig;
        private AWSConfiguration awsConfig;
        private AWSLambda lambda;
        private ClientContext clientContext;
        
        protected Builder() { }
        
        /**
         * 
         * @param context The context.
         * @return builder
         */
        public Builder context(Context context) {
            this.context = context;
            return this;
        }
        
        /**
         * This will take precedence over any region specified in {@linkAWSConfiguration
         * @param region The region your lambda functions were created in.
         * @return builder
         */
        public Builder region(Regions region) {
            this.region = region;
            return this;
        }
        
        /**
         * 
         * @param provider The credentials that have access to the functions
         * @return builder
         */
        public Builder credentialsProvider(AWSCredentialsProvider provider) {
            this.provider = provider;
            return this;
        }
        
        /**
         * If your Lambda function takes a long time to finish (longer than the
         * default socket timeout of 15 seconds), you can increase the timeout
         * via {@link ClientConfiguration} .
         *
         * <pre>
         * ClientConfiguration config = new ClientConfiguration();
         * config.setSocketTimeout(5 * 60 * 1000); // 5 minutes
         * </pre>
         * 
         * @param clientConfig The configuration for the lambda client
         * @return builder
         */
        public Builder clientConfiguration(ClientConfiguration clientConfig) {
            this.clientConfig = clientConfig;
            return this;
        }

        /**
         * 
         * @param clientContext Client context
         * @return builder
         */
        public Builder clientContext(ClientContext clientContext) {
            this.clientContext = clientContext;
            return this;
        }

        /**
         * This will be constructed if you directly provide
         * {@link #credentialsProvider(AWSCredentialsProvider)} and
         * {@link #clientContext(ClientContext)} and either
         * {@link #region(Regions)} or
         * {@link #awsConfiguration(AWSConfiguration)}
         * 
         * @param lambda The lambda client making the network calls
         * @return builder
         */
        public Builder lambdaClient(AWSLambda lambda) {
            this.lambda = lambda;
            return this;
        }

        /**
         * This region will be overridden by {@link #region(Regions)}, if specified.
         * 
         * Example awsconfiguration.json
         * {
         *     "LambdaInvoker" : {
         *         "Default": {
         *             "Region": "ap-northeast-1"
         *         }
         *     }
         * }
         * @param awsConfig The configuration will override the region set in
         *            the lambda client.
         * @return builder
         */
        public Builder awsConfiguration(AWSConfiguration awsConfig) {
            this.awsConfig = awsConfig;
            return this;
        }
        
        /**
         * 
         * @return the LambdaInvokerFactory created by the parts provided
         */
        public LambdaInvokerFactory build() {
            if (this.clientConfig == null) {
                if (this.context == null) {
                    throw new IllegalArgumentException("Context or ClientContext are required"
                            + " please set using .context(context) or .clientContext(clientContext)");
                }
                this.clientContext = new ClientContext(this.context);
            }
            
            if (this.lambda == null) {
                if (this.provider == null) {
                    throw new IllegalArgumentException("AWSCredentialsProvider is required please"
                            + " set using .credentialsProvider(creds)");
                }
                if (this.clientConfig == null) {
                    this.clientConfig = new ClientConfiguration();
                }
            }
            
            if (this.awsConfig != null) {
                try {
                    if (this.clientConfig != null) {
                        String userAgent = this.clientConfig.getUserAgent();
                        if (userAgent == null || userAgent.trim().isEmpty()) {
                            this.clientConfig.setUserAgent(this.awsConfig.getUserAgent());
                        } else {
                            this.clientConfig.setUserAgent(userAgent
                                    + "/" + this.awsConfig.getUserAgent());
                        }
                    }
                    
                    final JSONObject lambdaConfig = this.awsConfig.optJsonObject("LambdaInvoker");
                    if (this.region != null) {
                        this.region = Regions.fromName(lambdaConfig.getString("Region"));
                    }
                } catch (Exception e) {
                    throw new IllegalArgumentException("Failed to read LambdaInvoker "
                            + "please check your setup or awsconfiguration.json file", e);
                }
            }
            
            if (this.lambda == null) {
                this.lambda = new AWSLambdaClient(this.provider, this.clientConfig);
            }

            if (this.region != null) {
                this.lambda.setRegion(Region.getRegion(this.region));
            }
            
            return new LambdaInvokerFactory(this.lambda, this.clientContext);
        }
    }
    
    /**
     * Some examples:
     * LambdaInvokerFactory.builder()
     *                     .context(context)
     *                     .region(Regions.AP_NORTHEAST_1)
     *                     .clientConfiguration(clientConfig) // Optional
     *                     .credentialsProvider(provider)
     *                     .build();
     * 
     * LambdaInvokerFactory.builder()
     *                     .context(context)
     *                     .awsConfiguration(awsConfig)
     *                     .clientConfiguration(clientConfig) // Optional
     *                     .credentialsProvider(provider)
     *                     .build;
     * 
     * LambdaInvokerFactory.builder()
     *                     .lambdaClient(client)
     *                     .clientContext(clientContext)
     *                     .build;
     * @return builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Constructs a Lambda invoker factory object.
     *
     * @param context context of the app. A client context will be created from
     *            the given context.
     * @param region region of Lambda service
     * @param provider a AWS credentials provider
     * @deprecated Please use LambdaInvokerFactory.builder()
     *                                            .context(context)
     *                                            .region(Regions.AP_NORTHEAST_1)
     *                                            .credentialsProvider(provider)
     *                                            .build();
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
     * @deprecated Please use LambdaInvokerFactory.builder()
     *                                            .context(context)
     *                                            .region(Regions.AP_NORTHEAST_1)
     *                                            .credentialsProvider(provider)
     *                                            .clientConfiguration(clientConfig)
     *                                            .build();
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
     * @deprecated Please use LambdaInvokerFactory.builder()
     *                                            .lambdaClient(client)
     *                                            .clientContext(clientContext)
     *                                            .build();
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
     * @param <T> the type for the class
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
     * @param <T> the type of the interfaceclass.
     * @return a dynamic proxy object of the given class
     */
    public <T> T build(Class<T> interfaceClass, LambdaDataBinder binder) {
        final Object proxy = Proxy.newProxyInstance(interfaceClass.getClassLoader(),
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
