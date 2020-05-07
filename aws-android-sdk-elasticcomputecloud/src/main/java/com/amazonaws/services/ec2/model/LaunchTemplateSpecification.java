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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * The launch template to use. You must specify either the launch template ID or
 * launch template name in the request, but not both.
 * </p>
 */
public class LaunchTemplateSpecification implements Serializable {
    /**
     * <p>
     * The ID of the launch template.
     * </p>
     */
    private String launchTemplateId;

    /**
     * <p>
     * The name of the launch template.
     * </p>
     */
    private String launchTemplateName;

    /**
     * <p>
     * The version number of the launch template.
     * </p>
     * <p>
     * Default: The default version for the launch template.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The ID of the launch template.
     * </p>
     *
     * @return <p>
     *         The ID of the launch template.
     *         </p>
     */
    public String getLaunchTemplateId() {
        return launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template.
     * </p>
     *
     * @param launchTemplateId <p>
     *            The ID of the launch template.
     *            </p>
     */
    public void setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplateId <p>
     *            The ID of the launch template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateSpecification withLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }

    /**
     * <p>
     * The name of the launch template.
     * </p>
     *
     * @return <p>
     *         The name of the launch template.
     *         </p>
     */
    public String getLaunchTemplateName() {
        return launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template.
     * </p>
     *
     * @param launchTemplateName <p>
     *            The name of the launch template.
     *            </p>
     */
    public void setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplateName <p>
     *            The name of the launch template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateSpecification withLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }

    /**
     * <p>
     * The version number of the launch template.
     * </p>
     * <p>
     * Default: The default version for the launch template.
     * </p>
     *
     * @return <p>
     *         The version number of the launch template.
     *         </p>
     *         <p>
     *         Default: The default version for the launch template.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The version number of the launch template.
     * </p>
     * <p>
     * Default: The default version for the launch template.
     * </p>
     *
     * @param version <p>
     *            The version number of the launch template.
     *            </p>
     *            <p>
     *            Default: The default version for the launch template.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number of the launch template.
     * </p>
     * <p>
     * Default: The default version for the launch template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The version number of the launch template.
     *            </p>
     *            <p>
     *            Default: The default version for the launch template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateSpecification withVersion(String version) {
        this.version = version;
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
        if (getLaunchTemplateId() != null)
            sb.append("LaunchTemplateId: " + getLaunchTemplateId() + ",");
        if (getLaunchTemplateName() != null)
            sb.append("LaunchTemplateName: " + getLaunchTemplateName() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLaunchTemplateId() == null) ? 0 : getLaunchTemplateId().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchTemplateName() == null) ? 0 : getLaunchTemplateName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchTemplateSpecification == false)
            return false;
        LaunchTemplateSpecification other = (LaunchTemplateSpecification) obj;

        if (other.getLaunchTemplateId() == null ^ this.getLaunchTemplateId() == null)
            return false;
        if (other.getLaunchTemplateId() != null
                && other.getLaunchTemplateId().equals(this.getLaunchTemplateId()) == false)
            return false;
        if (other.getLaunchTemplateName() == null ^ this.getLaunchTemplateName() == null)
            return false;
        if (other.getLaunchTemplateName() != null
                && other.getLaunchTemplateName().equals(this.getLaunchTemplateName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }
}
