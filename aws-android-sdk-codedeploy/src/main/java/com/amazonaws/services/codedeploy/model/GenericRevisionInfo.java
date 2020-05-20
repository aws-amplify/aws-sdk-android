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
 * Information about an application revision.
 * </p>
 */
public class GenericRevisionInfo implements Serializable {
    /**
     * <p>
     * A comment about the revision.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The deployment groups for which this is the current target revision.
     * </p>
     */
    private java.util.List<String> deploymentGroups;

    /**
     * <p>
     * When the revision was first used by AWS CodeDeploy.
     * </p>
     */
    private java.util.Date firstUsedTime;

    /**
     * <p>
     * When the revision was last used by AWS CodeDeploy.
     * </p>
     */
    private java.util.Date lastUsedTime;

    /**
     * <p>
     * When the revision was registered with AWS CodeDeploy.
     * </p>
     */
    private java.util.Date registerTime;

    /**
     * <p>
     * A comment about the revision.
     * </p>
     *
     * @return <p>
     *         A comment about the revision.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A comment about the revision.
     * </p>
     *
     * @param description <p>
     *            A comment about the revision.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A comment about the revision.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A comment about the revision.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenericRevisionInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The deployment groups for which this is the current target revision.
     * </p>
     *
     * @return <p>
     *         The deployment groups for which this is the current target
     *         revision.
     *         </p>
     */
    public java.util.List<String> getDeploymentGroups() {
        return deploymentGroups;
    }

    /**
     * <p>
     * The deployment groups for which this is the current target revision.
     * </p>
     *
     * @param deploymentGroups <p>
     *            The deployment groups for which this is the current target
     *            revision.
     *            </p>
     */
    public void setDeploymentGroups(java.util.Collection<String> deploymentGroups) {
        if (deploymentGroups == null) {
            this.deploymentGroups = null;
            return;
        }

        this.deploymentGroups = new java.util.ArrayList<String>(deploymentGroups);
    }

    /**
     * <p>
     * The deployment groups for which this is the current target revision.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentGroups <p>
     *            The deployment groups for which this is the current target
     *            revision.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenericRevisionInfo withDeploymentGroups(String... deploymentGroups) {
        if (getDeploymentGroups() == null) {
            this.deploymentGroups = new java.util.ArrayList<String>(deploymentGroups.length);
        }
        for (String value : deploymentGroups) {
            this.deploymentGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The deployment groups for which this is the current target revision.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentGroups <p>
     *            The deployment groups for which this is the current target
     *            revision.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenericRevisionInfo withDeploymentGroups(java.util.Collection<String> deploymentGroups) {
        setDeploymentGroups(deploymentGroups);
        return this;
    }

    /**
     * <p>
     * When the revision was first used by AWS CodeDeploy.
     * </p>
     *
     * @return <p>
     *         When the revision was first used by AWS CodeDeploy.
     *         </p>
     */
    public java.util.Date getFirstUsedTime() {
        return firstUsedTime;
    }

    /**
     * <p>
     * When the revision was first used by AWS CodeDeploy.
     * </p>
     *
     * @param firstUsedTime <p>
     *            When the revision was first used by AWS CodeDeploy.
     *            </p>
     */
    public void setFirstUsedTime(java.util.Date firstUsedTime) {
        this.firstUsedTime = firstUsedTime;
    }

    /**
     * <p>
     * When the revision was first used by AWS CodeDeploy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param firstUsedTime <p>
     *            When the revision was first used by AWS CodeDeploy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenericRevisionInfo withFirstUsedTime(java.util.Date firstUsedTime) {
        this.firstUsedTime = firstUsedTime;
        return this;
    }

    /**
     * <p>
     * When the revision was last used by AWS CodeDeploy.
     * </p>
     *
     * @return <p>
     *         When the revision was last used by AWS CodeDeploy.
     *         </p>
     */
    public java.util.Date getLastUsedTime() {
        return lastUsedTime;
    }

    /**
     * <p>
     * When the revision was last used by AWS CodeDeploy.
     * </p>
     *
     * @param lastUsedTime <p>
     *            When the revision was last used by AWS CodeDeploy.
     *            </p>
     */
    public void setLastUsedTime(java.util.Date lastUsedTime) {
        this.lastUsedTime = lastUsedTime;
    }

    /**
     * <p>
     * When the revision was last used by AWS CodeDeploy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUsedTime <p>
     *            When the revision was last used by AWS CodeDeploy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenericRevisionInfo withLastUsedTime(java.util.Date lastUsedTime) {
        this.lastUsedTime = lastUsedTime;
        return this;
    }

    /**
     * <p>
     * When the revision was registered with AWS CodeDeploy.
     * </p>
     *
     * @return <p>
     *         When the revision was registered with AWS CodeDeploy.
     *         </p>
     */
    public java.util.Date getRegisterTime() {
        return registerTime;
    }

    /**
     * <p>
     * When the revision was registered with AWS CodeDeploy.
     * </p>
     *
     * @param registerTime <p>
     *            When the revision was registered with AWS CodeDeploy.
     *            </p>
     */
    public void setRegisterTime(java.util.Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * <p>
     * When the revision was registered with AWS CodeDeploy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registerTime <p>
     *            When the revision was registered with AWS CodeDeploy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GenericRevisionInfo withRegisterTime(java.util.Date registerTime) {
        this.registerTime = registerTime;
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
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getDeploymentGroups() != null)
            sb.append("deploymentGroups: " + getDeploymentGroups() + ",");
        if (getFirstUsedTime() != null)
            sb.append("firstUsedTime: " + getFirstUsedTime() + ",");
        if (getLastUsedTime() != null)
            sb.append("lastUsedTime: " + getLastUsedTime() + ",");
        if (getRegisterTime() != null)
            sb.append("registerTime: " + getRegisterTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentGroups() == null) ? 0 : getDeploymentGroups().hashCode());
        hashCode = prime * hashCode
                + ((getFirstUsedTime() == null) ? 0 : getFirstUsedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUsedTime() == null) ? 0 : getLastUsedTime().hashCode());
        hashCode = prime * hashCode
                + ((getRegisterTime() == null) ? 0 : getRegisterTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenericRevisionInfo == false)
            return false;
        GenericRevisionInfo other = (GenericRevisionInfo) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDeploymentGroups() == null ^ this.getDeploymentGroups() == null)
            return false;
        if (other.getDeploymentGroups() != null
                && other.getDeploymentGroups().equals(this.getDeploymentGroups()) == false)
            return false;
        if (other.getFirstUsedTime() == null ^ this.getFirstUsedTime() == null)
            return false;
        if (other.getFirstUsedTime() != null
                && other.getFirstUsedTime().equals(this.getFirstUsedTime()) == false)
            return false;
        if (other.getLastUsedTime() == null ^ this.getLastUsedTime() == null)
            return false;
        if (other.getLastUsedTime() != null
                && other.getLastUsedTime().equals(this.getLastUsedTime()) == false)
            return false;
        if (other.getRegisterTime() == null ^ this.getRegisterTime() == null)
            return false;
        if (other.getRegisterTime() != null
                && other.getRegisterTime().equals(this.getRegisterTime()) == false)
            return false;
        return true;
    }
}
