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

package com.amazonaws.services.amazonelasticfilesystem.model;

import java.io.Serializable;

/**
 * <p>
 * Required if the <code>RootDirectory</code> &gt; <code>Path</code> specified
 * does not exist. Specifies the POSIX IDs and permissions to apply to the
 * access point's <code>RootDirectory</code> &gt; <code>Path</code>. If the
 * access point root directory does not exist, EFS creates it with these
 * settings when a client connects to the access point. When specifying
 * <code>CreationInfo</code>, you must include values for all properties.
 * </p>
 * <important>
 * <p>
 * If you do not provide <code>CreationInfo</code> and the specified
 * <code>RootDirectory</code> does not exist, attempts to mount the file system
 * using the access point will fail.
 * </p>
 * </important>
 */
public class CreationInfo implements Serializable {
    /**
     * <p>
     * Specifies the POSIX user ID to apply to the <code>RootDirectory</code>.
     * Accepts values from 0 to 2^32 (4294967295).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967295<br/>
     */
    private Long ownerUid;

    /**
     * <p>
     * Specifies the POSIX group ID to apply to the <code>RootDirectory</code>.
     * Accepts values from 0 to 2^32 (4294967295).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967295<br/>
     */
    private Long ownerGid;

    /**
     * <p>
     * Specifies the POSIX permissions to apply to the
     * <code>RootDirectory</code>, in the format of an octal number representing
     * the file's mode bits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-7]{3,4}$<br/>
     */
    private String permissions;

    /**
     * <p>
     * Specifies the POSIX user ID to apply to the <code>RootDirectory</code>.
     * Accepts values from 0 to 2^32 (4294967295).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967295<br/>
     *
     * @return <p>
     *         Specifies the POSIX user ID to apply to the
     *         <code>RootDirectory</code>. Accepts values from 0 to 2^32
     *         (4294967295).
     *         </p>
     */
    public Long getOwnerUid() {
        return ownerUid;
    }

    /**
     * <p>
     * Specifies the POSIX user ID to apply to the <code>RootDirectory</code>.
     * Accepts values from 0 to 2^32 (4294967295).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967295<br/>
     *
     * @param ownerUid <p>
     *            Specifies the POSIX user ID to apply to the
     *            <code>RootDirectory</code>. Accepts values from 0 to 2^32
     *            (4294967295).
     *            </p>
     */
    public void setOwnerUid(Long ownerUid) {
        this.ownerUid = ownerUid;
    }

    /**
     * <p>
     * Specifies the POSIX user ID to apply to the <code>RootDirectory</code>.
     * Accepts values from 0 to 2^32 (4294967295).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967295<br/>
     *
     * @param ownerUid <p>
     *            Specifies the POSIX user ID to apply to the
     *            <code>RootDirectory</code>. Accepts values from 0 to 2^32
     *            (4294967295).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreationInfo withOwnerUid(Long ownerUid) {
        this.ownerUid = ownerUid;
        return this;
    }

    /**
     * <p>
     * Specifies the POSIX group ID to apply to the <code>RootDirectory</code>.
     * Accepts values from 0 to 2^32 (4294967295).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967295<br/>
     *
     * @return <p>
     *         Specifies the POSIX group ID to apply to the
     *         <code>RootDirectory</code>. Accepts values from 0 to 2^32
     *         (4294967295).
     *         </p>
     */
    public Long getOwnerGid() {
        return ownerGid;
    }

    /**
     * <p>
     * Specifies the POSIX group ID to apply to the <code>RootDirectory</code>.
     * Accepts values from 0 to 2^32 (4294967295).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967295<br/>
     *
     * @param ownerGid <p>
     *            Specifies the POSIX group ID to apply to the
     *            <code>RootDirectory</code>. Accepts values from 0 to 2^32
     *            (4294967295).
     *            </p>
     */
    public void setOwnerGid(Long ownerGid) {
        this.ownerGid = ownerGid;
    }

    /**
     * <p>
     * Specifies the POSIX group ID to apply to the <code>RootDirectory</code>.
     * Accepts values from 0 to 2^32 (4294967295).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967295<br/>
     *
     * @param ownerGid <p>
     *            Specifies the POSIX group ID to apply to the
     *            <code>RootDirectory</code>. Accepts values from 0 to 2^32
     *            (4294967295).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreationInfo withOwnerGid(Long ownerGid) {
        this.ownerGid = ownerGid;
        return this;
    }

    /**
     * <p>
     * Specifies the POSIX permissions to apply to the
     * <code>RootDirectory</code>, in the format of an octal number representing
     * the file's mode bits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-7]{3,4}$<br/>
     *
     * @return <p>
     *         Specifies the POSIX permissions to apply to the
     *         <code>RootDirectory</code>, in the format of an octal number
     *         representing the file's mode bits.
     *         </p>
     */
    public String getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * Specifies the POSIX permissions to apply to the
     * <code>RootDirectory</code>, in the format of an octal number representing
     * the file's mode bits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-7]{3,4}$<br/>
     *
     * @param permissions <p>
     *            Specifies the POSIX permissions to apply to the
     *            <code>RootDirectory</code>, in the format of an octal number
     *            representing the file's mode bits.
     *            </p>
     */
    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    /**
     * <p>
     * Specifies the POSIX permissions to apply to the
     * <code>RootDirectory</code>, in the format of an octal number representing
     * the file's mode bits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-7]{3,4}$<br/>
     *
     * @param permissions <p>
     *            Specifies the POSIX permissions to apply to the
     *            <code>RootDirectory</code>, in the format of an octal number
     *            representing the file's mode bits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreationInfo withPermissions(String permissions) {
        this.permissions = permissions;
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
        if (getOwnerUid() != null)
            sb.append("OwnerUid: " + getOwnerUid() + ",");
        if (getOwnerGid() != null)
            sb.append("OwnerGid: " + getOwnerGid() + ",");
        if (getPermissions() != null)
            sb.append("Permissions: " + getPermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerUid() == null) ? 0 : getOwnerUid().hashCode());
        hashCode = prime * hashCode + ((getOwnerGid() == null) ? 0 : getOwnerGid().hashCode());
        hashCode = prime * hashCode
                + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreationInfo == false)
            return false;
        CreationInfo other = (CreationInfo) obj;

        if (other.getOwnerUid() == null ^ this.getOwnerUid() == null)
            return false;
        if (other.getOwnerUid() != null && other.getOwnerUid().equals(this.getOwnerUid()) == false)
            return false;
        if (other.getOwnerGid() == null ^ this.getOwnerGid() == null)
            return false;
        if (other.getOwnerGid() != null && other.getOwnerGid().equals(this.getOwnerGid()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null
                && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        return true;
    }
}
