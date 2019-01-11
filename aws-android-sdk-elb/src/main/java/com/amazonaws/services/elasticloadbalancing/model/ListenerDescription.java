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

package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * The policies enabled for a listener.
 * </p>
 */
public class ListenerDescription implements Serializable {
    /**
     * <p>
     * The listener.
     * </p>
     */
    private Listener listener;

    /**
     * <p>
     * The policies. If there are no policies enabled, the list is empty.
     * </p>
     */
    private java.util.List<String> policyNames = new java.util.ArrayList<String>();

    /**
     * <p>
     * The listener.
     * </p>
     *
     * @return <p>
     *         The listener.
     *         </p>
     */
    public Listener getListener() {
        return listener;
    }

    /**
     * <p>
     * The listener.
     * </p>
     *
     * @param listener <p>
     *            The listener.
     *            </p>
     */
    public void setListener(Listener listener) {
        this.listener = listener;
    }

    /**
     * <p>
     * The listener.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param listener <p>
     *            The listener.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListenerDescription withListener(Listener listener) {
        this.listener = listener;
        return this;
    }

    /**
     * <p>
     * The policies. If there are no policies enabled, the list is empty.
     * </p>
     *
     * @return <p>
     *         The policies. If there are no policies enabled, the list is
     *         empty.
     *         </p>
     */
    public java.util.List<String> getPolicyNames() {
        return policyNames;
    }

    /**
     * <p>
     * The policies. If there are no policies enabled, the list is empty.
     * </p>
     *
     * @param policyNames <p>
     *            The policies. If there are no policies enabled, the list is
     *            empty.
     *            </p>
     */
    public void setPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
            return;
        }

        this.policyNames = new java.util.ArrayList<String>(policyNames);
    }

    /**
     * <p>
     * The policies. If there are no policies enabled, the list is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyNames <p>
     *            The policies. If there are no policies enabled, the list is
     *            empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListenerDescription withPolicyNames(String... policyNames) {
        if (getPolicyNames() == null) {
            this.policyNames = new java.util.ArrayList<String>(policyNames.length);
        }
        for (String value : policyNames) {
            this.policyNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The policies. If there are no policies enabled, the list is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyNames <p>
     *            The policies. If there are no policies enabled, the list is
     *            empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListenerDescription withPolicyNames(java.util.Collection<String> policyNames) {
        setPolicyNames(policyNames);
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
        if (getListener() != null)
            sb.append("Listener: " + getListener() + ",");
        if (getPolicyNames() != null)
            sb.append("PolicyNames: " + getPolicyNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListener() == null) ? 0 : getListener().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyNames() == null) ? 0 : getPolicyNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListenerDescription == false)
            return false;
        ListenerDescription other = (ListenerDescription) obj;

        if (other.getListener() == null ^ this.getListener() == null)
            return false;
        if (other.getListener() != null && other.getListener().equals(this.getListener()) == false)
            return false;
        if (other.getPolicyNames() == null ^ this.getPolicyNames() == null)
            return false;
        if (other.getPolicyNames() != null
                && other.getPolicyNames().equals(this.getPolicyNames()) == false)
            return false;
        return true;
    }
}
