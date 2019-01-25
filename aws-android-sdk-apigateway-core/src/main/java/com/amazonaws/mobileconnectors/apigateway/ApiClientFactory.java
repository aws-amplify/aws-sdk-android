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

package com.amazonaws.mobileconnectors.apigateway;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.Signer;
import com.amazonaws.mobileconnectors.apigateway.annotation.Service;

import java.lang.reflect.Proxy;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Factory to create a client for APIs defined on Amazon API Gateway.
 */
public class ApiClientFactory {

    private static final String AMAZON_API_GATEWAY_SERVICE_NAME = "execute-api";
    // endpoint pattern for extracting region out of an endpoint
    // e.g. https://my-api-id.execute-api.region-id.amazonaws.com/stage
    private static final Pattern ENDPOINT_PATTERN = Pattern
            .compile("^https?://\\w+.execute-api.([a-z0-9-]+).amazonaws.com/.*");

    private String endpoint;
    private String apiKey;
    private String regionOverride;
    private AWSCredentialsProvider provider;
    private ClientConfiguration clientConfiguration;

    /**
     * Sets the endpoint of the APIs.
     *
     * @param endpoint endpoint url
     * @return the factory itself for chaining
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public ApiClientFactory endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Sets the apiKey in header for each call to endpoint.
     *
     * @param apiKey to send in header
     * @return the factory itself for chaining
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public ApiClientFactory apiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Sets the region of the endpoint. If not set, the region will be deduced
     * from endpoint.
     *
     * @param region a region string
     * @return the factory itself for chaining
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public ApiClientFactory region(String region) {
        this.regionOverride = region;
        return this;
    }

    /**
     * Specify the client configuration to use with this factory
     *
     * @param clientConfiguration Configuration to use
     * @return the factory itself for chaining
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public ApiClientFactory clientConfiguration(ClientConfiguration clientConfiguration) {
        this.clientConfiguration = clientConfiguration;
        return this;
    }

    /**
     * Sets the credentials provider, needed if APIs require authentication.
     *
     * @param provider an AWS credentials provider
     * @return the factory itself for chaining
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public ApiClientFactory credentialsProvider(AWSCredentialsProvider provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Instantiates a client for the given API.
     *
     * @param <T> the api client interface.
     * @param apiClass API class defined in API Gateway.
     * @return a client for the given API.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public <T> T build(Class<T> apiClass) {
        if (apiClass == null) {
            throw new IllegalArgumentException("Missing API class");
        }
        final String endpoint = getEndpoint(apiClass);
        if (endpoint == null) {
            throw new IllegalArgumentException("Missing endpoint information");
        }
        final String apiName = getApiName(apiClass);
        final ApiClientHandler handler = getHandler(endpoint, apiName);
        final Object proxy = Proxy.newProxyInstance(apiClass.getClassLoader(),
                new Class<?>[] {
                    apiClass
                }, handler);
        return apiClass.cast(proxy);
    }

    /**
     * Gets an invocation handler for the given API.
     *
     * @param endpoint Request endpoint
     * @param apiName API class name
     * @return an invocation handler
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    ApiClientHandler getHandler(String endpoint, String apiName) {
        final Signer signer = provider == null ? null : getSigner(getRegion(endpoint));

        // Ensure we always pass a configuration to the handler
        final ClientConfiguration configuration = (clientConfiguration == null) ? new ClientConfiguration() : clientConfiguration;

        return new ApiClientHandler(endpoint, apiName, signer, provider, apiKey, configuration);
    }

    /**
     * Gets endpoint from target class.
     *
     * @param apiClass target class, must be annotated with {@link Service}.
     * @return endpoint
     */
    String getEndpoint(Class<?> apiClass) {
        final Service service = apiClass.getAnnotation(Service.class);
        if (service == null) {
            throw new IllegalArgumentException("Can't find annotation Service");
        }
        return endpoint == null ? service.endpoint() : endpoint;
    }

    /**
     * Gets API name.
     *
     * @param apiClass API class
     * @return API name
     */
    String getApiName(Class<?> apiClass) {
        return apiClass.getSimpleName();
    }

    /**
     * Gets signer.
     *
     * @param serviceName service name
     * @param region region
     * @return signer
     */
    Signer getSigner(String region) {
        final AWS4Signer signer = new AWS4Signer();
        signer.setServiceName(AMAZON_API_GATEWAY_SERVICE_NAME);
        signer.setRegionName(region);
        return signer;
    }

    /**
     * Gets region from the given endpoint.
     *
     * @param endpoint endpoint string
     * @return region string
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    String getRegion(String endpoint) {
        if (regionOverride != null) {
            return regionOverride;
        }
        final Matcher m = ENDPOINT_PATTERN.matcher(endpoint);
        if (m.matches()) {
            return m.group(1);
        }
        throw new IllegalArgumentException("Region isn't specified and can't be deduced from endpoint.");
    }
}
