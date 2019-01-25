/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class ListOTAUpdatesResult implements Serializable {
    /**
     * <p>
     * A list of OTA update jobs.
     * </p>
     */
    private java.util.List<OTAUpdateSummary> otaUpdates;

    /**
     * <p>
     * A token to use to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of OTA update jobs.
     * </p>
     *
     * @return <p>
     *         A list of OTA update jobs.
     *         </p>
     */
    public java.util.List<OTAUpdateSummary> getOtaUpdates() {
        return otaUpdates;
    }

    /**
     * <p>
     * A list of OTA update jobs.
     * </p>
     *
     * @param otaUpdates <p>
     *            A list of OTA update jobs.
     *            </p>
     */
    public void setOtaUpdates(java.util.Collection<OTAUpdateSummary> otaUpdates) {
        if (otaUpdates == null) {
            this.otaUpdates = null;
            return;
        }

        this.otaUpdates = new java.util.ArrayList<OTAUpdateSummary>(otaUpdates);
    }

    /**
     * <p>
     * A list of OTA update jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param otaUpdates <p>
     *            A list of OTA update jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOTAUpdatesResult withOtaUpdates(OTAUpdateSummary... otaUpdates) {
        if (getOtaUpdates() == null) {
            this.otaUpdates = new java.util.ArrayList<OTAUpdateSummary>(otaUpdates.length);
        }
        for (OTAUpdateSummary value : otaUpdates) {
            this.otaUpdates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of OTA update jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param otaUpdates <p>
     *            A list of OTA update jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOTAUpdatesResult withOtaUpdates(java.util.Collection<OTAUpdateSummary> otaUpdates) {
        setOtaUpdates(otaUpdates);
        return this;
    }

    /**
     * <p>
     * A token to use to get the next set of results.
     * </p>
     *
     * @return <p>
     *         A token to use to get the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token to use to get the next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            A token to use to get the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to use to get the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token to use to get the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOTAUpdatesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getOtaUpdates() != null)
            sb.append("otaUpdates: " + getOtaUpdates() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOtaUpdates() == null) ? 0 : getOtaUpdates().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOTAUpdatesResult == false)
            return false;
        ListOTAUpdatesResult other = (ListOTAUpdatesResult) obj;

        if (other.getOtaUpdates() == null ^ this.getOtaUpdates() == null)
            return false;
        if (other.getOtaUpdates() != null
                && other.getOtaUpdates().equals(this.getOtaUpdates()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
