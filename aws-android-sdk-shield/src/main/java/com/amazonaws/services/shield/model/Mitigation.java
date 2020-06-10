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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

/**
 * <p>
 * The mitigation applied to a DDoS attack.
 * </p>
 */
public class Mitigation implements Serializable {
    /**
     * <p>
     * The name of the mitigation taken for this attack.
     * </p>
     */
    private String mitigationName;

    /**
     * <p>
     * The name of the mitigation taken for this attack.
     * </p>
     *
     * @return <p>
     *         The name of the mitigation taken for this attack.
     *         </p>
     */
    public String getMitigationName() {
        return mitigationName;
    }

    /**
     * <p>
     * The name of the mitigation taken for this attack.
     * </p>
     *
     * @param mitigationName <p>
     *            The name of the mitigation taken for this attack.
     *            </p>
     */
    public void setMitigationName(String mitigationName) {
        this.mitigationName = mitigationName;
    }

    /**
     * <p>
     * The name of the mitigation taken for this attack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mitigationName <p>
     *            The name of the mitigation taken for this attack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Mitigation withMitigationName(String mitigationName) {
        this.mitigationName = mitigationName;
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
        if (getMitigationName() != null)
            sb.append("MitigationName: " + getMitigationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMitigationName() == null) ? 0 : getMitigationName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Mitigation == false)
            return false;
        Mitigation other = (Mitigation) obj;

        if (other.getMitigationName() == null ^ this.getMitigationName() == null)
            return false;
        if (other.getMitigationName() != null
                && other.getMitigationName().equals(this.getMitigationName()) == false)
            return false;
        return true;
    }
}
