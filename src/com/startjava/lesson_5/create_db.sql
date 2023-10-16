\c robots;

DROP TABLE IF EXISTS jaegers;

CREATE TABLE jaegers (
    id          SERIAL PRIMARY KEY,
    model_name  VARCHAR(30),
    mark        SMALLINT,
    height      NUMERIC(4,2),
    weight      NUMERIC(5,3),
    status      VARCHAR(10),
    origin      VARCHAR(30),
    launch      DATE,
    kaiju_kill  SMALLINT
);

\ir 'init_db.sql'
\ir 'queries.sql'
