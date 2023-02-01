/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * View details of a managed job template.
 * </p>
 */
public class DescribeManagedJobTemplateRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The unique name of a managed job template, which is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String templateName;

    /**
     * <p>
     * An optional parameter to specify version of a managed template. If not
     * specified, the pre-defined default version is returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[1-9]+.[0-9]+<br/>
     */
    private String templateVersion;

    /**
     * <p>
     * The unique name of a managed job template, which is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The unique name of a managed job template, which is required.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The unique name of a managed job template, which is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param templateName <p>
     *            The unique name of a managed job template, which is required.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The unique name of a managed job template, which is required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param templateName <p>
     *            The unique name of a managed job template, which is required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeManagedJobTemplateRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * An optional parameter to specify version of a managed template. If not
     * specified, the pre-defined default version is returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[1-9]+.[0-9]+<br/>
     *
     * @return <p>
     *         An optional parameter to specify version of a managed template.
     *         If not specified, the pre-defined default version is returned.
     *         </p>
     */
    public String getTemplateVersion() {
        return templateVersion;
    }

    /**
     * <p>
     * An optional parameter to specify version of a managed template. If not
     * specified, the pre-defined default version is returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[1-9]+.[0-9]+<br/>
     *
     * @param templateVersion <p>
     *            An optional parameter to specify version of a managed
     *            template. If not specified, the pre-defined default version is
     *            returned.
     *            </p>
     */
    public void setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
    }

    /**
     * <p>
     * An optional parameter to specify version of a managed template. If not
     * specified, the pre-defined default version is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[1-9]+.[0-9]+<br/>
     *
     * @param templateVersion <p>
     *            An optional parameter to specify version of a managed
     *            template. If not specified, the pre-defined default version is
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeManagedJobTemplateRequest withTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
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
        if (getTemplateVersion() != null)
            sb.append("templateVersion: " + getTemplateVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateVersion() == null) ? 0 : getTemplateVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeManagedJobTemplateRequest == false)
            return false;
        DescribeManagedJobTemplateRequest other = (DescribeManagedJobTemplateRequest) obj;

        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateVersion() == null ^ this.getTemplateVersion() == null)
            return false;
        if (other.getTemplateVersion() != null
                && other.getTemplateVersion().equals(this.getTemplateVersion()) == false)
            return false;
        return true;
    }
}
