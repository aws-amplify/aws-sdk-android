/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets configuration information for the specified adapter version, including:
 * AdapterId, AdapterVersion, FeatureTypes, Status, StatusMessage,
 * DatasetConfig, KMSKeyId, OutputConfig, Tags and EvaluationMetrics.
 * </p>
 */
public class GetAdapterVersionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A string specifying a unique ID for the adapter version you want to
     * retrieve information for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     */
    private String adapterId;

    /**
     * <p>
     * A string specifying the adapter version you want to retrieve information
     * for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String adapterVersion;

    /**
     * <p>
     * A string specifying a unique ID for the adapter version you want to
     * retrieve information for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     *
     * @return <p>
     *         A string specifying a unique ID for the adapter version you want
     *         to retrieve information for.
     *         </p>
     */
    public String getAdapterId() {
        return adapterId;
    }

    /**
     * <p>
     * A string specifying a unique ID for the adapter version you want to
     * retrieve information for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     *
     * @param adapterId <p>
     *            A string specifying a unique ID for the adapter version you
     *            want to retrieve information for.
     *            </p>
     */
    public void setAdapterId(String adapterId) {
        this.adapterId = adapterId;
    }

    /**
     * <p>
     * A string specifying a unique ID for the adapter version you want to
     * retrieve information for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     *
     * @param adapterId <p>
     *            A string specifying a unique ID for the adapter version you
     *            want to retrieve information for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAdapterVersionRequest withAdapterId(String adapterId) {
        this.adapterId = adapterId;
        return this;
    }

    /**
     * <p>
     * A string specifying the adapter version you want to retrieve information
     * for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         A string specifying the adapter version you want to retrieve
     *         information for.
     *         </p>
     */
    public String getAdapterVersion() {
        return adapterVersion;
    }

    /**
     * <p>
     * A string specifying the adapter version you want to retrieve information
     * for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param adapterVersion <p>
     *            A string specifying the adapter version you want to retrieve
     *            information for.
     *            </p>
     */
    public void setAdapterVersion(String adapterVersion) {
        this.adapterVersion = adapterVersion;
    }

    /**
     * <p>
     * A string specifying the adapter version you want to retrieve information
     * for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param adapterVersion <p>
     *            A string specifying the adapter version you want to retrieve
     *            information for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAdapterVersionRequest withAdapterVersion(String adapterVersion) {
        this.adapterVersion = adapterVersion;
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
        if (getAdapterId() != null)
            sb.append("AdapterId: " + getAdapterId() + ",");
        if (getAdapterVersion() != null)
            sb.append("AdapterVersion: " + getAdapterVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdapterId() == null) ? 0 : getAdapterId().hashCode());
        hashCode = prime * hashCode
                + ((getAdapterVersion() == null) ? 0 : getAdapterVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAdapterVersionRequest == false)
            return false;
        GetAdapterVersionRequest other = (GetAdapterVersionRequest) obj;

        if (other.getAdapterId() == null ^ this.getAdapterId() == null)
            return false;
        if (other.getAdapterId() != null
                && other.getAdapterId().equals(this.getAdapterId()) == false)
            return false;
        if (other.getAdapterVersion() == null ^ this.getAdapterVersion() == null)
            return false;
        if (other.getAdapterVersion() != null
                && other.getAdapterVersion().equals(this.getAdapterVersion()) == false)
            return false;
        return true;
    }
}
