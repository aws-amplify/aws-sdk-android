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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

public class CreateSnapshotCopyGrantResult implements Serializable {
    /**
     * <p>
     * The snapshot copy grant that grants Amazon Redshift permission to encrypt
     * copied snapshots with the specified customer master key (CMK) from AWS
     * KMS in the destination region.
     * </p>
     * <p>
     * For more information about managing snapshot copy grants, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-db-encryption.html"
     * >Amazon Redshift Database Encryption</a> in the <i>Amazon Redshift
     * Cluster Management Guide</i>.
     * </p>
     */
    private SnapshotCopyGrant snapshotCopyGrant;

    /**
     * <p>
     * The snapshot copy grant that grants Amazon Redshift permission to encrypt
     * copied snapshots with the specified customer master key (CMK) from AWS
     * KMS in the destination region.
     * </p>
     * <p>
     * For more information about managing snapshot copy grants, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-db-encryption.html"
     * >Amazon Redshift Database Encryption</a> in the <i>Amazon Redshift
     * Cluster Management Guide</i>.
     * </p>
     *
     * @return <p>
     *         The snapshot copy grant that grants Amazon Redshift permission to
     *         encrypt copied snapshots with the specified customer master key
     *         (CMK) from AWS KMS in the destination region.
     *         </p>
     *         <p>
     *         For more information about managing snapshot copy grants, go to
     *         <a href=
     *         "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-db-encryption.html"
     *         >Amazon Redshift Database Encryption</a> in the <i>Amazon
     *         Redshift Cluster Management Guide</i>.
     *         </p>
     */
    public SnapshotCopyGrant getSnapshotCopyGrant() {
        return snapshotCopyGrant;
    }

    /**
     * <p>
     * The snapshot copy grant that grants Amazon Redshift permission to encrypt
     * copied snapshots with the specified customer master key (CMK) from AWS
     * KMS in the destination region.
     * </p>
     * <p>
     * For more information about managing snapshot copy grants, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-db-encryption.html"
     * >Amazon Redshift Database Encryption</a> in the <i>Amazon Redshift
     * Cluster Management Guide</i>.
     * </p>
     *
     * @param snapshotCopyGrant <p>
     *            The snapshot copy grant that grants Amazon Redshift permission
     *            to encrypt copied snapshots with the specified customer master
     *            key (CMK) from AWS KMS in the destination region.
     *            </p>
     *            <p>
     *            For more information about managing snapshot copy grants, go
     *            to <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-db-encryption.html"
     *            >Amazon Redshift Database Encryption</a> in the <i>Amazon
     *            Redshift Cluster Management Guide</i>.
     *            </p>
     */
    public void setSnapshotCopyGrant(SnapshotCopyGrant snapshotCopyGrant) {
        this.snapshotCopyGrant = snapshotCopyGrant;
    }

    /**
     * <p>
     * The snapshot copy grant that grants Amazon Redshift permission to encrypt
     * copied snapshots with the specified customer master key (CMK) from AWS
     * KMS in the destination region.
     * </p>
     * <p>
     * For more information about managing snapshot copy grants, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-db-encryption.html"
     * >Amazon Redshift Database Encryption</a> in the <i>Amazon Redshift
     * Cluster Management Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotCopyGrant <p>
     *            The snapshot copy grant that grants Amazon Redshift permission
     *            to encrypt copied snapshots with the specified customer master
     *            key (CMK) from AWS KMS in the destination region.
     *            </p>
     *            <p>
     *            For more information about managing snapshot copy grants, go
     *            to <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-db-encryption.html"
     *            >Amazon Redshift Database Encryption</a> in the <i>Amazon
     *            Redshift Cluster Management Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotCopyGrantResult withSnapshotCopyGrant(SnapshotCopyGrant snapshotCopyGrant) {
        this.snapshotCopyGrant = snapshotCopyGrant;
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
        if (getSnapshotCopyGrant() != null)
            sb.append("SnapshotCopyGrant: " + getSnapshotCopyGrant());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSnapshotCopyGrant() == null) ? 0 : getSnapshotCopyGrant().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSnapshotCopyGrantResult == false)
            return false;
        CreateSnapshotCopyGrantResult other = (CreateSnapshotCopyGrantResult) obj;

        if (other.getSnapshotCopyGrant() == null ^ this.getSnapshotCopyGrant() == null)
            return false;
        if (other.getSnapshotCopyGrant() != null
                && other.getSnapshotCopyGrant().equals(this.getSnapshotCopyGrant()) == false)
            return false;
        return true;
    }
}
