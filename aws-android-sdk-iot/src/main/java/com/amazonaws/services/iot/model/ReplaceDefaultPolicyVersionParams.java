/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Parameters to define a mitigation action that adds a blank policy to restrict
 * permissions.
 * </p>
 */
public class ReplaceDefaultPolicyVersionParams implements Serializable {
    /**
     * <p>
     * The name of the template to be applied. The only supported value is
     * <code>BLANK_POLICY</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLANK_POLICY
     */
    private String templateName;

    /**
     * <p>
     * The name of the template to be applied. The only supported value is
     * <code>BLANK_POLICY</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLANK_POLICY
     *
     * @return <p>
     *         The name of the template to be applied. The only supported value
     *         is <code>BLANK_POLICY</code>.
     *         </p>
     * @see PolicyTemplateName
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The name of the template to be applied. The only supported value is
     * <code>BLANK_POLICY</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLANK_POLICY
     *
     * @param templateName <p>
     *            The name of the template to be applied. The only supported
     *            value is <code>BLANK_POLICY</code>.
     *            </p>
     * @see PolicyTemplateName
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the template to be applied. The only supported value is
     * <code>BLANK_POLICY</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLANK_POLICY
     *
     * @param templateName <p>
     *            The name of the template to be applied. The only supported
     *            value is <code>BLANK_POLICY</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicyTemplateName
     */
    public ReplaceDefaultPolicyVersionParams withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * The name of the template to be applied. The only supported value is
     * <code>BLANK_POLICY</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLANK_POLICY
     *
     * @param templateName <p>
     *            The name of the template to be applied. The only supported
     *            value is <code>BLANK_POLICY</code>.
     *            </p>
     * @see PolicyTemplateName
     */
    public void setTemplateName(PolicyTemplateName templateName) {
        this.templateName = templateName.toString();
    }

    /**
     * <p>
     * The name of the template to be applied. The only supported value is
     * <code>BLANK_POLICY</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLANK_POLICY
     *
     * @param templateName <p>
     *            The name of the template to be applied. The only supported
     *            value is <code>BLANK_POLICY</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicyTemplateName
     */
    public ReplaceDefaultPolicyVersionParams withTemplateName(PolicyTemplateName templateName) {
        this.templateName = templateName.toString();
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
            sb.append("templateName: " + getTemplateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplaceDefaultPolicyVersionParams == false)
            return false;
        ReplaceDefaultPolicyVersionParams other = (ReplaceDefaultPolicyVersionParams) obj;

        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        return true;
    }
}
