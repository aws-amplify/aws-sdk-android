/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful <a>AssumeRoleWithSAML</a> request,
 * including temporary Amazon Web Services credentials that can be used to make
 * Amazon Web Services requests.
 * </p>
 */
public class AssumeRoleWithSAMLResult implements Serializable {
    /**
     * <p>
     * The temporary security credentials, which include an access key ID, a
     * secret access key, and a security (or session) token.
     * </p>
     * <note>
     * <p>
     * The size of the security token that STS API operations return is not
     * fixed. We strongly recommend that you make no assumptions about the
     * maximum size.
     * </p>
     * </note>
     */
    private Credentials credentials;

    /**
     * <p>
     * The identifiers for the temporary security credentials that the operation
     * returns.
     * </p>
     */
    private AssumedRoleUser assumedRoleUser;

    /**
     * <p>
     * A percentage value that indicates the packed size of the session policies
     * and session tags combined passed in the request. The request fails if the
     * packed size is greater than 100 percent, which means the policies and
     * tags exceeded the allowed space.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer packedPolicySize;

    /**
     * <p>
     * The value of the <code>NameID</code> element in the <code>Subject</code>
     * element of the SAML assertion.
     * </p>
     */
    private String subject;

    /**
     * <p>
     * The format of the name ID, as defined by the <code>Format</code>
     * attribute in the <code>NameID</code> element of the SAML assertion.
     * Typical examples of the format are <code>transient</code> or
     * <code>persistent</code>.
     * </p>
     * <p>
     * If the format includes the prefix
     * <code>urn:oasis:names:tc:SAML:2.0:nameid-format</code>, that prefix is
     * removed. For example,
     * <code>urn:oasis:names:tc:SAML:2.0:nameid-format:transient</code> is
     * returned as <code>transient</code>. If the format includes any other
     * prefix, the format is returned with no modifications.
     * </p>
     */
    private String subjectType;

    /**
     * <p>
     * The value of the <code>Issuer</code> element of the SAML assertion.
     * </p>
     */
    private String issuer;

    /**
     * <p>
     * The value of the <code>Recipient</code> attribute of the
     * <code>SubjectConfirmationData</code> element of the SAML assertion.
     * </p>
     */
    private String audience;

    /**
     * <p>
     * A hash value based on the concatenation of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>Issuer</code> response value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * The friendly name (the last part of the ARN) of the SAML provider in IAM.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The combination of <code>NameQualifier</code> and <code>Subject</code>
     * can be used to uniquely identify a federated user.
     * </p>
     * <p>
     * The following pseudocode shows how the hash value is calculated:
     * </p>
     * <p>
     * <code>BASE64 ( SHA1 ( "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )</code>
     * </p>
     */
    private String nameQualifier;

    /**
     * <p>
     * The value in the <code>SourceIdentity</code> attribute in the SAML
     * assertion.
     * </p>
     * <p>
     * You can require users to set a source identity value when they assume a
     * role. You do this by using the <code>sts:SourceIdentity</code> condition
     * key in a role trust policy. That way, actions that are taken with the
     * role are associated with that user. After the source identity is set, the
     * value cannot be changed. It is present in the request for all actions
     * that are taken by the role and persists across <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts#iam-term-role-chaining"
     * >chained role</a> sessions. You can configure your SAML identity provider
     * to use an attribute associated with your users, like user name or email,
     * as the source identity when calling <code>AssumeRoleWithSAML</code>. You
     * do this by adding an attribute to the SAML assertion. For more
     * information about using source identity, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     * >Monitor and control actions taken with assumed roles</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String sourceIdentity;

    /**
     * <p>
     * The temporary security credentials, which include an access key ID, a
     * secret access key, and a security (or session) token.
     * </p>
     * <note>
     * <p>
     * The size of the security token that STS API operations return is not
     * fixed. We strongly recommend that you make no assumptions about the
     * maximum size.
     * </p>
     * </note>
     *
     * @return <p>
     *         The temporary security credentials, which include an access key
     *         ID, a secret access key, and a security (or session) token.
     *         </p>
     *         <note>
     *         <p>
     *         The size of the security token that STS API operations return is
     *         not fixed. We strongly recommend that you make no assumptions
     *         about the maximum size.
     *         </p>
     *         </note>
     */
    public Credentials getCredentials() {
        return credentials;
    }

    /**
     * <p>
     * The temporary security credentials, which include an access key ID, a
     * secret access key, and a security (or session) token.
     * </p>
     * <note>
     * <p>
     * The size of the security token that STS API operations return is not
     * fixed. We strongly recommend that you make no assumptions about the
     * maximum size.
     * </p>
     * </note>
     *
     * @param credentials <p>
     *            The temporary security credentials, which include an access
     *            key ID, a secret access key, and a security (or session)
     *            token.
     *            </p>
     *            <note>
     *            <p>
     *            The size of the security token that STS API operations return
     *            is not fixed. We strongly recommend that you make no
     *            assumptions about the maximum size.
     *            </p>
     *            </note>
     */
    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * The temporary security credentials, which include an access key ID, a
     * secret access key, and a security (or session) token.
     * </p>
     * <note>
     * <p>
     * The size of the security token that STS API operations return is not
     * fixed. We strongly recommend that you make no assumptions about the
     * maximum size.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param credentials <p>
     *            The temporary security credentials, which include an access
     *            key ID, a secret access key, and a security (or session)
     *            token.
     *            </p>
     *            <note>
     *            <p>
     *            The size of the security token that STS API operations return
     *            is not fixed. We strongly recommend that you make no
     *            assumptions about the maximum size.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithSAMLResult withCredentials(Credentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * <p>
     * The identifiers for the temporary security credentials that the operation
     * returns.
     * </p>
     *
     * @return <p>
     *         The identifiers for the temporary security credentials that the
     *         operation returns.
     *         </p>
     */
    public AssumedRoleUser getAssumedRoleUser() {
        return assumedRoleUser;
    }

    /**
     * <p>
     * The identifiers for the temporary security credentials that the operation
     * returns.
     * </p>
     *
     * @param assumedRoleUser <p>
     *            The identifiers for the temporary security credentials that
     *            the operation returns.
     *            </p>
     */
    public void setAssumedRoleUser(AssumedRoleUser assumedRoleUser) {
        this.assumedRoleUser = assumedRoleUser;
    }

    /**
     * <p>
     * The identifiers for the temporary security credentials that the operation
     * returns.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assumedRoleUser <p>
     *            The identifiers for the temporary security credentials that
     *            the operation returns.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithSAMLResult withAssumedRoleUser(AssumedRoleUser assumedRoleUser) {
        this.assumedRoleUser = assumedRoleUser;
        return this;
    }

    /**
     * <p>
     * A percentage value that indicates the packed size of the session policies
     * and session tags combined passed in the request. The request fails if the
     * packed size is greater than 100 percent, which means the policies and
     * tags exceeded the allowed space.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         A percentage value that indicates the packed size of the session
     *         policies and session tags combined passed in the request. The
     *         request fails if the packed size is greater than 100 percent,
     *         which means the policies and tags exceeded the allowed space.
     *         </p>
     */
    public Integer getPackedPolicySize() {
        return packedPolicySize;
    }

    /**
     * <p>
     * A percentage value that indicates the packed size of the session policies
     * and session tags combined passed in the request. The request fails if the
     * packed size is greater than 100 percent, which means the policies and
     * tags exceeded the allowed space.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param packedPolicySize <p>
     *            A percentage value that indicates the packed size of the
     *            session policies and session tags combined passed in the
     *            request. The request fails if the packed size is greater than
     *            100 percent, which means the policies and tags exceeded the
     *            allowed space.
     *            </p>
     */
    public void setPackedPolicySize(Integer packedPolicySize) {
        this.packedPolicySize = packedPolicySize;
    }

    /**
     * <p>
     * A percentage value that indicates the packed size of the session policies
     * and session tags combined passed in the request. The request fails if the
     * packed size is greater than 100 percent, which means the policies and
     * tags exceeded the allowed space.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param packedPolicySize <p>
     *            A percentage value that indicates the packed size of the
     *            session policies and session tags combined passed in the
     *            request. The request fails if the packed size is greater than
     *            100 percent, which means the policies and tags exceeded the
     *            allowed space.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithSAMLResult withPackedPolicySize(Integer packedPolicySize) {
        this.packedPolicySize = packedPolicySize;
        return this;
    }

    /**
     * <p>
     * The value of the <code>NameID</code> element in the <code>Subject</code>
     * element of the SAML assertion.
     * </p>
     *
     * @return <p>
     *         The value of the <code>NameID</code> element in the
     *         <code>Subject</code> element of the SAML assertion.
     *         </p>
     */
    public String getSubject() {
        return subject;
    }

    /**
     * <p>
     * The value of the <code>NameID</code> element in the <code>Subject</code>
     * element of the SAML assertion.
     * </p>
     *
     * @param subject <p>
     *            The value of the <code>NameID</code> element in the
     *            <code>Subject</code> element of the SAML assertion.
     *            </p>
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The value of the <code>NameID</code> element in the <code>Subject</code>
     * element of the SAML assertion.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subject <p>
     *            The value of the <code>NameID</code> element in the
     *            <code>Subject</code> element of the SAML assertion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithSAMLResult withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * <p>
     * The format of the name ID, as defined by the <code>Format</code>
     * attribute in the <code>NameID</code> element of the SAML assertion.
     * Typical examples of the format are <code>transient</code> or
     * <code>persistent</code>.
     * </p>
     * <p>
     * If the format includes the prefix
     * <code>urn:oasis:names:tc:SAML:2.0:nameid-format</code>, that prefix is
     * removed. For example,
     * <code>urn:oasis:names:tc:SAML:2.0:nameid-format:transient</code> is
     * returned as <code>transient</code>. If the format includes any other
     * prefix, the format is returned with no modifications.
     * </p>
     *
     * @return <p>
     *         The format of the name ID, as defined by the <code>Format</code>
     *         attribute in the <code>NameID</code> element of the SAML
     *         assertion. Typical examples of the format are
     *         <code>transient</code> or <code>persistent</code>.
     *         </p>
     *         <p>
     *         If the format includes the prefix
     *         <code>urn:oasis:names:tc:SAML:2.0:nameid-format</code>, that
     *         prefix is removed. For example,
     *         <code>urn:oasis:names:tc:SAML:2.0:nameid-format:transient</code>
     *         is returned as <code>transient</code>. If the format includes any
     *         other prefix, the format is returned with no modifications.
     *         </p>
     */
    public String getSubjectType() {
        return subjectType;
    }

    /**
     * <p>
     * The format of the name ID, as defined by the <code>Format</code>
     * attribute in the <code>NameID</code> element of the SAML assertion.
     * Typical examples of the format are <code>transient</code> or
     * <code>persistent</code>.
     * </p>
     * <p>
     * If the format includes the prefix
     * <code>urn:oasis:names:tc:SAML:2.0:nameid-format</code>, that prefix is
     * removed. For example,
     * <code>urn:oasis:names:tc:SAML:2.0:nameid-format:transient</code> is
     * returned as <code>transient</code>. If the format includes any other
     * prefix, the format is returned with no modifications.
     * </p>
     *
     * @param subjectType <p>
     *            The format of the name ID, as defined by the
     *            <code>Format</code> attribute in the <code>NameID</code>
     *            element of the SAML assertion. Typical examples of the format
     *            are <code>transient</code> or <code>persistent</code>.
     *            </p>
     *            <p>
     *            If the format includes the prefix
     *            <code>urn:oasis:names:tc:SAML:2.0:nameid-format</code>, that
     *            prefix is removed. For example,
     *            <code>urn:oasis:names:tc:SAML:2.0:nameid-format:transient</code>
     *            is returned as <code>transient</code>. If the format includes
     *            any other prefix, the format is returned with no
     *            modifications.
     *            </p>
     */
    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    /**
     * <p>
     * The format of the name ID, as defined by the <code>Format</code>
     * attribute in the <code>NameID</code> element of the SAML assertion.
     * Typical examples of the format are <code>transient</code> or
     * <code>persistent</code>.
     * </p>
     * <p>
     * If the format includes the prefix
     * <code>urn:oasis:names:tc:SAML:2.0:nameid-format</code>, that prefix is
     * removed. For example,
     * <code>urn:oasis:names:tc:SAML:2.0:nameid-format:transient</code> is
     * returned as <code>transient</code>. If the format includes any other
     * prefix, the format is returned with no modifications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subjectType <p>
     *            The format of the name ID, as defined by the
     *            <code>Format</code> attribute in the <code>NameID</code>
     *            element of the SAML assertion. Typical examples of the format
     *            are <code>transient</code> or <code>persistent</code>.
     *            </p>
     *            <p>
     *            If the format includes the prefix
     *            <code>urn:oasis:names:tc:SAML:2.0:nameid-format</code>, that
     *            prefix is removed. For example,
     *            <code>urn:oasis:names:tc:SAML:2.0:nameid-format:transient</code>
     *            is returned as <code>transient</code>. If the format includes
     *            any other prefix, the format is returned with no
     *            modifications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithSAMLResult withSubjectType(String subjectType) {
        this.subjectType = subjectType;
        return this;
    }

    /**
     * <p>
     * The value of the <code>Issuer</code> element of the SAML assertion.
     * </p>
     *
     * @return <p>
     *         The value of the <code>Issuer</code> element of the SAML
     *         assertion.
     *         </p>
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * <p>
     * The value of the <code>Issuer</code> element of the SAML assertion.
     * </p>
     *
     * @param issuer <p>
     *            The value of the <code>Issuer</code> element of the SAML
     *            assertion.
     *            </p>
     */
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * <p>
     * The value of the <code>Issuer</code> element of the SAML assertion.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param issuer <p>
     *            The value of the <code>Issuer</code> element of the SAML
     *            assertion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithSAMLResult withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * <p>
     * The value of the <code>Recipient</code> attribute of the
     * <code>SubjectConfirmationData</code> element of the SAML assertion.
     * </p>
     *
     * @return <p>
     *         The value of the <code>Recipient</code> attribute of the
     *         <code>SubjectConfirmationData</code> element of the SAML
     *         assertion.
     *         </p>
     */
    public String getAudience() {
        return audience;
    }

    /**
     * <p>
     * The value of the <code>Recipient</code> attribute of the
     * <code>SubjectConfirmationData</code> element of the SAML assertion.
     * </p>
     *
     * @param audience <p>
     *            The value of the <code>Recipient</code> attribute of the
     *            <code>SubjectConfirmationData</code> element of the SAML
     *            assertion.
     *            </p>
     */
    public void setAudience(String audience) {
        this.audience = audience;
    }

    /**
     * <p>
     * The value of the <code>Recipient</code> attribute of the
     * <code>SubjectConfirmationData</code> element of the SAML assertion.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audience <p>
     *            The value of the <code>Recipient</code> attribute of the
     *            <code>SubjectConfirmationData</code> element of the SAML
     *            assertion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithSAMLResult withAudience(String audience) {
        this.audience = audience;
        return this;
    }

    /**
     * <p>
     * A hash value based on the concatenation of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>Issuer</code> response value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * The friendly name (the last part of the ARN) of the SAML provider in IAM.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The combination of <code>NameQualifier</code> and <code>Subject</code>
     * can be used to uniquely identify a federated user.
     * </p>
     * <p>
     * The following pseudocode shows how the hash value is calculated:
     * </p>
     * <p>
     * <code>BASE64 ( SHA1 ( "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )</code>
     * </p>
     *
     * @return <p>
     *         A hash value based on the concatenation of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>Issuer</code> response value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The Amazon Web Services account ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The friendly name (the last part of the ARN) of the SAML provider
     *         in IAM.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The combination of <code>NameQualifier</code> and
     *         <code>Subject</code> can be used to uniquely identify a federated
     *         user.
     *         </p>
     *         <p>
     *         The following pseudocode shows how the hash value is calculated:
     *         </p>
     *         <p>
     *         <code>BASE64 ( SHA1 ( "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )</code>
     *         </p>
     */
    public String getNameQualifier() {
        return nameQualifier;
    }

    /**
     * <p>
     * A hash value based on the concatenation of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>Issuer</code> response value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * The friendly name (the last part of the ARN) of the SAML provider in IAM.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The combination of <code>NameQualifier</code> and <code>Subject</code>
     * can be used to uniquely identify a federated user.
     * </p>
     * <p>
     * The following pseudocode shows how the hash value is calculated:
     * </p>
     * <p>
     * <code>BASE64 ( SHA1 ( "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )</code>
     * </p>
     *
     * @param nameQualifier <p>
     *            A hash value based on the concatenation of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The <code>Issuer</code> response value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The Amazon Web Services account ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The friendly name (the last part of the ARN) of the SAML
     *            provider in IAM.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The combination of <code>NameQualifier</code> and
     *            <code>Subject</code> can be used to uniquely identify a
     *            federated user.
     *            </p>
     *            <p>
     *            The following pseudocode shows how the hash value is
     *            calculated:
     *            </p>
     *            <p>
     *            <code>BASE64 ( SHA1 ( "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )</code>
     *            </p>
     */
    public void setNameQualifier(String nameQualifier) {
        this.nameQualifier = nameQualifier;
    }

    /**
     * <p>
     * A hash value based on the concatenation of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>Issuer</code> response value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * The friendly name (the last part of the ARN) of the SAML provider in IAM.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The combination of <code>NameQualifier</code> and <code>Subject</code>
     * can be used to uniquely identify a federated user.
     * </p>
     * <p>
     * The following pseudocode shows how the hash value is calculated:
     * </p>
     * <p>
     * <code>BASE64 ( SHA1 ( "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nameQualifier <p>
     *            A hash value based on the concatenation of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The <code>Issuer</code> response value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The Amazon Web Services account ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The friendly name (the last part of the ARN) of the SAML
     *            provider in IAM.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The combination of <code>NameQualifier</code> and
     *            <code>Subject</code> can be used to uniquely identify a
     *            federated user.
     *            </p>
     *            <p>
     *            The following pseudocode shows how the hash value is
     *            calculated:
     *            </p>
     *            <p>
     *            <code>BASE64 ( SHA1 ( "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithSAMLResult withNameQualifier(String nameQualifier) {
        this.nameQualifier = nameQualifier;
        return this;
    }

    /**
     * <p>
     * The value in the <code>SourceIdentity</code> attribute in the SAML
     * assertion.
     * </p>
     * <p>
     * You can require users to set a source identity value when they assume a
     * role. You do this by using the <code>sts:SourceIdentity</code> condition
     * key in a role trust policy. That way, actions that are taken with the
     * role are associated with that user. After the source identity is set, the
     * value cannot be changed. It is present in the request for all actions
     * that are taken by the role and persists across <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts#iam-term-role-chaining"
     * >chained role</a> sessions. You can configure your SAML identity provider
     * to use an attribute associated with your users, like user name or email,
     * as the source identity when calling <code>AssumeRoleWithSAML</code>. You
     * do this by adding an attribute to the SAML assertion. For more
     * information about using source identity, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     * >Monitor and control actions taken with assumed roles</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return <p>
     *         The value in the <code>SourceIdentity</code> attribute in the
     *         SAML assertion.
     *         </p>
     *         <p>
     *         You can require users to set a source identity value when they
     *         assume a role. You do this by using the
     *         <code>sts:SourceIdentity</code> condition key in a role trust
     *         policy. That way, actions that are taken with the role are
     *         associated with that user. After the source identity is set, the
     *         value cannot be changed. It is present in the request for all
     *         actions that are taken by the role and persists across <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts#iam-term-role-chaining"
     *         >chained role</a> sessions. You can configure your SAML identity
     *         provider to use an attribute associated with your users, like
     *         user name or email, as the source identity when calling
     *         <code>AssumeRoleWithSAML</code>. You do this by adding an
     *         attribute to the SAML assertion. For more information about using
     *         source identity, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     *         >Monitor and control actions taken with assumed roles</a> in the
     *         <i>IAM User Guide</i>.
     *         </p>
     *         <p>
     *         The regex used to validate this parameter is a string of
     *         characters consisting of upper- and lower-case alphanumeric
     *         characters with no spaces. You can also include underscores or
     *         any of the following characters: =,.@-
     *         </p>
     */
    public String getSourceIdentity() {
        return sourceIdentity;
    }

    /**
     * <p>
     * The value in the <code>SourceIdentity</code> attribute in the SAML
     * assertion.
     * </p>
     * <p>
     * You can require users to set a source identity value when they assume a
     * role. You do this by using the <code>sts:SourceIdentity</code> condition
     * key in a role trust policy. That way, actions that are taken with the
     * role are associated with that user. After the source identity is set, the
     * value cannot be changed. It is present in the request for all actions
     * that are taken by the role and persists across <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts#iam-term-role-chaining"
     * >chained role</a> sessions. You can configure your SAML identity provider
     * to use an attribute associated with your users, like user name or email,
     * as the source identity when calling <code>AssumeRoleWithSAML</code>. You
     * do this by adding an attribute to the SAML assertion. For more
     * information about using source identity, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     * >Monitor and control actions taken with assumed roles</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param sourceIdentity <p>
     *            The value in the <code>SourceIdentity</code> attribute in the
     *            SAML assertion.
     *            </p>
     *            <p>
     *            You can require users to set a source identity value when they
     *            assume a role. You do this by using the
     *            <code>sts:SourceIdentity</code> condition key in a role trust
     *            policy. That way, actions that are taken with the role are
     *            associated with that user. After the source identity is set,
     *            the value cannot be changed. It is present in the request for
     *            all actions that are taken by the role and persists across <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts#iam-term-role-chaining"
     *            >chained role</a> sessions. You can configure your SAML
     *            identity provider to use an attribute associated with your
     *            users, like user name or email, as the source identity when
     *            calling <code>AssumeRoleWithSAML</code>. You do this by adding
     *            an attribute to the SAML assertion. For more information about
     *            using source identity, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     *            >Monitor and control actions taken with assumed roles</a> in
     *            the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            The regex used to validate this parameter is a string of
     *            characters consisting of upper- and lower-case alphanumeric
     *            characters with no spaces. You can also include underscores or
     *            any of the following characters: =,.@-
     *            </p>
     */
    public void setSourceIdentity(String sourceIdentity) {
        this.sourceIdentity = sourceIdentity;
    }

    /**
     * <p>
     * The value in the <code>SourceIdentity</code> attribute in the SAML
     * assertion.
     * </p>
     * <p>
     * You can require users to set a source identity value when they assume a
     * role. You do this by using the <code>sts:SourceIdentity</code> condition
     * key in a role trust policy. That way, actions that are taken with the
     * role are associated with that user. After the source identity is set, the
     * value cannot be changed. It is present in the request for all actions
     * that are taken by the role and persists across <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts#iam-term-role-chaining"
     * >chained role</a> sessions. You can configure your SAML identity provider
     * to use an attribute associated with your users, like user name or email,
     * as the source identity when calling <code>AssumeRoleWithSAML</code>. You
     * do this by adding an attribute to the SAML assertion. For more
     * information about using source identity, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     * >Monitor and control actions taken with assumed roles</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@-
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param sourceIdentity <p>
     *            The value in the <code>SourceIdentity</code> attribute in the
     *            SAML assertion.
     *            </p>
     *            <p>
     *            You can require users to set a source identity value when they
     *            assume a role. You do this by using the
     *            <code>sts:SourceIdentity</code> condition key in a role trust
     *            policy. That way, actions that are taken with the role are
     *            associated with that user. After the source identity is set,
     *            the value cannot be changed. It is present in the request for
     *            all actions that are taken by the role and persists across <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts#iam-term-role-chaining"
     *            >chained role</a> sessions. You can configure your SAML
     *            identity provider to use an attribute associated with your
     *            users, like user name or email, as the source identity when
     *            calling <code>AssumeRoleWithSAML</code>. You do this by adding
     *            an attribute to the SAML assertion. For more information about
     *            using source identity, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     *            >Monitor and control actions taken with assumed roles</a> in
     *            the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            The regex used to validate this parameter is a string of
     *            characters consisting of upper- and lower-case alphanumeric
     *            characters with no spaces. You can also include underscores or
     *            any of the following characters: =,.@-
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithSAMLResult withSourceIdentity(String sourceIdentity) {
        this.sourceIdentity = sourceIdentity;
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
        if (getCredentials() != null)
            sb.append("Credentials: " + getCredentials() + ",");
        if (getAssumedRoleUser() != null)
            sb.append("AssumedRoleUser: " + getAssumedRoleUser() + ",");
        if (getPackedPolicySize() != null)
            sb.append("PackedPolicySize: " + getPackedPolicySize() + ",");
        if (getSubject() != null)
            sb.append("Subject: " + getSubject() + ",");
        if (getSubjectType() != null)
            sb.append("SubjectType: " + getSubjectType() + ",");
        if (getIssuer() != null)
            sb.append("Issuer: " + getIssuer() + ",");
        if (getAudience() != null)
            sb.append("Audience: " + getAudience() + ",");
        if (getNameQualifier() != null)
            sb.append("NameQualifier: " + getNameQualifier() + ",");
        if (getSourceIdentity() != null)
            sb.append("SourceIdentity: " + getSourceIdentity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime * hashCode
                + ((getAssumedRoleUser() == null) ? 0 : getAssumedRoleUser().hashCode());
        hashCode = prime * hashCode
                + ((getPackedPolicySize() == null) ? 0 : getPackedPolicySize().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode
                + ((getSubjectType() == null) ? 0 : getSubjectType().hashCode());
        hashCode = prime * hashCode + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        hashCode = prime * hashCode + ((getAudience() == null) ? 0 : getAudience().hashCode());
        hashCode = prime * hashCode
                + ((getNameQualifier() == null) ? 0 : getNameQualifier().hashCode());
        hashCode = prime * hashCode
                + ((getSourceIdentity() == null) ? 0 : getSourceIdentity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssumeRoleWithSAMLResult == false)
            return false;
        AssumeRoleWithSAMLResult other = (AssumeRoleWithSAMLResult) obj;

        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null
                && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        if (other.getAssumedRoleUser() == null ^ this.getAssumedRoleUser() == null)
            return false;
        if (other.getAssumedRoleUser() != null
                && other.getAssumedRoleUser().equals(this.getAssumedRoleUser()) == false)
            return false;
        if (other.getPackedPolicySize() == null ^ this.getPackedPolicySize() == null)
            return false;
        if (other.getPackedPolicySize() != null
                && other.getPackedPolicySize().equals(this.getPackedPolicySize()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getSubjectType() == null ^ this.getSubjectType() == null)
            return false;
        if (other.getSubjectType() != null
                && other.getSubjectType().equals(this.getSubjectType()) == false)
            return false;
        if (other.getIssuer() == null ^ this.getIssuer() == null)
            return false;
        if (other.getIssuer() != null && other.getIssuer().equals(this.getIssuer()) == false)
            return false;
        if (other.getAudience() == null ^ this.getAudience() == null)
            return false;
        if (other.getAudience() != null && other.getAudience().equals(this.getAudience()) == false)
            return false;
        if (other.getNameQualifier() == null ^ this.getNameQualifier() == null)
            return false;
        if (other.getNameQualifier() != null
                && other.getNameQualifier().equals(this.getNameQualifier()) == false)
            return false;
        if (other.getSourceIdentity() == null ^ this.getSourceIdentity() == null)
            return false;
        if (other.getSourceIdentity() != null
                && other.getSourceIdentity().equals(this.getSourceIdentity()) == false)
            return false;
        return true;
    }
}
