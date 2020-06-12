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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets the usage data of a usage plan in a specified time interval.
 * </p>
 */
public class GetUsageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The Id of the usage plan associated with the usage data.
     * </p>
     */
    private String usagePlanId;

    /**
     * <p>
     * The Id of the API key associated with the resultant usage data.
     * </p>
     */
    private String keyId;

    /**
     * <p>
     * [Required] The starting date (e.g., 2016-01-01) of the usage data.
     * </p>
     */
    private String startDate;

    /**
     * <p>
     * [Required] The ending date (e.g., 2016-12-31) of the usage data.
     * </p>
     */
    private String endDate;

    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     */
    private String position;

    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25
     * and the maximum value is 500.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * [Required] The Id of the usage plan associated with the usage data.
     * </p>
     *
     * @return <p>
     *         [Required] The Id of the usage plan associated with the usage
     *         data.
     *         </p>
     */
    public String getUsagePlanId() {
        return usagePlanId;
    }

    /**
     * <p>
     * [Required] The Id of the usage plan associated with the usage data.
     * </p>
     *
     * @param usagePlanId <p>
     *            [Required] The Id of the usage plan associated with the usage
     *            data.
     *            </p>
     */
    public void setUsagePlanId(String usagePlanId) {
        this.usagePlanId = usagePlanId;
    }

    /**
     * <p>
     * [Required] The Id of the usage plan associated with the usage data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usagePlanId <p>
     *            [Required] The Id of the usage plan associated with the usage
     *            data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsageRequest withUsagePlanId(String usagePlanId) {
        this.usagePlanId = usagePlanId;
        return this;
    }

    /**
     * <p>
     * The Id of the API key associated with the resultant usage data.
     * </p>
     *
     * @return <p>
     *         The Id of the API key associated with the resultant usage data.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The Id of the API key associated with the resultant usage data.
     * </p>
     *
     * @param keyId <p>
     *            The Id of the API key associated with the resultant usage
     *            data.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The Id of the API key associated with the resultant usage data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyId <p>
     *            The Id of the API key associated with the resultant usage
     *            data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsageRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * [Required] The starting date (e.g., 2016-01-01) of the usage data.
     * </p>
     *
     * @return <p>
     *         [Required] The starting date (e.g., 2016-01-01) of the usage
     *         data.
     *         </p>
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * <p>
     * [Required] The starting date (e.g., 2016-01-01) of the usage data.
     * </p>
     *
     * @param startDate <p>
     *            [Required] The starting date (e.g., 2016-01-01) of the usage
     *            data.
     *            </p>
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * [Required] The starting date (e.g., 2016-01-01) of the usage data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startDate <p>
     *            [Required] The starting date (e.g., 2016-01-01) of the usage
     *            data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsageRequest withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * <p>
     * [Required] The ending date (e.g., 2016-12-31) of the usage data.
     * </p>
     *
     * @return <p>
     *         [Required] The ending date (e.g., 2016-12-31) of the usage data.
     *         </p>
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * <p>
     * [Required] The ending date (e.g., 2016-12-31) of the usage data.
     * </p>
     *
     * @param endDate <p>
     *            [Required] The ending date (e.g., 2016-12-31) of the usage
     *            data.
     *            </p>
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * [Required] The ending date (e.g., 2016-12-31) of the usage data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endDate <p>
     *            [Required] The ending date (e.g., 2016-12-31) of the usage
     *            data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsageRequest withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     *
     * @return <p>
     *         The current pagination position in the paged result set.
     *         </p>
     */
    public String getPosition() {
        return position;
    }

    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     *
     * @param position <p>
     *            The current pagination position in the paged result set.
     *            </p>
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param position <p>
     *            The current pagination position in the paged result set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsageRequest withPosition(String position) {
        this.position = position;
        return this;
    }

    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25
     * and the maximum value is 500.
     * </p>
     *
     * @return <p>
     *         The maximum number of returned results per page. The default
     *         value is 25 and the maximum value is 500.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25
     * and the maximum value is 500.
     * </p>
     *
     * @param limit <p>
     *            The maximum number of returned results per page. The default
     *            value is 25 and the maximum value is 500.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25
     * and the maximum value is 500.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limit <p>
     *            The maximum number of returned results per page. The default
     *            value is 25 and the maximum value is 500.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsageRequest withLimit(Integer limit) {
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
        if (getUsagePlanId() != null)
            sb.append("usagePlanId: " + getUsagePlanId() + ",");
        if (getKeyId() != null)
            sb.append("keyId: " + getKeyId() + ",");
        if (getStartDate() != null)
            sb.append("startDate: " + getStartDate() + ",");
        if (getEndDate() != null)
            sb.append("endDate: " + getEndDate() + ",");
        if (getPosition() != null)
            sb.append("position: " + getPosition() + ",");
        if (getLimit() != null)
            sb.append("limit: " + getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUsagePlanId() == null) ? 0 : getUsagePlanId().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUsageRequest == false)
            return false;
        GetUsageRequest other = (GetUsageRequest) obj;

        if (other.getUsagePlanId() == null ^ this.getUsagePlanId() == null)
            return false;
        if (other.getUsagePlanId() != null
                && other.getUsagePlanId().equals(this.getUsagePlanId()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null
                && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }
}
