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

package com.amazonaws.services.awsstoragegateway.model;

import java.io.Serializable;

/**
 * <p>
 * DescribeTapeArchivesOutput
 * </p>
 */
public class DescribeTapeArchivesResult implements Serializable {
    /**
     * <p>
     * An array of virtual tape objects in the virtual tape shelf (VTS). The
     * description includes of the Amazon Resource Name (ARN) of the virtual
     * tapes. The information returned includes the Amazon Resource Names (ARNs)
     * of the tapes, size of the tapes, status of the tapes, progress of the
     * description and tape barcode.
     * </p>
     */
    private java.util.List<TapeArchive> tapeArchives;

    /**
     * <p>
     * An opaque string that indicates the position at which the virtual tapes
     * that were fetched for description ended. Use this marker in your next
     * request to fetch the next set of virtual tapes in the virtual tape shelf
     * (VTS). If there are no more virtual tapes to describe, this field does
     * not appear in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String marker;

    /**
     * <p>
     * An array of virtual tape objects in the virtual tape shelf (VTS). The
     * description includes of the Amazon Resource Name (ARN) of the virtual
     * tapes. The information returned includes the Amazon Resource Names (ARNs)
     * of the tapes, size of the tapes, status of the tapes, progress of the
     * description and tape barcode.
     * </p>
     *
     * @return <p>
     *         An array of virtual tape objects in the virtual tape shelf (VTS).
     *         The description includes of the Amazon Resource Name (ARN) of the
     *         virtual tapes. The information returned includes the Amazon
     *         Resource Names (ARNs) of the tapes, size of the tapes, status of
     *         the tapes, progress of the description and tape barcode.
     *         </p>
     */
    public java.util.List<TapeArchive> getTapeArchives() {
        return tapeArchives;
    }

    /**
     * <p>
     * An array of virtual tape objects in the virtual tape shelf (VTS). The
     * description includes of the Amazon Resource Name (ARN) of the virtual
     * tapes. The information returned includes the Amazon Resource Names (ARNs)
     * of the tapes, size of the tapes, status of the tapes, progress of the
     * description and tape barcode.
     * </p>
     *
     * @param tapeArchives <p>
     *            An array of virtual tape objects in the virtual tape shelf
     *            (VTS). The description includes of the Amazon Resource Name
     *            (ARN) of the virtual tapes. The information returned includes
     *            the Amazon Resource Names (ARNs) of the tapes, size of the
     *            tapes, status of the tapes, progress of the description and
     *            tape barcode.
     *            </p>
     */
    public void setTapeArchives(java.util.Collection<TapeArchive> tapeArchives) {
        if (tapeArchives == null) {
            this.tapeArchives = null;
            return;
        }

        this.tapeArchives = new java.util.ArrayList<TapeArchive>(tapeArchives);
    }

    /**
     * <p>
     * An array of virtual tape objects in the virtual tape shelf (VTS). The
     * description includes of the Amazon Resource Name (ARN) of the virtual
     * tapes. The information returned includes the Amazon Resource Names (ARNs)
     * of the tapes, size of the tapes, status of the tapes, progress of the
     * description and tape barcode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tapeArchives <p>
     *            An array of virtual tape objects in the virtual tape shelf
     *            (VTS). The description includes of the Amazon Resource Name
     *            (ARN) of the virtual tapes. The information returned includes
     *            the Amazon Resource Names (ARNs) of the tapes, size of the
     *            tapes, status of the tapes, progress of the description and
     *            tape barcode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTapeArchivesResult withTapeArchives(TapeArchive... tapeArchives) {
        if (getTapeArchives() == null) {
            this.tapeArchives = new java.util.ArrayList<TapeArchive>(tapeArchives.length);
        }
        for (TapeArchive value : tapeArchives) {
            this.tapeArchives.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of virtual tape objects in the virtual tape shelf (VTS). The
     * description includes of the Amazon Resource Name (ARN) of the virtual
     * tapes. The information returned includes the Amazon Resource Names (ARNs)
     * of the tapes, size of the tapes, status of the tapes, progress of the
     * description and tape barcode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tapeArchives <p>
     *            An array of virtual tape objects in the virtual tape shelf
     *            (VTS). The description includes of the Amazon Resource Name
     *            (ARN) of the virtual tapes. The information returned includes
     *            the Amazon Resource Names (ARNs) of the tapes, size of the
     *            tapes, status of the tapes, progress of the description and
     *            tape barcode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTapeArchivesResult withTapeArchives(
            java.util.Collection<TapeArchive> tapeArchives) {
        setTapeArchives(tapeArchives);
        return this;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which the virtual tapes
     * that were fetched for description ended. Use this marker in your next
     * request to fetch the next set of virtual tapes in the virtual tape shelf
     * (VTS). If there are no more virtual tapes to describe, this field does
     * not appear in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         An opaque string that indicates the position at which the virtual
     *         tapes that were fetched for description ended. Use this marker in
     *         your next request to fetch the next set of virtual tapes in the
     *         virtual tape shelf (VTS). If there are no more virtual tapes to
     *         describe, this field does not appear in the response.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which the virtual tapes
     * that were fetched for description ended. Use this marker in your next
     * request to fetch the next set of virtual tapes in the virtual tape shelf
     * (VTS). If there are no more virtual tapes to describe, this field does
     * not appear in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker <p>
     *            An opaque string that indicates the position at which the
     *            virtual tapes that were fetched for description ended. Use
     *            this marker in your next request to fetch the next set of
     *            virtual tapes in the virtual tape shelf (VTS). If there are no
     *            more virtual tapes to describe, this field does not appear in
     *            the response.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which the virtual tapes
     * that were fetched for description ended. Use this marker in your next
     * request to fetch the next set of virtual tapes in the virtual tape shelf
     * (VTS). If there are no more virtual tapes to describe, this field does
     * not appear in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker <p>
     *            An opaque string that indicates the position at which the
     *            virtual tapes that were fetched for description ended. Use
     *            this marker in your next request to fetch the next set of
     *            virtual tapes in the virtual tape shelf (VTS). If there are no
     *            more virtual tapes to describe, this field does not appear in
     *            the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTapeArchivesResult withMarker(String marker) {
        this.marker = marker;
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
        if (getTapeArchives() != null)
            sb.append("TapeArchives: " + getTapeArchives() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTapeArchives() == null) ? 0 : getTapeArchives().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTapeArchivesResult == false)
            return false;
        DescribeTapeArchivesResult other = (DescribeTapeArchivesResult) obj;

        if (other.getTapeArchives() == null ^ this.getTapeArchives() == null)
            return false;
        if (other.getTapeArchives() != null
                && other.getTapeArchives().equals(this.getTapeArchives()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
