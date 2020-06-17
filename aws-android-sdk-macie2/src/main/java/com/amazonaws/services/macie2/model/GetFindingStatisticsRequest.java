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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves (queries) aggregated statistical data about findings.
 * </p>
 */
public class GetFindingStatisticsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The criteria to use to filter the query results.
     * </p>
     */
    private FindingCriteria findingCriteria;

    /**
     * <p>
     * The finding property to use to group the query results. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * classificationDetails.jobId - The unique identifier for the
     * classification job that produced the finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * resourcesAffected.s3Bucket.name - The name of the S3 bucket that the
     * finding applies to.
     * </p>
     * </li>
     * <li>
     * <p>
     * severity.description - The severity of the finding, such as High or
     * Medium.
     * </p>
     * </li>
     * <li>
     * <p>
     * type - The type of finding, such as Policy:IAMUser/S3BucketPublic and
     * SensitiveData:S3Object/Personal.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>resourcesAffected.s3Bucket.name, type,
     * classificationDetails.jobId, severity.description
     */
    private String groupBy;

    /**
     * <p>
     * The maximum number of items to include in each page of the response.
     * </p>
     */
    private Integer size;

    /**
     * <p>
     * The criteria to use to sort the query results.
     * </p>
     */
    private FindingStatisticsSortCriteria sortCriteria;

    /**
     * <p>
     * The criteria to use to filter the query results.
     * </p>
     *
     * @return <p>
     *         The criteria to use to filter the query results.
     *         </p>
     */
    public FindingCriteria getFindingCriteria() {
        return findingCriteria;
    }

    /**
     * <p>
     * The criteria to use to filter the query results.
     * </p>
     *
     * @param findingCriteria <p>
     *            The criteria to use to filter the query results.
     *            </p>
     */
    public void setFindingCriteria(FindingCriteria findingCriteria) {
        this.findingCriteria = findingCriteria;
    }

    /**
     * <p>
     * The criteria to use to filter the query results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingCriteria <p>
     *            The criteria to use to filter the query results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingStatisticsRequest withFindingCriteria(FindingCriteria findingCriteria) {
        this.findingCriteria = findingCriteria;
        return this;
    }

    /**
     * <p>
     * The finding property to use to group the query results. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * classificationDetails.jobId - The unique identifier for the
     * classification job that produced the finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * resourcesAffected.s3Bucket.name - The name of the S3 bucket that the
     * finding applies to.
     * </p>
     * </li>
     * <li>
     * <p>
     * severity.description - The severity of the finding, such as High or
     * Medium.
     * </p>
     * </li>
     * <li>
     * <p>
     * type - The type of finding, such as Policy:IAMUser/S3BucketPublic and
     * SensitiveData:S3Object/Personal.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>resourcesAffected.s3Bucket.name, type,
     * classificationDetails.jobId, severity.description
     *
     * @return <p>
     *         The finding property to use to group the query results. Valid
     *         values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         classificationDetails.jobId - The unique identifier for the
     *         classification job that produced the finding.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         resourcesAffected.s3Bucket.name - The name of the S3 bucket that
     *         the finding applies to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         severity.description - The severity of the finding, such as High
     *         or Medium.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         type - The type of finding, such as Policy:IAMUser/S3BucketPublic
     *         and SensitiveData:S3Object/Personal.
     *         </p>
     *         </li>
     *         </ul>
     * @see GroupBy
     */
    public String getGroupBy() {
        return groupBy;
    }

    /**
     * <p>
     * The finding property to use to group the query results. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * classificationDetails.jobId - The unique identifier for the
     * classification job that produced the finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * resourcesAffected.s3Bucket.name - The name of the S3 bucket that the
     * finding applies to.
     * </p>
     * </li>
     * <li>
     * <p>
     * severity.description - The severity of the finding, such as High or
     * Medium.
     * </p>
     * </li>
     * <li>
     * <p>
     * type - The type of finding, such as Policy:IAMUser/S3BucketPublic and
     * SensitiveData:S3Object/Personal.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>resourcesAffected.s3Bucket.name, type,
     * classificationDetails.jobId, severity.description
     *
     * @param groupBy <p>
     *            The finding property to use to group the query results. Valid
     *            values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            classificationDetails.jobId - The unique identifier for the
     *            classification job that produced the finding.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resourcesAffected.s3Bucket.name - The name of the S3 bucket
     *            that the finding applies to.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            severity.description - The severity of the finding, such as
     *            High or Medium.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            type - The type of finding, such as
     *            Policy:IAMUser/S3BucketPublic and
     *            SensitiveData:S3Object/Personal.
     *            </p>
     *            </li>
     *            </ul>
     * @see GroupBy
     */
    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    /**
     * <p>
     * The finding property to use to group the query results. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * classificationDetails.jobId - The unique identifier for the
     * classification job that produced the finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * resourcesAffected.s3Bucket.name - The name of the S3 bucket that the
     * finding applies to.
     * </p>
     * </li>
     * <li>
     * <p>
     * severity.description - The severity of the finding, such as High or
     * Medium.
     * </p>
     * </li>
     * <li>
     * <p>
     * type - The type of finding, such as Policy:IAMUser/S3BucketPublic and
     * SensitiveData:S3Object/Personal.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>resourcesAffected.s3Bucket.name, type,
     * classificationDetails.jobId, severity.description
     *
     * @param groupBy <p>
     *            The finding property to use to group the query results. Valid
     *            values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            classificationDetails.jobId - The unique identifier for the
     *            classification job that produced the finding.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resourcesAffected.s3Bucket.name - The name of the S3 bucket
     *            that the finding applies to.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            severity.description - The severity of the finding, such as
     *            High or Medium.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            type - The type of finding, such as
     *            Policy:IAMUser/S3BucketPublic and
     *            SensitiveData:S3Object/Personal.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GroupBy
     */
    public GetFindingStatisticsRequest withGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * <p>
     * The finding property to use to group the query results. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * classificationDetails.jobId - The unique identifier for the
     * classification job that produced the finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * resourcesAffected.s3Bucket.name - The name of the S3 bucket that the
     * finding applies to.
     * </p>
     * </li>
     * <li>
     * <p>
     * severity.description - The severity of the finding, such as High or
     * Medium.
     * </p>
     * </li>
     * <li>
     * <p>
     * type - The type of finding, such as Policy:IAMUser/S3BucketPublic and
     * SensitiveData:S3Object/Personal.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>resourcesAffected.s3Bucket.name, type,
     * classificationDetails.jobId, severity.description
     *
     * @param groupBy <p>
     *            The finding property to use to group the query results. Valid
     *            values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            classificationDetails.jobId - The unique identifier for the
     *            classification job that produced the finding.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resourcesAffected.s3Bucket.name - The name of the S3 bucket
     *            that the finding applies to.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            severity.description - The severity of the finding, such as
     *            High or Medium.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            type - The type of finding, such as
     *            Policy:IAMUser/S3BucketPublic and
     *            SensitiveData:S3Object/Personal.
     *            </p>
     *            </li>
     *            </ul>
     * @see GroupBy
     */
    public void setGroupBy(GroupBy groupBy) {
        this.groupBy = groupBy.toString();
    }

    /**
     * <p>
     * The finding property to use to group the query results. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * classificationDetails.jobId - The unique identifier for the
     * classification job that produced the finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * resourcesAffected.s3Bucket.name - The name of the S3 bucket that the
     * finding applies to.
     * </p>
     * </li>
     * <li>
     * <p>
     * severity.description - The severity of the finding, such as High or
     * Medium.
     * </p>
     * </li>
     * <li>
     * <p>
     * type - The type of finding, such as Policy:IAMUser/S3BucketPublic and
     * SensitiveData:S3Object/Personal.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>resourcesAffected.s3Bucket.name, type,
     * classificationDetails.jobId, severity.description
     *
     * @param groupBy <p>
     *            The finding property to use to group the query results. Valid
     *            values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            classificationDetails.jobId - The unique identifier for the
     *            classification job that produced the finding.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            resourcesAffected.s3Bucket.name - The name of the S3 bucket
     *            that the finding applies to.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            severity.description - The severity of the finding, such as
     *            High or Medium.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            type - The type of finding, such as
     *            Policy:IAMUser/S3BucketPublic and
     *            SensitiveData:S3Object/Personal.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GroupBy
     */
    public GetFindingStatisticsRequest withGroupBy(GroupBy groupBy) {
        this.groupBy = groupBy.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of the response.
     * </p>
     *
     * @return <p>
     *         The maximum number of items to include in each page of the
     *         response.
     *         </p>
     */
    public Integer getSize() {
        return size;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of the response.
     * </p>
     *
     * @param size <p>
     *            The maximum number of items to include in each page of the
     *            response.
     *            </p>
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param size <p>
     *            The maximum number of items to include in each page of the
     *            response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingStatisticsRequest withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * <p>
     * The criteria to use to sort the query results.
     * </p>
     *
     * @return <p>
     *         The criteria to use to sort the query results.
     *         </p>
     */
    public FindingStatisticsSortCriteria getSortCriteria() {
        return sortCriteria;
    }

    /**
     * <p>
     * The criteria to use to sort the query results.
     * </p>
     *
     * @param sortCriteria <p>
     *            The criteria to use to sort the query results.
     *            </p>
     */
    public void setSortCriteria(FindingStatisticsSortCriteria sortCriteria) {
        this.sortCriteria = sortCriteria;
    }

    /**
     * <p>
     * The criteria to use to sort the query results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sortCriteria <p>
     *            The criteria to use to sort the query results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingStatisticsRequest withSortCriteria(FindingStatisticsSortCriteria sortCriteria) {
        this.sortCriteria = sortCriteria;
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
        if (getFindingCriteria() != null)
            sb.append("findingCriteria: " + getFindingCriteria() + ",");
        if (getGroupBy() != null)
            sb.append("groupBy: " + getGroupBy() + ",");
        if (getSize() != null)
            sb.append("size: " + getSize() + ",");
        if (getSortCriteria() != null)
            sb.append("sortCriteria: " + getSortCriteria());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFindingCriteria() == null) ? 0 : getFindingCriteria().hashCode());
        hashCode = prime * hashCode + ((getGroupBy() == null) ? 0 : getGroupBy().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode
                + ((getSortCriteria() == null) ? 0 : getSortCriteria().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFindingStatisticsRequest == false)
            return false;
        GetFindingStatisticsRequest other = (GetFindingStatisticsRequest) obj;

        if (other.getFindingCriteria() == null ^ this.getFindingCriteria() == null)
            return false;
        if (other.getFindingCriteria() != null
                && other.getFindingCriteria().equals(this.getFindingCriteria()) == false)
            return false;
        if (other.getGroupBy() == null ^ this.getGroupBy() == null)
            return false;
        if (other.getGroupBy() != null && other.getGroupBy().equals(this.getGroupBy()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getSortCriteria() == null ^ this.getSortCriteria() == null)
            return false;
        if (other.getSortCriteria() != null
                && other.getSortCriteria().equals(this.getSortCriteria()) == false)
            return false;
        return true;
    }
}
