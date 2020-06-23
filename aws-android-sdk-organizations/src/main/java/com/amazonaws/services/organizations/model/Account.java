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
 * Contains information about an AWS account that is a member of an
 * organization.
 * </p>
 */
public class Account implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) of the account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * account ID string requires exactly 12 digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account.
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
     * </b>^arn:aws:organizations::\d{12}:account\/o-[a-z0-9]{10,32}\/\d{12}
     * <br/>
     */
    private String arn;

    /**
     * <p>
     * The email address associated with the AWS account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this
     * parameter is a string of characters that represents a standard internet
     * email address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 64<br/>
     * <b>Pattern: </b>[^\s@]+@[^\s@]+\.[^\s@]+<br/>
     */
    private String email;

    /**
     * <p>
     * The friendly name of the account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter is a string of any of the characters in
     * the ASCII character range.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[ -\u007E]+<br/>
     */
    private String name;

    /**
     * <p>
     * The status of the account in the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, SUSPENDED
     */
    private String status;

    /**
     * <p>
     * The method by which the account joined the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVITED, CREATED
     */
    private String joinedMethod;

    /**
     * <p>
     * The date the account became a part of the organization.
     * </p>
     */
    private java.util.Date joinedTimestamp;

    /**
     * <p>
     * The unique identifier (ID) of the account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * account ID string requires exactly 12 digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @return <p>
     *         The unique identifier (ID) of the account.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for an account ID string requires exactly 12 digits.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier (ID) of the account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * account ID string requires exactly 12 digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param id <p>
     *            The unique identifier (ID) of the account.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for an account ID string requires exactly 12
     *            digits.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier (ID) of the account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * account ID string requires exactly 12 digits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param id <p>
     *            The unique identifier (ID) of the account.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for an account ID string requires exactly 12
     *            digits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Account withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account.
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
     * </b>^arn:aws:organizations::\d{12}:account\/o-[a-z0-9]{10,32}\/\d{12}
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the account.
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
     * The Amazon Resource Name (ARN) of the account.
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
     * </b>^arn:aws:organizations::\d{12}:account\/o-[a-z0-9]{10,32}\/\d{12}
     * <br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the account.
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
     * The Amazon Resource Name (ARN) of the account.
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
     * </b>^arn:aws:organizations::\d{12}:account\/o-[a-z0-9]{10,32}\/\d{12}
     * <br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the account.
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
    public Account withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The email address associated with the AWS account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this
     * parameter is a string of characters that represents a standard internet
     * email address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 64<br/>
     * <b>Pattern: </b>[^\s@]+@[^\s@]+\.[^\s@]+<br/>
     *
     * @return <p>
     *         The email address associated with the AWS account.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for this parameter is a string of characters that represents a
     *         standard internet email address.
     *         </p>
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>
     * The email address associated with the AWS account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this
     * parameter is a string of characters that represents a standard internet
     * email address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 64<br/>
     * <b>Pattern: </b>[^\s@]+@[^\s@]+\.[^\s@]+<br/>
     *
     * @param email <p>
     *            The email address associated with the AWS account.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for this parameter is a string of characters that
     *            represents a standard internet email address.
     *            </p>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address associated with the AWS account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this
     * parameter is a string of characters that represents a standard internet
     * email address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 64<br/>
     * <b>Pattern: </b>[^\s@]+@[^\s@]+\.[^\s@]+<br/>
     *
     * @param email <p>
     *            The email address associated with the AWS account.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for this parameter is a string of characters that
     *            represents a standard internet email address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Account withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * <p>
     * The friendly name of the account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter is a string of any of the characters in
     * the ASCII character range.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[ -\u007E]+<br/>
     *
     * @return <p>
     *         The friendly name of the account.
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
     * The friendly name of the account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter is a string of any of the characters in
     * the ASCII character range.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[ -\u007E]+<br/>
     *
     * @param name <p>
     *            The friendly name of the account.
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
     * The friendly name of the account.
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
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[ -\u007E]+<br/>
     *
     * @param name <p>
     *            The friendly name of the account.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> that is used to validate this parameter is a
     *            string of any of the characters in the ASCII character range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Account withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The status of the account in the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, SUSPENDED
     *
     * @return <p>
     *         The status of the account in the organization.
     *         </p>
     * @see AccountStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the account in the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, SUSPENDED
     *
     * @param status <p>
     *            The status of the account in the organization.
     *            </p>
     * @see AccountStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the account in the organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, SUSPENDED
     *
     * @param status <p>
     *            The status of the account in the organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccountStatus
     */
    public Account withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the account in the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, SUSPENDED
     *
     * @param status <p>
     *            The status of the account in the organization.
     *            </p>
     * @see AccountStatus
     */
    public void setStatus(AccountStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the account in the organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, SUSPENDED
     *
     * @param status <p>
     *            The status of the account in the organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccountStatus
     */
    public Account withStatus(AccountStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The method by which the account joined the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVITED, CREATED
     *
     * @return <p>
     *         The method by which the account joined the organization.
     *         </p>
     * @see AccountJoinedMethod
     */
    public String getJoinedMethod() {
        return joinedMethod;
    }

    /**
     * <p>
     * The method by which the account joined the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVITED, CREATED
     *
     * @param joinedMethod <p>
     *            The method by which the account joined the organization.
     *            </p>
     * @see AccountJoinedMethod
     */
    public void setJoinedMethod(String joinedMethod) {
        this.joinedMethod = joinedMethod;
    }

    /**
     * <p>
     * The method by which the account joined the organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVITED, CREATED
     *
     * @param joinedMethod <p>
     *            The method by which the account joined the organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccountJoinedMethod
     */
    public Account withJoinedMethod(String joinedMethod) {
        this.joinedMethod = joinedMethod;
        return this;
    }

    /**
     * <p>
     * The method by which the account joined the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVITED, CREATED
     *
     * @param joinedMethod <p>
     *            The method by which the account joined the organization.
     *            </p>
     * @see AccountJoinedMethod
     */
    public void setJoinedMethod(AccountJoinedMethod joinedMethod) {
        this.joinedMethod = joinedMethod.toString();
    }

    /**
     * <p>
     * The method by which the account joined the organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVITED, CREATED
     *
     * @param joinedMethod <p>
     *            The method by which the account joined the organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccountJoinedMethod
     */
    public Account withJoinedMethod(AccountJoinedMethod joinedMethod) {
        this.joinedMethod = joinedMethod.toString();
        return this;
    }

    /**
     * <p>
     * The date the account became a part of the organization.
     * </p>
     *
     * @return <p>
     *         The date the account became a part of the organization.
     *         </p>
     */
    public java.util.Date getJoinedTimestamp() {
        return joinedTimestamp;
    }

    /**
     * <p>
     * The date the account became a part of the organization.
     * </p>
     *
     * @param joinedTimestamp <p>
     *            The date the account became a part of the organization.
     *            </p>
     */
    public void setJoinedTimestamp(java.util.Date joinedTimestamp) {
        this.joinedTimestamp = joinedTimestamp;
    }

    /**
     * <p>
     * The date the account became a part of the organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param joinedTimestamp <p>
     *            The date the account became a part of the organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Account withJoinedTimestamp(java.util.Date joinedTimestamp) {
        this.joinedTimestamp = joinedTimestamp;
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
        if (getEmail() != null)
            sb.append("Email: " + getEmail() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getJoinedMethod() != null)
            sb.append("JoinedMethod: " + getJoinedMethod() + ",");
        if (getJoinedTimestamp() != null)
            sb.append("JoinedTimestamp: " + getJoinedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getJoinedMethod() == null) ? 0 : getJoinedMethod().hashCode());
        hashCode = prime * hashCode
                + ((getJoinedTimestamp() == null) ? 0 : getJoinedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Account == false)
            return false;
        Account other = (Account) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getJoinedMethod() == null ^ this.getJoinedMethod() == null)
            return false;
        if (other.getJoinedMethod() != null
                && other.getJoinedMethod().equals(this.getJoinedMethod()) == false)
            return false;
        if (other.getJoinedTimestamp() == null ^ this.getJoinedTimestamp() == null)
            return false;
        if (other.getJoinedTimestamp() != null
                && other.getJoinedTimestamp().equals(this.getJoinedTimestamp()) == false)
            return false;
        return true;
    }
}
