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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a policy, but does not include the content. To see
 * the content of a policy, see <a>DescribePolicy</a>.
 * </p>
 */
public class PolicySummary implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) of the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * policy ID string requires "p-" followed by from 8 to 128 lower-case
     * letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^p-[0-9a-zA-Z_]{8,128}$<br/>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     * >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations
     * User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(arn:aws:organizations::\d{12}:policy\/o-[a-z0-9]{10,32}\
     * /[0-9a-z_]+\
     * /p-[0-9a-z]{10,32})|(arn:aws:organizations::aws:policy\/[0-9a-
     * z_]+\/p-[0-9a-zA-Z_]{10,128})<br/>
     */
    private String arn;

    /**
     * <p>
     * The friendly name of the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter is a string of any of the characters in
     * the ASCII character range.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String name;

    /**
     * <p>
     * The description of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     */
    private String description;

    /**
     * <p>
     * The type of policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_CONTROL_POLICY, TAG_POLICY
     */
    private String type;

    /**
     * <p>
     * A boolean value that indicates whether the specified policy is an AWS
     * managed policy. If true, then you can attach the policy to roots, OUs, or
     * accounts, but you cannot edit it.
     * </p>
     */
    private Boolean awsManaged;

    /**
     * <p>
     * The unique identifier (ID) of the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * policy ID string requires "p-" followed by from 8 to 128 lower-case
     * letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^p-[0-9a-zA-Z_]{8,128}$<br/>
     *
     * @return <p>
     *         The unique identifier (ID) of the policy.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for a policy ID string requires "p-" followed by from 8 to 128
     *         lower-case letters or digits.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier (ID) of the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * policy ID string requires "p-" followed by from 8 to 128 lower-case
     * letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^p-[0-9a-zA-Z_]{8,128}$<br/>
     *
     * @param id <p>
     *            The unique identifier (ID) of the policy.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a policy ID string requires "p-" followed by
     *            from 8 to 128 lower-case letters or digits.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier (ID) of the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * policy ID string requires "p-" followed by from 8 to 128 lower-case
     * letters or digits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^p-[0-9a-zA-Z_]{8,128}$<br/>
     *
     * @param id <p>
     *            The unique identifier (ID) of the policy.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a policy ID string requires "p-" followed by
     *            from 8 to 128 lower-case letters or digits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicySummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     * >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations
     * User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(arn:aws:organizations::\d{12}:policy\/o-[a-z0-9]{10,32}\
     * /[0-9a-z_]+\
     * /p-[0-9a-z]{10,32})|(arn:aws:organizations::aws:policy\/[0-9a-
     * z_]+\/p-[0-9a-zA-Z_]{10,128})<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the policy.
     *         </p>
     *         <p>
     *         For more information about ARNs in Organizations, see <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     *         >ARN Formats Supported by Organizations</a> in the <i>AWS
     *         Organizations User Guide</i>.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     * >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations
     * User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(arn:aws:organizations::\d{12}:policy\/o-[a-z0-9]{10,32}\
     * /[0-9a-z_]+\
     * /p-[0-9a-z]{10,32})|(arn:aws:organizations::aws:policy\/[0-9a-
     * z_]+\/p-[0-9a-zA-Z_]{10,128})<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the policy.
     *            </p>
     *            <p>
     *            For more information about ARNs in Organizations, see <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     *            >ARN Formats Supported by Organizations</a> in the <i>AWS
     *            Organizations User Guide</i>.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     * >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(arn:aws:organizations::\d{12}:policy\/o-[a-z0-9]{10,32}\
     * /[0-9a-z_]+\
     * /p-[0-9a-z]{10,32})|(arn:aws:organizations::aws:policy\/[0-9a-
     * z_]+\/p-[0-9a-zA-Z_]{10,128})<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the policy.
     *            </p>
     *            <p>
     *            For more information about ARNs in Organizations, see <a href=
     *            "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     *            >ARN Formats Supported by Organizations</a> in the <i>AWS
     *            Organizations User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicySummary withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The friendly name of the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter is a string of any of the characters in
     * the ASCII character range.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The friendly name of the policy.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         that is used to validate this parameter is a string of any of the
     *         characters in the ASCII character range.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The friendly name of the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter is a string of any of the characters in
     * the ASCII character range.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param name <p>
     *            The friendly name of the policy.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> that is used to validate this parameter is a
     *            string of any of the characters in the ASCII character range.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name of the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter is a string of any of the characters in
     * the ASCII character range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param name <p>
     *            The friendly name of the policy.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> that is used to validate this parameter is a
     *            string of any of the characters in the ASCII character range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicySummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     *
     * @return <p>
     *         The description of the policy.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     *
     * @param description <p>
     *            The description of the policy.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     *
     * @param description <p>
     *            The description of the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicySummary withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The type of policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_CONTROL_POLICY, TAG_POLICY
     *
     * @return <p>
     *         The type of policy.
     *         </p>
     * @see PolicyType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_CONTROL_POLICY, TAG_POLICY
     *
     * @param type <p>
     *            The type of policy.
     *            </p>
     * @see PolicyType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_CONTROL_POLICY, TAG_POLICY
     *
     * @param type <p>
     *            The type of policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicyType
     */
    public PolicySummary withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_CONTROL_POLICY, TAG_POLICY
     *
     * @param type <p>
     *            The type of policy.
     *            </p>
     * @see PolicyType
     */
    public void setType(PolicyType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_CONTROL_POLICY, TAG_POLICY
     *
     * @param type <p>
     *            The type of policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicyType
     */
    public PolicySummary withType(PolicyType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A boolean value that indicates whether the specified policy is an AWS
     * managed policy. If true, then you can attach the policy to roots, OUs, or
     * accounts, but you cannot edit it.
     * </p>
     *
     * @return <p>
     *         A boolean value that indicates whether the specified policy is an
     *         AWS managed policy. If true, then you can attach the policy to
     *         roots, OUs, or accounts, but you cannot edit it.
     *         </p>
     */
    public Boolean isAwsManaged() {
        return awsManaged;
    }

    /**
     * <p>
     * A boolean value that indicates whether the specified policy is an AWS
     * managed policy. If true, then you can attach the policy to roots, OUs, or
     * accounts, but you cannot edit it.
     * </p>
     *
     * @return <p>
     *         A boolean value that indicates whether the specified policy is an
     *         AWS managed policy. If true, then you can attach the policy to
     *         roots, OUs, or accounts, but you cannot edit it.
     *         </p>
     */
    public Boolean getAwsManaged() {
        return awsManaged;
    }

    /**
     * <p>
     * A boolean value that indicates whether the specified policy is an AWS
     * managed policy. If true, then you can attach the policy to roots, OUs, or
     * accounts, but you cannot edit it.
     * </p>
     *
     * @param awsManaged <p>
     *            A boolean value that indicates whether the specified policy is
     *            an AWS managed policy. If true, then you can attach the policy
     *            to roots, OUs, or accounts, but you cannot edit it.
     *            </p>
     */
    public void setAwsManaged(Boolean awsManaged) {
        this.awsManaged = awsManaged;
    }

    /**
     * <p>
     * A boolean value that indicates whether the specified policy is an AWS
     * managed policy. If true, then you can attach the policy to roots, OUs, or
     * accounts, but you cannot edit it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsManaged <p>
     *            A boolean value that indicates whether the specified policy is
     *            an AWS managed policy. If true, then you can attach the policy
     *            to roots, OUs, or accounts, but you cannot edit it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicySummary withAwsManaged(Boolean awsManaged) {
        this.awsManaged = awsManaged;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getAwsManaged() != null)
            sb.append("AwsManaged: " + getAwsManaged());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getAwsManaged() == null) ? 0 : getAwsManaged().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicySummary == false)
            return false;
        PolicySummary other = (PolicySummary) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAwsManaged() == null ^ this.getAwsManaged() == null)
            return false;
        if (other.getAwsManaged() != null
                && other.getAwsManaged().equals(this.getAwsManaged()) == false)
            return false;
        return true;
    }
}
