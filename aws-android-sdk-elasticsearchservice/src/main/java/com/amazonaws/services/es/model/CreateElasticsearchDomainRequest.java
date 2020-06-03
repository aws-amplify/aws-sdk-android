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

package com.amazonaws.services.es.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new Elasticsearch domain. For more information, see <a href=
 * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomains"
 * target="_blank">Creating Elasticsearch Domains</a> in the <i>Amazon
 * Elasticsearch Service Developer Guide</i>.
 * </p>
 */
public class CreateElasticsearchDomainRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the Elasticsearch domain that you are creating. Domain names
     * are unique across the domains owned by an account within an AWS region.
     * Domain names must start with a lowercase letter and can contain the
     * following characters: a-z (lowercase), 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     */
    private String domainName;

    /**
     * <p>
     * String of format X.Y to specify version for the Elasticsearch domain eg.
     * "1.5" or "2.3". For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomains"
     * target="_blank">Creating Elasticsearch Domains</a> in the <i>Amazon
     * Elasticsearch Service Developer Guide</i>.
     * </p>
     */
    private String elasticsearchVersion;

    /**
     * <p>
     * Configuration options for an Elasticsearch domain. Specifies the instance
     * type and number of instances in the domain cluster.
     * </p>
     */
    private ElasticsearchClusterConfig elasticsearchClusterConfig;

    /**
     * <p>
     * Options to enable, disable and specify the type and size of EBS storage
     * volumes.
     * </p>
     */
    private EBSOptions eBSOptions;

    /**
     * <p>
     * IAM access policy as a JSON-formatted string.
     * </p>
     */
    private String accessPolicies;

    /**
     * <p>
     * Option to set time, in UTC format, of the daily automated snapshot.
     * Default value is 0 hours.
     * </p>
     */
    private SnapshotOptions snapshotOptions;

    /**
     * <p>
     * Options to specify the subnets and security groups for VPC endpoint. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-creating-vpc"
     * target="_blank">Creating a VPC</a> in <i>VPC Endpoints for Amazon
     * Elasticsearch Service Domains</i>
     * </p>
     */
    private VPCOptions vPCOptions;

    /**
     * <p>
     * Options to specify the Cognito user and identity pools for Kibana
     * authentication. For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     * target="_blank">Amazon Cognito Authentication for Kibana</a>.
     * </p>
     */
    private CognitoOptions cognitoOptions;

    /**
     * <p>
     * Specifies the Encryption At Rest Options.
     * </p>
     */
    private EncryptionAtRestOptions encryptionAtRestOptions;

    /**
     * <p>
     * Specifies the NodeToNodeEncryptionOptions.
     * </p>
     */
    private NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions;

    /**
     * <p>
     * Option to allow references to indices in an HTTP request body. Must be
     * <code>false</code> when configuring access to individual sub-resources.
     * By default, the value is <code>true</code>. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     * target="_blank">Configuration Advanced Options</a> for more information.
     * </p>
     */
    private java.util.Map<String, String> advancedOptions;

    /**
     * <p>
     * Map of <code>LogType</code> and <code>LogPublishingOption</code>, each
     * containing options to publish a given type of Elasticsearch log.
     * </p>
     */
    private java.util.Map<String, LogPublishingOption> logPublishingOptions;

    /**
     * <p>
     * Options to specify configuration that will be applied to the domain
     * endpoint.
     * </p>
     */
    private DomainEndpointOptions domainEndpointOptions;

    /**
     * <p>
     * Specifies advanced security options.
     * </p>
     */
    private AdvancedSecurityOptionsInput advancedSecurityOptions;

    /**
     * <p>
     * The name of the Elasticsearch domain that you are creating. Domain names
     * are unique across the domains owned by an account within an AWS region.
     * Domain names must start with a lowercase letter and can contain the
     * following characters: a-z (lowercase), 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @return <p>
     *         The name of the Elasticsearch domain that you are creating.
     *         Domain names are unique across the domains owned by an account
     *         within an AWS region. Domain names must start with a lowercase
     *         letter and can contain the following characters: a-z (lowercase),
     *         0-9, and - (hyphen).
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of the Elasticsearch domain that you are creating. Domain names
     * are unique across the domains owned by an account within an AWS region.
     * Domain names must start with a lowercase letter and can contain the
     * following characters: a-z (lowercase), 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName <p>
     *            The name of the Elasticsearch domain that you are creating.
     *            Domain names are unique across the domains owned by an account
     *            within an AWS region. Domain names must start with a lowercase
     *            letter and can contain the following characters: a-z
     *            (lowercase), 0-9, and - (hyphen).
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the Elasticsearch domain that you are creating. Domain names
     * are unique across the domains owned by an account within an AWS region.
     * Domain names must start with a lowercase letter and can contain the
     * following characters: a-z (lowercase), 0-9, and - (hyphen).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName <p>
     *            The name of the Elasticsearch domain that you are creating.
     *            Domain names are unique across the domains owned by an account
     *            within an AWS region. Domain names must start with a lowercase
     *            letter and can contain the following characters: a-z
     *            (lowercase), 0-9, and - (hyphen).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateElasticsearchDomainRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * String of format X.Y to specify version for the Elasticsearch domain eg.
     * "1.5" or "2.3". For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomains"
     * target="_blank">Creating Elasticsearch Domains</a> in the <i>Amazon
     * Elasticsearch Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         String of format X.Y to specify version for the Elasticsearch
     *         domain eg. "1.5" or "2.3". For more information, see <a href=
     *         "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomains"
     *         target="_blank">Creating Elasticsearch Domains</a> in the
     *         <i>Amazon Elasticsearch Service Developer Guide</i>.
     *         </p>
     */
    public String getElasticsearchVersion() {
        return elasticsearchVersion;
    }

    /**
     * <p>
     * String of format X.Y to specify version for the Elasticsearch domain eg.
     * "1.5" or "2.3". For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomains"
     * target="_blank">Creating Elasticsearch Domains</a> in the <i>Amazon
     * Elasticsearch Service Developer Guide</i>.
     * </p>
     *
     * @param elasticsearchVersion <p>
     *            String of format X.Y to specify version for the Elasticsearch
     *            domain eg. "1.5" or "2.3". For more information, see <a href=
     *            "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomains"
     *            target="_blank">Creating Elasticsearch Domains</a> in the
     *            <i>Amazon Elasticsearch Service Developer Guide</i>.
     *            </p>
     */
    public void setElasticsearchVersion(String elasticsearchVersion) {
        this.elasticsearchVersion = elasticsearchVersion;
    }

    /**
     * <p>
     * String of format X.Y to specify version for the Elasticsearch domain eg.
     * "1.5" or "2.3". For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomains"
     * target="_blank">Creating Elasticsearch Domains</a> in the <i>Amazon
     * Elasticsearch Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticsearchVersion <p>
     *            String of format X.Y to specify version for the Elasticsearch
     *            domain eg. "1.5" or "2.3". For more information, see <a href=
     *            "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomains"
     *            target="_blank">Creating Elasticsearch Domains</a> in the
     *            <i>Amazon Elasticsearch Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateElasticsearchDomainRequest withElasticsearchVersion(String elasticsearchVersion) {
        this.elasticsearchVersion = elasticsearchVersion;
        return this;
    }

    /**
     * <p>
     * Configuration options for an Elasticsearch domain. Specifies the instance
     * type and number of instances in the domain cluster.
     * </p>
     *
     * @return <p>
     *         Configuration options for an Elasticsearch domain. Specifies the
     *         instance type and number of instances in the domain cluster.
     *         </p>
     */
    public ElasticsearchClusterConfig getElasticsearchClusterConfig() {
        return elasticsearchClusterConfig;
    }

    /**
     * <p>
     * Configuration options for an Elasticsearch domain. Specifies the instance
     * type and number of instances in the domain cluster.
     * </p>
     *
     * @param elasticsearchClusterConfig <p>
     *            Configuration options for an Elasticsearch domain. Specifies
     *            the instance type and number of instances in the domain
     *            cluster.
     *            </p>
     */
    public void setElasticsearchClusterConfig(ElasticsearchClusterConfig elasticsearchClusterConfig) {
        this.elasticsearchClusterConfig = elasticsearchClusterConfig;
    }

    /**
     * <p>
     * Configuration options for an Elasticsearch domain. Specifies the instance
     * type and number of instances in the domain cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticsearchClusterConfig <p>
     *            Configuration options for an Elasticsearch domain. Specifies
     *            the instance type and number of instances in the domain
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateElasticsearchDomainRequest withElasticsearchClusterConfig(
            ElasticsearchClusterConfig elasticsearchClusterConfig) {
        this.elasticsearchClusterConfig = elasticsearchClusterConfig;
        return this;
    }

    /**
     * <p>
     * Options to enable, disable and specify the type and size of EBS storage
     * volumes.
     * </p>
     *
     * @return <p>
     *         Options to enable, disable and specify the type and size of EBS
     *         storage volumes.
     *         </p>
     */
    public EBSOptions getEBSOptions() {
        return eBSOptions;
    }

    /**
     * <p>
     * Options to enable, disable and specify the type and size of EBS storage
     * volumes.
     * </p>
     *
     * @param eBSOptions <p>
     *            Options to enable, disable and specify the type and size of
     *            EBS storage volumes.
     *            </p>
     */
    public void setEBSOptions(EBSOptions eBSOptions) {
        this.eBSOptions = eBSOptions;
    }

    /**
     * <p>
     * Options to enable, disable and specify the type and size of EBS storage
     * volumes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eBSOptions <p>
     *            Options to enable, disable and specify the type and size of
     *            EBS storage volumes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateElasticsearchDomainRequest withEBSOptions(EBSOptions eBSOptions) {
        this.eBSOptions = eBSOptions;
        return this;
    }

    /**
     * <p>
     * IAM access policy as a JSON-formatted string.
     * </p>
     *
     * @return <p>
     *         IAM access policy as a JSON-formatted string.
     *         </p>
     */
    public String getAccessPolicies() {
        return accessPolicies;
    }

    /**
     * <p>
     * IAM access policy as a JSON-formatted string.
     * </p>
     *
     * @param accessPolicies <p>
     *            IAM access policy as a JSON-formatted string.
     *            </p>
     */
    public void setAccessPolicies(String accessPolicies) {
        this.accessPolicies = accessPolicies;
    }

    /**
     * <p>
     * IAM access policy as a JSON-formatted string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessPolicies <p>
     *            IAM access policy as a JSON-formatted string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateElasticsearchDomainRequest withAccessPolicies(String accessPolicies) {
        this.accessPolicies = accessPolicies;
        return this;
    }

    /**
     * <p>
     * Option to set time, in UTC format, of the daily automated snapshot.
     * Default value is 0 hours.
     * </p>
     *
     * @return <p>
     *         Option to set time, in UTC format, of the daily automated
     *         snapshot. Default value is 0 hours.
     *         </p>
     */
    public SnapshotOptions getSnapshotOptions() {
        return snapshotOptions;
    }

    /**
     * <p>
     * Option to set time, in UTC format, of the daily automated snapshot.
     * Default value is 0 hours.
     * </p>
     *
     * @param snapshotOptions <p>
     *            Option to set time, in UTC format, of the daily automated
     *            snapshot. Default value is 0 hours.
     *            </p>
     */
    public void setSnapshotOptions(SnapshotOptions snapshotOptions) {
        this.snapshotOptions = snapshotOptions;
    }

    /**
     * <p>
     * Option to set time, in UTC format, of the daily automated snapshot.
     * Default value is 0 hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotOptions <p>
     *            Option to set time, in UTC format, of the daily automated
     *            snapshot. Default value is 0 hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateElasticsearchDomainRequest withSnapshotOptions(SnapshotOptions snapshotOptions) {
        this.snapshotOptions = snapshotOptions;
        return this;
    }

    /**
     * <p>
     * Options to specify the subnets and security groups for VPC endpoint. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-creating-vpc"
     * target="_blank">Creating a VPC</a> in <i>VPC Endpoints for Amazon
     * Elasticsearch Service Domains</i>
     * </p>
     *
     * @return <p>
     *         Options to specify the subnets and security groups for VPC
     *         endpoint. For more information, see <a href=
     *         "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-creating-vpc"
     *         target="_blank">Creating a VPC</a> in <i>VPC Endpoints for Amazon
     *         Elasticsearch Service Domains</i>
     *         </p>
     */
    public VPCOptions getVPCOptions() {
        return vPCOptions;
    }

    /**
     * <p>
     * Options to specify the subnets and security groups for VPC endpoint. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-creating-vpc"
     * target="_blank">Creating a VPC</a> in <i>VPC Endpoints for Amazon
     * Elasticsearch Service Domains</i>
     * </p>
     *
     * @param vPCOptions <p>
     *            Options to specify the subnets and security groups for VPC
     *            endpoint. For more information, see <a href=
     *            "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-creating-vpc"
     *            target="_blank">Creating a VPC</a> in <i>VPC Endpoints for
     *            Amazon Elasticsearch Service Domains</i>
     *            </p>
     */
    public void setVPCOptions(VPCOptions vPCOptions) {
        this.vPCOptions = vPCOptions;
    }

    /**
     * <p>
     * Options to specify the subnets and security groups for VPC endpoint. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-creating-vpc"
     * target="_blank">Creating a VPC</a> in <i>VPC Endpoints for Amazon
     * Elasticsearch Service Domains</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vPCOptions <p>
     *            Options to specify the subnets and security groups for VPC
     *            endpoint. For more information, see <a href=
     *            "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-creating-vpc"
     *            target="_blank">Creating a VPC</a> in <i>VPC Endpoints for
     *            Amazon Elasticsearch Service Domains</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateElasticsearchDomainRequest withVPCOptions(VPCOptions vPCOptions) {
        this.vPCOptions = vPCOptions;
        return this;
    }

    /**
     * <p>
     * Options to specify the Cognito user and identity pools for Kibana
     * authentication. For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     * target="_blank">Amazon Cognito Authentication for Kibana</a>.
     * </p>
     *
     * @return <p>
     *         Options to specify the Cognito user and identity pools for Kibana
     *         authentication. For more information, see <a href=
     *         "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     *         target="_blank">Amazon Cognito Authentication for Kibana</a>.
     *         </p>
     */
    public CognitoOptions getCognitoOptions() {
        return cognitoOptions;
    }

    /**
     * <p>
     * Options to specify the Cognito user and identity pools for Kibana
     * authentication. For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     * target="_blank">Amazon Cognito Authentication for Kibana</a>.
     * </p>
     *
     * @param cognitoOptions <p>
     *            Options to specify the Cognito user and identity pools for
     *            Kibana authentication. For more information, see <a href=
     *            "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     *            target="_blank">Amazon Cognito Authentication for Kibana</a>.
     *            </p>
     */
    public void setCognitoOptions(CognitoOptions cognitoOptions) {
        this.cognitoOptions = cognitoOptions;
    }

    /**
     * <p>
     * Options to specify the Cognito user and identity pools for Kibana
     * authentication. For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     * target="_blank">Amazon Cognito Authentication for Kibana</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cognitoOptions <p>
     *            Options to specify the Cognito user and identity pools for
     *            Kibana authentication. For more information, see <a href=
     *            "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     *            target="_blank">Amazon Cognito Authentication for Kibana</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateElasticsearchDomainRequest withCognitoOptions(CognitoOptions cognitoOptions) {
        this.cognitoOptions = cognitoOptions;
        return this;
    }

    /**
     * <p>
     * Specifies the Encryption At Rest Options.
     * </p>
     *
     * @return <p>
     *         Specifies the Encryption At Rest Options.
     *         </p>
     */
    public EncryptionAtRestOptions getEncryptionAtRestOptions() {
        return encryptionAtRestOptions;
    }

    /**
     * <p>
     * Specifies the Encryption At Rest Options.
     * </p>
     *
     * @param encryptionAtRestOptions <p>
     *            Specifies the Encryption At Rest Options.
     *            </p>
     */
    public void setEncryptionAtRestOptions(EncryptionAtRestOptions encryptionAtRestOptions) {
        this.encryptionAtRestOptions = encryptionAtRestOptions;
    }

    /**
     * <p>
     * Specifies the Encryption At Rest Options.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionAtRestOptions <p>
     *            Specifies the Encryption At Rest Options.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateElasticsearchDomainRequest withEncryptionAtRestOptions(
            EncryptionAtRestOptions encryptionAtRestOptions) {
        this.encryptionAtRestOptions = encryptionAtRestOptions;
        return this;
    }

    /**
     * <p>
     * Specifies the NodeToNodeEncryptionOptions.
     * </p>
     *
     * @return <p>
     *         Specifies the NodeToNodeEncryptionOptions.
     *         </p>
     */
    public NodeToNodeEncryptionOptions getNodeToNodeEncryptionOptions() {
        return nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * Specifies the NodeToNodeEncryptionOptions.
     * </p>
     *
     * @param nodeToNodeEncryptionOptions <p>
     *            Specifies the NodeToNodeEncryptionOptions.
     *            </p>
     */
    public void setNodeToNodeEncryptionOptions(
            NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
        this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * Specifies the NodeToNodeEncryptionOptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeToNodeEncryptionOptions <p>
     *            Specifies the NodeToNodeEncryptionOptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateElasticsearchDomainRequest withNodeToNodeEncryptionOptions(
            NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
        this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
        return this;
    }

    /**
     * <p>
     * Option to allow references to indices in an HTTP request body. Must be
     * <code>false</code> when configuring access to individual sub-resources.
     * By default, the value is <code>true</code>. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     * target="_blank">Configuration Advanced Options</a> for more information.
     * </p>
     *
     * @return <p>
     *         Option to allow references to indices in an HTTP request body.
     *         Must be <code>false</code> when configuring access to individual
     *         sub-resources. By default, the value is <code>true</code>. See <a
     *         href=
     *         "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     *         target="_blank">Configuration Advanced Options</a> for more
     *         information.
     *         </p>
     */
    public java.util.Map<String, String> getAdvancedOptions() {
        return advancedOptions;
    }

    /**
     * <p>
     * Option to allow references to indices in an HTTP request body. Must be
     * <code>false</code> when configuring access to individual sub-resources.
     * By default, the value is <code>true</code>. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     * target="_blank">Configuration Advanced Options</a> for more information.
     * </p>
     *
     * @param advancedOptions <p>
     *            Option to allow references to indices in an HTTP request body.
     *            Must be <code>false</code> when configuring access to
     *            individual sub-resources. By default, the value is
     *            <code>true</code>. See <a href=
     *            "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     *            target="_blank">Configuration Advanced Options</a> for more
     *            information.
     *            </p>
     */
    public void setAdvancedOptions(java.util.Map<String, String> advancedOptions) {
        this.advancedOptions = advancedOptions;
    }

    /**
     * <p>
     * Option to allow references to indices in an HTTP request body. Must be
     * <code>false</code> when configuring access to individual sub-resources.
     * By default, the value is <code>true</code>. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     * target="_blank">Configuration Advanced Options</a> for more information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param advancedOptions <p>
     *            Option to allow references to indices in an HTTP request body.
     *            Must be <code>false</code> when configuring access to
     *            individual sub-resources. By default, the value is
     *            <code>true</code>. See <a href=
     *            "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     *            target="_blank">Configuration Advanced Options</a> for more
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateElasticsearchDomainRequest withAdvancedOptions(
            java.util.Map<String, String> advancedOptions) {
        this.advancedOptions = advancedOptions;
        return this;
    }

    /**
     * <p>
     * Option to allow references to indices in an HTTP request body. Must be
     * <code>false</code> when configuring access to individual sub-resources.
     * By default, the value is <code>true</code>. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     * target="_blank">Configuration Advanced Options</a> for more information.
     * </p>
     * <p>
     * The method adds a new key-value pair into AdvancedOptions parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into AdvancedOptions.
     * @param value The corresponding value of the entry to be added into
     *            AdvancedOptions.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateElasticsearchDomainRequest addAdvancedOptionsEntry(String key, String value) {
        if (null == this.advancedOptions) {
            this.advancedOptions = new java.util.HashMap<String, String>();
        }
        if (this.advancedOptions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.advancedOptions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdvancedOptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateElasticsearchDomainRequest clearAdvancedOptionsEntries() {
        this.advancedOptions = null;
        return this;
    }

    /**
     * <p>
     * Map of <code>LogType</code> and <code>LogPublishingOption</code>, each
     * containing options to publish a given type of Elasticsearch log.
     * </p>
     *
     * @return <p>
     *         Map of <code>LogType</code> and <code>LogPublishingOption</code>,
     *         each containing options to publish a given type of Elasticsearch
     *         log.
     *         </p>
     */
    public java.util.Map<String, LogPublishingOption> getLogPublishingOptions() {
        return logPublishingOptions;
    }

    /**
     * <p>
     * Map of <code>LogType</code> and <code>LogPublishingOption</code>, each
     * containing options to publish a given type of Elasticsearch log.
     * </p>
     *
     * @param logPublishingOptions <p>
     *            Map of <code>LogType</code> and
     *            <code>LogPublishingOption</code>, each containing options to
     *            publish a given type of Elasticsearch log.
     *            </p>
     */
    public void setLogPublishingOptions(
            java.util.Map<String, LogPublishingOption> logPublishingOptions) {
        this.logPublishingOptions = logPublishingOptions;
    }

    /**
     * <p>
     * Map of <code>LogType</code> and <code>LogPublishingOption</code>, each
     * containing options to publish a given type of Elasticsearch log.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logPublishingOptions <p>
     *            Map of <code>LogType</code> and
     *            <code>LogPublishingOption</code>, each containing options to
     *            publish a given type of Elasticsearch log.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateElasticsearchDomainRequest withLogPublishingOptions(
            java.util.Map<String, LogPublishingOption> logPublishingOptions) {
        this.logPublishingOptions = logPublishingOptions;
        return this;
    }

    /**
     * <p>
     * Map of <code>LogType</code> and <code>LogPublishingOption</code>, each
     * containing options to publish a given type of Elasticsearch log.
     * </p>
     * <p>
     * The method adds a new key-value pair into LogPublishingOptions parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into LogPublishingOptions.
     * @param value The corresponding value of the entry to be added into
     *            LogPublishingOptions.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateElasticsearchDomainRequest addLogPublishingOptionsEntry(String key,
            LogPublishingOption value) {
        if (null == this.logPublishingOptions) {
            this.logPublishingOptions = new java.util.HashMap<String, LogPublishingOption>();
        }
        if (this.logPublishingOptions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.logPublishingOptions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into LogPublishingOptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateElasticsearchDomainRequest clearLogPublishingOptionsEntries() {
        this.logPublishingOptions = null;
        return this;
    }

    /**
     * <p>
     * Options to specify configuration that will be applied to the domain
     * endpoint.
     * </p>
     *
     * @return <p>
     *         Options to specify configuration that will be applied to the
     *         domain endpoint.
     *         </p>
     */
    public DomainEndpointOptions getDomainEndpointOptions() {
        return domainEndpointOptions;
    }

    /**
     * <p>
     * Options to specify configuration that will be applied to the domain
     * endpoint.
     * </p>
     *
     * @param domainEndpointOptions <p>
     *            Options to specify configuration that will be applied to the
     *            domain endpoint.
     *            </p>
     */
    public void setDomainEndpointOptions(DomainEndpointOptions domainEndpointOptions) {
        this.domainEndpointOptions = domainEndpointOptions;
    }

    /**
     * <p>
     * Options to specify configuration that will be applied to the domain
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainEndpointOptions <p>
     *            Options to specify configuration that will be applied to the
     *            domain endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateElasticsearchDomainRequest withDomainEndpointOptions(
            DomainEndpointOptions domainEndpointOptions) {
        this.domainEndpointOptions = domainEndpointOptions;
        return this;
    }

    /**
     * <p>
     * Specifies advanced security options.
     * </p>
     *
     * @return <p>
     *         Specifies advanced security options.
     *         </p>
     */
    public AdvancedSecurityOptionsInput getAdvancedSecurityOptions() {
        return advancedSecurityOptions;
    }

    /**
     * <p>
     * Specifies advanced security options.
     * </p>
     *
     * @param advancedSecurityOptions <p>
     *            Specifies advanced security options.
     *            </p>
     */
    public void setAdvancedSecurityOptions(AdvancedSecurityOptionsInput advancedSecurityOptions) {
        this.advancedSecurityOptions = advancedSecurityOptions;
    }

    /**
     * <p>
     * Specifies advanced security options.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param advancedSecurityOptions <p>
     *            Specifies advanced security options.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateElasticsearchDomainRequest withAdvancedSecurityOptions(
            AdvancedSecurityOptionsInput advancedSecurityOptions) {
        this.advancedSecurityOptions = advancedSecurityOptions;
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
            sb.append("DomainName: " + getDomainName() + ",");
        if (getElasticsearchVersion() != null)
            sb.append("ElasticsearchVersion: " + getElasticsearchVersion() + ",");
        if (getElasticsearchClusterConfig() != null)
            sb.append("ElasticsearchClusterConfig: " + getElasticsearchClusterConfig() + ",");
        if (getEBSOptions() != null)
            sb.append("EBSOptions: " + getEBSOptions() + ",");
        if (getAccessPolicies() != null)
            sb.append("AccessPolicies: " + getAccessPolicies() + ",");
        if (getSnapshotOptions() != null)
            sb.append("SnapshotOptions: " + getSnapshotOptions() + ",");
        if (getVPCOptions() != null)
            sb.append("VPCOptions: " + getVPCOptions() + ",");
        if (getCognitoOptions() != null)
            sb.append("CognitoOptions: " + getCognitoOptions() + ",");
        if (getEncryptionAtRestOptions() != null)
            sb.append("EncryptionAtRestOptions: " + getEncryptionAtRestOptions() + ",");
        if (getNodeToNodeEncryptionOptions() != null)
            sb.append("NodeToNodeEncryptionOptions: " + getNodeToNodeEncryptionOptions() + ",");
        if (getAdvancedOptions() != null)
            sb.append("AdvancedOptions: " + getAdvancedOptions() + ",");
        if (getLogPublishingOptions() != null)
            sb.append("LogPublishingOptions: " + getLogPublishingOptions() + ",");
        if (getDomainEndpointOptions() != null)
            sb.append("DomainEndpointOptions: " + getDomainEndpointOptions() + ",");
        if (getAdvancedSecurityOptions() != null)
            sb.append("AdvancedSecurityOptions: " + getAdvancedSecurityOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getElasticsearchVersion() == null) ? 0 : getElasticsearchVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getElasticsearchClusterConfig() == null) ? 0 : getElasticsearchClusterConfig()
                        .hashCode());
        hashCode = prime * hashCode + ((getEBSOptions() == null) ? 0 : getEBSOptions().hashCode());
        hashCode = prime * hashCode
                + ((getAccessPolicies() == null) ? 0 : getAccessPolicies().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotOptions() == null) ? 0 : getSnapshotOptions().hashCode());
        hashCode = prime * hashCode + ((getVPCOptions() == null) ? 0 : getVPCOptions().hashCode());
        hashCode = prime * hashCode
                + ((getCognitoOptions() == null) ? 0 : getCognitoOptions().hashCode());
        hashCode = prime
                * hashCode
                + ((getEncryptionAtRestOptions() == null) ? 0 : getEncryptionAtRestOptions()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getNodeToNodeEncryptionOptions() == null) ? 0
                        : getNodeToNodeEncryptionOptions().hashCode());
        hashCode = prime * hashCode
                + ((getAdvancedOptions() == null) ? 0 : getAdvancedOptions().hashCode());
        hashCode = prime * hashCode
                + ((getLogPublishingOptions() == null) ? 0 : getLogPublishingOptions().hashCode());
        hashCode = prime
                * hashCode
                + ((getDomainEndpointOptions() == null) ? 0 : getDomainEndpointOptions().hashCode());
        hashCode = prime
                * hashCode
                + ((getAdvancedSecurityOptions() == null) ? 0 : getAdvancedSecurityOptions()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateElasticsearchDomainRequest == false)
            return false;
        CreateElasticsearchDomainRequest other = (CreateElasticsearchDomainRequest) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getElasticsearchVersion() == null ^ this.getElasticsearchVersion() == null)
            return false;
        if (other.getElasticsearchVersion() != null
                && other.getElasticsearchVersion().equals(this.getElasticsearchVersion()) == false)
            return false;
        if (other.getElasticsearchClusterConfig() == null
                ^ this.getElasticsearchClusterConfig() == null)
            return false;
        if (other.getElasticsearchClusterConfig() != null
                && other.getElasticsearchClusterConfig().equals(
                        this.getElasticsearchClusterConfig()) == false)
            return false;
        if (other.getEBSOptions() == null ^ this.getEBSOptions() == null)
            return false;
        if (other.getEBSOptions() != null
                && other.getEBSOptions().equals(this.getEBSOptions()) == false)
            return false;
        if (other.getAccessPolicies() == null ^ this.getAccessPolicies() == null)
            return false;
        if (other.getAccessPolicies() != null
                && other.getAccessPolicies().equals(this.getAccessPolicies()) == false)
            return false;
        if (other.getSnapshotOptions() == null ^ this.getSnapshotOptions() == null)
            return false;
        if (other.getSnapshotOptions() != null
                && other.getSnapshotOptions().equals(this.getSnapshotOptions()) == false)
            return false;
        if (other.getVPCOptions() == null ^ this.getVPCOptions() == null)
            return false;
        if (other.getVPCOptions() != null
                && other.getVPCOptions().equals(this.getVPCOptions()) == false)
            return false;
        if (other.getCognitoOptions() == null ^ this.getCognitoOptions() == null)
            return false;
        if (other.getCognitoOptions() != null
                && other.getCognitoOptions().equals(this.getCognitoOptions()) == false)
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
        if (other.getAdvancedOptions() == null ^ this.getAdvancedOptions() == null)
            return false;
        if (other.getAdvancedOptions() != null
                && other.getAdvancedOptions().equals(this.getAdvancedOptions()) == false)
            return false;
        if (other.getLogPublishingOptions() == null ^ this.getLogPublishingOptions() == null)
            return false;
        if (other.getLogPublishingOptions() != null
                && other.getLogPublishingOptions().equals(this.getLogPublishingOptions()) == false)
            return false;
        if (other.getDomainEndpointOptions() == null ^ this.getDomainEndpointOptions() == null)
            return false;
        if (other.getDomainEndpointOptions() != null
                && other.getDomainEndpointOptions().equals(this.getDomainEndpointOptions()) == false)
            return false;
        if (other.getAdvancedSecurityOptions() == null ^ this.getAdvancedSecurityOptions() == null)
            return false;
        if (other.getAdvancedSecurityOptions() != null
                && other.getAdvancedSecurityOptions().equals(this.getAdvancedSecurityOptions()) == false)
            return false;
        return true;
    }
}
