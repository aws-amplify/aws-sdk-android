/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a domain configuration.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >CreateDomainConfiguration</a> action.
 * </p>
 */
public class CreateDomainConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the domain configuration. This value must be unique to a
     * region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w.-]+<br/>
     */
    private String domainConfigurationName;

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     */
    private String domainName;

    /**
     * <p>
     * The ARNs of the certificates that IoT passes to the device during the TLS
     * handshake. Currently you can specify only one certificate ARN. This value
     * is not required for Amazon Web Services-managed domains.
     * </p>
     */
    private java.util.List<String> serverCertificateArns;

    /**
     * <p>
     * The certificate used to validate the server certificate and prove domain
     * name ownership. This certificate must be signed by a public certificate
     * authority. This value is not required for Amazon Web Services-managed
     * domains.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws(-cn|-us-gov|-iso-b|-iso)?:acm:[a-z]{2}-(gov-|iso-|
     * isob-)?[a-z]{4,9}-\d{1}:\d{12}:certificate/[a-zA-Z0-9/-]+<br/>
     */
    private String validationCertificateArn;

    /**
     * <p>
     * An object that specifies the authorization service for a domain.
     * </p>
     */
    private AuthorizerConfig authorizerConfig;

    /**
     * <p>
     * The type of service delivered by the endpoint.
     * </p>
     * <note>
     * <p>
     * Amazon Web Services IoT Core currently supports only the
     * <code>DATA</code> service type.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA, CREDENTIAL_PROVIDER, JOBS
     */
    private String serviceType;

    /**
     * <p>
     * Metadata which can be used to manage the domain configuration.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the domain configuration. This value must be unique to a
     * region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w.-]+<br/>
     *
     * @return <p>
     *         The name of the domain configuration. This value must be unique
     *         to a region.
     *         </p>
     */
    public String getDomainConfigurationName() {
        return domainConfigurationName;
    }

    /**
     * <p>
     * The name of the domain configuration. This value must be unique to a
     * region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w.-]+<br/>
     *
     * @param domainConfigurationName <p>
     *            The name of the domain configuration. This value must be
     *            unique to a region.
     *            </p>
     */
    public void setDomainConfigurationName(String domainConfigurationName) {
        this.domainConfigurationName = domainConfigurationName;
    }

    /**
     * <p>
     * The name of the domain configuration. This value must be unique to a
     * region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w.-]+<br/>
     *
     * @param domainConfigurationName <p>
     *            The name of the domain configuration. This value must be
     *            unique to a region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainConfigurationRequest withDomainConfigurationName(
            String domainConfigurationName) {
        this.domainConfigurationName = domainConfigurationName;
        return this;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     *
     * @return <p>
     *         The name of the domain.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     *
     * @param domainName <p>
     *            The name of the domain.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     *
     * @param domainName <p>
     *            The name of the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainConfigurationRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The ARNs of the certificates that IoT passes to the device during the TLS
     * handshake. Currently you can specify only one certificate ARN. This value
     * is not required for Amazon Web Services-managed domains.
     * </p>
     *
     * @return <p>
     *         The ARNs of the certificates that IoT passes to the device during
     *         the TLS handshake. Currently you can specify only one certificate
     *         ARN. This value is not required for Amazon Web Services-managed
     *         domains.
     *         </p>
     */
    public java.util.List<String> getServerCertificateArns() {
        return serverCertificateArns;
    }

    /**
     * <p>
     * The ARNs of the certificates that IoT passes to the device during the TLS
     * handshake. Currently you can specify only one certificate ARN. This value
     * is not required for Amazon Web Services-managed domains.
     * </p>
     *
     * @param serverCertificateArns <p>
     *            The ARNs of the certificates that IoT passes to the device
     *            during the TLS handshake. Currently you can specify only one
     *            certificate ARN. This value is not required for Amazon Web
     *            Services-managed domains.
     *            </p>
     */
    public void setServerCertificateArns(java.util.Collection<String> serverCertificateArns) {
        if (serverCertificateArns == null) {
            this.serverCertificateArns = null;
            return;
        }

        this.serverCertificateArns = new java.util.ArrayList<String>(serverCertificateArns);
    }

    /**
     * <p>
     * The ARNs of the certificates that IoT passes to the device during the TLS
     * handshake. Currently you can specify only one certificate ARN. This value
     * is not required for Amazon Web Services-managed domains.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverCertificateArns <p>
     *            The ARNs of the certificates that IoT passes to the device
     *            during the TLS handshake. Currently you can specify only one
     *            certificate ARN. This value is not required for Amazon Web
     *            Services-managed domains.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainConfigurationRequest withServerCertificateArns(
            String... serverCertificateArns) {
        if (getServerCertificateArns() == null) {
            this.serverCertificateArns = new java.util.ArrayList<String>(
                    serverCertificateArns.length);
        }
        for (String value : serverCertificateArns) {
            this.serverCertificateArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The ARNs of the certificates that IoT passes to the device during the TLS
     * handshake. Currently you can specify only one certificate ARN. This value
     * is not required for Amazon Web Services-managed domains.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverCertificateArns <p>
     *            The ARNs of the certificates that IoT passes to the device
     *            during the TLS handshake. Currently you can specify only one
     *            certificate ARN. This value is not required for Amazon Web
     *            Services-managed domains.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainConfigurationRequest withServerCertificateArns(
            java.util.Collection<String> serverCertificateArns) {
        setServerCertificateArns(serverCertificateArns);
        return this;
    }

    /**
     * <p>
     * The certificate used to validate the server certificate and prove domain
     * name ownership. This certificate must be signed by a public certificate
     * authority. This value is not required for Amazon Web Services-managed
     * domains.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws(-cn|-us-gov|-iso-b|-iso)?:acm:[a-z]{2}-(gov-|iso-|
     * isob-)?[a-z]{4,9}-\d{1}:\d{12}:certificate/[a-zA-Z0-9/-]+<br/>
     *
     * @return <p>
     *         The certificate used to validate the server certificate and prove
     *         domain name ownership. This certificate must be signed by a
     *         public certificate authority. This value is not required for
     *         Amazon Web Services-managed domains.
     *         </p>
     */
    public String getValidationCertificateArn() {
        return validationCertificateArn;
    }

    /**
     * <p>
     * The certificate used to validate the server certificate and prove domain
     * name ownership. This certificate must be signed by a public certificate
     * authority. This value is not required for Amazon Web Services-managed
     * domains.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws(-cn|-us-gov|-iso-b|-iso)?:acm:[a-z]{2}-(gov-|iso-|
     * isob-)?[a-z]{4,9}-\d{1}:\d{12}:certificate/[a-zA-Z0-9/-]+<br/>
     *
     * @param validationCertificateArn <p>
     *            The certificate used to validate the server certificate and
     *            prove domain name ownership. This certificate must be signed
     *            by a public certificate authority. This value is not required
     *            for Amazon Web Services-managed domains.
     *            </p>
     */
    public void setValidationCertificateArn(String validationCertificateArn) {
        this.validationCertificateArn = validationCertificateArn;
    }

    /**
     * <p>
     * The certificate used to validate the server certificate and prove domain
     * name ownership. This certificate must be signed by a public certificate
     * authority. This value is not required for Amazon Web Services-managed
     * domains.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws(-cn|-us-gov|-iso-b|-iso)?:acm:[a-z]{2}-(gov-|iso-|
     * isob-)?[a-z]{4,9}-\d{1}:\d{12}:certificate/[a-zA-Z0-9/-]+<br/>
     *
     * @param validationCertificateArn <p>
     *            The certificate used to validate the server certificate and
     *            prove domain name ownership. This certificate must be signed
     *            by a public certificate authority. This value is not required
     *            for Amazon Web Services-managed domains.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainConfigurationRequest withValidationCertificateArn(
            String validationCertificateArn) {
        this.validationCertificateArn = validationCertificateArn;
        return this;
    }

    /**
     * <p>
     * An object that specifies the authorization service for a domain.
     * </p>
     *
     * @return <p>
     *         An object that specifies the authorization service for a domain.
     *         </p>
     */
    public AuthorizerConfig getAuthorizerConfig() {
        return authorizerConfig;
    }

    /**
     * <p>
     * An object that specifies the authorization service for a domain.
     * </p>
     *
     * @param authorizerConfig <p>
     *            An object that specifies the authorization service for a
     *            domain.
     *            </p>
     */
    public void setAuthorizerConfig(AuthorizerConfig authorizerConfig) {
        this.authorizerConfig = authorizerConfig;
    }

    /**
     * <p>
     * An object that specifies the authorization service for a domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorizerConfig <p>
     *            An object that specifies the authorization service for a
     *            domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainConfigurationRequest withAuthorizerConfig(AuthorizerConfig authorizerConfig) {
        this.authorizerConfig = authorizerConfig;
        return this;
    }

    /**
     * <p>
     * The type of service delivered by the endpoint.
     * </p>
     * <note>
     * <p>
     * Amazon Web Services IoT Core currently supports only the
     * <code>DATA</code> service type.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA, CREDENTIAL_PROVIDER, JOBS
     *
     * @return <p>
     *         The type of service delivered by the endpoint.
     *         </p>
     *         <note>
     *         <p>
     *         Amazon Web Services IoT Core currently supports only the
     *         <code>DATA</code> service type.
     *         </p>
     *         </note>
     * @see ServiceType
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * <p>
     * The type of service delivered by the endpoint.
     * </p>
     * <note>
     * <p>
     * Amazon Web Services IoT Core currently supports only the
     * <code>DATA</code> service type.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA, CREDENTIAL_PROVIDER, JOBS
     *
     * @param serviceType <p>
     *            The type of service delivered by the endpoint.
     *            </p>
     *            <note>
     *            <p>
     *            Amazon Web Services IoT Core currently supports only the
     *            <code>DATA</code> service type.
     *            </p>
     *            </note>
     * @see ServiceType
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * <p>
     * The type of service delivered by the endpoint.
     * </p>
     * <note>
     * <p>
     * Amazon Web Services IoT Core currently supports only the
     * <code>DATA</code> service type.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA, CREDENTIAL_PROVIDER, JOBS
     *
     * @param serviceType <p>
     *            The type of service delivered by the endpoint.
     *            </p>
     *            <note>
     *            <p>
     *            Amazon Web Services IoT Core currently supports only the
     *            <code>DATA</code> service type.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceType
     */
    public CreateDomainConfigurationRequest withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * <p>
     * The type of service delivered by the endpoint.
     * </p>
     * <note>
     * <p>
     * Amazon Web Services IoT Core currently supports only the
     * <code>DATA</code> service type.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA, CREDENTIAL_PROVIDER, JOBS
     *
     * @param serviceType <p>
     *            The type of service delivered by the endpoint.
     *            </p>
     *            <note>
     *            <p>
     *            Amazon Web Services IoT Core currently supports only the
     *            <code>DATA</code> service type.
     *            </p>
     *            </note>
     * @see ServiceType
     */
    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType.toString();
    }

    /**
     * <p>
     * The type of service delivered by the endpoint.
     * </p>
     * <note>
     * <p>
     * Amazon Web Services IoT Core currently supports only the
     * <code>DATA</code> service type.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATA, CREDENTIAL_PROVIDER, JOBS
     *
     * @param serviceType <p>
     *            The type of service delivered by the endpoint.
     *            </p>
     *            <note>
     *            <p>
     *            Amazon Web Services IoT Core currently supports only the
     *            <code>DATA</code> service type.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceType
     */
    public CreateDomainConfigurationRequest withServiceType(ServiceType serviceType) {
        this.serviceType = serviceType.toString();
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the domain configuration.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     *
     * @return <p>
     *         Metadata which can be used to manage the domain configuration.
     *         </p>
     *         <note>
     *         <p>
     *         For URI Request parameters use format:
     *         ...key1=value1&amp;key2=value2...
     *         </p>
     *         <p>
     *         For the CLI command-line parameter use format: &amp;&amp;tags
     *         "key1=value1&amp;key2=value2..."
     *         </p>
     *         <p>
     *         For the cli-input-json file use format: "tags":
     *         "key1=value1&amp;key2=value2..."
     *         </p>
     *         </note>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata which can be used to manage the domain configuration.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     *
     * @param tags <p>
     *            Metadata which can be used to manage the domain configuration.
     *            </p>
     *            <note>
     *            <p>
     *            For URI Request parameters use format:
     *            ...key1=value1&amp;key2=value2...
     *            </p>
     *            <p>
     *            For the CLI command-line parameter use format: &amp;&amp;tags
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            <p>
     *            For the cli-input-json file use format: "tags":
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            </note>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata which can be used to manage the domain configuration.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata which can be used to manage the domain configuration.
     *            </p>
     *            <note>
     *            <p>
     *            For URI Request parameters use format:
     *            ...key1=value1&amp;key2=value2...
     *            </p>
     *            <p>
     *            For the CLI command-line parameter use format: &amp;&amp;tags
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            <p>
     *            For the cli-input-json file use format: "tags":
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainConfigurationRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the domain configuration.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata which can be used to manage the domain configuration.
     *            </p>
     *            <note>
     *            <p>
     *            For URI Request parameters use format:
     *            ...key1=value1&amp;key2=value2...
     *            </p>
     *            <p>
     *            For the CLI command-line parameter use format: &amp;&amp;tags
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            <p>
     *            For the cli-input-json file use format: "tags":
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainConfigurationRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDomainConfigurationName() != null)
            sb.append("domainConfigurationName: " + getDomainConfigurationName() + ",");
        if (getDomainName() != null)
            sb.append("domainName: " + getDomainName() + ",");
        if (getServerCertificateArns() != null)
            sb.append("serverCertificateArns: " + getServerCertificateArns() + ",");
        if (getValidationCertificateArn() != null)
            sb.append("validationCertificateArn: " + getValidationCertificateArn() + ",");
        if (getAuthorizerConfig() != null)
            sb.append("authorizerConfig: " + getAuthorizerConfig() + ",");
        if (getServiceType() != null)
            sb.append("serviceType: " + getServiceType() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDomainConfigurationName() == null) ? 0 : getDomainConfigurationName()
                        .hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime
                * hashCode
                + ((getServerCertificateArns() == null) ? 0 : getServerCertificateArns().hashCode());
        hashCode = prime
                * hashCode
                + ((getValidationCertificateArn() == null) ? 0 : getValidationCertificateArn()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAuthorizerConfig() == null) ? 0 : getAuthorizerConfig().hashCode());
        hashCode = prime * hashCode
                + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDomainConfigurationRequest == false)
            return false;
        CreateDomainConfigurationRequest other = (CreateDomainConfigurationRequest) obj;

        if (other.getDomainConfigurationName() == null ^ this.getDomainConfigurationName() == null)
            return false;
        if (other.getDomainConfigurationName() != null
                && other.getDomainConfigurationName().equals(this.getDomainConfigurationName()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getServerCertificateArns() == null ^ this.getServerCertificateArns() == null)
            return false;
        if (other.getServerCertificateArns() != null
                && other.getServerCertificateArns().equals(this.getServerCertificateArns()) == false)
            return false;
        if (other.getValidationCertificateArn() == null
                ^ this.getValidationCertificateArn() == null)
            return false;
        if (other.getValidationCertificateArn() != null
                && other.getValidationCertificateArn().equals(this.getValidationCertificateArn()) == false)
            return false;
        if (other.getAuthorizerConfig() == null ^ this.getAuthorizerConfig() == null)
            return false;
        if (other.getAuthorizerConfig() != null
                && other.getAuthorizerConfig().equals(this.getAuthorizerConfig()) == false)
            return false;
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null
                && other.getServiceType().equals(this.getServiceType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
