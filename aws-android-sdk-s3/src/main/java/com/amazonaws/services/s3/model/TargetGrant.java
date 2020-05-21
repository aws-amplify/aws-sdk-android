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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Container for granting information.
 * </p>
 */
public class TargetGrant implements Serializable {
    /**
     * <p>
     * Container for the person being granted permissions.
     * </p>
     */
    private Grantee grantee;

    /**
     * <p>
     * Logging permissions assigned to the Grantee for the bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL_CONTROL, READ, WRITE
     */
    private String permission;

    /**
     * <p>
     * Container for the person being granted permissions.
     * </p>
     *
     * @return <p>
     *         Container for the person being granted permissions.
     *         </p>
     */
    public Grantee getGrantee() {
        return grantee;
    }

    /**
     * <p>
     * Container for the person being granted permissions.
     * </p>
     *
     * @param grantee <p>
     *            Container for the person being granted permissions.
     *            </p>
     */
    public void setGrantee(Grantee grantee) {
        this.grantee = grantee;
    }

    /**
     * <p>
     * Container for the person being granted permissions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantee <p>
     *            Container for the person being granted permissions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetGrant withGrantee(Grantee grantee) {
        this.grantee = grantee;
        return this;
    }

    /**
     * <p>
     * Logging permissions assigned to the Grantee for the bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL_CONTROL, READ, WRITE
     *
     * @return <p>
     *         Logging permissions assigned to the Grantee for the bucket.
     *         </p>
     * @see BucketLogsPermission
     */
    public String getPermission() {
        return permission;
    }

    /**
     * <p>
     * Logging permissions assigned to the Grantee for the bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL_CONTROL, READ, WRITE
     *
     * @param permission <p>
     *            Logging permissions assigned to the Grantee for the bucket.
     *            </p>
     * @see BucketLogsPermission
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * <p>
     * Logging permissions assigned to the Grantee for the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL_CONTROL, READ, WRITE
     *
     * @param permission <p>
     *            Logging permissions assigned to the Grantee for the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BucketLogsPermission
     */
    public TargetGrant withPermission(String permission) {
        this.permission = permission;
        return this;
    }

    /**
     * <p>
     * Logging permissions assigned to the Grantee for the bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL_CONTROL, READ, WRITE
     *
     * @param permission <p>
     *            Logging permissions assigned to the Grantee for the bucket.
     *            </p>
     * @see BucketLogsPermission
     */
    public void setPermission(BucketLogsPermission permission) {
        this.permission = permission.toString();
    }

    /**
     * <p>
     * Logging permissions assigned to the Grantee for the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL_CONTROL, READ, WRITE
     *
     * @param permission <p>
     *            Logging permissions assigned to the Grantee for the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BucketLogsPermission
     */
    public TargetGrant withPermission(BucketLogsPermission permission) {
        this.permission = permission.toString();
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
        if (getGrantee() != null)
            sb.append("Grantee: " + getGrantee() + ",");
        if (getPermission() != null)
            sb.append("Permission: " + getPermission());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGrantee() == null) ? 0 : getGrantee().hashCode());
        hashCode = prime * hashCode + ((getPermission() == null) ? 0 : getPermission().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetGrant == false)
            return false;
        TargetGrant other = (TargetGrant) obj;

        if (other.getGrantee() == null ^ this.getGrantee() == null)
            return false;
        if (other.getGrantee() != null && other.getGrantee().equals(this.getGrantee()) == false)
            return false;
        if (other.getPermission() == null ^ this.getPermission() == null)
            return false;
        if (other.getPermission() != null
                && other.getPermission().equals(this.getPermission()) == false)
            return false;
        return true;
    }
}
