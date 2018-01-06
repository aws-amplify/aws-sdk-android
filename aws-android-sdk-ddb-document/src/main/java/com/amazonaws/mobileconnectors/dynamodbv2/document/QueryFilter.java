
package com.amazonaws.mobileconnectors.dynamodbv2.document;

import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.DynamoDBEntry;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ComparisonOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

/**
 * Query filter.
 */
public class QueryFilter extends Filter {

    protected QueryFilter() {
    }

    protected QueryFilter(QueryFilter baseFilter) {
        for (final Entry<String, FilterCondition> kvp : baseFilter.conditions.entrySet()) {
            final String key = kvp.getKey();
            final FilterCondition condition = kvp.getValue();

            addCondition(key, condition);
        }
    }

    /**
     * Constructs an instance of QueryFilter with a single condition. More
     * conditions can be added after initialization.
     *
     * @param attributeName the attribute name.
     * @param op the comparision operator. {@link ComparisonOperator}
     * @param values list of attribute values.
     */
    public QueryFilter(String attributeName, ComparisonOperator op, List<AttributeValue> values) {
        addCondition(attributeName, op, values);
    }

    /**
     * Constructor.
     *
     * @param attributeName the attribute name.
     * @param filterCondition the filter condition. see {@link FilterCondition}.
     */
    public QueryFilter(String attributeName, FilterCondition filterCondition) {
        addCondition(attributeName, filterCondition);
    }

    /**
     * Constructor.
     *
     * @param attributeName the attribute name.
     * @param op the comparision operator. {@link ComparisonOperator}
     * @param values list of attribute values.
     */
    public QueryFilter(String attributeName, ComparisonOperator op, DynamoDBEntry... values) {
        final List<AttributeValue> attributeValues = new ArrayList<AttributeValue>();
        for (final DynamoDBEntry entry : values) {
            attributeValues.add(entry.convertToAttributeValue());
        }
        addCondition(attributeName, op, attributeValues);
    }


}
