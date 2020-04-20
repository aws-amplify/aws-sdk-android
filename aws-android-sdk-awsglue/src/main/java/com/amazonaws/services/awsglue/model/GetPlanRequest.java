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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets code to perform a specified mapping.
 * </p>
 */
public class GetPlanRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The list of mappings from a source table to target tables.
     * </p>
     */
    private java.util.List<MappingEntry> mapping;

    /**
     * <p>
     * The source table.
     * </p>
     */
    private CatalogEntry source;

    /**
     * <p>
     * The target tables.
     * </p>
     */
    private java.util.List<CatalogEntry> sinks;

    /**
     * <p>
     * The parameters for the mapping.
     * </p>
     */
    private Location location;

    /**
     * <p>
     * The programming language of the code to perform the mapping.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PYTHON, SCALA
     */
    private String language;

    /**
     * <p>
     * The list of mappings from a source table to target tables.
     * </p>
     *
     * @return <p>
     *         The list of mappings from a source table to target tables.
     *         </p>
     */
    public java.util.List<MappingEntry> getMapping() {
        return mapping;
    }

    /**
     * <p>
     * The list of mappings from a source table to target tables.
     * </p>
     *
     * @param mapping <p>
     *            The list of mappings from a source table to target tables.
     *            </p>
     */
    public void setMapping(java.util.Collection<MappingEntry> mapping) {
        if (mapping == null) {
            this.mapping = null;
            return;
        }

        this.mapping = new java.util.ArrayList<MappingEntry>(mapping);
    }

    /**
     * <p>
     * The list of mappings from a source table to target tables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mapping <p>
     *            The list of mappings from a source table to target tables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPlanRequest withMapping(MappingEntry... mapping) {
        if (getMapping() == null) {
            this.mapping = new java.util.ArrayList<MappingEntry>(mapping.length);
        }
        for (MappingEntry value : mapping) {
            this.mapping.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of mappings from a source table to target tables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mapping <p>
     *            The list of mappings from a source table to target tables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPlanRequest withMapping(java.util.Collection<MappingEntry> mapping) {
        setMapping(mapping);
        return this;
    }

    /**
     * <p>
     * The source table.
     * </p>
     *
     * @return <p>
     *         The source table.
     *         </p>
     */
    public CatalogEntry getSource() {
        return source;
    }

    /**
     * <p>
     * The source table.
     * </p>
     *
     * @param source <p>
     *            The source table.
     *            </p>
     */
    public void setSource(CatalogEntry source) {
        this.source = source;
    }

    /**
     * <p>
     * The source table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param source <p>
     *            The source table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPlanRequest withSource(CatalogEntry source) {
        this.source = source;
        return this;
    }

    /**
     * <p>
     * The target tables.
     * </p>
     *
     * @return <p>
     *         The target tables.
     *         </p>
     */
    public java.util.List<CatalogEntry> getSinks() {
        return sinks;
    }

    /**
     * <p>
     * The target tables.
     * </p>
     *
     * @param sinks <p>
     *            The target tables.
     *            </p>
     */
    public void setSinks(java.util.Collection<CatalogEntry> sinks) {
        if (sinks == null) {
            this.sinks = null;
            return;
        }

        this.sinks = new java.util.ArrayList<CatalogEntry>(sinks);
    }

    /**
     * <p>
     * The target tables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sinks <p>
     *            The target tables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPlanRequest withSinks(CatalogEntry... sinks) {
        if (getSinks() == null) {
            this.sinks = new java.util.ArrayList<CatalogEntry>(sinks.length);
        }
        for (CatalogEntry value : sinks) {
            this.sinks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The target tables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sinks <p>
     *            The target tables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPlanRequest withSinks(java.util.Collection<CatalogEntry> sinks) {
        setSinks(sinks);
        return this;
    }

    /**
     * <p>
     * The parameters for the mapping.
     * </p>
     *
     * @return <p>
     *         The parameters for the mapping.
     *         </p>
     */
    public Location getLocation() {
        return location;
    }

    /**
     * <p>
     * The parameters for the mapping.
     * </p>
     *
     * @param location <p>
     *            The parameters for the mapping.
     *            </p>
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * <p>
     * The parameters for the mapping.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The parameters for the mapping.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPlanRequest withLocation(Location location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The programming language of the code to perform the mapping.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PYTHON, SCALA
     *
     * @return <p>
     *         The programming language of the code to perform the mapping.
     *         </p>
     * @see Language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * <p>
     * The programming language of the code to perform the mapping.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PYTHON, SCALA
     *
     * @param language <p>
     *            The programming language of the code to perform the mapping.
     *            </p>
     * @see Language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The programming language of the code to perform the mapping.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PYTHON, SCALA
     *
     * @param language <p>
     *            The programming language of the code to perform the mapping.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Language
     */
    public GetPlanRequest withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * <p>
     * The programming language of the code to perform the mapping.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PYTHON, SCALA
     *
     * @param language <p>
     *            The programming language of the code to perform the mapping.
     *            </p>
     * @see Language
     */
    public void setLanguage(Language language) {
        this.language = language.toString();
    }

    /**
     * <p>
     * The programming language of the code to perform the mapping.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PYTHON, SCALA
     *
     * @param language <p>
     *            The programming language of the code to perform the mapping.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Language
     */
    public GetPlanRequest withLanguage(Language language) {
        this.language = language.toString();
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
        if (getMapping() != null)
            sb.append("Mapping: " + getMapping() + ",");
        if (getSource() != null)
            sb.append("Source: " + getSource() + ",");
        if (getSinks() != null)
            sb.append("Sinks: " + getSinks() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation() + ",");
        if (getLanguage() != null)
            sb.append("Language: " + getLanguage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMapping() == null) ? 0 : getMapping().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getSinks() == null) ? 0 : getSinks().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPlanRequest == false)
            return false;
        GetPlanRequest other = (GetPlanRequest) obj;

        if (other.getMapping() == null ^ this.getMapping() == null)
            return false;
        if (other.getMapping() != null && other.getMapping().equals(this.getMapping()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getSinks() == null ^ this.getSinks() == null)
            return false;
        if (other.getSinks() != null && other.getSinks().equals(this.getSinks()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        return true;
    }
}
