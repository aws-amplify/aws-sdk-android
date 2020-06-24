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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an organizational unit (OU) within a root or parent OU. An OU is a
 * container for accounts that enables you to organize your accounts to apply
 * policies according to your business requirements. The number of levels deep
 * that you can nest OUs is dependent upon the policy types enabled for that
 * root. For service control policies, the limit is five.
 * </p>
 * <p>
 * For more information about OUs, see <a href=
 * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_ous.html"
 * >Managing Organizational Units</a> in the <i>AWS Organizations User
 * Guide.</i>
 * </p>
 * <p>
 * This operation can be called only from the organization's master account.
 * </p>
 */
public class CreateOrganizationalUnitRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The unique identifier (ID) of the parent root or OU that you want to
     * create the new OU in.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * parent ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> - A string that begins with "r-" followed by from 4 to 32
     * lowercase letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     * followed by from 4 to 32 lowercase letters or digits (the ID of the root
     * that the OU is in). This string is followed by a second "-" dash and from
     * 8 to 32 additional lowercase letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     * <b>Pattern: </b>^(r-[0-9a-z]{4,32})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$
     * <br/>
     */
    private String parentId;

    /**
     * <p>
     * The friendly name to assign to the new OU.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String name;

    /**
     * <p>
     * The unique identifier (ID) of the parent root or OU that you want to
     * create the new OU in.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * parent ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> - A string that begins with "r-" followed by from 4 to 32
     * lowercase letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     * followed by from 4 to 32 lowercase letters or digits (the ID of the root
     * that the OU is in). This string is followed by a second "-" dash and from
     * 8 to 32 additional lowercase letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     * <b>Pattern: </b>^(r-[0-9a-z]{4,32})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$
     * <br/>
     *
     * @return <p>
     *         The unique identifier (ID) of the parent root or OU that you want
     *         to create the new OU in.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for a parent ID string requires one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Root</b> - A string that begins with "r-" followed by from 4
     *         to 32 lowercase letters or digits.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     *         followed by from 4 to 32 lowercase letters or digits (the ID of
     *         the root that the OU is in). This string is followed by a second
     *         "-" dash and from 8 to 32 additional lowercase letters or digits.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the parent root or OU that you want to
     * create the new OU in.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * parent ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> - A string that begins with "r-" followed by from 4 to 32
     * lowercase letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     * followed by from 4 to 32 lowercase letters or digits (the ID of the root
     * that the OU is in). This string is followed by a second "-" dash and from
     * 8 to 32 additional lowercase letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     * <b>Pattern: </b>^(r-[0-9a-z]{4,32})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$
     * <br/>
     *
     * @param parentId <p>
     *            The unique identifier (ID) of the parent root or OU that you
     *            want to create the new OU in.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a parent ID string requires one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Root</b> - A string that begins with "r-" followed by from
     *            4 to 32 lowercase letters or digits.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Organizational unit (OU)</b> - A string that begins with
     *            "ou-" followed by from 4 to 32 lowercase letters or digits
     *            (the ID of the root that the OU is in). This string is
     *            followed by a second "-" dash and from 8 to 32 additional
     *            lowercase letters or digits.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the parent root or OU that you want to
     * create the new OU in.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * parent ID string requires one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> - A string that begins with "r-" followed by from 4 to 32
     * lowercase letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Organizational unit (OU)</b> - A string that begins with "ou-"
     * followed by from 4 to 32 lowercase letters or digits (the ID of the root
     * that the OU is in). This string is followed by a second "-" dash and from
     * 8 to 32 additional lowercase letters or digits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     * <b>Pattern: </b>^(r-[0-9a-z]{4,32})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$
     * <br/>
     *
     * @param parentId <p>
     *            The unique identifier (ID) of the parent root or OU that you
     *            want to create the new OU in.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a parent ID string requires one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Root</b> - A string that begins with "r-" followed by from
     *            4 to 32 lowercase letters or digits.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Organizational unit (OU)</b> - A string that begins with
     *            "ou-" followed by from 4 to 32 lowercase letters or digits
     *            (the ID of the root that the OU is in). This string is
     *            followed by a second "-" dash and from 8 to 32 additional
     *            lowercase letters or digits.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOrganizationalUnitRequest withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * <p>
     * The friendly name to assign to the new OU.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         The friendly name to assign to the new OU.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The friendly name to assign to the new OU.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param name <p>
     *            The friendly name to assign to the new OU.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name to assign to the new OU.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param name <p>
     *            The friendly name to assign to the new OU.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOrganizationalUnitRequest withName(String name) {
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
        if (getParentId() != null)
            sb.append("ParentId: " + getParentId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParentId() == null) ? 0 : getParentId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateOrganizationalUnitRequest == false)
            return false;
        CreateOrganizationalUnitRequest other = (CreateOrganizationalUnitRequest) obj;

        if (other.getParentId() == null ^ this.getParentId() == null)
            return false;
        if (other.getParentId() != null && other.getParentId().equals(this.getParentId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
