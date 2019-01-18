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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class RegisterThingResult implements Serializable {
    /**
     * <p>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     */
    private String certificatePem;

    /**
     * <p>
     * ARNs for the generated resources.
     * </p>
     */
    private java.util.Map<String, String> resourceArns;

    /**
     * <p>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     *
     * @return <p>
     *         .
     *         </p>
     */
    public String getCertificatePem() {
        return certificatePem;
    }

    /**
     * <p>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     *
     * @param certificatePem <p>
     *            .
     *            </p>
     */
    public void setCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
    }

    /**
     * <p>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     *
     * @param certificatePem <p>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterThingResult withCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
        return this;
    }

    /**
     * <p>
     * ARNs for the generated resources.
     * </p>
     *
     * @return <p>
     *         ARNs for the generated resources.
     *         </p>
     */
    public java.util.Map<String, String> getResourceArns() {
        return resourceArns;
    }

    /**
     * <p>
     * ARNs for the generated resources.
     * </p>
     *
     * @param resourceArns <p>
     *            ARNs for the generated resources.
     *            </p>
     */
    public void setResourceArns(java.util.Map<String, String> resourceArns) {
        this.resourceArns = resourceArns;
    }

    /**
     * <p>
     * ARNs for the generated resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArns <p>
     *            ARNs for the generated resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterThingResult withResourceArns(java.util.Map<String, String> resourceArns) {
        this.resourceArns = resourceArns;
        return this;
    }

    /**
     * <p>
     * ARNs for the generated resources.
     * </p>
     * <p>
     * The method adds a new key-value pair into resourceArns parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into resourceArns.
     * @param value The corresponding value of the entry to be added into
     *            resourceArns.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterThingResult addresourceArnsEntry(String key, String value) {
        if (null == this.resourceArns) {
            this.resourceArns = new java.util.HashMap<String, String>();
        }
        if (this.resourceArns.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.resourceArns.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into resourceArns.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public RegisterThingResult clearresourceArnsEntries() {
        this.resourceArns = null;
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
        if (getCertificatePem() != null)
            sb.append("certificatePem: " + getCertificatePem() + ",");
        if (getResourceArns() != null)
            sb.append("resourceArns: " + getResourceArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCertificatePem() == null) ? 0 : getCertificatePem().hashCode());
        hashCode = prime * hashCode
                + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterThingResult == false)
            return false;
        RegisterThingResult other = (RegisterThingResult) obj;

        if (other.getCertificatePem() == null ^ this.getCertificatePem() == null)
            return false;
        if (other.getCertificatePem() != null
                && other.getCertificatePem().equals(this.getCertificatePem()) == false)
            return false;
        if (other.getResourceArns() == null ^ this.getResourceArns() == null)
            return false;
        if (other.getResourceArns() != null
                && other.getResourceArns().equals(this.getResourceArns()) == false)
            return false;
        return true;
    }
}
