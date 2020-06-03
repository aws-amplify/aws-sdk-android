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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves information about the specified version of the specified managed
 * policy, including the policy document.
 * </p>
 * <note>
 * <p>
 * Policies returned by this API are URL-encoded compliant with <a
 * href="https://tools.ietf.org/html/rfc3986">RFC 3986</a>. You can use a URL
 * decoding method to convert the policy back to plain JSON text. For example,
 * if you use Java, you can use the <code>decode</code> method of the
 * <code>java.net.URLDecoder</code> utility class in the Java SDK. Other
 * languages and SDKs provide similar functionality.
 * </p>
 * </note>
 * <p>
 * To list the available versions for a policy, use <a>ListPolicyVersions</a>.
 * </p>
 * <p>
 * This API retrieves information about managed policies. To retrieve
 * information about an inline policy that is embedded in a user, group, or
 * role, use the <a>GetUserPolicy</a>, <a>GetGroupPolicy</a>, or
 * <a>GetRolePolicy</a> API.
 * </p>
 * <p>
 * For more information about the types of policies, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
 * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * For more information about managed policy versions, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
 * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
 * </p>
 */
public class GetPolicyVersionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the managed policy that you want
     * information about.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String policyArn;

    /**
     * <p>
     * Identifies the policy version to retrieve.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that consists of the lowercase letter 'v' followed by one or
     * two digits, and optionally followed by a period '.' and a string of
     * letters and digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>v[1-9][0-9]*(\.[A-Za-z0-9-]*)?<br/>
     */
    private String versionId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the managed policy that you want
     * information about.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the managed policy that you
     *         want information about.
     *         </p>
     *         <p>
     *         For more information about ARNs, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in
     *         the <i>AWS General Reference</i>.
     *         </p>
     */
    public String getPolicyArn() {
        return policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the managed policy that you want
     * information about.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param policyArn <p>
     *            The Amazon Resource Name (ARN) of the managed policy that you
     *            want information about.
     *            </p>
     *            <p>
     *            For more information about ARNs, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>
     *            in the <i>AWS General Reference</i>.
     *            </p>
     */
    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the managed policy that you want
     * information about.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param policyArn <p>
     *            The Amazon Resource Name (ARN) of the managed policy that you
     *            want information about.
     *            </p>
     *            <p>
     *            For more information about ARNs, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>
     *            in the <i>AWS General Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPolicyVersionRequest withPolicyArn(String policyArn) {
        this.policyArn = policyArn;
        return this;
    }

    /**
     * <p>
     * Identifies the policy version to retrieve.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that consists of the lowercase letter 'v' followed by one or
     * two digits, and optionally followed by a period '.' and a string of
     * letters and digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>v[1-9][0-9]*(\.[A-Za-z0-9-]*)?<br/>
     *
     * @return <p>
     *         Identifies the policy version to retrieve.
     *         </p>
     *         <p>
     *         This parameter allows (through its <a
     *         href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *         string of characters that consists of the lowercase letter 'v'
     *         followed by one or two digits, and optionally followed by a
     *         period '.' and a string of letters and digits.
     *         </p>
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * <p>
     * Identifies the policy version to retrieve.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that consists of the lowercase letter 'v' followed by one or
     * two digits, and optionally followed by a period '.' and a string of
     * letters and digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>v[1-9][0-9]*(\.[A-Za-z0-9-]*)?<br/>
     *
     * @param versionId <p>
     *            Identifies the policy version to retrieve.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters that consists of the lowercase letter 'v'
     *            followed by one or two digits, and optionally followed by a
     *            period '.' and a string of letters and digits.
     *            </p>
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * Identifies the policy version to retrieve.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that consists of the lowercase letter 'v' followed by one or
     * two digits, and optionally followed by a period '.' and a string of
     * letters and digits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>v[1-9][0-9]*(\.[A-Za-z0-9-]*)?<br/>
     *
     * @param versionId <p>
     *            Identifies the policy version to retrieve.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters that consists of the lowercase letter 'v'
     *            followed by one or two digits, and optionally followed by a
     *            period '.' and a string of letters and digits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPolicyVersionRequest withVersionId(String versionId) {
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
        if (getPolicyArn() != null)
            sb.append("PolicyArn: " + getPolicyArn() + ",");
        if (getVersionId() != null)
            sb.append("VersionId: " + getVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPolicyVersionRequest == false)
            return false;
        GetPolicyVersionRequest other = (GetPolicyVersionRequest) obj;

        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null
                && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null
                && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        return true;
    }
}
