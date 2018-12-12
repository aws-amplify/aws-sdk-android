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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves a custom terminology.
 * </p>
 */
public class GetTerminologyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the custom terminology being retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     */
    private String name;

    /**
     * <p>
     * The data format of the custom terminology being retrieved, either CSV or
     * TMX.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, TMX
     */
    private String terminologyDataFormat;

    /**
     * <p>
     * The name of the custom terminology being retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     *
     * @return <p>
     *         The name of the custom terminology being retrieved.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the custom terminology being retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the custom terminology being retrieved.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the custom terminology being retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the custom terminology being retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTerminologyRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The data format of the custom terminology being retrieved, either CSV or
     * TMX.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, TMX
     *
     * @return <p>
     *         The data format of the custom terminology being retrieved, either
     *         CSV or TMX.
     *         </p>
     * @see TerminologyDataFormat
     */
    public String getTerminologyDataFormat() {
        return terminologyDataFormat;
    }

    /**
     * <p>
     * The data format of the custom terminology being retrieved, either CSV or
     * TMX.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, TMX
     *
     * @param terminologyDataFormat <p>
     *            The data format of the custom terminology being retrieved,
     *            either CSV or TMX.
     *            </p>
     * @see TerminologyDataFormat
     */
    public void setTerminologyDataFormat(String terminologyDataFormat) {
        this.terminologyDataFormat = terminologyDataFormat;
    }

    /**
     * <p>
     * The data format of the custom terminology being retrieved, either CSV or
     * TMX.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, TMX
     *
     * @param terminologyDataFormat <p>
     *            The data format of the custom terminology being retrieved,
     *            either CSV or TMX.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TerminologyDataFormat
     */
    public GetTerminologyRequest withTerminologyDataFormat(String terminologyDataFormat) {
        this.terminologyDataFormat = terminologyDataFormat;
        return this;
    }

    /**
     * <p>
     * The data format of the custom terminology being retrieved, either CSV or
     * TMX.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, TMX
     *
     * @param terminologyDataFormat <p>
     *            The data format of the custom terminology being retrieved,
     *            either CSV or TMX.
     *            </p>
     * @see TerminologyDataFormat
     */
    public void setTerminologyDataFormat(TerminologyDataFormat terminologyDataFormat) {
        this.terminologyDataFormat = terminologyDataFormat.toString();
    }

    /**
     * <p>
     * The data format of the custom terminology being retrieved, either CSV or
     * TMX.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, TMX
     *
     * @param terminologyDataFormat <p>
     *            The data format of the custom terminology being retrieved,
     *            either CSV or TMX.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TerminologyDataFormat
     */
    public GetTerminologyRequest withTerminologyDataFormat(
            TerminologyDataFormat terminologyDataFormat) {
        this.terminologyDataFormat = terminologyDataFormat.toString();
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
        if (getTerminologyDataFormat() != null)
            sb.append("TerminologyDataFormat: " + getTerminologyDataFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getTerminologyDataFormat() == null) ? 0 : getTerminologyDataFormat().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTerminologyRequest == false)
            return false;
        GetTerminologyRequest other = (GetTerminologyRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTerminologyDataFormat() == null ^ this.getTerminologyDataFormat() == null)
            return false;
        if (other.getTerminologyDataFormat() != null
                && other.getTerminologyDataFormat().equals(this.getTerminologyDataFormat()) == false)
            return false;
        return true;
    }
}
