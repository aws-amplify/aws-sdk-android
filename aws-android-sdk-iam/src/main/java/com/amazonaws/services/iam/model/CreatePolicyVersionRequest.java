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
 * Creates a new version of the specified managed policy. To update a managed
 * policy, you create a new policy version. A managed policy can have up to five
 * versions. If the policy has five versions, you must delete an existing
 * version using <a>DeletePolicyVersion</a> before you create a new version.
 * </p>
 * <p>
 * Optionally, you can set the new version as the policy's default version. The
 * default version is the version that is in effect for the IAM users, groups,
 * and roles to which the policy is attached.
 * </p>
 * <p>
 * For more information about managed policy versions, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
 * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
 * </p>
 */
public class CreatePolicyVersionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM policy to which you want to add
     * a new version.
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
     * The JSON policy document that you want to use as the content for this new
     * version of the policy.
     * </p>
     * <p>
     * You must provide policies in JSON format in IAM. However, for AWS
     * CloudFormation templates formatted in YAML, you can provide the policy in
     * JSON or YAML format. AWS CloudFormation always converts a YAML policy to
     * JSON format before submitting it to IAM.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String policyDocument;

    /**
     * <p>
     * Specifies whether to set this version as the policy's default version.
     * </p>
     * <p>
     * When this parameter is <code>true</code>, the new policy version becomes
     * the operative version. That is, it becomes the version that is in effect
     * for the IAM users, groups, and roles that the policy is attached to.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private Boolean setAsDefault;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM policy to which you want to add
     * a new version.
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
     *         The Amazon Resource Name (ARN) of the IAM policy to which you
     *         want to add a new version.
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
     * The Amazon Resource Name (ARN) of the IAM policy to which you want to add
     * a new version.
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
     *            The Amazon Resource Name (ARN) of the IAM policy to which you
     *            want to add a new version.
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
     * The Amazon Resource Name (ARN) of the IAM policy to which you want to add
     * a new version.
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
     *            The Amazon Resource Name (ARN) of the IAM policy to which you
     *            want to add a new version.
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
    public CreatePolicyVersionRequest withPolicyArn(String policyArn) {
        this.policyArn = policyArn;
        return this;
    }

    /**
     * <p>
     * The JSON policy document that you want to use as the content for this new
     * version of the policy.
     * </p>
     * <p>
     * You must provide policies in JSON format in IAM. However, for AWS
     * CloudFormation templates formatted in YAML, you can provide the policy in
     * JSON or YAML format. AWS CloudFormation always converts a YAML policy to
     * JSON format before submitting it to IAM.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The JSON policy document that you want to use as the content for
     *         this new version of the policy.
     *         </p>
     *         <p>
     *         You must provide policies in JSON format in IAM. However, for AWS
     *         CloudFormation templates formatted in YAML, you can provide the
     *         policy in JSON or YAML format. AWS CloudFormation always converts
     *         a YAML policy to JSON format before submitting it to IAM.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         used to validate this parameter is a string of characters
     *         consisting of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Any printable ASCII character ranging from the space character (
     *         <code>\u0020</code>) through the end of the ASCII character range
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The printable characters in the Basic Latin and Latin-1
     *         Supplement character set (through <code>\u00FF</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The special characters tab (<code>\u0009</code>), line feed (
     *         <code>\u000A</code>), and carriage return (<code>\u000D</code>)
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getPolicyDocument() {
        return policyDocument;
    }

    /**
     * <p>
     * The JSON policy document that you want to use as the content for this new
     * version of the policy.
     * </p>
     * <p>
     * You must provide policies in JSON format in IAM. However, for AWS
     * CloudFormation templates formatted in YAML, you can provide the policy in
     * JSON or YAML format. AWS CloudFormation always converts a YAML policy to
     * JSON format before submitting it to IAM.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param policyDocument <p>
     *            The JSON policy document that you want to use as the content
     *            for this new version of the policy.
     *            </p>
     *            <p>
     *            You must provide policies in JSON format in IAM. However, for
     *            AWS CloudFormation templates formatted in YAML, you can
     *            provide the policy in JSON or YAML format. AWS CloudFormation
     *            always converts a YAML policy to JSON format before submitting
     *            it to IAM.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> used to validate this parameter is a string of
     *            characters consisting of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Any printable ASCII character ranging from the space character
     *            (<code>\u0020</code>) through the end of the ASCII character
     *            range
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The printable characters in the Basic Latin and Latin-1
     *            Supplement character set (through <code>\u00FF</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The special characters tab (<code>\u0009</code>), line feed (
     *            <code>\u000A</code>), and carriage return (<code>\u000D</code>
     *            )
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The JSON policy document that you want to use as the content for this new
     * version of the policy.
     * </p>
     * <p>
     * You must provide policies in JSON format in IAM. However, for AWS
     * CloudFormation templates formatted in YAML, you can provide the policy in
     * JSON or YAML format. AWS CloudFormation always converts a YAML policy to
     * JSON format before submitting it to IAM.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param policyDocument <p>
     *            The JSON policy document that you want to use as the content
     *            for this new version of the policy.
     *            </p>
     *            <p>
     *            You must provide policies in JSON format in IAM. However, for
     *            AWS CloudFormation templates formatted in YAML, you can
     *            provide the policy in JSON or YAML format. AWS CloudFormation
     *            always converts a YAML policy to JSON format before submitting
     *            it to IAM.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> used to validate this parameter is a string of
     *            characters consisting of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Any printable ASCII character ranging from the space character
     *            (<code>\u0020</code>) through the end of the ASCII character
     *            range
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The printable characters in the Basic Latin and Latin-1
     *            Supplement character set (through <code>\u00FF</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The special characters tab (<code>\u0009</code>), line feed (
     *            <code>\u000A</code>), and carriage return (<code>\u000D</code>
     *            )
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePolicyVersionRequest withPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * <p>
     * Specifies whether to set this version as the policy's default version.
     * </p>
     * <p>
     * When this parameter is <code>true</code>, the new policy version becomes
     * the operative version. That is, it becomes the version that is in effect
     * for the IAM users, groups, and roles that the policy is attached to.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies whether to set this version as the policy's default
     *         version.
     *         </p>
     *         <p>
     *         When this parameter is <code>true</code>, the new policy version
     *         becomes the operative version. That is, it becomes the version
     *         that is in effect for the IAM users, groups, and roles that the
     *         policy is attached to.
     *         </p>
     *         <p>
     *         For more information about managed policy versions, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     *         >Versioning for Managed Policies</a> in the <i>IAM User
     *         Guide</i>.
     *         </p>
     */
    public Boolean isSetAsDefault() {
        return setAsDefault;
    }

    /**
     * <p>
     * Specifies whether to set this version as the policy's default version.
     * </p>
     * <p>
     * When this parameter is <code>true</code>, the new policy version becomes
     * the operative version. That is, it becomes the version that is in effect
     * for the IAM users, groups, and roles that the policy is attached to.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies whether to set this version as the policy's default
     *         version.
     *         </p>
     *         <p>
     *         When this parameter is <code>true</code>, the new policy version
     *         becomes the operative version. That is, it becomes the version
     *         that is in effect for the IAM users, groups, and roles that the
     *         policy is attached to.
     *         </p>
     *         <p>
     *         For more information about managed policy versions, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     *         >Versioning for Managed Policies</a> in the <i>IAM User
     *         Guide</i>.
     *         </p>
     */
    public Boolean getSetAsDefault() {
        return setAsDefault;
    }

    /**
     * <p>
     * Specifies whether to set this version as the policy's default version.
     * </p>
     * <p>
     * When this parameter is <code>true</code>, the new policy version becomes
     * the operative version. That is, it becomes the version that is in effect
     * for the IAM users, groups, and roles that the policy is attached to.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     *
     * @param setAsDefault <p>
     *            Specifies whether to set this version as the policy's default
     *            version.
     *            </p>
     *            <p>
     *            When this parameter is <code>true</code>, the new policy
     *            version becomes the operative version. That is, it becomes the
     *            version that is in effect for the IAM users, groups, and roles
     *            that the policy is attached to.
     *            </p>
     *            <p>
     *            For more information about managed policy versions, see <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     *            >Versioning for Managed Policies</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     */
    public void setSetAsDefault(Boolean setAsDefault) {
        this.setAsDefault = setAsDefault;
    }

    /**
     * <p>
     * Specifies whether to set this version as the policy's default version.
     * </p>
     * <p>
     * When this parameter is <code>true</code>, the new policy version becomes
     * the operative version. That is, it becomes the version that is in effect
     * for the IAM users, groups, and roles that the policy is attached to.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param setAsDefault <p>
     *            Specifies whether to set this version as the policy's default
     *            version.
     *            </p>
     *            <p>
     *            When this parameter is <code>true</code>, the new policy
     *            version becomes the operative version. That is, it becomes the
     *            version that is in effect for the IAM users, groups, and roles
     *            that the policy is attached to.
     *            </p>
     *            <p>
     *            For more information about managed policy versions, see <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     *            >Versioning for Managed Policies</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePolicyVersionRequest withSetAsDefault(Boolean setAsDefault) {
        this.setAsDefault = setAsDefault;
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
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: " + getPolicyDocument() + ",");
        if (getSetAsDefault() != null)
            sb.append("SetAsDefault: " + getSetAsDefault());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode
                + ((getSetAsDefault() == null) ? 0 : getSetAsDefault().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePolicyVersionRequest == false)
            return false;
        CreatePolicyVersionRequest other = (CreatePolicyVersionRequest) obj;

        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null
                && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null
                && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getSetAsDefault() == null ^ this.getSetAsDefault() == null)
            return false;
        if (other.getSetAsDefault() != null
                && other.getSetAsDefault().equals(this.getSetAsDefault()) == false)
            return false;
        return true;
    }
}
