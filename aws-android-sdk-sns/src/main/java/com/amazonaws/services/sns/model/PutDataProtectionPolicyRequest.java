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

package com.amazonaws.services.sns.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds or updates an inline policy document that is stored in the specified
 * Amazon SNS topic.
 * </p>
 */
public class PutDataProtectionPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the topic whose <code>DataProtectionPolicy</code> you want to
     * add or update.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs)</a> in the Amazon Web Services General
     * Reference.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The JSON serialization of the topic's <code>DataProtectionPolicy</code>.
     * </p>
     * <p>
     * The <code>DataProtectionPolicy</code> must be in JSON string format.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 30,720.
     * </p>
     */
    private String dataProtectionPolicy;

    /**
     * <p>
     * The ARN of the topic whose <code>DataProtectionPolicy</code> you want to
     * add or update.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs)</a> in the Amazon Web Services General
     * Reference.
     * </p>
     *
     * @return <p>
     *         The ARN of the topic whose <code>DataProtectionPolicy</code> you
     *         want to add or update.
     *         </p>
     *         <p>
     *         For more information about ARNs, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Names (ARNs)</a> in the Amazon Web Services
     *         General Reference.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The ARN of the topic whose <code>DataProtectionPolicy</code> you want to
     * add or update.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs)</a> in the Amazon Web Services General
     * Reference.
     * </p>
     *
     * @param resourceArn <p>
     *            The ARN of the topic whose <code>DataProtectionPolicy</code>
     *            you want to add or update.
     *            </p>
     *            <p>
     *            For more information about ARNs, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs)</a> in the Amazon Web Services
     *            General Reference.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the topic whose <code>DataProtectionPolicy</code> you want to
     * add or update.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs)</a> in the Amazon Web Services General
     * Reference.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArn <p>
     *            The ARN of the topic whose <code>DataProtectionPolicy</code>
     *            you want to add or update.
     *            </p>
     *            <p>
     *            For more information about ARNs, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs)</a> in the Amazon Web Services
     *            General Reference.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutDataProtectionPolicyRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * The JSON serialization of the topic's <code>DataProtectionPolicy</code>.
     * </p>
     * <p>
     * The <code>DataProtectionPolicy</code> must be in JSON string format.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 30,720.
     * </p>
     *
     * @return <p>
     *         The JSON serialization of the topic's
     *         <code>DataProtectionPolicy</code>.
     *         </p>
     *         <p>
     *         The <code>DataProtectionPolicy</code> must be in JSON string
     *         format.
     *         </p>
     *         <p>
     *         Length Constraints: Maximum length of 30,720.
     *         </p>
     */
    public String getDataProtectionPolicy() {
        return dataProtectionPolicy;
    }

    /**
     * <p>
     * The JSON serialization of the topic's <code>DataProtectionPolicy</code>.
     * </p>
     * <p>
     * The <code>DataProtectionPolicy</code> must be in JSON string format.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 30,720.
     * </p>
     *
     * @param dataProtectionPolicy <p>
     *            The JSON serialization of the topic's
     *            <code>DataProtectionPolicy</code>.
     *            </p>
     *            <p>
     *            The <code>DataProtectionPolicy</code> must be in JSON string
     *            format.
     *            </p>
     *            <p>
     *            Length Constraints: Maximum length of 30,720.
     *            </p>
     */
    public void setDataProtectionPolicy(String dataProtectionPolicy) {
        this.dataProtectionPolicy = dataProtectionPolicy;
    }

    /**
     * <p>
     * The JSON serialization of the topic's <code>DataProtectionPolicy</code>.
     * </p>
     * <p>
     * The <code>DataProtectionPolicy</code> must be in JSON string format.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 30,720.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataProtectionPolicy <p>
     *            The JSON serialization of the topic's
     *            <code>DataProtectionPolicy</code>.
     *            </p>
     *            <p>
     *            The <code>DataProtectionPolicy</code> must be in JSON string
     *            format.
     *            </p>
     *            <p>
     *            Length Constraints: Maximum length of 30,720.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutDataProtectionPolicyRequest withDataProtectionPolicy(String dataProtectionPolicy) {
        this.dataProtectionPolicy = dataProtectionPolicy;
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn() + ",");
        if (getDataProtectionPolicy() != null)
            sb.append("DataProtectionPolicy: " + getDataProtectionPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getDataProtectionPolicy() == null) ? 0 : getDataProtectionPolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDataProtectionPolicyRequest == false)
            return false;
        PutDataProtectionPolicyRequest other = (PutDataProtectionPolicyRequest) obj;

        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getDataProtectionPolicy() == null ^ this.getDataProtectionPolicy() == null)
            return false;
        if (other.getDataProtectionPolicy() != null
                && other.getDataProtectionPolicy().equals(this.getDataProtectionPolicy()) == false)
            return false;
        return true;
    }
}
