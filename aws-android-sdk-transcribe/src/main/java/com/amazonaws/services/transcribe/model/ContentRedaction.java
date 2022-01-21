/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Settings for content redaction within a transcription job.
 * </p>
 */
public class ContentRedaction implements Serializable {
    /**
     * <p>
     * Request parameter that defines the entities to be redacted. The only
     * accepted value is <code>PII</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PII
     */
    private String redactionType;

    /**
     * <p>
     * The output transcript file stored in either the default S3 bucket or in a
     * bucket you specify.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe outputs only the
     * redacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe
     * outputs both the redacted and unredacted transcripts.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>redacted, redacted_and_unredacted
     */
    private String redactionOutput;

    /**
     * <p>
     * The types of personally identifiable information (PII) you want to redact
     * in your transcript.
     * </p>
     */
    private java.util.List<String> piiEntityTypes;

    /**
     * <p>
     * Request parameter that defines the entities to be redacted. The only
     * accepted value is <code>PII</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PII
     *
     * @return <p>
     *         Request parameter that defines the entities to be redacted. The
     *         only accepted value is <code>PII</code>.
     *         </p>
     * @see RedactionType
     */
    public String getRedactionType() {
        return redactionType;
    }

    /**
     * <p>
     * Request parameter that defines the entities to be redacted. The only
     * accepted value is <code>PII</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PII
     *
     * @param redactionType <p>
     *            Request parameter that defines the entities to be redacted.
     *            The only accepted value is <code>PII</code>.
     *            </p>
     * @see RedactionType
     */
    public void setRedactionType(String redactionType) {
        this.redactionType = redactionType;
    }

    /**
     * <p>
     * Request parameter that defines the entities to be redacted. The only
     * accepted value is <code>PII</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PII
     *
     * @param redactionType <p>
     *            Request parameter that defines the entities to be redacted.
     *            The only accepted value is <code>PII</code>.
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
     * Request parameter that defines the entities to be redacted. The only
     * accepted value is <code>PII</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PII
     *
     * @param redactionType <p>
     *            Request parameter that defines the entities to be redacted.
     *            The only accepted value is <code>PII</code>.
     *            </p>
     * @see RedactionType
     */
    public void setRedactionType(RedactionType redactionType) {
        this.redactionType = redactionType.toString();
    }

    /**
     * <p>
     * Request parameter that defines the entities to be redacted. The only
     * accepted value is <code>PII</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PII
     *
     * @param redactionType <p>
     *            Request parameter that defines the entities to be redacted.
     *            The only accepted value is <code>PII</code>.
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
     * The output transcript file stored in either the default S3 bucket or in a
     * bucket you specify.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe outputs only the
     * redacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe
     * outputs both the redacted and unredacted transcripts.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>redacted, redacted_and_unredacted
     *
     * @return <p>
     *         The output transcript file stored in either the default S3 bucket
     *         or in a bucket you specify.
     *         </p>
     *         <p>
     *         When you choose <code>redacted</code> Amazon Transcribe outputs
     *         only the redacted transcript.
     *         </p>
     *         <p>
     *         When you choose <code>redacted_and_unredacted</code> Amazon
     *         Transcribe outputs both the redacted and unredacted transcripts.
     *         </p>
     * @see RedactionOutput
     */
    public String getRedactionOutput() {
        return redactionOutput;
    }

    /**
     * <p>
     * The output transcript file stored in either the default S3 bucket or in a
     * bucket you specify.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe outputs only the
     * redacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe
     * outputs both the redacted and unredacted transcripts.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>redacted, redacted_and_unredacted
     *
     * @param redactionOutput <p>
     *            The output transcript file stored in either the default S3
     *            bucket or in a bucket you specify.
     *            </p>
     *            <p>
     *            When you choose <code>redacted</code> Amazon Transcribe
     *            outputs only the redacted transcript.
     *            </p>
     *            <p>
     *            When you choose <code>redacted_and_unredacted</code> Amazon
     *            Transcribe outputs both the redacted and unredacted
     *            transcripts.
     *            </p>
     * @see RedactionOutput
     */
    public void setRedactionOutput(String redactionOutput) {
        this.redactionOutput = redactionOutput;
    }

    /**
     * <p>
     * The output transcript file stored in either the default S3 bucket or in a
     * bucket you specify.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe outputs only the
     * redacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe
     * outputs both the redacted and unredacted transcripts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>redacted, redacted_and_unredacted
     *
     * @param redactionOutput <p>
     *            The output transcript file stored in either the default S3
     *            bucket or in a bucket you specify.
     *            </p>
     *            <p>
     *            When you choose <code>redacted</code> Amazon Transcribe
     *            outputs only the redacted transcript.
     *            </p>
     *            <p>
     *            When you choose <code>redacted_and_unredacted</code> Amazon
     *            Transcribe outputs both the redacted and unredacted
     *            transcripts.
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
     * The output transcript file stored in either the default S3 bucket or in a
     * bucket you specify.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe outputs only the
     * redacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe
     * outputs both the redacted and unredacted transcripts.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>redacted, redacted_and_unredacted
     *
     * @param redactionOutput <p>
     *            The output transcript file stored in either the default S3
     *            bucket or in a bucket you specify.
     *            </p>
     *            <p>
     *            When you choose <code>redacted</code> Amazon Transcribe
     *            outputs only the redacted transcript.
     *            </p>
     *            <p>
     *            When you choose <code>redacted_and_unredacted</code> Amazon
     *            Transcribe outputs both the redacted and unredacted
     *            transcripts.
     *            </p>
     * @see RedactionOutput
     */
    public void setRedactionOutput(RedactionOutput redactionOutput) {
        this.redactionOutput = redactionOutput.toString();
    }

    /**
     * <p>
     * The output transcript file stored in either the default S3 bucket or in a
     * bucket you specify.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe outputs only the
     * redacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe
     * outputs both the redacted and unredacted transcripts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>redacted, redacted_and_unredacted
     *
     * @param redactionOutput <p>
     *            The output transcript file stored in either the default S3
     *            bucket or in a bucket you specify.
     *            </p>
     *            <p>
     *            When you choose <code>redacted</code> Amazon Transcribe
     *            outputs only the redacted transcript.
     *            </p>
     *            <p>
     *            When you choose <code>redacted_and_unredacted</code> Amazon
     *            Transcribe outputs both the redacted and unredacted
     *            transcripts.
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
     * The types of personally identifiable information (PII) you want to redact
     * in your transcript.
     * </p>
     *
     * @return <p>
     *         The types of personally identifiable information (PII) you want
     *         to redact in your transcript.
     *         </p>
     */
    public java.util.List<String> getPiiEntityTypes() {
        return piiEntityTypes;
    }

    /**
     * <p>
     * The types of personally identifiable information (PII) you want to redact
     * in your transcript.
     * </p>
     *
     * @param piiEntityTypes <p>
     *            The types of personally identifiable information (PII) you
     *            want to redact in your transcript.
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
     * The types of personally identifiable information (PII) you want to redact
     * in your transcript.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param piiEntityTypes <p>
     *            The types of personally identifiable information (PII) you
     *            want to redact in your transcript.
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
     * The types of personally identifiable information (PII) you want to redact
     * in your transcript.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param piiEntityTypes <p>
     *            The types of personally identifiable information (PII) you
     *            want to redact in your transcript.
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
