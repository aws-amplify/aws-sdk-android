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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

/**
 * <p>
 * The values that are available for a tag.
 * </p>
 */
public class TagValues implements Serializable {
    /**
     * <p>
     * The key for the tag.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String key;

    /**
     * <p>
     * The specific value of the tag.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The match options that you can use to filter your results.
     * <code>MatchOptions</code> is only applicable for only applicable for
     * actions related to Cost Category. The default values for
     * <code>MatchOptions</code> is <code>EQUALS</code> and
     * <code>CASE_SENSITIVE</code>.
     * </p>
     */
    private java.util.List<String> matchOptions;

    /**
     * <p>
     * The key for the tag.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The key for the tag.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The key for the tag.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param key <p>
     *            The key for the tag.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key for the tag.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param key <p>
     *            The key for the tag.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagValues withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The specific value of the tag.
     * </p>
     *
     * @return <p>
     *         The specific value of the tag.
     *         </p>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The specific value of the tag.
     * </p>
     *
     * @param values <p>
     *            The specific value of the tag.
     *            </p>
     */
    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The specific value of the tag.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The specific value of the tag.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagValues withValues(String... values) {
        if (getValues() == null) {
            this.values = new java.util.ArrayList<String>(values.length);
        }
        for (String value : values) {
            this.values.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The specific value of the tag.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The specific value of the tag.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagValues withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The match options that you can use to filter your results.
     * <code>MatchOptions</code> is only applicable for only applicable for
     * actions related to Cost Category. The default values for
     * <code>MatchOptions</code> is <code>EQUALS</code> and
     * <code>CASE_SENSITIVE</code>.
     * </p>
     *
     * @return <p>
     *         The match options that you can use to filter your results.
     *         <code>MatchOptions</code> is only applicable for only applicable
     *         for actions related to Cost Category. The default values for
     *         <code>MatchOptions</code> is <code>EQUALS</code> and
     *         <code>CASE_SENSITIVE</code>.
     *         </p>
     */
    public java.util.List<String> getMatchOptions() {
        return matchOptions;
    }

    /**
     * <p>
     * The match options that you can use to filter your results.
     * <code>MatchOptions</code> is only applicable for only applicable for
     * actions related to Cost Category. The default values for
     * <code>MatchOptions</code> is <code>EQUALS</code> and
     * <code>CASE_SENSITIVE</code>.
     * </p>
     *
     * @param matchOptions <p>
     *            The match options that you can use to filter your results.
     *            <code>MatchOptions</code> is only applicable for only
     *            applicable for actions related to Cost Category. The default
     *            values for <code>MatchOptions</code> is <code>EQUALS</code>
     *            and <code>CASE_SENSITIVE</code>.
     *            </p>
     */
    public void setMatchOptions(java.util.Collection<String> matchOptions) {
        if (matchOptions == null) {
            this.matchOptions = null;
            return;
        }

        this.matchOptions = new java.util.ArrayList<String>(matchOptions);
    }

    /**
     * <p>
     * The match options that you can use to filter your results.
     * <code>MatchOptions</code> is only applicable for only applicable for
     * actions related to Cost Category. The default values for
     * <code>MatchOptions</code> is <code>EQUALS</code> and
     * <code>CASE_SENSITIVE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param matchOptions <p>
     *            The match options that you can use to filter your results.
     *            <code>MatchOptions</code> is only applicable for only
     *            applicable for actions related to Cost Category. The default
     *            values for <code>MatchOptions</code> is <code>EQUALS</code>
     *            and <code>CASE_SENSITIVE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagValues withMatchOptions(String... matchOptions) {
        if (getMatchOptions() == null) {
            this.matchOptions = new java.util.ArrayList<String>(matchOptions.length);
        }
        for (String value : matchOptions) {
            this.matchOptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The match options that you can use to filter your results.
     * <code>MatchOptions</code> is only applicable for only applicable for
     * actions related to Cost Category. The default values for
     * <code>MatchOptions</code> is <code>EQUALS</code> and
     * <code>CASE_SENSITIVE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param matchOptions <p>
     *            The match options that you can use to filter your results.
     *            <code>MatchOptions</code> is only applicable for only
     *            applicable for actions related to Cost Category. The default
     *            values for <code>MatchOptions</code> is <code>EQUALS</code>
     *            and <code>CASE_SENSITIVE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagValues withMatchOptions(java.util.Collection<String> matchOptions) {
        setMatchOptions(matchOptions);
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getValues() != null)
            sb.append("Values: " + getValues() + ",");
        if (getMatchOptions() != null)
            sb.append("MatchOptions: " + getMatchOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode
                + ((getMatchOptions() == null) ? 0 : getMatchOptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagValues == false)
            return false;
        TagValues other = (TagValues) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getMatchOptions() == null ^ this.getMatchOptions() == null)
            return false;
        if (other.getMatchOptions() != null
                && other.getMatchOptions().equals(this.getMatchOptions()) == false)
            return false;
        return true;
    }
}
