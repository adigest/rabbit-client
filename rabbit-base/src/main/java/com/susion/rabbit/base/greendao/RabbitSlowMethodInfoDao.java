package com.susion.rabbit.base.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.susion.rabbit.base.entities.RabbitSlowMethodInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "RABBIT_SLOW_METHOD_INFO".
*/
public class RabbitSlowMethodInfoDao extends AbstractDao<RabbitSlowMethodInfo, Long> {

    public static final String TABLENAME = "RABBIT_SLOW_METHOD_INFO";

    /**
     * Properties of entity RabbitSlowMethodInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Time = new Property(1, Long.class, "time", false, "TIME");
        public final static Property PkgName = new Property(2, String.class, "pkgName", false, "PKG_NAME");
        public final static Property ClassName = new Property(3, String.class, "className", false, "CLASS_NAME");
        public final static Property MethodName = new Property(4, String.class, "methodName", false, "METHOD_NAME");
        public final static Property CostTimeMs = new Property(5, Long.class, "costTimeMs", false, "COST_TIME_MS");
    }


    public RabbitSlowMethodInfoDao(DaoConfig config) {
        super(config);
    }
    
    public RabbitSlowMethodInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"RABBIT_SLOW_METHOD_INFO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"TIME\" INTEGER," + // 1: time
                "\"PKG_NAME\" TEXT," + // 2: pkgName
                "\"CLASS_NAME\" TEXT," + // 3: className
                "\"METHOD_NAME\" TEXT," + // 4: methodName
                "\"COST_TIME_MS\" INTEGER);"); // 5: costTimeMs
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"RABBIT_SLOW_METHOD_INFO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, RabbitSlowMethodInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long time = entity.getTime();
        if (time != null) {
            stmt.bindLong(2, time);
        }
 
        String pkgName = entity.getPkgName();
        if (pkgName != null) {
            stmt.bindString(3, pkgName);
        }
 
        String className = entity.getClassName();
        if (className != null) {
            stmt.bindString(4, className);
        }
 
        String methodName = entity.getMethodName();
        if (methodName != null) {
            stmt.bindString(5, methodName);
        }
 
        Long costTimeMs = entity.getCostTimeMs();
        if (costTimeMs != null) {
            stmt.bindLong(6, costTimeMs);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, RabbitSlowMethodInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long time = entity.getTime();
        if (time != null) {
            stmt.bindLong(2, time);
        }
 
        String pkgName = entity.getPkgName();
        if (pkgName != null) {
            stmt.bindString(3, pkgName);
        }
 
        String className = entity.getClassName();
        if (className != null) {
            stmt.bindString(4, className);
        }
 
        String methodName = entity.getMethodName();
        if (methodName != null) {
            stmt.bindString(5, methodName);
        }
 
        Long costTimeMs = entity.getCostTimeMs();
        if (costTimeMs != null) {
            stmt.bindLong(6, costTimeMs);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public RabbitSlowMethodInfo readEntity(Cursor cursor, int offset) {
        RabbitSlowMethodInfo entity = new RabbitSlowMethodInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // time
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // pkgName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // className
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // methodName
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5) // costTimeMs
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, RabbitSlowMethodInfo entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTime(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setPkgName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setClassName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setMethodName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setCostTimeMs(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(RabbitSlowMethodInfo entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(RabbitSlowMethodInfo entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(RabbitSlowMethodInfo entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
