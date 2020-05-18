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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about a finding.
 * </p>
 */
public class Finding implements Serializable {
    /**
     * <p>
     * The identifier for the AWS account that the finding applies to. This is
     * typically the account that owns the affected resource.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * Specifies whether the finding is archived.
     * </p>
     */
    private Boolean archived;

    /**
     * <p>
     * The category of the finding. Possible values are: CLASSIFICATION, for a
     * sensitive data finding; and, POLICY, for a policy finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLASSIFICATION, POLICY
     */
    private String category;

    /**
     * <p>
     * The details of a sensitive data finding. This value is null for a policy
     * finding.
     * </p>
     */
    private ClassificationDetails classificationDetails;

    /**
     * <p>
     * The total number of occurrences of this finding.
     * </p>
     */
    private Long count;

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the finding
     * was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The description of the finding.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The unique identifier for the finding. This is a random string that
     * Amazon Macie generates and assigns to a finding when it creates the
     * finding.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The AWS partition that Amazon Macie created the finding in.
     * </p>
     */
    private String partition;

    /**
     * <p>
     * The details of a policy finding. This value is null for a sensitive data
     * finding.
     * </p>
     */
    private PolicyDetails policyDetails;

    /**
     * <p>
     * The AWS Region that Amazon Macie created the finding in.
     * </p>
     */
    private String region;

    /**
     * <p>
     * The resources that the finding applies to.
     * </p>
     */
    private ResourcesAffected resourcesAffected;

    /**
     * <p>
     * Specifies whether the finding is a sample finding. A <i>sample
     * finding</i> is a finding that uses example data to demonstrate what a
     * finding might contain.
     * </p>
     */
    private Boolean sample;

    /**
     * <p>
     * The version of the schema that was used to define the data structures in
     * the finding.
     * </p>
     */
    private String schemaVersion;

    /**
     * <p>
     * The severity of the finding.
     * </p>
     */
    private Severity severity;

    /**
     * <p>
     * The brief description of the finding.
     * </p>
     */
    private String title;

    /**
     * <p>
     * The type of the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SensitiveData:S3Object/Multiple,
     * SensitiveData:S3Object/Financial, SensitiveData:S3Object/Personal,
     * SensitiveData:S3Object/Credentials,
     * SensitiveData:S3Object/CustomIdentifier, Policy:IAMUser/S3BucketPublic,
     * Policy:IAMUser/S3BucketSharedExternally,
     * Policy:IAMUser/S3BucketReplicatedExternally,
     * Policy:IAMUser/S3BucketEncryptionDisabled,
     * Policy:IAMUser/S3BlockPublicAccessDisabled
     */
    private String type;

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the finding
     * was last updated. For sensitive data findings, this value is the same as
     * the value for the createdAt property. Sensitive data findings aren't
     * updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The identifier for the AWS account that the finding applies to. This is
     * typically the account that owns the affected resource.
     * </p>
     *
     * @return <p>
     *         The identifier for the AWS account that the finding applies to.
     *         This is typically the account that owns the affected resource.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The identifier for the AWS account that the finding applies to. This is
     * typically the account that owns the affected resource.
     * </p>
     *
     * @param accountId <p>
     *            The identifier for the AWS account that the finding applies
     *            to. This is typically the account that owns the affected
     *            resource.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The identifier for the AWS account that the finding applies to. This is
     * typically the account that owns the affected resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountId <p>
     *            The identifier for the AWS account that the finding applies
     *            to. This is typically the account that owns the affected
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * Specifies whether the finding is archived.
     * </p>
     *
     * @return <p>
     *         Specifies whether the finding is archived.
     *         </p>
     */
    public Boolean isArchived() {
        return archived;
    }

    /**
     * <p>
     * Specifies whether the finding is archived.
     * </p>
     *
     * @return <p>
     *         Specifies whether the finding is archived.
     *         </p>
     */
    public Boolean getArchived() {
        return archived;
    }

    /**
     * <p>
     * Specifies whether the finding is archived.
     * </p>
     *
     * @param archived <p>
     *            Specifies whether the finding is archived.
     *            </p>
     */
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    /**
     * <p>
     * Specifies whether the finding is archived.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param archived <p>
     *            Specifies whether the finding is archived.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * <p>
     * The category of the finding. Possible values are: CLASSIFICATION, for a
     * sensitive data finding; and, POLICY, for a policy finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLASSIFICATION, POLICY
     *
     * @return <p>
     *         The category of the finding. Possible values are: CLASSIFICATION,
     *         for a sensitive data finding; and, POLICY, for a policy finding.
     *         </p>
     * @see FindingCategory
     */
    public String getCategory() {
        return category;
    }

    /**
     * <p>
     * The category of the finding. Possible values are: CLASSIFICATION, for a
     * sensitive data finding; and, POLICY, for a policy finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLASSIFICATION, POLICY
     *
     * @param category <p>
     *            The category of the finding. Possible values are:
     *            CLASSIFICATION, for a sensitive data finding; and, POLICY, for
     *            a policy finding.
     *            </p>
     * @see FindingCategory
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category of the finding. Possible values are: CLASSIFICATION, for a
     * sensitive data finding; and, POLICY, for a policy finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLASSIFICATION, POLICY
     *
     * @param category <p>
     *            The category of the finding. Possible values are:
     *            CLASSIFICATION, for a sensitive data finding; and, POLICY, for
     *            a policy finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingCategory
     */
    public Finding withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * <p>
     * The category of the finding. Possible values are: CLASSIFICATION, for a
     * sensitive data finding; and, POLICY, for a policy finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLASSIFICATION, POLICY
     *
     * @param category <p>
     *            The category of the finding. Possible values are:
     *            CLASSIFICATION, for a sensitive data finding; and, POLICY, for
     *            a policy finding.
     *            </p>
     * @see FindingCategory
     */
    public void setCategory(FindingCategory category) {
        this.category = category.toString();
    }

    /**
     * <p>
     * The category of the finding. Possible values are: CLASSIFICATION, for a
     * sensitive data finding; and, POLICY, for a policy finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLASSIFICATION, POLICY
     *
     * @param category <p>
     *            The category of the finding. Possible values are:
     *            CLASSIFICATION, for a sensitive data finding; and, POLICY, for
     *            a policy finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingCategory
     */
    public Finding withCategory(FindingCategory category) {
        this.category = category.toString();
        return this;
    }

    /**
     * <p>
     * The details of a sensitive data finding. This value is null for a policy
     * finding.
     * </p>
     *
     * @return <p>
     *         The details of a sensitive data finding. This value is null for a
     *         policy finding.
     *         </p>
     */
    public ClassificationDetails getClassificationDetails() {
        return classificationDetails;
    }

    /**
     * <p>
     * The details of a sensitive data finding. This value is null for a policy
     * finding.
     * </p>
     *
     * @param classificationDetails <p>
     *            The details of a sensitive data finding. This value is null
     *            for a policy finding.
     *            </p>
     */
    public void setClassificationDetails(ClassificationDetails classificationDetails) {
        this.classificationDetails = classificationDetails;
    }

    /**
     * <p>
     * The details of a sensitive data finding. This value is null for a policy
     * finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classificationDetails <p>
     *            The details of a sensitive data finding. This value is null
     *            for a policy finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withClassificationDetails(ClassificationDetails classificationDetails) {
        this.classificationDetails = classificationDetails;
        return this;
    }

    /**
     * <p>
     * The total number of occurrences of this finding.
     * </p>
     *
     * @return <p>
     *         The total number of occurrences of this finding.
     *         </p>
     */
    public Long getCount() {
        return count;
    }

    /**
     * <p>
     * The total number of occurrences of this finding.
     * </p>
     *
     * @param count <p>
     *            The total number of occurrences of this finding.
     *            </p>
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * <p>
     * The total number of occurrences of this finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param count <p>
     *            The total number of occurrences of this finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the finding
     * was created.
     * </p>
     *
     * @return <p>
     *         The date and time, in UTC and extended ISO 8601 format, when the
     *         finding was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the finding
     * was created.
     * </p>
     *
     * @param createdAt <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            the finding was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the finding
     * was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            the finding was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     *
     * @return <p>
     *         The description of the finding.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     *
     * @param description <p>
     *            The description of the finding.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the finding. This is a random string that
     * Amazon Macie generates and assigns to a finding when it creates the
     * finding.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the finding. This is a random string
     *         that Amazon Macie generates and assigns to a finding when it
     *         creates the finding.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the finding. This is a random string that
     * Amazon Macie generates and assigns to a finding when it creates the
     * finding.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the finding. This is a random string
     *            that Amazon Macie generates and assigns to a finding when it
     *            creates the finding.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the finding. This is a random string that
     * Amazon Macie generates and assigns to a finding when it creates the
     * finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the finding. This is a random string
     *            that Amazon Macie generates and assigns to a finding when it
     *            creates the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The AWS partition that Amazon Macie created the finding in.
     * </p>
     *
     * @return <p>
     *         The AWS partition that Amazon Macie created the finding in.
     *         </p>
     */
    public String getPartition() {
        return partition;
    }

    /**
     * <p>
     * The AWS partition that Amazon Macie created the finding in.
     * </p>
     *
     * @param partition <p>
     *            The AWS partition that Amazon Macie created the finding in.
     *            </p>
     */
    public void setPartition(String partition) {
        this.partition = partition;
    }

    /**
     * <p>
     * The AWS partition that Amazon Macie created the finding in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partition <p>
     *            The AWS partition that Amazon Macie created the finding in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withPartition(String partition) {
        this.partition = partition;
        return this;
    }

    /**
     * <p>
     * The details of a policy finding. This value is null for a sensitive data
     * finding.
     * </p>
     *
     * @return <p>
     *         The details of a policy finding. This value is null for a
     *         sensitive data finding.
     *         </p>
     */
    public PolicyDetails getPolicyDetails() {
        return policyDetails;
    }

    /**
     * <p>
     * The details of a policy finding. This value is null for a sensitive data
     * finding.
     * </p>
     *
     * @param policyDetails <p>
     *            The details of a policy finding. This value is null for a
     *            sensitive data finding.
     *            </p>
     */
    public void setPolicyDetails(PolicyDetails policyDetails) {
        this.policyDetails = policyDetails;
    }

    /**
     * <p>
     * The details of a policy finding. This value is null for a sensitive data
     * finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyDetails <p>
     *            The details of a policy finding. This value is null for a
     *            sensitive data finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withPolicyDetails(PolicyDetails policyDetails) {
        this.policyDetails = policyDetails;
        return this;
    }

    /**
     * <p>
     * The AWS Region that Amazon Macie created the finding in.
     * </p>
     *
     * @return <p>
     *         The AWS Region that Amazon Macie created the finding in.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The AWS Region that Amazon Macie created the finding in.
     * </p>
     *
     * @param region <p>
     *            The AWS Region that Amazon Macie created the finding in.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region that Amazon Macie created the finding in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param region <p>
     *            The AWS Region that Amazon Macie created the finding in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * The resources that the finding applies to.
     * </p>
     *
     * @return <p>
     *         The resources that the finding applies to.
     *         </p>
     */
    public ResourcesAffected getResourcesAffected() {
        return resourcesAffected;
    }

    /**
     * <p>
     * The resources that the finding applies to.
     * </p>
     *
     * @param resourcesAffected <p>
     *            The resources that the finding applies to.
     *            </p>
     */
    public void setResourcesAffected(ResourcesAffected resourcesAffected) {
        this.resourcesAffected = resourcesAffected;
    }

    /**
     * <p>
     * The resources that the finding applies to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourcesAffected <p>
     *            The resources that the finding applies to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withResourcesAffected(ResourcesAffected resourcesAffected) {
        this.resourcesAffected = resourcesAffected;
        return this;
    }

    /**
     * <p>
     * Specifies whether the finding is a sample finding. A <i>sample
     * finding</i> is a finding that uses example data to demonstrate what a
     * finding might contain.
     * </p>
     *
     * @return <p>
     *         Specifies whether the finding is a sample finding. A <i>sample
     *         finding</i> is a finding that uses example data to demonstrate
     *         what a finding might contain.
     *         </p>
     */
    public Boolean isSample() {
        return sample;
    }

    /**
     * <p>
     * Specifies whether the finding is a sample finding. A <i>sample
     * finding</i> is a finding that uses example data to demonstrate what a
     * finding might contain.
     * </p>
     *
     * @return <p>
     *         Specifies whether the finding is a sample finding. A <i>sample
     *         finding</i> is a finding that uses example data to demonstrate
     *         what a finding might contain.
     *         </p>
     */
    public Boolean getSample() {
        return sample;
    }

    /**
     * <p>
     * Specifies whether the finding is a sample finding. A <i>sample
     * finding</i> is a finding that uses example data to demonstrate what a
     * finding might contain.
     * </p>
     *
     * @param sample <p>
     *            Specifies whether the finding is a sample finding. A <i>sample
     *            finding</i> is a finding that uses example data to demonstrate
     *            what a finding might contain.
     *            </p>
     */
    public void setSample(Boolean sample) {
        this.sample = sample;
    }

    /**
     * <p>
     * Specifies whether the finding is a sample finding. A <i>sample
     * finding</i> is a finding that uses example data to demonstrate what a
     * finding might contain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sample <p>
     *            Specifies whether the finding is a sample finding. A <i>sample
     *            finding</i> is a finding that uses example data to demonstrate
     *            what a finding might contain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withSample(Boolean sample) {
        this.sample = sample;
        return this;
    }

    /**
     * <p>
     * The version of the schema that was used to define the data structures in
     * the finding.
     * </p>
     *
     * @return <p>
     *         The version of the schema that was used to define the data
     *         structures in the finding.
     *         </p>
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * <p>
     * The version of the schema that was used to define the data structures in
     * the finding.
     * </p>
     *
     * @param schemaVersion <p>
     *            The version of the schema that was used to define the data
     *            structures in the finding.
     *            </p>
     */
    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * <p>
     * The version of the schema that was used to define the data structures in
     * the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schemaVersion <p>
     *            The version of the schema that was used to define the data
     *            structures in the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }

    /**
     * <p>
     * The severity of the finding.
     * </p>
     *
     * @return <p>
     *         The severity of the finding.
     *         </p>
     */
    public Severity getSeverity() {
        return severity;
    }

    /**
     * <p>
     * The severity of the finding.
     * </p>
     *
     * @param severity <p>
     *            The severity of the finding.
     *            </p>
     */
    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity of the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param severity <p>
     *            The severity of the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withSeverity(Severity severity) {
        this.severity = severity;
        return this;
    }

    /**
     * <p>
     * The brief description of the finding.
     * </p>
     *
     * @return <p>
     *         The brief description of the finding.
     *         </p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * The brief description of the finding.
     * </p>
     *
     * @param title <p>
     *            The brief description of the finding.
     *            </p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The brief description of the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param title <p>
     *            The brief description of the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * <p>
     * The type of the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SensitiveData:S3Object/Multiple,
     * SensitiveData:S3Object/Financial, SensitiveData:S3Object/Personal,
     * SensitiveData:S3Object/Credentials,
     * SensitiveData:S3Object/CustomIdentifier, Policy:IAMUser/S3BucketPublic,
     * Policy:IAMUser/S3BucketSharedExternally,
     * Policy:IAMUser/S3BucketReplicatedExternally,
     * Policy:IAMUser/S3BucketEncryptionDisabled,
     * Policy:IAMUser/S3BlockPublicAccessDisabled
     *
     * @return <p>
     *         The type of the finding.
     *         </p>
     * @see FindingType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SensitiveData:S3Object/Multiple,
     * SensitiveData:S3Object/Financial, SensitiveData:S3Object/Personal,
     * SensitiveData:S3Object/Credentials,
     * SensitiveData:S3Object/CustomIdentifier, Policy:IAMUser/S3BucketPublic,
     * Policy:IAMUser/S3BucketSharedExternally,
     * Policy:IAMUser/S3BucketReplicatedExternally,
     * Policy:IAMUser/S3BucketEncryptionDisabled,
     * Policy:IAMUser/S3BlockPublicAccessDisabled
     *
     * @param type <p>
     *            The type of the finding.
     *            </p>
     * @see FindingType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SensitiveData:S3Object/Multiple,
     * SensitiveData:S3Object/Financial, SensitiveData:S3Object/Personal,
     * SensitiveData:S3Object/Credentials,
     * SensitiveData:S3Object/CustomIdentifier, Policy:IAMUser/S3BucketPublic,
     * Policy:IAMUser/S3BucketSharedExternally,
     * Policy:IAMUser/S3BucketReplicatedExternally,
     * Policy:IAMUser/S3BucketEncryptionDisabled,
     * Policy:IAMUser/S3BlockPublicAccessDisabled
     *
     * @param type <p>
     *            The type of the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingType
     */
    public Finding withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SensitiveData:S3Object/Multiple,
     * SensitiveData:S3Object/Financial, SensitiveData:S3Object/Personal,
     * SensitiveData:S3Object/Credentials,
     * SensitiveData:S3Object/CustomIdentifier, Policy:IAMUser/S3BucketPublic,
     * Policy:IAMUser/S3BucketSharedExternally,
     * Policy:IAMUser/S3BucketReplicatedExternally,
     * Policy:IAMUser/S3BucketEncryptionDisabled,
     * Policy:IAMUser/S3BlockPublicAccessDisabled
     *
     * @param type <p>
     *            The type of the finding.
     *            </p>
     * @see FindingType
     */
    public void setType(FindingType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SensitiveData:S3Object/Multiple,
     * SensitiveData:S3Object/Financial, SensitiveData:S3Object/Personal,
     * SensitiveData:S3Object/Credentials,
     * SensitiveData:S3Object/CustomIdentifier, Policy:IAMUser/S3BucketPublic,
     * Policy:IAMUser/S3BucketSharedExternally,
     * Policy:IAMUser/S3BucketReplicatedExternally,
     * Policy:IAMUser/S3BucketEncryptionDisabled,
     * Policy:IAMUser/S3BlockPublicAccessDisabled
     *
     * @param type <p>
     *            The type of the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingType
     */
    public Finding withType(FindingType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the finding
     * was last updated. For sensitive data findings, this value is the same as
     * the value for the createdAt property. Sensitive data findings aren't
     * updated.
     * </p>
     *
     * @return <p>
     *         The date and time, in UTC and extended ISO 8601 format, when the
     *         finding was last updated. For sensitive data findings, this value
     *         is the same as the value for the createdAt property. Sensitive
     *         data findings aren't updated.
     *         </p>
     */
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the finding
     * was last updated. For sensitive data findings, this value is the same as
     * the value for the createdAt property. Sensitive data findings aren't
     * updated.
     * </p>
     *
     * @param updatedAt <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            the finding was last updated. For sensitive data findings,
     *            this value is the same as the value for the createdAt
     *            property. Sensitive data findings aren't updated.
     *            </p>
     */
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the finding
     * was last updated. For sensitive data findings, this value is the same as
     * the value for the createdAt property. Sensitive data findings aren't
     * updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedAt <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            the finding was last updated. For sensitive data findings,
     *            this value is the same as the value for the createdAt
     *            property. Sensitive data findings aren't updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Finding withUpdatedAt(java.util.Date updatedAt) {
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
        if (getAccountId() != null)
            sb.append("accountId: " + getAccountId() + ",");
        if (getArchived() != null)
            sb.append("archived: " + getArchived() + ",");
        if (getCategory() != null)
            sb.append("category: " + getCategory() + ",");
        if (getClassificationDetails() != null)
            sb.append("classificationDetails: " + getClassificationDetails() + ",");
        if (getCount() != null)
            sb.append("count: " + getCount() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getId() != null)
            sb.append("id: " + getId() + ",");
        if (getPartition() != null)
            sb.append("partition: " + getPartition() + ",");
        if (getPolicyDetails() != null)
            sb.append("policyDetails: " + getPolicyDetails() + ",");
        if (getRegion() != null)
            sb.append("region: " + getRegion() + ",");
        if (getResourcesAffected() != null)
            sb.append("resourcesAffected: " + getResourcesAffected() + ",");
        if (getSample() != null)
            sb.append("sample: " + getSample() + ",");
        if (getSchemaVersion() != null)
            sb.append("schemaVersion: " + getSchemaVersion() + ",");
        if (getSeverity() != null)
            sb.append("severity: " + getSeverity() + ",");
        if (getTitle() != null)
            sb.append("title: " + getTitle() + ",");
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getUpdatedAt() != null)
            sb.append("updatedAt: " + getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getArchived() == null) ? 0 : getArchived().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime
                * hashCode
                + ((getClassificationDetails() == null) ? 0 : getClassificationDetails().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getPartition() == null) ? 0 : getPartition().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyDetails() == null) ? 0 : getPolicyDetails().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode
                + ((getResourcesAffected() == null) ? 0 : getResourcesAffected().hashCode());
        hashCode = prime * hashCode + ((getSample() == null) ? 0 : getSample().hashCode());
        hashCode = prime * hashCode
                + ((getSchemaVersion() == null) ? 0 : getSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Finding == false)
            return false;
        Finding other = (Finding) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getArchived() == null ^ this.getArchived() == null)
            return false;
        if (other.getArchived() != null && other.getArchived().equals(this.getArchived()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getClassificationDetails() == null ^ this.getClassificationDetails() == null)
            return false;
        if (other.getClassificationDetails() != null
                && other.getClassificationDetails().equals(this.getClassificationDetails()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getPartition() == null ^ this.getPartition() == null)
            return false;
        if (other.getPartition() != null
                && other.getPartition().equals(this.getPartition()) == false)
            return false;
        if (other.getPolicyDetails() == null ^ this.getPolicyDetails() == null)
            return false;
        if (other.getPolicyDetails() != null
                && other.getPolicyDetails().equals(this.getPolicyDetails()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getResourcesAffected() == null ^ this.getResourcesAffected() == null)
            return false;
        if (other.getResourcesAffected() != null
                && other.getResourcesAffected().equals(this.getResourcesAffected()) == false)
            return false;
        if (other.getSample() == null ^ this.getSample() == null)
            return false;
        if (other.getSample() != null && other.getSample().equals(this.getSample()) == false)
            return false;
        if (other.getSchemaVersion() == null ^ this.getSchemaVersion() == null)
            return false;
        if (other.getSchemaVersion() != null
                && other.getSchemaVersion().equals(this.getSchemaVersion()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null
                && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }
}
