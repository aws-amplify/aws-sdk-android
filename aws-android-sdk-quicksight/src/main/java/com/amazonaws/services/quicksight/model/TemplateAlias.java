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
 * The template alias.
 * </p>
 */
public class TemplateAlias implements Serializable {
    /**
     * <p>
     * The display name of the template alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+|(\$LATEST)|(\$PUBLISHED)<br/>
     */
    private String aliasName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template alias.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The version number of the template alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long templateVersionNumber;

    /**
     * <p>
     * The display name of the template alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+|(\$LATEST)|(\$PUBLISHED)<br/>
     *
     * @return <p>
     *         The display name of the template alias.
     *         </p>
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * <p>
     * The display name of the template alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+|(\$LATEST)|(\$PUBLISHED)<br/>
     *
     * @param aliasName <p>
     *            The display name of the template alias.
     *            </p>
     */
    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * The display name of the template alias.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+|(\$LATEST)|(\$PUBLISHED)<br/>
     *
     * @param aliasName <p>
     *            The display name of the template alias.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateAlias withAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template alias.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the template alias.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template alias.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the template alias.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template alias.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the template alias.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateAlias withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The version number of the template alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The version number of the template alias.
     *         </p>
     */
    public Long getTemplateVersionNumber() {
        return templateVersionNumber;
    }

    /**
     * <p>
     * The version number of the template alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param templateVersionNumber <p>
     *            The version number of the template alias.
     *            </p>
     */
    public void setTemplateVersionNumber(Long templateVersionNumber) {
        this.templateVersionNumber = templateVersionNumber;
    }

    /**
     * <p>
     * The version number of the template alias.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param templateVersionNumber <p>
     *            The version number of the template alias.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateAlias withTemplateVersionNumber(Long templateVersionNumber) {
        this.templateVersionNumber = templateVersionNumber;
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
        if (getAliasName() != null)
            sb.append("AliasName: " + getAliasName() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getTemplateVersionNumber() != null)
            sb.append("TemplateVersionNumber: " + getTemplateVersionNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAliasName() == null) ? 0 : getAliasName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getTemplateVersionNumber() == null) ? 0 : getTemplateVersionNumber().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateAlias == false)
            return false;
        TemplateAlias other = (TemplateAlias) obj;

        if (other.getAliasName() == null ^ this.getAliasName() == null)
            return false;
        if (other.getAliasName() != null
                && other.getAliasName().equals(this.getAliasName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getTemplateVersionNumber() == null ^ this.getTemplateVersionNumber() == null)
            return false;
        if (other.getTemplateVersionNumber() != null
                && other.getTemplateVersionNumber().equals(this.getTemplateVersionNumber()) == false)
            return false;
        return true;
    }
}
