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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new branch for an Amplify app.
 * </p>
 */
public class CreateBranchRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String appId;

    /**
     * <p>
     * The name for the branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String branchName;

    /**
     * <p>
     * The description for the branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String description;

    /**
     * <p>
     * Describes the current stage for the branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION, BETA, DEVELOPMENT, EXPERIMENTAL,
     * PULL_REQUEST
     */
    private String stage;

    /**
     * <p>
     * The framework for the branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String framework;

    /**
     * <p>
     * Enables notifications for the branch.
     * </p>
     */
    private Boolean enableNotification;

    /**
     * <p>
     * Enables auto building for the branch.
     * </p>
     */
    private Boolean enableAutoBuild;

    /**
     * <p>
     * The environment variables for the branch.
     * </p>
     */
    private java.util.Map<String, String> environmentVariables;

    /**
     * <p>
     * The basic authorization credentials for the branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     */
    private String basicAuthCredentials;

    /**
     * <p>
     * Enables basic authorization for the branch.
     * </p>
     */
    private Boolean enableBasicAuth;

    /**
     * <p>
     * The tag for the branch.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The build specification (build spec) for the branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25000<br/>
     */
    private String buildSpec;

    /**
     * <p>
     * The content Time To Live (TTL) for the website in seconds.
     * </p>
     */
    private String ttl;

    /**
     * <p>
     * The display name for a branch. This is used as the default domain prefix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String displayName;

    /**
     * <p>
     * Enables pull request preview for this branch.
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
     * The unique ID for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The unique ID for an Amplify app.
     *         </p>
     */
    public String getAppId() {
        return appId;
    }

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param appId <p>
     *            The unique ID for an Amplify app.
     *            </p>
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param appId <p>
     *            The unique ID for an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBranchRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * <p>
     * The name for the branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name for the branch.
     *         </p>
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * <p>
     * The name for the branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param branchName <p>
     *            The name for the branch.
     *            </p>
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The name for the branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param branchName <p>
     *            The name for the branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBranchRequest withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * <p>
     * The description for the branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         The description for the branch.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description for the branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param description <p>
     *            The description for the branch.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param description <p>
     *            The description for the branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBranchRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Describes the current stage for the branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION, BETA, DEVELOPMENT, EXPERIMENTAL,
     * PULL_REQUEST
     *
     * @return <p>
     *         Describes the current stage for the branch.
     *         </p>
     * @see Stage
     */
    public String getStage() {
        return stage;
    }

    /**
     * <p>
     * Describes the current stage for the branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION, BETA, DEVELOPMENT, EXPERIMENTAL,
     * PULL_REQUEST
     *
     * @param stage <p>
     *            Describes the current stage for the branch.
     *            </p>
     * @see Stage
     */
    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * Describes the current stage for the branch.
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
     *            Describes the current stage for the branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Stage
     */
    public CreateBranchRequest withStage(String stage) {
        this.stage = stage;
        return this;
    }

    /**
     * <p>
     * Describes the current stage for the branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION, BETA, DEVELOPMENT, EXPERIMENTAL,
     * PULL_REQUEST
     *
     * @param stage <p>
     *            Describes the current stage for the branch.
     *            </p>
     * @see Stage
     */
    public void setStage(Stage stage) {
        this.stage = stage.toString();
    }

    /**
     * <p>
     * Describes the current stage for the branch.
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
     *            Describes the current stage for the branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Stage
     */
    public CreateBranchRequest withStage(Stage stage) {
        this.stage = stage.toString();
        return this;
    }

    /**
     * <p>
     * The framework for the branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The framework for the branch.
     *         </p>
     */
    public String getFramework() {
        return framework;
    }

    /**
     * <p>
     * The framework for the branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param framework <p>
     *            The framework for the branch.
     *            </p>
     */
    public void setFramework(String framework) {
        this.framework = framework;
    }

    /**
     * <p>
     * The framework for the branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param framework <p>
     *            The framework for the branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBranchRequest withFramework(String framework) {
        this.framework = framework;
        return this;
    }

    /**
     * <p>
     * Enables notifications for the branch.
     * </p>
     *
     * @return <p>
     *         Enables notifications for the branch.
     *         </p>
     */
    public Boolean isEnableNotification() {
        return enableNotification;
    }

    /**
     * <p>
     * Enables notifications for the branch.
     * </p>
     *
     * @return <p>
     *         Enables notifications for the branch.
     *         </p>
     */
    public Boolean getEnableNotification() {
        return enableNotification;
    }

    /**
     * <p>
     * Enables notifications for the branch.
     * </p>
     *
     * @param enableNotification <p>
     *            Enables notifications for the branch.
     *            </p>
     */
    public void setEnableNotification(Boolean enableNotification) {
        this.enableNotification = enableNotification;
    }

    /**
     * <p>
     * Enables notifications for the branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableNotification <p>
     *            Enables notifications for the branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBranchRequest withEnableNotification(Boolean enableNotification) {
        this.enableNotification = enableNotification;
        return this;
    }

    /**
     * <p>
     * Enables auto building for the branch.
     * </p>
     *
     * @return <p>
     *         Enables auto building for the branch.
     *         </p>
     */
    public Boolean isEnableAutoBuild() {
        return enableAutoBuild;
    }

    /**
     * <p>
     * Enables auto building for the branch.
     * </p>
     *
     * @return <p>
     *         Enables auto building for the branch.
     *         </p>
     */
    public Boolean getEnableAutoBuild() {
        return enableAutoBuild;
    }

    /**
     * <p>
     * Enables auto building for the branch.
     * </p>
     *
     * @param enableAutoBuild <p>
     *            Enables auto building for the branch.
     *            </p>
     */
    public void setEnableAutoBuild(Boolean enableAutoBuild) {
        this.enableAutoBuild = enableAutoBuild;
    }

    /**
     * <p>
     * Enables auto building for the branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableAutoBuild <p>
     *            Enables auto building for the branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBranchRequest withEnableAutoBuild(Boolean enableAutoBuild) {
        this.enableAutoBuild = enableAutoBuild;
        return this;
    }

    /**
     * <p>
     * The environment variables for the branch.
     * </p>
     *
     * @return <p>
     *         The environment variables for the branch.
     *         </p>
     */
    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * <p>
     * The environment variables for the branch.
     * </p>
     *
     * @param environmentVariables <p>
     *            The environment variables for the branch.
     *            </p>
     */
    public void setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    /**
     * <p>
     * The environment variables for the branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentVariables <p>
     *            The environment variables for the branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBranchRequest withEnvironmentVariables(
            java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * <p>
     * The environment variables for the branch.
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
    public CreateBranchRequest addenvironmentVariablesEntry(String key, String value) {
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
    public CreateBranchRequest clearenvironmentVariablesEntries() {
        this.environmentVariables = null;
        return this;
    }

    /**
     * <p>
     * The basic authorization credentials for the branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @return <p>
     *         The basic authorization credentials for the branch.
     *         </p>
     */
    public String getBasicAuthCredentials() {
        return basicAuthCredentials;
    }

    /**
     * <p>
     * The basic authorization credentials for the branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param basicAuthCredentials <p>
     *            The basic authorization credentials for the branch.
     *            </p>
     */
    public void setBasicAuthCredentials(String basicAuthCredentials) {
        this.basicAuthCredentials = basicAuthCredentials;
    }

    /**
     * <p>
     * The basic authorization credentials for the branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param basicAuthCredentials <p>
     *            The basic authorization credentials for the branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBranchRequest withBasicAuthCredentials(String basicAuthCredentials) {
        this.basicAuthCredentials = basicAuthCredentials;
        return this;
    }

    /**
     * <p>
     * Enables basic authorization for the branch.
     * </p>
     *
     * @return <p>
     *         Enables basic authorization for the branch.
     *         </p>
     */
    public Boolean isEnableBasicAuth() {
        return enableBasicAuth;
    }

    /**
     * <p>
     * Enables basic authorization for the branch.
     * </p>
     *
     * @return <p>
     *         Enables basic authorization for the branch.
     *         </p>
     */
    public Boolean getEnableBasicAuth() {
        return enableBasicAuth;
    }

    /**
     * <p>
     * Enables basic authorization for the branch.
     * </p>
     *
     * @param enableBasicAuth <p>
     *            Enables basic authorization for the branch.
     *            </p>
     */
    public void setEnableBasicAuth(Boolean enableBasicAuth) {
        this.enableBasicAuth = enableBasicAuth;
    }

    /**
     * <p>
     * Enables basic authorization for the branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableBasicAuth <p>
     *            Enables basic authorization for the branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBranchRequest withEnableBasicAuth(Boolean enableBasicAuth) {
        this.enableBasicAuth = enableBasicAuth;
        return this;
    }

    /**
     * <p>
     * The tag for the branch.
     * </p>
     *
     * @return <p>
     *         The tag for the branch.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag for the branch.
     * </p>
     *
     * @param tags <p>
     *            The tag for the branch.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tag for the branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag for the branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBranchRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tag for the branch.
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
    public CreateBranchRequest addtagsEntry(String key, String value) {
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
    public CreateBranchRequest cleartagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The build specification (build spec) for the branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25000<br/>
     *
     * @return <p>
     *         The build specification (build spec) for the branch.
     *         </p>
     */
    public String getBuildSpec() {
        return buildSpec;
    }

    /**
     * <p>
     * The build specification (build spec) for the branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25000<br/>
     *
     * @param buildSpec <p>
     *            The build specification (build spec) for the branch.
     *            </p>
     */
    public void setBuildSpec(String buildSpec) {
        this.buildSpec = buildSpec;
    }

    /**
     * <p>
     * The build specification (build spec) for the branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25000<br/>
     *
     * @param buildSpec <p>
     *            The build specification (build spec) for the branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBranchRequest withBuildSpec(String buildSpec) {
        this.buildSpec = buildSpec;
        return this;
    }

    /**
     * <p>
     * The content Time To Live (TTL) for the website in seconds.
     * </p>
     *
     * @return <p>
     *         The content Time To Live (TTL) for the website in seconds.
     *         </p>
     */
    public String getTtl() {
        return ttl;
    }

    /**
     * <p>
     * The content Time To Live (TTL) for the website in seconds.
     * </p>
     *
     * @param ttl <p>
     *            The content Time To Live (TTL) for the website in seconds.
     *            </p>
     */
    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    /**
     * <p>
     * The content Time To Live (TTL) for the website in seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ttl <p>
     *            The content Time To Live (TTL) for the website in seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBranchRequest withTtl(String ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * <p>
     * The display name for a branch. This is used as the default domain prefix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The display name for a branch. This is used as the default domain
     *         prefix.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The display name for a branch. This is used as the default domain prefix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param displayName <p>
     *            The display name for a branch. This is used as the default
     *            domain prefix.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name for a branch. This is used as the default domain prefix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param displayName <p>
     *            The display name for a branch. This is used as the default
     *            domain prefix.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBranchRequest withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * Enables pull request preview for this branch.
     * </p>
     *
     * @return <p>
     *         Enables pull request preview for this branch.
     *         </p>
     */
    public Boolean isEnablePullRequestPreview() {
        return enablePullRequestPreview;
    }

    /**
     * <p>
     * Enables pull request preview for this branch.
     * </p>
     *
     * @return <p>
     *         Enables pull request preview for this branch.
     *         </p>
     */
    public Boolean getEnablePullRequestPreview() {
        return enablePullRequestPreview;
    }

    /**
     * <p>
     * Enables pull request preview for this branch.
     * </p>
     *
     * @param enablePullRequestPreview <p>
     *            Enables pull request preview for this branch.
     *            </p>
     */
    public void setEnablePullRequestPreview(Boolean enablePullRequestPreview) {
        this.enablePullRequestPreview = enablePullRequestPreview;
    }

    /**
     * <p>
     * Enables pull request preview for this branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enablePullRequestPreview <p>
     *            Enables pull request preview for this branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBranchRequest withEnablePullRequestPreview(Boolean enablePullRequestPreview) {
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
    public CreateBranchRequest withPullRequestEnvironmentName(String pullRequestEnvironmentName) {
        this.pullRequestEnvironmentName = pullRequestEnvironmentName;
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
    public CreateBranchRequest withBackendEnvironmentArn(String backendEnvironmentArn) {
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
        if (getAppId() != null)
            sb.append("appId: " + getAppId() + ",");
        if (getBranchName() != null)
            sb.append("branchName: " + getBranchName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getStage() != null)
            sb.append("stage: " + getStage() + ",");
        if (getFramework() != null)
            sb.append("framework: " + getFramework() + ",");
        if (getEnableNotification() != null)
            sb.append("enableNotification: " + getEnableNotification() + ",");
        if (getEnableAutoBuild() != null)
            sb.append("enableAutoBuild: " + getEnableAutoBuild() + ",");
        if (getEnvironmentVariables() != null)
            sb.append("environmentVariables: " + getEnvironmentVariables() + ",");
        if (getBasicAuthCredentials() != null)
            sb.append("basicAuthCredentials: " + getBasicAuthCredentials() + ",");
        if (getEnableBasicAuth() != null)
            sb.append("enableBasicAuth: " + getEnableBasicAuth() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getBuildSpec() != null)
            sb.append("buildSpec: " + getBuildSpec() + ",");
        if (getTtl() != null)
            sb.append("ttl: " + getTtl() + ",");
        if (getDisplayName() != null)
            sb.append("displayName: " + getDisplayName() + ",");
        if (getEnablePullRequestPreview() != null)
            sb.append("enablePullRequestPreview: " + getEnablePullRequestPreview() + ",");
        if (getPullRequestEnvironmentName() != null)
            sb.append("pullRequestEnvironmentName: " + getPullRequestEnvironmentName() + ",");
        if (getBackendEnvironmentArn() != null)
            sb.append("backendEnvironmentArn: " + getBackendEnvironmentArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        hashCode = prime * hashCode + ((getFramework() == null) ? 0 : getFramework().hashCode());
        hashCode = prime * hashCode
                + ((getEnableNotification() == null) ? 0 : getEnableNotification().hashCode());
        hashCode = prime * hashCode
                + ((getEnableAutoBuild() == null) ? 0 : getEnableAutoBuild().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentVariables() == null) ? 0 : getEnvironmentVariables().hashCode());
        hashCode = prime * hashCode
                + ((getBasicAuthCredentials() == null) ? 0 : getBasicAuthCredentials().hashCode());
        hashCode = prime * hashCode
                + ((getEnableBasicAuth() == null) ? 0 : getEnableBasicAuth().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getBuildSpec() == null) ? 0 : getBuildSpec().hashCode());
        hashCode = prime * hashCode + ((getTtl() == null) ? 0 : getTtl().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnablePullRequestPreview() == null) ? 0 : getEnablePullRequestPreview()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPullRequestEnvironmentName() == null) ? 0 : getPullRequestEnvironmentName()
                        .hashCode());
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

        if (obj instanceof CreateBranchRequest == false)
            return false;
        CreateBranchRequest other = (CreateBranchRequest) obj;

        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
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
        if (other.getStage() == null ^ this.getStage() == null)
            return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false)
            return false;
        if (other.getFramework() == null ^ this.getFramework() == null)
            return false;
        if (other.getFramework() != null
                && other.getFramework().equals(this.getFramework()) == false)
            return false;
        if (other.getEnableNotification() == null ^ this.getEnableNotification() == null)
            return false;
        if (other.getEnableNotification() != null
                && other.getEnableNotification().equals(this.getEnableNotification()) == false)
            return false;
        if (other.getEnableAutoBuild() == null ^ this.getEnableAutoBuild() == null)
            return false;
        if (other.getEnableAutoBuild() != null
                && other.getEnableAutoBuild().equals(this.getEnableAutoBuild()) == false)
            return false;
        if (other.getEnvironmentVariables() == null ^ this.getEnvironmentVariables() == null)
            return false;
        if (other.getEnvironmentVariables() != null
                && other.getEnvironmentVariables().equals(this.getEnvironmentVariables()) == false)
            return false;
        if (other.getBasicAuthCredentials() == null ^ this.getBasicAuthCredentials() == null)
            return false;
        if (other.getBasicAuthCredentials() != null
                && other.getBasicAuthCredentials().equals(this.getBasicAuthCredentials()) == false)
            return false;
        if (other.getEnableBasicAuth() == null ^ this.getEnableBasicAuth() == null)
            return false;
        if (other.getEnableBasicAuth() != null
                && other.getEnableBasicAuth().equals(this.getEnableBasicAuth()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
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
        if (other.getBackendEnvironmentArn() == null ^ this.getBackendEnvironmentArn() == null)
            return false;
        if (other.getBackendEnvironmentArn() != null
                && other.getBackendEnvironmentArn().equals(this.getBackendEnvironmentArn()) == false)
            return false;
        return true;
    }
}
