-- Table: public.requete

--DROP TABLE public.requete;

CREATE TABLE public.requete
(
    id serial,
    nom_requete character varying(200) COLLATE pg_catalog."default" NOT NULL,
    desc_requete character varying(2500) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT pk_requete PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public.requete
    OWNER to postgres;
	