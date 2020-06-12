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
 * Specifies a data store in Amazon Simple Storage Service (Amazon S3).
 * </p>
 */
public class S3Target implements Serializable {
    /**
     * <p>
     * The path to the Amazon S3 target.
     * </p>
     */
    private String path;

    /**
     * <p>
     * A list of glob patterns used to exclude from the crawl. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html"
     * >Catalog Tables with a Crawler</a>.
     * </p>
     */
    private java.util.List<String> exclusions;

    /**
     * <p>
     * The path to the Amazon S3 target.
     * </p>
     *
     * @return <p>
     *         The path to the Amazon S3 target.
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The path to the Amazon S3 target.
     * </p>
     *
     * @param path <p>
     *            The path to the Amazon S3 target.
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the Amazon S3 target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param path <p>
     *            The path to the Amazon S3 target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Target withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>
     * A list of glob patterns used to exclude from the crawl. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html"
     * >Catalog Tables with a Crawler</a>.
     * </p>
     *
     * @return <p>
     *         A list of glob patterns used to exclude from the crawl. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html"
     *         >Catalog Tables with a Crawler</a>.
     *         </p>
     */
    public java.util.List<String> getExclusions() {
        return exclusions;
    }

    /**
     * <p>
     * A list of glob patterns used to exclude from the crawl. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html"
     * >Catalog Tables with a Crawler</a>.
     * </p>
     *
     * @param exclusions <p>
     *            A list of glob patterns used to exclude from the crawl. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html"
     *            >Catalog Tables with a Crawler</a>.
     *            </p>
     */
    public void setExclusions(java.util.Collection<String> exclusions) {
        if (exclusions == null) {
            this.exclusions = null;
            return;
        }

        this.exclusions = new java.util.ArrayList<String>(exclusions);
    }

    /**
     * <p>
     * A list of glob patterns used to exclude from the crawl. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html"
     * >Catalog Tables with a Crawler</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exclusions <p>
     *            A list of glob patterns used to exclude from the crawl. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html"
     *            >Catalog Tables with a Crawler</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Target withExclusions(String... exclusions) {
        if (getExclusions() == null) {
            this.exclusions = new java.util.ArrayList<String>(exclusions.length);
        }
        for (String value : exclusions) {
            this.exclusions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of glob patterns used to exclude from the crawl. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html"
     * >Catalog Tables with a Crawler</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exclusions <p>
     *            A list of glob patterns used to exclude from the crawl. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html"
     *            >Catalog Tables with a Crawler</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Target withExclusions(java.util.Collection<String> exclusions) {
        setExclusions(exclusions);
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
            sb.append("Path: " + getPath() + ",");
        if (getExclusions() != null)
            sb.append("Exclusions: " + getExclusions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getExclusions() == null) ? 0 : getExclusions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Target == false)
            return false;
        S3Target other = (S3Target) obj;

        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getExclusions() == null ^ this.getExclusions() == null)
            return false;
        if (other.getExclusions() != null
                && other.getExclusions().equals(this.getExclusions()) == false)
            return false;
        return true;
    }
}
