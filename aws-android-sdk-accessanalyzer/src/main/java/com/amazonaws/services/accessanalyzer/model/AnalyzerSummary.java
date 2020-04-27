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
 * Contains information about the analyzer.
 * </p>
 */
public class AnalyzerSummary implements Serializable {
    /**
     * <p>
     * The ARN of the analyzer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^:]*:[^:]*:[^:]*:[^:]*:[^:]*:analyzer/.{1,255}$<br/>
     */
    private String arn;

    /**
     * <p>
     * A timestamp for the time at which the analyzer was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The resource that was most recently analyzed by the analyzer.
     * </p>
     */
    private String lastResourceAnalyzed;

    /**
     * <p>
     * The time at which the most recently analyzed resource was analyzed.
     * </p>
     */
    private java.util.Date lastResourceAnalyzedAt;

    /**
     * <p>
     * The name of the analyzer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     */
    private String name;

    /**
     * <p>
     * The status of the analyzer. An <code>Active</code> analyzer successfully
     * monitors supported resources and generates new findings. The analyzer is
     * <code>Disabled</code> when a user action, such as removing trusted access
     * for IAM Access Analyzer from AWS Organizations, causes the analyzer to
     * stop generating new findings. The status is <code>Creating</code> when
     * the analyzer creation is in progress and <code>Failed</code> when the
     * analyzer creation has failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, CREATING, DISABLED, FAILED
     */
    private String status;

    /**
     * <p>
     * The <code>statusReason</code> provides more details about the current
     * status of the analyzer. For example, if the creation for the analyzer
     * fails, a <code>Failed</code> status is displayed. For an analyzer with
     * organization as the type, this failure can be due to an issue with
     * creating the service-linked roles required in the member accounts of the
     * AWS organization.
     * </p>
     */
    private StatusReason statusReason;

    /**
     * <p>
     * The tags added to the analyzer.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The type of analyzer, which corresponds to the zone of trust chosen for
     * the analyzer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATION
     */
    private String type;

    /**
     * <p>
     * The ARN of the analyzer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^:]*:[^:]*:[^:]*:[^:]*:[^:]*:analyzer/.{1,255}$<br/>
     *
     * @return <p>
     *         The ARN of the analyzer.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The ARN of the analyzer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^:]*:[^:]*:[^:]*:[^:]*:[^:]*:analyzer/.{1,255}$<br/>
     *
     * @param arn <p>
     *            The ARN of the analyzer.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the analyzer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^:]*:[^:]*:[^:]*:[^:]*:[^:]*:analyzer/.{1,255}$<br/>
     *
     * @param arn <p>
     *            The ARN of the analyzer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzerSummary withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * A timestamp for the time at which the analyzer was created.
     * </p>
     *
     * @return <p>
     *         A timestamp for the time at which the analyzer was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * A timestamp for the time at which the analyzer was created.
     * </p>
     *
     * @param createdAt <p>
     *            A timestamp for the time at which the analyzer was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * A timestamp for the time at which the analyzer was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            A timestamp for the time at which the analyzer was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzerSummary withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The resource that was most recently analyzed by the analyzer.
     * </p>
     *
     * @return <p>
     *         The resource that was most recently analyzed by the analyzer.
     *         </p>
     */
    public String getLastResourceAnalyzed() {
        return lastResourceAnalyzed;
    }

    /**
     * <p>
     * The resource that was most recently analyzed by the analyzer.
     * </p>
     *
     * @param lastResourceAnalyzed <p>
     *            The resource that was most recently analyzed by the analyzer.
     *            </p>
     */
    public void setLastResourceAnalyzed(String lastResourceAnalyzed) {
        this.lastResourceAnalyzed = lastResourceAnalyzed;
    }

    /**
     * <p>
     * The resource that was most recently analyzed by the analyzer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastResourceAnalyzed <p>
     *            The resource that was most recently analyzed by the analyzer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzerSummary withLastResourceAnalyzed(String lastResourceAnalyzed) {
        this.lastResourceAnalyzed = lastResourceAnalyzed;
        return this;
    }

    /**
     * <p>
     * The time at which the most recently analyzed resource was analyzed.
     * </p>
     *
     * @return <p>
     *         The time at which the most recently analyzed resource was
     *         analyzed.
     *         </p>
     */
    public java.util.Date getLastResourceAnalyzedAt() {
        return lastResourceAnalyzedAt;
    }

    /**
     * <p>
     * The time at which the most recently analyzed resource was analyzed.
     * </p>
     *
     * @param lastResourceAnalyzedAt <p>
     *            The time at which the most recently analyzed resource was
     *            analyzed.
     *            </p>
     */
    public void setLastResourceAnalyzedAt(java.util.Date lastResourceAnalyzedAt) {
        this.lastResourceAnalyzedAt = lastResourceAnalyzedAt;
    }

    /**
     * <p>
     * The time at which the most recently analyzed resource was analyzed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastResourceAnalyzedAt <p>
     *            The time at which the most recently analyzed resource was
     *            analyzed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzerSummary withLastResourceAnalyzedAt(java.util.Date lastResourceAnalyzedAt) {
        this.lastResourceAnalyzedAt = lastResourceAnalyzedAt;
        return this;
    }

    /**
     * <p>
     * The name of the analyzer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     *
     * @return <p>
     *         The name of the analyzer.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the analyzer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     *
     * @param name <p>
     *            The name of the analyzer.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the analyzer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     *
     * @param name <p>
     *            The name of the analyzer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzerSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The status of the analyzer. An <code>Active</code> analyzer successfully
     * monitors supported resources and generates new findings. The analyzer is
     * <code>Disabled</code> when a user action, such as removing trusted access
     * for IAM Access Analyzer from AWS Organizations, causes the analyzer to
     * stop generating new findings. The status is <code>Creating</code> when
     * the analyzer creation is in progress and <code>Failed</code> when the
     * analyzer creation has failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, CREATING, DISABLED, FAILED
     *
     * @return <p>
     *         The status of the analyzer. An <code>Active</code> analyzer
     *         successfully monitors supported resources and generates new
     *         findings. The analyzer is <code>Disabled</code> when a user
     *         action, such as removing trusted access for IAM Access Analyzer
     *         from AWS Organizations, causes the analyzer to stop generating
     *         new findings. The status is <code>Creating</code> when the
     *         analyzer creation is in progress and <code>Failed</code> when the
     *         analyzer creation has failed.
     *         </p>
     * @see AnalyzerStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the analyzer. An <code>Active</code> analyzer successfully
     * monitors supported resources and generates new findings. The analyzer is
     * <code>Disabled</code> when a user action, such as removing trusted access
     * for IAM Access Analyzer from AWS Organizations, causes the analyzer to
     * stop generating new findings. The status is <code>Creating</code> when
     * the analyzer creation is in progress and <code>Failed</code> when the
     * analyzer creation has failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, CREATING, DISABLED, FAILED
     *
     * @param status <p>
     *            The status of the analyzer. An <code>Active</code> analyzer
     *            successfully monitors supported resources and generates new
     *            findings. The analyzer is <code>Disabled</code> when a user
     *            action, such as removing trusted access for IAM Access
     *            Analyzer from AWS Organizations, causes the analyzer to stop
     *            generating new findings. The status is <code>Creating</code>
     *            when the analyzer creation is in progress and
     *            <code>Failed</code> when the analyzer creation has failed.
     *            </p>
     * @see AnalyzerStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the analyzer. An <code>Active</code> analyzer successfully
     * monitors supported resources and generates new findings. The analyzer is
     * <code>Disabled</code> when a user action, such as removing trusted access
     * for IAM Access Analyzer from AWS Organizations, causes the analyzer to
     * stop generating new findings. The status is <code>Creating</code> when
     * the analyzer creation is in progress and <code>Failed</code> when the
     * analyzer creation has failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, CREATING, DISABLED, FAILED
     *
     * @param status <p>
     *            The status of the analyzer. An <code>Active</code> analyzer
     *            successfully monitors supported resources and generates new
     *            findings. The analyzer is <code>Disabled</code> when a user
     *            action, such as removing trusted access for IAM Access
     *            Analyzer from AWS Organizations, causes the analyzer to stop
     *            generating new findings. The status is <code>Creating</code>
     *            when the analyzer creation is in progress and
     *            <code>Failed</code> when the analyzer creation has failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AnalyzerStatus
     */
    public AnalyzerSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the analyzer. An <code>Active</code> analyzer successfully
     * monitors supported resources and generates new findings. The analyzer is
     * <code>Disabled</code> when a user action, such as removing trusted access
     * for IAM Access Analyzer from AWS Organizations, causes the analyzer to
     * stop generating new findings. The status is <code>Creating</code> when
     * the analyzer creation is in progress and <code>Failed</code> when the
     * analyzer creation has failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, CREATING, DISABLED, FAILED
     *
     * @param status <p>
     *            The status of the analyzer. An <code>Active</code> analyzer
     *            successfully monitors supported resources and generates new
     *            findings. The analyzer is <code>Disabled</code> when a user
     *            action, such as removing trusted access for IAM Access
     *            Analyzer from AWS Organizations, causes the analyzer to stop
     *            generating new findings. The status is <code>Creating</code>
     *            when the analyzer creation is in progress and
     *            <code>Failed</code> when the analyzer creation has failed.
     *            </p>
     * @see AnalyzerStatus
     */
    public void setStatus(AnalyzerStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the analyzer. An <code>Active</code> analyzer successfully
     * monitors supported resources and generates new findings. The analyzer is
     * <code>Disabled</code> when a user action, such as removing trusted access
     * for IAM Access Analyzer from AWS Organizations, causes the analyzer to
     * stop generating new findings. The status is <code>Creating</code> when
     * the analyzer creation is in progress and <code>Failed</code> when the
     * analyzer creation has failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, CREATING, DISABLED, FAILED
     *
     * @param status <p>
     *            The status of the analyzer. An <code>Active</code> analyzer
     *            successfully monitors supported resources and generates new
     *            findings. The analyzer is <code>Disabled</code> when a user
     *            action, such as removing trusted access for IAM Access
     *            Analyzer from AWS Organizations, causes the analyzer to stop
     *            generating new findings. The status is <code>Creating</code>
     *            when the analyzer creation is in progress and
     *            <code>Failed</code> when the analyzer creation has failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AnalyzerStatus
     */
    public AnalyzerSummary withStatus(AnalyzerStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The <code>statusReason</code> provides more details about the current
     * status of the analyzer. For example, if the creation for the analyzer
     * fails, a <code>Failed</code> status is displayed. For an analyzer with
     * organization as the type, this failure can be due to an issue with
     * creating the service-linked roles required in the member accounts of the
     * AWS organization.
     * </p>
     *
     * @return <p>
     *         The <code>statusReason</code> provides more details about the
     *         current status of the analyzer. For example, if the creation for
     *         the analyzer fails, a <code>Failed</code> status is displayed.
     *         For an analyzer with organization as the type, this failure can
     *         be due to an issue with creating the service-linked roles
     *         required in the member accounts of the AWS organization.
     *         </p>
     */
    public StatusReason getStatusReason() {
        return statusReason;
    }

    /**
     * <p>
     * The <code>statusReason</code> provides more details about the current
     * status of the analyzer. For example, if the creation for the analyzer
     * fails, a <code>Failed</code> status is displayed. For an analyzer with
     * organization as the type, this failure can be due to an issue with
     * creating the service-linked roles required in the member accounts of the
     * AWS organization.
     * </p>
     *
     * @param statusReason <p>
     *            The <code>statusReason</code> provides more details about the
     *            current status of the analyzer. For example, if the creation
     *            for the analyzer fails, a <code>Failed</code> status is
     *            displayed. For an analyzer with organization as the type, this
     *            failure can be due to an issue with creating the
     *            service-linked roles required in the member accounts of the
     *            AWS organization.
     *            </p>
     */
    public void setStatusReason(StatusReason statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The <code>statusReason</code> provides more details about the current
     * status of the analyzer. For example, if the creation for the analyzer
     * fails, a <code>Failed</code> status is displayed. For an analyzer with
     * organization as the type, this failure can be due to an issue with
     * creating the service-linked roles required in the member accounts of the
     * AWS organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusReason <p>
     *            The <code>statusReason</code> provides more details about the
     *            current status of the analyzer. For example, if the creation
     *            for the analyzer fails, a <code>Failed</code> status is
     *            displayed. For an analyzer with organization as the type, this
     *            failure can be due to an issue with creating the
     *            service-linked roles required in the member accounts of the
     *            AWS organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzerSummary withStatusReason(StatusReason statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /**
     * <p>
     * The tags added to the analyzer.
     * </p>
     *
     * @return <p>
     *         The tags added to the analyzer.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags added to the analyzer.
     * </p>
     *
     * @param tags <p>
     *            The tags added to the analyzer.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags added to the analyzer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags added to the analyzer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzerSummary withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags added to the analyzer.
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
    public AnalyzerSummary addtagsEntry(String key, String value) {
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
    public AnalyzerSummary cleartagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The type of analyzer, which corresponds to the zone of trust chosen for
     * the analyzer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATION
     *
     * @return <p>
     *         The type of analyzer, which corresponds to the zone of trust
     *         chosen for the analyzer.
     *         </p>
     * @see Type
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of analyzer, which corresponds to the zone of trust chosen for
     * the analyzer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATION
     *
     * @param type <p>
     *            The type of analyzer, which corresponds to the zone of trust
     *            chosen for the analyzer.
     *            </p>
     * @see Type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of analyzer, which corresponds to the zone of trust chosen for
     * the analyzer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATION
     *
     * @param type <p>
     *            The type of analyzer, which corresponds to the zone of trust
     *            chosen for the analyzer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public AnalyzerSummary withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of analyzer, which corresponds to the zone of trust chosen for
     * the analyzer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATION
     *
     * @param type <p>
     *            The type of analyzer, which corresponds to the zone of trust
     *            chosen for the analyzer.
     *            </p>
     * @see Type
     */
    public void setType(Type type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of analyzer, which corresponds to the zone of trust chosen for
     * the analyzer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATION
     *
     * @param type <p>
     *            The type of analyzer, which corresponds to the zone of trust
     *            chosen for the analyzer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public AnalyzerSummary withType(Type type) {
        this.type = type.toString();
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
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getLastResourceAnalyzed() != null)
            sb.append("lastResourceAnalyzed: " + getLastResourceAnalyzed() + ",");
        if (getLastResourceAnalyzedAt() != null)
            sb.append("lastResourceAnalyzedAt: " + getLastResourceAnalyzedAt() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getStatusReason() != null)
            sb.append("statusReason: " + getStatusReason() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getType() != null)
            sb.append("type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getLastResourceAnalyzed() == null) ? 0 : getLastResourceAnalyzed().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastResourceAnalyzedAt() == null) ? 0 : getLastResourceAnalyzedAt()
                        .hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyzerSummary == false)
            return false;
        AnalyzerSummary other = (AnalyzerSummary) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastResourceAnalyzed() == null ^ this.getLastResourceAnalyzed() == null)
            return false;
        if (other.getLastResourceAnalyzed() != null
                && other.getLastResourceAnalyzed().equals(this.getLastResourceAnalyzed()) == false)
            return false;
        if (other.getLastResourceAnalyzedAt() == null ^ this.getLastResourceAnalyzedAt() == null)
            return false;
        if (other.getLastResourceAnalyzedAt() != null
                && other.getLastResourceAnalyzedAt().equals(this.getLastResourceAnalyzedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null
                && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
