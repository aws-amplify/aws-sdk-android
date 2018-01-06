
package com.amazonaws.mobileconnectors.dynamodbv2.document;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ComparisonOperator;

import java.util.List;
import java.util.Map.Entry;

/**
 * Scan filter.
 */
public class ScanFilter extends Filter {

    protected ScanFilter() {
    }


    protected ScanFilter(ScanFilter baseFilter) {
        for (final Entry<String, FilterCondition> kvp : baseFilter.conditions.entrySet()) {
            final String key = kvp.getKey();
            final FilterCondition condition = kvp.getValue();

            addCondition(key, condition);
        }
    }

    /**
     * Adds a condition for a specified attribute that consists of an operator
     * and any number of AttributeValues.
     *
     * @param attributeName Target attribute name
     * @param op Comparison operator
     * @param values AttributeValues to compare to
     */
    public ScanFilter(String attributeName, ComparisonOperator op, List<AttributeValue> values) {
        addCondition(attributeName, op, values);
    }

    /**
     * Adds a condition for a specified attribute that consists of an operator
     * and any number of values
     *
     * @param attributeName Target attribute name
     * @param filterCondition the filter condition.
     */
    public ScanFilter(String attributeName, FilterCondition filterCondition) {
        addCondition(attributeName, filterCondition);
    }

}
