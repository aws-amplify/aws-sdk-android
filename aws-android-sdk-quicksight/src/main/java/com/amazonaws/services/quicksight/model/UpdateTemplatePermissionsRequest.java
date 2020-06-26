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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the resource permissions for a template.
 * </p>
 */
public class UpdateTemplatePermissionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the AWS account that contains the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String awsAccountId;

    /**
     * <p>
     * The ID for the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     */
    private String templateId;

    /**
     * <p>
     * A list of resource permissions to be granted on the template.
     * </p>
     */
    private java.util.List<ResourcePermission> grantPermissions;

    /**
     * <p>
     * A list of resource permissions to be revoked from the template.
     * </p>
     */
    private java.util.List<ResourcePermission> revokePermissions;

    /**
     * <p>
     * The ID of the AWS account that contains the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         The ID of the AWS account that contains the template.
     *         </p>
     */
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The ID of the AWS account that contains the template.
     *            </p>
     */
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The ID of the AWS account that contains the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTemplatePermissionsRequest withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * <p>
     * The ID for the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @return <p>
     *         The ID for the template.
     *         </p>
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * <p>
     * The ID for the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @param templateId <p>
     *            The ID for the template.
     *            </p>
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * The ID for the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @param templateId <p>
     *            The ID for the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTemplatePermissionsRequest withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * <p>
     * A list of resource permissions to be granted on the template.
     * </p>
     *
     * @return <p>
     *         A list of resource permissions to be granted on the template.
     *         </p>
     */
    public java.util.List<ResourcePermission> getGrantPermissions() {
        return grantPermissions;
    }

    /**
     * <p>
     * A list of resource permissions to be granted on the template.
     * </p>
     *
     * @param grantPermissions <p>
     *            A list of resource permissions to be granted on the template.
     *            </p>
     */
    public void setGrantPermissions(java.util.Collection<ResourcePermission> grantPermissions) {
        if (grantPermissions == null) {
            this.grantPermissions = null;
            return;
        }

        this.grantPermissions = new java.util.ArrayList<ResourcePermission>(grantPermissions);
    }

    /**
     * <p>
     * A list of resource permissions to be granted on the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantPermissions <p>
     *            A list of resource permissions to be granted on the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTemplatePermissionsRequest withGrantPermissions(
            ResourcePermission... grantPermissions) {
        if (getGrantPermissions() == null) {
            this.grantPermissions = new java.util.ArrayList<ResourcePermission>(
                    grantPermissions.length);
        }
        for (ResourcePermission value : grantPermissions) {
            this.grantPermissions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of resource permissions to be granted on the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantPermissions <p>
     *            A list of resource permissions to be granted on the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTemplatePermissionsRequest withGrantPermissions(
            java.util.Collection<ResourcePermission> grantPermissions) {
        setGrantPermissions(grantPermissions);
        return this;
    }

    /**
     * <p>
     * A list of resource permissions to be revoked from the template.
     * </p>
     *
     * @return <p>
     *         A list of resource permissions to be revoked from the template.
     *         </p>
     */
    public java.util.List<ResourcePermission> getRevokePermissions() {
        return revokePermissions;
    }

    /**
     * <p>
     * A list of resource permissions to be revoked from the template.
     * </p>
     *
     * @param revokePermissions <p>
     *            A list of resource permissions to be revoked from the
     *            template.
     *            </p>
     */
    public void setRevokePermissions(java.util.Collection<ResourcePermission> revokePermissions) {
        if (revokePermissions == null) {
            this.revokePermissions = null;
            return;
        }

        this.revokePermissions = new java.util.ArrayList<ResourcePermission>(revokePermissions);
    }

    /**
     * <p>
     * A list of resource permissions to be revoked from the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revokePermissions <p>
     *            A list of resource permissions to be revoked from the
     *            template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTemplatePermissionsRequest withRevokePermissions(
            ResourcePermission... revokePermissions) {
        if (getRevokePermissions() == null) {
            this.revokePermissions = new java.util.ArrayList<ResourcePermission>(
                    revokePermissions.length);
        }
        for (ResourcePermission value : revokePermissions) {
            this.revokePermissions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of resource permissions to be revoked from the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revokePermissions <p>
     *            A list of resource permissions to be revoked from the
     *            template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTemplatePermissionsRequest withRevokePermissions(
            java.util.Collection<ResourcePermission> revokePermissions) {
        setRevokePermissions(revokePermissions);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: " + getAwsAccountId() + ",");
        if (getTemplateId() != null)
            sb.append("TemplateId: " + getTemplateId() + ",");
        if (getGrantPermissions() != null)
            sb.append("GrantPermissions: " + getGrantPermissions() + ",");
        if (getRevokePermissions() != null)
            sb.append("RevokePermissions: " + getRevokePermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        hashCode = prime * hashCode
                + ((getGrantPermissions() == null) ? 0 : getGrantPermissions().hashCode());
        hashCode = prime * hashCode
                + ((getRevokePermissions() == null) ? 0 : getRevokePermissions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTemplatePermissionsRequest == false)
            return false;
        UpdateTemplatePermissionsRequest other = (UpdateTemplatePermissionsRequest) obj;

        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null
                && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null
                && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        if (other.getGrantPermissions() == null ^ this.getGrantPermissions() == null)
            return false;
        if (other.getGrantPermissions() != null
                && other.getGrantPermissions().equals(this.getGrantPermissions()) == false)
            return false;
        if (other.getRevokePermissions() == null ^ this.getRevokePermissions() == null)
            return false;
        if (other.getRevokePermissions() != null
                && other.getRevokePermissions().equals(this.getRevokePermissions()) == false)
            return false;
        return true;
    }
}
