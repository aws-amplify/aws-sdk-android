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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists OTA updates.
 * </p>
 */
public class ListOTAUpdatesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A token used to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The OTA update job status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, CREATE_FAILED
     */
    private String otaUpdateStatus;

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @return <p>
     *         The maximum number of results to return at one time.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return at one time.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return at one time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOTAUpdatesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A token used to retrieve the next set of results.
     * </p>
     *
     * @return <p>
     *         A token used to retrieve the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token used to retrieve the next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            A token used to retrieve the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used to retrieve the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token used to retrieve the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOTAUpdatesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The OTA update job status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, CREATE_FAILED
     *
     * @return <p>
     *         The OTA update job status.
     *         </p>
     * @see OTAUpdateStatus
     */
    public String getOtaUpdateStatus() {
        return otaUpdateStatus;
    }

    /**
     * <p>
     * The OTA update job status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, CREATE_FAILED
     *
     * @param otaUpdateStatus <p>
     *            The OTA update job status.
     *            </p>
     * @see OTAUpdateStatus
     */
    public void setOtaUpdateStatus(String otaUpdateStatus) {
        this.otaUpdateStatus = otaUpdateStatus;
    }

    /**
     * <p>
     * The OTA update job status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, CREATE_FAILED
     *
     * @param otaUpdateStatus <p>
     *            The OTA update job status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OTAUpdateStatus
     */
    public ListOTAUpdatesRequest withOtaUpdateStatus(String otaUpdateStatus) {
        this.otaUpdateStatus = otaUpdateStatus;
        return this;
    }

    /**
     * <p>
     * The OTA update job status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, CREATE_FAILED
     *
     * @param otaUpdateStatus <p>
     *            The OTA update job status.
     *            </p>
     * @see OTAUpdateStatus
     */
    public void setOtaUpdateStatus(OTAUpdateStatus otaUpdateStatus) {
        this.otaUpdateStatus = otaUpdateStatus.toString();
    }

    /**
     * <p>
     * The OTA update job status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_PENDING, CREATE_IN_PROGRESS,
     * CREATE_COMPLETE, CREATE_FAILED
     *
     * @param otaUpdateStatus <p>
     *            The OTA update job status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OTAUpdateStatus
     */
    public ListOTAUpdatesRequest withOtaUpdateStatus(OTAUpdateStatus otaUpdateStatus) {
        this.otaUpdateStatus = otaUpdateStatus.toString();
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
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getOtaUpdateStatus() != null)
            sb.append("otaUpdateStatus: " + getOtaUpdateStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getOtaUpdateStatus() == null) ? 0 : getOtaUpdateStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOTAUpdatesRequest == false)
            return false;
        ListOTAUpdatesRequest other = (ListOTAUpdatesRequest) obj;

        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOtaUpdateStatus() == null ^ this.getOtaUpdateStatus() == null)
            return false;
        if (other.getOtaUpdateStatus() != null
                && other.getOtaUpdateStatus().equals(this.getOtaUpdateStatus()) == false)
            return false;
        return true;
    }
}
