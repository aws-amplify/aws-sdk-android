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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Details about the threat intelligence related to a finding.
 * </p>
 */
public class ThreatIntelIndicator implements Serializable {
    /**
     * <p>
     * The type of threat intelligence indicator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOMAIN, EMAIL_ADDRESS, HASH_MD5, HASH_SHA1,
     * HASH_SHA256, HASH_SHA512, IPV4_ADDRESS, IPV6_ADDRESS, MUTEX, PROCESS, URL
     */
    private String type;

    /**
     * <p>
     * The value of a threat intelligence indicator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String value;

    /**
     * <p>
     * The category of a threat intelligence indicator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BACKDOOR, CARD_STEALER, COMMAND_AND_CONTROL,
     * DROP_SITE, EXPLOIT_SITE, KEYLOGGER
     */
    private String category;

    /**
     * <p>
     * The date and time when the most recent instance of a threat intelligence
     * indicator was observed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String lastObservedAt;

    /**
     * <p>
     * The source of the threat intelligence indicator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String source;

    /**
     * <p>
     * The URL to the page or site where you can get more information about the
     * threat intelligence indicator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String sourceUrl;

    /**
     * <p>
     * The type of threat intelligence indicator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOMAIN, EMAIL_ADDRESS, HASH_MD5, HASH_SHA1,
     * HASH_SHA256, HASH_SHA512, IPV4_ADDRESS, IPV6_ADDRESS, MUTEX, PROCESS, URL
     *
     * @return <p>
     *         The type of threat intelligence indicator.
     *         </p>
     * @see ThreatIntelIndicatorType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of threat intelligence indicator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOMAIN, EMAIL_ADDRESS, HASH_MD5, HASH_SHA1,
     * HASH_SHA256, HASH_SHA512, IPV4_ADDRESS, IPV6_ADDRESS, MUTEX, PROCESS, URL
     *
     * @param type <p>
     *            The type of threat intelligence indicator.
     *            </p>
     * @see ThreatIntelIndicatorType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of threat intelligence indicator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOMAIN, EMAIL_ADDRESS, HASH_MD5, HASH_SHA1,
     * HASH_SHA256, HASH_SHA512, IPV4_ADDRESS, IPV6_ADDRESS, MUTEX, PROCESS, URL
     *
     * @param type <p>
     *            The type of threat intelligence indicator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ThreatIntelIndicatorType
     */
    public ThreatIntelIndicator withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of threat intelligence indicator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOMAIN, EMAIL_ADDRESS, HASH_MD5, HASH_SHA1,
     * HASH_SHA256, HASH_SHA512, IPV4_ADDRESS, IPV6_ADDRESS, MUTEX, PROCESS, URL
     *
     * @param type <p>
     *            The type of threat intelligence indicator.
     *            </p>
     * @see ThreatIntelIndicatorType
     */
    public void setType(ThreatIntelIndicatorType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of threat intelligence indicator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOMAIN, EMAIL_ADDRESS, HASH_MD5, HASH_SHA1,
     * HASH_SHA256, HASH_SHA512, IPV4_ADDRESS, IPV6_ADDRESS, MUTEX, PROCESS, URL
     *
     * @param type <p>
     *            The type of threat intelligence indicator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ThreatIntelIndicatorType
     */
    public ThreatIntelIndicator withType(ThreatIntelIndicatorType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The value of a threat intelligence indicator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The value of a threat intelligence indicator.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of a threat intelligence indicator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param value <p>
     *            The value of a threat intelligence indicator.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of a threat intelligence indicator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param value <p>
     *            The value of a threat intelligence indicator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThreatIntelIndicator withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The category of a threat intelligence indicator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BACKDOOR, CARD_STEALER, COMMAND_AND_CONTROL,
     * DROP_SITE, EXPLOIT_SITE, KEYLOGGER
     *
     * @return <p>
     *         The category of a threat intelligence indicator.
     *         </p>
     * @see ThreatIntelIndicatorCategory
     */
    public String getCategory() {
        return category;
    }

    /**
     * <p>
     * The category of a threat intelligence indicator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BACKDOOR, CARD_STEALER, COMMAND_AND_CONTROL,
     * DROP_SITE, EXPLOIT_SITE, KEYLOGGER
     *
     * @param category <p>
     *            The category of a threat intelligence indicator.
     *            </p>
     * @see ThreatIntelIndicatorCategory
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category of a threat intelligence indicator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BACKDOOR, CARD_STEALER, COMMAND_AND_CONTROL,
     * DROP_SITE, EXPLOIT_SITE, KEYLOGGER
     *
     * @param category <p>
     *            The category of a threat intelligence indicator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ThreatIntelIndicatorCategory
     */
    public ThreatIntelIndicator withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * <p>
     * The category of a threat intelligence indicator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BACKDOOR, CARD_STEALER, COMMAND_AND_CONTROL,
     * DROP_SITE, EXPLOIT_SITE, KEYLOGGER
     *
     * @param category <p>
     *            The category of a threat intelligence indicator.
     *            </p>
     * @see ThreatIntelIndicatorCategory
     */
    public void setCategory(ThreatIntelIndicatorCategory category) {
        this.category = category.toString();
    }

    /**
     * <p>
     * The category of a threat intelligence indicator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BACKDOOR, CARD_STEALER, COMMAND_AND_CONTROL,
     * DROP_SITE, EXPLOIT_SITE, KEYLOGGER
     *
     * @param category <p>
     *            The category of a threat intelligence indicator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ThreatIntelIndicatorCategory
     */
    public ThreatIntelIndicator withCategory(ThreatIntelIndicatorCategory category) {
        this.category = category.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the most recent instance of a threat intelligence
     * indicator was observed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The date and time when the most recent instance of a threat
     *         intelligence indicator was observed.
     *         </p>
     */
    public String getLastObservedAt() {
        return lastObservedAt;
    }

    /**
     * <p>
     * The date and time when the most recent instance of a threat intelligence
     * indicator was observed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param lastObservedAt <p>
     *            The date and time when the most recent instance of a threat
     *            intelligence indicator was observed.
     *            </p>
     */
    public void setLastObservedAt(String lastObservedAt) {
        this.lastObservedAt = lastObservedAt;
    }

    /**
     * <p>
     * The date and time when the most recent instance of a threat intelligence
     * indicator was observed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param lastObservedAt <p>
     *            The date and time when the most recent instance of a threat
     *            intelligence indicator was observed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThreatIntelIndicator withLastObservedAt(String lastObservedAt) {
        this.lastObservedAt = lastObservedAt;
        return this;
    }

    /**
     * <p>
     * The source of the threat intelligence indicator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The source of the threat intelligence indicator.
     *         </p>
     */
    public String getSource() {
        return source;
    }

    /**
     * <p>
     * The source of the threat intelligence indicator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param source <p>
     *            The source of the threat intelligence indicator.
     *            </p>
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the threat intelligence indicator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param source <p>
     *            The source of the threat intelligence indicator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThreatIntelIndicator withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * <p>
     * The URL to the page or site where you can get more information about the
     * threat intelligence indicator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The URL to the page or site where you can get more information
     *         about the threat intelligence indicator.
     *         </p>
     */
    public String getSourceUrl() {
        return sourceUrl;
    }

    /**
     * <p>
     * The URL to the page or site where you can get more information about the
     * threat intelligence indicator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param sourceUrl <p>
     *            The URL to the page or site where you can get more information
     *            about the threat intelligence indicator.
     *            </p>
     */
    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    /**
     * <p>
     * The URL to the page or site where you can get more information about the
     * threat intelligence indicator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param sourceUrl <p>
     *            The URL to the page or site where you can get more information
     *            about the threat intelligence indicator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThreatIntelIndicator withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getCategory() != null)
            sb.append("Category: " + getCategory() + ",");
        if (getLastObservedAt() != null)
            sb.append("LastObservedAt: " + getLastObservedAt() + ",");
        if (getSource() != null)
            sb.append("Source: " + getSource() + ",");
        if (getSourceUrl() != null)
            sb.append("SourceUrl: " + getSourceUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode
                + ((getLastObservedAt() == null) ? 0 : getLastObservedAt().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getSourceUrl() == null) ? 0 : getSourceUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThreatIntelIndicator == false)
            return false;
        ThreatIntelIndicator other = (ThreatIntelIndicator) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getLastObservedAt() == null ^ this.getLastObservedAt() == null)
            return false;
        if (other.getLastObservedAt() != null
                && other.getLastObservedAt().equals(this.getLastObservedAt()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getSourceUrl() == null ^ this.getSourceUrl() == null)
            return false;
        if (other.getSourceUrl() != null
                && other.getSourceUrl().equals(this.getSourceUrl()) == false)
            return false;
        return true;
    }
}
