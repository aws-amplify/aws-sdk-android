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
 * The full POSIX identity, including the user ID, group ID, and any secondary
 * group IDs, on the access point that is used for all file system operations
 * performed by NFS clients using the access point.
 * </p>
 */
public class PosixUser implements Serializable {
    /**
     * <p>
     * The POSIX user ID used for all file system operations using this access
     * point.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967295<br/>
     */
    private Long uid;

    /**
     * <p>
     * The POSIX group ID used for all file system operations using this access
     * point.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967295<br/>
     */
    private Long gid;

    /**
     * <p>
     * Secondary POSIX group IDs used for all file system operations using this
     * access point.
     * </p>
     */
    private java.util.List<Long> secondaryGids;

    /**
     * <p>
     * The POSIX user ID used for all file system operations using this access
     * point.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967295<br/>
     *
     * @return <p>
     *         The POSIX user ID used for all file system operations using this
     *         access point.
     *         </p>
     */
    public Long getUid() {
        return uid;
    }

    /**
     * <p>
     * The POSIX user ID used for all file system operations using this access
     * point.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967295<br/>
     *
     * @param uid <p>
     *            The POSIX user ID used for all file system operations using
     *            this access point.
     *            </p>
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * <p>
     * The POSIX user ID used for all file system operations using this access
     * point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967295<br/>
     *
     * @param uid <p>
     *            The POSIX user ID used for all file system operations using
     *            this access point.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PosixUser withUid(Long uid) {
        this.uid = uid;
        return this;
    }

    /**
     * <p>
     * The POSIX group ID used for all file system operations using this access
     * point.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967295<br/>
     *
     * @return <p>
     *         The POSIX group ID used for all file system operations using this
     *         access point.
     *         </p>
     */
    public Long getGid() {
        return gid;
    }

    /**
     * <p>
     * The POSIX group ID used for all file system operations using this access
     * point.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967295<br/>
     *
     * @param gid <p>
     *            The POSIX group ID used for all file system operations using
     *            this access point.
     *            </p>
     */
    public void setGid(Long gid) {
        this.gid = gid;
    }

    /**
     * <p>
     * The POSIX group ID used for all file system operations using this access
     * point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967295<br/>
     *
     * @param gid <p>
     *            The POSIX group ID used for all file system operations using
     *            this access point.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PosixUser withGid(Long gid) {
        this.gid = gid;
        return this;
    }

    /**
     * <p>
     * Secondary POSIX group IDs used for all file system operations using this
     * access point.
     * </p>
     *
     * @return <p>
     *         Secondary POSIX group IDs used for all file system operations
     *         using this access point.
     *         </p>
     */
    public java.util.List<Long> getSecondaryGids() {
        return secondaryGids;
    }

    /**
     * <p>
     * Secondary POSIX group IDs used for all file system operations using this
     * access point.
     * </p>
     *
     * @param secondaryGids <p>
     *            Secondary POSIX group IDs used for all file system operations
     *            using this access point.
     *            </p>
     */
    public void setSecondaryGids(java.util.Collection<Long> secondaryGids) {
        if (secondaryGids == null) {
            this.secondaryGids = null;
            return;
        }

        this.secondaryGids = new java.util.ArrayList<Long>(secondaryGids);
    }

    /**
     * <p>
     * Secondary POSIX group IDs used for all file system operations using this
     * access point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondaryGids <p>
     *            Secondary POSIX group IDs used for all file system operations
     *            using this access point.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PosixUser withSecondaryGids(Long... secondaryGids) {
        if (getSecondaryGids() == null) {
            this.secondaryGids = new java.util.ArrayList<Long>(secondaryGids.length);
        }
        for (Long value : secondaryGids) {
            this.secondaryGids.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Secondary POSIX group IDs used for all file system operations using this
     * access point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondaryGids <p>
     *            Secondary POSIX group IDs used for all file system operations
     *            using this access point.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PosixUser withSecondaryGids(java.util.Collection<Long> secondaryGids) {
        setSecondaryGids(secondaryGids);
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
        if (getUid() != null)
            sb.append("Uid: " + getUid() + ",");
        if (getGid() != null)
            sb.append("Gid: " + getGid() + ",");
        if (getSecondaryGids() != null)
            sb.append("SecondaryGids: " + getSecondaryGids());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUid() == null) ? 0 : getUid().hashCode());
        hashCode = prime * hashCode + ((getGid() == null) ? 0 : getGid().hashCode());
        hashCode = prime * hashCode
                + ((getSecondaryGids() == null) ? 0 : getSecondaryGids().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PosixUser == false)
            return false;
        PosixUser other = (PosixUser) obj;

        if (other.getUid() == null ^ this.getUid() == null)
            return false;
        if (other.getUid() != null && other.getUid().equals(this.getUid()) == false)
            return false;
        if (other.getGid() == null ^ this.getGid() == null)
            return false;
        if (other.getGid() != null && other.getGid().equals(this.getGid()) == false)
            return false;
        if (other.getSecondaryGids() == null ^ this.getSecondaryGids() == null)
            return false;
        if (other.getSecondaryGids() != null
                && other.getSecondaryGids().equals(this.getSecondaryGids()) == false)
            return false;
        return true;
    }
}
