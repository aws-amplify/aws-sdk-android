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
 * Updates an existing Amplify app.
 * </p>
 */
public class UpdateAppRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The name for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String name;

    /**
     * <p>
     * The description for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String description;

    /**
     * <p>
     * The platform for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WEB
     */
    private String platform;

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) service role for an Amplify
     * app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String iamServiceRoleArn;

    /**
     * <p>
     * The environment variables for an Amplify app.
     * </p>
     */
    private java.util.Map<String, String> environmentVariables;

    /**
     * <p>
     * Enables branch auto-building for an Amplify app.
     * </p>
     */
    private Boolean enableBranchAutoBuild;

    /**
     * <p>
     * Automatically disconnects a branch in the Amplify Console when you delete
     * a branch from your Git repository.
     * </p>
     */
    private Boolean enableBranchAutoDeletion;

    /**
     * <p>
     * Enables basic authorization for an Amplify app.
     * </p>
     */
    private Boolean enableBasicAuth;

    /**
     * <p>
     * The basic authorization credentials for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     */
    private String basicAuthCredentials;

    /**
     * <p>
     * The custom redirect and rewrite rules for an Amplify app.
     * </p>
     */
    private java.util.List<CustomRule> customRules;

    /**
     * <p>
     * The build specification (build spec) for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25000<br/>
     */
    private String buildSpec;

    /**
     * <p>
     * Enables automated branch creation for the Amplify app.
     * </p>
     */
    private Boolean enableAutoBranchCreation;

    /**
     * <p>
     * Describes the automated branch creation glob patterns for the Amplify
     * app.
     * </p>
     */
    private java.util.List<String> autoBranchCreationPatterns;

    /**
     * <p>
     * The automated branch creation configuration for the Amplify app.
     * </p>
     */
    private AutoBranchCreationConfig autoBranchCreationConfig;

    /**
     * <p>
     * The name of the repository for an Amplify app
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String repository;

    /**
     * <p>
     * The OAuth token for a third-party source control system for an Amplify
     * app. The token is used to create a webhook and a read-only deploy key.
     * The OAuth token is not stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     */
    private String oauthToken;

    /**
     * <p>
     * The personal access token for a third-party source control system for an
     * Amplify app. The token is used to create webhook and a read-only deploy
     * key. The token is not stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String accessToken;

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
    public UpdateAppRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * <p>
     * The name for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name for an Amplify app.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param name <p>
     *            The name for an Amplify app.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param name <p>
     *            The name for an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         The description for an Amplify app.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param description <p>
     *            The description for an Amplify app.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param description <p>
     *            The description for an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The platform for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WEB
     *
     * @return <p>
     *         The platform for an Amplify app.
     *         </p>
     * @see Platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * <p>
     * The platform for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WEB
     *
     * @param platform <p>
     *            The platform for an Amplify app.
     *            </p>
     * @see Platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform for an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WEB
     *
     * @param platform <p>
     *            The platform for an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Platform
     */
    public UpdateAppRequest withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * <p>
     * The platform for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WEB
     *
     * @param platform <p>
     *            The platform for an Amplify app.
     *            </p>
     * @see Platform
     */
    public void setPlatform(Platform platform) {
        this.platform = platform.toString();
    }

    /**
     * <p>
     * The platform for an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WEB
     *
     * @param platform <p>
     *            The platform for an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Platform
     */
    public UpdateAppRequest withPlatform(Platform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) service role for an Amplify
     * app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The AWS Identity and Access Management (IAM) service role for an
     *         Amplify app.
     *         </p>
     */
    public String getIamServiceRoleArn() {
        return iamServiceRoleArn;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) service role for an Amplify
     * app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param iamServiceRoleArn <p>
     *            The AWS Identity and Access Management (IAM) service role for
     *            an Amplify app.
     *            </p>
     */
    public void setIamServiceRoleArn(String iamServiceRoleArn) {
        this.iamServiceRoleArn = iamServiceRoleArn;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) service role for an Amplify
     * app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param iamServiceRoleArn <p>
     *            The AWS Identity and Access Management (IAM) service role for
     *            an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppRequest withIamServiceRoleArn(String iamServiceRoleArn) {
        this.iamServiceRoleArn = iamServiceRoleArn;
        return this;
    }

    /**
     * <p>
     * The environment variables for an Amplify app.
     * </p>
     *
     * @return <p>
     *         The environment variables for an Amplify app.
     *         </p>
     */
    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * <p>
     * The environment variables for an Amplify app.
     * </p>
     *
     * @param environmentVariables <p>
     *            The environment variables for an Amplify app.
     *            </p>
     */
    public void setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    /**
     * <p>
     * The environment variables for an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentVariables <p>
     *            The environment variables for an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppRequest withEnvironmentVariables(
            java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * <p>
     * The environment variables for an Amplify app.
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
    public UpdateAppRequest addenvironmentVariablesEntry(String key, String value) {
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
    public UpdateAppRequest clearenvironmentVariablesEntries() {
        this.environmentVariables = null;
        return this;
    }

    /**
     * <p>
     * Enables branch auto-building for an Amplify app.
     * </p>
     *
     * @return <p>
     *         Enables branch auto-building for an Amplify app.
     *         </p>
     */
    public Boolean isEnableBranchAutoBuild() {
        return enableBranchAutoBuild;
    }

    /**
     * <p>
     * Enables branch auto-building for an Amplify app.
     * </p>
     *
     * @return <p>
     *         Enables branch auto-building for an Amplify app.
     *         </p>
     */
    public Boolean getEnableBranchAutoBuild() {
        return enableBranchAutoBuild;
    }

    /**
     * <p>
     * Enables branch auto-building for an Amplify app.
     * </p>
     *
     * @param enableBranchAutoBuild <p>
     *            Enables branch auto-building for an Amplify app.
     *            </p>
     */
    public void setEnableBranchAutoBuild(Boolean enableBranchAutoBuild) {
        this.enableBranchAutoBuild = enableBranchAutoBuild;
    }

    /**
     * <p>
     * Enables branch auto-building for an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableBranchAutoBuild <p>
     *            Enables branch auto-building for an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppRequest withEnableBranchAutoBuild(Boolean enableBranchAutoBuild) {
        this.enableBranchAutoBuild = enableBranchAutoBuild;
        return this;
    }

    /**
     * <p>
     * Automatically disconnects a branch in the Amplify Console when you delete
     * a branch from your Git repository.
     * </p>
     *
     * @return <p>
     *         Automatically disconnects a branch in the Amplify Console when
     *         you delete a branch from your Git repository.
     *         </p>
     */
    public Boolean isEnableBranchAutoDeletion() {
        return enableBranchAutoDeletion;
    }

    /**
     * <p>
     * Automatically disconnects a branch in the Amplify Console when you delete
     * a branch from your Git repository.
     * </p>
     *
     * @return <p>
     *         Automatically disconnects a branch in the Amplify Console when
     *         you delete a branch from your Git repository.
     *         </p>
     */
    public Boolean getEnableBranchAutoDeletion() {
        return enableBranchAutoDeletion;
    }

    /**
     * <p>
     * Automatically disconnects a branch in the Amplify Console when you delete
     * a branch from your Git repository.
     * </p>
     *
     * @param enableBranchAutoDeletion <p>
     *            Automatically disconnects a branch in the Amplify Console when
     *            you delete a branch from your Git repository.
     *            </p>
     */
    public void setEnableBranchAutoDeletion(Boolean enableBranchAutoDeletion) {
        this.enableBranchAutoDeletion = enableBranchAutoDeletion;
    }

    /**
     * <p>
     * Automatically disconnects a branch in the Amplify Console when you delete
     * a branch from your Git repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableBranchAutoDeletion <p>
     *            Automatically disconnects a branch in the Amplify Console when
     *            you delete a branch from your Git repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppRequest withEnableBranchAutoDeletion(Boolean enableBranchAutoDeletion) {
        this.enableBranchAutoDeletion = enableBranchAutoDeletion;
        return this;
    }

    /**
     * <p>
     * Enables basic authorization for an Amplify app.
     * </p>
     *
     * @return <p>
     *         Enables basic authorization for an Amplify app.
     *         </p>
     */
    public Boolean isEnableBasicAuth() {
        return enableBasicAuth;
    }

    /**
     * <p>
     * Enables basic authorization for an Amplify app.
     * </p>
     *
     * @return <p>
     *         Enables basic authorization for an Amplify app.
     *         </p>
     */
    public Boolean getEnableBasicAuth() {
        return enableBasicAuth;
    }

    /**
     * <p>
     * Enables basic authorization for an Amplify app.
     * </p>
     *
     * @param enableBasicAuth <p>
     *            Enables basic authorization for an Amplify app.
     *            </p>
     */
    public void setEnableBasicAuth(Boolean enableBasicAuth) {
        this.enableBasicAuth = enableBasicAuth;
    }

    /**
     * <p>
     * Enables basic authorization for an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableBasicAuth <p>
     *            Enables basic authorization for an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppRequest withEnableBasicAuth(Boolean enableBasicAuth) {
        this.enableBasicAuth = enableBasicAuth;
        return this;
    }

    /**
     * <p>
     * The basic authorization credentials for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @return <p>
     *         The basic authorization credentials for an Amplify app.
     *         </p>
     */
    public String getBasicAuthCredentials() {
        return basicAuthCredentials;
    }

    /**
     * <p>
     * The basic authorization credentials for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param basicAuthCredentials <p>
     *            The basic authorization credentials for an Amplify app.
     *            </p>
     */
    public void setBasicAuthCredentials(String basicAuthCredentials) {
        this.basicAuthCredentials = basicAuthCredentials;
    }

    /**
     * <p>
     * The basic authorization credentials for an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param basicAuthCredentials <p>
     *            The basic authorization credentials for an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppRequest withBasicAuthCredentials(String basicAuthCredentials) {
        this.basicAuthCredentials = basicAuthCredentials;
        return this;
    }

    /**
     * <p>
     * The custom redirect and rewrite rules for an Amplify app.
     * </p>
     *
     * @return <p>
     *         The custom redirect and rewrite rules for an Amplify app.
     *         </p>
     */
    public java.util.List<CustomRule> getCustomRules() {
        return customRules;
    }

    /**
     * <p>
     * The custom redirect and rewrite rules for an Amplify app.
     * </p>
     *
     * @param customRules <p>
     *            The custom redirect and rewrite rules for an Amplify app.
     *            </p>
     */
    public void setCustomRules(java.util.Collection<CustomRule> customRules) {
        if (customRules == null) {
            this.customRules = null;
            return;
        }

        this.customRules = new java.util.ArrayList<CustomRule>(customRules);
    }

    /**
     * <p>
     * The custom redirect and rewrite rules for an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customRules <p>
     *            The custom redirect and rewrite rules for an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppRequest withCustomRules(CustomRule... customRules) {
        if (getCustomRules() == null) {
            this.customRules = new java.util.ArrayList<CustomRule>(customRules.length);
        }
        for (CustomRule value : customRules) {
            this.customRules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The custom redirect and rewrite rules for an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customRules <p>
     *            The custom redirect and rewrite rules for an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppRequest withCustomRules(java.util.Collection<CustomRule> customRules) {
        setCustomRules(customRules);
        return this;
    }

    /**
     * <p>
     * The build specification (build spec) for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25000<br/>
     *
     * @return <p>
     *         The build specification (build spec) for an Amplify app.
     *         </p>
     */
    public String getBuildSpec() {
        return buildSpec;
    }

    /**
     * <p>
     * The build specification (build spec) for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25000<br/>
     *
     * @param buildSpec <p>
     *            The build specification (build spec) for an Amplify app.
     *            </p>
     */
    public void setBuildSpec(String buildSpec) {
        this.buildSpec = buildSpec;
    }

    /**
     * <p>
     * The build specification (build spec) for an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25000<br/>
     *
     * @param buildSpec <p>
     *            The build specification (build spec) for an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppRequest withBuildSpec(String buildSpec) {
        this.buildSpec = buildSpec;
        return this;
    }

    /**
     * <p>
     * Enables automated branch creation for the Amplify app.
     * </p>
     *
     * @return <p>
     *         Enables automated branch creation for the Amplify app.
     *         </p>
     */
    public Boolean isEnableAutoBranchCreation() {
        return enableAutoBranchCreation;
    }

    /**
     * <p>
     * Enables automated branch creation for the Amplify app.
     * </p>
     *
     * @return <p>
     *         Enables automated branch creation for the Amplify app.
     *         </p>
     */
    public Boolean getEnableAutoBranchCreation() {
        return enableAutoBranchCreation;
    }

    /**
     * <p>
     * Enables automated branch creation for the Amplify app.
     * </p>
     *
     * @param enableAutoBranchCreation <p>
     *            Enables automated branch creation for the Amplify app.
     *            </p>
     */
    public void setEnableAutoBranchCreation(Boolean enableAutoBranchCreation) {
        this.enableAutoBranchCreation = enableAutoBranchCreation;
    }

    /**
     * <p>
     * Enables automated branch creation for the Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableAutoBranchCreation <p>
     *            Enables automated branch creation for the Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppRequest withEnableAutoBranchCreation(Boolean enableAutoBranchCreation) {
        this.enableAutoBranchCreation = enableAutoBranchCreation;
        return this;
    }

    /**
     * <p>
     * Describes the automated branch creation glob patterns for the Amplify
     * app.
     * </p>
     *
     * @return <p>
     *         Describes the automated branch creation glob patterns for the
     *         Amplify app.
     *         </p>
     */
    public java.util.List<String> getAutoBranchCreationPatterns() {
        return autoBranchCreationPatterns;
    }

    /**
     * <p>
     * Describes the automated branch creation glob patterns for the Amplify
     * app.
     * </p>
     *
     * @param autoBranchCreationPatterns <p>
     *            Describes the automated branch creation glob patterns for the
     *            Amplify app.
     *            </p>
     */
    public void setAutoBranchCreationPatterns(
            java.util.Collection<String> autoBranchCreationPatterns) {
        if (autoBranchCreationPatterns == null) {
            this.autoBranchCreationPatterns = null;
            return;
        }

        this.autoBranchCreationPatterns = new java.util.ArrayList<String>(
                autoBranchCreationPatterns);
    }

    /**
     * <p>
     * Describes the automated branch creation glob patterns for the Amplify
     * app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoBranchCreationPatterns <p>
     *            Describes the automated branch creation glob patterns for the
     *            Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppRequest withAutoBranchCreationPatterns(String... autoBranchCreationPatterns) {
        if (getAutoBranchCreationPatterns() == null) {
            this.autoBranchCreationPatterns = new java.util.ArrayList<String>(
                    autoBranchCreationPatterns.length);
        }
        for (String value : autoBranchCreationPatterns) {
            this.autoBranchCreationPatterns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Describes the automated branch creation glob patterns for the Amplify
     * app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoBranchCreationPatterns <p>
     *            Describes the automated branch creation glob patterns for the
     *            Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppRequest withAutoBranchCreationPatterns(
            java.util.Collection<String> autoBranchCreationPatterns) {
        setAutoBranchCreationPatterns(autoBranchCreationPatterns);
        return this;
    }

    /**
     * <p>
     * The automated branch creation configuration for the Amplify app.
     * </p>
     *
     * @return <p>
     *         The automated branch creation configuration for the Amplify app.
     *         </p>
     */
    public AutoBranchCreationConfig getAutoBranchCreationConfig() {
        return autoBranchCreationConfig;
    }

    /**
     * <p>
     * The automated branch creation configuration for the Amplify app.
     * </p>
     *
     * @param autoBranchCreationConfig <p>
     *            The automated branch creation configuration for the Amplify
     *            app.
     *            </p>
     */
    public void setAutoBranchCreationConfig(AutoBranchCreationConfig autoBranchCreationConfig) {
        this.autoBranchCreationConfig = autoBranchCreationConfig;
    }

    /**
     * <p>
     * The automated branch creation configuration for the Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoBranchCreationConfig <p>
     *            The automated branch creation configuration for the Amplify
     *            app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppRequest withAutoBranchCreationConfig(
            AutoBranchCreationConfig autoBranchCreationConfig) {
        this.autoBranchCreationConfig = autoBranchCreationConfig;
        return this;
    }

    /**
     * <p>
     * The name of the repository for an Amplify app
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         The name of the repository for an Amplify app
     *         </p>
     */
    public String getRepository() {
        return repository;
    }

    /**
     * <p>
     * The name of the repository for an Amplify app
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param repository <p>
     *            The name of the repository for an Amplify app
     *            </p>
     */
    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The name of the repository for an Amplify app
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param repository <p>
     *            The name of the repository for an Amplify app
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppRequest withRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * <p>
     * The OAuth token for a third-party source control system for an Amplify
     * app. The token is used to create a webhook and a read-only deploy key.
     * The OAuth token is not stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @return <p>
     *         The OAuth token for a third-party source control system for an
     *         Amplify app. The token is used to create a webhook and a
     *         read-only deploy key. The OAuth token is not stored.
     *         </p>
     */
    public String getOauthToken() {
        return oauthToken;
    }

    /**
     * <p>
     * The OAuth token for a third-party source control system for an Amplify
     * app. The token is used to create a webhook and a read-only deploy key.
     * The OAuth token is not stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param oauthToken <p>
     *            The OAuth token for a third-party source control system for an
     *            Amplify app. The token is used to create a webhook and a
     *            read-only deploy key. The OAuth token is not stored.
     *            </p>
     */
    public void setOauthToken(String oauthToken) {
        this.oauthToken = oauthToken;
    }

    /**
     * <p>
     * The OAuth token for a third-party source control system for an Amplify
     * app. The token is used to create a webhook and a read-only deploy key.
     * The OAuth token is not stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param oauthToken <p>
     *            The OAuth token for a third-party source control system for an
     *            Amplify app. The token is used to create a webhook and a
     *            read-only deploy key. The OAuth token is not stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppRequest withOauthToken(String oauthToken) {
        this.oauthToken = oauthToken;
        return this;
    }

    /**
     * <p>
     * The personal access token for a third-party source control system for an
     * Amplify app. The token is used to create webhook and a read-only deploy
     * key. The token is not stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The personal access token for a third-party source control system
     *         for an Amplify app. The token is used to create webhook and a
     *         read-only deploy key. The token is not stored.
     *         </p>
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * <p>
     * The personal access token for a third-party source control system for an
     * Amplify app. The token is used to create webhook and a read-only deploy
     * key. The token is not stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param accessToken <p>
     *            The personal access token for a third-party source control
     *            system for an Amplify app. The token is used to create webhook
     *            and a read-only deploy key. The token is not stored.
     *            </p>
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * The personal access token for a third-party source control system for an
     * Amplify app. The token is used to create webhook and a read-only deploy
     * key. The token is not stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param accessToken <p>
     *            The personal access token for a third-party source control
     *            system for an Amplify app. The token is used to create webhook
     *            and a read-only deploy key. The token is not stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppRequest withAccessToken(String accessToken) {
        this.accessToken = accessToken;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getPlatform() != null)
            sb.append("platform: " + getPlatform() + ",");
        if (getIamServiceRoleArn() != null)
            sb.append("iamServiceRoleArn: " + getIamServiceRoleArn() + ",");
        if (getEnvironmentVariables() != null)
            sb.append("environmentVariables: " + getEnvironmentVariables() + ",");
        if (getEnableBranchAutoBuild() != null)
            sb.append("enableBranchAutoBuild: " + getEnableBranchAutoBuild() + ",");
        if (getEnableBranchAutoDeletion() != null)
            sb.append("enableBranchAutoDeletion: " + getEnableBranchAutoDeletion() + ",");
        if (getEnableBasicAuth() != null)
            sb.append("enableBasicAuth: " + getEnableBasicAuth() + ",");
        if (getBasicAuthCredentials() != null)
            sb.append("basicAuthCredentials: " + getBasicAuthCredentials() + ",");
        if (getCustomRules() != null)
            sb.append("customRules: " + getCustomRules() + ",");
        if (getBuildSpec() != null)
            sb.append("buildSpec: " + getBuildSpec() + ",");
        if (getEnableAutoBranchCreation() != null)
            sb.append("enableAutoBranchCreation: " + getEnableAutoBranchCreation() + ",");
        if (getAutoBranchCreationPatterns() != null)
            sb.append("autoBranchCreationPatterns: " + getAutoBranchCreationPatterns() + ",");
        if (getAutoBranchCreationConfig() != null)
            sb.append("autoBranchCreationConfig: " + getAutoBranchCreationConfig() + ",");
        if (getRepository() != null)
            sb.append("repository: " + getRepository() + ",");
        if (getOauthToken() != null)
            sb.append("oauthToken: " + getOauthToken() + ",");
        if (getAccessToken() != null)
            sb.append("accessToken: " + getAccessToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode
                + ((getIamServiceRoleArn() == null) ? 0 : getIamServiceRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentVariables() == null) ? 0 : getEnvironmentVariables().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnableBranchAutoBuild() == null) ? 0 : getEnableBranchAutoBuild().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnableBranchAutoDeletion() == null) ? 0 : getEnableBranchAutoDeletion()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getEnableBasicAuth() == null) ? 0 : getEnableBasicAuth().hashCode());
        hashCode = prime * hashCode
                + ((getBasicAuthCredentials() == null) ? 0 : getBasicAuthCredentials().hashCode());
        hashCode = prime * hashCode
                + ((getCustomRules() == null) ? 0 : getCustomRules().hashCode());
        hashCode = prime * hashCode + ((getBuildSpec() == null) ? 0 : getBuildSpec().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnableAutoBranchCreation() == null) ? 0 : getEnableAutoBranchCreation()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoBranchCreationPatterns() == null) ? 0 : getAutoBranchCreationPatterns()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoBranchCreationConfig() == null) ? 0 : getAutoBranchCreationConfig()
                        .hashCode());
        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
        hashCode = prime * hashCode + ((getOauthToken() == null) ? 0 : getOauthToken().hashCode());
        hashCode = prime * hashCode
                + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAppRequest == false)
            return false;
        UpdateAppRequest other = (UpdateAppRequest) obj;

        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getIamServiceRoleArn() == null ^ this.getIamServiceRoleArn() == null)
            return false;
        if (other.getIamServiceRoleArn() != null
                && other.getIamServiceRoleArn().equals(this.getIamServiceRoleArn()) == false)
            return false;
        if (other.getEnvironmentVariables() == null ^ this.getEnvironmentVariables() == null)
            return false;
        if (other.getEnvironmentVariables() != null
                && other.getEnvironmentVariables().equals(this.getEnvironmentVariables()) == false)
            return false;
        if (other.getEnableBranchAutoBuild() == null ^ this.getEnableBranchAutoBuild() == null)
            return false;
        if (other.getEnableBranchAutoBuild() != null
                && other.getEnableBranchAutoBuild().equals(this.getEnableBranchAutoBuild()) == false)
            return false;
        if (other.getEnableBranchAutoDeletion() == null
                ^ this.getEnableBranchAutoDeletion() == null)
            return false;
        if (other.getEnableBranchAutoDeletion() != null
                && other.getEnableBranchAutoDeletion().equals(this.getEnableBranchAutoDeletion()) == false)
            return false;
        if (other.getEnableBasicAuth() == null ^ this.getEnableBasicAuth() == null)
            return false;
        if (other.getEnableBasicAuth() != null
                && other.getEnableBasicAuth().equals(this.getEnableBasicAuth()) == false)
            return false;
        if (other.getBasicAuthCredentials() == null ^ this.getBasicAuthCredentials() == null)
            return false;
        if (other.getBasicAuthCredentials() != null
                && other.getBasicAuthCredentials().equals(this.getBasicAuthCredentials()) == false)
            return false;
        if (other.getCustomRules() == null ^ this.getCustomRules() == null)
            return false;
        if (other.getCustomRules() != null
                && other.getCustomRules().equals(this.getCustomRules()) == false)
            return false;
        if (other.getBuildSpec() == null ^ this.getBuildSpec() == null)
            return false;
        if (other.getBuildSpec() != null
                && other.getBuildSpec().equals(this.getBuildSpec()) == false)
            return false;
        if (other.getEnableAutoBranchCreation() == null
                ^ this.getEnableAutoBranchCreation() == null)
            return false;
        if (other.getEnableAutoBranchCreation() != null
                && other.getEnableAutoBranchCreation().equals(this.getEnableAutoBranchCreation()) == false)
            return false;
        if (other.getAutoBranchCreationPatterns() == null
                ^ this.getAutoBranchCreationPatterns() == null)
            return false;
        if (other.getAutoBranchCreationPatterns() != null
                && other.getAutoBranchCreationPatterns().equals(
                        this.getAutoBranchCreationPatterns()) == false)
            return false;
        if (other.getAutoBranchCreationConfig() == null
                ^ this.getAutoBranchCreationConfig() == null)
            return false;
        if (other.getAutoBranchCreationConfig() != null
                && other.getAutoBranchCreationConfig().equals(this.getAutoBranchCreationConfig()) == false)
            return false;
        if (other.getRepository() == null ^ this.getRepository() == null)
            return false;
        if (other.getRepository() != null
                && other.getRepository().equals(this.getRepository()) == false)
            return false;
        if (other.getOauthToken() == null ^ this.getOauthToken() == null)
            return false;
        if (other.getOauthToken() != null
                && other.getOauthToken().equals(this.getOauthToken()) == false)
            return false;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null
                && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        return true;
    }
}
