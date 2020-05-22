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

package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sends a list of asset property values to AWS IoT SiteWise. Each value is a
 * timestamp-quality-value (TQV) data point. For more information, see <a href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/ingest-api.html"
 * >Ingesting Data Using the API</a> in the <i>AWS IoT SiteWise User Guide</i>.
 * </p>
 * <p>
 * To identify an asset property, you must specify one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The <code>assetId</code> and <code>propertyId</code> of an asset property.
 * </p>
 * </li>
 * <li>
 * <p>
 * A <code>propertyAlias</code>, which is a data stream alias (for example,
 * <code>/company/windfarm/3/turbine/7/temperature</code>). To define an asset
 * property's alias, see <a href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
 * >UpdateAssetProperty</a>.
 * </p>
 * </li>
 * </ul>
 * <important>
 * <p>
 * With respect to Unix epoch time, AWS IoT SiteWise accepts only TQVs that have
 * a timestamp of no more than 15 minutes in the past and no more than 5 minutes
 * in the future. AWS IoT SiteWise rejects timestamps outside of the inclusive
 * range of [-15, +5] minutes and returns a
 * <code>TimestampOutOfRangeException</code> error.
 * </p>
 * <p>
 * For each asset property, AWS IoT SiteWise overwrites TQVs with duplicate
 * timestamps unless the newer TQV has a different quality. For example, if you
 * store a TQV <code>{T1, GOOD, V1}</code>, then storing
 * <code>{T1, GOOD, V2}</code> replaces the existing TQV.
 * </p>
 * </important>
 */
public class BatchPutAssetPropertyValueRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The list of asset property value entries for the batch put request. You
     * can specify up to 10 entries per request.
     * </p>
     */
    private java.util.List<PutAssetPropertyValueEntry> entries;

    /**
     * <p>
     * The list of asset property value entries for the batch put request. You
     * can specify up to 10 entries per request.
     * </p>
     *
     * @return <p>
     *         The list of asset property value entries for the batch put
     *         request. You can specify up to 10 entries per request.
     *         </p>
     */
    public java.util.List<PutAssetPropertyValueEntry> getEntries() {
        return entries;
    }

    /**
     * <p>
     * The list of asset property value entries for the batch put request. You
     * can specify up to 10 entries per request.
     * </p>
     *
     * @param entries <p>
     *            The list of asset property value entries for the batch put
     *            request. You can specify up to 10 entries per request.
     *            </p>
     */
    public void setEntries(java.util.Collection<PutAssetPropertyValueEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new java.util.ArrayList<PutAssetPropertyValueEntry>(entries);
    }

    /**
     * <p>
     * The list of asset property value entries for the batch put request. You
     * can specify up to 10 entries per request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entries <p>
     *            The list of asset property value entries for the batch put
     *            request. You can specify up to 10 entries per request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutAssetPropertyValueRequest withEntries(PutAssetPropertyValueEntry... entries) {
        if (getEntries() == null) {
            this.entries = new java.util.ArrayList<PutAssetPropertyValueEntry>(entries.length);
        }
        for (PutAssetPropertyValueEntry value : entries) {
            this.entries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of asset property value entries for the batch put request. You
     * can specify up to 10 entries per request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entries <p>
     *            The list of asset property value entries for the batch put
     *            request. You can specify up to 10 entries per request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutAssetPropertyValueRequest withEntries(
            java.util.Collection<PutAssetPropertyValueEntry> entries) {
        setEntries(entries);
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
        if (getEntries() != null)
            sb.append("entries: " + getEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutAssetPropertyValueRequest == false)
            return false;
        BatchPutAssetPropertyValueRequest other = (BatchPutAssetPropertyValueRequest) obj;

        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
            return false;
        return true;
    }
}
