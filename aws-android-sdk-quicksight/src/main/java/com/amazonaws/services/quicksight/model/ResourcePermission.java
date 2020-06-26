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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * Permission for the resource.
 * </p>
 */
public class ResourcePermission implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon QuickSight user or group, or
     * an IAM ARN. If you are using cross-account resource sharing, this is the
     * IAM ARN of an account root. Otherwise, it is the ARN of a QuickSight user
     * or group. .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String principal;

    /**
     * <p>
     * The action to grant or revoke permissions on, for example
     * <code>"quicksight:DescribeDashboard"</code>.
     * </p>
     */
    private java.util.List<String> actions;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon QuickSight user or group, or
     * an IAM ARN. If you are using cross-account resource sharing, this is the
     * IAM ARN of an account root. Otherwise, it is the ARN of a QuickSight user
     * or group. .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of an Amazon QuickSight user or
     *         group, or an IAM ARN. If you are using cross-account resource
     *         sharing, this is the IAM ARN of an account root. Otherwise, it is
     *         the ARN of a QuickSight user or group. .
     *         </p>
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon QuickSight user or group, or
     * an IAM ARN. If you are using cross-account resource sharing, this is the
     * IAM ARN of an account root. Otherwise, it is the ARN of a QuickSight user
     * or group. .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param principal <p>
     *            The Amazon Resource Name (ARN) of an Amazon QuickSight user or
     *            group, or an IAM ARN. If you are using cross-account resource
     *            sharing, this is the IAM ARN of an account root. Otherwise, it
     *            is the ARN of a QuickSight user or group. .
     *            </p>
     */
    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon QuickSight user or group, or
     * an IAM ARN. If you are using cross-account resource sharing, this is the
     * IAM ARN of an account root. Otherwise, it is the ARN of a QuickSight user
     * or group. .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param principal <p>
     *            The Amazon Resource Name (ARN) of an Amazon QuickSight user or
     *            group, or an IAM ARN. If you are using cross-account resource
     *            sharing, this is the IAM ARN of an account root. Otherwise, it
     *            is the ARN of a QuickSight user or group. .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourcePermission withPrincipal(String principal) {
        this.principal = principal;
        return this;
    }

    /**
     * <p>
     * The action to grant or revoke permissions on, for example
     * <code>"quicksight:DescribeDashboard"</code>.
     * </p>
     *
     * @return <p>
     *         The action to grant or revoke permissions on, for example
     *         <code>"quicksight:DescribeDashboard"</code>.
     *         </p>
     */
    public java.util.List<String> getActions() {
        return actions;
    }

    /**
     * <p>
     * The action to grant or revoke permissions on, for example
     * <code>"quicksight:DescribeDashboard"</code>.
     * </p>
     *
     * @param actions <p>
     *            The action to grant or revoke permissions on, for example
     *            <code>"quicksight:DescribeDashboard"</code>.
     *            </p>
     */
    public void setActions(java.util.Collection<String> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<String>(actions);
    }

    /**
     * <p>
     * The action to grant or revoke permissions on, for example
     * <code>"quicksight:DescribeDashboard"</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            The action to grant or revoke permissions on, for example
     *            <code>"quicksight:DescribeDashboard"</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourcePermission withActions(String... actions) {
        if (getActions() == null) {
            this.actions = new java.util.ArrayList<String>(actions.length);
        }
        for (String value : actions) {
            this.actions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The action to grant or revoke permissions on, for example
     * <code>"quicksight:DescribeDashboard"</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            The action to grant or revoke permissions on, for example
     *            <code>"quicksight:DescribeDashboard"</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourcePermission withActions(java.util.Collection<String> actions) {
        setActions(actions);
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
        if (getPrincipal() != null)
            sb.append("Principal: " + getPrincipal() + ",");
        if (getActions() != null)
            sb.append("Actions: " + getActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourcePermission == false)
            return false;
        ResourcePermission other = (ResourcePermission) obj;

        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null
                && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        return true;
    }
}
