
package com.amazonaws.mobileconnectors.dynamodbv2.document;

import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.DynamoDBEntry;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ComparisonOperator;
import com.amazonaws.services.dynamodbv2.model.Condition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Query and Scan filter.
 */
public abstract class Filter {

    /**
     * Filter Conditions.
     */
    protected class FilterCondition {

        /**
         * The AttributeValues property.
         */
        private final List<AttributeValue> attributeValues;
        /**
         * The ComparisonOperator property.
         */
        private final ComparisonOperator comparisonOperator;

        /**
         * Constructor.
         *
         * @param comparisonOperator the comparison operator.
         * @param attributeValues the attribute values.
         */
        public FilterCondition(ComparisonOperator comparisonOperator,
                List<AttributeValue> attributeValues) {
            this.comparisonOperator = comparisonOperator;
            this.attributeValues = attributeValues;
        }

        /**
         * Converts the FilterCondition to the {@link Condition} object.
         *
         * @param attributeName the attribute name
         * @return {@link Condition} object
         */
        public Condition toCondition(String attributeName) {
            final Condition condition = new Condition().withAttributeValueList(attributeValues)
                    .withComparisonOperator(this.comparisonOperator);
            return condition;
        }
    }

    protected Map<String, FilterCondition> conditions = new HashMap<String, Filter.FilterCondition>();

    /**
     * Constructor.
     */
    public Filter() {
        this.conditions = new HashMap<String, Filter.FilterCondition>();
    }

    /**
     * adds a condition.
     *
     * @param attributeName the attribute name.
     * @param comparisonOperator the comparison operator.
     * @param attributeValues the attribute value.
     */
    public void addCondition(String attributeName, ComparisonOperator comparisonOperator,
            List<AttributeValue> attributeValues) {
        if (attributeValues == null) {
            throw new IllegalArgumentException("attribute values is null");
        }
        if (comparisonOperator == null) {
            throw new IllegalArgumentException("comparison operator is null");
        }

        this.conditions.put(attributeName,
                new FilterCondition(comparisonOperator, attributeValues));
    }

    /**
     * adds {@link FilterCondition} to specified attribute name.
     *
     * @param attributeName the name of the attribute.
     * @param filterCondition the filter condition. See {@link FilterCondition}.
     */
    public void addCondition(String attributeName, FilterCondition filterCondition) {
        this.conditions.put(attributeName, filterCondition);
    }

    protected static List<AttributeValue> convertToAttributeValues(DynamoDBEntry[] values) {
        final List<AttributeValue> attributes = new ArrayList<AttributeValue>();

        for (final DynamoDBEntry value : values) {
            final AttributeValue nativeValue = value.convertToAttributeValue();
            if (nativeValue != null) {
                attributes.add(nativeValue);
            }
        }
        return attributes;
    }

    /**
     * @return a map of name and {@link Condition}
     */
    public Map<String, Condition> toConditions() {
        final Map<String, Condition> dic = new HashMap<String, Condition>();
        for (final Entry<String, FilterCondition> kvp : this.conditions.entrySet()) {
            final String name = kvp.getKey();
            final FilterCondition fc = kvp.getValue();
            final Condition condition = fc.toCondition(name);

            dic.put(name, condition);
        }

        return dic;
    }

}
