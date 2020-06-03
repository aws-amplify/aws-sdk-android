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
 * The reason that the service-linked role deletion failed.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <a>GetServiceLinkedRoleDeletionStatus</a> operation.
 * </p>
 */
public class DeletionTaskFailureReasonType implements Serializable {
    /**
     * <p>
     * A short description of the reason that the service-linked role deletion
     * failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String reason;

    /**
     * <p>
     * A list of objects that contains details about the service-linked role
     * deletion failure, if that information is returned by the service. If the
     * service-linked role has active sessions or if any resources that were
     * used by the role have not been deleted from the linked service, the role
     * can't be deleted. This parameter includes a list of the resources that
     * are associated with the role and the Region in which the resources are
     * being used.
     * </p>
     */
    private java.util.List<RoleUsageType> roleUsageList;

    /**
     * <p>
     * A short description of the reason that the service-linked role deletion
     * failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         A short description of the reason that the service-linked role
     *         deletion failed.
     *         </p>
     */
    public String getReason() {
        return reason;
    }

    /**
     * <p>
     * A short description of the reason that the service-linked role deletion
     * failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param reason <p>
     *            A short description of the reason that the service-linked role
     *            deletion failed.
     *            </p>
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A short description of the reason that the service-linked role deletion
     * failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param reason <p>
     *            A short description of the reason that the service-linked role
     *            deletion failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeletionTaskFailureReasonType withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * <p>
     * A list of objects that contains details about the service-linked role
     * deletion failure, if that information is returned by the service. If the
     * service-linked role has active sessions or if any resources that were
     * used by the role have not been deleted from the linked service, the role
     * can't be deleted. This parameter includes a list of the resources that
     * are associated with the role and the Region in which the resources are
     * being used.
     * </p>
     *
     * @return <p>
     *         A list of objects that contains details about the service-linked
     *         role deletion failure, if that information is returned by the
     *         service. If the service-linked role has active sessions or if any
     *         resources that were used by the role have not been deleted from
     *         the linked service, the role can't be deleted. This parameter
     *         includes a list of the resources that are associated with the
     *         role and the Region in which the resources are being used.
     *         </p>
     */
    public java.util.List<RoleUsageType> getRoleUsageList() {
        return roleUsageList;
    }

    /**
     * <p>
     * A list of objects that contains details about the service-linked role
     * deletion failure, if that information is returned by the service. If the
     * service-linked role has active sessions or if any resources that were
     * used by the role have not been deleted from the linked service, the role
     * can't be deleted. This parameter includes a list of the resources that
     * are associated with the role and the Region in which the resources are
     * being used.
     * </p>
     *
     * @param roleUsageList <p>
     *            A list of objects that contains details about the
     *            service-linked role deletion failure, if that information is
     *            returned by the service. If the service-linked role has active
     *            sessions or if any resources that were used by the role have
     *            not been deleted from the linked service, the role can't be
     *            deleted. This parameter includes a list of the resources that
     *            are associated with the role and the Region in which the
     *            resources are being used.
     *            </p>
     */
    public void setRoleUsageList(java.util.Collection<RoleUsageType> roleUsageList) {
        if (roleUsageList == null) {
            this.roleUsageList = null;
            return;
        }

        this.roleUsageList = new java.util.ArrayList<RoleUsageType>(roleUsageList);
    }

    /**
     * <p>
     * A list of objects that contains details about the service-linked role
     * deletion failure, if that information is returned by the service. If the
     * service-linked role has active sessions or if any resources that were
     * used by the role have not been deleted from the linked service, the role
     * can't be deleted. This parameter includes a list of the resources that
     * are associated with the role and the Region in which the resources are
     * being used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleUsageList <p>
     *            A list of objects that contains details about the
     *            service-linked role deletion failure, if that information is
     *            returned by the service. If the service-linked role has active
     *            sessions or if any resources that were used by the role have
     *            not been deleted from the linked service, the role can't be
     *            deleted. This parameter includes a list of the resources that
     *            are associated with the role and the Region in which the
     *            resources are being used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeletionTaskFailureReasonType withRoleUsageList(RoleUsageType... roleUsageList) {
        if (getRoleUsageList() == null) {
            this.roleUsageList = new java.util.ArrayList<RoleUsageType>(roleUsageList.length);
        }
        for (RoleUsageType value : roleUsageList) {
            this.roleUsageList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects that contains details about the service-linked role
     * deletion failure, if that information is returned by the service. If the
     * service-linked role has active sessions or if any resources that were
     * used by the role have not been deleted from the linked service, the role
     * can't be deleted. This parameter includes a list of the resources that
     * are associated with the role and the Region in which the resources are
     * being used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleUsageList <p>
     *            A list of objects that contains details about the
     *            service-linked role deletion failure, if that information is
     *            returned by the service. If the service-linked role has active
     *            sessions or if any resources that were used by the role have
     *            not been deleted from the linked service, the role can't be
     *            deleted. This parameter includes a list of the resources that
     *            are associated with the role and the Region in which the
     *            resources are being used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeletionTaskFailureReasonType withRoleUsageList(
            java.util.Collection<RoleUsageType> roleUsageList) {
        setRoleUsageList(roleUsageList);
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
        if (getReason() != null)
            sb.append("Reason: " + getReason() + ",");
        if (getRoleUsageList() != null)
            sb.append("RoleUsageList: " + getRoleUsageList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode
                + ((getRoleUsageList() == null) ? 0 : getRoleUsageList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletionTaskFailureReasonType == false)
            return false;
        DeletionTaskFailureReasonType other = (DeletionTaskFailureReasonType) obj;

        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getRoleUsageList() == null ^ this.getRoleUsageList() == null)
            return false;
        if (other.getRoleUsageList() != null
                && other.getRoleUsageList().equals(this.getRoleUsageList()) == false)
            return false;
        return true;
    }
}
