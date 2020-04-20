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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

public class BatchDeleteConnectionResult implements Serializable {
    /**
     * <p>
     * A list of names of the connection definitions that were successfully
     * deleted.
     * </p>
     */
    private java.util.List<String> succeeded;

    /**
     * <p>
     * A map of the names of connections that were not successfully deleted to
     * error details.
     * </p>
     */
    private java.util.Map<String, ErrorDetail> errors;

    /**
     * <p>
     * A list of names of the connection definitions that were successfully
     * deleted.
     * </p>
     *
     * @return <p>
     *         A list of names of the connection definitions that were
     *         successfully deleted.
     *         </p>
     */
    public java.util.List<String> getSucceeded() {
        return succeeded;
    }

    /**
     * <p>
     * A list of names of the connection definitions that were successfully
     * deleted.
     * </p>
     *
     * @param succeeded <p>
     *            A list of names of the connection definitions that were
     *            successfully deleted.
     *            </p>
     */
    public void setSucceeded(java.util.Collection<String> succeeded) {
        if (succeeded == null) {
            this.succeeded = null;
            return;
        }

        this.succeeded = new java.util.ArrayList<String>(succeeded);
    }

    /**
     * <p>
     * A list of names of the connection definitions that were successfully
     * deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param succeeded <p>
     *            A list of names of the connection definitions that were
     *            successfully deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteConnectionResult withSucceeded(String... succeeded) {
        if (getSucceeded() == null) {
            this.succeeded = new java.util.ArrayList<String>(succeeded.length);
        }
        for (String value : succeeded) {
            this.succeeded.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of names of the connection definitions that were successfully
     * deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param succeeded <p>
     *            A list of names of the connection definitions that were
     *            successfully deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteConnectionResult withSucceeded(java.util.Collection<String> succeeded) {
        setSucceeded(succeeded);
        return this;
    }

    /**
     * <p>
     * A map of the names of connections that were not successfully deleted to
     * error details.
     * </p>
     *
     * @return <p>
     *         A map of the names of connections that were not successfully
     *         deleted to error details.
     *         </p>
     */
    public java.util.Map<String, ErrorDetail> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A map of the names of connections that were not successfully deleted to
     * error details.
     * </p>
     *
     * @param errors <p>
     *            A map of the names of connections that were not successfully
     *            deleted to error details.
     *            </p>
     */
    public void setErrors(java.util.Map<String, ErrorDetail> errors) {
        this.errors = errors;
    }

    /**
     * <p>
     * A map of the names of connections that were not successfully deleted to
     * error details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            A map of the names of connections that were not successfully
     *            deleted to error details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteConnectionResult withErrors(java.util.Map<String, ErrorDetail> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * <p>
     * A map of the names of connections that were not successfully deleted to
     * error details.
     * </p>
     * <p>
     * The method adds a new key-value pair into Errors parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Errors.
     * @param value The corresponding value of the entry to be added into
     *            Errors.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteConnectionResult addErrorsEntry(String key, ErrorDetail value) {
        if (null == this.errors) {
            this.errors = new java.util.HashMap<String, ErrorDetail>();
        }
        if (this.errors.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.errors.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Errors.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public BatchDeleteConnectionResult clearErrorsEntries() {
        this.errors = null;
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
        if (getSucceeded() != null)
            sb.append("Succeeded: " + getSucceeded() + ",");
        if (getErrors() != null)
            sb.append("Errors: " + getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSucceeded() == null) ? 0 : getSucceeded().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteConnectionResult == false)
            return false;
        BatchDeleteConnectionResult other = (BatchDeleteConnectionResult) obj;

        if (other.getSucceeded() == null ^ this.getSucceeded() == null)
            return false;
        if (other.getSucceeded() != null
                && other.getSucceeded().equals(this.getSucceeded()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }
}
