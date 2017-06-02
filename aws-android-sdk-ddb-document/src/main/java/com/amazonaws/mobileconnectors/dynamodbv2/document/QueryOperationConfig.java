
package com.amazonaws.mobileconnectors.dynamodbv2.document;

import com.amazonaws.services.dynamodbv2.model.ConditionalOperator;
import com.amazonaws.services.dynamodbv2.model.Select;

import java.util.List;

/**
 * Configuration for the Table.Query operation
 */
public class QueryOperationConfig {

    /**
     * The key expression that is evaluated for each item. Only items that pass
     * the expression are returned. Both KeyExpression and FilterExpression
     * contain ExpressionAttributeNames and ExpressionAttributeValues. Attribute
     * names or values can be added to either expression and can be referenced
     * in either expression statement. Conflicting attribute names or values
     * will lead to an exception being thrown.
     */
    private Expression keyExpression;

    /**
     * The expression that is evaluated for each item. Only items that pass the
     * expression are returned. Both KeyExpression and FilterExpression contain
     * ExpressionAttributeNames and ExpressionAttributeValues. Attribute names
     * or values can be added to either expression and can be referenced in
     * either expression statement. Conflicting attribute names or values will
     * lead to an exception being thrown.
     */
    private Expression filterExpression;

    /**
     * Filter for the search operation
     */
    private QueryFilter filter;

    /**
     * If set to true, this flag ensures that the most recently written data is
     * returned.
     */
    private boolean consistentRead;

    /**
     * List of attributes to retrieve as part of the search
     */
    private List<String> attributesToGet;

    /**
     * Upper limit on the number of items to return per request
     */
    private int limit;

    /**
     * Flag that signals if the search is traversing backwards
     */
    private boolean backwardSearch;

    /**
     * Name of the index to query against.
     */
    private String indexName;

    /**
     * Enum specifying what data to return from query.
     */
    private Select select;

    /**
     * Whether to collect GetNextSet and GetRemaining results in Matches
     * property. Default is true. If set to false, Matches will always be empty.
     */
    private boolean collectResults;

    /**
     * A logical operator to apply to the conditions in the Filter property: AND
     * - If all of the conditions evaluate to true, then the entire filter
     * evaluates to true. OR - If at least one of the conditions evaluate to
     * true, then the entire filter evaluates to true. Default value is AND.
     */
    private ConditionalOperator conditionalOperator;

    /**
     * Set key expression.
     *
     * @param keyExpression the key expression. see {@link Expression}.
     * @return current instance of {@link QueryOperationConfig}.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public QueryOperationConfig withKeyExpression(Expression keyExpression) {
        this.keyExpression = keyExpression;
        return this;
    }

    /**
     * Set filter expression.
     *
     * @param filterExpression the filter expression. see {@link Expression}.
     * @return current instance of {@link QueryOperationConfig}.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public QueryOperationConfig withFilterExpression(Expression filterExpression) {
        this.filterExpression = filterExpression;
        return this;
    }

    /**
     * Set Query Filter.
     *
     * @param filter the QueryFilter expression. see {@link QueryFilter}.
     * @return current instance of {@link QueryOperationConfig}.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public QueryOperationConfig withFilter(QueryFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Set Consistent Read.
     *
     * @param consistentRead flag indicating if reads are consistent. see
     *            {@link consistentRead}.
     * @return current instance of {@link QueryOperationConfig}.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public QueryOperationConfig withConsistentRead(boolean consistentRead) {
        this.consistentRead = consistentRead;
        return this;
    }

    /**
     * Set attributes to get.
     *
     * @param attributesToGet the list of attributes to get.
     * @return current instance of {@link QueryOperationConfig}.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public QueryOperationConfig withAttributesToGet(List<String> attributesToGet) {
        this.attributesToGet = attributesToGet;
        return this;
    }

    /**
     * The pagination size.
     *
     * @param limit the pagination limit.
     * @return current instance of {@link QueryOperationConfig}.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public QueryOperationConfig withLimit(int limit) {
        this.limit = limit;
        return this;
    }

    /**
     * param to search the query in descending order.
     *
     * @param backwardSearch flag to set descending order.
     * @return current instance of {@link QueryOperationConfig}.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public QueryOperationConfig withBackwardSearch(boolean backwardSearch) {
        this.backwardSearch = backwardSearch;
        return this;
    }

    /**
     * Name of the index to query.
     *
     * @param indexName the index name.
     * @return current instance of {@link QueryOperationConfig}.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public QueryOperationConfig withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * Attributes to select.
     *
     * @param select {@link Select}.
     * @return current instance of {@link QueryOperationConfig}.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public QueryOperationConfig withSelect(Select select) {
        this.select = select;
        return this;
    }

    /**
     * Whether to collect GetNextSet and GetRemaining results in Matches
     * property. Default is true. If set to false, Matches will always be empty.
     *
     * @param collectResults Whether to collect GetNextSet and GetRemaining
     *            results in Matches property
     * @return current instance of {@link QueryOperationConfig}.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public QueryOperationConfig withCollectResults(boolean collectResults) {
        this.collectResults = collectResults;
        return this;
    }

    /**
     * A logical operator to apply to the conditions in the Filter property: AND
     * - If all of the conditions evaluate to true, then the entire filter
     * evaluates to true. OR - If at least one of the conditions evaluate to
     * true, then the entire filter evaluates to true. Default value is AND.
     *
     * @param conditionalOperator the Conditional operator. see
     *            {@link ConditionalOperator}.
     * @return current instance of {@link QueryOperationConfig}.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public QueryOperationConfig withConditionalOperator(
            ConditionalOperator conditionalOperator) {
        this.conditionalOperator = conditionalOperator;
        return this;
    }

    protected Expression getKeyExpression() {
        return keyExpression;
    }

    protected Expression getFilterExpression() {
        return filterExpression;
    }

    protected QueryFilter getFilter() {
        return filter;
    }

    protected boolean isConsistentRead() {
        return consistentRead;
    }

    protected List<String> getAttributesToGet() {
        return attributesToGet;
    }

    protected int getLimit() {
        return limit;
    }

    protected boolean isBackwardSearch() {
        return backwardSearch;
    }

    protected String getIndexName() {
        return indexName;
    }

    protected Select getSelect() {
        return select;
    }

    protected boolean isCollectResults() {
        return collectResults;
    }

    protected ConditionalOperator getConditionalOperator() {
        return conditionalOperator;
    }

}
