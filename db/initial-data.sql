-- Create the "uuid-ossp" extension in the "postgres" database
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

-- Create the "farm" database
CREATE DATABASE farm;

-- Create the "forest" database
CREATE DATABASE forest;

-- Connect to the "farm" database
\connect farm;

-- Create the "uuid-ossp" extension in the "farm" database
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

-- Create "field" schema
CREATE SCHEMA field;

-- Create "flower" table in "public" schema
CREATE TABLE public.flower (
    id uuid NOT NULL,
    "name" varchar(255) NOT NULL,
    CONSTRAINT flower_pkey PRIMARY KEY (id)
);

-- Create "season" table in "field" schema
CREATE TABLE field.season (
    id uuid NOT NULL,
    "name" varchar(255) NOT NULL,
    CONSTRAINT season_pkey PRIMARY KEY (id)
);

-- Insert data into "season" table
INSERT INTO field.season (id, name) VALUES ('e289b474-3930-4a31-a915-bb69c9e420d2'::uuid, 'winter');
INSERT INTO field.season (id, name) VALUES ('45d78af3-4205-4e10-9822-bffcf6d1e635'::uuid, 'spring');
INSERT INTO field.season (id, name) VALUES ('ef896d5f-5925-4124-aa8a-a04274227700'::uuid, 'summer');
INSERT INTO field.season (id, name) VALUES ('08607b45-a730-4aa2-9fa7-900e33bb8c81'::uuid, 'fall');

-- Insert data into "flower" table
INSERT INTO public.flower (id, name) VALUES ('d8f74c74-8896-44fa-a54a-ac0cb2be1835'::uuid, 'daisy');
INSERT INTO public.flower (id, name) VALUES ('79d24fc2-5328-4b02-8077-f580940baf71'::uuid, 'rose');

-- Connect to the "forest" database
\connect forest;

-- Create the "uuid-ossp" extension in the "forest" database
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

-- Create "bug" table in "public" schema
CREATE TABLE public.bug (
    id uuid NOT NULL,
    "name" varchar(255) NOT NULL,
    CONSTRAINT bug_pkey PRIMARY KEY (id)
);

-- Insert data into "bug" table
INSERT INTO public.bug (id, name) VALUES ('0c884ba8-e774-4680-9c2a-c200c3d4fe04'::uuid, 'bee');
INSERT INTO public.bug (id, name) VALUES ('7a407759-3183-4e3e-9a60-3ecf235c45ec'::uuid, 'ant');
INSERT INTO public.bug (id, name) VALUES ('6436ae72-b245-4d30-82b3-7337f1a2e7e3'::uuid, 'ladybug');