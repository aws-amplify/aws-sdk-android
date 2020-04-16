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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that describes the Amazon S3 bucket, HTTP server (for example,
 * a web server), Amazon MediaStore, or other server from which CloudFront gets
 * your files.
 * </p>
 */
public class AwsCloudFrontDistributionOriginItem implements Serializable {
    /**
     * <p>
     * Amazon S3 origins: The DNS name of the Amazon S3 bucket from which you
     * want CloudFront to get objects for this origin.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String domainName;

    /**
     * <p>
     * A unique identifier for the origin or origin group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String id;

    /**
     * <p>
     * An optional element that causes CloudFront to request your content from a
     * directory in your Amazon S3 bucket or your custom origin.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String originPath;

    /**
     * <p>
     * Amazon S3 origins: The DNS name of the Amazon S3 bucket from which you
     * want CloudFront to get objects for this origin.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Amazon S3 origins: The DNS name of the Amazon S3 bucket from
     *         which you want CloudFront to get objects for this origin.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * Amazon S3 origins: The DNS name of the Amazon S3 bucket from which you
     * want CloudFront to get objects for this origin.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param domainName <p>
     *            Amazon S3 origins: The DNS name of the Amazon S3 bucket from
     *            which you want CloudFront to get objects for this origin.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * Amazon S3 origins: The DNS name of the Amazon S3 bucket from which you
     * want CloudFront to get objects for this origin.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param domainName <p>
     *            Amazon S3 origins: The DNS name of the Amazon S3 bucket from
     *            which you want CloudFront to get objects for this origin.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCloudFrontDistributionOriginItem withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * A unique identifier for the origin or origin group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A unique identifier for the origin or origin group.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * A unique identifier for the origin or origin group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param id <p>
     *            A unique identifier for the origin or origin group.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier for the origin or origin group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param id <p>
     *            A unique identifier for the origin or origin group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCloudFrontDistributionOriginItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * An optional element that causes CloudFront to request your content from a
     * directory in your Amazon S3 bucket or your custom origin.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         An optional element that causes CloudFront to request your
     *         content from a directory in your Amazon S3 bucket or your custom
     *         origin.
     *         </p>
     */
    public String getOriginPath() {
        return originPath;
    }

    /**
     * <p>
     * An optional element that causes CloudFront to request your content from a
     * directory in your Amazon S3 bucket or your custom origin.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param originPath <p>
     *            An optional element that causes CloudFront to request your
     *            content from a directory in your Amazon S3 bucket or your
     *            custom origin.
     *            </p>
     */
    public void setOriginPath(String originPath) {
        this.originPath = originPath;
    }

    /**
     * <p>
     * An optional element that causes CloudFront to request your content from a
     * directory in your Amazon S3 bucket or your custom origin.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param originPath <p>
     *            An optional element that causes CloudFront to request your
     *            content from a directory in your Amazon S3 bucket or your
     *            custom origin.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCloudFrontDistributionOriginItem withOriginPath(String originPath) {
        this.originPath = originPath;
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
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getOriginPath() != null)
            sb.append("OriginPath: " + getOriginPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getOriginPath() == null) ? 0 : getOriginPath().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCloudFrontDistributionOriginItem == false)
            return false;
        AwsCloudFrontDistributionOriginItem other = (AwsCloudFrontDistributionOriginItem) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getOriginPath() == null ^ this.getOriginPath() == null)
            return false;
        if (other.getOriginPath() != null
                && other.getOriginPath().equals(this.getOriginPath()) == false)
            return false;
        return true;
    }
}
