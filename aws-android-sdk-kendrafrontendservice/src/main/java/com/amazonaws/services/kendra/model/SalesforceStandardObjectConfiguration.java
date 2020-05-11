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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies confguration information for indexing a single standard object.
 * </p>
 */
public class SalesforceStandardObjectConfiguration implements Serializable {
    /**
     * <p>
     * The name of the standard object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, CAMPAIGN, CASE, CONTACT, CONTRACT,
     * DOCUMENT, GROUP, IDEA, LEAD, OPPORTUNITY, PARTNER, PRICEBOOK, PRODUCT,
     * PROFILE, SOLUTION, TASK, USER
     */
    private String name;

    /**
     * <p>
     * The name of the field in the standard object table that contains the
     * document contents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     */
    private String documentDataFieldName;

    /**
     * <p>
     * The name of the field in the standard object table that contains the
     * document titleB.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     */
    private String documentTitleFieldName;

    /**
     * <p>
     * One or more objects that map fields in the standard object to Amazon
     * Kendra index fields. The index field must exist before you can map a
     * Salesforce field to it.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> fieldMappings;

    /**
     * <p>
     * The name of the standard object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, CAMPAIGN, CASE, CONTACT, CONTRACT,
     * DOCUMENT, GROUP, IDEA, LEAD, OPPORTUNITY, PARTNER, PRICEBOOK, PRODUCT,
     * PROFILE, SOLUTION, TASK, USER
     *
     * @return <p>
     *         The name of the standard object.
     *         </p>
     * @see SalesforceStandardObjectName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the standard object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, CAMPAIGN, CASE, CONTACT, CONTRACT,
     * DOCUMENT, GROUP, IDEA, LEAD, OPPORTUNITY, PARTNER, PRICEBOOK, PRODUCT,
     * PROFILE, SOLUTION, TASK, USER
     *
     * @param name <p>
     *            The name of the standard object.
     *            </p>
     * @see SalesforceStandardObjectName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the standard object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, CAMPAIGN, CASE, CONTACT, CONTRACT,
     * DOCUMENT, GROUP, IDEA, LEAD, OPPORTUNITY, PARTNER, PRICEBOOK, PRODUCT,
     * PROFILE, SOLUTION, TASK, USER
     *
     * @param name <p>
     *            The name of the standard object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SalesforceStandardObjectName
     */
    public SalesforceStandardObjectConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The name of the standard object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, CAMPAIGN, CASE, CONTACT, CONTRACT,
     * DOCUMENT, GROUP, IDEA, LEAD, OPPORTUNITY, PARTNER, PRICEBOOK, PRODUCT,
     * PROFILE, SOLUTION, TASK, USER
     *
     * @param name <p>
     *            The name of the standard object.
     *            </p>
     * @see SalesforceStandardObjectName
     */
    public void setName(SalesforceStandardObjectName name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * The name of the standard object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, CAMPAIGN, CASE, CONTACT, CONTRACT,
     * DOCUMENT, GROUP, IDEA, LEAD, OPPORTUNITY, PARTNER, PRICEBOOK, PRODUCT,
     * PROFILE, SOLUTION, TASK, USER
     *
     * @param name <p>
     *            The name of the standard object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SalesforceStandardObjectName
     */
    public SalesforceStandardObjectConfiguration withName(SalesforceStandardObjectName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The name of the field in the standard object table that contains the
     * document contents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @return <p>
     *         The name of the field in the standard object table that contains
     *         the document contents.
     *         </p>
     */
    public String getDocumentDataFieldName() {
        return documentDataFieldName;
    }

    /**
     * <p>
     * The name of the field in the standard object table that contains the
     * document contents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @param documentDataFieldName <p>
     *            The name of the field in the standard object table that
     *            contains the document contents.
     *            </p>
     */
    public void setDocumentDataFieldName(String documentDataFieldName) {
        this.documentDataFieldName = documentDataFieldName;
    }

    /**
     * <p>
     * The name of the field in the standard object table that contains the
     * document contents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @param documentDataFieldName <p>
     *            The name of the field in the standard object table that
     *            contains the document contents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceStandardObjectConfiguration withDocumentDataFieldName(
            String documentDataFieldName) {
        this.documentDataFieldName = documentDataFieldName;
        return this;
    }

    /**
     * <p>
     * The name of the field in the standard object table that contains the
     * document titleB.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @return <p>
     *         The name of the field in the standard object table that contains
     *         the document titleB.
     *         </p>
     */
    public String getDocumentTitleFieldName() {
        return documentTitleFieldName;
    }

    /**
     * <p>
     * The name of the field in the standard object table that contains the
     * document titleB.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @param documentTitleFieldName <p>
     *            The name of the field in the standard object table that
     *            contains the document titleB.
     *            </p>
     */
    public void setDocumentTitleFieldName(String documentTitleFieldName) {
        this.documentTitleFieldName = documentTitleFieldName;
    }

    /**
     * <p>
     * The name of the field in the standard object table that contains the
     * document titleB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @param documentTitleFieldName <p>
     *            The name of the field in the standard object table that
     *            contains the document titleB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceStandardObjectConfiguration withDocumentTitleFieldName(
            String documentTitleFieldName) {
        this.documentTitleFieldName = documentTitleFieldName;
        return this;
    }

    /**
     * <p>
     * One or more objects that map fields in the standard object to Amazon
     * Kendra index fields. The index field must exist before you can map a
     * Salesforce field to it.
     * </p>
     *
     * @return <p>
     *         One or more objects that map fields in the standard object to
     *         Amazon Kendra index fields. The index field must exist before you
     *         can map a Salesforce field to it.
     *         </p>
     */
    public java.util.List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return fieldMappings;
    }

    /**
     * <p>
     * One or more objects that map fields in the standard object to Amazon
     * Kendra index fields. The index field must exist before you can map a
     * Salesforce field to it.
     * </p>
     *
     * @param fieldMappings <p>
     *            One or more objects that map fields in the standard object to
     *            Amazon Kendra index fields. The index field must exist before
     *            you can map a Salesforce field to it.
     *            </p>
     */
    public void setFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        if (fieldMappings == null) {
            this.fieldMappings = null;
            return;
        }

        this.fieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(fieldMappings);
    }

    /**
     * <p>
     * One or more objects that map fields in the standard object to Amazon
     * Kendra index fields. The index field must exist before you can map a
     * Salesforce field to it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldMappings <p>
     *            One or more objects that map fields in the standard object to
     *            Amazon Kendra index fields. The index field must exist before
     *            you can map a Salesforce field to it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceStandardObjectConfiguration withFieldMappings(
            DataSourceToIndexFieldMapping... fieldMappings) {
        if (getFieldMappings() == null) {
            this.fieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(
                    fieldMappings.length);
        }
        for (DataSourceToIndexFieldMapping value : fieldMappings) {
            this.fieldMappings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more objects that map fields in the standard object to Amazon
     * Kendra index fields. The index field must exist before you can map a
     * Salesforce field to it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldMappings <p>
     *            One or more objects that map fields in the standard object to
     *            Amazon Kendra index fields. The index field must exist before
     *            you can map a Salesforce field to it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceStandardObjectConfiguration withFieldMappings(
            java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        setFieldMappings(fieldMappings);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDocumentDataFieldName() != null)
            sb.append("DocumentDataFieldName: " + getDocumentDataFieldName() + ",");
        if (getDocumentTitleFieldName() != null)
            sb.append("DocumentTitleFieldName: " + getDocumentTitleFieldName() + ",");
        if (getFieldMappings() != null)
            sb.append("FieldMappings: " + getFieldMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDocumentDataFieldName() == null) ? 0 : getDocumentDataFieldName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDocumentTitleFieldName() == null) ? 0 : getDocumentTitleFieldName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getFieldMappings() == null) ? 0 : getFieldMappings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SalesforceStandardObjectConfiguration == false)
            return false;
        SalesforceStandardObjectConfiguration other = (SalesforceStandardObjectConfiguration) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDocumentDataFieldName() == null ^ this.getDocumentDataFieldName() == null)
            return false;
        if (other.getDocumentDataFieldName() != null
                && other.getDocumentDataFieldName().equals(this.getDocumentDataFieldName()) == false)
            return false;
        if (other.getDocumentTitleFieldName() == null ^ this.getDocumentTitleFieldName() == null)
            return false;
        if (other.getDocumentTitleFieldName() != null
                && other.getDocumentTitleFieldName().equals(this.getDocumentTitleFieldName()) == false)
            return false;
        if (other.getFieldMappings() == null ^ this.getFieldMappings() == null)
            return false;
        if (other.getFieldMappings() != null
                && other.getFieldMappings().equals(this.getFieldMappings()) == false)
            return false;
        return true;
    }
}
