/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

public class GetTerminologyResult implements Serializable {
    /**
     * <p>
     * The properties of the custom terminology being retrieved.
     * </p>
     */
    private TerminologyProperties terminologyProperties;

    /**
     * <p>
     * The data location of the custom terminology being retrieved. The custom
     * terminology file is returned in a presigned url that has a 30 minute
     * expiration.
     * </p>
     */
    private TerminologyDataLocation terminologyDataLocation;

    /**
     * <p>
     * The properties of the custom terminology being retrieved.
     * </p>
     *
     * @return <p>
     *         The properties of the custom terminology being retrieved.
     *         </p>
     */
    public TerminologyProperties getTerminologyProperties() {
        return terminologyProperties;
    }

    /**
     * <p>
     * The properties of the custom terminology being retrieved.
     * </p>
     *
     * @param terminologyProperties <p>
     *            The properties of the custom terminology being retrieved.
     *            </p>
     */
    public void setTerminologyProperties(TerminologyProperties terminologyProperties) {
        this.terminologyProperties = terminologyProperties;
    }

    /**
     * <p>
     * The properties of the custom terminology being retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminologyProperties <p>
     *            The properties of the custom terminology being retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTerminologyResult withTerminologyProperties(
            TerminologyProperties terminologyProperties) {
        this.terminologyProperties = terminologyProperties;
        return this;
    }

    /**
     * <p>
     * The data location of the custom terminology being retrieved. The custom
     * terminology file is returned in a presigned url that has a 30 minute
     * expiration.
     * </p>
     *
     * @return <p>
     *         The data location of the custom terminology being retrieved. The
     *         custom terminology file is returned in a presigned url that has a
     *         30 minute expiration.
     *         </p>
     */
    public TerminologyDataLocation getTerminologyDataLocation() {
        return terminologyDataLocation;
    }

    /**
     * <p>
     * The data location of the custom terminology being retrieved. The custom
     * terminology file is returned in a presigned url that has a 30 minute
     * expiration.
     * </p>
     *
     * @param terminologyDataLocation <p>
     *            The data location of the custom terminology being retrieved.
     *            The custom terminology file is returned in a presigned url
     *            that has a 30 minute expiration.
     *            </p>
     */
    public void setTerminologyDataLocation(TerminologyDataLocation terminologyDataLocation) {
        this.terminologyDataLocation = terminologyDataLocation;
    }

    /**
     * <p>
     * The data location of the custom terminology being retrieved. The custom
     * terminology file is returned in a presigned url that has a 30 minute
     * expiration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminologyDataLocation <p>
     *            The data location of the custom terminology being retrieved.
     *            The custom terminology file is returned in a presigned url
     *            that has a 30 minute expiration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTerminologyResult withTerminologyDataLocation(
            TerminologyDataLocation terminologyDataLocation) {
        this.terminologyDataLocation = terminologyDataLocation;
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
        if (getTerminologyProperties() != null)
            sb.append("TerminologyProperties: " + getTerminologyProperties() + ",");
        if (getTerminologyDataLocation() != null)
            sb.append("TerminologyDataLocation: " + getTerminologyDataLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTerminologyProperties() == null) ? 0 : getTerminologyProperties().hashCode());
        hashCode = prime
                * hashCode
                + ((getTerminologyDataLocation() == null) ? 0 : getTerminologyDataLocation()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTerminologyResult == false)
            return false;
        GetTerminologyResult other = (GetTerminologyResult) obj;

        if (other.getTerminologyProperties() == null ^ this.getTerminologyProperties() == null)
            return false;
        if (other.getTerminologyProperties() != null
                && other.getTerminologyProperties().equals(this.getTerminologyProperties()) == false)
            return false;
        if (other.getTerminologyDataLocation() == null ^ this.getTerminologyDataLocation() == null)
            return false;
        if (other.getTerminologyDataLocation() != null
                && other.getTerminologyDataLocation().equals(this.getTerminologyDataLocation()) == false)
            return false;
        return true;
    }
}
