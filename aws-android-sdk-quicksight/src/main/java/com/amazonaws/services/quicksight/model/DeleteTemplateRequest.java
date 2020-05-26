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
 * Deletes a template.
 * </p>
 */
public class DeleteTemplateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the AWS account that contains the template that you're
     * deleting.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String awsAccountId;

    /**
     * <p>
     * An ID for the template you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     */
    private String templateId;

    /**
     * <p>
     * Specifies the version of the template that you want to delete. If you
     * don't provide a version number, <code>DeleteTemplate</code> deletes all
     * versions of the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long versionNumber;

    /**
     * <p>
     * The ID of the AWS account that contains the template that you're
     * deleting.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         The ID of the AWS account that contains the template that you're
     *         deleting.
     *         </p>
     */
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the template that you're
     * deleting.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The ID of the AWS account that contains the template that
     *            you're deleting.
     *            </p>
     */
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the template that you're
     * deleting.
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
     *            The ID of the AWS account that contains the template that
     *            you're deleting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteTemplateRequest withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * <p>
     * An ID for the template you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @return <p>
     *         An ID for the template you want to delete.
     *         </p>
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * <p>
     * An ID for the template you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @param templateId <p>
     *            An ID for the template you want to delete.
     *            </p>
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * An ID for the template you want to delete.
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
     *            An ID for the template you want to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteTemplateRequest withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * <p>
     * Specifies the version of the template that you want to delete. If you
     * don't provide a version number, <code>DeleteTemplate</code> deletes all
     * versions of the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         Specifies the version of the template that you want to delete. If
     *         you don't provide a version number, <code>DeleteTemplate</code>
     *         deletes all versions of the template.
     *         </p>
     */
    public Long getVersionNumber() {
        return versionNumber;
    }

    /**
     * <p>
     * Specifies the version of the template that you want to delete. If you
     * don't provide a version number, <code>DeleteTemplate</code> deletes all
     * versions of the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param versionNumber <p>
     *            Specifies the version of the template that you want to delete.
     *            If you don't provide a version number,
     *            <code>DeleteTemplate</code> deletes all versions of the
     *            template.
     *            </p>
     */
    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * Specifies the version of the template that you want to delete. If you
     * don't provide a version number, <code>DeleteTemplate</code> deletes all
     * versions of the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param versionNumber <p>
     *            Specifies the version of the template that you want to delete.
     *            If you don't provide a version number,
     *            <code>DeleteTemplate</code> deletes all versions of the
     *            template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteTemplateRequest withVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
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
        if (getVersionNumber() != null)
            sb.append("VersionNumber: " + getVersionNumber());
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
                + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTemplateRequest == false)
            return false;
        DeleteTemplateRequest other = (DeleteTemplateRequest) obj;

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
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null
                && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        return true;
    }
}
