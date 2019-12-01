/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns information about a fleet provisioning template version.
 * </p>
 */
public class DescribeProvisioningTemplateVersionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The template name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>^[0-9A-Za-z_-]+$<br/>
     */
    private String templateName;

    /**
     * <p>
     * The fleet provisioning template version ID.
     * </p>
     */
    private Integer versionId;

    /**
     * <p>
     * The template name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>^[0-9A-Za-z_-]+$<br/>
     *
     * @return <p>
     *         The template name.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The template name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>^[0-9A-Za-z_-]+$<br/>
     *
     * @param templateName <p>
     *            The template name.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The template name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>^[0-9A-Za-z_-]+$<br/>
     *
     * @param templateName <p>
     *            The template name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProvisioningTemplateVersionRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * The fleet provisioning template version ID.
     * </p>
     *
     * @return <p>
     *         The fleet provisioning template version ID.
     *         </p>
     */
    public Integer getVersionId() {
        return versionId;
    }

    /**
     * <p>
     * The fleet provisioning template version ID.
     * </p>
     *
     * @param versionId <p>
     *            The fleet provisioning template version ID.
     *            </p>
     */
    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The fleet provisioning template version ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionId <p>
     *            The fleet provisioning template version ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeProvisioningTemplateVersionRequest withVersionId(Integer versionId) {
        this.versionId = versionId;
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
        if (getTemplateName() != null)
            sb.append("templateName: " + getTemplateName() + ",");
        if (getVersionId() != null)
            sb.append("versionId: " + getVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProvisioningTemplateVersionRequest == false)
            return false;
        DescribeProvisioningTemplateVersionRequest other = (DescribeProvisioningTemplateVersionRequest) obj;

        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null
                && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        return true;
    }
}
