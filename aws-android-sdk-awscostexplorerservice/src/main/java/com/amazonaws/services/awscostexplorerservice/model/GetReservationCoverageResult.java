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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

public class GetReservationCoverageResult implements Serializable {
    /**
     * <p>
     * The amount of time that your reservations covered.
     * </p>
     */
    private java.util.List<CoverageByTime> coveragesByTime;

    /**
     * <p>
     * The total amount of instance usage that a reservation covered.
     * </p>
     */
    private Coverage total;

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token
     * when the response from a previous call has more results than the maximum
     * page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String nextPageToken;

    /**
     * <p>
     * The amount of time that your reservations covered.
     * </p>
     *
     * @return <p>
     *         The amount of time that your reservations covered.
     *         </p>
     */
    public java.util.List<CoverageByTime> getCoveragesByTime() {
        return coveragesByTime;
    }

    /**
     * <p>
     * The amount of time that your reservations covered.
     * </p>
     *
     * @param coveragesByTime <p>
     *            The amount of time that your reservations covered.
     *            </p>
     */
    public void setCoveragesByTime(java.util.Collection<CoverageByTime> coveragesByTime) {
        if (coveragesByTime == null) {
            this.coveragesByTime = null;
            return;
        }

        this.coveragesByTime = new java.util.ArrayList<CoverageByTime>(coveragesByTime);
    }

    /**
     * <p>
     * The amount of time that your reservations covered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param coveragesByTime <p>
     *            The amount of time that your reservations covered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservationCoverageResult withCoveragesByTime(CoverageByTime... coveragesByTime) {
        if (getCoveragesByTime() == null) {
            this.coveragesByTime = new java.util.ArrayList<CoverageByTime>(coveragesByTime.length);
        }
        for (CoverageByTime value : coveragesByTime) {
            this.coveragesByTime.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The amount of time that your reservations covered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param coveragesByTime <p>
     *            The amount of time that your reservations covered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservationCoverageResult withCoveragesByTime(
            java.util.Collection<CoverageByTime> coveragesByTime) {
        setCoveragesByTime(coveragesByTime);
        return this;
    }

    /**
     * <p>
     * The total amount of instance usage that a reservation covered.
     * </p>
     *
     * @return <p>
     *         The total amount of instance usage that a reservation covered.
     *         </p>
     */
    public Coverage getTotal() {
        return total;
    }

    /**
     * <p>
     * The total amount of instance usage that a reservation covered.
     * </p>
     *
     * @param total <p>
     *            The total amount of instance usage that a reservation covered.
     *            </p>
     */
    public void setTotal(Coverage total) {
        this.total = total;
    }

    /**
     * <p>
     * The total amount of instance usage that a reservation covered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param total <p>
     *            The total amount of instance usage that a reservation covered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservationCoverageResult withTotal(Coverage total) {
        this.total = total;
        return this;
    }

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token
     * when the response from a previous call has more results than the maximum
     * page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The token for the next set of retrievable results. AWS provides
     *         the token when the response from a previous call has more results
     *         than the maximum page size.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token
     * when the response from a previous call has more results than the maximum
     * page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextPageToken <p>
     *            The token for the next set of retrievable results. AWS
     *            provides the token when the response from a previous call has
     *            more results than the maximum page size.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token
     * when the response from a previous call has more results than the maximum
     * page size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextPageToken <p>
     *            The token for the next set of retrievable results. AWS
     *            provides the token when the response from a previous call has
     *            more results than the maximum page size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservationCoverageResult withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
        if (getCoveragesByTime() != null)
            sb.append("CoveragesByTime: " + getCoveragesByTime() + ",");
        if (getTotal() != null)
            sb.append("Total: " + getTotal() + ",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCoveragesByTime() == null) ? 0 : getCoveragesByTime().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        hashCode = prime * hashCode
                + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReservationCoverageResult == false)
            return false;
        GetReservationCoverageResult other = (GetReservationCoverageResult) obj;

        if (other.getCoveragesByTime() == null ^ this.getCoveragesByTime() == null)
            return false;
        if (other.getCoveragesByTime() != null
                && other.getCoveragesByTime().equals(this.getCoveragesByTime()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
