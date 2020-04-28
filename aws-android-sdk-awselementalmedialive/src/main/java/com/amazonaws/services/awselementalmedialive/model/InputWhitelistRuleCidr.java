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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * An IPv4 CIDR to whitelist.
 */
public class InputWhitelistRuleCidr implements Serializable {
    /**
     * The IPv4 CIDR to whitelist.
     */
    private String cidr;

    /**
     * The IPv4 CIDR to whitelist.
     *
     * @return The IPv4 CIDR to whitelist.
     */
    public String getCidr() {
        return cidr;
    }

    /**
     * The IPv4 CIDR to whitelist.
     *
     * @param cidr The IPv4 CIDR to whitelist.
     */
    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * The IPv4 CIDR to whitelist.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidr The IPv4 CIDR to whitelist.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputWhitelistRuleCidr withCidr(String cidr) {
        this.cidr = cidr;
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
        if (getCidr() != null)
            sb.append("Cidr: " + getCidr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputWhitelistRuleCidr == false)
            return false;
        InputWhitelistRuleCidr other = (InputWhitelistRuleCidr) obj;

        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        return true;
    }
}
