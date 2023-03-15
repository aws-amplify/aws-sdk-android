/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

/**
 * <p>
 * Makes it possible to redact or flag specified personally identifiable
 * information (PII) in your transcript. If you use
 * <code>ContentRedaction</code>, you must also include the sub-parameters:
 * <code>PiiEntityTypes</code>, <code>RedactionOutput</code>, and
 * <code>RedactionType</code>.
 * </p>
 */
public class ContentRedaction implements Serializable {
    /**
     * <p>
     * Specify the category of information you want to redact; <code>PII</code>
     * (personally identifiable information) is the only valid value. You can
     * use <code>PiiEntityTypes</code> to choose which types of PII you want to
     * redact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PII
     */
    private String redactionType;

    /**
     * <p>
     * Specify if you want only a redacted transcript, or if you want a redacted
     * and an unredacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe creates only a
     * redacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe
     * creates a redacted and an unredacted transcript (as two separate files).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>redacted, redacted_and_unredacted
     */
    private String redactionOutput;

    /**
     * <p>
     * Specify which types of personally identifiable information (PII) you want
     * to redact in your transcript. You can include as many types as you'd
     * like, or you can select <code>ALL</code>.
     * </p>
     */
    private java.util.List<String> piiEntityTypes;

    /**
     * <p>
     * Specify the category of information you want to redact; <code>PII</code>
     * (personally identifiable information) is the only valid value. You can
     * use <code>PiiEntityTypes</code> to choose which types of PII you want to
     * redact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PII
     *
     * @return <p>
     *         Specify the category of information you want to redact;
     *         <code>PII</code> (personally identifiable information) is the
     *         only valid value. You can use <code>PiiEntityTypes</code> to
     *         choose which types of PII you want to redact.
     *         </p>
     * @see RedactionType
     */
    public String getRedactionType() {
        return redactionType;
    }

    /**
     * <p>
     * Specify the category of information you want to redact; <code>PII</code>
     * (personally identifiable information) is the only valid value. You can
     * use <code>PiiEntityTypes</code> to choose which types of PII you want to
     * redact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PII
     *
     * @param redactionType <p>
     *            Specify the category of information you want to redact;
     *            <code>PII</code> (personally identifiable information) is the
     *            only valid value. You can use <code>PiiEntityTypes</code> to
     *            choose which types of PII you want to redact.
     *            </p>
     * @see RedactionType
     */
    public void setRedactionType(String redactionType) {
        this.redactionType = redactionType;
    }

    /**
     * <p>
     * Specify the category of information you want to redact; <code>PII</code>
     * (personally identifiable information) is the only valid value. You can
     * use <code>PiiEntityTypes</code> to choose which types of PII you want to
     * redact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PII
     *
     * @param redactionType <p>
     *            Specify the category of information you want to redact;
     *            <code>PII</code> (personally identifiable information) is the
     *            only valid value. You can use <code>PiiEntityTypes</code> to
     *            choose which types of PII you want to redact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RedactionType
     */
    public ContentRedaction withRedactionType(String redactionType) {
        this.redactionType = redactionType;
        return this;
    }

    /**
     * <p>
     * Specify the category of information you want to redact; <code>PII</code>
     * (personally identifiable information) is the only valid value. You can
     * use <code>PiiEntityTypes</code> to choose which types of PII you want to
     * redact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PII
     *
     * @param redactionType <p>
     *            Specify the category of information you want to redact;
     *            <code>PII</code> (personally identifiable information) is the
     *            only valid value. You can use <code>PiiEntityTypes</code> to
     *            choose which types of PII you want to redact.
     *            </p>
     * @see RedactionType
     */
    public void setRedactionType(RedactionType redactionType) {
        this.redactionType = redactionType.toString();
    }

    /**
     * <p>
     * Specify the category of information you want to redact; <code>PII</code>
     * (personally identifiable information) is the only valid value. You can
     * use <code>PiiEntityTypes</code> to choose which types of PII you want to
     * redact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PII
     *
     * @param redactionType <p>
     *            Specify the category of information you want to redact;
     *            <code>PII</code> (personally identifiable information) is the
     *            only valid value. You can use <code>PiiEntityTypes</code> to
     *            choose which types of PII you want to redact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RedactionType
     */
    public ContentRedaction withRedactionType(RedactionType redactionType) {
        this.redactionType = redactionType.toString();
        return this;
    }

    /**
     * <p>
     * Specify if you want only a redacted transcript, or if you want a redacted
     * and an unredacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe creates only a
     * redacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe
     * creates a redacted and an unredacted transcript (as two separate files).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>redacted, redacted_and_unredacted
     *
     * @return <p>
     *         Specify if you want only a redacted transcript, or if you want a
     *         redacted and an unredacted transcript.
     *         </p>
     *         <p>
     *         When you choose <code>redacted</code> Amazon Transcribe creates
     *         only a redacted transcript.
     *         </p>
     *         <p>
     *         When you choose <code>redacted_and_unredacted</code> Amazon
     *         Transcribe creates a redacted and an unredacted transcript (as
     *         two separate files).
     *         </p>
     * @see RedactionOutput
     */
    public String getRedactionOutput() {
        return redactionOutput;
    }

    /**
     * <p>
     * Specify if you want only a redacted transcript, or if you want a redacted
     * and an unredacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe creates only a
     * redacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe
     * creates a redacted and an unredacted transcript (as two separate files).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>redacted, redacted_and_unredacted
     *
     * @param redactionOutput <p>
     *            Specify if you want only a redacted transcript, or if you want
     *            a redacted and an unredacted transcript.
     *            </p>
     *            <p>
     *            When you choose <code>redacted</code> Amazon Transcribe
     *            creates only a redacted transcript.
     *            </p>
     *            <p>
     *            When you choose <code>redacted_and_unredacted</code> Amazon
     *            Transcribe creates a redacted and an unredacted transcript (as
     *            two separate files).
     *            </p>
     * @see RedactionOutput
     */
    public void setRedactionOutput(String redactionOutput) {
        this.redactionOutput = redactionOutput;
    }

    /**
     * <p>
     * Specify if you want only a redacted transcript, or if you want a redacted
     * and an unredacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe creates only a
     * redacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe
     * creates a redacted and an unredacted transcript (as two separate files).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>redacted, redacted_and_unredacted
     *
     * @param redactionOutput <p>
     *            Specify if you want only a redacted transcript, or if you want
     *            a redacted and an unredacted transcript.
     *            </p>
     *            <p>
     *            When you choose <code>redacted</code> Amazon Transcribe
     *            creates only a redacted transcript.
     *            </p>
     *            <p>
     *            When you choose <code>redacted_and_unredacted</code> Amazon
     *            Transcribe creates a redacted and an unredacted transcript (as
     *            two separate files).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RedactionOutput
     */
    public ContentRedaction withRedactionOutput(String redactionOutput) {
        this.redactionOutput = redactionOutput;
        return this;
    }

    /**
     * <p>
     * Specify if you want only a redacted transcript, or if you want a redacted
     * and an unredacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe creates only a
     * redacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe
     * creates a redacted and an unredacted transcript (as two separate files).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>redacted, redacted_and_unredacted
     *
     * @param redactionOutput <p>
     *            Specify if you want only a redacted transcript, or if you want
     *            a redacted and an unredacted transcript.
     *            </p>
     *            <p>
     *            When you choose <code>redacted</code> Amazon Transcribe
     *            creates only a redacted transcript.
     *            </p>
     *            <p>
     *            When you choose <code>redacted_and_unredacted</code> Amazon
     *            Transcribe creates a redacted and an unredacted transcript (as
     *            two separate files).
     *            </p>
     * @see RedactionOutput
     */
    public void setRedactionOutput(RedactionOutput redactionOutput) {
        this.redactionOutput = redactionOutput.toString();
    }

    /**
     * <p>
     * Specify if you want only a redacted transcript, or if you want a redacted
     * and an unredacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe creates only a
     * redacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe
     * creates a redacted and an unredacted transcript (as two separate files).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>redacted, redacted_and_unredacted
     *
     * @param redactionOutput <p>
     *            Specify if you want only a redacted transcript, or if you want
     *            a redacted and an unredacted transcript.
     *            </p>
     *            <p>
     *            When you choose <code>redacted</code> Amazon Transcribe
     *            creates only a redacted transcript.
     *            </p>
     *            <p>
     *            When you choose <code>redacted_and_unredacted</code> Amazon
     *            Transcribe creates a redacted and an unredacted transcript (as
     *            two separate files).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RedactionOutput
     */
    public ContentRedaction withRedactionOutput(RedactionOutput redactionOutput) {
        this.redactionOutput = redactionOutput.toString();
        return this;
    }

    /**
     * <p>
     * Specify which types of personally identifiable information (PII) you want
     * to redact in your transcript. You can include as many types as you'd
     * like, or you can select <code>ALL</code>.
     * </p>
     *
     * @return <p>
     *         Specify which types of personally identifiable information (PII)
     *         you want to redact in your transcript. You can include as many
     *         types as you'd like, or you can select <code>ALL</code>.
     *         </p>
     */
    public java.util.List<String> getPiiEntityTypes() {
        return piiEntityTypes;
    }

    /**
     * <p>
     * Specify which types of personally identifiable information (PII) you want
     * to redact in your transcript. You can include as many types as you'd
     * like, or you can select <code>ALL</code>.
     * </p>
     *
     * @param piiEntityTypes <p>
     *            Specify which types of personally identifiable information
     *            (PII) you want to redact in your transcript. You can include
     *            as many types as you'd like, or you can select
     *            <code>ALL</code>.
     *            </p>
     */
    public void setPiiEntityTypes(java.util.Collection<String> piiEntityTypes) {
        if (piiEntityTypes == null) {
            this.piiEntityTypes = null;
            return;
        }

        this.piiEntityTypes = new java.util.ArrayList<String>(piiEntityTypes);
    }

    /**
     * <p>
     * Specify which types of personally identifiable information (PII) you want
     * to redact in your transcript. You can include as many types as you'd
     * like, or you can select <code>ALL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param piiEntityTypes <p>
     *            Specify which types of personally identifiable information
     *            (PII) you want to redact in your transcript. You can include
     *            as many types as you'd like, or you can select
     *            <code>ALL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContentRedaction withPiiEntityTypes(String... piiEntityTypes) {
        if (getPiiEntityTypes() == null) {
            this.piiEntityTypes = new java.util.ArrayList<String>(piiEntityTypes.length);
        }
        for (String value : piiEntityTypes) {
            this.piiEntityTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specify which types of personally identifiable information (PII) you want
     * to redact in your transcript. You can include as many types as you'd
     * like, or you can select <code>ALL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param piiEntityTypes <p>
     *            Specify which types of personally identifiable information
     *            (PII) you want to redact in your transcript. You can include
     *            as many types as you'd like, or you can select
     *            <code>ALL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContentRedaction withPiiEntityTypes(java.util.Collection<String> piiEntityTypes) {
        setPiiEntityTypes(piiEntityTypes);
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
        if (getRedactionType() != null)
            sb.append("RedactionType: " + getRedactionType() + ",");
        if (getRedactionOutput() != null)
            sb.append("RedactionOutput: " + getRedactionOutput() + ",");
        if (getPiiEntityTypes() != null)
            sb.append("PiiEntityTypes: " + getPiiEntityTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRedactionType() == null) ? 0 : getRedactionType().hashCode());
        hashCode = prime * hashCode
                + ((getRedactionOutput() == null) ? 0 : getRedactionOutput().hashCode());
        hashCode = prime * hashCode
                + ((getPiiEntityTypes() == null) ? 0 : getPiiEntityTypes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContentRedaction == false)
            return false;
        ContentRedaction other = (ContentRedaction) obj;

        if (other.getRedactionType() == null ^ this.getRedactionType() == null)
            return false;
        if (other.getRedactionType() != null
                && other.getRedactionType().equals(this.getRedactionType()) == false)
            return false;
        if (other.getRedactionOutput() == null ^ this.getRedactionOutput() == null)
            return false;
        if (other.getRedactionOutput() != null
                && other.getRedactionOutput().equals(this.getRedactionOutput()) == false)
            return false;
        if (other.getPiiEntityTypes() == null ^ this.getPiiEntityTypes() == null)
            return false;
        if (other.getPiiEntityTypes() != null
                && other.getPiiEntityTypes().equals(this.getPiiEntityTypes()) == false)
            return false;
        return true;
    }
}
