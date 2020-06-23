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
 * Contains information about a root, OU, or account that a policy is attached
 * to.
 * </p>
 */
public class PolicyTargetSummary implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) of the policy target.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * target ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: A string that begins with "r-" followed by from 4 to 32 lower-case
     * letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Account: A string that consists of exactly 12 digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): A string that begins with "ou-" followed by
     * from 4 to 32 lower-case letters or digits (the ID of the root that the OU
     * is in). This string is followed by a second "-" dash and from 8 to 32
     * additional lower-case letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(r-[0-9a-z]{4,32})|(\d{12})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$<br/>
     */
    private String targetId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy target.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     * >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations
     * User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:organizations::.+:.+<br/>
     */
    private String arn;

    /**
     * <p>
     * The friendly name of the policy target.
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
     * The type of the policy target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATIONAL_UNIT, ROOT
     */
    private String type;

    /**
     * <p>
     * The unique identifier (ID) of the policy target.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * target ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: A string that begins with "r-" followed by from 4 to 32 lower-case
     * letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Account: A string that consists of exactly 12 digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): A string that begins with "ou-" followed by
     * from 4 to 32 lower-case letters or digits (the ID of the root that the OU
     * is in). This string is followed by a second "-" dash and from 8 to 32
     * additional lower-case letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(r-[0-9a-z]{4,32})|(\d{12})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$<br/>
     *
     * @return <p>
     *         The unique identifier (ID) of the policy target.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for a target ID string requires one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Root: A string that begins with "r-" followed by from 4 to 32
     *         lower-case letters or digits.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Account: A string that consists of exactly 12 digits.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Organizational unit (OU): A string that begins with "ou-"
     *         followed by from 4 to 32 lower-case letters or digits (the ID of
     *         the root that the OU is in). This string is followed by a second
     *         "-" dash and from 8 to 32 additional lower-case letters or
     *         digits.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the policy target.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * target ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: A string that begins with "r-" followed by from 4 to 32 lower-case
     * letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Account: A string that consists of exactly 12 digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): A string that begins with "ou-" followed by
     * from 4 to 32 lower-case letters or digits (the ID of the root that the OU
     * is in). This string is followed by a second "-" dash and from 8 to 32
     * additional lower-case letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(r-[0-9a-z]{4,32})|(\d{12})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$<br/>
     *
     * @param targetId <p>
     *            The unique identifier (ID) of the policy target.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a target ID string requires one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Root: A string that begins with "r-" followed by from 4 to 32
     *            lower-case letters or digits.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Account: A string that consists of exactly 12 digits.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Organizational unit (OU): A string that begins with "ou-"
     *            followed by from 4 to 32 lower-case letters or digits (the ID
     *            of the root that the OU is in). This string is followed by a
     *            second "-" dash and from 8 to 32 additional lower-case letters
     *            or digits.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the policy target.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * target ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: A string that begins with "r-" followed by from 4 to 32 lower-case
     * letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Account: A string that consists of exactly 12 digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): A string that begins with "ou-" followed by
     * from 4 to 32 lower-case letters or digits (the ID of the root that the OU
     * is in). This string is followed by a second "-" dash and from 8 to 32
     * additional lower-case letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(r-[0-9a-z]{4,32})|(\d{12})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$<br/>
     *
     * @param targetId <p>
     *            The unique identifier (ID) of the policy target.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a target ID string requires one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Root: A string that begins with "r-" followed by from 4 to 32
     *            lower-case letters or digits.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Account: A string that consists of exactly 12 digits.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Organizational unit (OU): A string that begins with "ou-"
     *            followed by from 4 to 32 lower-case letters or digits (the ID
     *            of the root that the OU is in). This string is followed by a
     *            second "-" dash and from 8 to 32 additional lower-case letters
     *            or digits.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyTargetSummary withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy target.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     * >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations
     * User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:organizations::.+:.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the policy target.
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
     * The Amazon Resource Name (ARN) of the policy target.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     * >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations
     * User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws:organizations::.+:.+<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the policy target.
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
     * The Amazon Resource Name (ARN) of the policy target.
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
     * <b>Pattern: </b>^arn:aws:organizations::.+:.+<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the policy target.
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
    public PolicyTargetSummary withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The friendly name of the policy target.
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
     *         The friendly name of the policy target.
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
     * The friendly name of the policy target.
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
     *            The friendly name of the policy target.
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
     * The friendly name of the policy target.
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
     *            The friendly name of the policy target.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> that is used to validate this parameter is a
     *            string of any of the characters in the ASCII character range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyTargetSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of the policy target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATIONAL_UNIT, ROOT
     *
     * @return <p>
     *         The type of the policy target.
     *         </p>
     * @see TargetType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the policy target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATIONAL_UNIT, ROOT
     *
     * @param type <p>
     *            The type of the policy target.
     *            </p>
     * @see TargetType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the policy target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATIONAL_UNIT, ROOT
     *
     * @param type <p>
     *            The type of the policy target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetType
     */
    public PolicyTargetSummary withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the policy target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATIONAL_UNIT, ROOT
     *
     * @param type <p>
     *            The type of the policy target.
     *            </p>
     * @see TargetType
     */
    public void setType(TargetType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the policy target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATIONAL_UNIT, ROOT
     *
     * @param type <p>
     *            The type of the policy target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetType
     */
    public PolicyTargetSummary withType(TargetType type) {
        this.type = type.toString();
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
        if (getTargetId() != null)
            sb.append("TargetId: " + getTargetId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyTargetSummary == false)
            return false;
        PolicyTargetSummary other = (PolicyTargetSummary) obj;

        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
