package liquibase.ext.metastore.impala.statement;

import liquibase.statement.AbstractSqlStatement;

public class RefreshTableStatement extends AbstractSqlStatement {
    private String catalogName;
    private String schemaName;
    private String tableName;

    public RefreshTableStatement(String catalogName, String schemaName, String tableName) {
        this.catalogName = catalogName;
        this.schemaName = schemaName;
        this.tableName = tableName;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public String getTableName() {
        return tableName;
    }
}
