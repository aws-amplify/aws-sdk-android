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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * An object containing detailed information about the self-service action.
 * </p>
 */
public class ServiceActionDetail implements Serializable {
    /**
     * <p>
     * Summary information about the self-service action.
     * </p>
     */
    private ServiceActionSummary serviceActionSummary;

    /**
     * <p>
     * A map that defines the self-service action.
     * </p>
     */
    private java.util.Map<String, String> definition;

    /**
     * <p>
     * Summary information about the self-service action.
     * </p>
     *
     * @return <p>
     *         Summary information about the self-service action.
     *         </p>
     */
    public ServiceActionSummary getServiceActionSummary() {
        return serviceActionSummary;
    }

    /**
     * <p>
     * Summary information about the self-service action.
     * </p>
     *
     * @param serviceActionSummary <p>
     *            Summary information about the self-service action.
     *            </p>
     */
    public void setServiceActionSummary(ServiceActionSummary serviceActionSummary) {
        this.serviceActionSummary = serviceActionSummary;
    }

    /**
     * <p>
     * Summary information about the self-service action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceActionSummary <p>
     *            Summary information about the self-service action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceActionDetail withServiceActionSummary(ServiceActionSummary serviceActionSummary) {
        this.serviceActionSummary = serviceActionSummary;
        return this;
    }

    /**
     * <p>
     * A map that defines the self-service action.
     * </p>
     *
     * @return <p>
     *         A map that defines the self-service action.
     *         </p>
     */
    public java.util.Map<String, String> getDefinition() {
        return definition;
    }

    /**
     * <p>
     * A map that defines the self-service action.
     * </p>
     *
     * @param definition <p>
     *            A map that defines the self-service action.
     *            </p>
     */
    public void setDefinition(java.util.Map<String, String> definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * A map that defines the self-service action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param definition <p>
     *            A map that defines the self-service action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceActionDetail withDefinition(java.util.Map<String, String> definition) {
        this.definition = definition;
        return this;
    }

    /**
     * <p>
     * A map that defines the self-service action.
     * </p>
     * <p>
     * The method adds a new key-value pair into Definition parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Definition.
     * @param value The corresponding value of the entry to be added into
     *            Definition.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceActionDetail addDefinitionEntry(String key, String value) {
        if (null == this.definition) {
            this.definition = new java.util.HashMap<String, String>();
        }
        if (this.definition.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.definition.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Definition.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ServiceActionDetail clearDefinitionEntries() {
        this.definition = null;
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
        if (getServiceActionSummary() != null)
            sb.append("ServiceActionSummary: " + getServiceActionSummary() + ",");
        if (getDefinition() != null)
            sb.append("Definition: " + getDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getServiceActionSummary() == null) ? 0 : getServiceActionSummary().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceActionDetail == false)
            return false;
        ServiceActionDetail other = (ServiceActionDetail) obj;

        if (other.getServiceActionSummary() == null ^ this.getServiceActionSummary() == null)
            return false;
        if (other.getServiceActionSummary() != null
                && other.getServiceActionSummary().equals(this.getServiceActionSummary()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null
                && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        return true;
    }
}
