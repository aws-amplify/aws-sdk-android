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
 * Creates a new version for a launch template. You can specify an existing
 * version of launch template from which to base the new version.
 * </p>
 * <p>
 * Launch template versions are numbered in the order in which they are created.
 * You cannot specify, change, or replace the numbering of launch template
 * versions.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#manage-launch-template-versions"
 * >Managing launch template versions</a>in the <i>Amazon Elastic Compute Cloud
 * User Guide</i>.
 * </p>
 */
public class CreateLaunchTemplateVersionRequest extends AmazonWebServiceRequest implements
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
     * Unique, case-sensitive identifier you provide to ensure the idempotency
     * of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     * <p>
     * Constraint: Maximum 128 ASCII characters.
     * </p>
     */
    private String clientToken;

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
     * The version number of the launch template version on which to base the
     * new version. The new version inherits the same launch parameters as the
     * source version, except for parameters that you specify in
     * <code>LaunchTemplateData</code>. Snapshots applied to the block device
     * mapping are ignored when creating a new version unless they are
     * explicitly included.
     * </p>
     */
    private String sourceVersion;

    /**
     * <p>
     * A description for the version of the launch template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String versionDescription;

    /**
     * <p>
     * The information for the launch template.
     * </p>
     */
    private RequestLaunchTemplateData launchTemplateData;

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
    public CreateLaunchTemplateVersionRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency
     * of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     * <p>
     * Constraint: Maximum 128 ASCII characters.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *         >Ensuring Idempotency</a>.
     *         </p>
     *         <p>
     *         Constraint: Maximum 128 ASCII characters.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency
     * of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     * <p>
     * Constraint: Maximum 128 ASCII characters.
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier you provide to ensure the
     *            idempotency of the request. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >Ensuring Idempotency</a>.
     *            </p>
     *            <p>
     *            Constraint: Maximum 128 ASCII characters.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency
     * of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     * <p>
     * Constraint: Maximum 128 ASCII characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier you provide to ensure the
     *            idempotency of the request. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >Ensuring Idempotency</a>.
     *            </p>
     *            <p>
     *            Constraint: Maximum 128 ASCII characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLaunchTemplateVersionRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
    public CreateLaunchTemplateVersionRequest withLaunchTemplateId(String launchTemplateId) {
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
    public CreateLaunchTemplateVersionRequest withLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }

    /**
     * <p>
     * The version number of the launch template version on which to base the
     * new version. The new version inherits the same launch parameters as the
     * source version, except for parameters that you specify in
     * <code>LaunchTemplateData</code>. Snapshots applied to the block device
     * mapping are ignored when creating a new version unless they are
     * explicitly included.
     * </p>
     *
     * @return <p>
     *         The version number of the launch template version on which to
     *         base the new version. The new version inherits the same launch
     *         parameters as the source version, except for parameters that you
     *         specify in <code>LaunchTemplateData</code>. Snapshots applied to
     *         the block device mapping are ignored when creating a new version
     *         unless they are explicitly included.
     *         </p>
     */
    public String getSourceVersion() {
        return sourceVersion;
    }

    /**
     * <p>
     * The version number of the launch template version on which to base the
     * new version. The new version inherits the same launch parameters as the
     * source version, except for parameters that you specify in
     * <code>LaunchTemplateData</code>. Snapshots applied to the block device
     * mapping are ignored when creating a new version unless they are
     * explicitly included.
     * </p>
     *
     * @param sourceVersion <p>
     *            The version number of the launch template version on which to
     *            base the new version. The new version inherits the same launch
     *            parameters as the source version, except for parameters that
     *            you specify in <code>LaunchTemplateData</code>. Snapshots
     *            applied to the block device mapping are ignored when creating
     *            a new version unless they are explicitly included.
     *            </p>
     */
    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    /**
     * <p>
     * The version number of the launch template version on which to base the
     * new version. The new version inherits the same launch parameters as the
     * source version, except for parameters that you specify in
     * <code>LaunchTemplateData</code>. Snapshots applied to the block device
     * mapping are ignored when creating a new version unless they are
     * explicitly included.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceVersion <p>
     *            The version number of the launch template version on which to
     *            base the new version. The new version inherits the same launch
     *            parameters as the source version, except for parameters that
     *            you specify in <code>LaunchTemplateData</code>. Snapshots
     *            applied to the block device mapping are ignored when creating
     *            a new version unless they are explicitly included.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLaunchTemplateVersionRequest withSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
        return this;
    }

    /**
     * <p>
     * A description for the version of the launch template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         A description for the version of the launch template.
     *         </p>
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    /**
     * <p>
     * A description for the version of the launch template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param versionDescription <p>
     *            A description for the version of the launch template.
     *            </p>
     */
    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    /**
     * <p>
     * A description for the version of the launch template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param versionDescription <p>
     *            A description for the version of the launch template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLaunchTemplateVersionRequest withVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }

    /**
     * <p>
     * The information for the launch template.
     * </p>
     *
     * @return <p>
     *         The information for the launch template.
     *         </p>
     */
    public RequestLaunchTemplateData getLaunchTemplateData() {
        return launchTemplateData;
    }

    /**
     * <p>
     * The information for the launch template.
     * </p>
     *
     * @param launchTemplateData <p>
     *            The information for the launch template.
     *            </p>
     */
    public void setLaunchTemplateData(RequestLaunchTemplateData launchTemplateData) {
        this.launchTemplateData = launchTemplateData;
    }

    /**
     * <p>
     * The information for the launch template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplateData <p>
     *            The information for the launch template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLaunchTemplateVersionRequest withLaunchTemplateData(
            RequestLaunchTemplateData launchTemplateData) {
        this.launchTemplateData = launchTemplateData;
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
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getLaunchTemplateId() != null)
            sb.append("LaunchTemplateId: " + getLaunchTemplateId() + ",");
        if (getLaunchTemplateName() != null)
            sb.append("LaunchTemplateName: " + getLaunchTemplateName() + ",");
        if (getSourceVersion() != null)
            sb.append("SourceVersion: " + getSourceVersion() + ",");
        if (getVersionDescription() != null)
            sb.append("VersionDescription: " + getVersionDescription() + ",");
        if (getLaunchTemplateData() != null)
            sb.append("LaunchTemplateData: " + getLaunchTemplateData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchTemplateId() == null) ? 0 : getLaunchTemplateId().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchTemplateName() == null) ? 0 : getLaunchTemplateName().hashCode());
        hashCode = prime * hashCode
                + ((getSourceVersion() == null) ? 0 : getSourceVersion().hashCode());
        hashCode = prime * hashCode
                + ((getVersionDescription() == null) ? 0 : getVersionDescription().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchTemplateData() == null) ? 0 : getLaunchTemplateData().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLaunchTemplateVersionRequest == false)
            return false;
        CreateLaunchTemplateVersionRequest other = (CreateLaunchTemplateVersionRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
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
        if (other.getSourceVersion() == null ^ this.getSourceVersion() == null)
            return false;
        if (other.getSourceVersion() != null
                && other.getSourceVersion().equals(this.getSourceVersion()) == false)
            return false;
        if (other.getVersionDescription() == null ^ this.getVersionDescription() == null)
            return false;
        if (other.getVersionDescription() != null
                && other.getVersionDescription().equals(this.getVersionDescription()) == false)
            return false;
        if (other.getLaunchTemplateData() == null ^ this.getLaunchTemplateData() == null)
            return false;
        if (other.getLaunchTemplateData() != null
                && other.getLaunchTemplateData().equals(this.getLaunchTemplateData()) == false)
            return false;
        return true;
    }
}
