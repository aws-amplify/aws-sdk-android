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
 * Describes the template alias for a template.
 * </p>
 */
public class DescribeTemplateAliasRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the AWS account that contains the template alias that you're
     * describing.
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
     * The name of the template alias that you want to describe. If you name a
     * specific alias, you describe the version that the alias points to. You
     * can specify the latest version of the template by providing the keyword
     * <code>$LATEST</code> in the <code>AliasName</code> parameter. The keyword
     * <code>$PUBLISHED</code> doesn't apply to templates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+|(\$LATEST)|(\$PUBLISHED)<br/>
     */
    private String aliasName;

    /**
     * <p>
     * The ID of the AWS account that contains the template alias that you're
     * describing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         The ID of the AWS account that contains the template alias that
     *         you're describing.
     *         </p>
     */
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the template alias that you're
     * describing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The ID of the AWS account that contains the template alias
     *            that you're describing.
     *            </p>
     */
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the template alias that you're
     * describing.
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
     *            The ID of the AWS account that contains the template alias
     *            that you're describing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTemplateAliasRequest withAwsAccountId(String awsAccountId) {
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
    public DescribeTemplateAliasRequest withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * <p>
     * The name of the template alias that you want to describe. If you name a
     * specific alias, you describe the version that the alias points to. You
     * can specify the latest version of the template by providing the keyword
     * <code>$LATEST</code> in the <code>AliasName</code> parameter. The keyword
     * <code>$PUBLISHED</code> doesn't apply to templates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+|(\$LATEST)|(\$PUBLISHED)<br/>
     *
     * @return <p>
     *         The name of the template alias that you want to describe. If you
     *         name a specific alias, you describe the version that the alias
     *         points to. You can specify the latest version of the template by
     *         providing the keyword <code>$LATEST</code> in the
     *         <code>AliasName</code> parameter. The keyword
     *         <code>$PUBLISHED</code> doesn't apply to templates.
     *         </p>
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * <p>
     * The name of the template alias that you want to describe. If you name a
     * specific alias, you describe the version that the alias points to. You
     * can specify the latest version of the template by providing the keyword
     * <code>$LATEST</code> in the <code>AliasName</code> parameter. The keyword
     * <code>$PUBLISHED</code> doesn't apply to templates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+|(\$LATEST)|(\$PUBLISHED)<br/>
     *
     * @param aliasName <p>
     *            The name of the template alias that you want to describe. If
     *            you name a specific alias, you describe the version that the
     *            alias points to. You can specify the latest version of the
     *            template by providing the keyword <code>$LATEST</code> in the
     *            <code>AliasName</code> parameter. The keyword
     *            <code>$PUBLISHED</code> doesn't apply to templates.
     *            </p>
     */
    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * The name of the template alias that you want to describe. If you name a
     * specific alias, you describe the version that the alias points to. You
     * can specify the latest version of the template by providing the keyword
     * <code>$LATEST</code> in the <code>AliasName</code> parameter. The keyword
     * <code>$PUBLISHED</code> doesn't apply to templates.
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
     *            The name of the template alias that you want to describe. If
     *            you name a specific alias, you describe the version that the
     *            alias points to. You can specify the latest version of the
     *            template by providing the keyword <code>$LATEST</code> in the
     *            <code>AliasName</code> parameter. The keyword
     *            <code>$PUBLISHED</code> doesn't apply to templates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTemplateAliasRequest withAliasName(String aliasName) {
        this.aliasName = aliasName;
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
        if (getAliasName() != null)
            sb.append("AliasName: " + getAliasName());
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
        hashCode = prime * hashCode + ((getAliasName() == null) ? 0 : getAliasName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTemplateAliasRequest == false)
            return false;
        DescribeTemplateAliasRequest other = (DescribeTemplateAliasRequest) obj;

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
        if (other.getAliasName() == null ^ this.getAliasName() == null)
            return false;
        if (other.getAliasName() != null
                && other.getAliasName().equals(this.getAliasName()) == false)
            return false;
        return true;
    }
}
