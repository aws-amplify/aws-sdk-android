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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an Elasticsearch domain.
 * </p>
 */
public class AwsElasticsearchDomainDetails implements Serializable {
    /**
     * <p>
     * IAM policy document specifying the access policies for the new Amazon ES
     * domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String accessPolicies;

    /**
     * <p>
     * Additional options for the domain endpoint.
     * </p>
     */
    private AwsElasticsearchDomainDomainEndpointOptions domainEndpointOptions;

    /**
     * <p>
     * Unique identifier for an Amazon ES domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String domainId;

    /**
     * <p>
     * Name of an Amazon ES domain.
     * </p>
     * <p>
     * Domain names are unique across all domains owned by the same account
     * within an AWS Region.
     * </p>
     * <p>
     * Domain names must start with a lowercase letter and must be between 3 and
     * 28 characters.
     * </p>
     * <p>
     * Valid characters are a-z (lowercase only), 0-9, and – (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String domainName;

    /**
     * <p>
     * Domain-specific endpoint used to submit index, search, and data upload
     * requests to an Amazon ES domain.
     * </p>
     * <p>
     * The endpoint is a service URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String endpoint;

    /**
     * <p>
     * The key-value pair that exists if the Amazon ES domain uses VPC
     * endpoints.
     * </p>
     */
    private java.util.Map<String, String> endpoints;

    /**
     * <p>
     * Elasticsearch version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String elasticsearchVersion;

    /**
     * <p>
     * Details about the configuration for encryption at rest.
     * </p>
     */
    private AwsElasticsearchDomainEncryptionAtRestOptions encryptionAtRestOptions;

    /**
     * <p>
     * Details about the configuration for node-to-node encryption.
     * </p>
     */
    private AwsElasticsearchDomainNodeToNodeEncryptionOptions nodeToNodeEncryptionOptions;

    /**
     * <p>
     * Information that Amazon ES derives based on <code>VPCOptions</code> for
     * the domain.
     * </p>
     */
    private AwsElasticsearchDomainVPCOptions vPCOptions;

    /**
     * <p>
     * IAM policy document specifying the access policies for the new Amazon ES
     * domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         IAM policy document specifying the access policies for the new
     *         Amazon ES domain.
     *         </p>
     */
    public String getAccessPolicies() {
        return accessPolicies;
    }

    /**
     * <p>
     * IAM policy document specifying the access policies for the new Amazon ES
     * domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param accessPolicies <p>
     *            IAM policy document specifying the access policies for the new
     *            Amazon ES domain.
     *            </p>
     */
    public void setAccessPolicies(String accessPolicies) {
        this.accessPolicies = accessPolicies;
    }

    /**
     * <p>
     * IAM policy document specifying the access policies for the new Amazon ES
     * domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param accessPolicies <p>
     *            IAM policy document specifying the access policies for the new
     *            Amazon ES domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElasticsearchDomainDetails withAccessPolicies(String accessPolicies) {
        this.accessPolicies = accessPolicies;
        return this;
    }

    /**
     * <p>
     * Additional options for the domain endpoint.
     * </p>
     *
     * @return <p>
     *         Additional options for the domain endpoint.
     *         </p>
     */
    public AwsElasticsearchDomainDomainEndpointOptions getDomainEndpointOptions() {
        return domainEndpointOptions;
    }

    /**
     * <p>
     * Additional options for the domain endpoint.
     * </p>
     *
     * @param domainEndpointOptions <p>
     *            Additional options for the domain endpoint.
     *            </p>
     */
    public void setDomainEndpointOptions(
            AwsElasticsearchDomainDomainEndpointOptions domainEndpointOptions) {
        this.domainEndpointOptions = domainEndpointOptions;
    }

    /**
     * <p>
     * Additional options for the domain endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainEndpointOptions <p>
     *            Additional options for the domain endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElasticsearchDomainDetails withDomainEndpointOptions(
            AwsElasticsearchDomainDomainEndpointOptions domainEndpointOptions) {
        this.domainEndpointOptions = domainEndpointOptions;
        return this;
    }

    /**
     * <p>
     * Unique identifier for an Amazon ES domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Unique identifier for an Amazon ES domain.
     *         </p>
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * <p>
     * Unique identifier for an Amazon ES domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param domainId <p>
     *            Unique identifier for an Amazon ES domain.
     *            </p>
     */
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * Unique identifier for an Amazon ES domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param domainId <p>
     *            Unique identifier for an Amazon ES domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElasticsearchDomainDetails withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * <p>
     * Name of an Amazon ES domain.
     * </p>
     * <p>
     * Domain names are unique across all domains owned by the same account
     * within an AWS Region.
     * </p>
     * <p>
     * Domain names must start with a lowercase letter and must be between 3 and
     * 28 characters.
     * </p>
     * <p>
     * Valid characters are a-z (lowercase only), 0-9, and – (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Name of an Amazon ES domain.
     *         </p>
     *         <p>
     *         Domain names are unique across all domains owned by the same
     *         account within an AWS Region.
     *         </p>
     *         <p>
     *         Domain names must start with a lowercase letter and must be
     *         between 3 and 28 characters.
     *         </p>
     *         <p>
     *         Valid characters are a-z (lowercase only), 0-9, and – (hyphen).
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * Name of an Amazon ES domain.
     * </p>
     * <p>
     * Domain names are unique across all domains owned by the same account
     * within an AWS Region.
     * </p>
     * <p>
     * Domain names must start with a lowercase letter and must be between 3 and
     * 28 characters.
     * </p>
     * <p>
     * Valid characters are a-z (lowercase only), 0-9, and – (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param domainName <p>
     *            Name of an Amazon ES domain.
     *            </p>
     *            <p>
     *            Domain names are unique across all domains owned by the same
     *            account within an AWS Region.
     *            </p>
     *            <p>
     *            Domain names must start with a lowercase letter and must be
     *            between 3 and 28 characters.
     *            </p>
     *            <p>
     *            Valid characters are a-z (lowercase only), 0-9, and –
     *            (hyphen).
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * Name of an Amazon ES domain.
     * </p>
     * <p>
     * Domain names are unique across all domains owned by the same account
     * within an AWS Region.
     * </p>
     * <p>
     * Domain names must start with a lowercase letter and must be between 3 and
     * 28 characters.
     * </p>
     * <p>
     * Valid characters are a-z (lowercase only), 0-9, and – (hyphen).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param domainName <p>
     *            Name of an Amazon ES domain.
     *            </p>
     *            <p>
     *            Domain names are unique across all domains owned by the same
     *            account within an AWS Region.
     *            </p>
     *            <p>
     *            Domain names must start with a lowercase letter and must be
     *            between 3 and 28 characters.
     *            </p>
     *            <p>
     *            Valid characters are a-z (lowercase only), 0-9, and –
     *            (hyphen).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElasticsearchDomainDetails withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * Domain-specific endpoint used to submit index, search, and data upload
     * requests to an Amazon ES domain.
     * </p>
     * <p>
     * The endpoint is a service URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Domain-specific endpoint used to submit index, search, and data
     *         upload requests to an Amazon ES domain.
     *         </p>
     *         <p>
     *         The endpoint is a service URL.
     *         </p>
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * <p>
     * Domain-specific endpoint used to submit index, search, and data upload
     * requests to an Amazon ES domain.
     * </p>
     * <p>
     * The endpoint is a service URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param endpoint <p>
     *            Domain-specific endpoint used to submit index, search, and
     *            data upload requests to an Amazon ES domain.
     *            </p>
     *            <p>
     *            The endpoint is a service URL.
     *            </p>
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * Domain-specific endpoint used to submit index, search, and data upload
     * requests to an Amazon ES domain.
     * </p>
     * <p>
     * The endpoint is a service URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param endpoint <p>
     *            Domain-specific endpoint used to submit index, search, and
     *            data upload requests to an Amazon ES domain.
     *            </p>
     *            <p>
     *            The endpoint is a service URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElasticsearchDomainDetails withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * <p>
     * The key-value pair that exists if the Amazon ES domain uses VPC
     * endpoints.
     * </p>
     *
     * @return <p>
     *         The key-value pair that exists if the Amazon ES domain uses VPC
     *         endpoints.
     *         </p>
     */
    public java.util.Map<String, String> getEndpoints() {
        return endpoints;
    }

    /**
     * <p>
     * The key-value pair that exists if the Amazon ES domain uses VPC
     * endpoints.
     * </p>
     *
     * @param endpoints <p>
     *            The key-value pair that exists if the Amazon ES domain uses
     *            VPC endpoints.
     *            </p>
     */
    public void setEndpoints(java.util.Map<String, String> endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * <p>
     * The key-value pair that exists if the Amazon ES domain uses VPC
     * endpoints.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoints <p>
     *            The key-value pair that exists if the Amazon ES domain uses
     *            VPC endpoints.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElasticsearchDomainDetails withEndpoints(java.util.Map<String, String> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * <p>
     * The key-value pair that exists if the Amazon ES domain uses VPC
     * endpoints.
     * </p>
     * <p>
     * The method adds a new key-value pair into Endpoints parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Endpoints.
     * @param value The corresponding value of the entry to be added into
     *            Endpoints.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElasticsearchDomainDetails addEndpointsEntry(String key, String value) {
        if (null == this.endpoints) {
            this.endpoints = new java.util.HashMap<String, String>();
        }
        if (this.endpoints.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.endpoints.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Endpoints.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public AwsElasticsearchDomainDetails clearEndpointsEntries() {
        this.endpoints = null;
        return this;
    }

    /**
     * <p>
     * Elasticsearch version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Elasticsearch version.
     *         </p>
     */
    public String getElasticsearchVersion() {
        return elasticsearchVersion;
    }

    /**
     * <p>
     * Elasticsearch version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param elasticsearchVersion <p>
     *            Elasticsearch version.
     *            </p>
     */
    public void setElasticsearchVersion(String elasticsearchVersion) {
        this.elasticsearchVersion = elasticsearchVersion;
    }

    /**
     * <p>
     * Elasticsearch version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param elasticsearchVersion <p>
     *            Elasticsearch version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElasticsearchDomainDetails withElasticsearchVersion(String elasticsearchVersion) {
        this.elasticsearchVersion = elasticsearchVersion;
        return this;
    }

    /**
     * <p>
     * Details about the configuration for encryption at rest.
     * </p>
     *
     * @return <p>
     *         Details about the configuration for encryption at rest.
     *         </p>
     */
    public AwsElasticsearchDomainEncryptionAtRestOptions getEncryptionAtRestOptions() {
        return encryptionAtRestOptions;
    }

    /**
     * <p>
     * Details about the configuration for encryption at rest.
     * </p>
     *
     * @param encryptionAtRestOptions <p>
     *            Details about the configuration for encryption at rest.
     *            </p>
     */
    public void setEncryptionAtRestOptions(
            AwsElasticsearchDomainEncryptionAtRestOptions encryptionAtRestOptions) {
        this.encryptionAtRestOptions = encryptionAtRestOptions;
    }

    /**
     * <p>
     * Details about the configuration for encryption at rest.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionAtRestOptions <p>
     *            Details about the configuration for encryption at rest.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElasticsearchDomainDetails withEncryptionAtRestOptions(
            AwsElasticsearchDomainEncryptionAtRestOptions encryptionAtRestOptions) {
        this.encryptionAtRestOptions = encryptionAtRestOptions;
        return this;
    }

    /**
     * <p>
     * Details about the configuration for node-to-node encryption.
     * </p>
     *
     * @return <p>
     *         Details about the configuration for node-to-node encryption.
     *         </p>
     */
    public AwsElasticsearchDomainNodeToNodeEncryptionOptions getNodeToNodeEncryptionOptions() {
        return nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * Details about the configuration for node-to-node encryption.
     * </p>
     *
     * @param nodeToNodeEncryptionOptions <p>
     *            Details about the configuration for node-to-node encryption.
     *            </p>
     */
    public void setNodeToNodeEncryptionOptions(
            AwsElasticsearchDomainNodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
        this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * Details about the configuration for node-to-node encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeToNodeEncryptionOptions <p>
     *            Details about the configuration for node-to-node encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElasticsearchDomainDetails withNodeToNodeEncryptionOptions(
            AwsElasticsearchDomainNodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
        this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
        return this;
    }

    /**
     * <p>
     * Information that Amazon ES derives based on <code>VPCOptions</code> for
     * the domain.
     * </p>
     *
     * @return <p>
     *         Information that Amazon ES derives based on
     *         <code>VPCOptions</code> for the domain.
     *         </p>
     */
    public AwsElasticsearchDomainVPCOptions getVPCOptions() {
        return vPCOptions;
    }

    /**
     * <p>
     * Information that Amazon ES derives based on <code>VPCOptions</code> for
     * the domain.
     * </p>
     *
     * @param vPCOptions <p>
     *            Information that Amazon ES derives based on
     *            <code>VPCOptions</code> for the domain.
     *            </p>
     */
    public void setVPCOptions(AwsElasticsearchDomainVPCOptions vPCOptions) {
        this.vPCOptions = vPCOptions;
    }

    /**
     * <p>
     * Information that Amazon ES derives based on <code>VPCOptions</code> for
     * the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vPCOptions <p>
     *            Information that Amazon ES derives based on
     *            <code>VPCOptions</code> for the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsElasticsearchDomainDetails withVPCOptions(AwsElasticsearchDomainVPCOptions vPCOptions) {
        this.vPCOptions = vPCOptions;
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
        if (getAccessPolicies() != null)
            sb.append("AccessPolicies: " + getAccessPolicies() + ",");
        if (getDomainEndpointOptions() != null)
            sb.append("DomainEndpointOptions: " + getDomainEndpointOptions() + ",");
        if (getDomainId() != null)
            sb.append("DomainId: " + getDomainId() + ",");
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getEndpoint() != null)
            sb.append("Endpoint: " + getEndpoint() + ",");
        if (getEndpoints() != null)
            sb.append("Endpoints: " + getEndpoints() + ",");
        if (getElasticsearchVersion() != null)
            sb.append("ElasticsearchVersion: " + getElasticsearchVersion() + ",");
        if (getEncryptionAtRestOptions() != null)
            sb.append("EncryptionAtRestOptions: " + getEncryptionAtRestOptions() + ",");
        if (getNodeToNodeEncryptionOptions() != null)
            sb.append("NodeToNodeEncryptionOptions: " + getNodeToNodeEncryptionOptions() + ",");
        if (getVPCOptions() != null)
            sb.append("VPCOptions: " + getVPCOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccessPolicies() == null) ? 0 : getAccessPolicies().hashCode());
        hashCode = prime
                * hashCode
                + ((getDomainEndpointOptions() == null) ? 0 : getDomainEndpointOptions().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        hashCode = prime * hashCode
                + ((getElasticsearchVersion() == null) ? 0 : getElasticsearchVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getEncryptionAtRestOptions() == null) ? 0 : getEncryptionAtRestOptions()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getNodeToNodeEncryptionOptions() == null) ? 0
                        : getNodeToNodeEncryptionOptions().hashCode());
        hashCode = prime * hashCode + ((getVPCOptions() == null) ? 0 : getVPCOptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsElasticsearchDomainDetails == false)
            return false;
        AwsElasticsearchDomainDetails other = (AwsElasticsearchDomainDetails) obj;

        if (other.getAccessPolicies() == null ^ this.getAccessPolicies() == null)
            return false;
        if (other.getAccessPolicies() != null
                && other.getAccessPolicies().equals(this.getAccessPolicies()) == false)
            return false;
        if (other.getDomainEndpointOptions() == null ^ this.getDomainEndpointOptions() == null)
            return false;
        if (other.getDomainEndpointOptions() != null
                && other.getDomainEndpointOptions().equals(this.getDomainEndpointOptions()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null
                && other.getEndpoints().equals(this.getEndpoints()) == false)
            return false;
        if (other.getElasticsearchVersion() == null ^ this.getElasticsearchVersion() == null)
            return false;
        if (other.getElasticsearchVersion() != null
                && other.getElasticsearchVersion().equals(this.getElasticsearchVersion()) == false)
            return false;
        if (other.getEncryptionAtRestOptions() == null ^ this.getEncryptionAtRestOptions() == null)
            return false;
        if (other.getEncryptionAtRestOptions() != null
                && other.getEncryptionAtRestOptions().equals(this.getEncryptionAtRestOptions()) == false)
            return false;
        if (other.getNodeToNodeEncryptionOptions() == null
                ^ this.getNodeToNodeEncryptionOptions() == null)
            return false;
        if (other.getNodeToNodeEncryptionOptions() != null
                && other.getNodeToNodeEncryptionOptions().equals(
                        this.getNodeToNodeEncryptionOptions()) == false)
            return false;
        if (other.getVPCOptions() == null ^ this.getVPCOptions() == null)
            return false;
        if (other.getVPCOptions() != null
                && other.getVPCOptions().equals(this.getVPCOptions()) == false)
            return false;
        return true;
    }
}
