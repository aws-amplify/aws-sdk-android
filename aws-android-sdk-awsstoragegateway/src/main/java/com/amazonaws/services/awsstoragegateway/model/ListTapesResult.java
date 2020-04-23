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
 * A JSON object containing the following fields:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListTapesOutput$Marker</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListTapesOutput$VolumeInfos</a>
 * </p>
 * </li>
 * </ul>
 */
public class ListTapesResult implements Serializable {
    /**
     * <p>
     * An array of <a>TapeInfo</a> objects, where each object describes a single
     * tape. If there are no tapes in the tape library or VTS, then the
     * <code>TapeInfos</code> is an empty array.
     * </p>
     */
    private java.util.List<TapeInfo> tapeInfos;

    /**
     * <p>
     * A string that indicates the position at which to begin returning the next
     * list of tapes. Use the marker in your next request to continue pagination
     * of tapes. If there are no more tapes to list, this element does not
     * appear in the response body.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String marker;

    /**
     * <p>
     * An array of <a>TapeInfo</a> objects, where each object describes a single
     * tape. If there are no tapes in the tape library or VTS, then the
     * <code>TapeInfos</code> is an empty array.
     * </p>
     *
     * @return <p>
     *         An array of <a>TapeInfo</a> objects, where each object describes
     *         a single tape. If there are no tapes in the tape library or VTS,
     *         then the <code>TapeInfos</code> is an empty array.
     *         </p>
     */
    public java.util.List<TapeInfo> getTapeInfos() {
        return tapeInfos;
    }

    /**
     * <p>
     * An array of <a>TapeInfo</a> objects, where each object describes a single
     * tape. If there are no tapes in the tape library or VTS, then the
     * <code>TapeInfos</code> is an empty array.
     * </p>
     *
     * @param tapeInfos <p>
     *            An array of <a>TapeInfo</a> objects, where each object
     *            describes a single tape. If there are no tapes in the tape
     *            library or VTS, then the <code>TapeInfos</code> is an empty
     *            array.
     *            </p>
     */
    public void setTapeInfos(java.util.Collection<TapeInfo> tapeInfos) {
        if (tapeInfos == null) {
            this.tapeInfos = null;
            return;
        }

        this.tapeInfos = new java.util.ArrayList<TapeInfo>(tapeInfos);
    }

    /**
     * <p>
     * An array of <a>TapeInfo</a> objects, where each object describes a single
     * tape. If there are no tapes in the tape library or VTS, then the
     * <code>TapeInfos</code> is an empty array.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tapeInfos <p>
     *            An array of <a>TapeInfo</a> objects, where each object
     *            describes a single tape. If there are no tapes in the tape
     *            library or VTS, then the <code>TapeInfos</code> is an empty
     *            array.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTapesResult withTapeInfos(TapeInfo... tapeInfos) {
        if (getTapeInfos() == null) {
            this.tapeInfos = new java.util.ArrayList<TapeInfo>(tapeInfos.length);
        }
        for (TapeInfo value : tapeInfos) {
            this.tapeInfos.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>TapeInfo</a> objects, where each object describes a single
     * tape. If there are no tapes in the tape library or VTS, then the
     * <code>TapeInfos</code> is an empty array.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tapeInfos <p>
     *            An array of <a>TapeInfo</a> objects, where each object
     *            describes a single tape. If there are no tapes in the tape
     *            library or VTS, then the <code>TapeInfos</code> is an empty
     *            array.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTapesResult withTapeInfos(java.util.Collection<TapeInfo> tapeInfos) {
        setTapeInfos(tapeInfos);
        return this;
    }

    /**
     * <p>
     * A string that indicates the position at which to begin returning the next
     * list of tapes. Use the marker in your next request to continue pagination
     * of tapes. If there are no more tapes to list, this element does not
     * appear in the response body.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         A string that indicates the position at which to begin returning
     *         the next list of tapes. Use the marker in your next request to
     *         continue pagination of tapes. If there are no more tapes to list,
     *         this element does not appear in the response body.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * A string that indicates the position at which to begin returning the next
     * list of tapes. Use the marker in your next request to continue pagination
     * of tapes. If there are no more tapes to list, this element does not
     * appear in the response body.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker <p>
     *            A string that indicates the position at which to begin
     *            returning the next list of tapes. Use the marker in your next
     *            request to continue pagination of tapes. If there are no more
     *            tapes to list, this element does not appear in the response
     *            body.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A string that indicates the position at which to begin returning the next
     * list of tapes. Use the marker in your next request to continue pagination
     * of tapes. If there are no more tapes to list, this element does not
     * appear in the response body.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker <p>
     *            A string that indicates the position at which to begin
     *            returning the next list of tapes. Use the marker in your next
     *            request to continue pagination of tapes. If there are no more
     *            tapes to list, this element does not appear in the response
     *            body.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTapesResult withMarker(String marker) {
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
        if (getTapeInfos() != null)
            sb.append("TapeInfos: " + getTapeInfos() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTapeInfos() == null) ? 0 : getTapeInfos().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTapesResult == false)
            return false;
        ListTapesResult other = (ListTapesResult) obj;

        if (other.getTapeInfos() == null ^ this.getTapeInfos() == null)
            return false;
        if (other.getTapeInfos() != null
                && other.getTapeInfos().equals(this.getTapeInfos()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
