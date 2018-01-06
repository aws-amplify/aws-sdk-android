
package com.amazonaws.mobileconnectors.dynamodbv2.document;

import com.amazonaws.mobileconnectors.dynamodbv2.document.datatype.Document;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.Condition;
import com.amazonaws.services.dynamodbv2.model.ConditionalOperator;
import com.amazonaws.services.dynamodbv2.model.GlobalSecondaryIndexDescription;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.LocalSecondaryIndexDescription;
import com.amazonaws.services.dynamodbv2.model.QueryRequest;
import com.amazonaws.services.dynamodbv2.model.QueryResult;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.ScanResult;
import com.amazonaws.services.dynamodbv2.model.Select;
import com.amazonaws.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Search response object.
 */
@SuppressWarnings("checkstyle:hiddenfield")
public class Search {

    /**
     * The type of search operation.
     */
    public enum SearchType {

        /**
         * Query Operation.
         */
        QUERY("QUERY"),
        /**
         * Scan Operation.
         */
        SCAN("SCAN");

        private final String type;

        private SearchType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return this.type;
        }
    }

    private Table table;

    /**
     * Name of the table being searched
     */
    private String tableName;

    /**
     * Whether to collect GetNextSet and GetRemaining results in Matches
     * property. Default is true. If set to false, Matches will always be empty.
     */
    private boolean collectResults = true;

    /**
     * Upper limit on the number of items returned. For Queries: upper limit on
     * the number of items returned. For Scan: limit on the number of items
     * scanned. Maps directly to Limit property on Query and Scan operations.
     */
    private int limit = 1;

    /**
     * <p>
     * The key expression that is evaluated for each item of a query. This
     * applies only to Query operations.
     * </p>
     */
    private Expression keyExpression;

    /**
     * <p>
     * The filter expression that is evaluated for each item. This applies to
     * Query and Scan operations.
     * </p>
     */
    private Expression filterExpression;

    /**
     * Filter for the search operation This applies to Query and Scan
     * operations.
     */
    private Filter filter;

    /**
     * Conditional operator for the search operation
     */
    private ConditionalOperator conditionalOperator;

    /**
     * List of attribute names to retrieve
     */
    private List<String> attributesToGet;

    /**
     * Flag that, if true, indicates that the search is operating in
     * consistent-read mode
     */
    private boolean isConsistentRead;

    /**
     * Flag that, if true, indicates that the search is traversing backwards
     */
    private boolean isBackwardSearch;

    /**
     * Flag that, if true, indicates that the search is done
     */
    private boolean isDone = false;

    /**
     * Key denoting the starting point of the next set of results
     */
    private Map<String, AttributeValue> nextKey;

    /**
     * List of currently found items
     */
    private final List<Document> matches = new ArrayList<Document>();

    /**
     * <p>
     * For parallel <i>Scan</i> requests, <i>TotalSegments</i>represents the
     * total number of segments for a table that is being scanned. Segments are
     * a way to logically divide a table into equally sized portions, for the
     * duration of the <i>Scan</i> request. The value of <i>TotalSegments</i>
     * corresponds to the number of application "workers" (such as threads or
     * processes) that will perform the parallel <i>Scan</i>. For example, if
     * you want to scan a table using four application threads, you would
     * specify a <i>TotalSegments</i> value of 4. The value for
     * <i>TotalSegments</i> must be greater than or equal to 1, and less than or
     * equal to 4096. If you specify a <i>TotalSegments</i> value of 1, the
     * <i>Scan</i> will be sequential rather than parallel. If you specify
     * <i>TotalSegments</i>, you must also specify <i>Segment</i>.
     * <p>
     * <b>Constraints:</b>
     * <ul>
     * <li><term>Range</li>
     * <li>1 - 4096</li>
     * </ul>
     * </p>
     * </p>
     */
    private int totalSegments;

    /**
     * <p>
     * For parallel <i>Scan</i> requests, <i>Segment</i> identifies an
     * individual segment to be scanned by an application "worker" (such as a
     * thread or a process). Each worker issues a <i>Scan</i> request with a
     * distinct value for the segment it will scan. Segment IDs are zero-based,
     * so the first segment is always 0. For example, if you want to scan a
     * table using four application threads, the first thread would specify a
     * <i>Segment</i> value of 0, the second thread would specify 1, and so on.
     * LastEvaluatedKey returned from a parallel scan request must be used with
     * same Segment id in a subsequent operation. The value for <i>Segment</i>
     * must be less than or equal to 0, and less than the value provided for
     * <i>TotalSegments</i>.
     * </p>
     */
    private int segment;

    /**
     * <p>
     * Gets the total number of items that match the search parameters. If
     * IsDone is true and CollectResults is true, returns Matches.Count.
     * Otherwise, makes a call to DynamoDB to find out the number of matching
     * items, without retrieving the items. Count is then cached.
     * </p>
     */
    private int count = -1;

    /**
     * Name of the index to query or scan against.
     */
    private String indexName;

    /**
     * Enum specifying what data to return from query.
     */
    private Select select;

    private final SearchType searchType;

    protected Search(SearchType searchType) {
        this.searchType = searchType;
    }

    protected Search() {
        this.searchType = SearchType.QUERY;
    }

    protected Search withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    protected Search withCollectResults(boolean collectResults) {
        this.collectResults = collectResults;
        return this;
    }

    protected Search withLimit(int limit) {
        this.limit = limit;
        return this;
    }

    protected Search withKeyExpression(Expression keyExpression) {
        this.keyExpression = keyExpression;
        return this;
    }

    protected Search withFilterExpression(Expression filterExpression) {
        this.filterExpression = filterExpression;
        return this;
    }

    protected Search withFilter(Filter filter) {
        this.filter = filter;
        return this;
    }

    protected Search withConditionalOperator(ConditionalOperator conditionalOperator) {
        this.conditionalOperator = conditionalOperator;
        return this;
    }

    protected Search withAttributesToGet(List<String> attributesToGet) {
        this.attributesToGet = attributesToGet;
        return this;
    }

    protected Search withIsConsistentRead(boolean isConsistentRead) {
        this.isConsistentRead = isConsistentRead;
        return this;
    }

    protected Search withIsBackwardSearch(boolean isBackwardSearch) {
        this.isBackwardSearch = isBackwardSearch;
        return this;
    }

    protected Search withNextKey(Map<String, AttributeValue> nextKey) {
        this.nextKey = nextKey;
        return this;
    }

    protected Search withTotalSegments(int totalSegments) {
        this.totalSegments = totalSegments;
        return this;
    }

    protected Search withSegment(int segment) {
        this.segment = segment;
        return this;
    }

    protected Search withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    protected Search withSelect(Select select) {
        this.select = select;
        return this;
    }

    protected Search withTable(Table table) {
        this.table = table;
        return this;
    }

    /**
     * @return paginated list of {@link Document}
     */
    public List<Document> getNextResultSet() {
        switch (this.searchType) {
            case QUERY:
                return getNextQueryResultSet();
            case SCAN:
                return getNextScanResultSet();
            default:
                throw new IllegalStateException("search type other than scan or query");
        }
    }

    private List<Document> getNextScanResultSet() {
        final List<Document> returnValue = new ArrayList<Document>();
        final ScanRequest request = new ScanRequest();
        request.withExclusiveStartKey(nextKey)
                .withAttributesToGet(attributesToGet)
                .withLimit(limit)
                .withTableName(tableName)
                .withConsistentRead(isConsistentRead);

        if (select != null) {
            request.withSelect(select);
        }

        if (this.filter != null) {
            request.withScanFilter(this.filter.toConditions());
        }

        if (!StringUtils.isBlank(this.indexName)) {
            request.withIndexName(indexName);
        }

        if (this.filterExpression != null && this.filterExpression.isSet()) {
            this.filterExpression.applyExpression(request, table);
        }

        if (request.getScanFilter() != null && request.getScanFilter().size() > 1) {
            request.setConditionalOperator(this.conditionalOperator);
        }

        if (this.totalSegments != 0) {
            request.withTotalSegments(totalSegments)
                    .withSegment(segment);
        }

        Table.appendDynamoDBDocumentUserAgentString(request);

        final ScanResult result = table.getClient().scan(request);
        for (final Map<String, AttributeValue> item : result.getItems()) {
            final Document doc = Document.fromAttributeMap(item);
            returnValue.add(doc);
            if (this.collectResults) {
                this.matches.add(doc);
            }
        }
        nextKey = result.getLastEvaluatedKey();
        if (nextKey == null || nextKey.size() == 0) {
            isDone = true;
        }

        return returnValue;
    }

    private List<Document> getNextQueryResultSet() {
        final List<Document> returnValue = new ArrayList<Document>();
        final QueryRequest request = new QueryRequest();

        request.withExclusiveStartKey(nextKey)
                .withAttributesToGet(attributesToGet)
                .withLimit(limit)
                .withTableName(tableName)
                .withConsistentRead(isConsistentRead)
                .withIndexName(this.indexName);

        if (select != null) {
            request.withSelect(select);
        }

        Expression.applyExpression(request, table, keyExpression, filterExpression);

        if (this.filter != null) {
            final Map<String, Condition> keyConditions = getKeyConditions((QueryFilter) this.filter,
                    request.getIndexName());
            final Map<String, Condition> filterConditions = getFilterConditions(
                    (QueryFilter) this.filter,
                    request.getIndexName());
            if (!keyConditions.isEmpty()) {
                request.withKeyConditions(keyConditions);
            }
            if (!filterConditions.isEmpty()) {
                request.withQueryFilter(filterConditions);
            }
        } else {
            request.withKeyConditions(null).withQueryFilter(null);
        }

        if (request.getQueryFilter() != null && request.getQueryFilter().size() > 1) {
            request.withConditionalOperator(this.conditionalOperator);
        } else {
            request.withConditionalOperator((String) null);
        }

        Table.appendDynamoDBDocumentUserAgentString(request);

        final QueryResult result = table.getClient().query(request);
        for (final Map<String, AttributeValue> item : result.getItems()) {
            final Document doc = Document.fromAttributeMap(item);
            returnValue.add(doc);
            if (this.collectResults) {
                this.matches.add(doc);
            }
        }
        nextKey = result.getLastEvaluatedKey();
        if (nextKey == null || nextKey.size() == 0) {
            isDone = true;
        }

        return returnValue;
    }

    /**
     * @return complete list of {@link Document}
     */
    public List<Document> getAllResults() {
        final List<Document> returnValue = new ArrayList<Document>();

        while (!this.isDone) {
            returnValue.addAll(getNextResultSet());
        }

        return returnValue;
    }

    private Map<String, Condition> getKeyConditions(QueryFilter filter, String indexName) {
        final Map<String, Condition> keyConditions = new HashMap<String, Condition>();
        final Map<String, Condition> conditions = filter.toConditions();
        for (final Entry<String, Condition> entry : conditions.entrySet()) {
            final String attributeName = entry.getKey();
            final Condition condition = entry.getValue();
            if (isKeyAttribute(table, indexName, attributeName)) {
                keyConditions.put(attributeName, condition);
            }
        }

        return keyConditions;
    }

    private Map<String, Condition> getFilterConditions(QueryFilter filter, String indexName) {
        final Map<String, Condition> filterConditions = new HashMap<String, Condition>();
        final Map<String, Condition> conditions = filter.toConditions();
        for (final Entry<String, Condition> entry : conditions.entrySet()) {
            final String attributeName = entry.getKey();
            final Condition condition = entry.getValue();
            if (!isKeyAttribute(table, indexName, attributeName)) {
                filterConditions.put(attributeName, condition);
            }
        }

        return filterConditions;
    }

    private static boolean isKeyAttribute(Table table, String indexName, String attributeName) {
        GlobalSecondaryIndexDescription gsi = null;
        final LocalSecondaryIndexDescription lsi;

        if (StringUtils.isBlank(indexName)) {
            return table.getKeys().containsKey(attributeName);
        } else if (table.getGlobalSecondaryIndexes().get(indexName) != null) {
            gsi = table.getGlobalSecondaryIndexes().get(indexName);
            for (final KeySchemaElement element : gsi.getKeySchema()) {
                return isKeyAttribute(element, attributeName);
            }
        } else if (table.getLocalSecondaryIndexes().get(indexName) != null) {
            lsi = table.getLocalSecondaryIndexes().get(indexName);
            for (final KeySchemaElement element : lsi.getKeySchema()) {
                return isKeyAttribute(element, attributeName);
            }
        } else {
            throw new IllegalStateException(String.format(
                    "Unable to locate index %s on table %s", indexName, table.getTableName()));
        }

        return false;
    }

    private static boolean isKeyAttribute(KeySchemaElement element, String attributeName) {
        return element.getAttributeName().equals(attributeName);
    }

    /**
     * Gets the count of the search result.
     *
     * @return count.
     */
    public int getCount() {
        if (isDone && this.collectResults) {
            return this.matches.size();
        } else {
            if (count != -1) {
                return count;
            } else {
                switch (searchType) {
                    case SCAN: {
                        final ScanRequest request = new ScanRequest();
                        request.withExclusiveStartKey(nextKey)
                                .withTableName(tableName)
                                .withScanFilter(this.filter.toConditions())
                                .withSelect(Select.COUNT)
                                .withConsistentRead(isConsistentRead);

                        if (!StringUtils.isBlank(this.indexName)) {
                            request.withIndexName(indexName);
                        }

                        if (this.filterExpression != null && this.filterExpression.isSet()) {
                            this.filterExpression.applyExpression(request, table);
                        }

                        if (request.getScanFilter() != null && request.getScanFilter().size() > 1) {
                            request.setConditionalOperator(this.conditionalOperator);
                        }

                        if (this.totalSegments != 0) {
                            request.withTotalSegments(totalSegments)
                                    .withSegment(segment);
                        }

                        Table.appendDynamoDBDocumentUserAgentString(request);
                        final ScanResult result = table.getClient().scan(request);
                        count = this.matches.size() + result.getCount();
                        return count;
                    }
                    case QUERY: {
                        final QueryRequest request = new QueryRequest();
                        request.withExclusiveStartKey(nextKey)
                                .withTableName(tableName)
                                .withSelect(Select.COUNT)
                                .withConsistentRead(isConsistentRead)
                                .withIndexName(this.indexName);

                        Expression.applyExpression(request, table, keyExpression, filterExpression);

                        final Map<String, Condition> keyConditions = getKeyConditions(
                                (QueryFilter) this.filter,
                                request.getIndexName());
                        final Map<String, Condition> filterConditions = getFilterConditions(
                                (QueryFilter) this.filter,
                                request.getIndexName());
                        request.withKeyConditions(keyConditions).withQueryFilter(filterConditions);

                        if (request.getQueryFilter() != null
                                && request.getQueryFilter().size() > 1) {
                            request.withConditionalOperator(this.conditionalOperator);
                        }

                        Table.appendDynamoDBDocumentUserAgentString(request);

                        final QueryResult result = table.getClient().query(request);
                        count = this.matches.size() + result.getCount();
                        return count;
                    }
                    default: {
                        throw new IllegalStateException("search type other than scan or query");
                    }
                }
            }
        }
    }

}
