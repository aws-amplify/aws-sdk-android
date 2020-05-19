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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

public class PutVoiceConnectorOriginationResult implements Serializable {
    /**
     * <p>
     * The updated origination setting details.
     * </p>
     */
    private Origination origination;

    /**
     * <p>
     * The updated origination setting details.
     * </p>
     *
     * @return <p>
     *         The updated origination setting details.
     *         </p>
     */
    public Origination getOrigination() {
        return origination;
    }

    /**
     * <p>
     * The updated origination setting details.
     * </p>
     *
     * @param origination <p>
     *            The updated origination setting details.
     *            </p>
     */
    public void setOrigination(Origination origination) {
        this.origination = origination;
    }

    /**
     * <p>
     * The updated origination setting details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param origination <p>
     *            The updated origination setting details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutVoiceConnectorOriginationResult withOrigination(Origination origination) {
        this.origination = origination;
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
        if (getOrigination() != null)
            sb.append("Origination: " + getOrigination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOrigination() == null) ? 0 : getOrigination().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutVoiceConnectorOriginationResult == false)
            return false;
        PutVoiceConnectorOriginationResult other = (PutVoiceConnectorOriginationResult) obj;

        if (other.getOrigination() == null ^ this.getOrigination() == null)
            return false;
        if (other.getOrigination() != null
                && other.getOrigination().equals(this.getOrigination()) == false)
            return false;
        return true;
    }
}
