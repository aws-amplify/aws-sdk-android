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
package com.amazonaws.services.codeguru-reviewer.model;

import java.io.Serializable;


/**
 * <p> Information about a code review. </p>
 */
public class CodeReview implements Serializable {
    /**
     * <p> The name of the code review. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S[\w.-]*$<br/>
     */
    private String name;

    /**
     * <p> The Amazon Resource Name (ARN) of the code review to describe. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:aws[^:\s]*:codeguru-reviewer:[^:\s]+:[\d]{12}:[a-z-]+:[\w-]+$<br/>
     */
    private String codeReviewArn;

    /**
     * <p> The name of the repository. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S[\w.-]*$<br/>
     */
    private String repositoryName;

    /**
     * <p> The owner of the repository. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S(.*\S)?$<br/>
     */
    private String owner;

    /**
     * <p> The provider type of the repository association. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CodeCommit, GitHub, Bitbucket
     */
    private String providerType;

    /**
     * <p> The state of the code review. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, Pending, Failed, Deleting
     */
    private String state;

    /**
     * <p> The reason for the state of the code review. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String stateReason;

    /**
     * <p> The time, in milliseconds since the epoch, when the code review was created. </p>
     */
    private java.util.Date createdTimeStamp;

    /**
     * <p> The time, in milliseconds since the epoch, when the code review was last updated. </p>
     */
    private java.util.Date lastUpdatedTimeStamp;

    /**
     * <p> The type of code review. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PullRequest
     */
    private String type;

    /**
     * <p> The pull request ID for the code review. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String pullRequestId;

    /**
     * <p> The type of the source code for the code review. </p>
     */
    private SourceCodeType sourceCodeType;

    /**
     * <p> The statistics from the code review. </p>
     */
    private Metrics metrics;

    /**
     * <p> The name of the code review. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S[\w.-]*$<br/>
     *
     * @return <p> The name of the code review. </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p> The name of the code review. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S[\w.-]*$<br/>
     *
     * @param name <p> The name of the code review. </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p> The name of the code review. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S[\w.-]*$<br/>
     *
     * @param name <p> The name of the code review. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CodeReview withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p> The Amazon Resource Name (ARN) of the code review to describe. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:aws[^:\s]*:codeguru-reviewer:[^:\s]+:[\d]{12}:[a-z-]+:[\w-]+$<br/>
     *
     * @return <p> The Amazon Resource Name (ARN) of the code review to describe. </p>
     */
    public String getCodeReviewArn() {
        return codeReviewArn;
    }

    /**
     * <p> The Amazon Resource Name (ARN) of the code review to describe. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:aws[^:\s]*:codeguru-reviewer:[^:\s]+:[\d]{12}:[a-z-]+:[\w-]+$<br/>
     *
     * @param codeReviewArn <p> The Amazon Resource Name (ARN) of the code review to describe. </p>
     */
    public void setCodeReviewArn(String codeReviewArn) {
        this.codeReviewArn = codeReviewArn;
    }

    /**
     * <p> The Amazon Resource Name (ARN) of the code review to describe. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:aws[^:\s]*:codeguru-reviewer:[^:\s]+:[\d]{12}:[a-z-]+:[\w-]+$<br/>
     *
     * @param codeReviewArn <p> The Amazon Resource Name (ARN) of the code review to describe. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CodeReview withCodeReviewArn(String codeReviewArn) {
        this.codeReviewArn = codeReviewArn;
        return this;
    }

    /**
     * <p> The name of the repository. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S[\w.-]*$<br/>
     *
     * @return <p> The name of the repository. </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p> The name of the repository. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S[\w.-]*$<br/>
     *
     * @param repositoryName <p> The name of the repository. </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p> The name of the repository. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S[\w.-]*$<br/>
     *
     * @param repositoryName <p> The name of the repository. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CodeReview withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p> The owner of the repository. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S(.*\S)?$<br/>
     *
     * @return <p> The owner of the repository. </p>
     */
    public String getOwner() {
        return owner;
    }

    /**
     * <p> The owner of the repository. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S(.*\S)?$<br/>
     *
     * @param owner <p> The owner of the repository. </p>
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p> The owner of the repository. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S(.*\S)?$<br/>
     *
     * @param owner <p> The owner of the repository. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CodeReview withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p> The provider type of the repository association. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CodeCommit, GitHub, Bitbucket
     *
     * @return <p> The provider type of the repository association. </p>
     *
     * @see ProviderType
     */
    public String getProviderType() {
        return providerType;
    }

    /**
     * <p> The provider type of the repository association. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CodeCommit, GitHub, Bitbucket
     *
     * @param providerType <p> The provider type of the repository association. </p>
     *
     * @see ProviderType
     */
    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /**
     * <p> The provider type of the repository association. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CodeCommit, GitHub, Bitbucket
     *
     * @param providerType <p> The provider type of the repository association. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ProviderType
     */
    public CodeReview withProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }

    /**
     * <p> The provider type of the repository association. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CodeCommit, GitHub, Bitbucket
     *
     * @param providerType <p> The provider type of the repository association. </p>
     *
     * @see ProviderType
     */
    public void setProviderType(ProviderType providerType) {
        this.providerType = providerType.toString();
    }

    /**
     * <p> The provider type of the repository association. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CodeCommit, GitHub, Bitbucket
     *
     * @param providerType <p> The provider type of the repository association. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ProviderType
     */
    public CodeReview withProviderType(ProviderType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p> The state of the code review. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, Pending, Failed, Deleting
     *
     * @return <p> The state of the code review. </p>
     *
     * @see JobState
     */
    public String getState() {
        return state;
    }

    /**
     * <p> The state of the code review. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, Pending, Failed, Deleting
     *
     * @param state <p> The state of the code review. </p>
     *
     * @see JobState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p> The state of the code review. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, Pending, Failed, Deleting
     *
     * @param state <p> The state of the code review. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see JobState
     */
    public CodeReview withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p> The state of the code review. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, Pending, Failed, Deleting
     *
     * @param state <p> The state of the code review. </p>
     *
     * @see JobState
     */
    public void setState(JobState state) {
        this.state = state.toString();
    }

    /**
     * <p> The state of the code review. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, Pending, Failed, Deleting
     *
     * @param state <p> The state of the code review. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see JobState
     */
    public CodeReview withState(JobState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p> The reason for the state of the code review. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return <p> The reason for the state of the code review. </p>
     */
    public String getStateReason() {
        return stateReason;
    }

    /**
     * <p> The reason for the state of the code review. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param stateReason <p> The reason for the state of the code review. </p>
     */
    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p> The reason for the state of the code review. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param stateReason <p> The reason for the state of the code review. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CodeReview withStateReason(String stateReason) {
        this.stateReason = stateReason;
        return this;
    }

    /**
     * <p> The time, in milliseconds since the epoch, when the code review was created. </p>
     *
     * @return <p> The time, in milliseconds since the epoch, when the code review was created. </p>
     */
    public java.util.Date getCreatedTimeStamp() {
        return createdTimeStamp;
    }

    /**
     * <p> The time, in milliseconds since the epoch, when the code review was created. </p>
     *
     * @param createdTimeStamp <p> The time, in milliseconds since the epoch, when the code review was created. </p>
     */
    public void setCreatedTimeStamp(java.util.Date createdTimeStamp) {
        this.createdTimeStamp = createdTimeStamp;
    }

    /**
     * <p> The time, in milliseconds since the epoch, when the code review was created. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdTimeStamp <p> The time, in milliseconds since the epoch, when the code review was created. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CodeReview withCreatedTimeStamp(java.util.Date createdTimeStamp) {
        this.createdTimeStamp = createdTimeStamp;
        return this;
    }

    /**
     * <p> The time, in milliseconds since the epoch, when the code review was last updated. </p>
     *
     * @return <p> The time, in milliseconds since the epoch, when the code review was last updated. </p>
     */
    public java.util.Date getLastUpdatedTimeStamp() {
        return lastUpdatedTimeStamp;
    }

    /**
     * <p> The time, in milliseconds since the epoch, when the code review was last updated. </p>
     *
     * @param lastUpdatedTimeStamp <p> The time, in milliseconds since the epoch, when the code review was last updated. </p>
     */
    public void setLastUpdatedTimeStamp(java.util.Date lastUpdatedTimeStamp) {
        this.lastUpdatedTimeStamp = lastUpdatedTimeStamp;
    }

    /**
     * <p> The time, in milliseconds since the epoch, when the code review was last updated. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastUpdatedTimeStamp <p> The time, in milliseconds since the epoch, when the code review was last updated. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CodeReview withLastUpdatedTimeStamp(java.util.Date lastUpdatedTimeStamp) {
        this.lastUpdatedTimeStamp = lastUpdatedTimeStamp;
        return this;
    }

    /**
     * <p> The type of code review. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PullRequest
     *
     * @return <p> The type of code review. </p>
     *
     * @see Type
     */
    public String getType() {
        return type;
    }

    /**
     * <p> The type of code review. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PullRequest
     *
     * @param type <p> The type of code review. </p>
     *
     * @see Type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p> The type of code review. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PullRequest
     *
     * @param type <p> The type of code review. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see Type
     */
    public CodeReview withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p> The type of code review. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PullRequest
     *
     * @param type <p> The type of code review. </p>
     *
     * @see Type
     */
    public void setType(Type type) {
        this.type = type.toString();
    }

    /**
     * <p> The type of code review. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PullRequest
     *
     * @param type <p> The type of code review. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see Type
     */
    public CodeReview withType(Type type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p> The pull request ID for the code review. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p> The pull request ID for the code review. </p>
     */
    public String getPullRequestId() {
        return pullRequestId;
    }

    /**
     * <p> The pull request ID for the code review. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param pullRequestId <p> The pull request ID for the code review. </p>
     */
    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    /**
     * <p> The pull request ID for the code review. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param pullRequestId <p> The pull request ID for the code review. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CodeReview withPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }

    /**
     * <p> The type of the source code for the code review. </p>
     *
     * @return <p> The type of the source code for the code review. </p>
     */
    public SourceCodeType getSourceCodeType() {
        return sourceCodeType;
    }

    /**
     * <p> The type of the source code for the code review. </p>
     *
     * @param sourceCodeType <p> The type of the source code for the code review. </p>
     */
    public void setSourceCodeType(SourceCodeType sourceCodeType) {
        this.sourceCodeType = sourceCodeType;
    }

    /**
     * <p> The type of the source code for the code review. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceCodeType <p> The type of the source code for the code review. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CodeReview withSourceCodeType(SourceCodeType sourceCodeType) {
        this.sourceCodeType = sourceCodeType;
        return this;
    }

    /**
     * <p> The statistics from the code review. </p>
     *
     * @return <p> The statistics from the code review. </p>
     */
    public Metrics getMetrics() {
        return metrics;
    }

    /**
     * <p> The statistics from the code review. </p>
     *
     * @param metrics <p> The statistics from the code review. </p>
     */
    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }

    /**
     * <p> The statistics from the code review. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metrics <p> The statistics from the code review. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CodeReview withMetrics(Metrics metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getCodeReviewArn() != null) sb.append("CodeReviewArn: " + getCodeReviewArn() + ",");
        if (getRepositoryName() != null) sb.append("RepositoryName: " + getRepositoryName() + ",");
        if (getOwner() != null) sb.append("Owner: " + getOwner() + ",");
        if (getProviderType() != null) sb.append("ProviderType: " + getProviderType() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getStateReason() != null) sb.append("StateReason: " + getStateReason() + ",");
        if (getCreatedTimeStamp() != null) sb.append("CreatedTimeStamp: " + getCreatedTimeStamp() + ",");
        if (getLastUpdatedTimeStamp() != null) sb.append("LastUpdatedTimeStamp: " + getLastUpdatedTimeStamp() + ",");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getPullRequestId() != null) sb.append("PullRequestId: " + getPullRequestId() + ",");
        if (getSourceCodeType() != null) sb.append("SourceCodeType: " + getSourceCodeType() + ",");
        if (getMetrics() != null) sb.append("Metrics: " + getMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCodeReviewArn() == null) ? 0 : getCodeReviewArn().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimeStamp() == null) ? 0 : getCreatedTimeStamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimeStamp() == null) ? 0 : getLastUpdatedTimeStamp().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode + ((getSourceCodeType() == null) ? 0 : getSourceCodeType().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CodeReview == false) return false;
        CodeReview other = (CodeReview)obj;

        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getCodeReviewArn() == null ^ this.getCodeReviewArn() == null) return false;
        if (other.getCodeReviewArn() != null && other.getCodeReviewArn().equals(this.getCodeReviewArn()) == false) return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null) return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false) return false;
        if (other.getOwner() == null ^ this.getOwner() == null) return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false) return false;
        if (other.getProviderType() == null ^ this.getProviderType() == null) return false;
        if (other.getProviderType() != null && other.getProviderType().equals(this.getProviderType()) == false) return false;
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null) return false;
        if (other.getStateReason() != null && other.getStateReason().equals(this.getStateReason()) == false) return false;
        if (other.getCreatedTimeStamp() == null ^ this.getCreatedTimeStamp() == null) return false;
        if (other.getCreatedTimeStamp() != null && other.getCreatedTimeStamp().equals(this.getCreatedTimeStamp()) == false) return false;
        if (other.getLastUpdatedTimeStamp() == null ^ this.getLastUpdatedTimeStamp() == null) return false;
        if (other.getLastUpdatedTimeStamp() != null && other.getLastUpdatedTimeStamp().equals(this.getLastUpdatedTimeStamp()) == false) return false;
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false;
        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null) return false;
        if (other.getPullRequestId() != null && other.getPullRequestId().equals(this.getPullRequestId()) == false) return false;
        if (other.getSourceCodeType() == null ^ this.getSourceCodeType() == null) return false;
        if (other.getSourceCodeType() != null && other.getSourceCodeType().equals(this.getSourceCodeType()) == false) return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null) return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false) return false;
        return true;
    }
}
