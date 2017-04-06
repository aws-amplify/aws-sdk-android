/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * A filter name and value pair that is used to return a more specific
 * list of results. Filters can be used to match a set of resources by
 * various criteria, such as tags, attributes, or IDs.
 * </p>
 */
public class Filter implements Serializable {

    /**
     * The name of the filter. Filter names are case-sensitive.
     */
    private String name;

    /**
     * One or more filter values. Filter values are case-sensitive.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> values;

    /**
     * Default constructor for a new Filter object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Filter() {}
    
    /**
     * Constructs a new Filter object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name The name of the filter. Filter names are case-sensitive.
     * @param values One or more filter values. Filter values are
     * case-sensitive.
     */
    public Filter(String name, java.util.List<String> values) {
        setName(name);
        setValues(values);
    }

    /**
     * Constructs a new Filter object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name The name of the filter. Filter names are case-sensitive.
     */
    public Filter(String name) {
        setName(name);
    }

    /**
     * The name of the filter. Filter names are case-sensitive.
     *
     * @return The name of the filter. Filter names are case-sensitive.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the filter. Filter names are case-sensitive.
     *
     * @param name The name of the filter. Filter names are case-sensitive.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the filter. Filter names are case-sensitive.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the filter. Filter names are case-sensitive.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Filter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * One or more filter values. Filter values are case-sensitive.
     *
     * @return One or more filter values. Filter values are case-sensitive.
     */
    public java.util.List<String> getValues() {
        if (values == null) {
              values = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              values.setAutoConstruct(true);
        }
        return values;
    }
    
    /**
     * One or more filter values. Filter values are case-sensitive.
     *
     * @param values One or more filter values. Filter values are case-sensitive.
     */
    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> valuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(values.size());
        valuesCopy.addAll(values);
        this.values = valuesCopy;
    }
    
    /**
     * One or more filter values. Filter values are case-sensitive.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values One or more filter values. Filter values are case-sensitive.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Filter withValues(String... values) {
        if (getValues() == null) setValues(new java.util.ArrayList<String>(values.length));
        for (String value : values) {
            getValues().add(value);
        }
        return this;
    }
    
    /**
     * One or more filter values. Filter values are case-sensitive.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values One or more filter values. Filter values are case-sensitive.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Filter withValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> valuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(values.size());
            valuesCopy.addAll(values);
            this.values = valuesCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getValues() != null) sb.append("Values: " + getValues() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Filter == false) return false;
        Filter other = (Filter)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getValues() == null ^ this.getValues() == null) return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false) return false; 
        return true;
    }
    
}
    