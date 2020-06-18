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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * A data structure with information about any primary and secondary clusters
 * associated with an Aurora global database.
 * </p>
 */
public class GlobalClusterMember implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for each Aurora cluster.
     * </p>
     */
    private String dBClusterArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for each read-only secondary cluster
     * associated with the Aurora global database.
     * </p>
     */
    private java.util.List<String> readers;

    /**
     * <p>
     * Specifies whether the Aurora cluster is the primary cluster (that is, has
     * read-write capability) for the Aurora global database with which it is
     * associated.
     * </p>
     */
    private Boolean isWriter;

    /**
     * <p>
     * Specifies whether a secondary cluster in an Aurora global database has
     * write forwarding enabled, not enabled, or is in the process of enabling
     * it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled, enabling, disabling, unknown
     */
    private String globalWriteForwardingStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for each Aurora cluster.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for each Aurora cluster.
     *         </p>
     */
    public String getDBClusterArn() {
        return dBClusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for each Aurora cluster.
     * </p>
     *
     * @param dBClusterArn <p>
     *            The Amazon Resource Name (ARN) for each Aurora cluster.
     *            </p>
     */
    public void setDBClusterArn(String dBClusterArn) {
        this.dBClusterArn = dBClusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for each Aurora cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterArn <p>
     *            The Amazon Resource Name (ARN) for each Aurora cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalClusterMember withDBClusterArn(String dBClusterArn) {
        this.dBClusterArn = dBClusterArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for each read-only secondary cluster
     * associated with the Aurora global database.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for each read-only secondary
     *         cluster associated with the Aurora global database.
     *         </p>
     */
    public java.util.List<String> getReaders() {
        return readers;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for each read-only secondary cluster
     * associated with the Aurora global database.
     * </p>
     *
     * @param readers <p>
     *            The Amazon Resource Name (ARN) for each read-only secondary
     *            cluster associated with the Aurora global database.
     *            </p>
     */
    public void setReaders(java.util.Collection<String> readers) {
        if (readers == null) {
            this.readers = null;
            return;
        }

        this.readers = new java.util.ArrayList<String>(readers);
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for each read-only secondary cluster
     * associated with the Aurora global database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readers <p>
     *            The Amazon Resource Name (ARN) for each read-only secondary
     *            cluster associated with the Aurora global database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalClusterMember withReaders(String... readers) {
        if (getReaders() == null) {
            this.readers = new java.util.ArrayList<String>(readers.length);
        }
        for (String value : readers) {
            this.readers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for each read-only secondary cluster
     * associated with the Aurora global database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readers <p>
     *            The Amazon Resource Name (ARN) for each read-only secondary
     *            cluster associated with the Aurora global database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalClusterMember withReaders(java.util.Collection<String> readers) {
        setReaders(readers);
        return this;
    }

    /**
     * <p>
     * Specifies whether the Aurora cluster is the primary cluster (that is, has
     * read-write capability) for the Aurora global database with which it is
     * associated.
     * </p>
     *
     * @return <p>
     *         Specifies whether the Aurora cluster is the primary cluster (that
     *         is, has read-write capability) for the Aurora global database
     *         with which it is associated.
     *         </p>
     */
    public Boolean isIsWriter() {
        return isWriter;
    }

    /**
     * <p>
     * Specifies whether the Aurora cluster is the primary cluster (that is, has
     * read-write capability) for the Aurora global database with which it is
     * associated.
     * </p>
     *
     * @return <p>
     *         Specifies whether the Aurora cluster is the primary cluster (that
     *         is, has read-write capability) for the Aurora global database
     *         with which it is associated.
     *         </p>
     */
    public Boolean getIsWriter() {
        return isWriter;
    }

    /**
     * <p>
     * Specifies whether the Aurora cluster is the primary cluster (that is, has
     * read-write capability) for the Aurora global database with which it is
     * associated.
     * </p>
     *
     * @param isWriter <p>
     *            Specifies whether the Aurora cluster is the primary cluster
     *            (that is, has read-write capability) for the Aurora global
     *            database with which it is associated.
     *            </p>
     */
    public void setIsWriter(Boolean isWriter) {
        this.isWriter = isWriter;
    }

    /**
     * <p>
     * Specifies whether the Aurora cluster is the primary cluster (that is, has
     * read-write capability) for the Aurora global database with which it is
     * associated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isWriter <p>
     *            Specifies whether the Aurora cluster is the primary cluster
     *            (that is, has read-write capability) for the Aurora global
     *            database with which it is associated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalClusterMember withIsWriter(Boolean isWriter) {
        this.isWriter = isWriter;
        return this;
    }

    /**
     * <p>
     * Specifies whether a secondary cluster in an Aurora global database has
     * write forwarding enabled, not enabled, or is in the process of enabling
     * it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled, enabling, disabling, unknown
     *
     * @return <p>
     *         Specifies whether a secondary cluster in an Aurora global
     *         database has write forwarding enabled, not enabled, or is in the
     *         process of enabling it.
     *         </p>
     * @see WriteForwardingStatus
     */
    public String getGlobalWriteForwardingStatus() {
        return globalWriteForwardingStatus;
    }

    /**
     * <p>
     * Specifies whether a secondary cluster in an Aurora global database has
     * write forwarding enabled, not enabled, or is in the process of enabling
     * it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled, enabling, disabling, unknown
     *
     * @param globalWriteForwardingStatus <p>
     *            Specifies whether a secondary cluster in an Aurora global
     *            database has write forwarding enabled, not enabled, or is in
     *            the process of enabling it.
     *            </p>
     * @see WriteForwardingStatus
     */
    public void setGlobalWriteForwardingStatus(String globalWriteForwardingStatus) {
        this.globalWriteForwardingStatus = globalWriteForwardingStatus;
    }

    /**
     * <p>
     * Specifies whether a secondary cluster in an Aurora global database has
     * write forwarding enabled, not enabled, or is in the process of enabling
     * it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled, enabling, disabling, unknown
     *
     * @param globalWriteForwardingStatus <p>
     *            Specifies whether a secondary cluster in an Aurora global
     *            database has write forwarding enabled, not enabled, or is in
     *            the process of enabling it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WriteForwardingStatus
     */
    public GlobalClusterMember withGlobalWriteForwardingStatus(String globalWriteForwardingStatus) {
        this.globalWriteForwardingStatus = globalWriteForwardingStatus;
        return this;
    }

    /**
     * <p>
     * Specifies whether a secondary cluster in an Aurora global database has
     * write forwarding enabled, not enabled, or is in the process of enabling
     * it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled, enabling, disabling, unknown
     *
     * @param globalWriteForwardingStatus <p>
     *            Specifies whether a secondary cluster in an Aurora global
     *            database has write forwarding enabled, not enabled, or is in
     *            the process of enabling it.
     *            </p>
     * @see WriteForwardingStatus
     */
    public void setGlobalWriteForwardingStatus(WriteForwardingStatus globalWriteForwardingStatus) {
        this.globalWriteForwardingStatus = globalWriteForwardingStatus.toString();
    }

    /**
     * <p>
     * Specifies whether a secondary cluster in an Aurora global database has
     * write forwarding enabled, not enabled, or is in the process of enabling
     * it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled, enabling, disabling, unknown
     *
     * @param globalWriteForwardingStatus <p>
     *            Specifies whether a secondary cluster in an Aurora global
     *            database has write forwarding enabled, not enabled, or is in
     *            the process of enabling it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WriteForwardingStatus
     */
    public GlobalClusterMember withGlobalWriteForwardingStatus(
            WriteForwardingStatus globalWriteForwardingStatus) {
        this.globalWriteForwardingStatus = globalWriteForwardingStatus.toString();
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
        if (getDBClusterArn() != null)
            sb.append("DBClusterArn: " + getDBClusterArn() + ",");
        if (getReaders() != null)
            sb.append("Readers: " + getReaders() + ",");
        if (getIsWriter() != null)
            sb.append("IsWriter: " + getIsWriter() + ",");
        if (getGlobalWriteForwardingStatus() != null)
            sb.append("GlobalWriteForwardingStatus: " + getGlobalWriteForwardingStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBClusterArn() == null) ? 0 : getDBClusterArn().hashCode());
        hashCode = prime * hashCode + ((getReaders() == null) ? 0 : getReaders().hashCode());
        hashCode = prime * hashCode + ((getIsWriter() == null) ? 0 : getIsWriter().hashCode());
        hashCode = prime
                * hashCode
                + ((getGlobalWriteForwardingStatus() == null) ? 0
                        : getGlobalWriteForwardingStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlobalClusterMember == false)
            return false;
        GlobalClusterMember other = (GlobalClusterMember) obj;

        if (other.getDBClusterArn() == null ^ this.getDBClusterArn() == null)
            return false;
        if (other.getDBClusterArn() != null
                && other.getDBClusterArn().equals(this.getDBClusterArn()) == false)
            return false;
        if (other.getReaders() == null ^ this.getReaders() == null)
            return false;
        if (other.getReaders() != null && other.getReaders().equals(this.getReaders()) == false)
            return false;
        if (other.getIsWriter() == null ^ this.getIsWriter() == null)
            return false;
        if (other.getIsWriter() != null && other.getIsWriter().equals(this.getIsWriter()) == false)
            return false;
        if (other.getGlobalWriteForwardingStatus() == null
                ^ this.getGlobalWriteForwardingStatus() == null)
            return false;
        if (other.getGlobalWriteForwardingStatus() != null
                && other.getGlobalWriteForwardingStatus().equals(
                        this.getGlobalWriteForwardingStatus()) == false)
            return false;
        return true;
    }
}
