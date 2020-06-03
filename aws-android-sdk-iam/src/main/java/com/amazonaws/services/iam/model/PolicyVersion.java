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

/**
 * <p>
 * Contains information about a version of a managed policy.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <a>CreatePolicyVersion</a>, <a>GetPolicyVersion</a>,
 * <a>ListPolicyVersions</a>, and <a>GetAccountAuthorizationDetails</a>
 * operations.
 * </p>
 * <p>
 * For more information about managed policies, refer to <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
 * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
 * </p>
 */
public class PolicyVersion implements Serializable {
    /**
     * <p>
     * The policy document.
     * </p>
     * <p>
     * The policy document is returned in the response to the
     * <a>GetPolicyVersion</a> and <a>GetAccountAuthorizationDetails</a>
     * operations. It is not returned in the response to the
     * <a>CreatePolicyVersion</a> or <a>ListPolicyVersions</a> operations.
     * </p>
     * <p>
     * The policy document returned in this structure is URL-encoded compliant
     * with <a href="https://tools.ietf.org/html/rfc3986">RFC 3986</a>. You can
     * use a URL decoding method to convert the policy back to plain JSON text.
     * For example, if you use Java, you can use the <code>decode</code> method
     * of the <code>java.net.URLDecoder</code> utility class in the Java SDK.
     * Other languages and SDKs provide similar functionality.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String document;

    /**
     * <p>
     * The identifier for the policy version.
     * </p>
     * <p>
     * Policy version identifiers always begin with <code>v</code> (always
     * lowercase). When a policy is created, the first policy version is
     * <code>v1</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>v[1-9][0-9]*(\.[A-Za-z0-9-]*)?<br/>
     */
    private String versionId;

    /**
     * <p>
     * Specifies whether the policy version is set as the policy's default
     * version.
     * </p>
     */
    private Boolean isDefaultVersion;

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the policy version was created.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * The policy document.
     * </p>
     * <p>
     * The policy document is returned in the response to the
     * <a>GetPolicyVersion</a> and <a>GetAccountAuthorizationDetails</a>
     * operations. It is not returned in the response to the
     * <a>CreatePolicyVersion</a> or <a>ListPolicyVersions</a> operations.
     * </p>
     * <p>
     * The policy document returned in this structure is URL-encoded compliant
     * with <a href="https://tools.ietf.org/html/rfc3986">RFC 3986</a>. You can
     * use a URL decoding method to convert the policy back to plain JSON text.
     * For example, if you use Java, you can use the <code>decode</code> method
     * of the <code>java.net.URLDecoder</code> utility class in the Java SDK.
     * Other languages and SDKs provide similar functionality.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The policy document.
     *         </p>
     *         <p>
     *         The policy document is returned in the response to the
     *         <a>GetPolicyVersion</a> and <a>GetAccountAuthorizationDetails</a>
     *         operations. It is not returned in the response to the
     *         <a>CreatePolicyVersion</a> or <a>ListPolicyVersions</a>
     *         operations.
     *         </p>
     *         <p>
     *         The policy document returned in this structure is URL-encoded
     *         compliant with <a href="https://tools.ietf.org/html/rfc3986">RFC
     *         3986</a>. You can use a URL decoding method to convert the policy
     *         back to plain JSON text. For example, if you use Java, you can
     *         use the <code>decode</code> method of the
     *         <code>java.net.URLDecoder</code> utility class in the Java SDK.
     *         Other languages and SDKs provide similar functionality.
     *         </p>
     */
    public String getDocument() {
        return document;
    }

    /**
     * <p>
     * The policy document.
     * </p>
     * <p>
     * The policy document is returned in the response to the
     * <a>GetPolicyVersion</a> and <a>GetAccountAuthorizationDetails</a>
     * operations. It is not returned in the response to the
     * <a>CreatePolicyVersion</a> or <a>ListPolicyVersions</a> operations.
     * </p>
     * <p>
     * The policy document returned in this structure is URL-encoded compliant
     * with <a href="https://tools.ietf.org/html/rfc3986">RFC 3986</a>. You can
     * use a URL decoding method to convert the policy back to plain JSON text.
     * For example, if you use Java, you can use the <code>decode</code> method
     * of the <code>java.net.URLDecoder</code> utility class in the Java SDK.
     * Other languages and SDKs provide similar functionality.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param document <p>
     *            The policy document.
     *            </p>
     *            <p>
     *            The policy document is returned in the response to the
     *            <a>GetPolicyVersion</a> and
     *            <a>GetAccountAuthorizationDetails</a> operations. It is not
     *            returned in the response to the <a>CreatePolicyVersion</a> or
     *            <a>ListPolicyVersions</a> operations.
     *            </p>
     *            <p>
     *            The policy document returned in this structure is URL-encoded
     *            compliant with <a
     *            href="https://tools.ietf.org/html/rfc3986">RFC 3986</a>. You
     *            can use a URL decoding method to convert the policy back to
     *            plain JSON text. For example, if you use Java, you can use the
     *            <code>decode</code> method of the
     *            <code>java.net.URLDecoder</code> utility class in the Java
     *            SDK. Other languages and SDKs provide similar functionality.
     *            </p>
     */
    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * The policy document.
     * </p>
     * <p>
     * The policy document is returned in the response to the
     * <a>GetPolicyVersion</a> and <a>GetAccountAuthorizationDetails</a>
     * operations. It is not returned in the response to the
     * <a>CreatePolicyVersion</a> or <a>ListPolicyVersions</a> operations.
     * </p>
     * <p>
     * The policy document returned in this structure is URL-encoded compliant
     * with <a href="https://tools.ietf.org/html/rfc3986">RFC 3986</a>. You can
     * use a URL decoding method to convert the policy back to plain JSON text.
     * For example, if you use Java, you can use the <code>decode</code> method
     * of the <code>java.net.URLDecoder</code> utility class in the Java SDK.
     * Other languages and SDKs provide similar functionality.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param document <p>
     *            The policy document.
     *            </p>
     *            <p>
     *            The policy document is returned in the response to the
     *            <a>GetPolicyVersion</a> and
     *            <a>GetAccountAuthorizationDetails</a> operations. It is not
     *            returned in the response to the <a>CreatePolicyVersion</a> or
     *            <a>ListPolicyVersions</a> operations.
     *            </p>
     *            <p>
     *            The policy document returned in this structure is URL-encoded
     *            compliant with <a
     *            href="https://tools.ietf.org/html/rfc3986">RFC 3986</a>. You
     *            can use a URL decoding method to convert the policy back to
     *            plain JSON text. For example, if you use Java, you can use the
     *            <code>decode</code> method of the
     *            <code>java.net.URLDecoder</code> utility class in the Java
     *            SDK. Other languages and SDKs provide similar functionality.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyVersion withDocument(String document) {
        this.document = document;
        return this;
    }

    /**
     * <p>
     * The identifier for the policy version.
     * </p>
     * <p>
     * Policy version identifiers always begin with <code>v</code> (always
     * lowercase). When a policy is created, the first policy version is
     * <code>v1</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>v[1-9][0-9]*(\.[A-Za-z0-9-]*)?<br/>
     *
     * @return <p>
     *         The identifier for the policy version.
     *         </p>
     *         <p>
     *         Policy version identifiers always begin with <code>v</code>
     *         (always lowercase). When a policy is created, the first policy
     *         version is <code>v1</code>.
     *         </p>
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * <p>
     * The identifier for the policy version.
     * </p>
     * <p>
     * Policy version identifiers always begin with <code>v</code> (always
     * lowercase). When a policy is created, the first policy version is
     * <code>v1</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>v[1-9][0-9]*(\.[A-Za-z0-9-]*)?<br/>
     *
     * @param versionId <p>
     *            The identifier for the policy version.
     *            </p>
     *            <p>
     *            Policy version identifiers always begin with <code>v</code>
     *            (always lowercase). When a policy is created, the first policy
     *            version is <code>v1</code>.
     *            </p>
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The identifier for the policy version.
     * </p>
     * <p>
     * Policy version identifiers always begin with <code>v</code> (always
     * lowercase). When a policy is created, the first policy version is
     * <code>v1</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>v[1-9][0-9]*(\.[A-Za-z0-9-]*)?<br/>
     *
     * @param versionId <p>
     *            The identifier for the policy version.
     *            </p>
     *            <p>
     *            Policy version identifiers always begin with <code>v</code>
     *            (always lowercase). When a policy is created, the first policy
     *            version is <code>v1</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyVersion withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * <p>
     * Specifies whether the policy version is set as the policy's default
     * version.
     * </p>
     *
     * @return <p>
     *         Specifies whether the policy version is set as the policy's
     *         default version.
     *         </p>
     */
    public Boolean isIsDefaultVersion() {
        return isDefaultVersion;
    }

    /**
     * <p>
     * Specifies whether the policy version is set as the policy's default
     * version.
     * </p>
     *
     * @return <p>
     *         Specifies whether the policy version is set as the policy's
     *         default version.
     *         </p>
     */
    public Boolean getIsDefaultVersion() {
        return isDefaultVersion;
    }

    /**
     * <p>
     * Specifies whether the policy version is set as the policy's default
     * version.
     * </p>
     *
     * @param isDefaultVersion <p>
     *            Specifies whether the policy version is set as the policy's
     *            default version.
     *            </p>
     */
    public void setIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
    }

    /**
     * <p>
     * Specifies whether the policy version is set as the policy's default
     * version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isDefaultVersion <p>
     *            Specifies whether the policy version is set as the policy's
     *            default version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyVersion withIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the policy version was created.
     * </p>
     *
     * @return <p>
     *         The date and time, in <a
     *         href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *         format</a>, when the policy version was created.
     *         </p>
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the policy version was created.
     * </p>
     *
     * @param createDate <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the policy version was created.
     *            </p>
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the policy version was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createDate <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the policy version was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyVersion withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
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
        if (getDocument() != null)
            sb.append("Document: " + getDocument() + ",");
        if (getVersionId() != null)
            sb.append("VersionId: " + getVersionId() + ",");
        if (getIsDefaultVersion() != null)
            sb.append("IsDefaultVersion: " + getIsDefaultVersion() + ",");
        if (getCreateDate() != null)
            sb.append("CreateDate: " + getCreateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode
                + ((getIsDefaultVersion() == null) ? 0 : getIsDefaultVersion().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyVersion == false)
            return false;
        PolicyVersion other = (PolicyVersion) obj;

        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null
                && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getIsDefaultVersion() == null ^ this.getIsDefaultVersion() == null)
            return false;
        if (other.getIsDefaultVersion() != null
                && other.getIsDefaultVersion().equals(this.getIsDefaultVersion()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null
                && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        return true;
    }
}
