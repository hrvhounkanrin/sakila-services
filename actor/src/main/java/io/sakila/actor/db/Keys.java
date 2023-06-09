/*
 * This file is generated by jOOQ.
 */
package io.sakila.actor.db;


import io.sakila.actor.db.tables.Actor;
import io.sakila.actor.db.tables.FlywaySchemaHistory;
import io.sakila.actor.db.tables.records.ActorRecord;
import io.sakila.actor.db.tables.records.FlywaySchemaHistoryRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ActorRecord> ACTOR_PKEY = Internal.createUniqueKey(Actor.ACTOR, DSL.name("actor_pkey"), new TableField[] { Actor.ACTOR.ACTOR_ID }, true);
    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, DSL.name("flyway_schema_history_pk"), new TableField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
}
