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

package com.amazonaws.services.tagging.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Generates a report that lists all tagged resources in accounts across your
 * organization and tells whether each resource is compliant with the effective
 * tag policy. Compliance data is refreshed daily.
 * </p>
 * <p>
 * The generated report is saved to the following location:
 * </p>
 * <p>
 * <code>s3://example-bucket/AwsTagPolicies/o-exampleorgid/YYYY-MM-ddTHH:mm:ssZ/report.csv</code>
 * </p>
 * <p>
 * You can call this operation only from the organization's master account and
 * from the us-east-1 Region.
 * </p>
 */
public class StartReportCreationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the Amazon S3 bucket where the report will be stored; for
     * example:
     * </p>
     * <p>
     * <code>awsexamplebucket</code>
     * </p>
     * <p>
     * For more information on S3 bucket requirements, including an example
     * bucket policy, see the example S3 bucket policy on this page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String s3Bucket;

    /**
     * <p>
     * The name of the Amazon S3 bucket where the report will be stored; for
     * example:
     * </p>
     * <p>
     * <code>awsexamplebucket</code>
     * </p>
     * <p>
     * For more information on S3 bucket requirements, including an example
     * bucket policy, see the example S3 bucket policy on this page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         The name of the Amazon S3 bucket where the report will be stored;
     *         for example:
     *         </p>
     *         <p>
     *         <code>awsexamplebucket</code>
     *         </p>
     *         <p>
     *         For more information on S3 bucket requirements, including an
     *         example bucket policy, see the example S3 bucket policy on this
     *         page.
     *         </p>
     */
    public String getS3Bucket() {
        return s3Bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where the report will be stored; for
     * example:
     * </p>
     * <p>
     * <code>awsexamplebucket</code>
     * </p>
     * <p>
     * For more information on S3 bucket requirements, including an example
     * bucket policy, see the example S3 bucket policy on this page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param s3Bucket <p>
     *            The name of the Amazon S3 bucket where the report will be
     *            stored; for example:
     *            </p>
     *            <p>
     *            <code>awsexamplebucket</code>
     *            </p>
     *            <p>
     *            For more information on S3 bucket requirements, including an
     *            example bucket policy, see the example S3 bucket policy on
     *            this page.
     *            </p>
     */
    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where the report will be stored; for
     * example:
     * </p>
     * <p>
     * <code>awsexamplebucket</code>
     * </p>
     * <p>
     * For more information on S3 bucket requirements, including an example
     * bucket policy, see the example S3 bucket policy on this page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param s3Bucket <p>
     *            The name of the Amazon S3 bucket where the report will be
     *            stored; for example:
     *            </p>
     *            <p>
     *            <code>awsexamplebucket</code>
     *            </p>
     *            <p>
     *            For more information on S3 bucket requirements, including an
     *            example bucket policy, see the example S3 bucket policy on
     *            this page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartReportCreationRequest withS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
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
        if (getS3Bucket() != null)
            sb.append("S3Bucket: " + getS3Bucket());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartReportCreationRequest == false)
            return false;
        StartReportCreationRequest other = (StartReportCreationRequest) obj;

        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        return true;
    }
}
