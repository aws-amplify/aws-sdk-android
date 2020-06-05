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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

public class DescribeRecordResult implements Serializable {
    /**
     * <p>
     * Information about the product.
     * </p>
     */
    private RecordDetail recordDetail;

    /**
     * <p>
     * Information about the product created as the result of a request. For
     * example, the output for a CloudFormation-backed product that creates an
     * S3 bucket would include the S3 bucket URL.
     * </p>
     */
    private java.util.List<RecordOutput> recordOutputs;

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are
     * no additional results, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     */
    private String nextPageToken;

    /**
     * <p>
     * Information about the product.
     * </p>
     *
     * @return <p>
     *         Information about the product.
     *         </p>
     */
    public RecordDetail getRecordDetail() {
        return recordDetail;
    }

    /**
     * <p>
     * Information about the product.
     * </p>
     *
     * @param recordDetail <p>
     *            Information about the product.
     *            </p>
     */
    public void setRecordDetail(RecordDetail recordDetail) {
        this.recordDetail = recordDetail;
    }

    /**
     * <p>
     * Information about the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recordDetail <p>
     *            Information about the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRecordResult withRecordDetail(RecordDetail recordDetail) {
        this.recordDetail = recordDetail;
        return this;
    }

    /**
     * <p>
     * Information about the product created as the result of a request. For
     * example, the output for a CloudFormation-backed product that creates an
     * S3 bucket would include the S3 bucket URL.
     * </p>
     *
     * @return <p>
     *         Information about the product created as the result of a request.
     *         For example, the output for a CloudFormation-backed product that
     *         creates an S3 bucket would include the S3 bucket URL.
     *         </p>
     */
    public java.util.List<RecordOutput> getRecordOutputs() {
        return recordOutputs;
    }

    /**
     * <p>
     * Information about the product created as the result of a request. For
     * example, the output for a CloudFormation-backed product that creates an
     * S3 bucket would include the S3 bucket URL.
     * </p>
     *
     * @param recordOutputs <p>
     *            Information about the product created as the result of a
     *            request. For example, the output for a CloudFormation-backed
     *            product that creates an S3 bucket would include the S3 bucket
     *            URL.
     *            </p>
     */
    public void setRecordOutputs(java.util.Collection<RecordOutput> recordOutputs) {
        if (recordOutputs == null) {
            this.recordOutputs = null;
            return;
        }

        this.recordOutputs = new java.util.ArrayList<RecordOutput>(recordOutputs);
    }

    /**
     * <p>
     * Information about the product created as the result of a request. For
     * example, the output for a CloudFormation-backed product that creates an
     * S3 bucket would include the S3 bucket URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recordOutputs <p>
     *            Information about the product created as the result of a
     *            request. For example, the output for a CloudFormation-backed
     *            product that creates an S3 bucket would include the S3 bucket
     *            URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRecordResult withRecordOutputs(RecordOutput... recordOutputs) {
        if (getRecordOutputs() == null) {
            this.recordOutputs = new java.util.ArrayList<RecordOutput>(recordOutputs.length);
        }
        for (RecordOutput value : recordOutputs) {
            this.recordOutputs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the product created as the result of a request. For
     * example, the output for a CloudFormation-backed product that creates an
     * S3 bucket would include the S3 bucket URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recordOutputs <p>
     *            Information about the product created as the result of a
     *            request. For example, the output for a CloudFormation-backed
     *            product that creates an S3 bucket would include the S3 bucket
     *            URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRecordResult withRecordOutputs(java.util.Collection<RecordOutput> recordOutputs) {
        setRecordOutputs(recordOutputs);
        return this;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are
     * no additional results, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @return <p>
     *         The page token to use to retrieve the next set of results. If
     *         there are no additional results, this value is null.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are
     * no additional results, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @param nextPageToken <p>
     *            The page token to use to retrieve the next set of results. If
     *            there are no additional results, this value is null.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are
     * no additional results, this value is null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @param nextPageToken <p>
     *            The page token to use to retrieve the next set of results. If
     *            there are no additional results, this value is null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRecordResult withNextPageToken(String nextPageToken) {
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
        if (getRecordDetail() != null)
            sb.append("RecordDetail: " + getRecordDetail() + ",");
        if (getRecordOutputs() != null)
            sb.append("RecordOutputs: " + getRecordOutputs() + ",");
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
                + ((getRecordDetail() == null) ? 0 : getRecordDetail().hashCode());
        hashCode = prime * hashCode
                + ((getRecordOutputs() == null) ? 0 : getRecordOutputs().hashCode());
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

        if (obj instanceof DescribeRecordResult == false)
            return false;
        DescribeRecordResult other = (DescribeRecordResult) obj;

        if (other.getRecordDetail() == null ^ this.getRecordDetail() == null)
            return false;
        if (other.getRecordDetail() != null
                && other.getRecordDetail().equals(this.getRecordDetail()) == false)
            return false;
        if (other.getRecordOutputs() == null ^ this.getRecordOutputs() == null)
            return false;
        if (other.getRecordOutputs() != null
                && other.getRecordOutputs().equals(this.getRecordOutputs()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
