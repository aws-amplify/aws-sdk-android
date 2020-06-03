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

/**
 * <p>
 * The current status of an Elasticsearch domain.
 * </p>
 */
public class ElasticsearchDomainStatus implements Serializable {
    /**
     * <p>
     * The unique identifier for the specified Elasticsearch domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String domainId;

    /**
     * <p>
     * The name of an Elasticsearch domain. Domain names are unique across the
     * domains owned by an account within an AWS region. Domain names start with
     * a letter or number and can contain the following characters: a-z
     * (lowercase), 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     */
    private String domainName;

    /**
     * <p>
     * The Amazon resource name (ARN) of an Elasticsearch domain. See <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS Identity
     * and Access Management</i> for more information.
     * </p>
     */
    private String aRN;

    /**
     * <p>
     * The domain creation status. <code>True</code> if the creation of an
     * Elasticsearch domain is complete. <code>False</code> if domain creation
     * is still in progress.
     * </p>
     */
    private Boolean created;

    /**
     * <p>
     * The domain deletion status. <code>True</code> if a delete request has
     * been received for the domain but resource cleanup is still in progress.
     * <code>False</code> if the domain has not been deleted. Once domain
     * deletion is complete, the status of the domain is no longer returned.
     * </p>
     */
    private Boolean deleted;

    /**
     * <p>
     * The Elasticsearch domain endpoint that you use to submit index and search
     * requests.
     * </p>
     */
    private String endpoint;

    /**
     * <p>
     * Map containing the Elasticsearch domain endpoints used to submit index
     * and search requests. Example <code>key, value</code>:
     * <code>'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'</code>
     * .
     * </p>
     */
    private java.util.Map<String, String> endpoints;

    /**
     * <p>
     * The status of the Elasticsearch domain configuration. <code>True</code>
     * if Amazon Elasticsearch Service is processing configuration changes.
     * <code>False</code> if the configuration is active.
     * </p>
     */
    private Boolean processing;

    /**
     * <p>
     * The status of an Elasticsearch domain version upgrade. <code>True</code>
     * if Amazon Elasticsearch Service is undergoing a version upgrade.
     * <code>False</code> if the configuration is active.
     * </p>
     */
    private Boolean upgradeProcessing;

    /**
     * The new value for the elasticsearchVersion property for this object.
     */
    private String elasticsearchVersion;

    /**
     * <p>
     * The type and number of instances in the domain cluster.
     * </p>
     */
    private ElasticsearchClusterConfig elasticsearchClusterConfig;

    /**
     * <p>
     * The <code>EBSOptions</code> for the specified domain. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs"
     * target="_blank">Configuring EBS-based Storage</a> for more information.
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
     * Specifies the status of the <code>SnapshotOptions</code>
     * </p>
     */
    private SnapshotOptions snapshotOptions;

    /**
     * <p>
     * The <code>VPCOptions</code> for the specified domain. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html"
     * target="_blank">VPC Endpoints for Amazon Elasticsearch Service
     * Domains</a>.
     * </p>
     */
    private VPCDerivedInfo vPCOptions;

    /**
     * <p>
     * The <code>CognitoOptions</code> for the specified domain. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     * target="_blank">Amazon Cognito Authentication for Kibana</a>.
     * </p>
     */
    private CognitoOptions cognitoOptions;

    /**
     * <p>
     * Specifies the status of the <code>EncryptionAtRestOptions</code>.
     * </p>
     */
    private EncryptionAtRestOptions encryptionAtRestOptions;

    /**
     * <p>
     * Specifies the status of the <code>NodeToNodeEncryptionOptions</code>.
     * </p>
     */
    private NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions;

    /**
     * <p>
     * Specifies the status of the <code>AdvancedOptions</code>
     * </p>
     */
    private java.util.Map<String, String> advancedOptions;

    /**
     * <p>
     * Log publishing options for the given domain.
     * </p>
     */
    private java.util.Map<String, LogPublishingOption> logPublishingOptions;

    /**
     * <p>
     * The current status of the Elasticsearch domain's service software.
     * </p>
     */
    private ServiceSoftwareOptions serviceSoftwareOptions;

    /**
     * <p>
     * The current status of the Elasticsearch domain's endpoint options.
     * </p>
     */
    private DomainEndpointOptions domainEndpointOptions;

    /**
     * <p>
     * The current status of the Elasticsearch domain's advanced security
     * options.
     * </p>
     */
    private AdvancedSecurityOptions advancedSecurityOptions;

    /**
     * <p>
     * The unique identifier for the specified Elasticsearch domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The unique identifier for the specified Elasticsearch domain.
     *         </p>
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * <p>
     * The unique identifier for the specified Elasticsearch domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param domainId <p>
     *            The unique identifier for the specified Elasticsearch domain.
     *            </p>
     */
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The unique identifier for the specified Elasticsearch domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param domainId <p>
     *            The unique identifier for the specified Elasticsearch domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainStatus withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * <p>
     * The name of an Elasticsearch domain. Domain names are unique across the
     * domains owned by an account within an AWS region. Domain names start with
     * a letter or number and can contain the following characters: a-z
     * (lowercase), 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @return <p>
     *         The name of an Elasticsearch domain. Domain names are unique
     *         across the domains owned by an account within an AWS region.
     *         Domain names start with a letter or number and can contain the
     *         following characters: a-z (lowercase), 0-9, and - (hyphen).
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of an Elasticsearch domain. Domain names are unique across the
     * domains owned by an account within an AWS region. Domain names start with
     * a letter or number and can contain the following characters: a-z
     * (lowercase), 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName <p>
     *            The name of an Elasticsearch domain. Domain names are unique
     *            across the domains owned by an account within an AWS region.
     *            Domain names start with a letter or number and can contain the
     *            following characters: a-z (lowercase), 0-9, and - (hyphen).
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of an Elasticsearch domain. Domain names are unique across the
     * domains owned by an account within an AWS region. Domain names start with
     * a letter or number and can contain the following characters: a-z
     * (lowercase), 0-9, and - (hyphen).
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
     *            The name of an Elasticsearch domain. Domain names are unique
     *            across the domains owned by an account within an AWS region.
     *            Domain names start with a letter or number and can contain the
     *            following characters: a-z (lowercase), 0-9, and - (hyphen).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainStatus withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of an Elasticsearch domain. See <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS Identity
     * and Access Management</i> for more information.
     * </p>
     *
     * @return <p>
     *         The Amazon resource name (ARN) of an Elasticsearch domain. See <a
     *         href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i> for more information.
     *         </p>
     */
    public String getARN() {
        return aRN;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of an Elasticsearch domain. See <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS Identity
     * and Access Management</i> for more information.
     * </p>
     *
     * @param aRN <p>
     *            The Amazon resource name (ARN) of an Elasticsearch domain. See
     *            <a href=
     *            "http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *            target="_blank">Identifiers for IAM Entities</a> in <i>Using
     *            AWS Identity and Access Management</i> for more information.
     *            </p>
     */
    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of an Elasticsearch domain. See <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS Identity
     * and Access Management</i> for more information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aRN <p>
     *            The Amazon resource name (ARN) of an Elasticsearch domain. See
     *            <a href=
     *            "http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *            target="_blank">Identifiers for IAM Entities</a> in <i>Using
     *            AWS Identity and Access Management</i> for more information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainStatus withARN(String aRN) {
        this.aRN = aRN;
        return this;
    }

    /**
     * <p>
     * The domain creation status. <code>True</code> if the creation of an
     * Elasticsearch domain is complete. <code>False</code> if domain creation
     * is still in progress.
     * </p>
     *
     * @return <p>
     *         The domain creation status. <code>True</code> if the creation of
     *         an Elasticsearch domain is complete. <code>False</code> if domain
     *         creation is still in progress.
     *         </p>
     */
    public Boolean isCreated() {
        return created;
    }

    /**
     * <p>
     * The domain creation status. <code>True</code> if the creation of an
     * Elasticsearch domain is complete. <code>False</code> if domain creation
     * is still in progress.
     * </p>
     *
     * @return <p>
     *         The domain creation status. <code>True</code> if the creation of
     *         an Elasticsearch domain is complete. <code>False</code> if domain
     *         creation is still in progress.
     *         </p>
     */
    public Boolean getCreated() {
        return created;
    }

    /**
     * <p>
     * The domain creation status. <code>True</code> if the creation of an
     * Elasticsearch domain is complete. <code>False</code> if domain creation
     * is still in progress.
     * </p>
     *
     * @param created <p>
     *            The domain creation status. <code>True</code> if the creation
     *            of an Elasticsearch domain is complete. <code>False</code> if
     *            domain creation is still in progress.
     *            </p>
     */
    public void setCreated(Boolean created) {
        this.created = created;
    }

    /**
     * <p>
     * The domain creation status. <code>True</code> if the creation of an
     * Elasticsearch domain is complete. <code>False</code> if domain creation
     * is still in progress.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param created <p>
     *            The domain creation status. <code>True</code> if the creation
     *            of an Elasticsearch domain is complete. <code>False</code> if
     *            domain creation is still in progress.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainStatus withCreated(Boolean created) {
        this.created = created;
        return this;
    }

    /**
     * <p>
     * The domain deletion status. <code>True</code> if a delete request has
     * been received for the domain but resource cleanup is still in progress.
     * <code>False</code> if the domain has not been deleted. Once domain
     * deletion is complete, the status of the domain is no longer returned.
     * </p>
     *
     * @return <p>
     *         The domain deletion status. <code>True</code> if a delete request
     *         has been received for the domain but resource cleanup is still in
     *         progress. <code>False</code> if the domain has not been deleted.
     *         Once domain deletion is complete, the status of the domain is no
     *         longer returned.
     *         </p>
     */
    public Boolean isDeleted() {
        return deleted;
    }

    /**
     * <p>
     * The domain deletion status. <code>True</code> if a delete request has
     * been received for the domain but resource cleanup is still in progress.
     * <code>False</code> if the domain has not been deleted. Once domain
     * deletion is complete, the status of the domain is no longer returned.
     * </p>
     *
     * @return <p>
     *         The domain deletion status. <code>True</code> if a delete request
     *         has been received for the domain but resource cleanup is still in
     *         progress. <code>False</code> if the domain has not been deleted.
     *         Once domain deletion is complete, the status of the domain is no
     *         longer returned.
     *         </p>
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * <p>
     * The domain deletion status. <code>True</code> if a delete request has
     * been received for the domain but resource cleanup is still in progress.
     * <code>False</code> if the domain has not been deleted. Once domain
     * deletion is complete, the status of the domain is no longer returned.
     * </p>
     *
     * @param deleted <p>
     *            The domain deletion status. <code>True</code> if a delete
     *            request has been received for the domain but resource cleanup
     *            is still in progress. <code>False</code> if the domain has not
     *            been deleted. Once domain deletion is complete, the status of
     *            the domain is no longer returned.
     *            </p>
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * <p>
     * The domain deletion status. <code>True</code> if a delete request has
     * been received for the domain but resource cleanup is still in progress.
     * <code>False</code> if the domain has not been deleted. Once domain
     * deletion is complete, the status of the domain is no longer returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleted <p>
     *            The domain deletion status. <code>True</code> if a delete
     *            request has been received for the domain but resource cleanup
     *            is still in progress. <code>False</code> if the domain has not
     *            been deleted. Once domain deletion is complete, the status of
     *            the domain is no longer returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainStatus withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * <p>
     * The Elasticsearch domain endpoint that you use to submit index and search
     * requests.
     * </p>
     *
     * @return <p>
     *         The Elasticsearch domain endpoint that you use to submit index
     *         and search requests.
     *         </p>
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * <p>
     * The Elasticsearch domain endpoint that you use to submit index and search
     * requests.
     * </p>
     *
     * @param endpoint <p>
     *            The Elasticsearch domain endpoint that you use to submit index
     *            and search requests.
     *            </p>
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The Elasticsearch domain endpoint that you use to submit index and search
     * requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoint <p>
     *            The Elasticsearch domain endpoint that you use to submit index
     *            and search requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainStatus withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * <p>
     * Map containing the Elasticsearch domain endpoints used to submit index
     * and search requests. Example <code>key, value</code>:
     * <code>'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'</code>
     * .
     * </p>
     *
     * @return <p>
     *         Map containing the Elasticsearch domain endpoints used to submit
     *         index and search requests. Example <code>key, value</code>:
     *         <code>'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'</code>
     *         .
     *         </p>
     */
    public java.util.Map<String, String> getEndpoints() {
        return endpoints;
    }

    /**
     * <p>
     * Map containing the Elasticsearch domain endpoints used to submit index
     * and search requests. Example <code>key, value</code>:
     * <code>'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'</code>
     * .
     * </p>
     *
     * @param endpoints <p>
     *            Map containing the Elasticsearch domain endpoints used to
     *            submit index and search requests. Example
     *            <code>key, value</code>:
     *            <code>'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'</code>
     *            .
     *            </p>
     */
    public void setEndpoints(java.util.Map<String, String> endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * <p>
     * Map containing the Elasticsearch domain endpoints used to submit index
     * and search requests. Example <code>key, value</code>:
     * <code>'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoints <p>
     *            Map containing the Elasticsearch domain endpoints used to
     *            submit index and search requests. Example
     *            <code>key, value</code>:
     *            <code>'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainStatus withEndpoints(java.util.Map<String, String> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * <p>
     * Map containing the Elasticsearch domain endpoints used to submit index
     * and search requests. Example <code>key, value</code>:
     * <code>'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'</code>
     * .
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
    public ElasticsearchDomainStatus addEndpointsEntry(String key, String value) {
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
    public ElasticsearchDomainStatus clearEndpointsEntries() {
        this.endpoints = null;
        return this;
    }

    /**
     * <p>
     * The status of the Elasticsearch domain configuration. <code>True</code>
     * if Amazon Elasticsearch Service is processing configuration changes.
     * <code>False</code> if the configuration is active.
     * </p>
     *
     * @return <p>
     *         The status of the Elasticsearch domain configuration.
     *         <code>True</code> if Amazon Elasticsearch Service is processing
     *         configuration changes. <code>False</code> if the configuration is
     *         active.
     *         </p>
     */
    public Boolean isProcessing() {
        return processing;
    }

    /**
     * <p>
     * The status of the Elasticsearch domain configuration. <code>True</code>
     * if Amazon Elasticsearch Service is processing configuration changes.
     * <code>False</code> if the configuration is active.
     * </p>
     *
     * @return <p>
     *         The status of the Elasticsearch domain configuration.
     *         <code>True</code> if Amazon Elasticsearch Service is processing
     *         configuration changes. <code>False</code> if the configuration is
     *         active.
     *         </p>
     */
    public Boolean getProcessing() {
        return processing;
    }

    /**
     * <p>
     * The status of the Elasticsearch domain configuration. <code>True</code>
     * if Amazon Elasticsearch Service is processing configuration changes.
     * <code>False</code> if the configuration is active.
     * </p>
     *
     * @param processing <p>
     *            The status of the Elasticsearch domain configuration.
     *            <code>True</code> if Amazon Elasticsearch Service is
     *            processing configuration changes. <code>False</code> if the
     *            configuration is active.
     *            </p>
     */
    public void setProcessing(Boolean processing) {
        this.processing = processing;
    }

    /**
     * <p>
     * The status of the Elasticsearch domain configuration. <code>True</code>
     * if Amazon Elasticsearch Service is processing configuration changes.
     * <code>False</code> if the configuration is active.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processing <p>
     *            The status of the Elasticsearch domain configuration.
     *            <code>True</code> if Amazon Elasticsearch Service is
     *            processing configuration changes. <code>False</code> if the
     *            configuration is active.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainStatus withProcessing(Boolean processing) {
        this.processing = processing;
        return this;
    }

    /**
     * <p>
     * The status of an Elasticsearch domain version upgrade. <code>True</code>
     * if Amazon Elasticsearch Service is undergoing a version upgrade.
     * <code>False</code> if the configuration is active.
     * </p>
     *
     * @return <p>
     *         The status of an Elasticsearch domain version upgrade.
     *         <code>True</code> if Amazon Elasticsearch Service is undergoing a
     *         version upgrade. <code>False</code> if the configuration is
     *         active.
     *         </p>
     */
    public Boolean isUpgradeProcessing() {
        return upgradeProcessing;
    }

    /**
     * <p>
     * The status of an Elasticsearch domain version upgrade. <code>True</code>
     * if Amazon Elasticsearch Service is undergoing a version upgrade.
     * <code>False</code> if the configuration is active.
     * </p>
     *
     * @return <p>
     *         The status of an Elasticsearch domain version upgrade.
     *         <code>True</code> if Amazon Elasticsearch Service is undergoing a
     *         version upgrade. <code>False</code> if the configuration is
     *         active.
     *         </p>
     */
    public Boolean getUpgradeProcessing() {
        return upgradeProcessing;
    }

    /**
     * <p>
     * The status of an Elasticsearch domain version upgrade. <code>True</code>
     * if Amazon Elasticsearch Service is undergoing a version upgrade.
     * <code>False</code> if the configuration is active.
     * </p>
     *
     * @param upgradeProcessing <p>
     *            The status of an Elasticsearch domain version upgrade.
     *            <code>True</code> if Amazon Elasticsearch Service is
     *            undergoing a version upgrade. <code>False</code> if the
     *            configuration is active.
     *            </p>
     */
    public void setUpgradeProcessing(Boolean upgradeProcessing) {
        this.upgradeProcessing = upgradeProcessing;
    }

    /**
     * <p>
     * The status of an Elasticsearch domain version upgrade. <code>True</code>
     * if Amazon Elasticsearch Service is undergoing a version upgrade.
     * <code>False</code> if the configuration is active.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param upgradeProcessing <p>
     *            The status of an Elasticsearch domain version upgrade.
     *            <code>True</code> if Amazon Elasticsearch Service is
     *            undergoing a version upgrade. <code>False</code> if the
     *            configuration is active.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainStatus withUpgradeProcessing(Boolean upgradeProcessing) {
        this.upgradeProcessing = upgradeProcessing;
        return this;
    }

    /**
     * Returns the value of the elasticsearchVersion property for this object.
     *
     * @return The value of the elasticsearchVersion property for this object.
     */
    public String getElasticsearchVersion() {
        return elasticsearchVersion;
    }

    /**
     * Sets the value of elasticsearchVersion
     *
     * @param elasticsearchVersion The new value for the elasticsearchVersion
     *            property for this object.
     */
    public void setElasticsearchVersion(String elasticsearchVersion) {
        this.elasticsearchVersion = elasticsearchVersion;
    }

    /**
     * Sets the value of the elasticsearchVersion property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticsearchVersion The new value for the elasticsearchVersion
     *            property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainStatus withElasticsearchVersion(String elasticsearchVersion) {
        this.elasticsearchVersion = elasticsearchVersion;
        return this;
    }

    /**
     * <p>
     * The type and number of instances in the domain cluster.
     * </p>
     *
     * @return <p>
     *         The type and number of instances in the domain cluster.
     *         </p>
     */
    public ElasticsearchClusterConfig getElasticsearchClusterConfig() {
        return elasticsearchClusterConfig;
    }

    /**
     * <p>
     * The type and number of instances in the domain cluster.
     * </p>
     *
     * @param elasticsearchClusterConfig <p>
     *            The type and number of instances in the domain cluster.
     *            </p>
     */
    public void setElasticsearchClusterConfig(ElasticsearchClusterConfig elasticsearchClusterConfig) {
        this.elasticsearchClusterConfig = elasticsearchClusterConfig;
    }

    /**
     * <p>
     * The type and number of instances in the domain cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticsearchClusterConfig <p>
     *            The type and number of instances in the domain cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainStatus withElasticsearchClusterConfig(
            ElasticsearchClusterConfig elasticsearchClusterConfig) {
        this.elasticsearchClusterConfig = elasticsearchClusterConfig;
        return this;
    }

    /**
     * <p>
     * The <code>EBSOptions</code> for the specified domain. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs"
     * target="_blank">Configuring EBS-based Storage</a> for more information.
     * </p>
     *
     * @return <p>
     *         The <code>EBSOptions</code> for the specified domain. See <a
     *         href=
     *         "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs"
     *         target="_blank">Configuring EBS-based Storage</a> for more
     *         information.
     *         </p>
     */
    public EBSOptions getEBSOptions() {
        return eBSOptions;
    }

    /**
     * <p>
     * The <code>EBSOptions</code> for the specified domain. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs"
     * target="_blank">Configuring EBS-based Storage</a> for more information.
     * </p>
     *
     * @param eBSOptions <p>
     *            The <code>EBSOptions</code> for the specified domain. See <a
     *            href=
     *            "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs"
     *            target="_blank">Configuring EBS-based Storage</a> for more
     *            information.
     *            </p>
     */
    public void setEBSOptions(EBSOptions eBSOptions) {
        this.eBSOptions = eBSOptions;
    }

    /**
     * <p>
     * The <code>EBSOptions</code> for the specified domain. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs"
     * target="_blank">Configuring EBS-based Storage</a> for more information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eBSOptions <p>
     *            The <code>EBSOptions</code> for the specified domain. See <a
     *            href=
     *            "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs"
     *            target="_blank">Configuring EBS-based Storage</a> for more
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainStatus withEBSOptions(EBSOptions eBSOptions) {
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
    public ElasticsearchDomainStatus withAccessPolicies(String accessPolicies) {
        this.accessPolicies = accessPolicies;
        return this;
    }

    /**
     * <p>
     * Specifies the status of the <code>SnapshotOptions</code>
     * </p>
     *
     * @return <p>
     *         Specifies the status of the <code>SnapshotOptions</code>
     *         </p>
     */
    public SnapshotOptions getSnapshotOptions() {
        return snapshotOptions;
    }

    /**
     * <p>
     * Specifies the status of the <code>SnapshotOptions</code>
     * </p>
     *
     * @param snapshotOptions <p>
     *            Specifies the status of the <code>SnapshotOptions</code>
     *            </p>
     */
    public void setSnapshotOptions(SnapshotOptions snapshotOptions) {
        this.snapshotOptions = snapshotOptions;
    }

    /**
     * <p>
     * Specifies the status of the <code>SnapshotOptions</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotOptions <p>
     *            Specifies the status of the <code>SnapshotOptions</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainStatus withSnapshotOptions(SnapshotOptions snapshotOptions) {
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
    public VPCDerivedInfo getVPCOptions() {
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
    public void setVPCOptions(VPCDerivedInfo vPCOptions) {
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
    public ElasticsearchDomainStatus withVPCOptions(VPCDerivedInfo vPCOptions) {
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
    public CognitoOptions getCognitoOptions() {
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
    public void setCognitoOptions(CognitoOptions cognitoOptions) {
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
    public ElasticsearchDomainStatus withCognitoOptions(CognitoOptions cognitoOptions) {
        this.cognitoOptions = cognitoOptions;
        return this;
    }

    /**
     * <p>
     * Specifies the status of the <code>EncryptionAtRestOptions</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the status of the <code>EncryptionAtRestOptions</code>.
     *         </p>
     */
    public EncryptionAtRestOptions getEncryptionAtRestOptions() {
        return encryptionAtRestOptions;
    }

    /**
     * <p>
     * Specifies the status of the <code>EncryptionAtRestOptions</code>.
     * </p>
     *
     * @param encryptionAtRestOptions <p>
     *            Specifies the status of the
     *            <code>EncryptionAtRestOptions</code>.
     *            </p>
     */
    public void setEncryptionAtRestOptions(EncryptionAtRestOptions encryptionAtRestOptions) {
        this.encryptionAtRestOptions = encryptionAtRestOptions;
    }

    /**
     * <p>
     * Specifies the status of the <code>EncryptionAtRestOptions</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionAtRestOptions <p>
     *            Specifies the status of the
     *            <code>EncryptionAtRestOptions</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainStatus withEncryptionAtRestOptions(
            EncryptionAtRestOptions encryptionAtRestOptions) {
        this.encryptionAtRestOptions = encryptionAtRestOptions;
        return this;
    }

    /**
     * <p>
     * Specifies the status of the <code>NodeToNodeEncryptionOptions</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the status of the
     *         <code>NodeToNodeEncryptionOptions</code>.
     *         </p>
     */
    public NodeToNodeEncryptionOptions getNodeToNodeEncryptionOptions() {
        return nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * Specifies the status of the <code>NodeToNodeEncryptionOptions</code>.
     * </p>
     *
     * @param nodeToNodeEncryptionOptions <p>
     *            Specifies the status of the
     *            <code>NodeToNodeEncryptionOptions</code>.
     *            </p>
     */
    public void setNodeToNodeEncryptionOptions(
            NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
        this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * Specifies the status of the <code>NodeToNodeEncryptionOptions</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeToNodeEncryptionOptions <p>
     *            Specifies the status of the
     *            <code>NodeToNodeEncryptionOptions</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainStatus withNodeToNodeEncryptionOptions(
            NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
        this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
        return this;
    }

    /**
     * <p>
     * Specifies the status of the <code>AdvancedOptions</code>
     * </p>
     *
     * @return <p>
     *         Specifies the status of the <code>AdvancedOptions</code>
     *         </p>
     */
    public java.util.Map<String, String> getAdvancedOptions() {
        return advancedOptions;
    }

    /**
     * <p>
     * Specifies the status of the <code>AdvancedOptions</code>
     * </p>
     *
     * @param advancedOptions <p>
     *            Specifies the status of the <code>AdvancedOptions</code>
     *            </p>
     */
    public void setAdvancedOptions(java.util.Map<String, String> advancedOptions) {
        this.advancedOptions = advancedOptions;
    }

    /**
     * <p>
     * Specifies the status of the <code>AdvancedOptions</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param advancedOptions <p>
     *            Specifies the status of the <code>AdvancedOptions</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainStatus withAdvancedOptions(
            java.util.Map<String, String> advancedOptions) {
        this.advancedOptions = advancedOptions;
        return this;
    }

    /**
     * <p>
     * Specifies the status of the <code>AdvancedOptions</code>
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
    public ElasticsearchDomainStatus addAdvancedOptionsEntry(String key, String value) {
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
    public ElasticsearchDomainStatus clearAdvancedOptionsEntries() {
        this.advancedOptions = null;
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
    public java.util.Map<String, LogPublishingOption> getLogPublishingOptions() {
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
    public void setLogPublishingOptions(
            java.util.Map<String, LogPublishingOption> logPublishingOptions) {
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
    public ElasticsearchDomainStatus withLogPublishingOptions(
            java.util.Map<String, LogPublishingOption> logPublishingOptions) {
        this.logPublishingOptions = logPublishingOptions;
        return this;
    }

    /**
     * <p>
     * Log publishing options for the given domain.
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
    public ElasticsearchDomainStatus addLogPublishingOptionsEntry(String key,
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
    public ElasticsearchDomainStatus clearLogPublishingOptionsEntries() {
        this.logPublishingOptions = null;
        return this;
    }

    /**
     * <p>
     * The current status of the Elasticsearch domain's service software.
     * </p>
     *
     * @return <p>
     *         The current status of the Elasticsearch domain's service
     *         software.
     *         </p>
     */
    public ServiceSoftwareOptions getServiceSoftwareOptions() {
        return serviceSoftwareOptions;
    }

    /**
     * <p>
     * The current status of the Elasticsearch domain's service software.
     * </p>
     *
     * @param serviceSoftwareOptions <p>
     *            The current status of the Elasticsearch domain's service
     *            software.
     *            </p>
     */
    public void setServiceSoftwareOptions(ServiceSoftwareOptions serviceSoftwareOptions) {
        this.serviceSoftwareOptions = serviceSoftwareOptions;
    }

    /**
     * <p>
     * The current status of the Elasticsearch domain's service software.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceSoftwareOptions <p>
     *            The current status of the Elasticsearch domain's service
     *            software.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainStatus withServiceSoftwareOptions(
            ServiceSoftwareOptions serviceSoftwareOptions) {
        this.serviceSoftwareOptions = serviceSoftwareOptions;
        return this;
    }

    /**
     * <p>
     * The current status of the Elasticsearch domain's endpoint options.
     * </p>
     *
     * @return <p>
     *         The current status of the Elasticsearch domain's endpoint
     *         options.
     *         </p>
     */
    public DomainEndpointOptions getDomainEndpointOptions() {
        return domainEndpointOptions;
    }

    /**
     * <p>
     * The current status of the Elasticsearch domain's endpoint options.
     * </p>
     *
     * @param domainEndpointOptions <p>
     *            The current status of the Elasticsearch domain's endpoint
     *            options.
     *            </p>
     */
    public void setDomainEndpointOptions(DomainEndpointOptions domainEndpointOptions) {
        this.domainEndpointOptions = domainEndpointOptions;
    }

    /**
     * <p>
     * The current status of the Elasticsearch domain's endpoint options.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainEndpointOptions <p>
     *            The current status of the Elasticsearch domain's endpoint
     *            options.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainStatus withDomainEndpointOptions(
            DomainEndpointOptions domainEndpointOptions) {
        this.domainEndpointOptions = domainEndpointOptions;
        return this;
    }

    /**
     * <p>
     * The current status of the Elasticsearch domain's advanced security
     * options.
     * </p>
     *
     * @return <p>
     *         The current status of the Elasticsearch domain's advanced
     *         security options.
     *         </p>
     */
    public AdvancedSecurityOptions getAdvancedSecurityOptions() {
        return advancedSecurityOptions;
    }

    /**
     * <p>
     * The current status of the Elasticsearch domain's advanced security
     * options.
     * </p>
     *
     * @param advancedSecurityOptions <p>
     *            The current status of the Elasticsearch domain's advanced
     *            security options.
     *            </p>
     */
    public void setAdvancedSecurityOptions(AdvancedSecurityOptions advancedSecurityOptions) {
        this.advancedSecurityOptions = advancedSecurityOptions;
    }

    /**
     * <p>
     * The current status of the Elasticsearch domain's advanced security
     * options.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param advancedSecurityOptions <p>
     *            The current status of the Elasticsearch domain's advanced
     *            security options.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchDomainStatus withAdvancedSecurityOptions(
            AdvancedSecurityOptions advancedSecurityOptions) {
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
        if (getDomainId() != null)
            sb.append("DomainId: " + getDomainId() + ",");
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getARN() != null)
            sb.append("ARN: " + getARN() + ",");
        if (getCreated() != null)
            sb.append("Created: " + getCreated() + ",");
        if (getDeleted() != null)
            sb.append("Deleted: " + getDeleted() + ",");
        if (getEndpoint() != null)
            sb.append("Endpoint: " + getEndpoint() + ",");
        if (getEndpoints() != null)
            sb.append("Endpoints: " + getEndpoints() + ",");
        if (getProcessing() != null)
            sb.append("Processing: " + getProcessing() + ",");
        if (getUpgradeProcessing() != null)
            sb.append("UpgradeProcessing: " + getUpgradeProcessing() + ",");
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
        if (getServiceSoftwareOptions() != null)
            sb.append("ServiceSoftwareOptions: " + getServiceSoftwareOptions() + ",");
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

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        hashCode = prime * hashCode + ((getProcessing() == null) ? 0 : getProcessing().hashCode());
        hashCode = prime * hashCode
                + ((getUpgradeProcessing() == null) ? 0 : getUpgradeProcessing().hashCode());
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
                + ((getServiceSoftwareOptions() == null) ? 0 : getServiceSoftwareOptions()
                        .hashCode());
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

        if (obj instanceof ElasticsearchDomainStatus == false)
            return false;
        ElasticsearchDomainStatus other = (ElasticsearchDomainStatus) obj;

        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getDeleted() == null ^ this.getDeleted() == null)
            return false;
        if (other.getDeleted() != null && other.getDeleted().equals(this.getDeleted()) == false)
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
        if (other.getProcessing() == null ^ this.getProcessing() == null)
            return false;
        if (other.getProcessing() != null
                && other.getProcessing().equals(this.getProcessing()) == false)
            return false;
        if (other.getUpgradeProcessing() == null ^ this.getUpgradeProcessing() == null)
            return false;
        if (other.getUpgradeProcessing() != null
                && other.getUpgradeProcessing().equals(this.getUpgradeProcessing()) == false)
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
        if (other.getServiceSoftwareOptions() == null ^ this.getServiceSoftwareOptions() == null)
            return false;
        if (other.getServiceSoftwareOptions() != null
                && other.getServiceSoftwareOptions().equals(this.getServiceSoftwareOptions()) == false)
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
