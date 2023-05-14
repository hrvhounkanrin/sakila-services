CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
--
-- Name: actor; Type: TABLE; Schema: public; Owner: postgres; Tablespace:
--

CREATE TABLE actor (
   actor_id uuid NOT NULL PRIMARY KEY,
   first_name character varying(45) NOT NULL,
   last_name character varying(45) NOT NULL,
   email character varying(50) NOT NULL,
   phone_number character varying(20) NULL,
   dob timestamp NULL,
   last_update timestamp without time zone DEFAULT now() NOT NULL
);


ALTER TABLE public.actor OWNER TO actoruser;
