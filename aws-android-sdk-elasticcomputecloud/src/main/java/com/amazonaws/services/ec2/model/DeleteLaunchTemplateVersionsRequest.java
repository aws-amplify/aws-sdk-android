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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes one or more versions of a launch template. You cannot delete the
 * default version of a launch template; you must first assign a different
 * version as the default. If the default version is the only version for the
 * launch template, you must delete the entire launch template using
 * <a>DeleteLaunchTemplate</a>.
 * </p>
 */
public class DeleteLaunchTemplateVersionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The ID of the launch template. You must specify either the launch
     * template ID or launch template name in the request.
     * </p>
     */
    private String launchTemplateId;

    /**
     * <p>
     * The name of the launch template. You must specify either the launch
     * template ID or launch template name in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\(\)\.\-/_]+<br/>
     */
    private String launchTemplateName;

    /**
     * <p>
     * The version numbers of one or more launch template versions to delete.
     * </p>
     */
    private java.util.List<String> versions;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLaunchTemplateVersionsRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The ID of the launch template. You must specify either the launch
     * template ID or launch template name in the request.
     * </p>
     *
     * @return <p>
     *         The ID of the launch template. You must specify either the launch
     *         template ID or launch template name in the request.
     *         </p>
     */
    public String getLaunchTemplateId() {
        return launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template. You must specify either the launch
     * template ID or launch template name in the request.
     * </p>
     *
     * @param launchTemplateId <p>
     *            The ID of the launch template. You must specify either the
     *            launch template ID or launch template name in the request.
     *            </p>
     */
    public void setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template. You must specify either the launch
     * template ID or launch template name in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplateId <p>
     *            The ID of the launch template. You must specify either the
     *            launch template ID or launch template name in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLaunchTemplateVersionsRequest withLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }

    /**
     * <p>
     * The name of the launch template. You must specify either the launch
     * template ID or launch template name in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\(\)\.\-/_]+<br/>
     *
     * @return <p>
     *         The name of the launch template. You must specify either the
     *         launch template ID or launch template name in the request.
     *         </p>
     */
    public String getLaunchTemplateName() {
        return launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template. You must specify either the launch
     * template ID or launch template name in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\(\)\.\-/_]+<br/>
     *
     * @param launchTemplateName <p>
     *            The name of the launch template. You must specify either the
     *            launch template ID or launch template name in the request.
     *            </p>
     */
    public void setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template. You must specify either the launch
     * template ID or launch template name in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\(\)\.\-/_]+<br/>
     *
     * @param launchTemplateName <p>
     *            The name of the launch template. You must specify either the
     *            launch template ID or launch template name in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLaunchTemplateVersionsRequest withLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }

    /**
     * <p>
     * The version numbers of one or more launch template versions to delete.
     * </p>
     *
     * @return <p>
     *         The version numbers of one or more launch template versions to
     *         delete.
     *         </p>
     */
    public java.util.List<String> getVersions() {
        return versions;
    }

    /**
     * <p>
     * The version numbers of one or more launch template versions to delete.
     * </p>
     *
     * @param versions <p>
     *            The version numbers of one or more launch template versions to
     *            delete.
     *            </p>
     */
    public void setVersions(java.util.Collection<String> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }

        this.versions = new java.util.ArrayList<String>(versions);
    }

    /**
     * <p>
     * The version numbers of one or more launch template versions to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versions <p>
     *            The version numbers of one or more launch template versions to
     *            delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLaunchTemplateVersionsRequest withVersions(String... versions) {
        if (getVersions() == null) {
            this.versions = new java.util.ArrayList<String>(versions.length);
        }
        for (String value : versions) {
            this.versions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The version numbers of one or more launch template versions to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versions <p>
     *            The version numbers of one or more launch template versions to
     *            delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLaunchTemplateVersionsRequest withVersions(java.util.Collection<String> versions) {
        setVersions(versions);
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getLaunchTemplateId() != null)
            sb.append("LaunchTemplateId: " + getLaunchTemplateId() + ",");
        if (getLaunchTemplateName() != null)
            sb.append("LaunchTemplateName: " + getLaunchTemplateName() + ",");
        if (getVersions() != null)
            sb.append("Versions: " + getVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchTemplateId() == null) ? 0 : getLaunchTemplateId().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchTemplateName() == null) ? 0 : getLaunchTemplateName().hashCode());
        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLaunchTemplateVersionsRequest == false)
            return false;
        DeleteLaunchTemplateVersionsRequest other = (DeleteLaunchTemplateVersionsRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
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
        if (other.getVersions() == null ^ this.getVersions() == null)
            return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false)
            return false;
        return true;
    }
}
