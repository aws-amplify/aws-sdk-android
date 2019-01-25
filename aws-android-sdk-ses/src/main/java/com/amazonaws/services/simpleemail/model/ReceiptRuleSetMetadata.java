/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a receipt rule set.
 * </p>
 * <p>
 * A receipt rule set is a collection of rules that specify what Amazon SES
 * should do with mail it receives on behalf of your account's verified domains.
 * </p>
 * <p>
 * For information about setting up receipt rule sets, see the <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 */
public class ReceiptRuleSetMetadata implements Serializable {
    /**
     * <p>
     * The name of the receipt rule set. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9),
     * underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start and end with a letter or number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     */
    private String name;

    /**
     * <p>
     * The date and time the receipt rule set was created.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The name of the receipt rule set. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9),
     * underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start and end with a letter or number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name of the receipt rule set. The name must:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         This value can only contain ASCII letters (a-z, A-Z), numbers
     *         (0-9), underscores (_), or dashes (-).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start and end with a letter or number.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Contain less than 64 characters.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the receipt rule set. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9),
     * underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start and end with a letter or number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     *
     * @param name <p>
     *            The name of the receipt rule set. The name must:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            This value can only contain ASCII letters (a-z, A-Z), numbers
     *            (0-9), underscores (_), or dashes (-).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Start and end with a letter or number.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Contain less than 64 characters.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the receipt rule set. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9),
     * underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start and end with a letter or number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the receipt rule set. The name must:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            This value can only contain ASCII letters (a-z, A-Z), numbers
     *            (0-9), underscores (_), or dashes (-).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Start and end with a letter or number.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Contain less than 64 characters.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReceiptRuleSetMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The date and time the receipt rule set was created.
     * </p>
     *
     * @return <p>
     *         The date and time the receipt rule set was created.
     *         </p>
     */
    public java.util.Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    /**
     * <p>
     * The date and time the receipt rule set was created.
     * </p>
     *
     * @param createdTimestamp <p>
     *            The date and time the receipt rule set was created.
     *            </p>
     */
    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The date and time the receipt rule set was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTimestamp <p>
     *            The date and time the receipt rule set was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReceiptRuleSetMetadata withCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: " + getCreatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReceiptRuleSetMetadata == false)
            return false;
        ReceiptRuleSetMetadata other = (ReceiptRuleSetMetadata) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null
                && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        return true;
    }
}
