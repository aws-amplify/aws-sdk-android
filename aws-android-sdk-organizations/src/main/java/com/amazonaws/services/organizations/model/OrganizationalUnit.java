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
 * Contains details about an organizational unit (OU). An OU is a container of
 * AWS accounts within a root of an organization. Policies that are attached to
 * an OU apply to all accounts contained in that OU and in any child OUs.
 * </p>
 */
public class OrganizationalUnit implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) associated with this OU.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * organizational unit ID string requires "ou-" followed by from 4 to 32
     * lower-case letters or digits (the ID of the root that contains the OU).
     * This string is followed by a second "-" dash and from 8 to 32 additional
     * lower-case letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^ou-[0-9a-z]{4,32}-[a-z0-9]{8,32}$<br/>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this OU.
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
     * </b>^arn:aws:organizations::\d{12}:ou\/o-[a-z0-9]{10,32}\/ou-[
     * 0-9a-z]{4,32}-[0-9a-z]{8,32}<br/>
     */
    private String arn;

    /**
     * <p>
     * The friendly name of this OU.
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
     * The unique identifier (ID) associated with this OU.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * organizational unit ID string requires "ou-" followed by from 4 to 32
     * lower-case letters or digits (the ID of the root that contains the OU).
     * This string is followed by a second "-" dash and from 8 to 32 additional
     * lower-case letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^ou-[0-9a-z]{4,32}-[a-z0-9]{8,32}$<br/>
     *
     * @return <p>
     *         The unique identifier (ID) associated with this OU.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for an organizational unit ID string requires "ou-" followed by
     *         from 4 to 32 lower-case letters or digits (the ID of the root
     *         that contains the OU). This string is followed by a second "-"
     *         dash and from 8 to 32 additional lower-case letters or digits.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier (ID) associated with this OU.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * organizational unit ID string requires "ou-" followed by from 4 to 32
     * lower-case letters or digits (the ID of the root that contains the OU).
     * This string is followed by a second "-" dash and from 8 to 32 additional
     * lower-case letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^ou-[0-9a-z]{4,32}-[a-z0-9]{8,32}$<br/>
     *
     * @param id <p>
     *            The unique identifier (ID) associated with this OU.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for an organizational unit ID string requires
     *            "ou-" followed by from 4 to 32 lower-case letters or digits
     *            (the ID of the root that contains the OU). This string is
     *            followed by a second "-" dash and from 8 to 32 additional
     *            lower-case letters or digits.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier (ID) associated with this OU.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * organizational unit ID string requires "ou-" followed by from 4 to 32
     * lower-case letters or digits (the ID of the root that contains the OU).
     * This string is followed by a second "-" dash and from 8 to 32 additional
     * lower-case letters or digits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^ou-[0-9a-z]{4,32}-[a-z0-9]{8,32}$<br/>
     *
     * @param id <p>
     *            The unique identifier (ID) associated with this OU.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for an organizational unit ID string requires
     *            "ou-" followed by from 4 to 32 lower-case letters or digits
     *            (the ID of the root that contains the OU). This string is
     *            followed by a second "-" dash and from 8 to 32 additional
     *            lower-case letters or digits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationalUnit withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this OU.
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
     * </b>^arn:aws:organizations::\d{12}:ou\/o-[a-z0-9]{10,32}\/ou-[
     * 0-9a-z]{4,32}-[0-9a-z]{8,32}<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of this OU.
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
     * The Amazon Resource Name (ARN) of this OU.
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
     * </b>^arn:aws:organizations::\d{12}:ou\/o-[a-z0-9]{10,32}\/ou-[
     * 0-9a-z]{4,32}-[0-9a-z]{8,32}<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of this OU.
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
     * The Amazon Resource Name (ARN) of this OU.
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
     * </b>^arn:aws:organizations::\d{12}:ou\/o-[a-z0-9]{10,32}\/ou-[
     * 0-9a-z]{4,32}-[0-9a-z]{8,32}<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of this OU.
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
    public OrganizationalUnit withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The friendly name of this OU.
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
     *         The friendly name of this OU.
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
     * The friendly name of this OU.
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
     *            The friendly name of this OU.
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
     * The friendly name of this OU.
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
     *            The friendly name of this OU.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> that is used to validate this parameter is a
     *            string of any of the characters in the ASCII character range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationalUnit withName(String name) {
        this.name = name;
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
            sb.append("Name: " + getName());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationalUnit == false)
            return false;
        OrganizationalUnit other = (OrganizationalUnit) obj;

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
        return true;
    }
}
