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

/**
 * <p>
 * Describes a failed association.
 * </p>
 */
public class FailedCreateAssociation implements Serializable {
    /**
     * <p>
     * The association.
     * </p>
     */
    private CreateAssociationBatchRequestEntry entry;

    /**
     * <p>
     * A description of the failure.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The source of the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Client, Server, Unknown
     */
    private String fault;

    /**
     * <p>
     * The association.
     * </p>
     *
     * @return <p>
     *         The association.
     *         </p>
     */
    public CreateAssociationBatchRequestEntry getEntry() {
        return entry;
    }

    /**
     * <p>
     * The association.
     * </p>
     *
     * @param entry <p>
     *            The association.
     *            </p>
     */
    public void setEntry(CreateAssociationBatchRequestEntry entry) {
        this.entry = entry;
    }

    /**
     * <p>
     * The association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entry <p>
     *            The association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FailedCreateAssociation withEntry(CreateAssociationBatchRequestEntry entry) {
        this.entry = entry;
        return this;
    }

    /**
     * <p>
     * A description of the failure.
     * </p>
     *
     * @return <p>
     *         A description of the failure.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * A description of the failure.
     * </p>
     *
     * @param message <p>
     *            A description of the failure.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            A description of the failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FailedCreateAssociation withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The source of the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Client, Server, Unknown
     *
     * @return <p>
     *         The source of the failure.
     *         </p>
     * @see Fault
     */
    public String getFault() {
        return fault;
    }

    /**
     * <p>
     * The source of the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Client, Server, Unknown
     *
     * @param fault <p>
     *            The source of the failure.
     *            </p>
     * @see Fault
     */
    public void setFault(String fault) {
        this.fault = fault;
    }

    /**
     * <p>
     * The source of the failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Client, Server, Unknown
     *
     * @param fault <p>
     *            The source of the failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Fault
     */
    public FailedCreateAssociation withFault(String fault) {
        this.fault = fault;
        return this;
    }

    /**
     * <p>
     * The source of the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Client, Server, Unknown
     *
     * @param fault <p>
     *            The source of the failure.
     *            </p>
     * @see Fault
     */
    public void setFault(Fault fault) {
        this.fault = fault.toString();
    }

    /**
     * <p>
     * The source of the failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Client, Server, Unknown
     *
     * @param fault <p>
     *            The source of the failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Fault
     */
    public FailedCreateAssociation withFault(Fault fault) {
        this.fault = fault.toString();
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
        if (getEntry() != null)
            sb.append("Entry: " + getEntry() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getFault() != null)
            sb.append("Fault: " + getFault());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntry() == null) ? 0 : getEntry().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getFault() == null) ? 0 : getFault().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailedCreateAssociation == false)
            return false;
        FailedCreateAssociation other = (FailedCreateAssociation) obj;

        if (other.getEntry() == null ^ this.getEntry() == null)
            return false;
        if (other.getEntry() != null && other.getEntry().equals(this.getEntry()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getFault() == null ^ this.getFault() == null)
            return false;
        if (other.getFault() != null && other.getFault().equals(this.getFault()) == false)
            return false;
        return true;
    }
}
