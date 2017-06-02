
package com.amazonaws.mobileconnectors.dynamodbv2.document;

import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.Document;
import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.DynamoDBEntry;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.DeleteItemRequest;
import com.amazonaws.services.dynamodbv2.model.PutItemRequest;
import com.amazonaws.services.dynamodbv2.model.QueryRequest;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.UpdateItemRequest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * <p>
 * Expressions are used for conditional deletes and filtering for query and scan
 * operations.
 * </p>
 */
public class Expression {

    protected boolean isSet() {
        return this.expressionStatement != null;
    }

    /**
     * <p>
     * Gets and sets the property ExpressionStatement. "Price > :price" is an
     * example expression statement. :price is a variable which gets its value
     * from the ExpressionAttributeValues collection. If this is used for
     * deletes then it prevents the delete from happening if the Price attribute
     * on the item is less then the passed in price. For query and scan it will
     * only return back items where the Price attribute is greater then passed
     * in price.
     * </p>
     */
    private String expressionStatement;

    /**
     * <p>
     * This collection contains attribute names from the item that should be
     * substituted in the expression when it is evaluated. For example the
     * expression "#C &lt; #U" will expect the attribute names to be added to
     * this collection. <code>
     * expression.ExpressionAttributeNames["#C"] = "CriticRating"
     * expression.ExpressionAttributeNames["#U"] = "UserRating"
     * </code>
     * </p>
     */
    private final Map<String, String> expressionAttributeNames = new HashMap<String, String>();

    /**
     * Adds expression attributes.
     *
     * @param key the attribute name.
     * @param value the atttribute value.
     */
    public void addExpressionAttributeNames(String key, String value) {
        this.expressionAttributeNames.put(key, value);
    }

    /**
     * Adds expression attributes.
     *
     * @param key the attribute name.
     * @param value the atttribute value.
     * @return {@link Expression}.
     */
    public Expression withExpressionAttibuteNames(String key, String value) {
        addExpressionAttributeNames(key, value);
        return this;
    }

    /**
     * <p>
     * Gets and sets the property ExpressionAttributeValues. This collection
     * contains the values to be substituted in the expression. For example the
     * expression "Price > :price" will contain one entry in this collection a
     * key of ":price".
     * <p>
     * DynamoDBEntry contains many common implicit cast operations so assignment
     * can be done with the basic .NET types. In the price example shown above
     * the value to be used for the expression can be provided using the
     * following code snippet: <code>
     * expression.ExpressionAttributeNames[":price"] = 3.99;
     * </code>
     * </p>
     * </p>
     */
    private final Map<String, DynamoDBEntry> expressionAttributeValues = new HashMap<String, DynamoDBEntry>();

    /**
     * Adds expression attribute values.
     *
     * @param key the expression attribute name.
     * @param value the expression attribute value.
     */
    public void addExpressionAttributeValues(String key, DynamoDBEntry value) {
        this.expressionAttributeValues.put(key, value);
    }

    /**
     * Adds expression attribute values.
     *
     * @param key the expression attribute name.
     * @param value the expression attribute value.
     * @return {@link Expression}.
     */
    public Expression withExpressionAttibuteValues(String key, DynamoDBEntry value) {
        addExpressionAttributeValues(key, value);
        return this;
    }

    protected void applyExpression(ScanRequest request, Table table) {
        request.setFilterExpression(this.expressionStatement);
        if (this.expressionAttributeNames != null && !this.expressionAttributeNames.isEmpty()) {
            request.setExpressionAttributeNames(new HashMap<String, String>(
                    this.expressionAttributeNames));
        }
        request.setExpressionAttributeValues(convertToAttributeValues(
                this.expressionAttributeValues, table));
    }

    protected void applyExpression(DeleteItemRequest request, Table table) {
        request.setConditionExpression(this.expressionStatement);
        if (this.expressionAttributeNames != null && !this.expressionAttributeNames.isEmpty()) {
            request.setExpressionAttributeNames(
                    new HashMap<String, String>(this.expressionAttributeNames));
        }
        request.setExpressionAttributeValues(
                convertToAttributeValues(this.expressionAttributeValues, table));
    }

    protected void applyExpression(PutItemRequest request, Table table) {
        request.setConditionExpression(this.expressionStatement);
        if (this.expressionAttributeNames != null && !this.expressionAttributeNames.isEmpty()) {
            request.setExpressionAttributeNames(
                    new HashMap<String, String>(this.expressionAttributeNames));
        }
        request.setExpressionAttributeValues(
                convertToAttributeValues(this.expressionAttributeValues, table));
    }

    protected void applyExpression(UpdateItemRequest request, Table table) {
        request.setConditionExpression(this.expressionStatement);
        if (this.expressionAttributeNames != null && !this.expressionAttributeNames.isEmpty()) {
            request.setExpressionAttributeNames(
                    new HashMap<String, String>(this.expressionAttributeNames));
        }
        request.setExpressionAttributeValues(
                convertToAttributeValues(this.expressionAttributeValues, table));
    }

    protected static void applyExpression(QueryRequest request, Table table,
            Expression keyExpression, Expression filterExpression) {
        if (keyExpression == null) {
            keyExpression = new Expression();
        }
        if (filterExpression == null) {
            filterExpression = new Expression();
        }

        if (!keyExpression.isSet() && !filterExpression.isSet()) {
            return;
        }

        if (keyExpression.isSet()) {
            request.setKeyConditionExpression(keyExpression.expressionStatement);
        }
        if (filterExpression.isSet()) {
            request.setFilterExpression(filterExpression.expressionStatement);
        }

        final Map<String, String> keyExpressionAtrtibuteNames = keyExpression.expressionAttributeNames;
        final Map<String, String> filterExpressionAttributeNames = filterExpression.expressionAttributeNames;

        final Map<String, String> combinedExpressionAttributeNames = new HashMap<String, String>();
        combinedExpressionAttributeNames.putAll(keyExpressionAtrtibuteNames);
        combinedExpressionAttributeNames.putAll(filterExpressionAttributeNames);

        if (!combinedExpressionAttributeNames.isEmpty()) {
            request.setExpressionAttributeNames(combinedExpressionAttributeNames);
        }

        final Map<String, DynamoDBEntry> keyExpressionAttributeValues = new Document(
                keyExpression.expressionAttributeValues);
        final Map<String, DynamoDBEntry> filterExpressionAttributeValues = new Document(
                filterExpression.expressionAttributeValues);

        final Map<String, DynamoDBEntry> combinedKeyExpressionAttributeValues = new Document(
                keyExpressionAttributeValues);
        combinedKeyExpressionAttributeValues.putAll(filterExpressionAttributeValues);

        request.setExpressionAttributeValues(
                convertToAttributeValues(combinedKeyExpressionAttributeValues, table));
    }

    protected static Map<String, AttributeValue> convertToAttributeValues(
            Map<String, DynamoDBEntry> valueMap, Table table) {
        final Map<String, AttributeValue> convertedValues = new HashMap<String, AttributeValue>();
        if (valueMap != null) {
            for (final Entry<String, DynamoDBEntry> kvp : valueMap.entrySet()) {
                final String attributeName = kvp.getKey();
                final DynamoDBEntry entry = kvp.getValue();

                if (entry == null) {
                    convertedValues.put(attributeName, new AttributeValue().withNULL(true));
                } else {
                    convertedValues.put(attributeName, entry.convertToAttributeValue());
                }
            }
        }

        return convertedValues;
    }

    public String getExpressionStatement() {
        return expressionStatement;
    }

    public void setExpressionStatement(String expressionStatement) {
        this.expressionStatement = expressionStatement;
    }
}
