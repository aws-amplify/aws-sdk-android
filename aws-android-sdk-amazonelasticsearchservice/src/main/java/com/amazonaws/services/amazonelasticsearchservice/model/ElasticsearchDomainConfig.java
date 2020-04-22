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

package com.amazonaws.services.amazonelasticsearchservice.model;

import java.io.Serializable;

/**
 * <p>
 * The configuration of an Elasticsearch domain.
 * </p>
 */
public class ElasticsearchDomainConfig implements Serializable {
    /**
     * <p>
     * String of format X.Y to specify version for the Elasticsearch domain.
     * </p>
     */
    private ElasticsearchVersionStatus elasticsearchVersion;

    /**
     * <p>
     * Specifies the <code>ElasticsearchClusterConfig</code> for the
     * Elasticsearch domain.
     * </p>
     */
    private ElasticsearchClusterConfigStatus elasticsearchClusterConfig;

    /**
     * <p>
     * Specifies the <code>EBSOptions</code> for the Elasticsearch domain.
     * </p>
     */
    private EBSOptionsStatus eBSOptions;

    /**
     * <p>
     * IAM access policy as a JSON-formatted string.
     * </p>
     */
    private AccessPoliciesStatus accessPolicies;

    /**
     * <p>
     * Specifies the <code>SnapshotOptions</code> for the Elasticsearch domain.
     * </p>
     */
    private SnapshotOptionsStatus snapshotOptions;

    /**
     * <p>
     * The <code>VPCOptions</code> for the specified domain. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html"
     * target="_blank">VPC Endpoints for Amazon Elasticsearch Service
     * Domains</a>.
     * </p>
     */
    private VPCDerivedInfoStatus vPCOptions;

    /**
     * <p>
     * The <code>CognitoOptions</code> for the specified domain. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     * target="_blank">Amazon Cognito Authentication for Kibana</a>.
     * </p>
     */
    private CognitoOptionsStatus cognitoOptions;

    /**
     * <p>
     * Specifies the <code>EncryptionAtRestOptions</code> for the Elasticsearch
     * domain.
     * </p>
     */
    private EncryptionAtRestOptionsStatus encryptionAtRestOptions;

    /**
     * <p>
     * Specifies the <code>NodeToNodeEncryptionOptions</code> for the
     * Elasticsearch domain.
     * </p>
     */
    private NodeToNodeEncryptionOptionsStatus nodeToNodeEncryptionOptions;

    /**
     * <p>
     * Specifies the <code>AdvancedOptions</code> for the domain. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     * target="_blank">Configuring Advanced Options</a> for more information.
     * </p>
     */
    private AdvancedOptionsStatus advancedOptions;

    /**
     * <p>
     * Log publishing options for the given domain.
     * </p>
     */
    private LogPublishingOptionsStatus logPublishingOptions;

    /**
     * <p>
     * Specifies the <code>DomainEndpointOptions</code> for the Elasticsearch
     * domain.
     * </p>
     */
    private DomainEndpointOptionsStatus domainEndpointOptions;

    /**
     * <p>
     * Specifies <code>AdvancedSecurityOptions</code> for the domain.
     * </p>
     */
    private AdvancedSecurityOptionsStatus advancedSecurityOptions;

    /**
     * <p>
     * String of format X.Y to specify version for the Elasticsearch domain.
     * </p>
     *
     * @return <p>
     *         String of format X.Y to specify version for the Elasticsearch
     *         domain.
     *         </p>
     */
    public ElasticsearchVersionStatus getElasticsearchVersion() {
        return elasticsearchVersion;
    }

    /**
     * <p>
     * String of format X.Y to specify version for the Elasticsearch domain.
     * </p>
     *
     * @param elasticsearchVersion <p>
     *            String of format X.Y to specify version for the Elasticsearch
     *            domain.
     *            </p>
     */
    public void setElasticsearchVersion(ElasticsearchVersionStatus elasticsearchVersion) {
        this.elasticsearchVersion = elasticsearchVersion;
    }

    /**
     * <p>
     * String of format X.Y to specify version for the Elasticsearch domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticsearchVersion <p>
     *            String of format X.Y to specify version for the Elasticsearch
     *            domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainConfig withElasticsearchVersion(
            ElasticsearchVersionStatus elasticsearchVersion) {
        this.elasticsearchVersion = elasticsearchVersion;
        return this;
    }

    /**
     * <p>
     * Specifies the <code>ElasticsearchClusterConfig</code> for the
     * Elasticsearch domain.
     * </p>
     *
     * @return <p>
     *         Specifies the <code>ElasticsearchClusterConfig</code> for the
     *         Elasticsearch domain.
     *         </p>
     */
    public ElasticsearchClusterConfigStatus getElasticsearchClusterConfig() {
        return elasticsearchClusterConfig;
    }

    /**
     * <p>
     * Specifies the <code>ElasticsearchClusterConfig</code> for the
     * Elasticsearch domain.
     * </p>
     *
     * @param elasticsearchClusterConfig <p>
     *            Specifies the <code>ElasticsearchClusterConfig</code> for the
     *            Elasticsearch domain.
     *            </p>
     */
    public void setElasticsearchClusterConfig(
            ElasticsearchClusterConfigStatus elasticsearchClusterConfig) {
        this.elasticsearchClusterConfig = elasticsearchClusterConfig;
    }

    /**
     * <p>
     * Specifies the <code>ElasticsearchClusterConfig</code> for the
     * Elasticsearch domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticsearchClusterConfig <p>
     *            Specifies the <code>ElasticsearchClusterConfig</code> for the
     *            Elasticsearch domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainConfig withElasticsearchClusterConfig(
            ElasticsearchClusterConfigStatus elasticsearchClusterConfig) {
        this.elasticsearchClusterConfig = elasticsearchClusterConfig;
        return this;
    }

    /**
     * <p>
     * Specifies the <code>EBSOptions</code> for the Elasticsearch domain.
     * </p>
     *
     * @return <p>
     *         Specifies the <code>EBSOptions</code> for the Elasticsearch
     *         domain.
     *         </p>
     */
    public EBSOptionsStatus getEBSOptions() {
        return eBSOptions;
    }

    /**
     * <p>
     * Specifies the <code>EBSOptions</code> for the Elasticsearch domain.
     * </p>
     *
     * @param eBSOptions <p>
     *            Specifies the <code>EBSOptions</code> for the Elasticsearch
     *            domain.
     *            </p>
     */
    public void setEBSOptions(EBSOptionsStatus eBSOptions) {
        this.eBSOptions = eBSOptions;
    }

    /**
     * <p>
     * Specifies the <code>EBSOptions</code> for the Elasticsearch domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eBSOptions <p>
     *            Specifies the <code>EBSOptions</code> for the Elasticsearch
     *            domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainConfig withEBSOptions(EBSOptionsStatus eBSOptions) {
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
    public AccessPoliciesStatus getAccessPolicies() {
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
    public void setAccessPolicies(AccessPoliciesStatus accessPolicies) {
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
    public ElasticsearchDomainConfig withAccessPolicies(AccessPoliciesStatus accessPolicies) {
        this.accessPolicies = accessPolicies;
        return this;
    }

    /**
     * <p>
     * Specifies the <code>SnapshotOptions</code> for the Elasticsearch domain.
     * </p>
     *
     * @return <p>
     *         Specifies the <code>SnapshotOptions</code> for the Elasticsearch
     *         domain.
     *         </p>
     */
    public SnapshotOptionsStatus getSnapshotOptions() {
        return snapshotOptions;
    }

    /**
     * <p>
     * Specifies the <code>SnapshotOptions</code> for the Elasticsearch domain.
     * </p>
     *
     * @param snapshotOptions <p>
     *            Specifies the <code>SnapshotOptions</code> for the
     *            Elasticsearch domain.
     *            </p>
     */
    public void setSnapshotOptions(SnapshotOptionsStatus snapshotOptions) {
        this.snapshotOptions = snapshotOptions;
    }

    /**
     * <p>
     * Specifies the <code>SnapshotOptions</code> for the Elasticsearch domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotOptions <p>
     *            Specifies the <code>SnapshotOptions</code> for the
     *            Elasticsearch domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainConfig withSnapshotOptions(SnapshotOptionsStatus snapshotOptions) {
        this.snapshotOptions = snapshotOptions;
        return this;
    }

    /**
     * <p>
     * The <code>VPCOptions</code> for the specified domain. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html"
     * target="_blank">VPC Endpoints for Amazon Elasticsearch Service
     * Domains</a>.
     * </p>
     *
     * @return <p>
     *         The <code>VPCOptions</code> for the specified domain. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html"
     *         target="_blank">VPC Endpoints for Amazon Elasticsearch Service
     *         Domains</a>.
     *         </p>
     */
    public VPCDerivedInfoStatus getVPCOptions() {
        return vPCOptions;
    }

    /**
     * <p>
     * The <code>VPCOptions</code> for the specified domain. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html"
     * target="_blank">VPC Endpoints for Amazon Elasticsearch Service
     * Domains</a>.
     * </p>
     *
     * @param vPCOptions <p>
     *            The <code>VPCOptions</code> for the specified domain. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html"
     *            target="_blank">VPC Endpoints for Amazon Elasticsearch Service
     *            Domains</a>.
     *            </p>
     */
    public void setVPCOptions(VPCDerivedInfoStatus vPCOptions) {
        this.vPCOptions = vPCOptions;
    }

    /**
     * <p>
     * The <code>VPCOptions</code> for the specified domain. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html"
     * target="_blank">VPC Endpoints for Amazon Elasticsearch Service
     * Domains</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vPCOptions <p>
     *            The <code>VPCOptions</code> for the specified domain. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html"
     *            target="_blank">VPC Endpoints for Amazon Elasticsearch Service
     *            Domains</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainConfig withVPCOptions(VPCDerivedInfoStatus vPCOptions) {
        this.vPCOptions = vPCOptions;
        return this;
    }

    /**
     * <p>
     * The <code>CognitoOptions</code> for the specified domain. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     * target="_blank">Amazon Cognito Authentication for Kibana</a>.
     * </p>
     *
     * @return <p>
     *         The <code>CognitoOptions</code> for the specified domain. For
     *         more information, see <a href=
     *         "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     *         target="_blank">Amazon Cognito Authentication for Kibana</a>.
     *         </p>
     */
    public CognitoOptionsStatus getCognitoOptions() {
        return cognitoOptions;
    }

    /**
     * <p>
     * The <code>CognitoOptions</code> for the specified domain. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     * target="_blank">Amazon Cognito Authentication for Kibana</a>.
     * </p>
     *
     * @param cognitoOptions <p>
     *            The <code>CognitoOptions</code> for the specified domain. For
     *            more information, see <a href=
     *            "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     *            target="_blank">Amazon Cognito Authentication for Kibana</a>.
     *            </p>
     */
    public void setCognitoOptions(CognitoOptionsStatus cognitoOptions) {
        this.cognitoOptions = cognitoOptions;
    }

    /**
     * <p>
     * The <code>CognitoOptions</code> for the specified domain. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     * target="_blank">Amazon Cognito Authentication for Kibana</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cognitoOptions <p>
     *            The <code>CognitoOptions</code> for the specified domain. For
     *            more information, see <a href=
     *            "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     *            target="_blank">Amazon Cognito Authentication for Kibana</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainConfig withCognitoOptions(CognitoOptionsStatus cognitoOptions) {
        this.cognitoOptions = cognitoOptions;
        return this;
    }

    /**
     * <p>
     * Specifies the <code>EncryptionAtRestOptions</code> for the Elasticsearch
     * domain.
     * </p>
     *
     * @return <p>
     *         Specifies the <code>EncryptionAtRestOptions</code> for the
     *         Elasticsearch domain.
     *         </p>
     */
    public EncryptionAtRestOptionsStatus getEncryptionAtRestOptions() {
        return encryptionAtRestOptions;
    }

    /**
     * <p>
     * Specifies the <code>EncryptionAtRestOptions</code> for the Elasticsearch
     * domain.
     * </p>
     *
     * @param encryptionAtRestOptions <p>
     *            Specifies the <code>EncryptionAtRestOptions</code> for the
     *            Elasticsearch domain.
     *            </p>
     */
    public void setEncryptionAtRestOptions(EncryptionAtRestOptionsStatus encryptionAtRestOptions) {
        this.encryptionAtRestOptions = encryptionAtRestOptions;
    }

    /**
     * <p>
     * Specifies the <code>EncryptionAtRestOptions</code> for the Elasticsearch
     * domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionAtRestOptions <p>
     *            Specifies the <code>EncryptionAtRestOptions</code> for the
     *            Elasticsearch domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainConfig withEncryptionAtRestOptions(
            EncryptionAtRestOptionsStatus encryptionAtRestOptions) {
        this.encryptionAtRestOptions = encryptionAtRestOptions;
        return this;
    }

    /**
     * <p>
     * Specifies the <code>NodeToNodeEncryptionOptions</code> for the
     * Elasticsearch domain.
     * </p>
     *
     * @return <p>
     *         Specifies the <code>NodeToNodeEncryptionOptions</code> for the
     *         Elasticsearch domain.
     *         </p>
     */
    public NodeToNodeEncryptionOptionsStatus getNodeToNodeEncryptionOptions() {
        return nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * Specifies the <code>NodeToNodeEncryptionOptions</code> for the
     * Elasticsearch domain.
     * </p>
     *
     * @param nodeToNodeEncryptionOptions <p>
     *            Specifies the <code>NodeToNodeEncryptionOptions</code> for the
     *            Elasticsearch domain.
     *            </p>
     */
    public void setNodeToNodeEncryptionOptions(
            NodeToNodeEncryptionOptionsStatus nodeToNodeEncryptionOptions) {
        this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * Specifies the <code>NodeToNodeEncryptionOptions</code> for the
     * Elasticsearch domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeToNodeEncryptionOptions <p>
     *            Specifies the <code>NodeToNodeEncryptionOptions</code> for the
     *            Elasticsearch domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainConfig withNodeToNodeEncryptionOptions(
            NodeToNodeEncryptionOptionsStatus nodeToNodeEncryptionOptions) {
        this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
        return this;
    }

    /**
     * <p>
     * Specifies the <code>AdvancedOptions</code> for the domain. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     * target="_blank">Configuring Advanced Options</a> for more information.
     * </p>
     *
     * @return <p>
     *         Specifies the <code>AdvancedOptions</code> for the domain. See <a
     *         href=
     *         "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     *         target="_blank">Configuring Advanced Options</a> for more
     *         information.
     *         </p>
     */
    public AdvancedOptionsStatus getAdvancedOptions() {
        return advancedOptions;
    }

    /**
     * <p>
     * Specifies the <code>AdvancedOptions</code> for the domain. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     * target="_blank">Configuring Advanced Options</a> for more information.
     * </p>
     *
     * @param advancedOptions <p>
     *            Specifies the <code>AdvancedOptions</code> for the domain. See
     *            <a href=
     *            "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     *            target="_blank">Configuring Advanced Options</a> for more
     *            information.
     *            </p>
     */
    public void setAdvancedOptions(AdvancedOptionsStatus advancedOptions) {
        this.advancedOptions = advancedOptions;
    }

    /**
     * <p>
     * Specifies the <code>AdvancedOptions</code> for the domain. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     * target="_blank">Configuring Advanced Options</a> for more information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param advancedOptions <p>
     *            Specifies the <code>AdvancedOptions</code> for the domain. See
     *            <a href=
     *            "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     *            target="_blank">Configuring Advanced Options</a> for more
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainConfig withAdvancedOptions(AdvancedOptionsStatus advancedOptions) {
        this.advancedOptions = advancedOptions;
        return this;
    }

    /**
     * <p>
     * Log publishing options for the given domain.
     * </p>
     *
     * @return <p>
     *         Log publishing options for the given domain.
     *         </p>
     */
    public LogPublishingOptionsStatus getLogPublishingOptions() {
        return logPublishingOptions;
    }

    /**
     * <p>
     * Log publishing options for the given domain.
     * </p>
     *
     * @param logPublishingOptions <p>
     *            Log publishing options for the given domain.
     *            </p>
     */
    public void setLogPublishingOptions(LogPublishingOptionsStatus logPublishingOptions) {
        this.logPublishingOptions = logPublishingOptions;
    }

    /**
     * <p>
     * Log publishing options for the given domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logPublishingOptions <p>
     *            Log publishing options for the given domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainConfig withLogPublishingOptions(
            LogPublishingOptionsStatus logPublishingOptions) {
        this.logPublishingOptions = logPublishingOptions;
        return this;
    }

    /**
     * <p>
     * Specifies the <code>DomainEndpointOptions</code> for the Elasticsearch
     * domain.
     * </p>
     *
     * @return <p>
     *         Specifies the <code>DomainEndpointOptions</code> for the
     *         Elasticsearch domain.
     *         </p>
     */
    public DomainEndpointOptionsStatus getDomainEndpointOptions() {
        return domainEndpointOptions;
    }

    /**
     * <p>
     * Specifies the <code>DomainEndpointOptions</code> for the Elasticsearch
     * domain.
     * </p>
     *
     * @param domainEndpointOptions <p>
     *            Specifies the <code>DomainEndpointOptions</code> for the
     *            Elasticsearch domain.
     *            </p>
     */
    public void setDomainEndpointOptions(DomainEndpointOptionsStatus domainEndpointOptions) {
        this.domainEndpointOptions = domainEndpointOptions;
    }

    /**
     * <p>
     * Specifies the <code>DomainEndpointOptions</code> for the Elasticsearch
     * domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainEndpointOptions <p>
     *            Specifies the <code>DomainEndpointOptions</code> for the
     *            Elasticsearch domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainConfig withDomainEndpointOptions(
            DomainEndpointOptionsStatus domainEndpointOptions) {
        this.domainEndpointOptions = domainEndpointOptions;
        return this;
    }

    /**
     * <p>
     * Specifies <code>AdvancedSecurityOptions</code> for the domain.
     * </p>
     *
     * @return <p>
     *         Specifies <code>AdvancedSecurityOptions</code> for the domain.
     *         </p>
     */
    public AdvancedSecurityOptionsStatus getAdvancedSecurityOptions() {
        return advancedSecurityOptions;
    }

    /**
     * <p>
     * Specifies <code>AdvancedSecurityOptions</code> for the domain.
     * </p>
     *
     * @param advancedSecurityOptions <p>
     *            Specifies <code>AdvancedSecurityOptions</code> for the domain.
     *            </p>
     */
    public void setAdvancedSecurityOptions(AdvancedSecurityOptionsStatus advancedSecurityOptions) {
        this.advancedSecurityOptions = advancedSecurityOptions;
    }

    /**
     * <p>
     * Specifies <code>AdvancedSecurityOptions</code> for the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param advancedSecurityOptions <p>
     *            Specifies <code>AdvancedSecurityOptions</code> for the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainConfig withAdvancedSecurityOptions(
            AdvancedSecurityOptionsStatus advancedSecurityOptions) {
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

        if (obj instanceof ElasticsearchDomainConfig == false)
            return false;
        ElasticsearchDomainConfig other = (ElasticsearchDomainConfig) obj;

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
