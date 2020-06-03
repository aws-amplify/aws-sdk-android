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
 * The details of a Crawler node present in the workflow.
 * </p>
 */
public class CrawlerNodeDetails implements Serializable {
    /**
     * <p>
     * A list of crawls represented by the crawl node.
     * </p>
     */
    private java.util.List<Crawl> crawls;

    /**
     * <p>
     * A list of crawls represented by the crawl node.
     * </p>
     *
     * @return <p>
     *         A list of crawls represented by the crawl node.
     *         </p>
     */
    public java.util.List<Crawl> getCrawls() {
        return crawls;
    }

    /**
     * <p>
     * A list of crawls represented by the crawl node.
     * </p>
     *
     * @param crawls <p>
     *            A list of crawls represented by the crawl node.
     *            </p>
     */
    public void setCrawls(java.util.Collection<Crawl> crawls) {
        if (crawls == null) {
            this.crawls = null;
            return;
        }

        this.crawls = new java.util.ArrayList<Crawl>(crawls);
    }

    /**
     * <p>
     * A list of crawls represented by the crawl node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crawls <p>
     *            A list of crawls represented by the crawl node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CrawlerNodeDetails withCrawls(Crawl... crawls) {
        if (getCrawls() == null) {
            this.crawls = new java.util.ArrayList<Crawl>(crawls.length);
        }
        for (Crawl value : crawls) {
            this.crawls.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of crawls represented by the crawl node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crawls <p>
     *            A list of crawls represented by the crawl node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CrawlerNodeDetails withCrawls(java.util.Collection<Crawl> crawls) {
        setCrawls(crawls);
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
        if (getCrawls() != null)
            sb.append("Crawls: " + getCrawls());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrawls() == null) ? 0 : getCrawls().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CrawlerNodeDetails == false)
            return false;
        CrawlerNodeDetails other = (CrawlerNodeDetails) obj;

        if (other.getCrawls() == null ^ this.getCrawls() == null)
            return false;
        if (other.getCrawls() != null && other.getCrawls().equals(this.getCrawls()) == false)
            return false;
        return true;
    }
}
