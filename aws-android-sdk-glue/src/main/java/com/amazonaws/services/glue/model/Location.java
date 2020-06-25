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
 * The location of resources.
 * </p>
 */
public class Location implements Serializable {
    /**
     * <p>
     * A JDBC location.
     * </p>
     */
    private java.util.List<CodeGenNodeArg> jdbc;

    /**
     * <p>
     * An Amazon Simple Storage Service (Amazon S3) location.
     * </p>
     */
    private java.util.List<CodeGenNodeArg> s3;

    /**
     * <p>
     * An Amazon DynamoDB table location.
     * </p>
     */
    private java.util.List<CodeGenNodeArg> dynamoDB;

    /**
     * <p>
     * A JDBC location.
     * </p>
     *
     * @return <p>
     *         A JDBC location.
     *         </p>
     */
    public java.util.List<CodeGenNodeArg> getJdbc() {
        return jdbc;
    }

    /**
     * <p>
     * A JDBC location.
     * </p>
     *
     * @param jdbc <p>
     *            A JDBC location.
     *            </p>
     */
    public void setJdbc(java.util.Collection<CodeGenNodeArg> jdbc) {
        if (jdbc == null) {
            this.jdbc = null;
            return;
        }

        this.jdbc = new java.util.ArrayList<CodeGenNodeArg>(jdbc);
    }

    /**
     * <p>
     * A JDBC location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jdbc <p>
     *            A JDBC location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Location withJdbc(CodeGenNodeArg... jdbc) {
        if (getJdbc() == null) {
            this.jdbc = new java.util.ArrayList<CodeGenNodeArg>(jdbc.length);
        }
        for (CodeGenNodeArg value : jdbc) {
            this.jdbc.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A JDBC location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jdbc <p>
     *            A JDBC location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Location withJdbc(java.util.Collection<CodeGenNodeArg> jdbc) {
        setJdbc(jdbc);
        return this;
    }

    /**
     * <p>
     * An Amazon Simple Storage Service (Amazon S3) location.
     * </p>
     *
     * @return <p>
     *         An Amazon Simple Storage Service (Amazon S3) location.
     *         </p>
     */
    public java.util.List<CodeGenNodeArg> getS3() {
        return s3;
    }

    /**
     * <p>
     * An Amazon Simple Storage Service (Amazon S3) location.
     * </p>
     *
     * @param s3 <p>
     *            An Amazon Simple Storage Service (Amazon S3) location.
     *            </p>
     */
    public void setS3(java.util.Collection<CodeGenNodeArg> s3) {
        if (s3 == null) {
            this.s3 = null;
            return;
        }

        this.s3 = new java.util.ArrayList<CodeGenNodeArg>(s3);
    }

    /**
     * <p>
     * An Amazon Simple Storage Service (Amazon S3) location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3 <p>
     *            An Amazon Simple Storage Service (Amazon S3) location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Location withS3(CodeGenNodeArg... s3) {
        if (getS3() == null) {
            this.s3 = new java.util.ArrayList<CodeGenNodeArg>(s3.length);
        }
        for (CodeGenNodeArg value : s3) {
            this.s3.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An Amazon Simple Storage Service (Amazon S3) location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3 <p>
     *            An Amazon Simple Storage Service (Amazon S3) location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Location withS3(java.util.Collection<CodeGenNodeArg> s3) {
        setS3(s3);
        return this;
    }

    /**
     * <p>
     * An Amazon DynamoDB table location.
     * </p>
     *
     * @return <p>
     *         An Amazon DynamoDB table location.
     *         </p>
     */
    public java.util.List<CodeGenNodeArg> getDynamoDB() {
        return dynamoDB;
    }

    /**
     * <p>
     * An Amazon DynamoDB table location.
     * </p>
     *
     * @param dynamoDB <p>
     *            An Amazon DynamoDB table location.
     *            </p>
     */
    public void setDynamoDB(java.util.Collection<CodeGenNodeArg> dynamoDB) {
        if (dynamoDB == null) {
            this.dynamoDB = null;
            return;
        }

        this.dynamoDB = new java.util.ArrayList<CodeGenNodeArg>(dynamoDB);
    }

    /**
     * <p>
     * An Amazon DynamoDB table location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dynamoDB <p>
     *            An Amazon DynamoDB table location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Location withDynamoDB(CodeGenNodeArg... dynamoDB) {
        if (getDynamoDB() == null) {
            this.dynamoDB = new java.util.ArrayList<CodeGenNodeArg>(dynamoDB.length);
        }
        for (CodeGenNodeArg value : dynamoDB) {
            this.dynamoDB.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An Amazon DynamoDB table location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dynamoDB <p>
     *            An Amazon DynamoDB table location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Location withDynamoDB(java.util.Collection<CodeGenNodeArg> dynamoDB) {
        setDynamoDB(dynamoDB);
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
        if (getJdbc() != null)
            sb.append("Jdbc: " + getJdbc() + ",");
        if (getS3() != null)
            sb.append("S3: " + getS3() + ",");
        if (getDynamoDB() != null)
            sb.append("DynamoDB: " + getDynamoDB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJdbc() == null) ? 0 : getJdbc().hashCode());
        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        hashCode = prime * hashCode + ((getDynamoDB() == null) ? 0 : getDynamoDB().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Location == false)
            return false;
        Location other = (Location) obj;

        if (other.getJdbc() == null ^ this.getJdbc() == null)
            return false;
        if (other.getJdbc() != null && other.getJdbc().equals(this.getJdbc()) == false)
            return false;
        if (other.getS3() == null ^ this.getS3() == null)
            return false;
        if (other.getS3() != null && other.getS3().equals(this.getS3()) == false)
            return false;
        if (other.getDynamoDB() == null ^ this.getDynamoDB() == null)
            return false;
        if (other.getDynamoDB() != null && other.getDynamoDB().equals(this.getDynamoDB()) == false)
            return false;
        return true;
    }
}
