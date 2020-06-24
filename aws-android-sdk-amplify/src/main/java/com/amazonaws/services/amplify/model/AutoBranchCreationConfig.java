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
 * Describes the automated branch creation configuration.
 * </p>
 */
public class AutoBranchCreationConfig implements Serializable {
    /**
     * <p>
     * Describes the current stage for the autocreated branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION, BETA, DEVELOPMENT, EXPERIMENTAL,
     * PULL_REQUEST
     */
    private String stage;

    /**
     * <p>
     * The framework for the autocreated branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String framework;

    /**
     * <p>
     * Enables auto building for the autocreated branch.
     * </p>
     */
    private Boolean enableAutoBuild;

    /**
     * <p>
     * The environment variables for the autocreated branch.
     * </p>
     */
    private java.util.Map<String, String> environmentVariables;

    /**
     * <p>
     * The basic authorization credentials for the autocreated branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     */
    private String basicAuthCredentials;

    /**
     * <p>
     * Enables basic authorization for the autocreated branch.
     * </p>
     */
    private Boolean enableBasicAuth;

    /**
     * <p>
     * The build specification (build spec) for the autocreated branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25000<br/>
     */
    private String buildSpec;

    /**
     * <p>
     * Enables pull request preview for the autocreated branch.
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
     * Describes the current stage for the autocreated branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION, BETA, DEVELOPMENT, EXPERIMENTAL,
     * PULL_REQUEST
     *
     * @return <p>
     *         Describes the current stage for the autocreated branch.
     *         </p>
     * @see Stage
     */
    public String getStage() {
        return stage;
    }

    /**
     * <p>
     * Describes the current stage for the autocreated branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION, BETA, DEVELOPMENT, EXPERIMENTAL,
     * PULL_REQUEST
     *
     * @param stage <p>
     *            Describes the current stage for the autocreated branch.
     *            </p>
     * @see Stage
     */
    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * Describes the current stage for the autocreated branch.
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
     *            Describes the current stage for the autocreated branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Stage
     */
    public AutoBranchCreationConfig withStage(String stage) {
        this.stage = stage;
        return this;
    }

    /**
     * <p>
     * Describes the current stage for the autocreated branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION, BETA, DEVELOPMENT, EXPERIMENTAL,
     * PULL_REQUEST
     *
     * @param stage <p>
     *            Describes the current stage for the autocreated branch.
     *            </p>
     * @see Stage
     */
    public void setStage(Stage stage) {
        this.stage = stage.toString();
    }

    /**
     * <p>
     * Describes the current stage for the autocreated branch.
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
     *            Describes the current stage for the autocreated branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Stage
     */
    public AutoBranchCreationConfig withStage(Stage stage) {
        this.stage = stage.toString();
        return this;
    }

    /**
     * <p>
     * The framework for the autocreated branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The framework for the autocreated branch.
     *         </p>
     */
    public String getFramework() {
        return framework;
    }

    /**
     * <p>
     * The framework for the autocreated branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param framework <p>
     *            The framework for the autocreated branch.
     *            </p>
     */
    public void setFramework(String framework) {
        this.framework = framework;
    }

    /**
     * <p>
     * The framework for the autocreated branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param framework <p>
     *            The framework for the autocreated branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoBranchCreationConfig withFramework(String framework) {
        this.framework = framework;
        return this;
    }

    /**
     * <p>
     * Enables auto building for the autocreated branch.
     * </p>
     *
     * @return <p>
     *         Enables auto building for the autocreated branch.
     *         </p>
     */
    public Boolean isEnableAutoBuild() {
        return enableAutoBuild;
    }

    /**
     * <p>
     * Enables auto building for the autocreated branch.
     * </p>
     *
     * @return <p>
     *         Enables auto building for the autocreated branch.
     *         </p>
     */
    public Boolean getEnableAutoBuild() {
        return enableAutoBuild;
    }

    /**
     * <p>
     * Enables auto building for the autocreated branch.
     * </p>
     *
     * @param enableAutoBuild <p>
     *            Enables auto building for the autocreated branch.
     *            </p>
     */
    public void setEnableAutoBuild(Boolean enableAutoBuild) {
        this.enableAutoBuild = enableAutoBuild;
    }

    /**
     * <p>
     * Enables auto building for the autocreated branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableAutoBuild <p>
     *            Enables auto building for the autocreated branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoBranchCreationConfig withEnableAutoBuild(Boolean enableAutoBuild) {
        this.enableAutoBuild = enableAutoBuild;
        return this;
    }

    /**
     * <p>
     * The environment variables for the autocreated branch.
     * </p>
     *
     * @return <p>
     *         The environment variables for the autocreated branch.
     *         </p>
     */
    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * <p>
     * The environment variables for the autocreated branch.
     * </p>
     *
     * @param environmentVariables <p>
     *            The environment variables for the autocreated branch.
     *            </p>
     */
    public void setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    /**
     * <p>
     * The environment variables for the autocreated branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentVariables <p>
     *            The environment variables for the autocreated branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoBranchCreationConfig withEnvironmentVariables(
            java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * <p>
     * The environment variables for the autocreated branch.
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
    public AutoBranchCreationConfig addenvironmentVariablesEntry(String key, String value) {
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
    public AutoBranchCreationConfig clearenvironmentVariablesEntries() {
        this.environmentVariables = null;
        return this;
    }

    /**
     * <p>
     * The basic authorization credentials for the autocreated branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @return <p>
     *         The basic authorization credentials for the autocreated branch.
     *         </p>
     */
    public String getBasicAuthCredentials() {
        return basicAuthCredentials;
    }

    /**
     * <p>
     * The basic authorization credentials for the autocreated branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param basicAuthCredentials <p>
     *            The basic authorization credentials for the autocreated
     *            branch.
     *            </p>
     */
    public void setBasicAuthCredentials(String basicAuthCredentials) {
        this.basicAuthCredentials = basicAuthCredentials;
    }

    /**
     * <p>
     * The basic authorization credentials for the autocreated branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param basicAuthCredentials <p>
     *            The basic authorization credentials for the autocreated
     *            branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoBranchCreationConfig withBasicAuthCredentials(String basicAuthCredentials) {
        this.basicAuthCredentials = basicAuthCredentials;
        return this;
    }

    /**
     * <p>
     * Enables basic authorization for the autocreated branch.
     * </p>
     *
     * @return <p>
     *         Enables basic authorization for the autocreated branch.
     *         </p>
     */
    public Boolean isEnableBasicAuth() {
        return enableBasicAuth;
    }

    /**
     * <p>
     * Enables basic authorization for the autocreated branch.
     * </p>
     *
     * @return <p>
     *         Enables basic authorization for the autocreated branch.
     *         </p>
     */
    public Boolean getEnableBasicAuth() {
        return enableBasicAuth;
    }

    /**
     * <p>
     * Enables basic authorization for the autocreated branch.
     * </p>
     *
     * @param enableBasicAuth <p>
     *            Enables basic authorization for the autocreated branch.
     *            </p>
     */
    public void setEnableBasicAuth(Boolean enableBasicAuth) {
        this.enableBasicAuth = enableBasicAuth;
    }

    /**
     * <p>
     * Enables basic authorization for the autocreated branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableBasicAuth <p>
     *            Enables basic authorization for the autocreated branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoBranchCreationConfig withEnableBasicAuth(Boolean enableBasicAuth) {
        this.enableBasicAuth = enableBasicAuth;
        return this;
    }

    /**
     * <p>
     * The build specification (build spec) for the autocreated branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25000<br/>
     *
     * @return <p>
     *         The build specification (build spec) for the autocreated branch.
     *         </p>
     */
    public String getBuildSpec() {
        return buildSpec;
    }

    /**
     * <p>
     * The build specification (build spec) for the autocreated branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25000<br/>
     *
     * @param buildSpec <p>
     *            The build specification (build spec) for the autocreated
     *            branch.
     *            </p>
     */
    public void setBuildSpec(String buildSpec) {
        this.buildSpec = buildSpec;
    }

    /**
     * <p>
     * The build specification (build spec) for the autocreated branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25000<br/>
     *
     * @param buildSpec <p>
     *            The build specification (build spec) for the autocreated
     *            branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoBranchCreationConfig withBuildSpec(String buildSpec) {
        this.buildSpec = buildSpec;
        return this;
    }

    /**
     * <p>
     * Enables pull request preview for the autocreated branch.
     * </p>
     *
     * @return <p>
     *         Enables pull request preview for the autocreated branch.
     *         </p>
     */
    public Boolean isEnablePullRequestPreview() {
        return enablePullRequestPreview;
    }

    /**
     * <p>
     * Enables pull request preview for the autocreated branch.
     * </p>
     *
     * @return <p>
     *         Enables pull request preview for the autocreated branch.
     *         </p>
     */
    public Boolean getEnablePullRequestPreview() {
        return enablePullRequestPreview;
    }

    /**
     * <p>
     * Enables pull request preview for the autocreated branch.
     * </p>
     *
     * @param enablePullRequestPreview <p>
     *            Enables pull request preview for the autocreated branch.
     *            </p>
     */
    public void setEnablePullRequestPreview(Boolean enablePullRequestPreview) {
        this.enablePullRequestPreview = enablePullRequestPreview;
    }

    /**
     * <p>
     * Enables pull request preview for the autocreated branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enablePullRequestPreview <p>
     *            Enables pull request preview for the autocreated branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoBranchCreationConfig withEnablePullRequestPreview(Boolean enablePullRequestPreview) {
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
    public AutoBranchCreationConfig withPullRequestEnvironmentName(String pullRequestEnvironmentName) {
        this.pullRequestEnvironmentName = pullRequestEnvironmentName;
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
        if (getStage() != null)
            sb.append("stage: " + getStage() + ",");
        if (getFramework() != null)
            sb.append("framework: " + getFramework() + ",");
        if (getEnableAutoBuild() != null)
            sb.append("enableAutoBuild: " + getEnableAutoBuild() + ",");
        if (getEnvironmentVariables() != null)
            sb.append("environmentVariables: " + getEnvironmentVariables() + ",");
        if (getBasicAuthCredentials() != null)
            sb.append("basicAuthCredentials: " + getBasicAuthCredentials() + ",");
        if (getEnableBasicAuth() != null)
            sb.append("enableBasicAuth: " + getEnableBasicAuth() + ",");
        if (getBuildSpec() != null)
            sb.append("buildSpec: " + getBuildSpec() + ",");
        if (getEnablePullRequestPreview() != null)
            sb.append("enablePullRequestPreview: " + getEnablePullRequestPreview() + ",");
        if (getPullRequestEnvironmentName() != null)
            sb.append("pullRequestEnvironmentName: " + getPullRequestEnvironmentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        hashCode = prime * hashCode + ((getFramework() == null) ? 0 : getFramework().hashCode());
        hashCode = prime * hashCode
                + ((getEnableAutoBuild() == null) ? 0 : getEnableAutoBuild().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentVariables() == null) ? 0 : getEnvironmentVariables().hashCode());
        hashCode = prime * hashCode
                + ((getBasicAuthCredentials() == null) ? 0 : getBasicAuthCredentials().hashCode());
        hashCode = prime * hashCode
                + ((getEnableBasicAuth() == null) ? 0 : getEnableBasicAuth().hashCode());
        hashCode = prime * hashCode + ((getBuildSpec() == null) ? 0 : getBuildSpec().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnablePullRequestPreview() == null) ? 0 : getEnablePullRequestPreview()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPullRequestEnvironmentName() == null) ? 0 : getPullRequestEnvironmentName()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoBranchCreationConfig == false)
            return false;
        AutoBranchCreationConfig other = (AutoBranchCreationConfig) obj;

        if (other.getStage() == null ^ this.getStage() == null)
            return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false)
            return false;
        if (other.getFramework() == null ^ this.getFramework() == null)
            return false;
        if (other.getFramework() != null
                && other.getFramework().equals(this.getFramework()) == false)
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
        if (other.getBuildSpec() == null ^ this.getBuildSpec() == null)
            return false;
        if (other.getBuildSpec() != null
                && other.getBuildSpec().equals(this.getBuildSpec()) == false)
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
        return true;
    }
}
