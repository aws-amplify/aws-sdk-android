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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful <a>GetContextKeysForPrincipalPolicy</a>
 * or <a>GetContextKeysForCustomPolicy</a> request.
 * </p>
 */
public class GetContextKeysForCustomPolicyResult implements Serializable {
    /**
     * <p>
     * The list of context keys that are referenced in the input policies.
     * </p>
     */
    private java.util.List<String> contextKeyNames;

    /**
     * <p>
     * The list of context keys that are referenced in the input policies.
     * </p>
     *
     * @return <p>
     *         The list of context keys that are referenced in the input
     *         policies.
     *         </p>
     */
    public java.util.List<String> getContextKeyNames() {
        return contextKeyNames;
    }

    /**
     * <p>
     * The list of context keys that are referenced in the input policies.
     * </p>
     *
     * @param contextKeyNames <p>
     *            The list of context keys that are referenced in the input
     *            policies.
     *            </p>
     */
    public void setContextKeyNames(java.util.Collection<String> contextKeyNames) {
        if (contextKeyNames == null) {
            this.contextKeyNames = null;
            return;
        }

        this.contextKeyNames = new java.util.ArrayList<String>(contextKeyNames);
    }

    /**
     * <p>
     * The list of context keys that are referenced in the input policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contextKeyNames <p>
     *            The list of context keys that are referenced in the input
     *            policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetContextKeysForCustomPolicyResult withContextKeyNames(String... contextKeyNames) {
        if (getContextKeyNames() == null) {
            this.contextKeyNames = new java.util.ArrayList<String>(contextKeyNames.length);
        }
        for (String value : contextKeyNames) {
            this.contextKeyNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of context keys that are referenced in the input policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contextKeyNames <p>
     *            The list of context keys that are referenced in the input
     *            policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetContextKeysForCustomPolicyResult withContextKeyNames(
            java.util.Collection<String> contextKeyNames) {
        setContextKeyNames(contextKeyNames);
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
        if (getContextKeyNames() != null)
            sb.append("ContextKeyNames: " + getContextKeyNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContextKeyNames() == null) ? 0 : getContextKeyNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContextKeysForCustomPolicyResult == false)
            return false;
        GetContextKeysForCustomPolicyResult other = (GetContextKeysForCustomPolicyResult) obj;

        if (other.getContextKeyNames() == null ^ this.getContextKeyNames() == null)
            return false;
        if (other.getContextKeyNames() != null
                && other.getContextKeyNames().equals(this.getContextKeyNames()) == false)
            return false;
        return true;
    }
}
