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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * The template version.
 * </p>
 */
public class TemplateVersionSummary implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template version.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The version number of the template version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long versionNumber;

    /**
     * <p>
     * The time that this template version was created.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The status of the template version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, CREATION_SUCCESSFUL,
     * CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED
     */
    private String status;

    /**
     * <p>
     * The description of the template version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String description;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template version.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the template version.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template version.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the template version.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the template version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateVersionSummary withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The version number of the template version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The version number of the template version.
     *         </p>
     */
    public Long getVersionNumber() {
        return versionNumber;
    }

    /**
     * <p>
     * The version number of the template version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param versionNumber <p>
     *            The version number of the template version.
     *            </p>
     */
    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The version number of the template version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param versionNumber <p>
     *            The version number of the template version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateVersionSummary withVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
        return this;
    }

    /**
     * <p>
     * The time that this template version was created.
     * </p>
     *
     * @return <p>
     *         The time that this template version was created.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The time that this template version was created.
     * </p>
     *
     * @param createdTime <p>
     *            The time that this template version was created.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time that this template version was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The time that this template version was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateVersionSummary withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * The status of the template version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, CREATION_SUCCESSFUL,
     * CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED
     *
     * @return <p>
     *         The status of the template version.
     *         </p>
     * @see ResourceStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the template version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, CREATION_SUCCESSFUL,
     * CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED
     *
     * @param status <p>
     *            The status of the template version.
     *            </p>
     * @see ResourceStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the template version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, CREATION_SUCCESSFUL,
     * CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED
     *
     * @param status <p>
     *            The status of the template version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceStatus
     */
    public TemplateVersionSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the template version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, CREATION_SUCCESSFUL,
     * CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED
     *
     * @param status <p>
     *            The status of the template version.
     *            </p>
     * @see ResourceStatus
     */
    public void setStatus(ResourceStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the template version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, CREATION_SUCCESSFUL,
     * CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED
     *
     * @param status <p>
     *            The status of the template version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceStatus
     */
    public TemplateVersionSummary withStatus(ResourceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The description of the template version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return <p>
     *         The description of the template version.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the template version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param description <p>
     *            The description of the template version.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the template version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param description <p>
     *            The description of the template version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateVersionSummary withDescription(String description) {
        this.description = description;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: " + getVersionNumber() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateVersionSummary == false)
            return false;
        TemplateVersionSummary other = (TemplateVersionSummary) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null
                && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
