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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an application.
 * </p>
 */
public class ApplicationInfo implements Serializable {
    /**
     * <p>
     * The application ID.
     * </p>
     */
    private String applicationId;

    /**
     * <p>
     * The application name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * The time at which the application was created.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * True if the user has authenticated with GitHub for the specified
     * application. Otherwise, false.
     * </p>
     */
    private Boolean linkedToGitHub;

    /**
     * <p>
     * The name for a connection to a GitHub account.
     * </p>
     */
    private String gitHubAccountName;

    /**
     * <p>
     * The destination platform type for deployment of the application (
     * <code>Lambda</code> or <code>Server</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Server, Lambda, ECS
     */
    private String computePlatform;

    /**
     * <p>
     * The application ID.
     * </p>
     *
     * @return <p>
     *         The application ID.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     *
     * @param applicationId <p>
     *            The application ID.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId <p>
     *            The application ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationInfo withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * The application name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The application name.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The application name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The application name.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The application name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The application name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationInfo withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * The time at which the application was created.
     * </p>
     *
     * @return <p>
     *         The time at which the application was created.
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The time at which the application was created.
     * </p>
     *
     * @param createTime <p>
     *            The time at which the application was created.
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time at which the application was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            The time at which the application was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationInfo withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * True if the user has authenticated with GitHub for the specified
     * application. Otherwise, false.
     * </p>
     *
     * @return <p>
     *         True if the user has authenticated with GitHub for the specified
     *         application. Otherwise, false.
     *         </p>
     */
    public Boolean isLinkedToGitHub() {
        return linkedToGitHub;
    }

    /**
     * <p>
     * True if the user has authenticated with GitHub for the specified
     * application. Otherwise, false.
     * </p>
     *
     * @return <p>
     *         True if the user has authenticated with GitHub for the specified
     *         application. Otherwise, false.
     *         </p>
     */
    public Boolean getLinkedToGitHub() {
        return linkedToGitHub;
    }

    /**
     * <p>
     * True if the user has authenticated with GitHub for the specified
     * application. Otherwise, false.
     * </p>
     *
     * @param linkedToGitHub <p>
     *            True if the user has authenticated with GitHub for the
     *            specified application. Otherwise, false.
     *            </p>
     */
    public void setLinkedToGitHub(Boolean linkedToGitHub) {
        this.linkedToGitHub = linkedToGitHub;
    }

    /**
     * <p>
     * True if the user has authenticated with GitHub for the specified
     * application. Otherwise, false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param linkedToGitHub <p>
     *            True if the user has authenticated with GitHub for the
     *            specified application. Otherwise, false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationInfo withLinkedToGitHub(Boolean linkedToGitHub) {
        this.linkedToGitHub = linkedToGitHub;
        return this;
    }

    /**
     * <p>
     * The name for a connection to a GitHub account.
     * </p>
     *
     * @return <p>
     *         The name for a connection to a GitHub account.
     *         </p>
     */
    public String getGitHubAccountName() {
        return gitHubAccountName;
    }

    /**
     * <p>
     * The name for a connection to a GitHub account.
     * </p>
     *
     * @param gitHubAccountName <p>
     *            The name for a connection to a GitHub account.
     *            </p>
     */
    public void setGitHubAccountName(String gitHubAccountName) {
        this.gitHubAccountName = gitHubAccountName;
    }

    /**
     * <p>
     * The name for a connection to a GitHub account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gitHubAccountName <p>
     *            The name for a connection to a GitHub account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationInfo withGitHubAccountName(String gitHubAccountName) {
        this.gitHubAccountName = gitHubAccountName;
        return this;
    }

    /**
     * <p>
     * The destination platform type for deployment of the application (
     * <code>Lambda</code> or <code>Server</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Server, Lambda, ECS
     *
     * @return <p>
     *         The destination platform type for deployment of the application (
     *         <code>Lambda</code> or <code>Server</code>).
     *         </p>
     * @see ComputePlatform
     */
    public String getComputePlatform() {
        return computePlatform;
    }

    /**
     * <p>
     * The destination platform type for deployment of the application (
     * <code>Lambda</code> or <code>Server</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Server, Lambda, ECS
     *
     * @param computePlatform <p>
     *            The destination platform type for deployment of the
     *            application (<code>Lambda</code> or <code>Server</code>).
     *            </p>
     * @see ComputePlatform
     */
    public void setComputePlatform(String computePlatform) {
        this.computePlatform = computePlatform;
    }

    /**
     * <p>
     * The destination platform type for deployment of the application (
     * <code>Lambda</code> or <code>Server</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Server, Lambda, ECS
     *
     * @param computePlatform <p>
     *            The destination platform type for deployment of the
     *            application (<code>Lambda</code> or <code>Server</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComputePlatform
     */
    public ApplicationInfo withComputePlatform(String computePlatform) {
        this.computePlatform = computePlatform;
        return this;
    }

    /**
     * <p>
     * The destination platform type for deployment of the application (
     * <code>Lambda</code> or <code>Server</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Server, Lambda, ECS
     *
     * @param computePlatform <p>
     *            The destination platform type for deployment of the
     *            application (<code>Lambda</code> or <code>Server</code>).
     *            </p>
     * @see ComputePlatform
     */
    public void setComputePlatform(ComputePlatform computePlatform) {
        this.computePlatform = computePlatform.toString();
    }

    /**
     * <p>
     * The destination platform type for deployment of the application (
     * <code>Lambda</code> or <code>Server</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Server, Lambda, ECS
     *
     * @param computePlatform <p>
     *            The destination platform type for deployment of the
     *            application (<code>Lambda</code> or <code>Server</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComputePlatform
     */
    public ApplicationInfo withComputePlatform(ComputePlatform computePlatform) {
        this.computePlatform = computePlatform.toString();
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
        if (getApplicationId() != null)
            sb.append("applicationId: " + getApplicationId() + ",");
        if (getApplicationName() != null)
            sb.append("applicationName: " + getApplicationName() + ",");
        if (getCreateTime() != null)
            sb.append("createTime: " + getCreateTime() + ",");
        if (getLinkedToGitHub() != null)
            sb.append("linkedToGitHub: " + getLinkedToGitHub() + ",");
        if (getGitHubAccountName() != null)
            sb.append("gitHubAccountName: " + getGitHubAccountName() + ",");
        if (getComputePlatform() != null)
            sb.append("computePlatform: " + getComputePlatform());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode
                + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode
                + ((getLinkedToGitHub() == null) ? 0 : getLinkedToGitHub().hashCode());
        hashCode = prime * hashCode
                + ((getGitHubAccountName() == null) ? 0 : getGitHubAccountName().hashCode());
        hashCode = prime * hashCode
                + ((getComputePlatform() == null) ? 0 : getComputePlatform().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationInfo == false)
            return false;
        ApplicationInfo other = (ApplicationInfo) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getLinkedToGitHub() == null ^ this.getLinkedToGitHub() == null)
            return false;
        if (other.getLinkedToGitHub() != null
                && other.getLinkedToGitHub().equals(this.getLinkedToGitHub()) == false)
            return false;
        if (other.getGitHubAccountName() == null ^ this.getGitHubAccountName() == null)
            return false;
        if (other.getGitHubAccountName() != null
                && other.getGitHubAccountName().equals(this.getGitHubAccountName()) == false)
            return false;
        if (other.getComputePlatform() == null ^ this.getComputePlatform() == null)
            return false;
        if (other.getComputePlatform() != null
                && other.getComputePlatform().equals(this.getComputePlatform()) == false)
            return false;
        return true;
    }
}
