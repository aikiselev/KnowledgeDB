# --- First database schema

# --- !Ups

-- Table: "Section"

CREATE TABLE "Section"
(
  "isRoot" boolean NOT NULL,
  "itemNumber" integer NOT NULL,
  id uuid NOT NULL,
  "shortName" character varying(128) NOT NULL,
  "parentID" uuid NOT NULL,
  "longName" character varying(128) NOT NULL
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Section"
  OWNER TO postgres;

-- Index: idx152f03d0

CREATE UNIQUE INDEX idx152f03d0
  ON "Section"
  USING btree
  (id);

-- Table: "Article"

CREATE TABLE "Article"
(
  "itemNumber" integer NOT NULL,
  text text NOT NULL,
  id uuid NOT NULL,
  "sectionID" uuid NOT NULL,
  "shortName" character varying(128) NOT NULL,
  "longName" character varying(128) NOT NULL,
  CONSTRAINT "ArticleFK1" FOREIGN KEY ("sectionID")
      REFERENCES "Section" (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Article"
  OWNER TO postgres;

-- Index: idx14d403bf

CREATE UNIQUE INDEX idx14d403bf
  ON "Article"
  USING btree
  (id);

CREATE TABLE "XmlImported"
(
  was boolean NOT NULL
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "XmlImported"
  OWNER TO postgres;

# --- !Downs
