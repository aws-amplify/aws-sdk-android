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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies data stores to crawl.
 * </p>
 */
public class CrawlerTargets implements Serializable {
    /**
     * <p>
     * Specifies Amazon Simple Storage Service (Amazon S3) targets.
     * </p>
     */
    private java.util.List<S3Target> s3Targets;

    /**
     * <p>
     * Specifies JDBC targets.
     * </p>
     */
    private java.util.List<JdbcTarget> jdbcTargets;

    /**
     * <p>
     * Specifies Amazon DynamoDB targets.
     * </p>
     */
    private java.util.List<DynamoDBTarget> dynamoDBTargets;

    /**
     * <p>
     * Specifies AWS Glue Data Catalog targets.
     * </p>
     */
    private java.util.List<CatalogTarget> catalogTargets;

    /**
     * <p>
     * Specifies Amazon Simple Storage Service (Amazon S3) targets.
     * </p>
     *
     * @return <p>
     *         Specifies Amazon Simple Storage Service (Amazon S3) targets.
     *         </p>
     */
    public java.util.List<S3Target> getS3Targets() {
        return s3Targets;
    }

    /**
     * <p>
     * Specifies Amazon Simple Storage Service (Amazon S3) targets.
     * </p>
     *
     * @param s3Targets <p>
     *            Specifies Amazon Simple Storage Service (Amazon S3) targets.
     *            </p>
     */
    public void setS3Targets(java.util.Collection<S3Target> s3Targets) {
        if (s3Targets == null) {
            this.s3Targets = null;
            return;
        }

        this.s3Targets = new java.util.ArrayList<S3Target>(s3Targets);
    }

    /**
     * <p>
     * Specifies Amazon Simple Storage Service (Amazon S3) targets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Targets <p>
     *            Specifies Amazon Simple Storage Service (Amazon S3) targets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CrawlerTargets withS3Targets(S3Target... s3Targets) {
        if (getS3Targets() == null) {
            this.s3Targets = new java.util.ArrayList<S3Target>(s3Targets.length);
        }
        for (S3Target value : s3Targets) {
            this.s3Targets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies Amazon Simple Storage Service (Amazon S3) targets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Targets <p>
     *            Specifies Amazon Simple Storage Service (Amazon S3) targets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CrawlerTargets withS3Targets(java.util.Collection<S3Target> s3Targets) {
        setS3Targets(s3Targets);
        return this;
    }

    /**
     * <p>
     * Specifies JDBC targets.
     * </p>
     *
     * @return <p>
     *         Specifies JDBC targets.
     *         </p>
     */
    public java.util.List<JdbcTarget> getJdbcTargets() {
        return jdbcTargets;
    }

    /**
     * <p>
     * Specifies JDBC targets.
     * </p>
     *
     * @param jdbcTargets <p>
     *            Specifies JDBC targets.
     *            </p>
     */
    public void setJdbcTargets(java.util.Collection<JdbcTarget> jdbcTargets) {
        if (jdbcTargets == null) {
            this.jdbcTargets = null;
            return;
        }

        this.jdbcTargets = new java.util.ArrayList<JdbcTarget>(jdbcTargets);
    }

    /**
     * <p>
     * Specifies JDBC targets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jdbcTargets <p>
     *            Specifies JDBC targets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CrawlerTargets withJdbcTargets(JdbcTarget... jdbcTargets) {
        if (getJdbcTargets() == null) {
            this.jdbcTargets = new java.util.ArrayList<JdbcTarget>(jdbcTargets.length);
        }
        for (JdbcTarget value : jdbcTargets) {
            this.jdbcTargets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies JDBC targets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jdbcTargets <p>
     *            Specifies JDBC targets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CrawlerTargets withJdbcTargets(java.util.Collection<JdbcTarget> jdbcTargets) {
        setJdbcTargets(jdbcTargets);
        return this;
    }

    /**
     * <p>
     * Specifies Amazon DynamoDB targets.
     * </p>
     *
     * @return <p>
     *         Specifies Amazon DynamoDB targets.
     *         </p>
     */
    public java.util.List<DynamoDBTarget> getDynamoDBTargets() {
        return dynamoDBTargets;
    }

    /**
     * <p>
     * Specifies Amazon DynamoDB targets.
     * </p>
     *
     * @param dynamoDBTargets <p>
     *            Specifies Amazon DynamoDB targets.
     *            </p>
     */
    public void setDynamoDBTargets(java.util.Collection<DynamoDBTarget> dynamoDBTargets) {
        if (dynamoDBTargets == null) {
            this.dynamoDBTargets = null;
            return;
        }

        this.dynamoDBTargets = new java.util.ArrayList<DynamoDBTarget>(dynamoDBTargets);
    }

    /**
     * <p>
     * Specifies Amazon DynamoDB targets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dynamoDBTargets <p>
     *            Specifies Amazon DynamoDB targets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CrawlerTargets withDynamoDBTargets(DynamoDBTarget... dynamoDBTargets) {
        if (getDynamoDBTargets() == null) {
            this.dynamoDBTargets = new java.util.ArrayList<DynamoDBTarget>(dynamoDBTargets.length);
        }
        for (DynamoDBTarget value : dynamoDBTargets) {
            this.dynamoDBTargets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies Amazon DynamoDB targets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dynamoDBTargets <p>
     *            Specifies Amazon DynamoDB targets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CrawlerTargets withDynamoDBTargets(java.util.Collection<DynamoDBTarget> dynamoDBTargets) {
        setDynamoDBTargets(dynamoDBTargets);
        return this;
    }

    /**
     * <p>
     * Specifies AWS Glue Data Catalog targets.
     * </p>
     *
     * @return <p>
     *         Specifies AWS Glue Data Catalog targets.
     *         </p>
     */
    public java.util.List<CatalogTarget> getCatalogTargets() {
        return catalogTargets;
    }

    /**
     * <p>
     * Specifies AWS Glue Data Catalog targets.
     * </p>
     *
     * @param catalogTargets <p>
     *            Specifies AWS Glue Data Catalog targets.
     *            </p>
     */
    public void setCatalogTargets(java.util.Collection<CatalogTarget> catalogTargets) {
        if (catalogTargets == null) {
            this.catalogTargets = null;
            return;
        }

        this.catalogTargets = new java.util.ArrayList<CatalogTarget>(catalogTargets);
    }

    /**
     * <p>
     * Specifies AWS Glue Data Catalog targets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param catalogTargets <p>
     *            Specifies AWS Glue Data Catalog targets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CrawlerTargets withCatalogTargets(CatalogTarget... catalogTargets) {
        if (getCatalogTargets() == null) {
            this.catalogTargets = new java.util.ArrayList<CatalogTarget>(catalogTargets.length);
        }
        for (CatalogTarget value : catalogTargets) {
            this.catalogTargets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies AWS Glue Data Catalog targets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param catalogTargets <p>
     *            Specifies AWS Glue Data Catalog targets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CrawlerTargets withCatalogTargets(java.util.Collection<CatalogTarget> catalogTargets) {
        setCatalogTargets(catalogTargets);
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
        if (getS3Targets() != null)
            sb.append("S3Targets: " + getS3Targets() + ",");
        if (getJdbcTargets() != null)
            sb.append("JdbcTargets: " + getJdbcTargets() + ",");
        if (getDynamoDBTargets() != null)
            sb.append("DynamoDBTargets: " + getDynamoDBTargets() + ",");
        if (getCatalogTargets() != null)
            sb.append("CatalogTargets: " + getCatalogTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Targets() == null) ? 0 : getS3Targets().hashCode());
        hashCode = prime * hashCode
                + ((getJdbcTargets() == null) ? 0 : getJdbcTargets().hashCode());
        hashCode = prime * hashCode
                + ((getDynamoDBTargets() == null) ? 0 : getDynamoDBTargets().hashCode());
        hashCode = prime * hashCode
                + ((getCatalogTargets() == null) ? 0 : getCatalogTargets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CrawlerTargets == false)
            return false;
        CrawlerTargets other = (CrawlerTargets) obj;

        if (other.getS3Targets() == null ^ this.getS3Targets() == null)
            return false;
        if (other.getS3Targets() != null
                && other.getS3Targets().equals(this.getS3Targets()) == false)
            return false;
        if (other.getJdbcTargets() == null ^ this.getJdbcTargets() == null)
            return false;
        if (other.getJdbcTargets() != null
                && other.getJdbcTargets().equals(this.getJdbcTargets()) == false)
            return false;
        if (other.getDynamoDBTargets() == null ^ this.getDynamoDBTargets() == null)
            return false;
        if (other.getDynamoDBTargets() != null
                && other.getDynamoDBTargets().equals(this.getDynamoDBTargets()) == false)
            return false;
        if (other.getCatalogTargets() == null ^ this.getCatalogTargets() == null)
            return false;
        if (other.getCatalogTargets() != null
                && other.getCatalogTargets().equals(this.getCatalogTargets()) == false)
            return false;
        return true;
    }
}
