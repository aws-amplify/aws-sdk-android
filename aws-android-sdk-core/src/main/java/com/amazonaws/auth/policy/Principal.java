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

package com.amazonaws.auth.policy;

/**
 * A principal is an AWS account or AWS web serivce, which is being allowed or
 * denied access to a resource through an access control policy. The principal
 * is a property of the {@link Statement} object, not directly the
 * {@link Policy} object.
 * <p>
 * The principal is A in the statement
 * "A has permission to do B to C where D applies."
 * <p>
 * In an access control policy statement, you can set the principal to all
 * authenticated AWS users through the {@link Principal#AllUsers} member. This
 * is useful when you don't want to restrict access based on the identity of the
 * requester, but instead on other identifying characteristics such as the
 * requester's IP address.
 */
public class Principal {

    /**
     * Principal instance that includes all users, including anonymous users.
     * <p>
     * This is useful when you don't want to restrict access based on the
     * identity of the requester, but instead on other identifying
     * characteristics such as the requester's IP address.
     */
    @SuppressWarnings("checkstyle:constantname")
    public static final Principal AllUsers = new Principal("AWS", "*");

    /**
     * Principal instance that includes all AWS web services.
     */
    @SuppressWarnings("checkstyle:constantname")
    public static final Principal AllServices = new Principal("Service", "*");

    /**
     * Principal instance that includes all the web identity providers.
     */
    @SuppressWarnings("checkstyle:constantname")
    public static final Principal AllWebProviders = new Principal("Federated", "*");

    /**
     * Principal instance that includes all the AWS accounts, AWS web services
     * and web identity providers.
     */
    @SuppressWarnings("checkstyle:constantname")
    public static final Principal All = new Principal("*", "*");

    private final String id;
    private final String provider;

    /**
     * Constructs a new principal with the specified AWS web service which is
     * being allowed or denied access to a resource through an access control
     * policy.
     *
     * @param service An AWS service.
     */
    public Principal(Services service) {
        if (service == null) {
            throw new IllegalArgumentException("Null AWS service name specified");
        }
        id = service.getServiceId();
        provider = "Service";
    }

    /**
     * Constructs a new principal with the specified id and provider.
     * @param provider the provider.
     * @param id the id.
     */
    public Principal(String provider, String id) {
        this.provider = provider;
        if ("AWS".equals(provider)) {
            id = id.replaceAll("-", "");
        }
        this.id = id;
    }

    /**
     * Constructs a new principal with the specified AWS account ID.
     *
     * @param accountId An AWS account ID.
     */
    public Principal(String accountId) {
        if (accountId == null) {
            throw new IllegalArgumentException("Null AWS account ID specified");
        }

        this.id = accountId.replaceAll("-", "");
        provider = "AWS";
    }

    /**
     * Constructs a new principal with the specified web identity provider.
     *
     * @param webIdentityProvider An web identity provider.
     */
    public Principal(WebIdentityProviders webIdentityProvider) {
        if (webIdentityProvider == null) {
            throw new IllegalArgumentException("Null web identity provider specified");
        }
        this.id = webIdentityProvider.getWebIdentityProvider();
        provider = "Federated";
    }

    /**
     * Returns the provider for this principal, which indicates in what group of
     * users this principal resides.
     *
     * @return The provider for this principal.
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Returns the unique ID for this principal.
     *
     * @return The unique ID for this principal.
     */
    public String getId() {
        return id;
    }

    /**
     * The services who have the right to do the assume the role action. The
     * AssumeRole action returns a set of temporary security credentials that
     * you can use to access resources that are defined in the role's policy.
     * The returned credentials consist of an Access Key ID, a Secret Access
     * Key, and a security token.
     */
    public static enum Services {

        /** AWS Data Pipeline. */
        AWSDataPipeline("datapipeline.amazonaws.com"),

        /** Amazon Elastic Transcoder. */
        AmazonElasticTranscoder("elastictranscoder.amazonaws.com"),

        /** Amazon EC2. */
        AmazonEC2("ec2.amazonaws.com"),

        /** AWS Ops Works. */
        AWSOpsWorks("opsworks.amazonaws.com"),

        /** AWS Cloud HSM. */
        AWSCloudHSM("cloudhsm.amazonaws.com"),

        /** All services. */
        AllServices("*");

        private String serviceId;

        /**
         * The service which has the right to assume the role.
         */
        private Services(String serviceId) {
            this.serviceId = serviceId;
        }

        public String getServiceId() {
            return serviceId;
        }

        /**
         * Construct the Services object from a string representing the service
         * id.
         * @param serviceId the service ID.
         * @return the Services object.
         */
        public static Services fromString(String serviceId) {
            if (serviceId != null) {
                for (Services s : Services.values()) {
                    if (s.getServiceId().equalsIgnoreCase(serviceId)) {
                        return s;
                    }
                }
            }

            return null;
        }

    }

    /**
     * Web identity providers, such as Login with Amazon, Facebook, or Google.
     */
    public static enum WebIdentityProviders {

        /** Facebook. */
        Facebook("graph.facebook.com"),

        /** Google. */
        Google("accounts.google.com"),

        /** Amazon. */
        Amazon("www.amazon.com"),

        /** All providers. */
        AllProviders("*");

        private String webIdentityProvider;

        /**
         * The web identity provider which has the right to assume the role.
         */
        private WebIdentityProviders(String webIdentityProvider) {
            this.webIdentityProvider = webIdentityProvider;
        }

        public String getWebIdentityProvider() {
            return webIdentityProvider;
        }

        /**
         * Construct the Services object from a string representing web identity
         * provider.
         * @param webIdentityProvider string representing web identity provider.
         * @return WebIdentityProviders object.
         */
        public static WebIdentityProviders fromString(String webIdentityProvider) {
            if (webIdentityProvider != null) {
                for (WebIdentityProviders provider : WebIdentityProviders.values()) {
                    if (provider.getWebIdentityProvider().equalsIgnoreCase(webIdentityProvider)) {
                        return provider;
                    }
                }
            }

            return null;
        }

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + provider.hashCode();
        hashCode = prime * hashCode + id.hashCode();
        return hashCode;
    }

    @Override
    public boolean equals(Object principal) {
        if (this == principal) {
            return true;
        }

        if (principal == null) {
            return false;
        }

        if (!(principal instanceof Principal)) {
            return false;
        }

        Principal other = (Principal) principal;

        if (this.getProvider().equals(other.getProvider())
                && this.getId().equals(other.getId())) {
            return true;
        }

        return false;
    }

}
