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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

public class DeleteInventoryResult implements Serializable {
    /**
     * <p>
     * Every <code>DeleteInventory</code> action is assigned a unique ID. This
     * option returns a unique ID. You can use this ID to query the status of a
     * delete operation. This option is useful for ensuring that a delete
     * operation has completed before you begin other actions.
     * </p>
     */
    private String deletionId;

    /**
     * <p>
     * The name of the inventory data type specified in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     */
    private String typeName;

    /**
     * <p>
     * A summary of the delete operation. For more information about this
     * summary, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-custom.html#sysman-inventory-delete-summary"
     * >Deleting custom inventory</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     */
    private InventoryDeletionSummary deletionSummary;

    /**
     * <p>
     * Every <code>DeleteInventory</code> action is assigned a unique ID. This
     * option returns a unique ID. You can use this ID to query the status of a
     * delete operation. This option is useful for ensuring that a delete
     * operation has completed before you begin other actions.
     * </p>
     *
     * @return <p>
     *         Every <code>DeleteInventory</code> action is assigned a unique
     *         ID. This option returns a unique ID. You can use this ID to query
     *         the status of a delete operation. This option is useful for
     *         ensuring that a delete operation has completed before you begin
     *         other actions.
     *         </p>
     */
    public String getDeletionId() {
        return deletionId;
    }

    /**
     * <p>
     * Every <code>DeleteInventory</code> action is assigned a unique ID. This
     * option returns a unique ID. You can use this ID to query the status of a
     * delete operation. This option is useful for ensuring that a delete
     * operation has completed before you begin other actions.
     * </p>
     *
     * @param deletionId <p>
     *            Every <code>DeleteInventory</code> action is assigned a unique
     *            ID. This option returns a unique ID. You can use this ID to
     *            query the status of a delete operation. This option is useful
     *            for ensuring that a delete operation has completed before you
     *            begin other actions.
     *            </p>
     */
    public void setDeletionId(String deletionId) {
        this.deletionId = deletionId;
    }

    /**
     * <p>
     * Every <code>DeleteInventory</code> action is assigned a unique ID. This
     * option returns a unique ID. You can use this ID to query the status of a
     * delete operation. This option is useful for ensuring that a delete
     * operation has completed before you begin other actions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletionId <p>
     *            Every <code>DeleteInventory</code> action is assigned a unique
     *            ID. This option returns a unique ID. You can use this ID to
     *            query the status of a delete operation. This option is useful
     *            for ensuring that a delete operation has completed before you
     *            begin other actions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteInventoryResult withDeletionId(String deletionId) {
        this.deletionId = deletionId;
        return this;
    }

    /**
     * <p>
     * The name of the inventory data type specified in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     *
     * @return <p>
     *         The name of the inventory data type specified in the request.
     *         </p>
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * <p>
     * The name of the inventory data type specified in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     *
     * @param typeName <p>
     *            The name of the inventory data type specified in the request.
     *            </p>
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the inventory data type specified in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     *
     * @param typeName <p>
     *            The name of the inventory data type specified in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteInventoryResult withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * <p>
     * A summary of the delete operation. For more information about this
     * summary, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-custom.html#sysman-inventory-delete-summary"
     * >Deleting custom inventory</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         A summary of the delete operation. For more information about
     *         this summary, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-custom.html#sysman-inventory-delete-summary"
     *         >Deleting custom inventory</a> in the <i>AWS Systems Manager User
     *         Guide</i>.
     *         </p>
     */
    public InventoryDeletionSummary getDeletionSummary() {
        return deletionSummary;
    }

    /**
     * <p>
     * A summary of the delete operation. For more information about this
     * summary, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-custom.html#sysman-inventory-delete-summary"
     * >Deleting custom inventory</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     *
     * @param deletionSummary <p>
     *            A summary of the delete operation. For more information about
     *            this summary, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-custom.html#sysman-inventory-delete-summary"
     *            >Deleting custom inventory</a> in the <i>AWS Systems Manager
     *            User Guide</i>.
     *            </p>
     */
    public void setDeletionSummary(InventoryDeletionSummary deletionSummary) {
        this.deletionSummary = deletionSummary;
    }

    /**
     * <p>
     * A summary of the delete operation. For more information about this
     * summary, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-custom.html#sysman-inventory-delete-summary"
     * >Deleting custom inventory</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletionSummary <p>
     *            A summary of the delete operation. For more information about
     *            this summary, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-custom.html#sysman-inventory-delete-summary"
     *            >Deleting custom inventory</a> in the <i>AWS Systems Manager
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteInventoryResult withDeletionSummary(InventoryDeletionSummary deletionSummary) {
        this.deletionSummary = deletionSummary;
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
        if (getDeletionId() != null)
            sb.append("DeletionId: " + getDeletionId() + ",");
        if (getTypeName() != null)
            sb.append("TypeName: " + getTypeName() + ",");
        if (getDeletionSummary() != null)
            sb.append("DeletionSummary: " + getDeletionSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeletionId() == null) ? 0 : getDeletionId().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode
                + ((getDeletionSummary() == null) ? 0 : getDeletionSummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteInventoryResult == false)
            return false;
        DeleteInventoryResult other = (DeleteInventoryResult) obj;

        if (other.getDeletionId() == null ^ this.getDeletionId() == null)
            return false;
        if (other.getDeletionId() != null
                && other.getDeletionId().equals(this.getDeletionId()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getDeletionSummary() == null ^ this.getDeletionSummary() == null)
            return false;
        if (other.getDeletionSummary() != null
                && other.getDeletionSummary().equals(this.getDeletionSummary()) == false)
            return false;
        return true;
    }
}
