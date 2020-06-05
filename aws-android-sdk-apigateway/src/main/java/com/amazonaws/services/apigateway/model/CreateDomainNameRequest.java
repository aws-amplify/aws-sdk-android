/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new domain name.
 * </p>
 */
public class CreateDomainNameRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The name of the <a>DomainName</a> resource.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * The user-friendly name of the certificate that will be used by
     * edge-optimized endpoint for this domain name.
     * </p>
     */
    private String certificateName;

    /**
     * <p>
     * [Deprecated] The body of the server certificate that will be used by
     * edge-optimized endpoint for this domain name provided by your certificate
     * authority.
     * </p>
     */
    private String certificateBody;

    /**
     * <p>
     * [Deprecated] Your edge-optimized endpoint's domain name certificate's
     * private key.
     * </p>
     */
    private String certificatePrivateKey;

    /**
     * <p>
     * [Deprecated] The intermediate certificates and optionally the root
     * certificate, one after the other without any blank lines, used by an
     * edge-optimized endpoint for this domain name. If you include the root
     * certificate, your certificate chain must start with intermediate
     * certificates and end with the root certificate. Use the intermediate
     * certificates that were provided by your certificate authority. Do not
     * include any intermediaries that are not in the chain of trust path.
     * </p>
     */
    private String certificateChain;

    /**
     * <p>
     * The reference to an AWS-managed certificate that will be used by
     * edge-optimized endpoint for this domain name. AWS Certificate Manager is
     * the only supported source.
     * </p>
     */
    private String certificateArn;

    /**
     * <p>
     * The user-friendly name of the certificate that will be used by regional
     * endpoint for this domain name.
     * </p>
     */
    private String regionalCertificateName;

    /**
     * <p>
     * The reference to an AWS-managed certificate that will be used by regional
     * endpoint for this domain name. AWS Certificate Manager is the only
     * supported source.
     * </p>
     */
    private String regionalCertificateArn;

    /**
     * <p>
     * The endpoint configuration of this <a>DomainName</a> showing the endpoint
     * types of the domain name.
     * </p>
     */
    private EndpointConfiguration endpointConfiguration;

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/].
     * The tag key can be up to 128 characters and must not start with
     * <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Transport Layer Security (TLS) version + cipher suite for this
     * <a>DomainName</a>. The valid values are <code>TLS_1_0</code> and
     * <code>TLS_1_2</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TLS_1_0, TLS_1_2
     */
    private String securityPolicy;

    /**
     * <p>
     * [Required] The name of the <a>DomainName</a> resource.
     * </p>
     *
     * @return <p>
     *         [Required] The name of the <a>DomainName</a> resource.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * [Required] The name of the <a>DomainName</a> resource.
     * </p>
     *
     * @param domainName <p>
     *            [Required] The name of the <a>DomainName</a> resource.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * [Required] The name of the <a>DomainName</a> resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainName <p>
     *            [Required] The name of the <a>DomainName</a> resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainNameRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The user-friendly name of the certificate that will be used by
     * edge-optimized endpoint for this domain name.
     * </p>
     *
     * @return <p>
     *         The user-friendly name of the certificate that will be used by
     *         edge-optimized endpoint for this domain name.
     *         </p>
     */
    public String getCertificateName() {
        return certificateName;
    }

    /**
     * <p>
     * The user-friendly name of the certificate that will be used by
     * edge-optimized endpoint for this domain name.
     * </p>
     *
     * @param certificateName <p>
     *            The user-friendly name of the certificate that will be used by
     *            edge-optimized endpoint for this domain name.
     *            </p>
     */
    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    /**
     * <p>
     * The user-friendly name of the certificate that will be used by
     * edge-optimized endpoint for this domain name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateName <p>
     *            The user-friendly name of the certificate that will be used by
     *            edge-optimized endpoint for this domain name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainNameRequest withCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }

    /**
     * <p>
     * [Deprecated] The body of the server certificate that will be used by
     * edge-optimized endpoint for this domain name provided by your certificate
     * authority.
     * </p>
     *
     * @return <p>
     *         [Deprecated] The body of the server certificate that will be used
     *         by edge-optimized endpoint for this domain name provided by your
     *         certificate authority.
     *         </p>
     */
    public String getCertificateBody() {
        return certificateBody;
    }

    /**
     * <p>
     * [Deprecated] The body of the server certificate that will be used by
     * edge-optimized endpoint for this domain name provided by your certificate
     * authority.
     * </p>
     *
     * @param certificateBody <p>
     *            [Deprecated] The body of the server certificate that will be
     *            used by edge-optimized endpoint for this domain name provided
     *            by your certificate authority.
     *            </p>
     */
    public void setCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
    }

    /**
     * <p>
     * [Deprecated] The body of the server certificate that will be used by
     * edge-optimized endpoint for this domain name provided by your certificate
     * authority.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateBody <p>
     *            [Deprecated] The body of the server certificate that will be
     *            used by edge-optimized endpoint for this domain name provided
     *            by your certificate authority.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainNameRequest withCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
        return this;
    }

    /**
     * <p>
     * [Deprecated] Your edge-optimized endpoint's domain name certificate's
     * private key.
     * </p>
     *
     * @return <p>
     *         [Deprecated] Your edge-optimized endpoint's domain name
     *         certificate's private key.
     *         </p>
     */
    public String getCertificatePrivateKey() {
        return certificatePrivateKey;
    }

    /**
     * <p>
     * [Deprecated] Your edge-optimized endpoint's domain name certificate's
     * private key.
     * </p>
     *
     * @param certificatePrivateKey <p>
     *            [Deprecated] Your edge-optimized endpoint's domain name
     *            certificate's private key.
     *            </p>
     */
    public void setCertificatePrivateKey(String certificatePrivateKey) {
        this.certificatePrivateKey = certificatePrivateKey;
    }

    /**
     * <p>
     * [Deprecated] Your edge-optimized endpoint's domain name certificate's
     * private key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificatePrivateKey <p>
     *            [Deprecated] Your edge-optimized endpoint's domain name
     *            certificate's private key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainNameRequest withCertificatePrivateKey(String certificatePrivateKey) {
        this.certificatePrivateKey = certificatePrivateKey;
        return this;
    }

    /**
     * <p>
     * [Deprecated] The intermediate certificates and optionally the root
     * certificate, one after the other without any blank lines, used by an
     * edge-optimized endpoint for this domain name. If you include the root
     * certificate, your certificate chain must start with intermediate
     * certificates and end with the root certificate. Use the intermediate
     * certificates that were provided by your certificate authority. Do not
     * include any intermediaries that are not in the chain of trust path.
     * </p>
     *
     * @return <p>
     *         [Deprecated] The intermediate certificates and optionally the
     *         root certificate, one after the other without any blank lines,
     *         used by an edge-optimized endpoint for this domain name. If you
     *         include the root certificate, your certificate chain must start
     *         with intermediate certificates and end with the root certificate.
     *         Use the intermediate certificates that were provided by your
     *         certificate authority. Do not include any intermediaries that are
     *         not in the chain of trust path.
     *         </p>
     */
    public String getCertificateChain() {
        return certificateChain;
    }

    /**
     * <p>
     * [Deprecated] The intermediate certificates and optionally the root
     * certificate, one after the other without any blank lines, used by an
     * edge-optimized endpoint for this domain name. If you include the root
     * certificate, your certificate chain must start with intermediate
     * certificates and end with the root certificate. Use the intermediate
     * certificates that were provided by your certificate authority. Do not
     * include any intermediaries that are not in the chain of trust path.
     * </p>
     *
     * @param certificateChain <p>
     *            [Deprecated] The intermediate certificates and optionally the
     *            root certificate, one after the other without any blank lines,
     *            used by an edge-optimized endpoint for this domain name. If
     *            you include the root certificate, your certificate chain must
     *            start with intermediate certificates and end with the root
     *            certificate. Use the intermediate certificates that were
     *            provided by your certificate authority. Do not include any
     *            intermediaries that are not in the chain of trust path.
     *            </p>
     */
    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    /**
     * <p>
     * [Deprecated] The intermediate certificates and optionally the root
     * certificate, one after the other without any blank lines, used by an
     * edge-optimized endpoint for this domain name. If you include the root
     * certificate, your certificate chain must start with intermediate
     * certificates and end with the root certificate. Use the intermediate
     * certificates that were provided by your certificate authority. Do not
     * include any intermediaries that are not in the chain of trust path.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateChain <p>
     *            [Deprecated] The intermediate certificates and optionally the
     *            root certificate, one after the other without any blank lines,
     *            used by an edge-optimized endpoint for this domain name. If
     *            you include the root certificate, your certificate chain must
     *            start with intermediate certificates and end with the root
     *            certificate. Use the intermediate certificates that were
     *            provided by your certificate authority. Do not include any
     *            intermediaries that are not in the chain of trust path.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainNameRequest withCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }

    /**
     * <p>
     * The reference to an AWS-managed certificate that will be used by
     * edge-optimized endpoint for this domain name. AWS Certificate Manager is
     * the only supported source.
     * </p>
     *
     * @return <p>
     *         The reference to an AWS-managed certificate that will be used by
     *         edge-optimized endpoint for this domain name. AWS Certificate
     *         Manager is the only supported source.
     *         </p>
     */
    public String getCertificateArn() {
        return certificateArn;
    }

    /**
     * <p>
     * The reference to an AWS-managed certificate that will be used by
     * edge-optimized endpoint for this domain name. AWS Certificate Manager is
     * the only supported source.
     * </p>
     *
     * @param certificateArn <p>
     *            The reference to an AWS-managed certificate that will be used
     *            by edge-optimized endpoint for this domain name. AWS
     *            Certificate Manager is the only supported source.
     *            </p>
     */
    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The reference to an AWS-managed certificate that will be used by
     * edge-optimized endpoint for this domain name. AWS Certificate Manager is
     * the only supported source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateArn <p>
     *            The reference to an AWS-managed certificate that will be used
     *            by edge-optimized endpoint for this domain name. AWS
     *            Certificate Manager is the only supported source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainNameRequest withCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
        return this;
    }

    /**
     * <p>
     * The user-friendly name of the certificate that will be used by regional
     * endpoint for this domain name.
     * </p>
     *
     * @return <p>
     *         The user-friendly name of the certificate that will be used by
     *         regional endpoint for this domain name.
     *         </p>
     */
    public String getRegionalCertificateName() {
        return regionalCertificateName;
    }

    /**
     * <p>
     * The user-friendly name of the certificate that will be used by regional
     * endpoint for this domain name.
     * </p>
     *
     * @param regionalCertificateName <p>
     *            The user-friendly name of the certificate that will be used by
     *            regional endpoint for this domain name.
     *            </p>
     */
    public void setRegionalCertificateName(String regionalCertificateName) {
        this.regionalCertificateName = regionalCertificateName;
    }

    /**
     * <p>
     * The user-friendly name of the certificate that will be used by regional
     * endpoint for this domain name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionalCertificateName <p>
     *            The user-friendly name of the certificate that will be used by
     *            regional endpoint for this domain name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainNameRequest withRegionalCertificateName(String regionalCertificateName) {
        this.regionalCertificateName = regionalCertificateName;
        return this;
    }

    /**
     * <p>
     * The reference to an AWS-managed certificate that will be used by regional
     * endpoint for this domain name. AWS Certificate Manager is the only
     * supported source.
     * </p>
     *
     * @return <p>
     *         The reference to an AWS-managed certificate that will be used by
     *         regional endpoint for this domain name. AWS Certificate Manager
     *         is the only supported source.
     *         </p>
     */
    public String getRegionalCertificateArn() {
        return regionalCertificateArn;
    }

    /**
     * <p>
     * The reference to an AWS-managed certificate that will be used by regional
     * endpoint for this domain name. AWS Certificate Manager is the only
     * supported source.
     * </p>
     *
     * @param regionalCertificateArn <p>
     *            The reference to an AWS-managed certificate that will be used
     *            by regional endpoint for this domain name. AWS Certificate
     *            Manager is the only supported source.
     *            </p>
     */
    public void setRegionalCertificateArn(String regionalCertificateArn) {
        this.regionalCertificateArn = regionalCertificateArn;
    }

    /**
     * <p>
     * The reference to an AWS-managed certificate that will be used by regional
     * endpoint for this domain name. AWS Certificate Manager is the only
     * supported source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionalCertificateArn <p>
     *            The reference to an AWS-managed certificate that will be used
     *            by regional endpoint for this domain name. AWS Certificate
     *            Manager is the only supported source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainNameRequest withRegionalCertificateArn(String regionalCertificateArn) {
        this.regionalCertificateArn = regionalCertificateArn;
        return this;
    }

    /**
     * <p>
     * The endpoint configuration of this <a>DomainName</a> showing the endpoint
     * types of the domain name.
     * </p>
     *
     * @return <p>
     *         The endpoint configuration of this <a>DomainName</a> showing the
     *         endpoint types of the domain name.
     *         </p>
     */
    public EndpointConfiguration getEndpointConfiguration() {
        return endpointConfiguration;
    }

    /**
     * <p>
     * The endpoint configuration of this <a>DomainName</a> showing the endpoint
     * types of the domain name.
     * </p>
     *
     * @param endpointConfiguration <p>
     *            The endpoint configuration of this <a>DomainName</a> showing
     *            the endpoint types of the domain name.
     *            </p>
     */
    public void setEndpointConfiguration(EndpointConfiguration endpointConfiguration) {
        this.endpointConfiguration = endpointConfiguration;
    }

    /**
     * <p>
     * The endpoint configuration of this <a>DomainName</a> showing the endpoint
     * types of the domain name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointConfiguration <p>
     *            The endpoint configuration of this <a>DomainName</a> showing
     *            the endpoint types of the domain name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainNameRequest withEndpointConfiguration(
            EndpointConfiguration endpointConfiguration) {
        this.endpointConfiguration = endpointConfiguration;
        return this;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/].
     * The tag key can be up to 128 characters and must not start with
     * <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     *
     * @return <p>
     *         The key-value map of strings. The valid character set is
     *         [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     *         not start with <code>aws:</code>. The tag value can be up to 256
     *         characters.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/].
     * The tag key can be up to 128 characters and must not start with
     * <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     *
     * @param tags <p>
     *            The key-value map of strings. The valid character set is
     *            [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and
     *            must not start with <code>aws:</code>. The tag value can be up
     *            to 256 characters.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/].
     * The tag key can be up to 128 characters and must not start with
     * <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The key-value map of strings. The valid character set is
     *            [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and
     *            must not start with <code>aws:</code>. The tag value can be up
     *            to 256 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainNameRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/].
     * The tag key can be up to 128 characters and must not start with
     * <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainNameRequest addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateDomainNameRequest cleartagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The Transport Layer Security (TLS) version + cipher suite for this
     * <a>DomainName</a>. The valid values are <code>TLS_1_0</code> and
     * <code>TLS_1_2</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TLS_1_0, TLS_1_2
     *
     * @return <p>
     *         The Transport Layer Security (TLS) version + cipher suite for
     *         this <a>DomainName</a>. The valid values are <code>TLS_1_0</code>
     *         and <code>TLS_1_2</code>.
     *         </p>
     * @see SecurityPolicy
     */
    public String getSecurityPolicy() {
        return securityPolicy;
    }

    /**
     * <p>
     * The Transport Layer Security (TLS) version + cipher suite for this
     * <a>DomainName</a>. The valid values are <code>TLS_1_0</code> and
     * <code>TLS_1_2</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TLS_1_0, TLS_1_2
     *
     * @param securityPolicy <p>
     *            The Transport Layer Security (TLS) version + cipher suite for
     *            this <a>DomainName</a>. The valid values are
     *            <code>TLS_1_0</code> and <code>TLS_1_2</code>.
     *            </p>
     * @see SecurityPolicy
     */
    public void setSecurityPolicy(String securityPolicy) {
        this.securityPolicy = securityPolicy;
    }

    /**
     * <p>
     * The Transport Layer Security (TLS) version + cipher suite for this
     * <a>DomainName</a>. The valid values are <code>TLS_1_0</code> and
     * <code>TLS_1_2</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TLS_1_0, TLS_1_2
     *
     * @param securityPolicy <p>
     *            The Transport Layer Security (TLS) version + cipher suite for
     *            this <a>DomainName</a>. The valid values are
     *            <code>TLS_1_0</code> and <code>TLS_1_2</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SecurityPolicy
     */
    public CreateDomainNameRequest withSecurityPolicy(String securityPolicy) {
        this.securityPolicy = securityPolicy;
        return this;
    }

    /**
     * <p>
     * The Transport Layer Security (TLS) version + cipher suite for this
     * <a>DomainName</a>. The valid values are <code>TLS_1_0</code> and
     * <code>TLS_1_2</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TLS_1_0, TLS_1_2
     *
     * @param securityPolicy <p>
     *            The Transport Layer Security (TLS) version + cipher suite for
     *            this <a>DomainName</a>. The valid values are
     *            <code>TLS_1_0</code> and <code>TLS_1_2</code>.
     *            </p>
     * @see SecurityPolicy
     */
    public void setSecurityPolicy(SecurityPolicy securityPolicy) {
        this.securityPolicy = securityPolicy.toString();
    }

    /**
     * <p>
     * The Transport Layer Security (TLS) version + cipher suite for this
     * <a>DomainName</a>. The valid values are <code>TLS_1_0</code> and
     * <code>TLS_1_2</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TLS_1_0, TLS_1_2
     *
     * @param securityPolicy <p>
     *            The Transport Layer Security (TLS) version + cipher suite for
     *            this <a>DomainName</a>. The valid values are
     *            <code>TLS_1_0</code> and <code>TLS_1_2</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SecurityPolicy
     */
    public CreateDomainNameRequest withSecurityPolicy(SecurityPolicy securityPolicy) {
        this.securityPolicy = securityPolicy.toString();
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
        if (getDomainName() != null)
            sb.append("domainName: " + getDomainName() + ",");
        if (getCertificateName() != null)
            sb.append("certificateName: " + getCertificateName() + ",");
        if (getCertificateBody() != null)
            sb.append("certificateBody: " + getCertificateBody() + ",");
        if (getCertificatePrivateKey() != null)
            sb.append("certificatePrivateKey: " + getCertificatePrivateKey() + ",");
        if (getCertificateChain() != null)
            sb.append("certificateChain: " + getCertificateChain() + ",");
        if (getCertificateArn() != null)
            sb.append("certificateArn: " + getCertificateArn() + ",");
        if (getRegionalCertificateName() != null)
            sb.append("regionalCertificateName: " + getRegionalCertificateName() + ",");
        if (getRegionalCertificateArn() != null)
            sb.append("regionalCertificateArn: " + getRegionalCertificateArn() + ",");
        if (getEndpointConfiguration() != null)
            sb.append("endpointConfiguration: " + getEndpointConfiguration() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getSecurityPolicy() != null)
            sb.append("securityPolicy: " + getSecurityPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateName() == null) ? 0 : getCertificateName().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateBody() == null) ? 0 : getCertificateBody().hashCode());
        hashCode = prime
                * hashCode
                + ((getCertificatePrivateKey() == null) ? 0 : getCertificatePrivateKey().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateChain() == null) ? 0 : getCertificateChain().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getRegionalCertificateName() == null) ? 0 : getRegionalCertificateName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRegionalCertificateArn() == null) ? 0 : getRegionalCertificateArn()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEndpointConfiguration() == null) ? 0 : getEndpointConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityPolicy() == null) ? 0 : getSecurityPolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDomainNameRequest == false)
            return false;
        CreateDomainNameRequest other = (CreateDomainNameRequest) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getCertificateName() == null ^ this.getCertificateName() == null)
            return false;
        if (other.getCertificateName() != null
                && other.getCertificateName().equals(this.getCertificateName()) == false)
            return false;
        if (other.getCertificateBody() == null ^ this.getCertificateBody() == null)
            return false;
        if (other.getCertificateBody() != null
                && other.getCertificateBody().equals(this.getCertificateBody()) == false)
            return false;
        if (other.getCertificatePrivateKey() == null ^ this.getCertificatePrivateKey() == null)
            return false;
        if (other.getCertificatePrivateKey() != null
                && other.getCertificatePrivateKey().equals(this.getCertificatePrivateKey()) == false)
            return false;
        if (other.getCertificateChain() == null ^ this.getCertificateChain() == null)
            return false;
        if (other.getCertificateChain() != null
                && other.getCertificateChain().equals(this.getCertificateChain()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null
                && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getRegionalCertificateName() == null ^ this.getRegionalCertificateName() == null)
            return false;
        if (other.getRegionalCertificateName() != null
                && other.getRegionalCertificateName().equals(this.getRegionalCertificateName()) == false)
            return false;
        if (other.getRegionalCertificateArn() == null ^ this.getRegionalCertificateArn() == null)
            return false;
        if (other.getRegionalCertificateArn() != null
                && other.getRegionalCertificateArn().equals(this.getRegionalCertificateArn()) == false)
            return false;
        if (other.getEndpointConfiguration() == null ^ this.getEndpointConfiguration() == null)
            return false;
        if (other.getEndpointConfiguration() != null
                && other.getEndpointConfiguration().equals(this.getEndpointConfiguration()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSecurityPolicy() == null ^ this.getSecurityPolicy() == null)
            return false;
        if (other.getSecurityPolicy() != null
                && other.getSecurityPolicy().equals(this.getSecurityPolicy()) == false)
            return false;
        return true;
    }
}
