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
 * Contains information about an IAM role. This structure is returned as a
 * response element in several API operations that interact with roles.
 * </p>
 */
public class Role implements Serializable {
    /**
     * <p>
     * The path to the role. For more information about paths, see <a href=
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
     * The friendly name that identifies the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String roleName;

    /**
     * <p>
     * The stable and unique string identifying the role. For more information
     * about IDs, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     */
    private String roleId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the role. For more information
     * about ARNs and how to use them in policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i> guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String arn;

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the role was created.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * The policy that grants an entity permission to assume the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String assumeRolePolicyDocument;

    /**
     * <p>
     * A description of the role that you provide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     */
    private String description;

    /**
     * <p>
     * The maximum session duration (in seconds) for the specified role. Anyone
     * who uses the AWS CLI, or API to assume the role can specify the duration
     * using the optional <code>DurationSeconds</code> API parameter or
     * <code>duration-seconds</code> CLI parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3600 - 43200<br/>
     */
    private Integer maxSessionDuration;

    /**
     * <p>
     * The ARN of the policy used to set the permissions boundary for the role.
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
     * A list of tags that are attached to the specified role. For more
     * information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     * >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Contains information about the last time that an IAM role was used. This
     * includes the date and time and the Region in which the role was last
     * used. Activity is only reported for the trailing 400 days. This period
     * can be shorter if your Region began supporting these features within the
     * last year. The role might have been used more than 400 days ago. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period"
     * >Regions Where Data Is Tracked</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private RoleLastUsed roleLastUsed;

    /**
     * <p>
     * The path to the role. For more information about paths, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @return <p>
     *         The path to the role. For more information about paths, see <a
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
     * The path to the role. For more information about paths, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param path <p>
     *            The path to the role. For more information about paths, see <a
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
     * The path to the role. For more information about paths, see <a href=
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
     *            The path to the role. For more information about paths, see <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Role withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>
     * The friendly name that identifies the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The friendly name that identifies the role.
     *         </p>
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * <p>
     * The friendly name that identifies the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param roleName <p>
     *            The friendly name that identifies the role.
     *            </p>
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The friendly name that identifies the role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param roleName <p>
     *            The friendly name that identifies the role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Role withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * <p>
     * The stable and unique string identifying the role. For more information
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
     *         The stable and unique string identifying the role. For more
     *         information about IDs, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *         >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *         </p>
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * <p>
     * The stable and unique string identifying the role. For more information
     * about IDs, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param roleId <p>
     *            The stable and unique string identifying the role. For more
     *            information about IDs, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * <p>
     * The stable and unique string identifying the role. For more information
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
     * @param roleId <p>
     *            The stable and unique string identifying the role. For more
     *            information about IDs, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Role withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the role. For more information
     * about ARNs and how to use them in policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i> guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) specifying the role. For more
     *         information about ARNs and how to use them in policies, see <a
     *         href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *         >IAM Identifiers</a> in the <i>IAM User Guide</i> guide.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the role. For more information
     * about ARNs and how to use them in policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i> guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) specifying the role. For more
     *            information about ARNs and how to use them in policies, see <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i> guide.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the role. For more information
     * about ARNs and how to use them in policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i> guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) specifying the role. For more
     *            information about ARNs and how to use them in policies, see <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i> guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Role withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the role was created.
     * </p>
     *
     * @return <p>
     *         The date and time, in <a
     *         href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *         format</a>, when the role was created.
     *         </p>
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the role was created.
     * </p>
     *
     * @param createDate <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the role was created.
     *            </p>
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the role was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createDate <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the role was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Role withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * <p>
     * The policy that grants an entity permission to assume the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The policy that grants an entity permission to assume the role.
     *         </p>
     */
    public String getAssumeRolePolicyDocument() {
        return assumeRolePolicyDocument;
    }

    /**
     * <p>
     * The policy that grants an entity permission to assume the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param assumeRolePolicyDocument <p>
     *            The policy that grants an entity permission to assume the
     *            role.
     *            </p>
     */
    public void setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
    }

    /**
     * <p>
     * The policy that grants an entity permission to assume the role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param assumeRolePolicyDocument <p>
     *            The policy that grants an entity permission to assume the
     *            role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Role withAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
        return this;
    }

    /**
     * <p>
     * A description of the role that you provide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @return <p>
     *         A description of the role that you provide.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the role that you provide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @param description <p>
     *            A description of the role that you provide.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the role that you provide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @param description <p>
     *            A description of the role that you provide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Role withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The maximum session duration (in seconds) for the specified role. Anyone
     * who uses the AWS CLI, or API to assume the role can specify the duration
     * using the optional <code>DurationSeconds</code> API parameter or
     * <code>duration-seconds</code> CLI parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3600 - 43200<br/>
     *
     * @return <p>
     *         The maximum session duration (in seconds) for the specified role.
     *         Anyone who uses the AWS CLI, or API to assume the role can
     *         specify the duration using the optional
     *         <code>DurationSeconds</code> API parameter or
     *         <code>duration-seconds</code> CLI parameter.
     *         </p>
     */
    public Integer getMaxSessionDuration() {
        return maxSessionDuration;
    }

    /**
     * <p>
     * The maximum session duration (in seconds) for the specified role. Anyone
     * who uses the AWS CLI, or API to assume the role can specify the duration
     * using the optional <code>DurationSeconds</code> API parameter or
     * <code>duration-seconds</code> CLI parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3600 - 43200<br/>
     *
     * @param maxSessionDuration <p>
     *            The maximum session duration (in seconds) for the specified
     *            role. Anyone who uses the AWS CLI, or API to assume the role
     *            can specify the duration using the optional
     *            <code>DurationSeconds</code> API parameter or
     *            <code>duration-seconds</code> CLI parameter.
     *            </p>
     */
    public void setMaxSessionDuration(Integer maxSessionDuration) {
        this.maxSessionDuration = maxSessionDuration;
    }

    /**
     * <p>
     * The maximum session duration (in seconds) for the specified role. Anyone
     * who uses the AWS CLI, or API to assume the role can specify the duration
     * using the optional <code>DurationSeconds</code> API parameter or
     * <code>duration-seconds</code> CLI parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3600 - 43200<br/>
     *
     * @param maxSessionDuration <p>
     *            The maximum session duration (in seconds) for the specified
     *            role. Anyone who uses the AWS CLI, or API to assume the role
     *            can specify the duration using the optional
     *            <code>DurationSeconds</code> API parameter or
     *            <code>duration-seconds</code> CLI parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Role withMaxSessionDuration(Integer maxSessionDuration) {
        this.maxSessionDuration = maxSessionDuration;
        return this;
    }

    /**
     * <p>
     * The ARN of the policy used to set the permissions boundary for the role.
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
     *         the role.
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
     * The ARN of the policy used to set the permissions boundary for the role.
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
     *            the role.
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
     * The ARN of the policy used to set the permissions boundary for the role.
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
     *            the role.
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
    public Role withPermissionsBoundary(AttachedPermissionsBoundary permissionsBoundary) {
        this.permissionsBoundary = permissionsBoundary;
        return this;
    }

    /**
     * <p>
     * A list of tags that are attached to the specified role. For more
     * information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     * >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     * </p>
     *
     * @return <p>
     *         A list of tags that are attached to the specified role. For more
     *         information about tagging, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     *         >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags that are attached to the specified role. For more
     * information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     * >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     * </p>
     *
     * @param tags <p>
     *            A list of tags that are attached to the specified role. For
     *            more information about tagging, see <a href=
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
     * A list of tags that are attached to the specified role. For more
     * information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     * >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags that are attached to the specified role. For
     *            more information about tagging, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     *            >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Role withTags(Tag... tags) {
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
     * A list of tags that are attached to the specified role. For more
     * information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     * >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags that are attached to the specified role. For
     *            more information about tagging, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     *            >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Role withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Contains information about the last time that an IAM role was used. This
     * includes the date and time and the Region in which the role was last
     * used. Activity is only reported for the trailing 400 days. This period
     * can be shorter if your Region began supporting these features within the
     * last year. The role might have been used more than 400 days ago. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period"
     * >Regions Where Data Is Tracked</a> in the <i>IAM User Guide</i>.
     * </p>
     *
     * @return <p>
     *         Contains information about the last time that an IAM role was
     *         used. This includes the date and time and the Region in which the
     *         role was last used. Activity is only reported for the trailing
     *         400 days. This period can be shorter if your Region began
     *         supporting these features within the last year. The role might
     *         have been used more than 400 days ago. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period"
     *         >Regions Where Data Is Tracked</a> in the <i>IAM User Guide</i>.
     *         </p>
     */
    public RoleLastUsed getRoleLastUsed() {
        return roleLastUsed;
    }

    /**
     * <p>
     * Contains information about the last time that an IAM role was used. This
     * includes the date and time and the Region in which the role was last
     * used. Activity is only reported for the trailing 400 days. This period
     * can be shorter if your Region began supporting these features within the
     * last year. The role might have been used more than 400 days ago. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period"
     * >Regions Where Data Is Tracked</a> in the <i>IAM User Guide</i>.
     * </p>
     *
     * @param roleLastUsed <p>
     *            Contains information about the last time that an IAM role was
     *            used. This includes the date and time and the Region in which
     *            the role was last used. Activity is only reported for the
     *            trailing 400 days. This period can be shorter if your Region
     *            began supporting these features within the last year. The role
     *            might have been used more than 400 days ago. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period"
     *            >Regions Where Data Is Tracked</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     */
    public void setRoleLastUsed(RoleLastUsed roleLastUsed) {
        this.roleLastUsed = roleLastUsed;
    }

    /**
     * <p>
     * Contains information about the last time that an IAM role was used. This
     * includes the date and time and the Region in which the role was last
     * used. Activity is only reported for the trailing 400 days. This period
     * can be shorter if your Region began supporting these features within the
     * last year. The role might have been used more than 400 days ago. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period"
     * >Regions Where Data Is Tracked</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleLastUsed <p>
     *            Contains information about the last time that an IAM role was
     *            used. This includes the date and time and the Region in which
     *            the role was last used. Activity is only reported for the
     *            trailing 400 days. This period can be shorter if your Region
     *            began supporting these features within the last year. The role
     *            might have been used more than 400 days ago. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period"
     *            >Regions Where Data Is Tracked</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Role withRoleLastUsed(RoleLastUsed roleLastUsed) {
        this.roleLastUsed = roleLastUsed;
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
        if (getRoleName() != null)
            sb.append("RoleName: " + getRoleName() + ",");
        if (getRoleId() != null)
            sb.append("RoleId: " + getRoleId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getCreateDate() != null)
            sb.append("CreateDate: " + getCreateDate() + ",");
        if (getAssumeRolePolicyDocument() != null)
            sb.append("AssumeRolePolicyDocument: " + getAssumeRolePolicyDocument() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getMaxSessionDuration() != null)
            sb.append("MaxSessionDuration: " + getMaxSessionDuration() + ",");
        if (getPermissionsBoundary() != null)
            sb.append("PermissionsBoundary: " + getPermissionsBoundary() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getRoleLastUsed() != null)
            sb.append("RoleLastUsed: " + getRoleLastUsed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssumeRolePolicyDocument() == null) ? 0 : getAssumeRolePolicyDocument()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getMaxSessionDuration() == null) ? 0 : getMaxSessionDuration().hashCode());
        hashCode = prime * hashCode
                + ((getPermissionsBoundary() == null) ? 0 : getPermissionsBoundary().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getRoleLastUsed() == null) ? 0 : getRoleLastUsed().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Role == false)
            return false;
        Role other = (Role) obj;

        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getRoleId() == null ^ this.getRoleId() == null)
            return false;
        if (other.getRoleId() != null && other.getRoleId().equals(this.getRoleId()) == false)
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
        if (other.getAssumeRolePolicyDocument() == null
                ^ this.getAssumeRolePolicyDocument() == null)
            return false;
        if (other.getAssumeRolePolicyDocument() != null
                && other.getAssumeRolePolicyDocument().equals(this.getAssumeRolePolicyDocument()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getMaxSessionDuration() == null ^ this.getMaxSessionDuration() == null)
            return false;
        if (other.getMaxSessionDuration() != null
                && other.getMaxSessionDuration().equals(this.getMaxSessionDuration()) == false)
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
        if (other.getRoleLastUsed() == null ^ this.getRoleLastUsed() == null)
            return false;
        if (other.getRoleLastUsed() != null
                && other.getRoleLastUsed().equals(this.getRoleLastUsed()) == false)
            return false;
        return true;
    }
}
