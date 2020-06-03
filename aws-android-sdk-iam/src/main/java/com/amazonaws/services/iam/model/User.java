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
 * Contains information about an IAM user entity.
 * </p>
 * <p>
 * This data type is used as a response element in the following operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateUser</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetUser</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListUsers</a>
 * </p>
 * </li>
 * </ul>
 */
public class User implements Serializable {
    /**
     * <p>
     * The path to the user. For more information about paths, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     */
    private String path;

    /**
     * <p>
     * The friendly name identifying the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String userName;

    /**
     * <p>
     * The stable and unique string identifying the user. For more information
     * about IDs, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     */
    private String userId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the user. For more
     * information about ARNs and how to use ARNs in policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String arn;

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the user was created.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the user's password was last used to sign in
     * to an AWS website. For a list of AWS websites that capture a user's last
     * sign-in time, see the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html"
     * >Credential Reports</a> topic in the <i>IAM User Guide</i>. If a password
     * is used more than once in a five-minute span, only the first use is
     * returned in this field. If the field is null (no value), then it
     * indicates that they never signed in with a password. This can be because:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user never had a password.
     * </p>
     * </li>
     * <li>
     * <p>
     * A password exists but has not been used since IAM started tracking this
     * information on October 20, 2014.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A null value does not mean that the user <i>never</i> had a password.
     * Also, if the user does not currently have a password but had one in the
     * past, then this field contains the date and time the most recent password
     * was used.
     * </p>
     * <p>
     * This value is returned only in the <a>GetUser</a> and <a>ListUsers</a>
     * operations.
     * </p>
     */
    private java.util.Date passwordLastUsed;

    /**
     * <p>
     * The ARN of the policy used to set the permissions boundary for the user.
     * </p>
     * <p>
     * For more information about permissions boundaries, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html"
     * >Permissions Boundaries for IAM Identities </a> in the <i>IAM User
     * Guide</i>.
     * </p>
     */
    private AttachedPermissionsBoundary permissionsBoundary;

    /**
     * <p>
     * A list of tags that are associated with the specified user. For more
     * information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     * >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The path to the user. For more information about paths, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @return <p>
     *         The path to the user. For more information about paths, see <a
     *         href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *         >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The path to the user. For more information about paths, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param path <p>
     *            The path to the user. For more information about paths, see <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the user. For more information about paths, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param path <p>
     *            The path to the user. For more information about paths, see <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>
     * The friendly name identifying the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The friendly name identifying the user.
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The friendly name identifying the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The friendly name identifying the user.
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The friendly name identifying the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The friendly name identifying the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * The stable and unique string identifying the user. For more information
     * about IDs, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @return <p>
     *         The stable and unique string identifying the user. For more
     *         information about IDs, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *         >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The stable and unique string identifying the user. For more information
     * about IDs, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param userId <p>
     *            The stable and unique string identifying the user. For more
     *            information about IDs, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The stable and unique string identifying the user. For more information
     * about IDs, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param userId <p>
     *            The stable and unique string identifying the user. For more
     *            information about IDs, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the user. For more
     * information about ARNs and how to use ARNs in policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) that identifies the user. For more
     *         information about ARNs and how to use ARNs in policies, see <a
     *         href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *         >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the user. For more
     * information about ARNs and how to use ARNs in policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) that identifies the user. For
     *            more information about ARNs and how to use ARNs in policies,
     *            see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the user. For more
     * information about ARNs and how to use ARNs in policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) that identifies the user. For
     *            more information about ARNs and how to use ARNs in policies,
     *            see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the user was created.
     * </p>
     *
     * @return <p>
     *         The date and time, in <a
     *         href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *         format</a>, when the user was created.
     *         </p>
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the user was created.
     * </p>
     *
     * @param createDate <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the user was created.
     *            </p>
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the user was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createDate <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the user was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the user's password was last used to sign in
     * to an AWS website. For a list of AWS websites that capture a user's last
     * sign-in time, see the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html"
     * >Credential Reports</a> topic in the <i>IAM User Guide</i>. If a password
     * is used more than once in a five-minute span, only the first use is
     * returned in this field. If the field is null (no value), then it
     * indicates that they never signed in with a password. This can be because:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user never had a password.
     * </p>
     * </li>
     * <li>
     * <p>
     * A password exists but has not been used since IAM started tracking this
     * information on October 20, 2014.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A null value does not mean that the user <i>never</i> had a password.
     * Also, if the user does not currently have a password but had one in the
     * past, then this field contains the date and time the most recent password
     * was used.
     * </p>
     * <p>
     * This value is returned only in the <a>GetUser</a> and <a>ListUsers</a>
     * operations.
     * </p>
     *
     * @return <p>
     *         The date and time, in <a
     *         href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *         format</a>, when the user's password was last used to sign in to
     *         an AWS website. For a list of AWS websites that capture a user's
     *         last sign-in time, see the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html"
     *         >Credential Reports</a> topic in the <i>IAM User Guide</i>. If a
     *         password is used more than once in a five-minute span, only the
     *         first use is returned in this field. If the field is null (no
     *         value), then it indicates that they never signed in with a
     *         password. This can be because:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The user never had a password.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A password exists but has not been used since IAM started
     *         tracking this information on October 20, 2014.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         A null value does not mean that the user <i>never</i> had a
     *         password. Also, if the user does not currently have a password
     *         but had one in the past, then this field contains the date and
     *         time the most recent password was used.
     *         </p>
     *         <p>
     *         This value is returned only in the <a>GetUser</a> and
     *         <a>ListUsers</a> operations.
     *         </p>
     */
    public java.util.Date getPasswordLastUsed() {
        return passwordLastUsed;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the user's password was last used to sign in
     * to an AWS website. For a list of AWS websites that capture a user's last
     * sign-in time, see the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html"
     * >Credential Reports</a> topic in the <i>IAM User Guide</i>. If a password
     * is used more than once in a five-minute span, only the first use is
     * returned in this field. If the field is null (no value), then it
     * indicates that they never signed in with a password. This can be because:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user never had a password.
     * </p>
     * </li>
     * <li>
     * <p>
     * A password exists but has not been used since IAM started tracking this
     * information on October 20, 2014.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A null value does not mean that the user <i>never</i> had a password.
     * Also, if the user does not currently have a password but had one in the
     * past, then this field contains the date and time the most recent password
     * was used.
     * </p>
     * <p>
     * This value is returned only in the <a>GetUser</a> and <a>ListUsers</a>
     * operations.
     * </p>
     *
     * @param passwordLastUsed <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the user's password was last used to sign in
     *            to an AWS website. For a list of AWS websites that capture a
     *            user's last sign-in time, see the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html"
     *            >Credential Reports</a> topic in the <i>IAM User Guide</i>. If
     *            a password is used more than once in a five-minute span, only
     *            the first use is returned in this field. If the field is null
     *            (no value), then it indicates that they never signed in with a
     *            password. This can be because:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The user never had a password.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A password exists but has not been used since IAM started
     *            tracking this information on October 20, 2014.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            A null value does not mean that the user <i>never</i> had a
     *            password. Also, if the user does not currently have a password
     *            but had one in the past, then this field contains the date and
     *            time the most recent password was used.
     *            </p>
     *            <p>
     *            This value is returned only in the <a>GetUser</a> and
     *            <a>ListUsers</a> operations.
     *            </p>
     */
    public void setPasswordLastUsed(java.util.Date passwordLastUsed) {
        this.passwordLastUsed = passwordLastUsed;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the user's password was last used to sign in
     * to an AWS website. For a list of AWS websites that capture a user's last
     * sign-in time, see the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html"
     * >Credential Reports</a> topic in the <i>IAM User Guide</i>. If a password
     * is used more than once in a five-minute span, only the first use is
     * returned in this field. If the field is null (no value), then it
     * indicates that they never signed in with a password. This can be because:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user never had a password.
     * </p>
     * </li>
     * <li>
     * <p>
     * A password exists but has not been used since IAM started tracking this
     * information on October 20, 2014.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A null value does not mean that the user <i>never</i> had a password.
     * Also, if the user does not currently have a password but had one in the
     * past, then this field contains the date and time the most recent password
     * was used.
     * </p>
     * <p>
     * This value is returned only in the <a>GetUser</a> and <a>ListUsers</a>
     * operations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param passwordLastUsed <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the user's password was last used to sign in
     *            to an AWS website. For a list of AWS websites that capture a
     *            user's last sign-in time, see the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html"
     *            >Credential Reports</a> topic in the <i>IAM User Guide</i>. If
     *            a password is used more than once in a five-minute span, only
     *            the first use is returned in this field. If the field is null
     *            (no value), then it indicates that they never signed in with a
     *            password. This can be because:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The user never had a password.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A password exists but has not been used since IAM started
     *            tracking this information on October 20, 2014.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            A null value does not mean that the user <i>never</i> had a
     *            password. Also, if the user does not currently have a password
     *            but had one in the past, then this field contains the date and
     *            time the most recent password was used.
     *            </p>
     *            <p>
     *            This value is returned only in the <a>GetUser</a> and
     *            <a>ListUsers</a> operations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withPasswordLastUsed(java.util.Date passwordLastUsed) {
        this.passwordLastUsed = passwordLastUsed;
        return this;
    }

    /**
     * <p>
     * The ARN of the policy used to set the permissions boundary for the user.
     * </p>
     * <p>
     * For more information about permissions boundaries, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html"
     * >Permissions Boundaries for IAM Identities </a> in the <i>IAM User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         The ARN of the policy used to set the permissions boundary for
     *         the user.
     *         </p>
     *         <p>
     *         For more information about permissions boundaries, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html"
     *         >Permissions Boundaries for IAM Identities </a> in the <i>IAM
     *         User Guide</i>.
     *         </p>
     */
    public AttachedPermissionsBoundary getPermissionsBoundary() {
        return permissionsBoundary;
    }

    /**
     * <p>
     * The ARN of the policy used to set the permissions boundary for the user.
     * </p>
     * <p>
     * For more information about permissions boundaries, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html"
     * >Permissions Boundaries for IAM Identities </a> in the <i>IAM User
     * Guide</i>.
     * </p>
     *
     * @param permissionsBoundary <p>
     *            The ARN of the policy used to set the permissions boundary for
     *            the user.
     *            </p>
     *            <p>
     *            For more information about permissions boundaries, see <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html"
     *            >Permissions Boundaries for IAM Identities </a> in the <i>IAM
     *            User Guide</i>.
     *            </p>
     */
    public void setPermissionsBoundary(AttachedPermissionsBoundary permissionsBoundary) {
        this.permissionsBoundary = permissionsBoundary;
    }

    /**
     * <p>
     * The ARN of the policy used to set the permissions boundary for the user.
     * </p>
     * <p>
     * For more information about permissions boundaries, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html"
     * >Permissions Boundaries for IAM Identities </a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissionsBoundary <p>
     *            The ARN of the policy used to set the permissions boundary for
     *            the user.
     *            </p>
     *            <p>
     *            For more information about permissions boundaries, see <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html"
     *            >Permissions Boundaries for IAM Identities </a> in the <i>IAM
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withPermissionsBoundary(AttachedPermissionsBoundary permissionsBoundary) {
        this.permissionsBoundary = permissionsBoundary;
        return this;
    }

    /**
     * <p>
     * A list of tags that are associated with the specified user. For more
     * information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     * >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     * </p>
     *
     * @return <p>
     *         A list of tags that are associated with the specified user. For
     *         more information about tagging, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     *         >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags that are associated with the specified user. For more
     * information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     * >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     * </p>
     *
     * @param tags <p>
     *            A list of tags that are associated with the specified user.
     *            For more information about tagging, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     *            >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags that are associated with the specified user. For more
     * information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     * >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags that are associated with the specified user.
     *            For more information about tagging, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     *            >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags that are associated with the specified user. For more
     * information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     * >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags that are associated with the specified user.
     *            For more information about tagging, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     *            >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getPath() != null)
            sb.append("Path: " + getPath() + ",");
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getUserId() != null)
            sb.append("UserId: " + getUserId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getCreateDate() != null)
            sb.append("CreateDate: " + getCreateDate() + ",");
        if (getPasswordLastUsed() != null)
            sb.append("PasswordLastUsed: " + getPasswordLastUsed() + ",");
        if (getPermissionsBoundary() != null)
            sb.append("PermissionsBoundary: " + getPermissionsBoundary() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode
                + ((getPasswordLastUsed() == null) ? 0 : getPasswordLastUsed().hashCode());
        hashCode = prime * hashCode
                + ((getPermissionsBoundary() == null) ? 0 : getPermissionsBoundary().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof User == false)
            return false;
        User other = (User) obj;

        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null
                && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getPasswordLastUsed() == null ^ this.getPasswordLastUsed() == null)
            return false;
        if (other.getPasswordLastUsed() != null
                && other.getPasswordLastUsed().equals(this.getPasswordLastUsed()) == false)
            return false;
        if (other.getPermissionsBoundary() == null ^ this.getPermissionsBoundary() == null)
            return false;
        if (other.getPermissionsBoundary() != null
                && other.getPermissionsBoundary().equals(this.getPermissionsBoundary()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
