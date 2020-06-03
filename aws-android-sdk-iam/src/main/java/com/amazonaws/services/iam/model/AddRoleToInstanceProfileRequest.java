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
 * Adds the specified IAM role to the specified instance profile. An instance
 * profile can contain only one role, and this limit cannot be increased. You
 * can remove the existing role and then add a different role to an instance
 * profile. You must then wait for the change to appear across all of AWS
 * because of <a
 * href="https://en.wikipedia.org/wiki/Eventual_consistency">eventual
 * consistency</a>. To force the change, you must <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DisassociateIamInstanceProfile.html"
 * >disassociate the instance profile</a> and then <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AssociateIamInstanceProfile.html"
 * >associate the instance profile</a>, or you can stop your instance and then
 * restart it.
 * </p>
 * <note>
 * <p>
 * The caller of this API must be granted the <code>PassRole</code> permission
 * on the IAM role by a permissions policy.
 * </p>
 * </note>
 * <p>
 * For more information about roles, go to <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"
 * >Working with Roles</a>. For more information about instance profiles, go to
 * <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"
 * >About Instance Profiles</a>.
 * </p>
 */
public class AddRoleToInstanceProfileRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the instance profile to update.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String instanceProfileName;

    /**
     * <p>
     * The name of the role to add.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String roleName;

    /**
     * <p>
     * The name of the instance profile to update.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name of the instance profile to update.
     *         </p>
     *         <p>
     *         This parameter allows (through its <a
     *         href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *         string of characters consisting of upper and lowercase
     *         alphanumeric characters with no spaces. You can also include any
     *         of the following characters: _+=,.@-
     *         </p>
     */
    public String getInstanceProfileName() {
        return instanceProfileName;
    }

    /**
     * <p>
     * The name of the instance profile to update.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param instanceProfileName <p>
     *            The name of the instance profile to update.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: _+=,.@-
     *            </p>
     */
    public void setInstanceProfileName(String instanceProfileName) {
        this.instanceProfileName = instanceProfileName;
    }

    /**
     * <p>
     * The name of the instance profile to update.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param instanceProfileName <p>
     *            The name of the instance profile to update.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: _+=,.@-
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddRoleToInstanceProfileRequest withInstanceProfileName(String instanceProfileName) {
        this.instanceProfileName = instanceProfileName;
        return this;
    }

    /**
     * <p>
     * The name of the role to add.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name of the role to add.
     *         </p>
     *         <p>
     *         This parameter allows (through its <a
     *         href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *         string of characters consisting of upper and lowercase
     *         alphanumeric characters with no spaces. You can also include any
     *         of the following characters: _+=,.@-
     *         </p>
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * <p>
     * The name of the role to add.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param roleName <p>
     *            The name of the role to add.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: _+=,.@-
     *            </p>
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the role to add.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
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
     *            The name of the role to add.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: _+=,.@-
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddRoleToInstanceProfileRequest withRoleName(String roleName) {
        this.roleName = roleName;
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
        if (getInstanceProfileName() != null)
            sb.append("InstanceProfileName: " + getInstanceProfileName() + ",");
        if (getRoleName() != null)
            sb.append("RoleName: " + getRoleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceProfileName() == null) ? 0 : getInstanceProfileName().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddRoleToInstanceProfileRequest == false)
            return false;
        AddRoleToInstanceProfileRequest other = (AddRoleToInstanceProfileRequest) obj;

        if (other.getInstanceProfileName() == null ^ this.getInstanceProfileName() == null)
            return false;
        if (other.getInstanceProfileName() != null
                && other.getInstanceProfileName().equals(this.getInstanceProfileName()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        return true;
    }
}
