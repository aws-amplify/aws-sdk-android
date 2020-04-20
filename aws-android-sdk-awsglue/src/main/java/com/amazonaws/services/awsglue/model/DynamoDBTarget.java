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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies an Amazon DynamoDB table to crawl.
 * </p>
 */
public class DynamoDBTarget implements Serializable {
    /**
     * <p>
     * The name of the DynamoDB table to crawl.
     * </p>
     */
    private String path;

    /**
     * <p>
     * The name of the DynamoDB table to crawl.
     * </p>
     *
     * @return <p>
     *         The name of the DynamoDB table to crawl.
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The name of the DynamoDB table to crawl.
     * </p>
     *
     * @param path <p>
     *            The name of the DynamoDB table to crawl.
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The name of the DynamoDB table to crawl.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param path <p>
     *            The name of the DynamoDB table to crawl.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DynamoDBTarget withPath(String path) {
        this.path = path;
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
        if (getPath() != null)
            sb.append("Path: " + getPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DynamoDBTarget == false)
            return false;
        DynamoDBTarget other = (DynamoDBTarget) obj;

        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        return true;
    }
}
