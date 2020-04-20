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

public class ListCrawlersResult implements Serializable {
    /**
     * <p>
     * The names of all crawlers in the account, or the crawlers with the
     * specified tags.
     * </p>
     */
    private java.util.List<String> crawlerNames;

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last
     * metric available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The names of all crawlers in the account, or the crawlers with the
     * specified tags.
     * </p>
     *
     * @return <p>
     *         The names of all crawlers in the account, or the crawlers with
     *         the specified tags.
     *         </p>
     */
    public java.util.List<String> getCrawlerNames() {
        return crawlerNames;
    }

    /**
     * <p>
     * The names of all crawlers in the account, or the crawlers with the
     * specified tags.
     * </p>
     *
     * @param crawlerNames <p>
     *            The names of all crawlers in the account, or the crawlers with
     *            the specified tags.
     *            </p>
     */
    public void setCrawlerNames(java.util.Collection<String> crawlerNames) {
        if (crawlerNames == null) {
            this.crawlerNames = null;
            return;
        }

        this.crawlerNames = new java.util.ArrayList<String>(crawlerNames);
    }

    /**
     * <p>
     * The names of all crawlers in the account, or the crawlers with the
     * specified tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crawlerNames <p>
     *            The names of all crawlers in the account, or the crawlers with
     *            the specified tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCrawlersResult withCrawlerNames(String... crawlerNames) {
        if (getCrawlerNames() == null) {
            this.crawlerNames = new java.util.ArrayList<String>(crawlerNames.length);
        }
        for (String value : crawlerNames) {
            this.crawlerNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of all crawlers in the account, or the crawlers with the
     * specified tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crawlerNames <p>
     *            The names of all crawlers in the account, or the crawlers with
     *            the specified tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCrawlersResult withCrawlerNames(java.util.Collection<String> crawlerNames) {
        setCrawlerNames(crawlerNames);
        return this;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last
     * metric available.
     * </p>
     *
     * @return <p>
     *         A continuation token, if the returned list does not contain the
     *         last metric available.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last
     * metric available.
     * </p>
     *
     * @param nextToken <p>
     *            A continuation token, if the returned list does not contain
     *            the last metric available.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last
     * metric available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A continuation token, if the returned list does not contain
     *            the last metric available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCrawlersResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getCrawlerNames() != null)
            sb.append("CrawlerNames: " + getCrawlerNames() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCrawlerNames() == null) ? 0 : getCrawlerNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCrawlersResult == false)
            return false;
        ListCrawlersResult other = (ListCrawlersResult) obj;

        if (other.getCrawlerNames() == null ^ this.getCrawlerNames() == null)
            return false;
        if (other.getCrawlerNames() != null
                && other.getCrawlerNames().equals(this.getCrawlerNames()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
