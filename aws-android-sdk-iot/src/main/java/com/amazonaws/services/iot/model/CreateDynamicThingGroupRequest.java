/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a dynamic thing group.
 * </p>
 */
public class CreateDynamicThingGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The dynamic thing group name to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingGroupName;

    /**
     * <p>
     * The dynamic thing group properties.
     * </p>
     */
    private ThingGroupProperties thingGroupProperties;

    /**
     * <p>
     * The dynamic thing group index name.
     * </p>
     * <note>
     * <p>
     * Currently one index is supported: "AWS_Things".
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String indexName;

    /**
     * <p>
     * The dynamic thing group search query string.
     * </p>
     * <p>
     * See <a href=
     * "http://docs.aws.amazon.com/iot/latest/developerguide/query-syntax.html"
     * >Query Syntax</a> for information about query string syntax.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String queryString;

    /**
     * <p>
     * The dynamic thing group query version.
     * </p>
     * <note>
     * <p>
     * Currently one query version is supported: "2017-09-30". If not specified,
     * the query version defaults to this value.
     * </p>
     * </note>
     */
    private String queryVersion;

    /**
     * <p>
     * Metadata which can be used to manage the dynamic thing group.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The dynamic thing group name to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The dynamic thing group name to create.
     *         </p>
     */
    public String getThingGroupName() {
        return thingGroupName;
    }

    /**
     * <p>
     * The dynamic thing group name to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingGroupName <p>
     *            The dynamic thing group name to create.
     *            </p>
     */
    public void setThingGroupName(String thingGroupName) {
        this.thingGroupName = thingGroupName;
    }

    /**
     * <p>
     * The dynamic thing group name to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingGroupName <p>
     *            The dynamic thing group name to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDynamicThingGroupRequest withThingGroupName(String thingGroupName) {
        this.thingGroupName = thingGroupName;
        return this;
    }

    /**
     * <p>
     * The dynamic thing group properties.
     * </p>
     *
     * @return <p>
     *         The dynamic thing group properties.
     *         </p>
     */
    public ThingGroupProperties getThingGroupProperties() {
        return thingGroupProperties;
    }

    /**
     * <p>
     * The dynamic thing group properties.
     * </p>
     *
     * @param thingGroupProperties <p>
     *            The dynamic thing group properties.
     *            </p>
     */
    public void setThingGroupProperties(ThingGroupProperties thingGroupProperties) {
        this.thingGroupProperties = thingGroupProperties;
    }

    /**
     * <p>
     * The dynamic thing group properties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingGroupProperties <p>
     *            The dynamic thing group properties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDynamicThingGroupRequest withThingGroupProperties(
            ThingGroupProperties thingGroupProperties) {
        this.thingGroupProperties = thingGroupProperties;
        return this;
    }

    /**
     * <p>
     * The dynamic thing group index name.
     * </p>
     * <note>
     * <p>
     * Currently one index is supported: "AWS_Things".
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The dynamic thing group index name.
     *         </p>
     *         <note>
     *         <p>
     *         Currently one index is supported: "AWS_Things".
     *         </p>
     *         </note>
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * <p>
     * The dynamic thing group index name.
     * </p>
     * <note>
     * <p>
     * Currently one index is supported: "AWS_Things".
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param indexName <p>
     *            The dynamic thing group index name.
     *            </p>
     *            <note>
     *            <p>
     *            Currently one index is supported: "AWS_Things".
     *            </p>
     *            </note>
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The dynamic thing group index name.
     * </p>
     * <note>
     * <p>
     * Currently one index is supported: "AWS_Things".
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param indexName <p>
     *            The dynamic thing group index name.
     *            </p>
     *            <note>
     *            <p>
     *            Currently one index is supported: "AWS_Things".
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDynamicThingGroupRequest withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * <p>
     * The dynamic thing group search query string.
     * </p>
     * <p>
     * See <a href=
     * "http://docs.aws.amazon.com/iot/latest/developerguide/query-syntax.html"
     * >Query Syntax</a> for information about query string syntax.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The dynamic thing group search query string.
     *         </p>
     *         <p>
     *         See <a href=
     *         "http://docs.aws.amazon.com/iot/latest/developerguide/query-syntax.html"
     *         >Query Syntax</a> for information about query string syntax.
     *         </p>
     */
    public String getQueryString() {
        return queryString;
    }

    /**
     * <p>
     * The dynamic thing group search query string.
     * </p>
     * <p>
     * See <a href=
     * "http://docs.aws.amazon.com/iot/latest/developerguide/query-syntax.html"
     * >Query Syntax</a> for information about query string syntax.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param queryString <p>
     *            The dynamic thing group search query string.
     *            </p>
     *            <p>
     *            See <a href=
     *            "http://docs.aws.amazon.com/iot/latest/developerguide/query-syntax.html"
     *            >Query Syntax</a> for information about query string syntax.
     *            </p>
     */
    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The dynamic thing group search query string.
     * </p>
     * <p>
     * See <a href=
     * "http://docs.aws.amazon.com/iot/latest/developerguide/query-syntax.html"
     * >Query Syntax</a> for information about query string syntax.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param queryString <p>
     *            The dynamic thing group search query string.
     *            </p>
     *            <p>
     *            See <a href=
     *            "http://docs.aws.amazon.com/iot/latest/developerguide/query-syntax.html"
     *            >Query Syntax</a> for information about query string syntax.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDynamicThingGroupRequest withQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }

    /**
     * <p>
     * The dynamic thing group query version.
     * </p>
     * <note>
     * <p>
     * Currently one query version is supported: "2017-09-30". If not specified,
     * the query version defaults to this value.
     * </p>
     * </note>
     *
     * @return <p>
     *         The dynamic thing group query version.
     *         </p>
     *         <note>
     *         <p>
     *         Currently one query version is supported: "2017-09-30". If not
     *         specified, the query version defaults to this value.
     *         </p>
     *         </note>
     */
    public String getQueryVersion() {
        return queryVersion;
    }

    /**
     * <p>
     * The dynamic thing group query version.
     * </p>
     * <note>
     * <p>
     * Currently one query version is supported: "2017-09-30". If not specified,
     * the query version defaults to this value.
     * </p>
     * </note>
     *
     * @param queryVersion <p>
     *            The dynamic thing group query version.
     *            </p>
     *            <note>
     *            <p>
     *            Currently one query version is supported: "2017-09-30". If not
     *            specified, the query version defaults to this value.
     *            </p>
     *            </note>
     */
    public void setQueryVersion(String queryVersion) {
        this.queryVersion = queryVersion;
    }

    /**
     * <p>
     * The dynamic thing group query version.
     * </p>
     * <note>
     * <p>
     * Currently one query version is supported: "2017-09-30". If not specified,
     * the query version defaults to this value.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryVersion <p>
     *            The dynamic thing group query version.
     *            </p>
     *            <note>
     *            <p>
     *            Currently one query version is supported: "2017-09-30". If not
     *            specified, the query version defaults to this value.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDynamicThingGroupRequest withQueryVersion(String queryVersion) {
        this.queryVersion = queryVersion;
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the dynamic thing group.
     * </p>
     *
     * @return <p>
     *         Metadata which can be used to manage the dynamic thing group.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata which can be used to manage the dynamic thing group.
     * </p>
     *
     * @param tags <p>
     *            Metadata which can be used to manage the dynamic thing group.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata which can be used to manage the dynamic thing group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata which can be used to manage the dynamic thing group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDynamicThingGroupRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the dynamic thing group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata which can be used to manage the dynamic thing group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDynamicThingGroupRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getThingGroupName() != null)
            sb.append("thingGroupName: " + getThingGroupName() + ",");
        if (getThingGroupProperties() != null)
            sb.append("thingGroupProperties: " + getThingGroupProperties() + ",");
        if (getIndexName() != null)
            sb.append("indexName: " + getIndexName() + ",");
        if (getQueryString() != null)
            sb.append("queryString: " + getQueryString() + ",");
        if (getQueryVersion() != null)
            sb.append("queryVersion: " + getQueryVersion() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getThingGroupName() == null) ? 0 : getThingGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getThingGroupProperties() == null) ? 0 : getThingGroupProperties().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode
                + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode
                + ((getQueryVersion() == null) ? 0 : getQueryVersion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDynamicThingGroupRequest == false)
            return false;
        CreateDynamicThingGroupRequest other = (CreateDynamicThingGroupRequest) obj;

        if (other.getThingGroupName() == null ^ this.getThingGroupName() == null)
            return false;
        if (other.getThingGroupName() != null
                && other.getThingGroupName().equals(this.getThingGroupName()) == false)
            return false;
        if (other.getThingGroupProperties() == null ^ this.getThingGroupProperties() == null)
            return false;
        if (other.getThingGroupProperties() != null
                && other.getThingGroupProperties().equals(this.getThingGroupProperties()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null
                && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null
                && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getQueryVersion() == null ^ this.getQueryVersion() == null)
            return false;
        if (other.getQueryVersion() != null
                && other.getQueryVersion().equals(this.getQueryVersion()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
