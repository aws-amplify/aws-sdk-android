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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists virtual tapes in your virtual tape library (VTL) and your virtual tape
 * shelf (VTS). You specify the tapes to list by specifying one or more tape
 * Amazon Resource Names (ARNs). If you don't specify a tape ARN, the operation
 * lists all virtual tapes in both your VTL and VTS.
 * </p>
 * <p>
 * This operation supports pagination. By default, the operation returns a
 * maximum of up to 100 tapes. You can optionally specify the <code>Limit</code>
 * parameter in the body to limit the number of tapes in the response. If the
 * number of tapes returned in the response is truncated, the response includes
 * a <code>Marker</code> element that you can use in your subsequent request to
 * retrieve the next set of tapes. This operation is only supported in the tape
 * gateway type.
 * </p>
 */
public class ListTapesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of each of the tapes you want to list. If
     * you don't specify a tape ARN, the response lists all tapes in both your
     * VTL and VTS.
     * </p>
     */
    private java.util.List<String> tapeARNs;

    /**
     * <p>
     * A string that indicates the position at which to begin the returned list
     * of tapes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String marker;

    /**
     * <p>
     * An optional number limit for the tapes in the list returned by this call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer limit;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of each of the tapes you want to list. If
     * you don't specify a tape ARN, the response lists all tapes in both your
     * VTL and VTS.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of each of the tapes you want to
     *         list. If you don't specify a tape ARN, the response lists all
     *         tapes in both your VTL and VTS.
     *         </p>
     */
    public java.util.List<String> getTapeARNs() {
        return tapeARNs;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of each of the tapes you want to list. If
     * you don't specify a tape ARN, the response lists all tapes in both your
     * VTL and VTS.
     * </p>
     *
     * @param tapeARNs <p>
     *            The Amazon Resource Name (ARN) of each of the tapes you want
     *            to list. If you don't specify a tape ARN, the response lists
     *            all tapes in both your VTL and VTS.
     *            </p>
     */
    public void setTapeARNs(java.util.Collection<String> tapeARNs) {
        if (tapeARNs == null) {
            this.tapeARNs = null;
            return;
        }

        this.tapeARNs = new java.util.ArrayList<String>(tapeARNs);
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of each of the tapes you want to list. If
     * you don't specify a tape ARN, the response lists all tapes in both your
     * VTL and VTS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tapeARNs <p>
     *            The Amazon Resource Name (ARN) of each of the tapes you want
     *            to list. If you don't specify a tape ARN, the response lists
     *            all tapes in both your VTL and VTS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTapesRequest withTapeARNs(String... tapeARNs) {
        if (getTapeARNs() == null) {
            this.tapeARNs = new java.util.ArrayList<String>(tapeARNs.length);
        }
        for (String value : tapeARNs) {
            this.tapeARNs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of each of the tapes you want to list. If
     * you don't specify a tape ARN, the response lists all tapes in both your
     * VTL and VTS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tapeARNs <p>
     *            The Amazon Resource Name (ARN) of each of the tapes you want
     *            to list. If you don't specify a tape ARN, the response lists
     *            all tapes in both your VTL and VTS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTapesRequest withTapeARNs(java.util.Collection<String> tapeARNs) {
        setTapeARNs(tapeARNs);
        return this;
    }

    /**
     * <p>
     * A string that indicates the position at which to begin the returned list
     * of tapes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         A string that indicates the position at which to begin the
     *         returned list of tapes.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * A string that indicates the position at which to begin the returned list
     * of tapes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker <p>
     *            A string that indicates the position at which to begin the
     *            returned list of tapes.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A string that indicates the position at which to begin the returned list
     * of tapes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker <p>
     *            A string that indicates the position at which to begin the
     *            returned list of tapes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTapesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * An optional number limit for the tapes in the list returned by this call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         An optional number limit for the tapes in the list returned by
     *         this call.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * An optional number limit for the tapes in the list returned by this call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit <p>
     *            An optional number limit for the tapes in the list returned by
     *            this call.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * An optional number limit for the tapes in the list returned by this call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit <p>
     *            An optional number limit for the tapes in the list returned by
     *            this call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTapesRequest withLimit(Integer limit) {
        this.limit = limit;
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
        if (getTapeARNs() != null)
            sb.append("TapeARNs: " + getTapeARNs() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTapeARNs() == null) ? 0 : getTapeARNs().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTapesRequest == false)
            return false;
        ListTapesRequest other = (ListTapesRequest) obj;

        if (other.getTapeARNs() == null ^ this.getTapeARNs() == null)
            return false;
        if (other.getTapeARNs() != null && other.getTapeARNs().equals(this.getTapeARNs()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }
}
