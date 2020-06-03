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

package com.amazonaws.services.es.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describe Elasticsearch Limits for a given InstanceType and
 * ElasticsearchVersion. When modifying existing Domain, specify the
 * <code> <a>DomainName</a> </code> to know what Limits are supported for
 * modifying.
 * </p>
 */
public class DescribeElasticsearchInstanceTypeLimitsRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * DomainName represents the name of the Domain that we are trying to
     * modify. This should be present only if we are querying for Elasticsearch
     * <code> <a>Limits</a> </code> for existing domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     */
    private String domainName;

    /**
     * <p>
     * The instance type for an Elasticsearch cluster for which Elasticsearch
     * <code> <a>Limits</a> </code> are needed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m3.medium.elasticsearch, m3.large.elasticsearch,
     * m3.xlarge.elasticsearch, m3.2xlarge.elasticsearch,
     * m4.large.elasticsearch, m4.xlarge.elasticsearch,
     * m4.2xlarge.elasticsearch, m4.4xlarge.elasticsearch,
     * m4.10xlarge.elasticsearch, m5.large.elasticsearch,
     * m5.xlarge.elasticsearch, m5.2xlarge.elasticsearch,
     * m5.4xlarge.elasticsearch, m5.12xlarge.elasticsearch,
     * r5.large.elasticsearch, r5.xlarge.elasticsearch,
     * r5.2xlarge.elasticsearch, r5.4xlarge.elasticsearch,
     * r5.12xlarge.elasticsearch, c5.large.elasticsearch,
     * c5.xlarge.elasticsearch, c5.2xlarge.elasticsearch,
     * c5.4xlarge.elasticsearch, c5.9xlarge.elasticsearch,
     * c5.18xlarge.elasticsearch, ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch, t2.micro.elasticsearch,
     * t2.small.elasticsearch, t2.medium.elasticsearch, r3.large.elasticsearch,
     * r3.xlarge.elasticsearch, r3.2xlarge.elasticsearch,
     * r3.4xlarge.elasticsearch, r3.8xlarge.elasticsearch,
     * i2.xlarge.elasticsearch, i2.2xlarge.elasticsearch,
     * d2.xlarge.elasticsearch, d2.2xlarge.elasticsearch,
     * d2.4xlarge.elasticsearch, d2.8xlarge.elasticsearch,
     * c4.large.elasticsearch, c4.xlarge.elasticsearch,
     * c4.2xlarge.elasticsearch, c4.4xlarge.elasticsearch,
     * c4.8xlarge.elasticsearch, r4.large.elasticsearch,
     * r4.xlarge.elasticsearch, r4.2xlarge.elasticsearch,
     * r4.4xlarge.elasticsearch, r4.8xlarge.elasticsearch,
     * r4.16xlarge.elasticsearch, i3.large.elasticsearch,
     * i3.xlarge.elasticsearch, i3.2xlarge.elasticsearch,
     * i3.4xlarge.elasticsearch, i3.8xlarge.elasticsearch,
     * i3.16xlarge.elasticsearch
     */
    private String instanceType;

    /**
     * <p>
     * Version of Elasticsearch for which <code> <a>Limits</a> </code> are
     * needed.
     * </p>
     */
    private String elasticsearchVersion;

    /**
     * <p>
     * DomainName represents the name of the Domain that we are trying to
     * modify. This should be present only if we are querying for Elasticsearch
     * <code> <a>Limits</a> </code> for existing domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @return <p>
     *         DomainName represents the name of the Domain that we are trying
     *         to modify. This should be present only if we are querying for
     *         Elasticsearch <code> <a>Limits</a> </code> for existing domain.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * DomainName represents the name of the Domain that we are trying to
     * modify. This should be present only if we are querying for Elasticsearch
     * <code> <a>Limits</a> </code> for existing domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName <p>
     *            DomainName represents the name of the Domain that we are
     *            trying to modify. This should be present only if we are
     *            querying for Elasticsearch <code> <a>Limits</a> </code> for
     *            existing domain.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * DomainName represents the name of the Domain that we are trying to
     * modify. This should be present only if we are querying for Elasticsearch
     * <code> <a>Limits</a> </code> for existing domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName <p>
     *            DomainName represents the name of the Domain that we are
     *            trying to modify. This should be present only if we are
     *            querying for Elasticsearch <code> <a>Limits</a> </code> for
     *            existing domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeElasticsearchInstanceTypeLimitsRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The instance type for an Elasticsearch cluster for which Elasticsearch
     * <code> <a>Limits</a> </code> are needed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m3.medium.elasticsearch, m3.large.elasticsearch,
     * m3.xlarge.elasticsearch, m3.2xlarge.elasticsearch,
     * m4.large.elasticsearch, m4.xlarge.elasticsearch,
     * m4.2xlarge.elasticsearch, m4.4xlarge.elasticsearch,
     * m4.10xlarge.elasticsearch, m5.large.elasticsearch,
     * m5.xlarge.elasticsearch, m5.2xlarge.elasticsearch,
     * m5.4xlarge.elasticsearch, m5.12xlarge.elasticsearch,
     * r5.large.elasticsearch, r5.xlarge.elasticsearch,
     * r5.2xlarge.elasticsearch, r5.4xlarge.elasticsearch,
     * r5.12xlarge.elasticsearch, c5.large.elasticsearch,
     * c5.xlarge.elasticsearch, c5.2xlarge.elasticsearch,
     * c5.4xlarge.elasticsearch, c5.9xlarge.elasticsearch,
     * c5.18xlarge.elasticsearch, ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch, t2.micro.elasticsearch,
     * t2.small.elasticsearch, t2.medium.elasticsearch, r3.large.elasticsearch,
     * r3.xlarge.elasticsearch, r3.2xlarge.elasticsearch,
     * r3.4xlarge.elasticsearch, r3.8xlarge.elasticsearch,
     * i2.xlarge.elasticsearch, i2.2xlarge.elasticsearch,
     * d2.xlarge.elasticsearch, d2.2xlarge.elasticsearch,
     * d2.4xlarge.elasticsearch, d2.8xlarge.elasticsearch,
     * c4.large.elasticsearch, c4.xlarge.elasticsearch,
     * c4.2xlarge.elasticsearch, c4.4xlarge.elasticsearch,
     * c4.8xlarge.elasticsearch, r4.large.elasticsearch,
     * r4.xlarge.elasticsearch, r4.2xlarge.elasticsearch,
     * r4.4xlarge.elasticsearch, r4.8xlarge.elasticsearch,
     * r4.16xlarge.elasticsearch, i3.large.elasticsearch,
     * i3.xlarge.elasticsearch, i3.2xlarge.elasticsearch,
     * i3.4xlarge.elasticsearch, i3.8xlarge.elasticsearch,
     * i3.16xlarge.elasticsearch
     *
     * @return <p>
     *         The instance type for an Elasticsearch cluster for which
     *         Elasticsearch <code> <a>Limits</a> </code> are needed.
     *         </p>
     * @see ESPartitionInstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The instance type for an Elasticsearch cluster for which Elasticsearch
     * <code> <a>Limits</a> </code> are needed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m3.medium.elasticsearch, m3.large.elasticsearch,
     * m3.xlarge.elasticsearch, m3.2xlarge.elasticsearch,
     * m4.large.elasticsearch, m4.xlarge.elasticsearch,
     * m4.2xlarge.elasticsearch, m4.4xlarge.elasticsearch,
     * m4.10xlarge.elasticsearch, m5.large.elasticsearch,
     * m5.xlarge.elasticsearch, m5.2xlarge.elasticsearch,
     * m5.4xlarge.elasticsearch, m5.12xlarge.elasticsearch,
     * r5.large.elasticsearch, r5.xlarge.elasticsearch,
     * r5.2xlarge.elasticsearch, r5.4xlarge.elasticsearch,
     * r5.12xlarge.elasticsearch, c5.large.elasticsearch,
     * c5.xlarge.elasticsearch, c5.2xlarge.elasticsearch,
     * c5.4xlarge.elasticsearch, c5.9xlarge.elasticsearch,
     * c5.18xlarge.elasticsearch, ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch, t2.micro.elasticsearch,
     * t2.small.elasticsearch, t2.medium.elasticsearch, r3.large.elasticsearch,
     * r3.xlarge.elasticsearch, r3.2xlarge.elasticsearch,
     * r3.4xlarge.elasticsearch, r3.8xlarge.elasticsearch,
     * i2.xlarge.elasticsearch, i2.2xlarge.elasticsearch,
     * d2.xlarge.elasticsearch, d2.2xlarge.elasticsearch,
     * d2.4xlarge.elasticsearch, d2.8xlarge.elasticsearch,
     * c4.large.elasticsearch, c4.xlarge.elasticsearch,
     * c4.2xlarge.elasticsearch, c4.4xlarge.elasticsearch,
     * c4.8xlarge.elasticsearch, r4.large.elasticsearch,
     * r4.xlarge.elasticsearch, r4.2xlarge.elasticsearch,
     * r4.4xlarge.elasticsearch, r4.8xlarge.elasticsearch,
     * r4.16xlarge.elasticsearch, i3.large.elasticsearch,
     * i3.xlarge.elasticsearch, i3.2xlarge.elasticsearch,
     * i3.4xlarge.elasticsearch, i3.8xlarge.elasticsearch,
     * i3.16xlarge.elasticsearch
     *
     * @param instanceType <p>
     *            The instance type for an Elasticsearch cluster for which
     *            Elasticsearch <code> <a>Limits</a> </code> are needed.
     *            </p>
     * @see ESPartitionInstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type for an Elasticsearch cluster for which Elasticsearch
     * <code> <a>Limits</a> </code> are needed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m3.medium.elasticsearch, m3.large.elasticsearch,
     * m3.xlarge.elasticsearch, m3.2xlarge.elasticsearch,
     * m4.large.elasticsearch, m4.xlarge.elasticsearch,
     * m4.2xlarge.elasticsearch, m4.4xlarge.elasticsearch,
     * m4.10xlarge.elasticsearch, m5.large.elasticsearch,
     * m5.xlarge.elasticsearch, m5.2xlarge.elasticsearch,
     * m5.4xlarge.elasticsearch, m5.12xlarge.elasticsearch,
     * r5.large.elasticsearch, r5.xlarge.elasticsearch,
     * r5.2xlarge.elasticsearch, r5.4xlarge.elasticsearch,
     * r5.12xlarge.elasticsearch, c5.large.elasticsearch,
     * c5.xlarge.elasticsearch, c5.2xlarge.elasticsearch,
     * c5.4xlarge.elasticsearch, c5.9xlarge.elasticsearch,
     * c5.18xlarge.elasticsearch, ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch, t2.micro.elasticsearch,
     * t2.small.elasticsearch, t2.medium.elasticsearch, r3.large.elasticsearch,
     * r3.xlarge.elasticsearch, r3.2xlarge.elasticsearch,
     * r3.4xlarge.elasticsearch, r3.8xlarge.elasticsearch,
     * i2.xlarge.elasticsearch, i2.2xlarge.elasticsearch,
     * d2.xlarge.elasticsearch, d2.2xlarge.elasticsearch,
     * d2.4xlarge.elasticsearch, d2.8xlarge.elasticsearch,
     * c4.large.elasticsearch, c4.xlarge.elasticsearch,
     * c4.2xlarge.elasticsearch, c4.4xlarge.elasticsearch,
     * c4.8xlarge.elasticsearch, r4.large.elasticsearch,
     * r4.xlarge.elasticsearch, r4.2xlarge.elasticsearch,
     * r4.4xlarge.elasticsearch, r4.8xlarge.elasticsearch,
     * r4.16xlarge.elasticsearch, i3.large.elasticsearch,
     * i3.xlarge.elasticsearch, i3.2xlarge.elasticsearch,
     * i3.4xlarge.elasticsearch, i3.8xlarge.elasticsearch,
     * i3.16xlarge.elasticsearch
     *
     * @param instanceType <p>
     *            The instance type for an Elasticsearch cluster for which
     *            Elasticsearch <code> <a>Limits</a> </code> are needed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ESPartitionInstanceType
     */
    public DescribeElasticsearchInstanceTypeLimitsRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The instance type for an Elasticsearch cluster for which Elasticsearch
     * <code> <a>Limits</a> </code> are needed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m3.medium.elasticsearch, m3.large.elasticsearch,
     * m3.xlarge.elasticsearch, m3.2xlarge.elasticsearch,
     * m4.large.elasticsearch, m4.xlarge.elasticsearch,
     * m4.2xlarge.elasticsearch, m4.4xlarge.elasticsearch,
     * m4.10xlarge.elasticsearch, m5.large.elasticsearch,
     * m5.xlarge.elasticsearch, m5.2xlarge.elasticsearch,
     * m5.4xlarge.elasticsearch, m5.12xlarge.elasticsearch,
     * r5.large.elasticsearch, r5.xlarge.elasticsearch,
     * r5.2xlarge.elasticsearch, r5.4xlarge.elasticsearch,
     * r5.12xlarge.elasticsearch, c5.large.elasticsearch,
     * c5.xlarge.elasticsearch, c5.2xlarge.elasticsearch,
     * c5.4xlarge.elasticsearch, c5.9xlarge.elasticsearch,
     * c5.18xlarge.elasticsearch, ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch, t2.micro.elasticsearch,
     * t2.small.elasticsearch, t2.medium.elasticsearch, r3.large.elasticsearch,
     * r3.xlarge.elasticsearch, r3.2xlarge.elasticsearch,
     * r3.4xlarge.elasticsearch, r3.8xlarge.elasticsearch,
     * i2.xlarge.elasticsearch, i2.2xlarge.elasticsearch,
     * d2.xlarge.elasticsearch, d2.2xlarge.elasticsearch,
     * d2.4xlarge.elasticsearch, d2.8xlarge.elasticsearch,
     * c4.large.elasticsearch, c4.xlarge.elasticsearch,
     * c4.2xlarge.elasticsearch, c4.4xlarge.elasticsearch,
     * c4.8xlarge.elasticsearch, r4.large.elasticsearch,
     * r4.xlarge.elasticsearch, r4.2xlarge.elasticsearch,
     * r4.4xlarge.elasticsearch, r4.8xlarge.elasticsearch,
     * r4.16xlarge.elasticsearch, i3.large.elasticsearch,
     * i3.xlarge.elasticsearch, i3.2xlarge.elasticsearch,
     * i3.4xlarge.elasticsearch, i3.8xlarge.elasticsearch,
     * i3.16xlarge.elasticsearch
     *
     * @param instanceType <p>
     *            The instance type for an Elasticsearch cluster for which
     *            Elasticsearch <code> <a>Limits</a> </code> are needed.
     *            </p>
     * @see ESPartitionInstanceType
     */
    public void setInstanceType(ESPartitionInstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }

    /**
     * <p>
     * The instance type for an Elasticsearch cluster for which Elasticsearch
     * <code> <a>Limits</a> </code> are needed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m3.medium.elasticsearch, m3.large.elasticsearch,
     * m3.xlarge.elasticsearch, m3.2xlarge.elasticsearch,
     * m4.large.elasticsearch, m4.xlarge.elasticsearch,
     * m4.2xlarge.elasticsearch, m4.4xlarge.elasticsearch,
     * m4.10xlarge.elasticsearch, m5.large.elasticsearch,
     * m5.xlarge.elasticsearch, m5.2xlarge.elasticsearch,
     * m5.4xlarge.elasticsearch, m5.12xlarge.elasticsearch,
     * r5.large.elasticsearch, r5.xlarge.elasticsearch,
     * r5.2xlarge.elasticsearch, r5.4xlarge.elasticsearch,
     * r5.12xlarge.elasticsearch, c5.large.elasticsearch,
     * c5.xlarge.elasticsearch, c5.2xlarge.elasticsearch,
     * c5.4xlarge.elasticsearch, c5.9xlarge.elasticsearch,
     * c5.18xlarge.elasticsearch, ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch, t2.micro.elasticsearch,
     * t2.small.elasticsearch, t2.medium.elasticsearch, r3.large.elasticsearch,
     * r3.xlarge.elasticsearch, r3.2xlarge.elasticsearch,
     * r3.4xlarge.elasticsearch, r3.8xlarge.elasticsearch,
     * i2.xlarge.elasticsearch, i2.2xlarge.elasticsearch,
     * d2.xlarge.elasticsearch, d2.2xlarge.elasticsearch,
     * d2.4xlarge.elasticsearch, d2.8xlarge.elasticsearch,
     * c4.large.elasticsearch, c4.xlarge.elasticsearch,
     * c4.2xlarge.elasticsearch, c4.4xlarge.elasticsearch,
     * c4.8xlarge.elasticsearch, r4.large.elasticsearch,
     * r4.xlarge.elasticsearch, r4.2xlarge.elasticsearch,
     * r4.4xlarge.elasticsearch, r4.8xlarge.elasticsearch,
     * r4.16xlarge.elasticsearch, i3.large.elasticsearch,
     * i3.xlarge.elasticsearch, i3.2xlarge.elasticsearch,
     * i3.4xlarge.elasticsearch, i3.8xlarge.elasticsearch,
     * i3.16xlarge.elasticsearch
     *
     * @param instanceType <p>
     *            The instance type for an Elasticsearch cluster for which
     *            Elasticsearch <code> <a>Limits</a> </code> are needed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ESPartitionInstanceType
     */
    public DescribeElasticsearchInstanceTypeLimitsRequest withInstanceType(
            ESPartitionInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * Version of Elasticsearch for which <code> <a>Limits</a> </code> are
     * needed.
     * </p>
     *
     * @return <p>
     *         Version of Elasticsearch for which <code> <a>Limits</a> </code>
     *         are needed.
     *         </p>
     */
    public String getElasticsearchVersion() {
        return elasticsearchVersion;
    }

    /**
     * <p>
     * Version of Elasticsearch for which <code> <a>Limits</a> </code> are
     * needed.
     * </p>
     *
     * @param elasticsearchVersion <p>
     *            Version of Elasticsearch for which
     *            <code> <a>Limits</a> </code> are needed.
     *            </p>
     */
    public void setElasticsearchVersion(String elasticsearchVersion) {
        this.elasticsearchVersion = elasticsearchVersion;
    }

    /**
     * <p>
     * Version of Elasticsearch for which <code> <a>Limits</a> </code> are
     * needed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticsearchVersion <p>
     *            Version of Elasticsearch for which
     *            <code> <a>Limits</a> </code> are needed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeElasticsearchInstanceTypeLimitsRequest withElasticsearchVersion(
            String elasticsearchVersion) {
        this.elasticsearchVersion = elasticsearchVersion;
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
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getElasticsearchVersion() != null)
            sb.append("ElasticsearchVersion: " + getElasticsearchVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getElasticsearchVersion() == null) ? 0 : getElasticsearchVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeElasticsearchInstanceTypeLimitsRequest == false)
            return false;
        DescribeElasticsearchInstanceTypeLimitsRequest other = (DescribeElasticsearchInstanceTypeLimitsRequest) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getElasticsearchVersion() == null ^ this.getElasticsearchVersion() == null)
            return false;
        if (other.getElasticsearchVersion() != null
                && other.getElasticsearchVersion().equals(this.getElasticsearchVersion()) == false)
            return false;
        return true;
    }
}
