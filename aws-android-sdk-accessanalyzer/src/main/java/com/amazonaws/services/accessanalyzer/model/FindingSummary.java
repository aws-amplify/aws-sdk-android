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

package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a finding.
 * </p>
 */
public class FindingSummary implements Serializable {
    /**
     * <p>
     * The action in the analyzed policy statement that an external principal
     * has permission to use.
     * </p>
     */
    private java.util.List<String> action;

    /**
     * <p>
     * The time at which the resource-based policy that generated the finding
     * was analyzed.
     * </p>
     */
    private java.util.Date analyzedAt;

    /**
     * <p>
     * The condition in the analyzed policy statement that resulted in a
     * finding.
     * </p>
     */
    private java.util.Map<String, String> condition;

    /**
     * <p>
     * The time at which the finding was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The error that resulted in an Error finding.
     * </p>
     */
    private String error;

    /**
     * <p>
     * The ID of the finding.
     * </p>
     */
    private String id;

    /**
     * <p>
     * Indicates whether the finding reports a resource that has a policy that
     * allows public access.
     * </p>
     */
    private Boolean isPublic;

    /**
     * <p>
     * The external principal that has access to a resource within the zone of
     * trust.
     * </p>
     */
    private java.util.Map<String, String> principal;

    /**
     * <p>
     * The resource that the external principal has access to.
     * </p>
     */
    private String resource;

    /**
     * <p>
     * The AWS account ID that owns the resource.
     * </p>
     */
    private String resourceOwnerAccount;

    /**
     * <p>
     * The type of the resource that the external principal has access to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::IAM::Role, AWS::KMS::Key,
     * AWS::Lambda::Function, AWS::Lambda::LayerVersion, AWS::S3::Bucket,
     * AWS::SQS::Queue
     */
    private String resourceType;

    /**
     * <p>
     * The sources of the finding. This indicates how the access that generated
     * the finding is granted. It is populated for Amazon S3 bucket findings.
     * </p>
     */
    private java.util.List<FindingSource> sources;

    /**
     * <p>
     * The status of the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED, RESOLVED
     */
    private String status;

    /**
     * <p>
     * The time at which the finding was most recently updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The action in the analyzed policy statement that an external principal
     * has permission to use.
     * </p>
     *
     * @return <p>
     *         The action in the analyzed policy statement that an external
     *         principal has permission to use.
     *         </p>
     */
    public java.util.List<String> getAction() {
        return action;
    }

    /**
     * <p>
     * The action in the analyzed policy statement that an external principal
     * has permission to use.
     * </p>
     *
     * @param action <p>
     *            The action in the analyzed policy statement that an external
     *            principal has permission to use.
     *            </p>
     */
    public void setAction(java.util.Collection<String> action) {
        if (action == null) {
            this.action = null;
            return;
        }

        this.action = new java.util.ArrayList<String>(action);
    }

    /**
     * <p>
     * The action in the analyzed policy statement that an external principal
     * has permission to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param action <p>
     *            The action in the analyzed policy statement that an external
     *            principal has permission to use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingSummary withAction(String... action) {
        if (getAction() == null) {
            this.action = new java.util.ArrayList<String>(action.length);
        }
        for (String value : action) {
            this.action.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The action in the analyzed policy statement that an external principal
     * has permission to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param action <p>
     *            The action in the analyzed policy statement that an external
     *            principal has permission to use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingSummary withAction(java.util.Collection<String> action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The time at which the resource-based policy that generated the finding
     * was analyzed.
     * </p>
     *
     * @return <p>
     *         The time at which the resource-based policy that generated the
     *         finding was analyzed.
     *         </p>
     */
    public java.util.Date getAnalyzedAt() {
        return analyzedAt;
    }

    /**
     * <p>
     * The time at which the resource-based policy that generated the finding
     * was analyzed.
     * </p>
     *
     * @param analyzedAt <p>
     *            The time at which the resource-based policy that generated the
     *            finding was analyzed.
     *            </p>
     */
    public void setAnalyzedAt(java.util.Date analyzedAt) {
        this.analyzedAt = analyzedAt;
    }

    /**
     * <p>
     * The time at which the resource-based policy that generated the finding
     * was analyzed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param analyzedAt <p>
     *            The time at which the resource-based policy that generated the
     *            finding was analyzed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingSummary withAnalyzedAt(java.util.Date analyzedAt) {
        this.analyzedAt = analyzedAt;
        return this;
    }

    /**
     * <p>
     * The condition in the analyzed policy statement that resulted in a
     * finding.
     * </p>
     *
     * @return <p>
     *         The condition in the analyzed policy statement that resulted in a
     *         finding.
     *         </p>
     */
    public java.util.Map<String, String> getCondition() {
        return condition;
    }

    /**
     * <p>
     * The condition in the analyzed policy statement that resulted in a
     * finding.
     * </p>
     *
     * @param condition <p>
     *            The condition in the analyzed policy statement that resulted
     *            in a finding.
     *            </p>
     */
    public void setCondition(java.util.Map<String, String> condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The condition in the analyzed policy statement that resulted in a
     * finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param condition <p>
     *            The condition in the analyzed policy statement that resulted
     *            in a finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingSummary withCondition(java.util.Map<String, String> condition) {
        this.condition = condition;
        return this;
    }

    /**
     * <p>
     * The condition in the analyzed policy statement that resulted in a
     * finding.
     * </p>
     * <p>
     * The method adds a new key-value pair into condition parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into condition.
     * @param value The corresponding value of the entry to be added into
     *            condition.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingSummary addconditionEntry(String key, String value) {
        if (null == this.condition) {
            this.condition = new java.util.HashMap<String, String>();
        }
        if (this.condition.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.condition.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into condition.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public FindingSummary clearconditionEntries() {
        this.condition = null;
        return this;
    }

    /**
     * <p>
     * The time at which the finding was created.
     * </p>
     *
     * @return <p>
     *         The time at which the finding was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The time at which the finding was created.
     * </p>
     *
     * @param createdAt <p>
     *            The time at which the finding was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the finding was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The time at which the finding was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingSummary withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The error that resulted in an Error finding.
     * </p>
     *
     * @return <p>
     *         The error that resulted in an Error finding.
     *         </p>
     */
    public String getError() {
        return error;
    }

    /**
     * <p>
     * The error that resulted in an Error finding.
     * </p>
     *
     * @param error <p>
     *            The error that resulted in an Error finding.
     *            </p>
     */
    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * The error that resulted in an Error finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param error <p>
     *            The error that resulted in an Error finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingSummary withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * <p>
     * The ID of the finding.
     * </p>
     *
     * @return <p>
     *         The ID of the finding.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the finding.
     * </p>
     *
     * @param id <p>
     *            The ID of the finding.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The ID of the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * Indicates whether the finding reports a resource that has a policy that
     * allows public access.
     * </p>
     *
     * @return <p>
     *         Indicates whether the finding reports a resource that has a
     *         policy that allows public access.
     *         </p>
     */
    public Boolean isIsPublic() {
        return isPublic;
    }

    /**
     * <p>
     * Indicates whether the finding reports a resource that has a policy that
     * allows public access.
     * </p>
     *
     * @return <p>
     *         Indicates whether the finding reports a resource that has a
     *         policy that allows public access.
     *         </p>
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    /**
     * <p>
     * Indicates whether the finding reports a resource that has a policy that
     * allows public access.
     * </p>
     *
     * @param isPublic <p>
     *            Indicates whether the finding reports a resource that has a
     *            policy that allows public access.
     *            </p>
     */
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    /**
     * <p>
     * Indicates whether the finding reports a resource that has a policy that
     * allows public access.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isPublic <p>
     *            Indicates whether the finding reports a resource that has a
     *            policy that allows public access.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingSummary withIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    /**
     * <p>
     * The external principal that has access to a resource within the zone of
     * trust.
     * </p>
     *
     * @return <p>
     *         The external principal that has access to a resource within the
     *         zone of trust.
     *         </p>
     */
    public java.util.Map<String, String> getPrincipal() {
        return principal;
    }

    /**
     * <p>
     * The external principal that has access to a resource within the zone of
     * trust.
     * </p>
     *
     * @param principal <p>
     *            The external principal that has access to a resource within
     *            the zone of trust.
     *            </p>
     */
    public void setPrincipal(java.util.Map<String, String> principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The external principal that has access to a resource within the zone of
     * trust.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param principal <p>
     *            The external principal that has access to a resource within
     *            the zone of trust.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingSummary withPrincipal(java.util.Map<String, String> principal) {
        this.principal = principal;
        return this;
    }

    /**
     * <p>
     * The external principal that has access to a resource within the zone of
     * trust.
     * </p>
     * <p>
     * The method adds a new key-value pair into principal parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into principal.
     * @param value The corresponding value of the entry to be added into
     *            principal.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingSummary addprincipalEntry(String key, String value) {
        if (null == this.principal) {
            this.principal = new java.util.HashMap<String, String>();
        }
        if (this.principal.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.principal.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into principal.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public FindingSummary clearprincipalEntries() {
        this.principal = null;
        return this;
    }

    /**
     * <p>
     * The resource that the external principal has access to.
     * </p>
     *
     * @return <p>
     *         The resource that the external principal has access to.
     *         </p>
     */
    public String getResource() {
        return resource;
    }

    /**
     * <p>
     * The resource that the external principal has access to.
     * </p>
     *
     * @param resource <p>
     *            The resource that the external principal has access to.
     *            </p>
     */
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The resource that the external principal has access to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resource <p>
     *            The resource that the external principal has access to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingSummary withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * <p>
     * The AWS account ID that owns the resource.
     * </p>
     *
     * @return <p>
     *         The AWS account ID that owns the resource.
     *         </p>
     */
    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    /**
     * <p>
     * The AWS account ID that owns the resource.
     * </p>
     *
     * @param resourceOwnerAccount <p>
     *            The AWS account ID that owns the resource.
     *            </p>
     */
    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    /**
     * <p>
     * The AWS account ID that owns the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceOwnerAccount <p>
     *            The AWS account ID that owns the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingSummary withResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }

    /**
     * <p>
     * The type of the resource that the external principal has access to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::IAM::Role, AWS::KMS::Key,
     * AWS::Lambda::Function, AWS::Lambda::LayerVersion, AWS::S3::Bucket,
     * AWS::SQS::Queue
     *
     * @return <p>
     *         The type of the resource that the external principal has access
     *         to.
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of the resource that the external principal has access to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::IAM::Role, AWS::KMS::Key,
     * AWS::Lambda::Function, AWS::Lambda::LayerVersion, AWS::S3::Bucket,
     * AWS::SQS::Queue
     *
     * @param resourceType <p>
     *            The type of the resource that the external principal has
     *            access to.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource that the external principal has access to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::IAM::Role, AWS::KMS::Key,
     * AWS::Lambda::Function, AWS::Lambda::LayerVersion, AWS::S3::Bucket,
     * AWS::SQS::Queue
     *
     * @param resourceType <p>
     *            The type of the resource that the external principal has
     *            access to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public FindingSummary withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The type of the resource that the external principal has access to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::IAM::Role, AWS::KMS::Key,
     * AWS::Lambda::Function, AWS::Lambda::LayerVersion, AWS::S3::Bucket,
     * AWS::SQS::Queue
     *
     * @param resourceType <p>
     *            The type of the resource that the external principal has
     *            access to.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of the resource that the external principal has access to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::IAM::Role, AWS::KMS::Key,
     * AWS::Lambda::Function, AWS::Lambda::LayerVersion, AWS::S3::Bucket,
     * AWS::SQS::Queue
     *
     * @param resourceType <p>
     *            The type of the resource that the external principal has
     *            access to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public FindingSummary withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The sources of the finding. This indicates how the access that generated
     * the finding is granted. It is populated for Amazon S3 bucket findings.
     * </p>
     *
     * @return <p>
     *         The sources of the finding. This indicates how the access that
     *         generated the finding is granted. It is populated for Amazon S3
     *         bucket findings.
     *         </p>
     */
    public java.util.List<FindingSource> getSources() {
        return sources;
    }

    /**
     * <p>
     * The sources of the finding. This indicates how the access that generated
     * the finding is granted. It is populated for Amazon S3 bucket findings.
     * </p>
     *
     * @param sources <p>
     *            The sources of the finding. This indicates how the access that
     *            generated the finding is granted. It is populated for Amazon
     *            S3 bucket findings.
     *            </p>
     */
    public void setSources(java.util.Collection<FindingSource> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<FindingSource>(sources);
    }

    /**
     * <p>
     * The sources of the finding. This indicates how the access that generated
     * the finding is granted. It is populated for Amazon S3 bucket findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sources <p>
     *            The sources of the finding. This indicates how the access that
     *            generated the finding is granted. It is populated for Amazon
     *            S3 bucket findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingSummary withSources(FindingSource... sources) {
        if (getSources() == null) {
            this.sources = new java.util.ArrayList<FindingSource>(sources.length);
        }
        for (FindingSource value : sources) {
            this.sources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The sources of the finding. This indicates how the access that generated
     * the finding is granted. It is populated for Amazon S3 bucket findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sources <p>
     *            The sources of the finding. This indicates how the access that
     *            generated the finding is granted. It is populated for Amazon
     *            S3 bucket findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingSummary withSources(java.util.Collection<FindingSource> sources) {
        setSources(sources);
        return this;
    }

    /**
     * <p>
     * The status of the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED, RESOLVED
     *
     * @return <p>
     *         The status of the finding.
     *         </p>
     * @see FindingStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED, RESOLVED
     *
     * @param status <p>
     *            The status of the finding.
     *            </p>
     * @see FindingStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED, RESOLVED
     *
     * @param status <p>
     *            The status of the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingStatus
     */
    public FindingSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED, RESOLVED
     *
     * @param status <p>
     *            The status of the finding.
     *            </p>
     * @see FindingStatus
     */
    public void setStatus(FindingStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED, RESOLVED
     *
     * @param status <p>
     *            The status of the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingStatus
     */
    public FindingSummary withStatus(FindingStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the finding was most recently updated.
     * </p>
     *
     * @return <p>
     *         The time at which the finding was most recently updated.
     *         </p>
     */
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * <p>
     * The time at which the finding was most recently updated.
     * </p>
     *
     * @param updatedAt <p>
     *            The time at which the finding was most recently updated.
     *            </p>
     */
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the finding was most recently updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedAt <p>
     *            The time at which the finding was most recently updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingSummary withUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
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
        if (getAction() != null)
            sb.append("action: " + getAction() + ",");
        if (getAnalyzedAt() != null)
            sb.append("analyzedAt: " + getAnalyzedAt() + ",");
        if (getCondition() != null)
            sb.append("condition: " + getCondition() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getError() != null)
            sb.append("error: " + getError() + ",");
        if (getId() != null)
            sb.append("id: " + getId() + ",");
        if (getIsPublic() != null)
            sb.append("isPublic: " + getIsPublic() + ",");
        if (getPrincipal() != null)
            sb.append("principal: " + getPrincipal() + ",");
        if (getResource() != null)
            sb.append("resource: " + getResource() + ",");
        if (getResourceOwnerAccount() != null)
            sb.append("resourceOwnerAccount: " + getResourceOwnerAccount() + ",");
        if (getResourceType() != null)
            sb.append("resourceType: " + getResourceType() + ",");
        if (getSources() != null)
            sb.append("sources: " + getSources() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getUpdatedAt() != null)
            sb.append("updatedAt: " + getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getAnalyzedAt() == null) ? 0 : getAnalyzedAt().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIsPublic() == null) ? 0 : getIsPublic().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode
                + ((getResourceOwnerAccount() == null) ? 0 : getResourceOwnerAccount().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingSummary == false)
            return false;
        FindingSummary other = (FindingSummary) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getAnalyzedAt() == null ^ this.getAnalyzedAt() == null)
            return false;
        if (other.getAnalyzedAt() != null
                && other.getAnalyzedAt().equals(this.getAnalyzedAt()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null
                && other.getCondition().equals(this.getCondition()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIsPublic() == null ^ this.getIsPublic() == null)
            return false;
        if (other.getIsPublic() != null && other.getIsPublic().equals(this.getIsPublic()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null
                && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getResourceOwnerAccount() == null ^ this.getResourceOwnerAccount() == null)
            return false;
        if (other.getResourceOwnerAccount() != null
                && other.getResourceOwnerAccount().equals(this.getResourceOwnerAccount()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null
                && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }
}
