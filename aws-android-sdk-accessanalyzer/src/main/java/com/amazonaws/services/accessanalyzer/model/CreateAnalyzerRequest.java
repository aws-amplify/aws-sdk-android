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

package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an analyzer for your account.
 * </p>
 */
public class CreateAnalyzerRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the analyzer to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     */
    private String analyzerName;

    /**
     * <p>
     * Specifies the archive rules to add for the analyzer. Archive rules
     * automatically archive findings that meet the criteria you define for the
     * rule.
     * </p>
     */
    private java.util.List<InlineArchiveRule> archiveRules;

    /**
     * <p>
     * A client token.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The tags to apply to the analyzer.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The type of analyzer to create. Only ACCOUNT analyzers are supported. You
     * can create only one analyzer per account per Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATION
     */
    private String type;

    /**
     * <p>
     * The name of the analyzer to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     *
     * @return <p>
     *         The name of the analyzer to create.
     *         </p>
     */
    public String getAnalyzerName() {
        return analyzerName;
    }

    /**
     * <p>
     * The name of the analyzer to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     *
     * @param analyzerName <p>
     *            The name of the analyzer to create.
     *            </p>
     */
    public void setAnalyzerName(String analyzerName) {
        this.analyzerName = analyzerName;
    }

    /**
     * <p>
     * The name of the analyzer to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     *
     * @param analyzerName <p>
     *            The name of the analyzer to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAnalyzerRequest withAnalyzerName(String analyzerName) {
        this.analyzerName = analyzerName;
        return this;
    }

    /**
     * <p>
     * Specifies the archive rules to add for the analyzer. Archive rules
     * automatically archive findings that meet the criteria you define for the
     * rule.
     * </p>
     *
     * @return <p>
     *         Specifies the archive rules to add for the analyzer. Archive
     *         rules automatically archive findings that meet the criteria you
     *         define for the rule.
     *         </p>
     */
    public java.util.List<InlineArchiveRule> getArchiveRules() {
        return archiveRules;
    }

    /**
     * <p>
     * Specifies the archive rules to add for the analyzer. Archive rules
     * automatically archive findings that meet the criteria you define for the
     * rule.
     * </p>
     *
     * @param archiveRules <p>
     *            Specifies the archive rules to add for the analyzer. Archive
     *            rules automatically archive findings that meet the criteria
     *            you define for the rule.
     *            </p>
     */
    public void setArchiveRules(java.util.Collection<InlineArchiveRule> archiveRules) {
        if (archiveRules == null) {
            this.archiveRules = null;
            return;
        }

        this.archiveRules = new java.util.ArrayList<InlineArchiveRule>(archiveRules);
    }

    /**
     * <p>
     * Specifies the archive rules to add for the analyzer. Archive rules
     * automatically archive findings that meet the criteria you define for the
     * rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param archiveRules <p>
     *            Specifies the archive rules to add for the analyzer. Archive
     *            rules automatically archive findings that meet the criteria
     *            you define for the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAnalyzerRequest withArchiveRules(InlineArchiveRule... archiveRules) {
        if (getArchiveRules() == null) {
            this.archiveRules = new java.util.ArrayList<InlineArchiveRule>(archiveRules.length);
        }
        for (InlineArchiveRule value : archiveRules) {
            this.archiveRules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the archive rules to add for the analyzer. Archive rules
     * automatically archive findings that meet the criteria you define for the
     * rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param archiveRules <p>
     *            Specifies the archive rules to add for the analyzer. Archive
     *            rules automatically archive findings that meet the criteria
     *            you define for the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAnalyzerRequest withArchiveRules(
            java.util.Collection<InlineArchiveRule> archiveRules) {
        setArchiveRules(archiveRules);
        return this;
    }

    /**
     * <p>
     * A client token.
     * </p>
     *
     * @return <p>
     *         A client token.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A client token.
     * </p>
     *
     * @param clientToken <p>
     *            A client token.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A client token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            A client token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAnalyzerRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The tags to apply to the analyzer.
     * </p>
     *
     * @return <p>
     *         The tags to apply to the analyzer.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to apply to the analyzer.
     * </p>
     *
     * @param tags <p>
     *            The tags to apply to the analyzer.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to apply to the analyzer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to apply to the analyzer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAnalyzerRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags to apply to the analyzer.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAnalyzerRequest addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateAnalyzerRequest cleartagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The type of analyzer to create. Only ACCOUNT analyzers are supported. You
     * can create only one analyzer per account per Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATION
     *
     * @return <p>
     *         The type of analyzer to create. Only ACCOUNT analyzers are
     *         supported. You can create only one analyzer per account per
     *         Region.
     *         </p>
     * @see Type
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of analyzer to create. Only ACCOUNT analyzers are supported. You
     * can create only one analyzer per account per Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATION
     *
     * @param type <p>
     *            The type of analyzer to create. Only ACCOUNT analyzers are
     *            supported. You can create only one analyzer per account per
     *            Region.
     *            </p>
     * @see Type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of analyzer to create. Only ACCOUNT analyzers are supported. You
     * can create only one analyzer per account per Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATION
     *
     * @param type <p>
     *            The type of analyzer to create. Only ACCOUNT analyzers are
     *            supported. You can create only one analyzer per account per
     *            Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public CreateAnalyzerRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of analyzer to create. Only ACCOUNT analyzers are supported. You
     * can create only one analyzer per account per Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATION
     *
     * @param type <p>
     *            The type of analyzer to create. Only ACCOUNT analyzers are
     *            supported. You can create only one analyzer per account per
     *            Region.
     *            </p>
     * @see Type
     */
    public void setType(Type type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of analyzer to create. Only ACCOUNT analyzers are supported. You
     * can create only one analyzer per account per Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATION
     *
     * @param type <p>
     *            The type of analyzer to create. Only ACCOUNT analyzers are
     *            supported. You can create only one analyzer per account per
     *            Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public CreateAnalyzerRequest withType(Type type) {
        this.type = type.toString();
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
        if (getAnalyzerName() != null)
            sb.append("analyzerName: " + getAnalyzerName() + ",");
        if (getArchiveRules() != null)
            sb.append("archiveRules: " + getArchiveRules() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getType() != null)
            sb.append("type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAnalyzerName() == null) ? 0 : getAnalyzerName().hashCode());
        hashCode = prime * hashCode
                + ((getArchiveRules() == null) ? 0 : getArchiveRules().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAnalyzerRequest == false)
            return false;
        CreateAnalyzerRequest other = (CreateAnalyzerRequest) obj;

        if (other.getAnalyzerName() == null ^ this.getAnalyzerName() == null)
            return false;
        if (other.getAnalyzerName() != null
                && other.getAnalyzerName().equals(this.getAnalyzerName()) == false)
            return false;
        if (other.getArchiveRules() == null ^ this.getArchiveRules() == null)
            return false;
        if (other.getArchiveRules() != null
                && other.getArchiveRules().equals(this.getArchiveRules()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
