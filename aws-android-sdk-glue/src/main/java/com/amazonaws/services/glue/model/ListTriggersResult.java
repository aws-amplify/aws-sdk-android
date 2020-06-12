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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

public class ListTriggersResult implements Serializable {
    /**
     * <p>
     * The names of all triggers in the account, or the triggers with the
     * specified tags.
     * </p>
     */
    private java.util.List<String> triggerNames;

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last
     * metric available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The names of all triggers in the account, or the triggers with the
     * specified tags.
     * </p>
     *
     * @return <p>
     *         The names of all triggers in the account, or the triggers with
     *         the specified tags.
     *         </p>
     */
    public java.util.List<String> getTriggerNames() {
        return triggerNames;
    }

    /**
     * <p>
     * The names of all triggers in the account, or the triggers with the
     * specified tags.
     * </p>
     *
     * @param triggerNames <p>
     *            The names of all triggers in the account, or the triggers with
     *            the specified tags.
     *            </p>
     */
    public void setTriggerNames(java.util.Collection<String> triggerNames) {
        if (triggerNames == null) {
            this.triggerNames = null;
            return;
        }

        this.triggerNames = new java.util.ArrayList<String>(triggerNames);
    }

    /**
     * <p>
     * The names of all triggers in the account, or the triggers with the
     * specified tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggerNames <p>
     *            The names of all triggers in the account, or the triggers with
     *            the specified tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTriggersResult withTriggerNames(String... triggerNames) {
        if (getTriggerNames() == null) {
            this.triggerNames = new java.util.ArrayList<String>(triggerNames.length);
        }
        for (String value : triggerNames) {
            this.triggerNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of all triggers in the account, or the triggers with the
     * specified tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggerNames <p>
     *            The names of all triggers in the account, or the triggers with
     *            the specified tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTriggersResult withTriggerNames(java.util.Collection<String> triggerNames) {
        setTriggerNames(triggerNames);
        return this;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last
     * metric available.
     * </p>
     *
     * @return <p>
     *         A continuation token, if the returned list does not contain the
     *         last metric available.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last
     * metric available.
     * </p>
     *
     * @param nextToken <p>
     *            A continuation token, if the returned list does not contain
     *            the last metric available.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last
     * metric available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A continuation token, if the returned list does not contain
     *            the last metric available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTriggersResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getTriggerNames() != null)
            sb.append("TriggerNames: " + getTriggerNames() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTriggerNames() == null) ? 0 : getTriggerNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTriggersResult == false)
            return false;
        ListTriggersResult other = (ListTriggersResult) obj;

        if (other.getTriggerNames() == null ^ this.getTriggerNames() == null)
            return false;
        if (other.getTriggerNames() != null
                && other.getTriggerNames().equals(this.getTriggerNames()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
