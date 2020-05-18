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

package com.amazonaws.services.dynamodb.model;

import java.io.Serializable;

/**
 * <p>
 * A list of requests that can perform update, put, delete, or check operations
 * on multiple items in one or more tables atomically.
 * </p>
 */
public class TransactWriteItem implements Serializable {
    /**
     * <p>
     * A request to perform a check item operation.
     * </p>
     */
    private ConditionCheck conditionCheck;

    /**
     * <p>
     * A request to perform a <code>PutItem</code> operation.
     * </p>
     */
    private Put put;

    /**
     * <p>
     * A request to perform a <code>DeleteItem</code> operation.
     * </p>
     */
    private Delete delete;

    /**
     * <p>
     * A request to perform an <code>UpdateItem</code> operation.
     * </p>
     */
    private Update update;

    /**
     * <p>
     * A request to perform a check item operation.
     * </p>
     *
     * @return <p>
     *         A request to perform a check item operation.
     *         </p>
     */
    public ConditionCheck getConditionCheck() {
        return conditionCheck;
    }

    /**
     * <p>
     * A request to perform a check item operation.
     * </p>
     *
     * @param conditionCheck <p>
     *            A request to perform a check item operation.
     *            </p>
     */
    public void setConditionCheck(ConditionCheck conditionCheck) {
        this.conditionCheck = conditionCheck;
    }

    /**
     * <p>
     * A request to perform a check item operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conditionCheck <p>
     *            A request to perform a check item operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransactWriteItem withConditionCheck(ConditionCheck conditionCheck) {
        this.conditionCheck = conditionCheck;
        return this;
    }

    /**
     * <p>
     * A request to perform a <code>PutItem</code> operation.
     * </p>
     *
     * @return <p>
     *         A request to perform a <code>PutItem</code> operation.
     *         </p>
     */
    public Put getPut() {
        return put;
    }

    /**
     * <p>
     * A request to perform a <code>PutItem</code> operation.
     * </p>
     *
     * @param put <p>
     *            A request to perform a <code>PutItem</code> operation.
     *            </p>
     */
    public void setPut(Put put) {
        this.put = put;
    }

    /**
     * <p>
     * A request to perform a <code>PutItem</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param put <p>
     *            A request to perform a <code>PutItem</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransactWriteItem withPut(Put put) {
        this.put = put;
        return this;
    }

    /**
     * <p>
     * A request to perform a <code>DeleteItem</code> operation.
     * </p>
     *
     * @return <p>
     *         A request to perform a <code>DeleteItem</code> operation.
     *         </p>
     */
    public Delete getDelete() {
        return delete;
    }

    /**
     * <p>
     * A request to perform a <code>DeleteItem</code> operation.
     * </p>
     *
     * @param delete <p>
     *            A request to perform a <code>DeleteItem</code> operation.
     *            </p>
     */
    public void setDelete(Delete delete) {
        this.delete = delete;
    }

    /**
     * <p>
     * A request to perform a <code>DeleteItem</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param delete <p>
     *            A request to perform a <code>DeleteItem</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransactWriteItem withDelete(Delete delete) {
        this.delete = delete;
        return this;
    }

    /**
     * <p>
     * A request to perform an <code>UpdateItem</code> operation.
     * </p>
     *
     * @return <p>
     *         A request to perform an <code>UpdateItem</code> operation.
     *         </p>
     */
    public Update getUpdate() {
        return update;
    }

    /**
     * <p>
     * A request to perform an <code>UpdateItem</code> operation.
     * </p>
     *
     * @param update <p>
     *            A request to perform an <code>UpdateItem</code> operation.
     *            </p>
     */
    public void setUpdate(Update update) {
        this.update = update;
    }

    /**
     * <p>
     * A request to perform an <code>UpdateItem</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param update <p>
     *            A request to perform an <code>UpdateItem</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransactWriteItem withUpdate(Update update) {
        this.update = update;
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
        if (getConditionCheck() != null)
            sb.append("ConditionCheck: " + getConditionCheck() + ",");
        if (getPut() != null)
            sb.append("Put: " + getPut() + ",");
        if (getDelete() != null)
            sb.append("Delete: " + getDelete() + ",");
        if (getUpdate() != null)
            sb.append("Update: " + getUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConditionCheck() == null) ? 0 : getConditionCheck().hashCode());
        hashCode = prime * hashCode + ((getPut() == null) ? 0 : getPut().hashCode());
        hashCode = prime * hashCode + ((getDelete() == null) ? 0 : getDelete().hashCode());
        hashCode = prime * hashCode + ((getUpdate() == null) ? 0 : getUpdate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransactWriteItem == false)
            return false;
        TransactWriteItem other = (TransactWriteItem) obj;

        if (other.getConditionCheck() == null ^ this.getConditionCheck() == null)
            return false;
        if (other.getConditionCheck() != null
                && other.getConditionCheck().equals(this.getConditionCheck()) == false)
            return false;
        if (other.getPut() == null ^ this.getPut() == null)
            return false;
        if (other.getPut() != null && other.getPut().equals(this.getPut()) == false)
            return false;
        if (other.getDelete() == null ^ this.getDelete() == null)
            return false;
        if (other.getDelete() != null && other.getDelete().equals(this.getDelete()) == false)
            return false;
        if (other.getUpdate() == null ^ this.getUpdate() == null)
            return false;
        if (other.getUpdate() != null && other.getUpdate().equals(this.getUpdate()) == false)
            return false;
        return true;
    }
}
