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

package com.amazonaws.services.amplify.model;

import java.io.Serializable;

/**
 * <p>
 * The branch for an Amplify app, which maps to a third-party repository branch.
 * </p>
 */
public class Branch implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for a branch that is part of an Amplify
     * app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String branchArn;

    /**
     * <p>
     * The name for the branch that is part of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String branchName;

    /**
     * <p>
     * The description for the branch that is part of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String description;

    /**
     * <p>
     * The tag for the branch of an Amplify app.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The current stage for the branch that is part of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION, BETA, DEVELOPMENT, EXPERIMENTAL,
     * PULL_REQUEST
     */
    private String stage;

    /**
     * <p>
     * The display name for the branch. This is used as the default domain
     * prefix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String displayName;

    /**
     * <p>
     * Enables notifications for a branch that is part of an Amplify app.
     * </p>
     */
    private Boolean enableNotification;

    /**
     * <p>
     * The creation date and time for a branch that is part of an Amplify app.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The last updated date and time for a branch that is part of an Amplify
     * app.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The environment variables specific to a branch of an Amplify app.
     * </p>
     */
    private java.util.Map<String, String> environmentVariables;

    /**
     * <p>
     * Enables auto-building on push for a branch of an Amplify app.
     * </p>
     */
    private Boolean enableAutoBuild;

    /**
     * <p>
     * The custom domains for a branch of an Amplify app.
     * </p>
     */
    private java.util.List<String> customDomains;

    /**
     * <p>
     * The framework for a branch of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String framework;

    /**
     * <p>
     * The ID of the active job for a branch of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String activeJobId;

    /**
     * <p>
     * The total number of jobs that are part of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String totalNumberOfJobs;

    /**
     * <p>
     * Enables basic authorization for a branch of an Amplify app.
     * </p>
     */
    private Boolean enableBasicAuth;

    /**
     * <p>
     * The thumbnail URL for the branch of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     */
    private String thumbnailUrl;

    /**
     * <p>
     * The basic authorization credentials for a branch of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     */
    private String basicAuthCredentials;

    /**
     * <p>
     * The build specification (build spec) content for the branch of an Amplify
     * app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25000<br/>
     */
    private String buildSpec;

    /**
     * <p>
     * The content Time to Live (TTL) for the website in seconds.
     * </p>
     */
    private String ttl;

    /**
     * <p>
     * A list of custom resources that are linked to this branch.
     * </p>
     */
    private java.util.List<String> associatedResources;

    /**
     * <p>
     * Enables pull request preview for the branch.
     * </p>
     */
    private Boolean enablePullRequestPreview;

    /**
     * <p>
     * The Amplify environment name for the pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 20<br/>
     */
    private String pullRequestEnvironmentName;

    /**
     * <p>
     * The destination branch if the branch is a pull request branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String destinationBranch;

    /**
     * <p>
     * The source branch if the branch is a pull request branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String sourceBranch;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a backend environment that is part of
     * an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String backendEnvironmentArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a branch that is part of an Amplify
     * app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for a branch that is part of an
     *         Amplify app.
     *         </p>
     */
    public String getBranchArn() {
        return branchArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a branch that is part of an Amplify
     * app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param branchArn <p>
     *            The Amazon Resource Name (ARN) for a branch that is part of an
     *            Amplify app.
     *            </p>
     */
    public void setBranchArn(String branchArn) {
        this.branchArn = branchArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a branch that is part of an Amplify
     * app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param branchArn <p>
     *            The Amazon Resource Name (ARN) for a branch that is part of an
     *            Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withBranchArn(String branchArn) {
        this.branchArn = branchArn;
        return this;
    }

    /**
     * <p>
     * The name for the branch that is part of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name for the branch that is part of an Amplify app.
     *         </p>
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * <p>
     * The name for the branch that is part of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param branchName <p>
     *            The name for the branch that is part of an Amplify app.
     *            </p>
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The name for the branch that is part of an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param branchName <p>
     *            The name for the branch that is part of an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * <p>
     * The description for the branch that is part of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         The description for the branch that is part of an Amplify app.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description for the branch that is part of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param description <p>
     *            The description for the branch that is part of an Amplify app.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the branch that is part of an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param description <p>
     *            The description for the branch that is part of an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The tag for the branch of an Amplify app.
     * </p>
     *
     * @return <p>
     *         The tag for the branch of an Amplify app.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag for the branch of an Amplify app.
     * </p>
     *
     * @param tags <p>
     *            The tag for the branch of an Amplify app.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tag for the branch of an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag for the branch of an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tag for the branch of an Amplify app.
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
    public Branch addtagsEntry(String key, String value) {
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
    public Branch cleartagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The current stage for the branch that is part of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION, BETA, DEVELOPMENT, EXPERIMENTAL,
     * PULL_REQUEST
     *
     * @return <p>
     *         The current stage for the branch that is part of an Amplify app.
     *         </p>
     * @see Stage
     */
    public String getStage() {
        return stage;
    }

    /**
     * <p>
     * The current stage for the branch that is part of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION, BETA, DEVELOPMENT, EXPERIMENTAL,
     * PULL_REQUEST
     *
     * @param stage <p>
     *            The current stage for the branch that is part of an Amplify
     *            app.
     *            </p>
     * @see Stage
     */
    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * The current stage for the branch that is part of an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION, BETA, DEVELOPMENT, EXPERIMENTAL,
     * PULL_REQUEST
     *
     * @param stage <p>
     *            The current stage for the branch that is part of an Amplify
     *            app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Stage
     */
    public Branch withStage(String stage) {
        this.stage = stage;
        return this;
    }

    /**
     * <p>
     * The current stage for the branch that is part of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION, BETA, DEVELOPMENT, EXPERIMENTAL,
     * PULL_REQUEST
     *
     * @param stage <p>
     *            The current stage for the branch that is part of an Amplify
     *            app.
     *            </p>
     * @see Stage
     */
    public void setStage(Stage stage) {
        this.stage = stage.toString();
    }

    /**
     * <p>
     * The current stage for the branch that is part of an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION, BETA, DEVELOPMENT, EXPERIMENTAL,
     * PULL_REQUEST
     *
     * @param stage <p>
     *            The current stage for the branch that is part of an Amplify
     *            app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Stage
     */
    public Branch withStage(Stage stage) {
        this.stage = stage.toString();
        return this;
    }

    /**
     * <p>
     * The display name for the branch. This is used as the default domain
     * prefix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The display name for the branch. This is used as the default
     *         domain prefix.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The display name for the branch. This is used as the default domain
     * prefix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param displayName <p>
     *            The display name for the branch. This is used as the default
     *            domain prefix.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name for the branch. This is used as the default domain
     * prefix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param displayName <p>
     *            The display name for the branch. This is used as the default
     *            domain prefix.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * Enables notifications for a branch that is part of an Amplify app.
     * </p>
     *
     * @return <p>
     *         Enables notifications for a branch that is part of an Amplify
     *         app.
     *         </p>
     */
    public Boolean isEnableNotification() {
        return enableNotification;
    }

    /**
     * <p>
     * Enables notifications for a branch that is part of an Amplify app.
     * </p>
     *
     * @return <p>
     *         Enables notifications for a branch that is part of an Amplify
     *         app.
     *         </p>
     */
    public Boolean getEnableNotification() {
        return enableNotification;
    }

    /**
     * <p>
     * Enables notifications for a branch that is part of an Amplify app.
     * </p>
     *
     * @param enableNotification <p>
     *            Enables notifications for a branch that is part of an Amplify
     *            app.
     *            </p>
     */
    public void setEnableNotification(Boolean enableNotification) {
        this.enableNotification = enableNotification;
    }

    /**
     * <p>
     * Enables notifications for a branch that is part of an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableNotification <p>
     *            Enables notifications for a branch that is part of an Amplify
     *            app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withEnableNotification(Boolean enableNotification) {
        this.enableNotification = enableNotification;
        return this;
    }

    /**
     * <p>
     * The creation date and time for a branch that is part of an Amplify app.
     * </p>
     *
     * @return <p>
     *         The creation date and time for a branch that is part of an
     *         Amplify app.
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The creation date and time for a branch that is part of an Amplify app.
     * </p>
     *
     * @param createTime <p>
     *            The creation date and time for a branch that is part of an
     *            Amplify app.
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The creation date and time for a branch that is part of an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            The creation date and time for a branch that is part of an
     *            Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * The last updated date and time for a branch that is part of an Amplify
     * app.
     * </p>
     *
     * @return <p>
     *         The last updated date and time for a branch that is part of an
     *         Amplify app.
     *         </p>
     */
    public java.util.Date getUpdateTime() {
        return updateTime;
    }

    /**
     * <p>
     * The last updated date and time for a branch that is part of an Amplify
     * app.
     * </p>
     *
     * @param updateTime <p>
     *            The last updated date and time for a branch that is part of an
     *            Amplify app.
     *            </p>
     */
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The last updated date and time for a branch that is part of an Amplify
     * app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateTime <p>
     *            The last updated date and time for a branch that is part of an
     *            Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * <p>
     * The environment variables specific to a branch of an Amplify app.
     * </p>
     *
     * @return <p>
     *         The environment variables specific to a branch of an Amplify app.
     *         </p>
     */
    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * <p>
     * The environment variables specific to a branch of an Amplify app.
     * </p>
     *
     * @param environmentVariables <p>
     *            The environment variables specific to a branch of an Amplify
     *            app.
     *            </p>
     */
    public void setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    /**
     * <p>
     * The environment variables specific to a branch of an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentVariables <p>
     *            The environment variables specific to a branch of an Amplify
     *            app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * <p>
     * The environment variables specific to a branch of an Amplify app.
     * </p>
     * <p>
     * The method adds a new key-value pair into environmentVariables parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into environmentVariables.
     * @param value The corresponding value of the entry to be added into
     *            environmentVariables.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch addenvironmentVariablesEntry(String key, String value) {
        if (null == this.environmentVariables) {
            this.environmentVariables = new java.util.HashMap<String, String>();
        }
        if (this.environmentVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.environmentVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into environmentVariables.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Branch clearenvironmentVariablesEntries() {
        this.environmentVariables = null;
        return this;
    }

    /**
     * <p>
     * Enables auto-building on push for a branch of an Amplify app.
     * </p>
     *
     * @return <p>
     *         Enables auto-building on push for a branch of an Amplify app.
     *         </p>
     */
    public Boolean isEnableAutoBuild() {
        return enableAutoBuild;
    }

    /**
     * <p>
     * Enables auto-building on push for a branch of an Amplify app.
     * </p>
     *
     * @return <p>
     *         Enables auto-building on push for a branch of an Amplify app.
     *         </p>
     */
    public Boolean getEnableAutoBuild() {
        return enableAutoBuild;
    }

    /**
     * <p>
     * Enables auto-building on push for a branch of an Amplify app.
     * </p>
     *
     * @param enableAutoBuild <p>
     *            Enables auto-building on push for a branch of an Amplify app.
     *            </p>
     */
    public void setEnableAutoBuild(Boolean enableAutoBuild) {
        this.enableAutoBuild = enableAutoBuild;
    }

    /**
     * <p>
     * Enables auto-building on push for a branch of an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableAutoBuild <p>
     *            Enables auto-building on push for a branch of an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withEnableAutoBuild(Boolean enableAutoBuild) {
        this.enableAutoBuild = enableAutoBuild;
        return this;
    }

    /**
     * <p>
     * The custom domains for a branch of an Amplify app.
     * </p>
     *
     * @return <p>
     *         The custom domains for a branch of an Amplify app.
     *         </p>
     */
    public java.util.List<String> getCustomDomains() {
        return customDomains;
    }

    /**
     * <p>
     * The custom domains for a branch of an Amplify app.
     * </p>
     *
     * @param customDomains <p>
     *            The custom domains for a branch of an Amplify app.
     *            </p>
     */
    public void setCustomDomains(java.util.Collection<String> customDomains) {
        if (customDomains == null) {
            this.customDomains = null;
            return;
        }

        this.customDomains = new java.util.ArrayList<String>(customDomains);
    }

    /**
     * <p>
     * The custom domains for a branch of an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customDomains <p>
     *            The custom domains for a branch of an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withCustomDomains(String... customDomains) {
        if (getCustomDomains() == null) {
            this.customDomains = new java.util.ArrayList<String>(customDomains.length);
        }
        for (String value : customDomains) {
            this.customDomains.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The custom domains for a branch of an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customDomains <p>
     *            The custom domains for a branch of an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withCustomDomains(java.util.Collection<String> customDomains) {
        setCustomDomains(customDomains);
        return this;
    }

    /**
     * <p>
     * The framework for a branch of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The framework for a branch of an Amplify app.
     *         </p>
     */
    public String getFramework() {
        return framework;
    }

    /**
     * <p>
     * The framework for a branch of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param framework <p>
     *            The framework for a branch of an Amplify app.
     *            </p>
     */
    public void setFramework(String framework) {
        this.framework = framework;
    }

    /**
     * <p>
     * The framework for a branch of an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param framework <p>
     *            The framework for a branch of an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withFramework(String framework) {
        this.framework = framework;
        return this;
    }

    /**
     * <p>
     * The ID of the active job for a branch of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         The ID of the active job for a branch of an Amplify app.
     *         </p>
     */
    public String getActiveJobId() {
        return activeJobId;
    }

    /**
     * <p>
     * The ID of the active job for a branch of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param activeJobId <p>
     *            The ID of the active job for a branch of an Amplify app.
     *            </p>
     */
    public void setActiveJobId(String activeJobId) {
        this.activeJobId = activeJobId;
    }

    /**
     * <p>
     * The ID of the active job for a branch of an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param activeJobId <p>
     *            The ID of the active job for a branch of an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withActiveJobId(String activeJobId) {
        this.activeJobId = activeJobId;
        return this;
    }

    /**
     * <p>
     * The total number of jobs that are part of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         The total number of jobs that are part of an Amplify app.
     *         </p>
     */
    public String getTotalNumberOfJobs() {
        return totalNumberOfJobs;
    }

    /**
     * <p>
     * The total number of jobs that are part of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param totalNumberOfJobs <p>
     *            The total number of jobs that are part of an Amplify app.
     *            </p>
     */
    public void setTotalNumberOfJobs(String totalNumberOfJobs) {
        this.totalNumberOfJobs = totalNumberOfJobs;
    }

    /**
     * <p>
     * The total number of jobs that are part of an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param totalNumberOfJobs <p>
     *            The total number of jobs that are part of an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withTotalNumberOfJobs(String totalNumberOfJobs) {
        this.totalNumberOfJobs = totalNumberOfJobs;
        return this;
    }

    /**
     * <p>
     * Enables basic authorization for a branch of an Amplify app.
     * </p>
     *
     * @return <p>
     *         Enables basic authorization for a branch of an Amplify app.
     *         </p>
     */
    public Boolean isEnableBasicAuth() {
        return enableBasicAuth;
    }

    /**
     * <p>
     * Enables basic authorization for a branch of an Amplify app.
     * </p>
     *
     * @return <p>
     *         Enables basic authorization for a branch of an Amplify app.
     *         </p>
     */
    public Boolean getEnableBasicAuth() {
        return enableBasicAuth;
    }

    /**
     * <p>
     * Enables basic authorization for a branch of an Amplify app.
     * </p>
     *
     * @param enableBasicAuth <p>
     *            Enables basic authorization for a branch of an Amplify app.
     *            </p>
     */
    public void setEnableBasicAuth(Boolean enableBasicAuth) {
        this.enableBasicAuth = enableBasicAuth;
    }

    /**
     * <p>
     * Enables basic authorization for a branch of an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableBasicAuth <p>
     *            Enables basic authorization for a branch of an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withEnableBasicAuth(Boolean enableBasicAuth) {
        this.enableBasicAuth = enableBasicAuth;
        return this;
    }

    /**
     * <p>
     * The thumbnail URL for the branch of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @return <p>
     *         The thumbnail URL for the branch of an Amplify app.
     *         </p>
     */
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    /**
     * <p>
     * The thumbnail URL for the branch of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param thumbnailUrl <p>
     *            The thumbnail URL for the branch of an Amplify app.
     *            </p>
     */
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    /**
     * <p>
     * The thumbnail URL for the branch of an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param thumbnailUrl <p>
     *            The thumbnail URL for the branch of an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

    /**
     * <p>
     * The basic authorization credentials for a branch of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @return <p>
     *         The basic authorization credentials for a branch of an Amplify
     *         app.
     *         </p>
     */
    public String getBasicAuthCredentials() {
        return basicAuthCredentials;
    }

    /**
     * <p>
     * The basic authorization credentials for a branch of an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param basicAuthCredentials <p>
     *            The basic authorization credentials for a branch of an Amplify
     *            app.
     *            </p>
     */
    public void setBasicAuthCredentials(String basicAuthCredentials) {
        this.basicAuthCredentials = basicAuthCredentials;
    }

    /**
     * <p>
     * The basic authorization credentials for a branch of an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param basicAuthCredentials <p>
     *            The basic authorization credentials for a branch of an Amplify
     *            app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withBasicAuthCredentials(String basicAuthCredentials) {
        this.basicAuthCredentials = basicAuthCredentials;
        return this;
    }

    /**
     * <p>
     * The build specification (build spec) content for the branch of an Amplify
     * app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25000<br/>
     *
     * @return <p>
     *         The build specification (build spec) content for the branch of an
     *         Amplify app.
     *         </p>
     */
    public String getBuildSpec() {
        return buildSpec;
    }

    /**
     * <p>
     * The build specification (build spec) content for the branch of an Amplify
     * app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25000<br/>
     *
     * @param buildSpec <p>
     *            The build specification (build spec) content for the branch of
     *            an Amplify app.
     *            </p>
     */
    public void setBuildSpec(String buildSpec) {
        this.buildSpec = buildSpec;
    }

    /**
     * <p>
     * The build specification (build spec) content for the branch of an Amplify
     * app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25000<br/>
     *
     * @param buildSpec <p>
     *            The build specification (build spec) content for the branch of
     *            an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withBuildSpec(String buildSpec) {
        this.buildSpec = buildSpec;
        return this;
    }

    /**
     * <p>
     * The content Time to Live (TTL) for the website in seconds.
     * </p>
     *
     * @return <p>
     *         The content Time to Live (TTL) for the website in seconds.
     *         </p>
     */
    public String getTtl() {
        return ttl;
    }

    /**
     * <p>
     * The content Time to Live (TTL) for the website in seconds.
     * </p>
     *
     * @param ttl <p>
     *            The content Time to Live (TTL) for the website in seconds.
     *            </p>
     */
    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    /**
     * <p>
     * The content Time to Live (TTL) for the website in seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ttl <p>
     *            The content Time to Live (TTL) for the website in seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withTtl(String ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * <p>
     * A list of custom resources that are linked to this branch.
     * </p>
     *
     * @return <p>
     *         A list of custom resources that are linked to this branch.
     *         </p>
     */
    public java.util.List<String> getAssociatedResources() {
        return associatedResources;
    }

    /**
     * <p>
     * A list of custom resources that are linked to this branch.
     * </p>
     *
     * @param associatedResources <p>
     *            A list of custom resources that are linked to this branch.
     *            </p>
     */
    public void setAssociatedResources(java.util.Collection<String> associatedResources) {
        if (associatedResources == null) {
            this.associatedResources = null;
            return;
        }

        this.associatedResources = new java.util.ArrayList<String>(associatedResources);
    }

    /**
     * <p>
     * A list of custom resources that are linked to this branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedResources <p>
     *            A list of custom resources that are linked to this branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withAssociatedResources(String... associatedResources) {
        if (getAssociatedResources() == null) {
            this.associatedResources = new java.util.ArrayList<String>(associatedResources.length);
        }
        for (String value : associatedResources) {
            this.associatedResources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of custom resources that are linked to this branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedResources <p>
     *            A list of custom resources that are linked to this branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withAssociatedResources(java.util.Collection<String> associatedResources) {
        setAssociatedResources(associatedResources);
        return this;
    }

    /**
     * <p>
     * Enables pull request preview for the branch.
     * </p>
     *
     * @return <p>
     *         Enables pull request preview for the branch.
     *         </p>
     */
    public Boolean isEnablePullRequestPreview() {
        return enablePullRequestPreview;
    }

    /**
     * <p>
     * Enables pull request preview for the branch.
     * </p>
     *
     * @return <p>
     *         Enables pull request preview for the branch.
     *         </p>
     */
    public Boolean getEnablePullRequestPreview() {
        return enablePullRequestPreview;
    }

    /**
     * <p>
     * Enables pull request preview for the branch.
     * </p>
     *
     * @param enablePullRequestPreview <p>
     *            Enables pull request preview for the branch.
     *            </p>
     */
    public void setEnablePullRequestPreview(Boolean enablePullRequestPreview) {
        this.enablePullRequestPreview = enablePullRequestPreview;
    }

    /**
     * <p>
     * Enables pull request preview for the branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enablePullRequestPreview <p>
     *            Enables pull request preview for the branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withEnablePullRequestPreview(Boolean enablePullRequestPreview) {
        this.enablePullRequestPreview = enablePullRequestPreview;
        return this;
    }

    /**
     * <p>
     * The Amplify environment name for the pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 20<br/>
     *
     * @return <p>
     *         The Amplify environment name for the pull request.
     *         </p>
     */
    public String getPullRequestEnvironmentName() {
        return pullRequestEnvironmentName;
    }

    /**
     * <p>
     * The Amplify environment name for the pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 20<br/>
     *
     * @param pullRequestEnvironmentName <p>
     *            The Amplify environment name for the pull request.
     *            </p>
     */
    public void setPullRequestEnvironmentName(String pullRequestEnvironmentName) {
        this.pullRequestEnvironmentName = pullRequestEnvironmentName;
    }

    /**
     * <p>
     * The Amplify environment name for the pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 20<br/>
     *
     * @param pullRequestEnvironmentName <p>
     *            The Amplify environment name for the pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withPullRequestEnvironmentName(String pullRequestEnvironmentName) {
        this.pullRequestEnvironmentName = pullRequestEnvironmentName;
        return this;
    }

    /**
     * <p>
     * The destination branch if the branch is a pull request branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The destination branch if the branch is a pull request branch.
     *         </p>
     */
    public String getDestinationBranch() {
        return destinationBranch;
    }

    /**
     * <p>
     * The destination branch if the branch is a pull request branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param destinationBranch <p>
     *            The destination branch if the branch is a pull request branch.
     *            </p>
     */
    public void setDestinationBranch(String destinationBranch) {
        this.destinationBranch = destinationBranch;
    }

    /**
     * <p>
     * The destination branch if the branch is a pull request branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param destinationBranch <p>
     *            The destination branch if the branch is a pull request branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withDestinationBranch(String destinationBranch) {
        this.destinationBranch = destinationBranch;
        return this;
    }

    /**
     * <p>
     * The source branch if the branch is a pull request branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The source branch if the branch is a pull request branch.
     *         </p>
     */
    public String getSourceBranch() {
        return sourceBranch;
    }

    /**
     * <p>
     * The source branch if the branch is a pull request branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param sourceBranch <p>
     *            The source branch if the branch is a pull request branch.
     *            </p>
     */
    public void setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
    }

    /**
     * <p>
     * The source branch if the branch is a pull request branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param sourceBranch <p>
     *            The source branch if the branch is a pull request branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a backend environment that is part of
     * an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for a backend environment that is
     *         part of an Amplify app.
     *         </p>
     */
    public String getBackendEnvironmentArn() {
        return backendEnvironmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a backend environment that is part of
     * an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param backendEnvironmentArn <p>
     *            The Amazon Resource Name (ARN) for a backend environment that
     *            is part of an Amplify app.
     *            </p>
     */
    public void setBackendEnvironmentArn(String backendEnvironmentArn) {
        this.backendEnvironmentArn = backendEnvironmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a backend environment that is part of
     * an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param backendEnvironmentArn <p>
     *            The Amazon Resource Name (ARN) for a backend environment that
     *            is part of an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Branch withBackendEnvironmentArn(String backendEnvironmentArn) {
        this.backendEnvironmentArn = backendEnvironmentArn;
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
        if (getBranchArn() != null)
            sb.append("branchArn: " + getBranchArn() + ",");
        if (getBranchName() != null)
            sb.append("branchName: " + getBranchName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getStage() != null)
            sb.append("stage: " + getStage() + ",");
        if (getDisplayName() != null)
            sb.append("displayName: " + getDisplayName() + ",");
        if (getEnableNotification() != null)
            sb.append("enableNotification: " + getEnableNotification() + ",");
        if (getCreateTime() != null)
            sb.append("createTime: " + getCreateTime() + ",");
        if (getUpdateTime() != null)
            sb.append("updateTime: " + getUpdateTime() + ",");
        if (getEnvironmentVariables() != null)
            sb.append("environmentVariables: " + getEnvironmentVariables() + ",");
        if (getEnableAutoBuild() != null)
            sb.append("enableAutoBuild: " + getEnableAutoBuild() + ",");
        if (getCustomDomains() != null)
            sb.append("customDomains: " + getCustomDomains() + ",");
        if (getFramework() != null)
            sb.append("framework: " + getFramework() + ",");
        if (getActiveJobId() != null)
            sb.append("activeJobId: " + getActiveJobId() + ",");
        if (getTotalNumberOfJobs() != null)
            sb.append("totalNumberOfJobs: " + getTotalNumberOfJobs() + ",");
        if (getEnableBasicAuth() != null)
            sb.append("enableBasicAuth: " + getEnableBasicAuth() + ",");
        if (getThumbnailUrl() != null)
            sb.append("thumbnailUrl: " + getThumbnailUrl() + ",");
        if (getBasicAuthCredentials() != null)
            sb.append("basicAuthCredentials: " + getBasicAuthCredentials() + ",");
        if (getBuildSpec() != null)
            sb.append("buildSpec: " + getBuildSpec() + ",");
        if (getTtl() != null)
            sb.append("ttl: " + getTtl() + ",");
        if (getAssociatedResources() != null)
            sb.append("associatedResources: " + getAssociatedResources() + ",");
        if (getEnablePullRequestPreview() != null)
            sb.append("enablePullRequestPreview: " + getEnablePullRequestPreview() + ",");
        if (getPullRequestEnvironmentName() != null)
            sb.append("pullRequestEnvironmentName: " + getPullRequestEnvironmentName() + ",");
        if (getDestinationBranch() != null)
            sb.append("destinationBranch: " + getDestinationBranch() + ",");
        if (getSourceBranch() != null)
            sb.append("sourceBranch: " + getSourceBranch() + ",");
        if (getBackendEnvironmentArn() != null)
            sb.append("backendEnvironmentArn: " + getBackendEnvironmentArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBranchArn() == null) ? 0 : getBranchArn().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode
                + ((getEnableNotification() == null) ? 0 : getEnableNotification().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentVariables() == null) ? 0 : getEnvironmentVariables().hashCode());
        hashCode = prime * hashCode
                + ((getEnableAutoBuild() == null) ? 0 : getEnableAutoBuild().hashCode());
        hashCode = prime * hashCode
                + ((getCustomDomains() == null) ? 0 : getCustomDomains().hashCode());
        hashCode = prime * hashCode + ((getFramework() == null) ? 0 : getFramework().hashCode());
        hashCode = prime * hashCode
                + ((getActiveJobId() == null) ? 0 : getActiveJobId().hashCode());
        hashCode = prime * hashCode
                + ((getTotalNumberOfJobs() == null) ? 0 : getTotalNumberOfJobs().hashCode());
        hashCode = prime * hashCode
                + ((getEnableBasicAuth() == null) ? 0 : getEnableBasicAuth().hashCode());
        hashCode = prime * hashCode
                + ((getThumbnailUrl() == null) ? 0 : getThumbnailUrl().hashCode());
        hashCode = prime * hashCode
                + ((getBasicAuthCredentials() == null) ? 0 : getBasicAuthCredentials().hashCode());
        hashCode = prime * hashCode + ((getBuildSpec() == null) ? 0 : getBuildSpec().hashCode());
        hashCode = prime * hashCode + ((getTtl() == null) ? 0 : getTtl().hashCode());
        hashCode = prime * hashCode
                + ((getAssociatedResources() == null) ? 0 : getAssociatedResources().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnablePullRequestPreview() == null) ? 0 : getEnablePullRequestPreview()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPullRequestEnvironmentName() == null) ? 0 : getPullRequestEnvironmentName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDestinationBranch() == null) ? 0 : getDestinationBranch().hashCode());
        hashCode = prime * hashCode
                + ((getSourceBranch() == null) ? 0 : getSourceBranch().hashCode());
        hashCode = prime
                * hashCode
                + ((getBackendEnvironmentArn() == null) ? 0 : getBackendEnvironmentArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Branch == false)
            return false;
        Branch other = (Branch) obj;

        if (other.getBranchArn() == null ^ this.getBranchArn() == null)
            return false;
        if (other.getBranchArn() != null
                && other.getBranchArn().equals(this.getBranchArn()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null
                && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getStage() == null ^ this.getStage() == null)
            return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getEnableNotification() == null ^ this.getEnableNotification() == null)
            return false;
        if (other.getEnableNotification() != null
                && other.getEnableNotification().equals(this.getEnableNotification()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null
                && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getEnvironmentVariables() == null ^ this.getEnvironmentVariables() == null)
            return false;
        if (other.getEnvironmentVariables() != null
                && other.getEnvironmentVariables().equals(this.getEnvironmentVariables()) == false)
            return false;
        if (other.getEnableAutoBuild() == null ^ this.getEnableAutoBuild() == null)
            return false;
        if (other.getEnableAutoBuild() != null
                && other.getEnableAutoBuild().equals(this.getEnableAutoBuild()) == false)
            return false;
        if (other.getCustomDomains() == null ^ this.getCustomDomains() == null)
            return false;
        if (other.getCustomDomains() != null
                && other.getCustomDomains().equals(this.getCustomDomains()) == false)
            return false;
        if (other.getFramework() == null ^ this.getFramework() == null)
            return false;
        if (other.getFramework() != null
                && other.getFramework().equals(this.getFramework()) == false)
            return false;
        if (other.getActiveJobId() == null ^ this.getActiveJobId() == null)
            return false;
        if (other.getActiveJobId() != null
                && other.getActiveJobId().equals(this.getActiveJobId()) == false)
            return false;
        if (other.getTotalNumberOfJobs() == null ^ this.getTotalNumberOfJobs() == null)
            return false;
        if (other.getTotalNumberOfJobs() != null
                && other.getTotalNumberOfJobs().equals(this.getTotalNumberOfJobs()) == false)
            return false;
        if (other.getEnableBasicAuth() == null ^ this.getEnableBasicAuth() == null)
            return false;
        if (other.getEnableBasicAuth() != null
                && other.getEnableBasicAuth().equals(this.getEnableBasicAuth()) == false)
            return false;
        if (other.getThumbnailUrl() == null ^ this.getThumbnailUrl() == null)
            return false;
        if (other.getThumbnailUrl() != null
                && other.getThumbnailUrl().equals(this.getThumbnailUrl()) == false)
            return false;
        if (other.getBasicAuthCredentials() == null ^ this.getBasicAuthCredentials() == null)
            return false;
        if (other.getBasicAuthCredentials() != null
                && other.getBasicAuthCredentials().equals(this.getBasicAuthCredentials()) == false)
            return false;
        if (other.getBuildSpec() == null ^ this.getBuildSpec() == null)
            return false;
        if (other.getBuildSpec() != null
                && other.getBuildSpec().equals(this.getBuildSpec()) == false)
            return false;
        if (other.getTtl() == null ^ this.getTtl() == null)
            return false;
        if (other.getTtl() != null && other.getTtl().equals(this.getTtl()) == false)
            return false;
        if (other.getAssociatedResources() == null ^ this.getAssociatedResources() == null)
            return false;
        if (other.getAssociatedResources() != null
                && other.getAssociatedResources().equals(this.getAssociatedResources()) == false)
            return false;
        if (other.getEnablePullRequestPreview() == null
                ^ this.getEnablePullRequestPreview() == null)
            return false;
        if (other.getEnablePullRequestPreview() != null
                && other.getEnablePullRequestPreview().equals(this.getEnablePullRequestPreview()) == false)
            return false;
        if (other.getPullRequestEnvironmentName() == null
                ^ this.getPullRequestEnvironmentName() == null)
            return false;
        if (other.getPullRequestEnvironmentName() != null
                && other.getPullRequestEnvironmentName().equals(
                        this.getPullRequestEnvironmentName()) == false)
            return false;
        if (other.getDestinationBranch() == null ^ this.getDestinationBranch() == null)
            return false;
        if (other.getDestinationBranch() != null
                && other.getDestinationBranch().equals(this.getDestinationBranch()) == false)
            return false;
        if (other.getSourceBranch() == null ^ this.getSourceBranch() == null)
            return false;
        if (other.getSourceBranch() != null
                && other.getSourceBranch().equals(this.getSourceBranch()) == false)
            return false;
        if (other.getBackendEnvironmentArn() == null ^ this.getBackendEnvironmentArn() == null)
            return false;
        if (other.getBackendEnvironmentArn() != null
                && other.getBackendEnvironmentArn().equals(this.getBackendEnvironmentArn()) == false)
            return false;
        return true;
    }
}
